from django.http import HttpResponse
from django.shortcuts import render
<<<<<<< HEAD
from django.template import loader, context

=======
>>>>>>> b5671bc52d715c83e0b76728c27d6313d29dfe93

# Create your views here.

def category(request):
<<<<<<< HEAD
    return render(request, "addCategory.html")


def index(request):
    return render(request, "index.html")
=======
    return HttpResponse("Hello, world. You're at the")
>>>>>>> b5671bc52d715c83e0b76728c27d6313d29dfe93
