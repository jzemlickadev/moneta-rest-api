package jan.zemlicka.issue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jzemlicka on 20.01.2019.
 */

@SpringBootApplication
@ComponentScan(basePackages = { "jan.zemlicka.issue" })
public class TextTransformerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextTransformerApplication.class, args);
    }
}
