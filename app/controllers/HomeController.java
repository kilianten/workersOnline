package controllers;

import play.mvc.*;
import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;

import models.*;
import models.users.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    Project p;

    private FormFactory formFactory;
    private Environment env;

    @Inject
    public HomeController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    public Result index() {
        Form<Login> loginForm = formFactory.form(Login.class); 

        return ok(index.render(loginForm, Employee.getEmployeeById(session().get("username"))));
    }

    public Result about() {
        Form<Login> loginForm = formFactory.form(Login.class); 

        return ok(about.render(loginForm, Employee.getEmployeeById(session().get("username"))));
    }

    public Result projects() {

        Form<Login> loginForm = formFactory.form(Login.class); 

        List projects = Project.findAll();

        return ok(views.html.projects.render(projects, loginForm, Employee.getEmployeeById(session().get("username"))));
    }

    public Result loginSubmit(){

        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
    
        if(loginForm.hasErrors()){
            return badRequest(index.render(loginForm, Employee.getEmployeeById(session().get("username"))));
        }
        else
        {
            session().clear();
            session("username", loginForm.get().getUsername());
        }
        return redirect(routes.HomeController.index());
      
    }

    public Result logout(){
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    public Result profile(){

        Form<Login> loginForm = formFactory.form(Login.class); 

        return ok(profile.render(loginForm, Employee.getEmployeeById(session().get("username"))));
    
    }

}
