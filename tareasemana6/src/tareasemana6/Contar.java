package tareasemana6;
import java.util.Scanner;
public class Contar {

	public static void main(String[] args) {
		int  sumaimp=0,sumapar=0,num,comp=0,i=1;
		double promedio;
			Scanner scan=new Scanner(System.in);
			System.out.println("ingrese el numero");
			num=scan.nextInt();
        while (i<270){
        	i++;
        	if(num%2==0) {
        		sumapar=sumapar+num;
        		comp++;
        	}else {
        		sumaimp=sumaimp+num;
        	}
        	System.out.println("ingrese el numero");
			num=scan.nextInt();
        }
        promedio=sumapar/comp;
	System.out.println("suma de numeros impares: "+sumaimp);
	System.out.println("el promedio de pares es: "+promedio);
	}

}
