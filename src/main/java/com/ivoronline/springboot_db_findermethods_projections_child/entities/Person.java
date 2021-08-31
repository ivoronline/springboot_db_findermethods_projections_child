package com.ivoronline.springboot_db_findermethods_projections_child.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //RELATIONSHIP
  @OneToOne(cascade = CascadeType.ALL)
  public Address address;

  //CONSTRUCTORS
  public Person() {}
  public Person(String name, Integer age, Address address) {
    this.name    = name;
    this.age     = age;
    this.address = address;
  }

}
