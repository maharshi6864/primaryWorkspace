from base import db, app
from base.com.vo.category_vo import CategoryVo


class SubCategoryVo(db.Model):

    def __init__(self):
        with app.app_context():
            db.create_all()
        __tablename__ = "sub_category_table"

    sub_category_id = db.Column('sub_category_id', db.Integer, primary_key=True)
    sub_category_name = db.Column('sub_category_name', db.String(255), nullable=False)
    sub_category_description = db.Column('sub_category_description', db.Text, nullable=False)
    category_id = db.Column('category_id', db.Integer,
                            db.ForeignKey(CategoryVo.category_id, ondelete='CASCADE', onupdate='CASCADE'),
                            nullable=False)

    def as_dict(self):
        return {
            'sub_category_id': self.sub_category_id,
            'sub_category_name': self.sub_category_name,
            'sub_category_description': self.sub_category_description,
            'category_id': self.category_id
        }

    db.create_all()
