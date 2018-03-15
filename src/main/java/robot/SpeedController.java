package robot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedController {

    @RequestMapping("/accelerate")
    public Speed accelerate() {
        return new Speed("accelerate");
    }

    @RequestMapping("/decelerate")
    public Speed decelerate() {
        return new Speed("decelerate");
    }

}
