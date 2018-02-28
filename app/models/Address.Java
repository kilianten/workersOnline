package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model {

  @Id
  private Long id;
  @Constraints.Required
  private String address;
  @Constraints.Required
  private String county;
  @Constraints.Required


  public Address(){
  }

  public Address(Long id, String address, String county){
    this.id = id;
    this.address = address;
    this.county = county;
  }

  public static final Finder<Long, Address> find = new Finder<>(Address.class);

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCounty(){
    return county;
  }

  public void setCounty(){
    this.county = county;
  }

  public static final List<Address> findAll(){
    return setAddress.find.all();
  }



}