package com.ivoronline.springboot_db_query_native_projection_interface_opened.entities;

import org.springframework.beans.factory.annotation.Value;

public interface PersonView {
  @Value("#{target.name + ' is ' + target.age + ' years old'}")
  String getExpression();
}
