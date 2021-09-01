package com.ivoronline.springboot_db_findermethods_projections_child.controllers;

import com.ivoronline.springboot_db_findermethods_projections_child.entities.AddressView;
import com.ivoronline.springboot_db_findermethods_projections_child.entities.PersonView;
import com.ivoronline.springboot_db_findermethods_projections_child.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND PERSON VIEW BY NAME
  //================================================================
  @RequestMapping("FindPersonViewByName")
  AddressView FindPersonViewByName() {
    PersonView  personView = personRepository.findVPersonViewByName("Bill");
    AddressView address    = personView.getAddress();
    return      address;
  }

}
