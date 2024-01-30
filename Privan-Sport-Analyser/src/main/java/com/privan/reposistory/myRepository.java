package com.privan.reposistory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.privan.model.Model;

@Repository
public interface myRepository extends CrudRepository<Model, String> {

}
