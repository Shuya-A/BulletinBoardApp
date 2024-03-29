package tables;

import java.util.Date;

import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseTable extends Model {

	@CreatedTimestamp
	public Date createdAt;
}
