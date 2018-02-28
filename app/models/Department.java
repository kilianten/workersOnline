package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model {

  @Id
  private Long id;
  @Constraints.Required
  private String name;
  @Constraints.Required
  private String description;
  @Constraints.Required

  public Department(){
  }

  public Department(Long id, String name, String description){
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public static final Finder<Long, Department> find = new Finder<>(Department.class);

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  } 

  public static final List<Department> findAll(){
    return Department.find.all();
  }



}