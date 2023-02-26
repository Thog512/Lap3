package lap3;

public class Triangle{
    public float width;
    public float height;
    
    public Triangle(){
        this.width = 0;
        this.height = 0;
    }
    public Triangle(float w, float h){
        this.width = w;
        this.height = h;
    }
    public float getwidth(){
        return 0;
    }
    public float getheight(){
        return 0;
    }
    public void setwedth(float w){
        this.width = w;
    }
    public void setheight(float h){
        this.height = h;
    }
    public String toString(){
        return "Triangle("+width+";"+height+")";
    }
}
