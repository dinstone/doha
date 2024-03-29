package doha.samples.msb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.dinstone.focus.server.ServerOptions;
import com.dinstone.focus.server.starter.EnableFocusServer;

@Configurable
@EnableFocusServer
@SpringBootApplication
public class MsbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsbApplication.class, args);
    }

    @Autowired
    private Environment environment;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${focus.server.port}")
    private int port;

    @Bean
    @ConditionalOnMissingBean
    public ServerOptions focusServerOptions() {
        return new ServerOptions(appName).listen(port);
    }

}
