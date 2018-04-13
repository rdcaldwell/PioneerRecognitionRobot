package spring;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import utils.Server;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

@CrossOrigin(origins = Server.WEB_LOCAL)
@RestController
public class CameraController {

    @RequestMapping("/captureImage")
    public String captureImage() {
        RestTemplate rest = new RestTemplate();

        Resource image = new FileSystemResource("/tmp/mjpg/test.jpg");

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
        parts.add("Content-Type", MediaType.IMAGE_JPEG);
        parts.add("image", image);

        ResponseEntity<String> response = rest.exchange(
                Server.IMAGE_LOCAL + "/api/image/recognize",
                HttpMethod.POST,
                new HttpEntity<MultiValueMap<String, Object>>(parts),
                String.class);

        return response.getBody();
    }
}
