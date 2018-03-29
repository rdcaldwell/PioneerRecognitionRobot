package spring;

import com.mobilerobots.Aria.ArRobot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import robot.PioneerRobot;

@RestController
public class DirectionController {

    private int degrees = 0;
    private int meters = 0;
    private ArRobot robot = PioneerRobot.getRobot();

    @RequestMapping("/left")
    public Direction turnLeft() {
        robot.lock();
        degrees += 45;
        robot.setHeading(degrees);
        robot.unlock();
        return new Direction("left");
    }

    @RequestMapping("/right")
    public Direction turnRight() {
        robot.lock();
        degrees -= 45;
        robot.setHeading(degrees);
        robot.unlock();
        return new Direction("right");
    }

    @RequestMapping("/forward")
    public Direction moveForward() {
        robot.lock();
        meters += 1000;
        robot.move(meters);
        robot.unlock();
        return new Direction("forward");
    }

    @RequestMapping("/backward")
    public Direction moveBackward() {
        robot.lock();
        meters -= 1000;
        robot.move(meters);
        robot.unlock();
        return new Direction("backward");
    }

}
