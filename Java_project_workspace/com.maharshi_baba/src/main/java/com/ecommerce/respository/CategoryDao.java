package com.ecommerce.respository;

import com.ecommerce.vo.CategoryVo;

import java.util.ArrayList;

public interface CategoryDao {

    public void insertCategory(CategoryVo categoryVo);
    public ArrayList<CategoryVo> searchCategory();
    public ArrayList<CategoryVo> findByIdCategory(int id);


}
