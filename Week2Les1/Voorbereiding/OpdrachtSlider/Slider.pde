class Slider{
    private Rectangle bounds;
    private int numSteps = 5;
    private float value = 0;
    private boolean isActive = false;

    Slider(){
        this.bounds = new Rectangle(10.0,10.0,300.0,50.0);
    }

    Slider(float x, float y, float sx, float sy, int numSteps){
        this.bounds = new Rectangle(x,y,sx,sy);
        this.numSteps = numSteps;
    }

    private float bepaalValue(){
        float xOffset = bounds.pos.getOffset(mouseX, mouseY).x;
        println(xOffset);
        return xOffset;
    }

    public void handleMouse(){
        if(!mousePressed){
            this.isActive = false;
        }
        else if(mousePressed && bounds.isInRect(mouseX, mouseY) && isActive == false){
            this.isActive = true;
        }   

        if(isActive){
            this.value = bepaalValue();
        }
    }

    public void draw(){
        fill(0);
        rect(bounds.pos.x,bounds.pos.y, bounds.size.x,bounds.size.y);
    }

}