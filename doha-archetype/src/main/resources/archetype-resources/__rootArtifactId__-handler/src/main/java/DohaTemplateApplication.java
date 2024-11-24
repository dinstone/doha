#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.dinstone.focus.serialize.protobuf.ProtobufSerializer;
import com.dinstone.focus.server.ServerOptions;
import com.dinstone.focus.server.starter.EnableFocusServer;

@Configurable
@EnableFocusClient
@EnableFocusServer
@SpringBootApplication
public class DohaTemplateApplication {

    private static final Logger logger = LoggerFactory.getLogger(DohaTemplateApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DohaTemplateApplication.class, args);
        logger.info("service started");
    }

    @Autowired
    private Environment environment;

    @Value("${symbol_dollar}{spring.application.name}")
    private String appName;

    @Value("${symbol_dollar}{focus.server.port}")
    private int port;

    @Bean
    @ConditionalOnMissingBean
    public ServerOptions focusServerOptions() {
        return new ServerOptions(appName).listen(port);
    }

    @Bean
    @ConditionalOnMissingBean
    ClientOptions focusClientOptions() {
        return new ClientOptions(appName).connect("127.0.0.1", 2222).setSerializerType(ProtobufSerializer.SERIALIZER_TYPE);
    }

}
