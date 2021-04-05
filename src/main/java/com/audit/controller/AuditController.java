package com.audit.controller;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audit.dao.PvRepository;
import com.audit.model.ManPower;
import com.audit.model.Resource;

@RestController
@RequestMapping("/audit")
@CrossOrigin(origins = "*")
public class AuditController {

	@Autowired
	DataSource dataSource;

	@Autowired
	PvRepository pvRepository;

	@PostMapping("/saveResourceData")
	ResponseEntity<String> saveResource(@RequestBody Resource resource) {
		
		return new ResponseEntity<String>("Save Resource Successfull!!", HttpStatus.OK);
	}
	@GetMapping("/getManPower")
	String getManPower(String tlPune) {
		List<ManPower> manPowerList = pvRepository.findAll();
		System.out.println("tlPune = " + tlPune);
		return "The state of " + tlPune + "is " + manPowerList.get(0).getState();
	}

	@PostMapping("/saveManPower")
	ManPower saveManPower(ManPower manPower) {
		return pvRepository.save(manPower);
	}

	@GetMapping("/sendMail")
	String sendMail() {
		// Recipient's email ID needs to be mentioned.
		String to = "rajalg05@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "lalatendu.guru@gmail.com";
		final String username = "rajalg05";//change accordingly
	    final String password = "Mahavir123#";//change accordingly
	      
		// Assuming you are sending email from localhost
		String host = "localhost";

		Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "25");

		// Get the default Session object.
		Session session = Session.getDefaultInstance(props);

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: header field
			message.setSubject("This is the Subject Line!");

			// Now set the actual message
			message.setText("This is actual message");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		return "Mail sent successfully!!";
	}
}
