package com.Capstone.jersey_rest;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
		private String user_name;
		private String description;
		private int Id;
		private Timestamp CreatedAt;
		
		public void setCreatedAt(Timestamp createdAt) {
			CreatedAt = createdAt;
		}
		public Timestamp getCreatedAt() {
			return CreatedAt;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			this.Id = id;
		}
		
		
		public String getuser_name() {
			return user_name;
		}
		public void setuser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getdescription() {
			return description;
		}
		public void setdescription(String description) {
			this.description = description;
		}
		@Override
		public String toString() {
			return "User [user_name=" + user_name + ", description=" + description + ", Id=" + Id + "]";
		}
}
