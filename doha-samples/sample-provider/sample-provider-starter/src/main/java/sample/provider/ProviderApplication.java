package sample.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.dinstone.focus.client.ClientOptions;
import com.dinstone.focus.client.starter.EnableFocusClient;
import com.dinstone.focus.server.ServerOptions;
import com.dinstone.focus.server.starter.EnableFocusServer;

@Configurable
@EnableFocusClient
@EnableFocusServer
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
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

    @Bean
    @ConditionalOnMissingBean
    ClientOptions focusClientOptions() {
        return new ClientOptions(appName).connect("127.0.0.1", 2222);
    }

}
