from tkinter import *
from PIL import Image, ImageTk

class RenderableObject:
    #NOTE//right now you cant scale one axis while shrinking another or vice versa
    def __init__(self, x, y, width, height, fileName):
        self.x = x
        self.y = y
        self.width = width
        self.height = height
        image = Image.open(fileName)
        image = image.resize((width, height), Image.ANTIALIAS)
        self.bufferedImage = ImageTk.PhotoImage(image)
        

        

        

    


    
        
