package tables;

import java.util.Optional;

import io.ebean.ExpressionList;
import io.ebean.*;

import tables.ClassUtil;
import tables.find.Where;

public class FindDecorator<ID, TABLE extends BaseTable> implements Where<TABLE> {

	//private Model.Finder<ID, TABLE> finder = new Model.Finder<>(getTableClass());
	private Finder<ID, TABLE> finder = new Finder<>(getTableClass());
	
	@SuppressWarnings("unchecked")
	private Class<TABLE> getTableClass() {
		return (Class<TABLE>) ClassUtil.getSecondArgumentType(getClass());
	}

	@Override
	public ExpressionList<TABLE> where() {
		return finder.query().where();
	}

	public Optional<TABLE> byId(ID id) {
		return Optional.ofNullable(finder.byId(id));
	}
}
