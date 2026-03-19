package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class FiguresJaneAdapter extends AbstractDriver {

    public FiguresJaneAdapter() {
        super(0, 0);
    }

    private Job2dDriver currentDriver() {
        return DriverFeature.getDriverManager().getCurrentDriver();
    }

    @Override
    public void operateTo(int x, int y) {
        Job2dDriver driver = currentDriver();
        if (driver == null || driver == this) {
            super.setPosition(x, y);
            return;
        }
        int currentX = getX();
        int currentY = getY();
        driver.setPosition(currentX, currentY);
        driver.operateTo(x, y);
        super.setPosition(x, y);
    }
}
