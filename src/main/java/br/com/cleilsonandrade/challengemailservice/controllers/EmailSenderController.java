package br.com.cleilsonandrade.challengemailservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleilsonandrade.challengemailservice.application.EmailSenderService;
import br.com.cleilsonandrade.challengemailservice.core.EmailRequest;
import br.com.cleilsonandrade.challengemailservice.core.exceptions.EmailServiceException;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
  private final EmailSenderService emailSenderService;

  public EmailSenderController(EmailSenderService emailService) {
    this.emailSenderService = emailService;
  }

  @PostMapping
  public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
    try {
      this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
      return ResponseEntity.ok("Email send successfully");
    } catch (EmailServiceException exception) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email");
    }
  }
}
