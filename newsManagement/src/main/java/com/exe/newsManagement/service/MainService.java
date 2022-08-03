package com.exe.newsManagement.service;

import com.exe.newsManagement.model.Category;
import com.exe.newsManagement.model.News;

import java.util.List;

public interface MainService {
    List<News> getAllNews();

    void saveNews(News news);

    News getNewsById(int id);

    void deleteNewsById(int id);

    List<Category> getAllCategory();

    void saveCategory(Category category);

    Category getCategoryById(int id);

    void deleteCateById(int id);

}
