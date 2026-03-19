package edu.kis.powp.command.factory;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.command.ComplexCommand;

public final class FactoryOfCommand {

    private FactoryOfCommand() {}

    public static DriverCommand createRectangle(int x, int y, int width, int height) {
        return new ComplexCommand(
                new SetPositionCommand(x, y),
                new OperateToCommand(x + width, y),
                new OperateToCommand(x + width, y + height),
                new OperateToCommand(x, y + height),
                new OperateToCommand(x, y)
        );
    }

    public static DriverCommand createTriangle(int x1, int y1,  int x2, int y2, int x3, int y3) {
        return new ComplexCommand(
                new SetPositionCommand(x1, y1),
                new OperateToCommand(x2, y2),
                new OperateToCommand(x3, y3),
                new OperateToCommand(x1, y1)
        );
    }
}