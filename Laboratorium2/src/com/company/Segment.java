package com.company;

public class Segment
{
    private Point X;
    private Point Y;

    public Segment(Point X, Point Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public String toString()//podaje koordynaty odcinków składowych
    {
        System.out.println("Segment[v1=(" + X.getX() + "," + X.getY() + "), v2=(" + Y.getX() + "," + Y.getY() + ")]");
        return null;
    }

    public double getLength()//wyswietla długość odcinka
    {
        return Math.sqrt(Math.pow(X.getX() - Y.getX(),2)+Math.pow(X.getY()-Y.getY(),2));
    }

    public static void main(String[] args) {
        Point S = new Point(0,0);
        Point A = new Point(3,4);
        Segment l = new Segment(S,A);
        l.toString();
        System.out.println(l.getLength());
    }
}