package br.com.cleilsonandrade.challengemailservice.infra.ses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

@Configuration
public class AwsSesConfig {
  @Bean
  public AmazonSimpleEmailService amazonSimpleEmailService() {
    return AmazonSimpleEmailServiceClientBuilder.standard().build();
  }
}
