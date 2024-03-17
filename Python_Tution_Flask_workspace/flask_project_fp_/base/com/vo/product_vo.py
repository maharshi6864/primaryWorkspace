from base import db, app
from base.com.vo.category_vo import CategoryVo
from base.com.vo.subcategory_vo import SubCategoryVo


class ProductVo(db.Model):

    def __init__(self):
        with app.app_context():
            db.create_all()
        __tablename__ = "product_table"

    product_id = db.Column('product_id', db.Integer, primary_key=True)
    product_name = db.Column('product_name', db.String(255), nullable=False)
    product_price = db.Column('product_price', db.Integer, nullable=False)
    product_quantity = db.Column('product_quantity', db.String(255), nullable=False)
    product_image_name = db.Column('product_image_name', db.String(255), nullable=False)
    product_image_path = db.Column('product_image_path', db.String(255), nullable=False)
    product_description = db.Column('product_description', db.Text, nullable=False)
    sub_category_id = db.Column('sub_category_id', db.Integer,
                                db.ForeignKey(SubCategoryVo.sub_category_id, ondelete='CASCADE', onupdate='CASCADE'),
                                nullable=False)
    category_id = db.Column('category_id', db.Integer,
                            db.ForeignKey(CategoryVo.category_id, ondelete='CASCADE', onupdate='CASCADE'),
                            nullable=False)
