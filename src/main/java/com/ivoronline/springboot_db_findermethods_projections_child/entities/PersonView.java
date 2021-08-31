package com.ivoronline.springboot_db_findermethods_projections_child.entities;

// Interface can only have Methods. It can't have Properties/State.
public interface PersonView {
  String      getName();
  String      getAge();
  AddressView getAddress();
}



