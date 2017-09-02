package taller.pkg3.testing;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Taller3Testing {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
        
        
        do{
        System.out.print("Seleccione la figura geometrica para calcular su area:\n\n1) Cuadrado / Rectangulo\n2) Circulo\n3) Triangulo \n\nOpcion: ");
        opcion = sc.nextInt();
        }while(opcion<1||opcion>3);
        
        switch(opcion){
            case 1:
                Cuadrilatero();
                break;
            case 2:
                Circunferencia();
                break;
            case 3:
                Triangulo();
                
                
                break;
        }
    }
    
    static void Cuadrilatero(){
        int Lado1,Lado2;
        System.out.print("\nIngrese el largo: ");
        Lado1 = sc.nextInt();
        System.out.print("Ingrese el ancho: ");
        Lado2 = sc.nextInt();
        System.out.println("\nArea cuadrilatero: "+Lado1*Lado2+" Unidades cuadradas\nPerimetro cuadrilatero: "+(Lado1*2+Lado2*2)+" 1Unidades");
    }
    
    static void Circunferencia(){
        double Radio;
        System.out.print("\nIngrese el radio: ");
        Radio = sc.nextDouble();
        double pi = 3.14;
        System.out.println("\nArea circunferencia: "+Radio*Radio*pi+" Unidades cuadradas\nPerimetro circunferencia: "+2*pi*Radio+" Unidades");
    }
    
    static void Triangulo(){
        char aux;
        
        do{
            System.out.print("\nEs un triangulo rectangulo?(S/N): ");
            aux = sc.next().charAt(0);     
        }while(aux != 's'&&aux != 'S'&&aux != 'n'&&aux != 'N'); 
        if(aux == 's'||aux == 'S'){
            int catetoA,catetoB;
            catetoA = sc.nextInt();
            catetoB = sc.nextInt();
            System.out.println("\nArea triangulo: "+(catetoA*catetoB)/2+" Unidades cuadradas\nPerimetro triangulo: "+(catetoA+catetoB+(sqrt(catetoA*catetoA+catetoB*catetoB)))+" Unidades");
        }
    }
    
}
