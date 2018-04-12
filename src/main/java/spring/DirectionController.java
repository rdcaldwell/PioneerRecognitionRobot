package spring;

import com.mobilerobots.Aria.ArRobot;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import robot.PioneerRobot;
import utils.Server;

@CrossOrigin(origins = Server.WEB_LOCAL)
@RestController
public class DirectionController {

    private int degrees = 0;
    private int meters = 0;

    @RequestMapping("/left")
    public Direction turnLeft() {
        ArRobot robot = PioneerRobot.getRobot();
        robot.lock();
        degrees += 45;
        robot.setHeading(degrees);
        robot.unlock();
        return new Direction("left");
    }

    @RequestMapping("/right")
    public Direction turnRight() {
        ArRobot robot = PioneerRobot.getRobot();
        robot.lock();
        degrees -= 45;
        robot.setHeading(degrees);
        robot.unlock();
        return new Direction("right");
    }

    @RequestMapping("/forward")
    public Direction moveForward() {
        ArRobot robot = PioneerRobot.getRobot();
        robot.lock();
        meters += 1000;
        robot.move(meters);
        robot.unlock();
        return new Direction("forward");
    }

    @RequestMapping("/backward")
    public Direction moveBackward() {
        ArRobot robot = PioneerRobot.getRobot();
        robot.lock();
        meters -= 1000;
        robot.move(meters);
        robot.unlock();
        return new Direction("backward");
    }

}
