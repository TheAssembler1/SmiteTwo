from tkinter import *



class RenderableObject:

    def __init__(self,x,y,width,height,fileName):

        self.x = x
        self.y = y
        self.width = width
        self.height = height
        self.bufferedImage = PhotoImage(file=fileName)
        

    def getBufferedImage(self):
        return self.bufferedImage
        

        

        

    


    
        
