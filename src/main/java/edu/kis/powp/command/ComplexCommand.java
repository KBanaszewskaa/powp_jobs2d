package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.Arrays;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {

    private final ArrayList<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand(DriverCommand... commands) {
        this.commands.addAll(Arrays.asList(commands));
    }

    public void addCommand(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : commands) {
            command.execute(driver);
        }
    }
}