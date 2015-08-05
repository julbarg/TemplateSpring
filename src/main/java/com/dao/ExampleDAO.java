package com.dao;

import java.util.ArrayList;

import com.enitity.ExampleEntity;


public interface ExampleDAO {

   public ExampleEntity update(ExampleEntity alarmaPymeIVR);

   public ExampleEntity findById(long id) throws Exception;

   public ArrayList<ExampleEntity> findAll() throws Exception;

   public void create(ExampleEntity post);

}
