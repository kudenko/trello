package junk;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class TestSendEmail {
    String pss = "MY PASS";

    @Test
            public void go() throws EmailException {
        Email email = new SimpleEmail(); // Create Object
        email.setHostName("smtp.googlemail.com"); // Set SMTP hostname
        email.setSmtpPort(465); // Set port
        email.setAuthenticator(new DefaultAuthenticator("sergey.kudenko@onthe.io", pss)); // Set email/password
        email.setSSLOnConnect(true); // SSL true
        email.setFrom("sergey.kudenko@onthe.io"); // set FROM
        email.setSubject("TestMail"); // set Subject
        email.setMsg("This is a test mail ... :-)"); // Set message
        email.addTo("sergey.kudenko@onthe.io"); // Set recipients
        email.send(); // Send Email

    }

}
