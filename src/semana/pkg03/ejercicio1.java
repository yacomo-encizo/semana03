package ejercicio1_arreglos;
import java.util.Scanner;
public class ejercicio1 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int[] numeros = new int[10];
 int pos = 0, neg = 0, cero = 0;
 int i;
 System.out.println("Lectura de los elementos del array: ");
 for (i = 0; i < numeros.length; i++) {
 System.out.print("numeros[" + i + "]= ");
 numeros[i] = sc.nextInt();
 }
 for (i = 0; i < numeros.length; i++) {
 if (numeros[i] > 0) {
 pos++;
 } else if (numeros[i] < 0) {
 neg++;
 } else {
 cero++;
 }
 }
 System.out.println("Positivos: " + pos);
 System.out.println("Negativos: " + neg);
 System.out.println("Ceros: " + cero);
 }
}