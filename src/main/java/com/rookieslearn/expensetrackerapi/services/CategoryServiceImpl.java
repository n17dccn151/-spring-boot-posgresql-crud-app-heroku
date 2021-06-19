package com.rookieslearn.expensetrackerapi.services;

import com.rookieslearn.expensetrackerapi.domain.Category;
import com.rookieslearn.expensetrackerapi.exceptions.EtBadRequestException;
import com.rookieslearn.expensetrackerapi.exceptions.EtResourceNotFoundException;
import com.rookieslearn.expensetrackerapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TanVOD on Jun, 2021
 */

@Service
@Transactional

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;



    @Override
    public List<Category> fetchAllCategories(Integer userId) {
        return categoryRepository.findAll(userId);
    }

    @Override
    public Category fechCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        return categoryRepository.findById(userId,categoryId);
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {
        int categoryId = categoryRepository.create(userId, title, description);
        return categoryRepository.findById(userId,categoryId);      //
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {
        categoryRepository.update(userId, categoryId, category);
    }

    @Override
    public void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        this.fechCategoryById(userId, categoryId);
        categoryRepository.removeById(userId, categoryId);
    }
}
