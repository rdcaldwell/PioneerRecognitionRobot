package spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import robot.PioneerRobot;

@RestController
public class DirectionController {

    private int degrees = 0;
    private int meters = 0;

    @RequestMapping("/left")
    public Direction turnLeft() {
        PioneerRobot.getRobot().lock();
        degrees += 45;
        PioneerRobot.getRobot().setHeading(degrees);
        PioneerRobot.getRobot().unlock();
        return new Direction("left");
    }

    @RequestMapping("/right")
    public Direction turnRight() {
        PioneerRobot.getRobot().lock();
        degrees -= 45;
        PioneerRobot.getRobot().setHeading(degrees);
        PioneerRobot.getRobot().unlock();
        return new Direction("right");
    }

    @RequestMapping("/forward")
    public Direction moveForward() {
        PioneerRobot.getRobot().lock();
        meters += 1000;
        PioneerRobot.getRobot().move(meters);
        PioneerRobot.getRobot().unlock();
        return new Direction("forward");
    }

    @RequestMapping("/backward")
    public Direction moveBackward() {
        PioneerRobot.getRobot().lock();
        meters -= 1000;
        PioneerRobot.getRobot().move(meters);
        PioneerRobot.getRobot().unlock();
        return new Direction("backward");
    }

}
