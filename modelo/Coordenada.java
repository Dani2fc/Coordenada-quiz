package modelo;

public class Coordenada {
    // -----------------
    // Atributos
    // -----------------
    private double x;
    private double y;
    private double x2;
    private double y2;
    private double d;

    // -----------------
    // Métodos
    // -----------------

    public Coordenada(){

    }

    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }
    
    public void setY(double y){
        this.y = y;
    }

    public double Distancia(double x, double y, double x2, double y2){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
         if(x<x2 & y<y2){
            d = Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
        }else if(x>x2 & y<y2){
            d = Math.sqrt(((x-x2)*(x-x2))+((y2-y)*(y2-y)));
        }else if(x>x2 & y>y2){
            d = Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));
        }else{
            d = Math.sqrt(((x2-x)*(x2-x))+((y-y2)*(y-y2)));
        }
        return d;
    }

    // Método sobreescrito de la clase object
    public String toString(){
        return "(" + x + " , "+ y + ")";
    }

    public boolean equals(Object obj){
        Coordenada dos = (Coordenada)obj;
        return (x == dos.x) && (y == dos.y);
    }
}