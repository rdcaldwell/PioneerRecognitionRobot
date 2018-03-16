package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import robot.PioneerRobot;

@RestController
public class DirectionController {


    @RequestMapping("/left")
    public Direction turnLeft() {
        PioneerRobot.getRobot().setHeading(90);
        return new Direction("left");
    }

    @RequestMapping("/right")
    public Direction turnRight() {
        PioneerRobot.getRobot().setHeading(-90);
        return new Direction("right");
    }

    @RequestMapping("/forward")
    public Direction moveForward() {
        PioneerRobot.getRobot().move(1000);
        return new Direction("forward");
    }

    @RequestMapping("/backward")
    public Direction moveBackward() {
        PioneerRobot.getRobot().move(-1000);
        return new Direction("backward");
    }

}
