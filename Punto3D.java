/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3d;

public class Punto3D {
    // Atributos privados
    private double x;
    private double y;
    private double z;

    // Constructor que recibe parámetros
    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Constructor que inicializa valores por defecto
    public Punto3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    // Constructor que hace una copia de un objeto ya existente
    public Punto3D(Punto3D punto) {
        this.x = punto.x;
        this.y = punto.y;
        this.z = punto.z;
    }

    // Métodos getter y setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Método para mostrar el punto en formato legible
    @Override
    public String toString() {
        return "Puntos3D(" + "x=" + x + ", y=" + y + ", z=" + z + ')';
    }

    // Método para calcular la distancia euclidiana entre dos puntos 3D
    public double distancia(Punto3D otro) {
        return Math.sqrt(Math.pow(otro.x - this.x, 2) +
                         Math.pow(otro.y - this.y, 2) +
                         Math.pow(otro.z - this.z, 2));
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un arreglo de 10 objetos Puntos3D
        Punto3D[] puntos = new Punto3D[10];

        // Inicializar los objetos con valores específicos
        puntos[0] = new Punto3D(1, 2, 3);
        puntos[1] = new Punto3D(4, 5, 6);
        puntos[2] = new Punto3D(7, 8, 9);
        puntos[3] = new Punto3D(1, 1, 1);
        puntos[4] = new Punto3D(2, 2, 2);
        puntos[5] = new Punto3D(3, 3, 3);
        puntos[6] = new Punto3D(4, 4, 4);
        puntos[7] = new Punto3D(5, 5, 5);
        puntos[8] = new Punto3D(6, 6, 6);
        puntos[9] = new Punto3D(7, 7, 7);

        // Inicializar la menor distancia con un valor alto
        double menorDistancia = Double.MAX_VALUE;
        Punto3D puntoA = null;
        Punto3D puntoB = null;
        
        // Calcular la distancia entre todos los pares de puntos y encontrar la menor
        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                double distancia = puntos[i].distancia(puntos[j]);
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                    puntoA = puntos[i];
                    puntoB = puntos[j];
                }
            }
        }

         // Mostrar la menor distancia y los puntos correspondientes
        if (puntoA != null && puntoB != null) {
            System.out.println("La menor distancia es: " + menorDistancia);
            System.out.println("Entre los puntos: " + puntoA + " y " + puntoB);
        } else {
            System.out.println("No se encontraron puntos.");
        }
    }   
}