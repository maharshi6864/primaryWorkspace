import os

from base import db
from base.com.vo.category_vo import CategoryVo
from base.com.vo.subcategory_vo import SubCategoryVo
from base.com.vo.product_vo import ProductVo
from flask import app


class ProductDao:
    def insert_product(self, product_vo):
        db.session.add(product_vo)
        db.session.commit()

    def search_product(self):
        query = (db.session.query(ProductVo, SubCategoryVo, CategoryVo).join(SubCategoryVo,
                                                                             ProductVo.sub_category_id == SubCategoryVo.sub_category_id,
                                                                             ).join(CategoryVo,
                                                                                    ProductVo.category_id == CategoryVo.category_id,
                                                                                    ).all())
        db.session.commit()
        return query

    def edit_sub_category(self, edit_id):
        query = db.session.query(SubCategoryVo).filter_by(sub_category_id=edit_id)
        db.session.commit()
        return query

    def update_product(self, product_vo):
        db.session.merge(product_vo)
        db.session.commit()

    def edit_product(self, edit_id):
        query = db.session.query(ProductVo).filter_by(product_id=edit_id)
        db.session.commit()
        return query

    def delete_product(self, delete_id):
        delete_product_vo_obj = self.edit_product(delete_id)
        image_path = delete_product_vo_obj[0].product_image_path
        image_path = image_path.replace("..", "base")
        os.remove(image_path)
        db.session.delete(delete_product_vo_obj[0])
        db.session.commit()

    def get_sub_categories(self, id):
        query = db.session.query(SubCategoryVo).filter_by(category_id=id).all()
        db.session.commit()
        return query

    # def update_product(self,update_id):
