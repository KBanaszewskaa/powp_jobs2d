package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class FiguresJaneAdapter extends AbstractDriver {
    private final Job2dDriver driver;

    public FiguresJaneAdapter() {
        super(0, 0);
        driver = DriverFeature.getDriverManager().getCurrentDriver();
    }

    @Override
    public void operateTo(int x, int y) {
        driver.operateTo(x, y);
    }
}
