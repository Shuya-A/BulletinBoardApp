package models;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import play.data.format.Formats;
import tables.T_Post;

@Getter
@NoArgsConstructor
public class PostItem {

	Long id;

	String name;

	String title;

	String message;

	@Formats.DateTime(pattern = "yyyy/MM/dd HH:mm:SS")
	Date createdAt;

	public PostItem(T_Post post) {
		this.id = post.id;
		this.name = post.name;
		this.title = post.title;
		this.message = post.message;
		this.createdAt = post.createdAt;
	}
}
