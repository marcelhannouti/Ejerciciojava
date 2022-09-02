import java.util.Random;

public class Ejecicio16 {
	public static void main (String[] args){
		Random random = new Random();

		boolean igual = (random.nextInt(2) == 0) ? true : false;
		System.out.println(igual == true ? "rojo" +" " +true : "negro"+ " "+ false);
		
		
		
		//2
		double temperatura =22.5;
		
		if (temperatura < 10) {
			System.out.print("Es clima frio:");
			if(temperatura <5) {
				System.out.print("Polar");
			}else {
				System.out.print("Alta motaña");
			}
		}else if (temperatura >= 10 && temperatura <20){
			System.out.println("Es clima templedo:");
			if(temperatura < 13.5) {
				System.out.print("Oceanico");
			}else if(temperatura <=16.5) {
				System.out.print("Mediterranio");
			}else {
				System.out.print("Continental");
			}

		}else {
			System.out.println("Es clima calido:");
			if(temperatura < 23.5) {
				System.out.print("Ecuatorial");
			}else if(temperatura <=26.5) {
				System.out.print("Tropical");
			}else {
				System.out.print("Desertico");
			}
		}
		
		
	
		
		
		
		
	}

}
