package emailapp;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity=10;
	private String alternateEmail;
	
	//constructor to recieve first name and last name
	public Email(String first, String last) {
		this.firstname=first;
		this.lastname=last;
		//System.out.println(this.firstname+" "+this.lastname);
		this.department=getdepartment();
		//System.out.println(department);
		this.password=generatepass();
		System.out.println(password);
		this.email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+".company.com";
		//System.out.println(email);
	}
	//Ask for the department
	private String getdepartment() {
		System.out.println("Enter Dept\n 1: CS\n2:ME\n3:EC\n");
		Scanner in = new Scanner(System.in);
		int dept = in.nextInt();
		if(dept == 1)return "CS";
		else if(dept == 2 )return "ME";
		else return "EC";
	}
	//set the mailbox capacity
	public int getMailboxcapacity() {
		return mailboxcapacity;
	}
	public void setMailboxcapacity(int mailboxcapacity) {
		this.mailboxcapacity = mailboxcapacity;
	}
	//set the alternate email
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	//Generate a random password
	private String generatepass() {
		System.out.println("Input Length of Password\n");
		Scanner in = new Scanner(System.in);
		int len=in.nextInt();
		String key="abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		char[] pass=new char[len];
		int rand;
		for(int i=0;i<len;i++) {
			rand=(int)(Math.random() * key.length());
			pass[i]=key.charAt(rand);
		}
		return new String(pass);
	}
	
	public String show() {
		return "Name : " + firstname+" "+lastname
				+"\nEmail : "+ email
				+"\ncapacity : "+mailboxcapacity;
	}
	
	//change the password
}
