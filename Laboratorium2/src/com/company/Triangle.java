package com.company;

public class Triangle {
    private Point X;
    private Point Y;
    private Point Z;

    public Triangle(Point X, Point Y, Point Z)
    {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public String toString()//wyswietla koordynaty punktów składowych
    {
        System.out.println("Triangle[v1=(" + X.getX() + "," + X.getY() + "),v2=(" + Y.getX() + "," + Y.getY() + "),v3=(" + Z.getX() + "," + Z.getY() + ")]");
        return null;
    }

    public double getDistances()//podaje obwód trójkąta
    {
        double wynik;
        wynik = Math.sqrt(Math.pow(X.getX() - Y.getX(),2)+Math.pow(X.getY()-Y.getY(),2));
        wynik += Math.sqrt(Math.pow(X.getX() - Z.getX(),2)+Math.pow(X.getY()-Z.getY(),2));
        wynik += Math.sqrt(Math.pow(Y.getX() - Z.getX(),2)+Math.pow(Y.getY()-Z.getY(),2));
        return wynik;
    }

    public String getType()//podaje typ trójkąta
    {
        double one, two, three;
        one = Math.sqrt(Math.pow(X.getX() - Y.getX(),2)+Math.pow(X.getY()-Y.getY(),2));
        two = Math.sqrt(Math.pow(X.getX() - Z.getX(),2)+Math.pow(X.getY()-Z.getY(),2));
        three = Math.sqrt(Math.pow(Y.getX() - Z.getX(),2)+Math.pow(Y.getY()-Z.getY(),2));

        if(one == two && two == three)  return "równoboczny";
        else if(one == two||two==three||three == one) return "równoramienny";
        else return "różnoboczny";
    }

    public static void main(String[] args) {

        Point S = new Point(0,0);
        Point A = new Point(3,4);
        Point B = new Point(-3,-4);
        Triangle tr = new Triangle(A,B,S);
        tr.toString();
        System.out.println(tr.getDistances());
        System.out.println(tr.getType());
    }
}
