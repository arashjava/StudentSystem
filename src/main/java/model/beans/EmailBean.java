package model.beans;

public class EmailBean {
	private String username;
	private String password;
	private String emailFrom;
	private String emailTo;
	private String emailTitle;
	private String emailBody;
	private int courseId;
	private String courseName;
	private int semester;
	private int year;
	private double examMidterm;
	private double examFinal;
	private int studentId;
	private String firstName;
	private String lastName;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void Email() {
		;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getExamMidterm() {
		return examMidterm;
	}

	public void setExamMidterm(double examMidterm) {
		this.examMidterm = examMidterm;
	}

	public double getExamFinal() {
		return examFinal;
	}

	public void setExamFinal(double examFinal) {
		this.examFinal = examFinal;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
//	public void writePdf(EmailBean email, OutputStream outputStream) throws Exception 
//    {
//        Font regular = new Font(FontFamily.HELVETICA, 14, Font.BOLDITALIC); 
//        Font title1 =  new Font(FontFamily.HELVETICA, 22, Font.BOLD);
//        Font title2 =  new Font(FontFamily.HELVETICA, 18, Font.BOLD);
// 
//        Class cls = Class.forName("model.Beans.EmailBean");
//        ClassLoader cLoader = cls.getClassLoader();
//        URL logo = cLoader.getResource("montrealCollege.png");
//        Image img = Image.getInstance(logo);
//        
//        
//        Document document = new Document();
//        PdfWriter.getInstance(document, outputStream);
//        document.open();
//        document.add(img);
//        String s1= "Transcript for Course: " + email.getCourseName()+ " for Semester, Year: " + email.getSemester()	+ " , " + email.getYear();
//        Paragraph p = new Paragraph(s1, title1);
//        p.setAlignment(Element.ALIGN_CENTER);
//        document.add(p);
//        Paragraph p20 = new Paragraph();
//        p20.add("========================================================================="); 
//        document.add(p20);
//        Paragraph p21 = new Paragraph();
//        p21.add("                                                                                         "); 
//        document.add(p21);
//
//        String s2= "Student: "+ email.getFirstName()+ " "+ email.getLastName() + " ,Student ID: " + email.getStudentId();
//        Paragraph p2 = new Paragraph(s2, title2);
//         p.setAlignment(Element.ALIGN_CENTER);
//        
//        document.add(p2);
//        
//        Paragraph p3 = new Paragraph();
//        p3.add("-----------------------------------------------------------------------------------------------------------"); 
//        document.add(p3);
//        Paragraph p30 = new Paragraph();
//        p30.add("                                                                                         "); 
//        document.add(p30);
//
//        String s4= " Mid-Term result: " + email.getExamMidterm();
//        Paragraph p4 = new Paragraph(s4, regular);
//        document.add(p4);
//        
//        String s5= " Final-Term result: " + email.getExamFinal();
//        Paragraph p5 = new Paragraph(s5, regular);
//        document.add(p5);
//        
//        document.close();
//    }  
//	   public void emailSend(EmailBean email, String action) {
//		    DAOLoginImp da = new DAOLoginImp();
//		    String userName=email.getUsername();
//		    LoginSystem lg= da.SelectByID(userName);
//		    final String user=lg.getEmail(); 
//		    final String password= lg.getPassword(); 
//		    
//	        String smtpHost = "smtp.gmail.com"; //replace this with a valid host
//	        int smtpPort = 587; //replace this with a valid port
//	                 
////	        String sender = email.emailFrom; //replace this with a valid sender email address
//	        String recipient = email.emailTo; //replace this with a valid recipient email address
//	        String content = email.getEmailBody();
//	        String subject = email.getEmailTitle();
//	        
//	         
//	        Properties properties = new Properties();
//	        properties.put("mail.smtp.auth", "true");
//	        properties.put("mail.smtp.starttls.enable", "true");
//	        properties.put("mail.smtp.host", smtpHost);
//	        properties.put("mail.smtp.port", smtpPort);     
//	 //       Session session = Session.getDefaultInstance(properties, null);
//			Session session = Session.getInstance(properties,
//					  new javax.mail.Authenticator() {
//						protected PasswordAuthentication getPasswordAuthentication() {
//							return new PasswordAuthentication(user, password);
//						   }  
//			  });
//	        ByteArrayOutputStream outputStream = null;
//	         
//	        try {           
//	            //construct the text body part
//	            MimeBodyPart textBodyPart = new MimeBodyPart();
//	            textBodyPart.setText(content);
//	             
//	            //now write the PDF content to the output stream
//	            outputStream = new ByteArrayOutputStream();
//
//
//	            MimeMultipart mimeMultipart = new MimeMultipart();
//	            if (action.equals("resultOne")){
//		            writePdf(email,outputStream);
//		            byte[] bytes = outputStream.toByteArray();
//		             
//		            //construct the pdf body part
//		            DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
//		            MimeBodyPart pdfBodyPart = new MimeBodyPart();
//		            pdfBodyPart.setDataHandler(new DataHandler(dataSource));
//		            pdfBodyPart.setFileName("mark.pdf");
//		            mimeMultipart.addBodyPart(pdfBodyPart);
//	            }
//
//	            mimeMultipart.addBodyPart(textBodyPart);
//
//	             
//	            //create the sender/recipient addresses
//	            InternetAddress iaSender = new InternetAddress(user);
//	            InternetAddress iaRecipient = new InternetAddress(recipient);
//	             
//	            //construct the mime message
//	            MimeMessage mimeMessage = new MimeMessage(session);
//	            mimeMessage.setSender(iaSender);
//	            mimeMessage.setSubject(subject);
//	            mimeMessage.setRecipient(Message.RecipientType.TO, iaRecipient);
//	            mimeMessage.setContent(mimeMultipart);
//	             
//	            //send off the email
//	            Transport.send(mimeMessage);
//	             
//	            System.out.println("sent from " + user + 
//	                    ", to " + recipient + 
//	                    "; server = " + smtpHost + ", port = " + smtpPort);         
//	        } catch(Exception ex) {
//	            ex.printStackTrace();
//	        } finally {
//	            //clean off
//	            if(null != outputStream) {
//	                try { outputStream.close(); outputStream = null; }
//	                catch(Exception ex) { }
//	            }
//	        }
//	    }
}
