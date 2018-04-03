package spring;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.Server;

@CrossOrigin(origins = Server.WEB_LOCAL)
@RestController
public class DirectionController {

    private int degrees = 0;
    private int meters = 0;

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
    public Direction moveBackward() { return new Direction("backward"); }

}
