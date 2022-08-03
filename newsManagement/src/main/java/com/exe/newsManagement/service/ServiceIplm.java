package com.exe.newsManagement.service;

import com.exe.newsManagement.model.Category;
import com.exe.newsManagement.model.News;
import com.exe.newsManagement.repo.CategoryRepository;
import com.exe.newsManagement.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceIplm implements MainService{
    @Autowired
    private NewsRepository newsRepo;
    @Autowired
    private CategoryRepository cateRepo;

    @Override
    public List<News> getAllNews() {
        return newsRepo.findAll();
    }

    @Override
    public void saveNews(News news) {
        newsRepo.save(news);
    }

    @Override
    public News getNewsById(int id) {
        Optional<News> opt = newsRepo.findById(id);
        News news = null;
        if (opt.isPresent()) {
            news = opt.get();
        } else {
            throw new RuntimeException("Mot found news to delete");
        }
        return news;
    }

    @Override
    public void deleteNewsById(int id) {
        newsRepo.deleteById(id);
    }

    @Override
    public List<Category> getAllCategory() {
        return cateRepo.findAll();
    }

    @Override
    public void saveCategory(Category category) {
        cateRepo.save(category);
    }

    @Override
    public Category getCategoryById(int id) {
        Optional<Category> opt = cateRepo.findById(id);
        Category cate = null;
        if (opt.isPresent()) {
            cate = opt.get();
        } else {
            throw new RuntimeException("Mot found category to delete");
        }
        return cate;

    }

    @Override
    public void deleteCateById(int id) {
        cateRepo.deleteById(id);
    }
}
