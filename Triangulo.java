package atvd42;

/*Problema Exemplo-COM POO
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
(suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois 
triângulos e dizer qual dos dois triângulos possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus 
lados a, b e c é a seguinte (fórmula de Heron):

área = √(p(p-a)(p-b)(p-c))

Onde:
p = (a + b + c) / 2 */

public class Triangulo {
    public double a;
    public double b;
    public double c;

    // Método para calcular a área do triângulo
    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    
    }
}
