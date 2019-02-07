package com.javaee.emailsender;

public class EmailSender {

	public static void main(String[] args) {
		final String fromEmail = "from@gmail.com";
		final String password = "password";
		final String toEmail = "to@gmail.com";
		
		System.out.println("Inicializando envio de e-mail");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Assunto", "Corpo do e-mail");
	}

}