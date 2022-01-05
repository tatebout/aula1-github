package exercicioSecao13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post { 
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String titie;
	private String content;
	private String likes;
	
	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(Date moment, String titie, String content, String likes) {
		super();
		this.moment = moment;
		this.titie = titie;
		this.content = content;
		this.likes = likes;
	}
	
	public Post(Date moment, String titie, String content, String likes, List<Comment> comment) {
		super();
		this.moment = moment;
		this.titie = titie;
		this.content = content;
		this.likes = likes;
		this.comments = comment;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitie() {
		return titie;
	}

	public void setTitie(String titie) {
		this.titie = titie;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titie + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
