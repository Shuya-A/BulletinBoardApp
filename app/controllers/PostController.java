package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import tables.T_Post;

public class PostController extends Controller {
	
	private Form<T_Post> forms;

	@Inject
	public PostController(FormFactory formFactory) {
		this.forms = formFactory.form(T_Post.class);
	}
	
	@Transactional
	public Result create() {
		Form<T_Post> requestForm = forms.bindFromRequest();
		if (requestForm.hasErrors()) {
			return redirect(routes.Application.index());
		}
		T_Post post = requestForm.get();
		post.save();
		return redirect(routes.Application.index());
	}

}
