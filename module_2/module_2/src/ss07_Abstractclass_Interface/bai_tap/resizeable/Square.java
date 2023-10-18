package ss07_Abstractclass_Interface.bai_tap.resizeable;

public class Square extends Rectangle implements Resizeable{
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

    @Override
    public void resize(double percent) {
        setSide(getSide()*(Math.random()*percent+100)/100);
    }
}
