package ejecutable;

import modelo.Coordenada;

public class Test {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(0.0,0.0);
        Coordenada c2 = new Coordenada(1.3,5.3);

        System.out.println("Con posición en X de: " + c1.getX());
        System.out.println("Con posición en Y de: "+ c1.getY());
        System.out.println("La coordenada es: "+ c1);

        System.out.println("Con posición en X de: " + c2.getX());
        System.out.println("Con posición en Y de: "+ c2.getY());
        System.out.println("La coordenada es: "+ c2);

        Coordenada distancia = new Coordenada();
        System.out.println("La distancia entre los puntos es: "+ distancia.Distancia(0.0, 0.0, 1.3, 5.3));
    }
}
