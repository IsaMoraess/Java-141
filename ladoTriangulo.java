package atvd42;

import java.util.Scanner;

public class ladoTriangulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // CHAMAR CLASSE ENTIDADE
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        // ADICIONA VARIAVEIS
        double xA, xB, xC, yA, yB, yC;

        // INSERIR VALORES
        System.out.println("Entre com os valores do Trinagulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os valores do Trinagulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // ÁREA DO TRIANGULO X
        double areaX = x.area();

        // ÁREA DO TRIANGULO Y
        double areaY = y.area();

        // MOSTRAR OS VALORES
        System.out.println("Área do Triângulo X: " + areaX);
        System.out.println("Área do Triângulo Y: " + areaY);

        // VERIFICAR QUAL TRIANGULO TEM A MAIOR ÁREA
        if (areaX > areaY) {
            System.out.println("O Triângulo X possui a maior área.");
        } else if (areaX < areaY) {
            System.out.println("O Triângulo Y possui a maior área.");
        } else {
            System.out.println("Os Triângulos X e Y possuem as mesmas áreas.");
        }
    }
}
