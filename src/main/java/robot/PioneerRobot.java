package robot;

import aria.ArRobot;
import aria.ArSimpleConnector;
import aria.Aria;

public class PioneerRobot {

    private static ArRobot robot = new ArRobot();

    public PioneerRobot() {
        Aria.init();
        ArSimpleConnector conn = new ArSimpleConnector(new String[]{"COM1"});

        if(!Aria.parseArgs())
        {
            Aria.logOptions();
            Aria.exit(1);
        }

        if (!conn.connectRobot(robot))
        {
            System.err.println("Could not connect to robot, exiting.\n");
            System.exit(1);
        }

        robot.runAsync(true);
        robot.lock();
        robot.enableMotors();
        robot.unlock();
    }

    public void setRobot(ArRobot robot) {
        this.robot = robot;
    }

    public static ArRobot getRobot() {
        return robot;
    }
}
