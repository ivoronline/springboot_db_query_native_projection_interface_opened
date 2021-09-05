package com.ivoronline.springboot_db_query_native_projection_interface_opened.controllers;

import com.ivoronline.springboot_db_query_native_projection_interface_opened.entities.PersonView;
import com.ivoronline.springboot_db_query_native_projection_interface_opened.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON VIEW
  //================================================================
  @RequestMapping("ReturnPersonView")
  PersonView returnPersonView() {
    PersonView personView = personRepository.returnPersonView();
    return     personView;
  }

}


