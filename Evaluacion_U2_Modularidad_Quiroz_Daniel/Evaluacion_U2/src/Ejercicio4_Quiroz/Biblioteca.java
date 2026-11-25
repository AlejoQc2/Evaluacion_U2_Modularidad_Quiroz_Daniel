package Ejercicio4_Quiroz;
import java.util.Scanner;
public class Biblioteca {
    
    public static int leerMinutos(Scanner sc){
        Scanner sca = new Scanner(System.in);

        System.out.print("Ingrese las horas de 1 a 1440 por favor: ");
        int horas= sca.nextInt();
        do{
        if (horas>1 && horas<1440){
            System.out.println("");
        }
        else{
            System.out.println("Ingrese un valor entre el rango que se pidio");
        }
        return horas;
    }while(horas>1 && horas<1441);
    }
    
    public static int horasCobradas(int min){
        int horas=;
        return (horas/60);
    } 
}
