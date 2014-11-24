package com.hxp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hxp.dao.ArticleDao;
import com.hxp.model.Article;
import com.hxp.model.Category;

@Component
public class ArticleService {
	private ArticleDao articleDao;
	
	
	
	public ArticleDao getArticleDao() {
		return articleDao;
	}


	@Resource
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}



	public List<Article> loadArticles(int type){
		return this.articleDao.getArticles(type); 
	}
	
	public List<Article> loadArticles(){
		return this.articleDao.getArticles(); 
	}
	
	public List<Article> loadArticlesByCid(String cid){
		return this.articleDao.getArticlesByCid(cid);
	}


	public Article loadArticleById(String aid) {
		return this.articleDao.getArticleById(aid);
	}
	
	public List<Category> loadCategories(){
		return this.articleDao.getCategories();
	}
	
	public Category loadCategory(String cid){
		return this.articleDao.getCategoryById(cid);
	}
}
