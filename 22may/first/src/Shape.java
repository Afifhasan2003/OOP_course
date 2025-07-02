public class Shape {
    String color;
    boolean filled;
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        this.filled = true;
        this.color = "green";
    }
   public void setColor(String colr){
        this.filled = true;
        this.color = colr;
    }
   public String getColor(){
        return this.color;
    }
   public  boolean isFilled(){
        return this.filled;
    }
   public void setFilled(boolean filled){
        this.filled = filled;
    }

   public String toString(){
        return "A shape with color of " + this.color +" "+ (this.filled ? "filled" : "not filled");
    }


}

