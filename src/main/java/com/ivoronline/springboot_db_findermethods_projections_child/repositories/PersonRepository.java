package com.ivoronline.springboot_db_findermethods_projections_child.repositories;

import com.ivoronline.springboot_db_findermethods_projections_child.entities.Person;
import com.ivoronline.springboot_db_findermethods_projections_child.entities.PersonProjection;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  PersonProjection findVPersonProjectionByName(String name);
}


