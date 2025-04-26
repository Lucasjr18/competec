/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	char nome ='l';
	int idade = 15;
	boolean cafe = true;
 	int laranja = 25;
 	int uva = 33;
 	int multi  = uva * laranja;
 	System.out.println("resultado = " + multi);
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("digite o valor da uva ");	
	 uva = entrada.nextInt();
	System.out.print("digite o valor da laranja");
	 laranja = entrada.nextInt();    
	    
	 System.out.print("resultado da soma = "+ (laranja + uva) );  
	}
}
