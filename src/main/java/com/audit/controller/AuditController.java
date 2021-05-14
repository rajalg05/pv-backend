package com.audit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

import com.audit.dao.AssociateRepository;
import com.audit.dao.AuditRepository;
import com.audit.dao.JobRepository;
import com.audit.dao.ResourceRepository;
import com.audit.dao.UserRepository;
import com.audit.model.Associate;
import com.audit.model.Audit;
import com.audit.model.Job;
import com.audit.model.Resource;
import com.audit.model.User;
import com.google.gson.Gson;

@RestController
@RequestMapping("/audit")
@CrossOrigin(origins = "http://localhost:4200")
public class AuditController {

	private static final Gson gson = new Gson();

	@Autowired
	DataSource dataSource;

	@Autowired
	ResourceRepository resourceRepository;

	@Autowired
	AssociateRepository associateRepository;

	@Autowired
	JobRepository jobRepository;

	@Autowired
	AuditRepository auditRepository;

	@Autowired
	UserRepository userRepository;

	@PostMapping("/login")
	ResponseEntity<String> login(@RequestBody User user) {
		Optional<User> o = userRepository.findByUserName(user.getUserName());
		System.out.println("DB password= " + o.get().getPassword());
		System.out.println("user password" + user.getPassword());
		//if (o.get() != null && o.get().getPassword().equals(user.getPassword())) {
			return new ResponseEntity<String>(gson.toJson("Login successful"), HttpStatus.OK);
		//}
		//return new ResponseEntity<String>(gson.toJson("User is not registered"), HttpStatus.OK);
	}

	@PostMapping("/saveUser")
	ResponseEntity<String> saveUser(@RequestBody User user) {
		List<User> l = userRepository.findAll();
		boolean userExists = false;
		for (User userCheck : l) {
			if (!userCheck.getUserName().equals(user.getUserName())) {
				continue;
			} else {
				userExists = true;
				break;
			}
		}
		if (!userExists) {
			userRepository.save(user);
			return new ResponseEntity<String>(gson.toJson("Save User Successfull!!"), HttpStatus.OK);
		}

		else
			return new ResponseEntity<String>(gson.toJson("user exists"), HttpStatus.OK);
	}

	@PostMapping("/deleteUser")
	ResponseEntity<String> deleteUser(@RequestBody User user) {
		userRepository.delete(user);
		return new ResponseEntity<String>(gson.toJson("Delete User Successfull!!"), HttpStatus.OK);
	}

	@GetMapping("/getUsers")
	ResponseEntity<List<User>> findAllUsers() {
		List<User> l = userRepository.findAll();
		if (l.size() > 0) {
			return ResponseEntity.ok(l);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/saveResource")
	ResponseEntity<String> saveResource(@RequestBody Resource resource) {
		resourceRepository.save(resource);
		return new ResponseEntity<String>(gson.toJson("Save Resource Successfull!!"), HttpStatus.OK);
	}

	@PostMapping("/deleteResource")
	ResponseEntity<String> deleteResource(@RequestBody Resource resource) {
		resourceRepository.delete(resource);
		return new ResponseEntity<String>(gson.toJson("Delete Resource Successfull!!"), HttpStatus.OK);
	}

	@GetMapping("/getResources")
	ResponseEntity<List<Resource>> findAllResources() {
		List<Resource> l = resourceRepository.findAll();
		if (l.size() > 0) {
			return ResponseEntity.ok(l);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/saveAssociate")
	ResponseEntity<String> saveAssociate(@RequestBody Associate associate) {
		associateRepository.save(associate);
		return new ResponseEntity<String>(gson.toJson("Save Associate Successfull!!"), HttpStatus.OK);
	}

	@GetMapping("/findAllAssociates")
	ResponseEntity<List<Associate>> findAllAssociate() {
		List<Associate> l = associateRepository.findAll();
		if (l.size() > 0) {
			return ResponseEntity.ok(l);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/deleteAssociate")
	ResponseEntity<String> deleteAssociate(@RequestBody Associate associate) {
		associateRepository.delete(associate);
		return new ResponseEntity<String>(gson.toJson("Delete Resource Successfull!!"), HttpStatus.OK);
	}

	@PostMapping("/saveJob")
	ResponseEntity<String> saveJob(@RequestBody Job job) {
		Job j = jobRepository.getJobByJobName(job.getJobName());
		if(j == null) 
			jobRepository.save(job);
		return new ResponseEntity<String>(gson.toJson("Save Job Successfull!!"), HttpStatus.OK);
	}

	@PostMapping("/saveAudit")
	ResponseEntity<String> saveAudit(@RequestBody Audit audit) {
		auditRepository.save(audit);
		return new ResponseEntity<String>(gson.toJson("Save Audit Successfull!!"), HttpStatus.OK);
	}
	@GetMapping("/findAllJobs")
	ResponseEntity<List<Job>> findAllJobs() {
		List<Job> l = jobRepository.findAll();
		for(Job j : l) {
			List<Audit> audits = auditRepository.getAuditByjobId(j.getId());
				j.setAudits(audits);
		}
		if (l.size() > 0) {
			return ResponseEntity.ok(l);
		} else {
			return ResponseEntity.ok(null);
		}
	}

	@PostMapping("/deleteJob")
	ResponseEntity<String> deleteJob(@RequestBody Job job) {
		jobRepository.delete(job);
		return new ResponseEntity<String>(gson.toJson("Delete Job Successfull!!"), HttpStatus.OK);
	}


	@GetMapping("/findAllAudits")
	ResponseEntity<List<Audit>> findAllAudits() {
		List<Audit> l = auditRepository.findAll();
		if (l.size() > 0) {
			return ResponseEntity.ok(l);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/deleteAudit")
	ResponseEntity<String> deleteAudit(@RequestBody Audit audit) {
		auditRepository.delete(audit);
		return new ResponseEntity<String>(gson.toJson("Delete Audit Successfull!!"), HttpStatus.OK);
	}

	@GetMapping("/sendMail")
	String sendMail() {
		// Recipient's email ID needs to be mentioned.
		String to = "rajalg05@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "lalatendu.guru@gmail.com";
		final String username = "rajalg05";// change accordingly
		

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
