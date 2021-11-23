package com.ivoronline.springboot_db_findermethods_projections_child.controllers;

import com.ivoronline.springboot_db_findermethods_projections_child.entities.AddressProjection;
import com.ivoronline.springboot_db_findermethods_projections_child.entities.PersonProjection;
import com.ivoronline.springboot_db_findermethods_projections_child.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND PERSON PROJECTION BY NAME
  //================================================================
  @RequestMapping("FindPersonProjectionByName")
  AddressProjection FindPersonProjectionByName() {

    //GET PARENT AND CHILD PROJECTIONS FROM DB
    PersonProjection  personProjection  = personRepository.findVPersonProjectionByName("Bill");
    AddressProjection addressProjection = personProjection.getAddress();

    //GET PROJECTION PROPERTIES
    String name = personProjection .getName();
    String city = addressProjection.getCity();
    System.out.println(name + " lives in " + city);

    //RETURN PROJECTION
    return addressProjection;
  }

}
