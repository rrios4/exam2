package com.CIS3368.exam2.dao;

import com.CIS3368.exam2.model.virus;
import org.springframework.data.repository.CrudRepository;

//Then I have to create a repo that oversees the virus class created from the model package.
public interface virusRepo extends CrudRepository<virus, Integer> {
}
