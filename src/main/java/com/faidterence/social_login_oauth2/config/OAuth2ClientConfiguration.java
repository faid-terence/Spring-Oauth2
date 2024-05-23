package com.faidterence.social_login_oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;

import java.util.Collections;

@Configuration
public class OAuth2ClientConfiguration {

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        ClientRegistration githubClientRegistration = ClientRegistration
                .withRegistrationId("github")
                .clientId("Ov23liomLZn0emwtjqjd")
                .clientSecret("237871fe6836665e36ebc9fffe2b0d3897fcd39c")
                .scope(Collections.singletonList("read:user"))
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUri("http://localhost:8080/login/code/github")
                .authorizationUri("https://github.com/login/oauth/authorize")
                .tokenUri("https://github.com/login/oauth/access_token")
                .userInfoUri("https://api.github.com/user")
                .userNameAttributeName("id")
                .clientName("GitHub")
                .build();

        return new InMemoryClientRegistrationRepository(githubClientRegistration);
    }
}