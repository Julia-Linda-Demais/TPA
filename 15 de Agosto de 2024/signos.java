package exercicios;
import java.util.Scanner;
public class signos {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
       int mes, dia;
       System.out.println("Insira o m�s do seu nascimento");
       mes= ler.nextInt();
       System.out.println("Insira o dia do seu nascimento");
       dia= ler.nextInt();
       switch (mes) {
       case 1:
    	   if(dia<=20) {
    	   System.out.println("Capric�rnio");
    	   }else {
    	   System.out.println("Aqu�rio");
    	   }
       break;
       case 2:
    	   if(dia<=19) {
           System.out.println("Aqu�rio");
           }else {
           System.out.println("Peixes");
           }
       break;
       case 3:
    	   if(dia<=20) {
           System.out.println("Peixes");
           }else {
           System.out.println("�ries");
           }
       break;
       case 4:
    	   if(dia<=20) {
           System.out.println("�ries");
           }else {
           System.out.println("Touro");
           }
       break;
       case 5:
    	   if(dia<=20) {
           System.out.println("Touro");
           }else {
           System.out.println("G�meos");
           }
       break;
       case 6:
    	   if(dia<=20) {
           System.out.println("G�meos");
           }else {
           System.out.println("C�ncer");
           }
       break;
       case 7:
    	   if(dia<=21) {
           System.out.println("C�ncer");
           }else {
           System.out.println("Le�o");
           }
       break;
       case 8:
    	   if(dia<=22) {
           System.out.println("Le�o");
           }else {
           System.out.println("Virgem");
           }
       break;
       case 9:
    	   if(dia<=23) {
           System.out.println("Virgem");
           }else {
           System.out.println("Libra");
           }
       break;
       case 10:
    	   if(dia<=22) {
           System.out.println("Libra");
           }else {
           System.out.println("Escorpi�o");
           }
       break;
       case 11:
    	   if(dia<=21) {
           System.out.println("Escorpi�o");
           }else {
           System.out.println("Sagit�rio");
           }
       break;
       default:
    	   if(dia<=21) {
           System.out.println("Sagit�rio");
           }else {
           System.out.println("Capric�rinio");
           }
       }
       ler.close();
	}
}
