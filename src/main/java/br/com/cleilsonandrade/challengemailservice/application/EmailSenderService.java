package br.com.cleilsonandrade.challengemailservice.application;

import org.springframework.stereotype.Service;

import br.com.cleilsonandrade.challengemailservice.adapters.EmailSenderGateway;
import br.com.cleilsonandrade.challengemailservice.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

  private final EmailSenderGateway emailSenderGateway;

  public EmailSenderService(EmailSenderGateway emailGateway) {
    this.emailSenderGateway = emailGateway;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to, subject, body);
  }

}
