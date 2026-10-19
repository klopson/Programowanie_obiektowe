import jdk.jshell.execution.JdiDefaultExecutionControl;

public class Point {
    double x;
    double y;
    public Point (double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public void distance(Point otherPoint)
    {
        System.out.println("Dystans wynosi: " +Math.hypot(otherPoint.x - this.x, otherPoint.y - this.y));
    }


}
