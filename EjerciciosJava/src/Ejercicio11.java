
public class Ejercicio11 {
	static int numero =0;

	public static void main(String[] args) {
		System.out.println(numero);
		incrementar();
		System.out.println(numero);
		restar();
		System.out.println(numero);

		
	}
	
	public static void incrementar() {
	numero = numero +1;	
	}
	public static void restar() {
		numero = numero -2;	
		}

}
