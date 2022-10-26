import java.util.Scanner;
public class ejercicio3 {
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int[] números =new int [10];
 int pos =0, neg=0;
 int i;
 double sumaPos=0, sumaNeg=0;
 System.out.println("leectura de los elementos del array: ");
 for (i = 0; i < números.length; i++) {
 System.out.println("números ["+i+"]=");
 números[i]=sc.nextInt();
 }
 for ( i = 0; i < números.length; i++) {
 if (números[i]>0) {
 sumaPos+=números[i];
 pos++;
 } else if (números[i]<0) {
 sumaNeg+= números[i];
 neg++;
 }
 }
 if (pos!=0) {
 System.out.println("media de los valores positivos:"+sumaPos/pos);
 }else {
 System.out.println("no ha introducido números positivos");
 }
 if (neg!=0) {
 System.out.println("Media de los valores negativos:"+sumaNeg/neg );
 } else {
 System.out.println("No ha introducido números negativos");
 }
 }
}