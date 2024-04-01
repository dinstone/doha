package io.doha.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.dinstone.focus.client.ClientOptions;
import com.dinstone.focus.client.starter.EnableFocusClient;
import com.dinstone.focus.serialze.protobuf.ProtobufSerializer;
import com.dinstone.focus.server.ServerOptions;
import com.dinstone.focus.server.starter.EnableFocusServer;

import io.doha.template.api.rpc.OrderRequest;
import io.doha.template.api.rpc.OrderRpcApi;

@Configurable
@EnableFocusClient
@EnableFocusServer
@SpringBootApplication
public class DohaTemplateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext c = SpringApplication.run(DohaTemplateApplication.class, args);

        OrderRpcApi rpcApi = c.getBean(OrderRpcApi.class);
        OrderRequest request = new OrderRequest();
        request.setUid("U001");
        request.setPoi("P1988");
        request.setSn("SN986233");
        System.out.println(rpcApi.createOrder(request).getOid());
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
        return new ClientOptions(appName).connect("127.0.0.1", 2222).setSerializerType(ProtobufSerializer.SERIALIZER_TYPE);
    }

}
