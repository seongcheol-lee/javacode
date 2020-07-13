package com.hankki.app.model;

public class CommentsVO {

	private int commentsId;
	private int storeId;
	private int menuId;
	private String comments;
	private int star;
	
	public int getCommentsId() {
		return commentsId;
	}
	public void setCommentsId(int commentsId) {
		this.commentsId = commentsId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	
	
	@Override
	public String toString() {
		return "CommentsVO [commentsId=" + commentsId + 
				", storeId=" + storeId + 
				", menuId=" + menuId + 
				", comments=" + comments + 
				", star=" + star + "]";
	}
	
}
