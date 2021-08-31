package com.ivoronline.springboot_db_findermethods_projections_child.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  city;
  public String  street;

  //CONSTRUCTORS
  public Address() {}
  public Address(String city, String street) {
    this.city   = city;
    this.street = street;
  }

}
