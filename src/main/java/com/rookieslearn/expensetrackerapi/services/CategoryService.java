package com.rookieslearn.expensetrackerapi.services;

import com.rookieslearn.expensetrackerapi.domain.Category;
import com.rookieslearn.expensetrackerapi.exceptions.EtBadRequestException;
import com.rookieslearn.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

/**
 * Created by TanVOD on Jun, 2021
 */
public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);

    Category fechCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
