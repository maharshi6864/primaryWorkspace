package com.ecommerce.service;

import com.ecommerce.dto.CategoryDto;
import com.ecommerce.vo.CategoryVo;

import java.util.ArrayList;

public interface CategoryService {

   public void insertCategory(CategoryDto categoryDto);
   public ArrayList<CategoryVo> searchCategory();
   public ArrayList<CategoryVo> findById(int id);
   public void updateCategory(CategoryDto categoryDto);
}
