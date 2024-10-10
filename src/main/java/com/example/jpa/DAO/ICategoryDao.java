package com.example.jpa.DAO;

import com.example.jpa.Entity.Category;

import java.util.List;

public interface ICategoryDao {
    List<Category> findAll();
    List<Category> findAll(int page, int pagesize);
    Category findById(int id);
    Category findByName(String name);
    List<Category> searchByName(String keyword);
    void insert(Category category);
    void update(Category category);
    void delete(int id) throws Exception;
    int count();
}
