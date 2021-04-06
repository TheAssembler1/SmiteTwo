from tkinter import *
import Window
from Renderer import *
from RenderableObjects import *


window = Tk()
WIDTH = 400
HEIGHT = 400
window.geometry("{}x{}".format(WIDTH,HEIGHT))
window.title("SmiteTwo")


screen = Window.Screen(window)


RenderableObjects = []
img = "player.png"

obj = RenderableObject(1,2,2,2,img)

r = Renderer.renderer(RenderableObjects)

r.addRenderableObject(obj)




