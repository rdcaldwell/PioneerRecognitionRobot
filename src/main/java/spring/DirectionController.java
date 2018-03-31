package spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectionController {

    private int degrees = 0;
    private int meters = 0;

    @RequestMapping("/api/robot/left")
    public Direction turnLeft() {
        return new Direction("left");
    }

    @RequestMapping("/api/robot/right")
    public Direction turnRight() {
        return new Direction("right");
    }

    @RequestMapping("/api/robot/forward")
    public Direction moveForward() {
        return new Direction("forward");
    }

    @RequestMapping("/api/robot/backward")
    public Direction moveBackward() {
        return new Direction("backward");
    }

}
