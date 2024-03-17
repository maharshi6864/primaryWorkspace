from base import db
from base.com.vo.category_vo import CategoryVo


class CategoryDao:
    def insert_category(self, category_vo):
        db.session.add(category_vo)
        db.session.commit()

    def search_category(self):
        query = db.session.query(CategoryVo).all()
        db.session.commit()
        return query

    def edit_category(self, edit_id):
        query = db.session.query(CategoryVo).filter_by(category_id=edit_id)
        db.session.commit()
        return query

    def update_category(self, category_vo):
        db.session.merge(category_vo)
        db.session.commit()

    def delete_category(self, delete_category_vo_obj):
        db.session.delete(delete_category_vo_obj)
        db.session.commit()
