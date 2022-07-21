package com.api.arctindev.controller;

import com.api.arctindev.model.Article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(path = "/v1/articles")
public class ArticleController {

	@GetMapping
	public List<Article> getArticles() {
		
		System.out.println(new Article("Very fun title!", "And brilliant article text!", "Lukas"));

		return Arrays.asList(
			new Article(),
			new Article("Very fun title!"),
			new Article("Very fun title!", "And brilliant article text!"),
			new Article("Very fun title!", "And brilliant article text!", "Lukas")
		);
	}
}
