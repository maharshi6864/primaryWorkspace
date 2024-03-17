package com.ecommerce.service;

import com.ecommerce.dto.CategoryDto;
import com.ecommerce.respository.CategoryDao;
import com.ecommerce.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class CategorySeviceImp implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public void insertCategory(CategoryDto categoryDto) {
        CategoryVo categoryVo=new CategoryVo();

        categoryVo.setCategoryName(categoryDto.getCategoryName());
        categoryVo.setCategoryDescription(categoryDto.getCategoryDescription());

        this.categoryDao.insertCategory(categoryVo);
    }

    @Override
    public ArrayList<CategoryVo> searchCategory() {
        return this.categoryDao.searchCategory();
    }

    @Override
    public ArrayList<CategoryVo> findById(int id) {
        return this.categoryDao.findByIdCategory(id);
    }

    @Override
    public void updateCategory(CategoryDto categoryDto) {
        CategoryVo  categoryVo=new CategoryVo();

        categoryVo.setId(categoryVo.getId());
        categoryVo.setCategoryName(categoryDto.getCategoryName());
        categoryVo.setCategoryDescription(categoryDto.getCategoryDescription());

        this.categoryDao.insertCategory(categoryVo);
    }
}
