package com.example.demo.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.blog.model.Blog;
import com.example.demo.blog.service.BlogService;

@RestController
public class BlogController {

	@Autowired
	private BlogService service;

	@PostMapping("/addBlog")
	public Blog addBlog(@RequestBody Blog blog) {
		return service.saveBlog(blog);
	}
	
	@PostMapping("/addBlogs")
	public List<Blog> addBlog(@RequestBody List<Blog> blog) {
		return service.saveBlogs(blog);
	}

	@GetMapping("/Blogs")
	public List<Blog> getBlogs() {
		return service.getBlogs();
	}

	@GetMapping("/Blog/{id}")
	public Blog getBlogById(@PathVariable int id) {
		return service.getBlogById(id);
	}

	@GetMapping("/Blog/title/{title}")
	public Blog getBlogByTitle(@PathVariable String title) {
		return service.getBlogByTitle(title);
	}

	@GetMapping("/Blog/author")
	public List<Blog> getBlogByAuthor(@RequestParam(value="author") String author) {
		return service.getBlogByAuthor(author);
	}
	@PutMapping("/update")
	public Blog updateBlog(@RequestBody Blog blog) {
		return service.updateBlog(blog);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBlogById(@PathVariable int id) {
		return service.deleteBlogById(id);
	}
}
