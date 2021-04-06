from tkinter import *

class Renderer:
    RenderableObjects = []

    def addRenderableObject(renderableObject):
        Renderer.RenderableObjects.append(renderableObject)

    def render(window):
        #NOTE::Background rectangle
        window.create_rectangle(window.WIDTH, window.HEIGHT, 0, 0, outline="#f11", fill="#1f1", width=0)

        for obj in Renderer.RenderableObjects:
            #NOTE::we only need to create image once on canvas so we clear Renderable Objects afterwards
            window.create_image(obj.x, obj.y, anchor=NW, image=obj.bufferedImage)
            

    
    
