public class Square extends Rectangle {

    public Square (){

    }
    public Square (double side){
        super(side,side);
    }
    public Square(double side, String color , boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        super.setLength(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
   public  void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
   public String toString(){
        return super.toString();
    }
}
