package com.example.demo.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.blog.model.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

	Blog findByTitle(String title);


}
