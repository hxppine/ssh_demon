package com.hxp.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hxp.model.Article;
import com.hxp.model.Category;
import com.hxp.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Scope("prototype")//定义为单例
public class ArticleAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private ArticleService articleService;
		
	private List<Article> rightArticles;
	
	private List<Article> newArticles;
	private List<Article> hotArticles;
	private Article article;
	private List<Category> cates;

	public List<Category> getCates() {
		return cates;
	}

	public void setCates(List<Category> cates) {
		this.cates = cates;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Article> getNewArticles() {
		return newArticles;
	}

	public void setNewArticles(List<Article> newArticles) {
		this.newArticles = newArticles;
	}

	public List<Article> getHotArticles() {
		return hotArticles;
	}

	public void setHotArticles(List<Article> hotArticles) {
		this.hotArticles = hotArticles;
	}
	
	public List<Article> getRightArticles() {
		return rightArticles;
	}

	public void setRightArticles(List<Article> rightArticles) {
		this.rightArticles = rightArticles;
	}

	public ArticleService getArticleService() {
		return articleService;
	}

	@Resource
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	public String articleIndex(){
		this.rightArticles = this.articleService.loadArticles();
		this.cates = this.articleService.loadCategories();
		this.newArticles = this.articleService.loadArticles(0);
		this.hotArticles = this.articleService.loadArticles(1);
		return "article_index";
	}
	
	public String articleCategory(){
		this.rightArticles = this.articleService.loadArticles();
		this.cates = this.articleService.loadCategories();
		HttpServletRequest request = ServletActionContext.getRequest();
		String cid = request.getParameter("cid");
		System.out.println("cid"+cid);
		//List<Article> list = this.articleService.loadCategory(cid).getArticles();
		List<Article> list = this.articleService.loadArticlesByCid(cid);
		request.setAttribute("list", list);
		return "article_category";
	}
	
	public String articleDetail(){
		this.addFieldError("fielderror.test", "wrong!");
		this.rightArticles = this.articleService.loadArticles();
		this.cates = this.articleService.loadCategories();
		HttpServletRequest request = ServletActionContext.getRequest();
		String aid = request.getParameter("aid");
		this.article = this.articleService.loadArticleById(aid);
		return "article_detail";
	}

}
