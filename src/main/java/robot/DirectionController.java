package robot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectionController {


    @RequestMapping("/left")
    public Direction turnLeft() {
        return new Direction("left");
    }

    @RequestMapping("/right")
    public Direction turnRight() {
        return new Direction("right");
    }

    @RequestMapping("/forward")
    public Direction moveForward() {
        return new Direction("forward");
    }

    @RequestMapping("/backward")
    public Direction moveBackward() {
        return new Direction("backward");
    }

}
