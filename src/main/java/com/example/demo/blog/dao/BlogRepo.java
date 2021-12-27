package com.example.demo.blog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.blog.model.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

	Blog findByBlogTitle(String title);

	List<Blog> findByBlogAuthor(String author);


}
