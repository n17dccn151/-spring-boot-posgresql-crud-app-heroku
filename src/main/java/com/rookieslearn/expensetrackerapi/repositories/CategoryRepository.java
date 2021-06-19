package com.rookieslearn.expensetrackerapi.repositories;

import com.rookieslearn.expensetrackerapi.domain.Category;
import com.rookieslearn.expensetrackerapi.exceptions.EtBadRequestException;
import com.rookieslearn.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

/**
 * Created by TanVOD on Jun, 2021
 */
public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

}
