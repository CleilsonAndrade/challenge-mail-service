package br.com.cleilsonandrade.challengemailservice.core;

public interface EmailSenderUseCase {
  void sendEmail(String to, String subject, String body);
}
