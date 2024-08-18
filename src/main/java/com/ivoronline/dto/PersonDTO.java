package com.ivoronline.dto;

import org.springframework.beans.factory.annotation.Value;

public interface PersonDTO {
  @Value("#{target.name + ' is ' + target.age + ' years old'}")
  String getExpression();
}
