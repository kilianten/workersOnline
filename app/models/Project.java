package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model {

  @Id
  private Long id;
  @Constraints.Required
  private String name;
  @Constraints.Required
  private String description;
  @Constraints.Required
  private String county;
  @Constraints.Required

  public Project(){
  }

  public Project(Long id, String name, String description, String county){
    this.id = id;
    this.name = name;
    this.description = description;
    this.county = county;
  }

  public static final Finder<Long, Project> find = new Finder<>(Project.class);

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

  public String getCounty(){
    return county;
  }

  public void setCounty(){
    this.county = county;
  }

  public static final List<Project> findAll(){
    return Project.find.all();
  }



}