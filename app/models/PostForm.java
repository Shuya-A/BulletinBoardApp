package models;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import tables.T_Post;

public class PostForm {

	private String name;
	private String title;
	private String message;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public List<PostItem> findAllItem() {
		List<T_Post> list = T_Post.find.all();
		return list.stream()
				.map(PostItem::new)
				.collect(Collectors.toList());
	}
}
