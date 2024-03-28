package br.com.cleilsonandrade.challengemailservice.adapters;

public interface EmailSenderGateway {
  void sendEmail(String to, String subject, String body);
}
