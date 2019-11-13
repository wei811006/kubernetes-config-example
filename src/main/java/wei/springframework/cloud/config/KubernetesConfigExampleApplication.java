package wei.springframework.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubernetesConfigExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubernetesConfigExampleApplication.class, args);
    }

}
