package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private Integer x;
    private Integer y;
    private Job2dDriver driver;

    public OperateToCommand(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public OperateToCommand(Integer x, Integer y, Job2dDriver driver) {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }


}
