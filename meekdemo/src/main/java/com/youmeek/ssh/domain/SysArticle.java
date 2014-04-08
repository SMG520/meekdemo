package com.youmeek.ssh.domain;

import javax.persistence.*;

@Entity
@Table(name = "sys_article", schema = "")
public class SysArticle {
	private String articleId;
	private String articleTitle;

	@Id
	@Column(name = "article_id")
	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	@Basic
	@Column(name = "article_title")
	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

}
