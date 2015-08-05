package com.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dao.ExampleDAO;
import com.dto.ExampleDTO;


@Controller("example")
@Scope("session")
public class ExampleController implements Serializable {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   @Autowired
   private ExampleDAO exampleDAO;

   private ExampleDTO exampleDTO;

   @PostConstruct
   private void initialize() throws IOException {
      exampleDTO = new ExampleDTO();
   }

   public void save() {

   }

   public ExampleDTO getExampleDTO() {
      return exampleDTO;
   }

   public void setExampleDTO(ExampleDTO exampleDTO) {
      this.exampleDTO = exampleDTO;
   }

}
