package tn.esprit.walid_se4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@SpringBootApplication
@EnableScheduling
public class WalidSe4Application {

    public static void main(String[] args) {
        SpringApplication.run(WalidSe4Application.class, args);
    }

}
