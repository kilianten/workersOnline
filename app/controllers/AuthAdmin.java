package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

public class AuthAdmin extends Action.Simple{

    public CompletionStage<Result> call(Http.Context ctx){

      String id = ctx.session().get("username");
      if(id != null){
        Employee e = Employee.getEmployeeById(id);
        if("admin".equals(e.getRole())){
            return delegate.call(ctx);
        }
      }
      ctx.flash().put("error", "Admin Login Required.");
      return CompletableFuture.completedFuture(redirect(routes.HomeController.index()));  
    }
}