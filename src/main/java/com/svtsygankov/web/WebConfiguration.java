package com.svtsygankov.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("web")
@Configuration
public class WebConfiguration {
}
