package com.example.demo.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.blog.dao.BlogRepo;
import com.example.demo.blog.model.Blog;

@Service
public class BlogService {

	@Autowired
	private BlogRepo repo;
	
	public Blog saveBlog(Blog blog) {
		return repo.save(blog);
	}

	public List<Blog> getBlogs() {
		return repo.findAll();
	}
 
	public Blog getBlogById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Blog getBlogByTitle(String title) {
		return repo.findByTitle(title);
	}

	public String deleteBlogById(int id) {

		@SuppressWarnings("deprecation")
		Blog b=repo.getOne(id);
		repo.delete(b);
		return "the blog"+id + "has been deleted!";
	}
	
	public Blog updateBlog(Blog blog) {
		Blog existingBlog= repo.findById(blog.getBlogId()).orElse(null);
		existingBlog.getBlogTitle(blog.setBlogTitle());
		existingBlog.getBlogDescription(blog.setBlogDescription());
		existingBlog.getBlogAuthor(blog.setBlogAuthor());
		return repo.save(existingBlog);
	}
}