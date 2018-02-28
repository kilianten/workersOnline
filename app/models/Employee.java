package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    @Id 
    private String username;
    @Constraints.Required
    private String fName;
    @Constraints.Required
    private String lName;
    @Constraints.Required
    private String role;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String password;
    @Constraints.Required
    private String description;

    public Employee(){

    }

    public Employee(String lName, String fName, String username, String role, String email, String password){
      this.username = username;  
      this.role = role;
      this.email = email;
      this.password = password;
      this.fName = fName;
      this.lName = lName;
    }

    public String getFName(){
        return fName;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public String getLName(){
        return lName;
    }

    public void setLName(String lName){
        this.lName = lName;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public static Finder<String, Employee> find = new Finder<String, Employee>(Employee.class);

    public static List<Employee> findAll(){
        return Employee.find.all();
    }

    public static Employee authenticate(String username, String password){
        return find.query().where().eq("username", username).eq("password", password).findUnique();
    }


  public static Employee getEmployeeById(String id){
    if (id == null)
      {
        return null;
      }
    else
      {
        return find.byId(id);
      }
    }
  

}