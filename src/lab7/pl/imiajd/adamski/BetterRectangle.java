package lab7.pl.imiajd.adamski;
import java.awt.Rectangle;

class TestBetterRectangle{
    public static void main(String[] args){
        BetterRectangle rec = new BetterRectangle(2, 3);
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getArea());
    }
}

class BetterRectangle extends Rectangle {
//    public BetterRectangle(int szer, int wys){
//        setLocation(0, 0);
//        setSize(szer, wys);
//    }

    public BetterRectangle(int szer, int wys){
        super(0,0, szer, wys);
    }

    public double getPerimeter(){
        return getWidth() * 2 + getHeight() * 2;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
}
