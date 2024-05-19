package com.omersolutions.jpsownstarted;

import com.omersolutions.jpsownstarted.todo.JpsTodoClient;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@AutoConfiguration
@EnableConfigurationProperties(JsonPlaceHolderServiceProperties.class)
public class JsonPlaceholderServiceConfiguration {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(JsonPlaceholderServiceConfiguration.class);
    private final JsonPlaceHolderServiceProperties properties;

    public JsonPlaceholderServiceConfiguration(JsonPlaceHolderServiceProperties properties) {
        this.properties = properties;
    }

    @Bean("jsonPlaceHolderRestClient")
    RestClient restClient(RestClient.Builder builder) {
        return builder.baseUrl(properties.url()).build();
    }

    @Bean("jpsTodoClient")
    JpsTodoClient jpsTodoClient(RestClient restClient) {
        return new JpsTodoClient(restClient);
    }
}
