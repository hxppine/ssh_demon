package com.hxp.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.hxp.dao.ArticleDao;
import com.hxp.model.Article;
import com.hxp.model.Category;

@Component
public class ArticleDaoImpl implements ArticleDao{
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public List<Article> getArticles(int type) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Article as a where a.type=:type";
		Query query = session.createQuery(hql);
		query.setInteger("type", type);
		List<Article> list = query.list();
		return list;
	}

	public List<Article> getArticlesByCid(String cid) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Article as a where a.cate.cid=:cid";
		Query query = session.createQuery(hql);
		query.setString("cid", cid);
		List<Article> list = query.list();
		return list;
	}

	public Article getArticleById(String aid) {
		Session session = sessionFactory.getCurrentSession();
		Article article = (Article) session.get(Article.class, aid);
		return article;
	}

	public List<Category> getCategories() {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Category";
		List<Category> list = session.createQuery(hql).list();
		return list;
	}

	public List<Article> getArticles() {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Article";
		Query query = session.createQuery(hql);
		List<Article> list = query.list();
		return list;
	}

	public Category getCategoryById(String cid) {
		Session session = sessionFactory.getCurrentSession();
		Category category = (Category) session.get(Category.class, cid);
		//Category category = (Category) session.load(Category.class, cid);
		return category;
	}

}
