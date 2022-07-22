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

		article.getAuthor().equals("anObject");
	}

}
