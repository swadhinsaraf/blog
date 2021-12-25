package com.example.demo.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Blog {
    @Id
	int blogId;
	private String blogTitle;
	private String blogDescription;
	private String blogAuthor;
	private Date timestamp;
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	public String getBlogAuthor() {
		return blogAuthor;
	}
	public void setBlogAuthor(String blogAuthor) {
		this.blogAuthor = blogAuthor;
	}
	

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogDescription=" + blogDescription
				+ ", blogAuthor=" + blogAuthor + ", timestamp=" + timestamp + "]";
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Object setBlogTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getBlogTitle(Object setBlogTitle) {
		// TODO Auto-generated method stub
		
	}
	public Object setBlogDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getBlogDescription(Object setBlogDescription) {
		// TODO Auto-generated method stub
		
	}
	public Object setBlogAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getBlogAuthor(Object setBlogAuthor) {
		// TODO Auto-generated method stub
		
	}
}
