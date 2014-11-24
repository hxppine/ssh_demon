package com.hxp.dao;

import java.util.List;

import com.hxp.model.Article;
import com.hxp.model.Category;

public interface ArticleDao {
	
	public List<Article> getArticles(int type);//获取某类型全部文章
	public List<Article> getArticles();//获取全部文章
	public List<Article> getArticlesByCid(String cid);//获取指定cid下的全部文章
	public Article getArticleById(String aid);//获取指定id的文章
	public List<Category> getCategories();//获取全部分类
	public Category getCategoryById(String cid);//
}
