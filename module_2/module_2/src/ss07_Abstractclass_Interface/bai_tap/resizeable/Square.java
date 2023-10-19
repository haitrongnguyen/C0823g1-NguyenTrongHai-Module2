package ss07_Abstractclass_Interface.bai_tap.resizeable;

import ss07_Abstractclass_Interface.bai_tap.colorable.Colorable;

public class Square extends Rectangle implements Resizeable, Colorable {


    Square(){}
    public Square(double side){
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
    public String toString(){
        return "A square with side="+
                getSide()+" which is a subclass of "+
                super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
