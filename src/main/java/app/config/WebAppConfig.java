package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @PROJECT FileUploadSpring
 * @Author Rajith Sanjaya
 * @Date 2022 Jul 04
 **/

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "app")
public class WebAppConfig {

}
