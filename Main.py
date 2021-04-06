from tkinter import *
import Window
from Renderer import *
from RenderableObjects import *

#GRANT PLZ READ
#NOTE::I'm using a new lib called PIL from which I import


screen = Window.Screen()

fileName = 'player.png'
testObject = RenderableObject(20, 20, 100, 150, fileName)
Renderer.addRenderableObject(testObject)

running = True

#NOTE::throws an error while exiting but thats ok for now
while running:
    Renderer.render(screen)
    screen.update()
