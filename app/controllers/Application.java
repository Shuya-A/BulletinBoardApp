package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import models.PostForm;
import models.PostItem;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import tables.T_Post;

@Singleton
public class Application extends Controller {
	
	private Form<PostForm> forms;
	private Form<PostItem> itemForms;
	private Form<T_Post> t_forms;

	@Inject
	public Application(FormFactory formFactory) {
		this.forms = formFactory.form(PostForm.class);
		this.itemForms = formFactory.form(PostItem.class);
		this.t_forms = formFactory.form(T_Post.class);
	}
	
    public Result index() {
		Form<PostForm> requestForm = forms.bindFromRequest();
		if (requestForm.hasErrors()) {
			return badRequest(views.html.index.render(t_forms, new ArrayList<>(), null));
		}
		PostForm form = requestForm.get();
		List<PostItem> items = form.findAllItem();
		return ok(views.html.index.render(t_forms, fill(items), null));
    }
    
	private List<Form<PostItem>> fill(List<PostItem> items) {
		return items.stream()
				.map(itemForms::fill)
				.collect(Collectors.toList());
	}
}
