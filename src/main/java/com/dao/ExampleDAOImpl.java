package com.dao;

import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.enitity.ExampleEntity;


@Repository
public class ExampleDAOImpl extends TemplateDAO<ExampleEntity> implements ExampleDAO {

   @Override
   public ExampleEntity findById(long id) throws Exception {
      ExampleEntity alarmaPymeIVR = entityManager.find(ExampleEntity.class, id);

      return alarmaPymeIVR;
   }

   @Override
   public ArrayList<ExampleEntity> findAll() throws Exception {
      TypedQuery<ExampleEntity> query = entityManager.createNamedQuery("ExampleEntity.findAll",
         ExampleEntity.class);
      ArrayList<ExampleEntity> results = (ArrayList<ExampleEntity>) query.getResultList();

      return results;
   }
}
