import java.util.Locale;
import java.util.Scanner;

public class Exercicio6{
	public static void main(String[] args) {
		/*
		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
	mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B

		*/
	Locale.setDefault(Locale.US);
	double A , B ,C;
	Scanner sc = new Scanner(System.in);
	//Lendo os valores
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();


	//A
	double area_trianguloRetangulo;
	area_trianguloRetangulo = (A*C)/2;
	//B
	double area_circulo,pi;
	pi=3.14159;
	area_circulo = pi*Math.pow(C,2);
	//C
	double area_trapezio;
	area_trapezio = ((A+B)*C)/2;
	//D
	double area_quadrado;
	area_quadrado = Math.pow(B,2);
	//E
	double area_retangulo;
	area_retangulo = A*B;

	System.out.printf("TRIANGULO: %.3f\n",area_trianguloRetangulo);
	System.out.printf("CIRCULO: %.3f\n",area_circulo);
	System.out.printf("TRAPEZIO: %.3f\n",area_trapezio);
	System.out.printf("QUADRADO: %.3f\n",area_quadrado);
	System.out.printf("RETANGULO: %.3f\n",area_retangulo);
	sc.close();


	}
}