package com.omersolutions.jpsownstarted;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("json-placeholder-service")
public record JsonPlaceHolderServiceProperties(
        @DefaultValue("https://jsonplaceholder.typicode.com")
        String url) {
}
