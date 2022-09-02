
public class Ejercicio19 {
	public static void main (String[] args){
		int numero = 50;
		for (int i = 0; i < numero; i++) {
			if(i%2 ==0) {
				//System.out.println(i);
			}
			
		}
		
		//2
		int [] numero2 = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < numero2.length; i++) {
			if(numero2[i] %3 ==0) {
			//	System.out.println(numero2[i]);
			}
			
		}
		int a = 0;
		while (a < numero2.length) {
			if(numero2[a] %3 ==0) {
				//System.out.println(numero2[a]);
			}
			a++;
		}
		//3
		int j = 0;
		int repitir = 10;
		
		do {
			//System.out.println("hola");
			j++;
		} while (j < repitir);
		
		for (int i = 0; i < repitir; i++) {
			//System.out.println("hola");

		}
		int n =0;
	while (n < repitir) {
		//System.out.println("hola");
		n++;
	}	
	//5
	char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
int resta= 0;
int suma =25;
	for (int i = 0; i < letras.length; i++) {
		for (int k = 0; k < letras.length-resta; k++) {
			System.out.print(letras[k]);
		}
		System.out.println("");
		resta++;
	}
	for (int i = 0; i < letras.length; i++) {
		for (int k = 0; k < letras.length-suma; k++) {
			System.out.print(letras[k]);
		}
	System.out.println("");
		suma--;
	}
	}
}
