package ss06_Inheritance.thuc_hanh.shape;

public class Square extends Rectangle{
    Square(){}
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public double getSide(){
        return getWidth();
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public String toString(){
        return "A square with side="+
                getSide()+" which is a subclass of "+
                super.toString();
    }
}
