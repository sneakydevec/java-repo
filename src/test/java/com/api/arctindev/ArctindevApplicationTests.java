package com.api.arctindev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.arctindev.model.Article;

@SpringBootTest
class ArctindevApplicationTests {

	Article article;
	@Test
	void contextLoads() {

		Article article = new Article();

		System.out.println("hia0");

		article.getAuthor().equals("anObject");
	}

}
