package controllers;

import dao.CustomerDao;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import javax.inject.Inject;

public class Application extends Controller {

	@Inject
	CustomerDao customerDao;

	@Transactional
	public Result index() {
		return ok(index.render(customerDao.getAll()));
	}
}
