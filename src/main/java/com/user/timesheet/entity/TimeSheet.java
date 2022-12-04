package com.user.timesheet.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timesheet")
public class TimeSheet {

   
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id private String emailId;
    @Column(unique = true)
    private Date date;
    private int hours;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("EmailId = ").append(emailId).
		append(" ,Date = ").append(date).append(" ,hours = ").append(hours);
		return string.toString();
	}
}
