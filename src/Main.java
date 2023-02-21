
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);
       System.out.println("ingrese el precio de la compra: ");
       double a = entrada.nextDouble();
        System.out.println("el precio de la compra con IVA es :" + funcionConIva(a));



 }

 public static double funcionConIva(double a){

     return ((21 * a)/100) + a;
 }
}