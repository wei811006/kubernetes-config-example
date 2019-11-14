package wei.springframework.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController.
 * 2019/11/13 11:01 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@RestController
@RequestMapping("")
public class MainController {

    @Value("${message}")
    private String message;

    @Value("${env}")
    private String env;

    @GetMapping("/")
    public ResponseEntity message() {
        return ResponseEntity.ok(message + " " + env);
    }

}
