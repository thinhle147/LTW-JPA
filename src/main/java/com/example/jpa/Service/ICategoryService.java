package com.example.jpa.Service;

import com.example.jpa.Entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(int id);
    Category findByName(String name);
    List<Category> searchByName(String keyword);
    void insert(Category category);
    void update(Category category);
    void delete(int id) throws Exception;
}
