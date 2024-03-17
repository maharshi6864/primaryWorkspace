package com.ecommerce.respository;

import com.ecommerce.vo.CategoryVo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CategoryDaoImp implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void insertCategory(CategoryVo categoryVo) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(categoryVo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public ArrayList<CategoryVo> searchCategory() {
        ArrayList<CategoryVo> categoryVoArrayList = new ArrayList<CategoryVo>();
        try {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("from CategoryVo");
            categoryVoArrayList = (ArrayList<CategoryVo>) query.list();
        } catch (Exception e) {
            System.out.println(e);
        }
        return categoryVoArrayList;
    }

    @Override
    public ArrayList<CategoryVo> findByIdCategory(int id) {
        ArrayList<CategoryVo> categoryVoArrayList = new ArrayList<CategoryVo>();
        try {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("from CategoryVo where id=" + id);
            categoryVoArrayList = (ArrayList<CategoryVo>) query.list();
        } catch (Exception e) {
            System.out.println(e);
        }
        return categoryVoArrayList;
    }

}
