package robot;

import com.mobilerobots.Aria.ArRobot;
import com.mobilerobots.Aria.ArSimpleConnector;
import com.mobilerobots.Aria.Aria;

public class PioneerRobot {

    private static ArRobot robot = new ArRobot();

    public PioneerRobot(String[] argv) {
        Aria.init();
        ArSimpleConnector conn = new ArSimpleConnector(argv);

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
