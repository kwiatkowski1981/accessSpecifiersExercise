package app;
import main.PointController;
import data.Point;


public class PointApplication {

    public static void main(String[] args) {



        System.out.println("wpisz koordynaty x i y aby ustawic punkt na osi");

        Point p1 = new Point(2,2);
        PointController pc = new PointController();

        System.out.println("Punkt: (" + p1.getX() + "; " + p1.getY() + ")");



        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX() + "; " + p1.getY() + ")");

        pc.minusX(p1);
        System.out.println("Punkt minusX: ("+ p1.getX() + ";" + p1.getY() + ")");



        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX() + "; " + p1.getY() + ")");

        pc.minusY(p1);
        pc.minusY(p1);
        pc.minusY(p1);


        System.out.println("Punkt minusY: (" + p1.getX() + "; " + p1.getY() + ")");












    }
}
