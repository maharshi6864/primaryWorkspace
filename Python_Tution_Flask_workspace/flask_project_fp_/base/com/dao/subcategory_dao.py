from base import db
from base.com.vo.category_vo import CategoryVo
from base.com.vo.subcategory_vo import SubCategoryVo


class SubCategoryDao:
    def insert_subcategory(self, sub_category_vo):
        db.session.add(sub_category_vo)
        db.session.commit()

    def search_subcategory(self):
        query = (db.session.query(SubCategoryVo, CategoryVo).join(CategoryVo,
                                                                  SubCategoryVo.category_id == CategoryVo.category_id)
                 .all())
        db.session.commit()
        return query

    def edit_sub_category(self, edit_id):
        query = db.session.query(SubCategoryVo).filter_by(sub_category_id=edit_id)
        db.session.commit()
        return query

    def update_subcategory(self, category_vo):
        db.session.merge(category_vo)
        db.session.commit()

    def delete_sub_category(self, delete_sub_category_vo_obj):
        db.session.delete(delete_sub_category_vo_obj)
        db.session.commit()
