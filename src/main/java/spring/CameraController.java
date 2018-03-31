package spring;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CameraController {

    @RequestMapping("/api/robot/captureImage")
    public String captureImage() {
        RestTemplate rest = new RestTemplate();

        Resource image = new FileSystemResource("/Users/ronniecaldwell/Downloads/Heineken.jpg");

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
        parts.add("Content-Type", "image/jpeg");
        parts.add("image", image);

        ResponseEntity<String> response = rest.exchange(
                "http://localhost:5000/api/image/recognize",
                HttpMethod.POST,
                new HttpEntity<MultiValueMap<String, Object>>(parts),
                String.class);

        return response.getBody();
    }
}
