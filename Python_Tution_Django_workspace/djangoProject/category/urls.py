from django.contrib import admin
from django.urls import path
from category import views

urlpatterns = [
    path("addCategory/", views.category, name="category"),
    path("", views.index)
]
