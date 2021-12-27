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
	
	public List<Blog> saveBlogs(List<Blog> blog) {
		return repo.saveAll(blog);
	}

	public List<Blog> getBlogs() {
		return repo.findAll();
	}
 
	public Blog getBlogById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	public Blog getBlogByTitle(String title) {
		return repo.findByBlogTitle(title);
	}
	
	public List<Blog> getBlogByAuthor(String author) {
		return repo.findByBlogAuthor(author);
	}

	public String deleteBlogById(Integer id) {

		repo.deleteById(id);
		return "the blog"+id + "has been deleted!";
	}
	
	public Blog updateBlog(Blog blog) {
		Blog existingBlog= repo.findById(blog.getBlogId()).orElse(null);
		existingBlog.setBlogTitle(blog.getBlogTitle());
		existingBlog.setBlogDescription(blog.getBlogDescription());
		existingBlog.setBlogAuthor(blog.getBlogAuthor());
		return repo.save(existingBlog);
	}
}