from tkinter import *

class Screen(Canvas):
    def __init__(self, window=Tk()):
        Canvas.__init__(self, window)
        self.WIDTH = 400
        self.HEIGHT = 400

        window.geometry("{}x{}".format(self.WIDTH, self.HEIGHT))
        window.title("SmiteTwo")
        self.pack(fill=BOTH,expand=TRUE)

    



    

        
  
