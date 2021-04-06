import Main




class renderer:

 
    def __init__(self,RenderableObjects):
        self.RenderableObjects = RenderableObjects
        
        

    def addRenderableObject(self,renderableObject):

        self.RenderableObjects.append(renderableObject)


    def render(self):

        for obj in RenderableObjects:

            image = Label(Main.window,image=obj.img)

            image.pack()
            

    
    
