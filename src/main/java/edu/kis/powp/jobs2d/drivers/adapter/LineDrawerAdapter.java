package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    private final DrawPanelController drawPanelController;
    private ILine currentLine;

    public LineDrawerAdapter(ILine typeOfLine) {
        this.drawPanelController = DrawerFeature.getDrawerController();
        this.currentLine = typeOfLine;
    }

    public void setLine(ILine line) {
        this.currentLine = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = currentLine;
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        setPosition(x, y);
        drawPanelController.drawLine(line);
    }

    @Override
    public String toString() {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}
