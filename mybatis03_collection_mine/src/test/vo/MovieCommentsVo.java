package test.vo;

import java.util.List;

public class MovieCommentsVo {
	private int mnum;
	private String title;
	private String content;
	private String director;
	private List<CommentsVo> commList;
	public MovieCommentsVo() {}
	public MovieCommentsVo(int mnum, String title, String content, String director, List<CommentsVo> commList) {
		super();
		this.mnum = mnum;
		this.title = title;
		this.content = content;
		this.director = director;
		this.commList = commList;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public List<CommentsVo> getCommList() {
		return commList;
	}
	public void setCommList(List<CommentsVo> commList) {
		this.commList = commList;
	}
	
	

}
