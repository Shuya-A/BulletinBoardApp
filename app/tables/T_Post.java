package tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints.Required;
import tables.find.All;
import tables.find.Fuzzy;

@Entity
@Table(name = "t_post")
public class T_Post extends BaseTable {

	public static class Find extends FindDecorator<Long, T_Post>
			implements All<T_Post>, Fuzzy<T_Post> {}

	public static Find find = new Find();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Required
	public String name;

	public String title;
	
	public String message;

	public boolean isEmpty() {
		return id == null;
	}
}
