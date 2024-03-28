package br.com.cleilsonandrade.challengemailservice.core;

public record EmailRequest(String to, String subject, String body) {

}
