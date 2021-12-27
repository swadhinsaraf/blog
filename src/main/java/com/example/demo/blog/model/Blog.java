package com.example.demo.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
	private Integer blogId;
	private String blogTitle;
	private String blogDescription;
	private String blogAuthor;
	private Date timestamp= new Date();

}
