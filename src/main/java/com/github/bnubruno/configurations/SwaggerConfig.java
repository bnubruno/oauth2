package com.github.bnubruno.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    public static final String CLIENT_ID = "swagger";
    public static final String CLIENT_SECRET = "$2a$10$p9Pk0fQNAQSesI4vuvKA0OZanDD2";
    public static final String AUTH_SERVER = "http://localhost:8080/oauth";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.github.bnubruno.controller"))
                .paths(PathSelectors.any())
                .build();
//                .securitySchemes(Arrays.asList(securityScheme()))
//                .securityContexts(Arrays.asList(securityContext()));
    }

//    private SecurityScheme securityScheme() {
//        ResourceOwnerPasswordCredentialsGrant grantType = new ResourceOwnerPasswordCredentialsGrant("http://localhost:8080/oauth/token");
//        AuthorizationCodeGrant authorizationCodeGrant = new AuthorizationCodeGrantBuilder()
//                .tokenEndpoint(new TokenEndpoint(AUTH_SERVER + "/token", "oauthtoken"))
//                .tokenRequestEndpoint(new TokenRequestEndpoint(AUTH_SERVER + "/authorize", CLIENT_ID, CLIENT_SECRET))
//                .build();
//        return new OAuthBuilder().name("spring_oauth").grantTypes(Arrays.asList(grantType)).build();
//    }

//    @Bean
//    public SecurityConfiguration security() {
//        return SecurityConfigurationBuilder.builder()
//                .useBasicAuthenticationWithAccessCodeGrant(true)
//                .clientSecret(CLIENT_SECRET)
//                .clientId(CLIENT_ID)
//                .build();
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(Arrays.asList(new SecurityReference("spring_oauth", scopes())))
//                .forPaths(PathSelectors.regex("/me.*"))
//                .forPaths(PathSelectors.regex("/users.*"))
//                .build();
//    }
//
//    private AuthorizationScope[] scopes() {
//        return new AuthorizationScope[]{
//                new AuthorizationScope("read", "for read operations"),
//                new AuthorizationScope("write", "for read operations")
//        };
//    }
}
