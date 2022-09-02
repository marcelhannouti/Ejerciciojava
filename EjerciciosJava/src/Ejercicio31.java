
public class Ejercicio31 {
	String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
	int numero = (int)11235813213110l;
	 int numero5 = 55;


	public static void main (String[] args){
		Ejercicio31 m = new Ejercicio31();
		m.array();
		m.array2();
		m.array3();
		m.array4();
		m.array5();

	}
	 public void array() {
		 for (int i = 0; i < tecnologies.length; i++) {
			System.out.print(tecnologies[i]+" ");
		}
			System.out.println("");

		 //array();
	 }
	 
	 //2
	 public void array2() {
		 for (int i = 0; i < tecnologies.length; i++) {
			 if(i < 3) {
					System.out.print(tecnologies[i]+" ");
 
			 }
		}
			System.out.println("");
	 }
	 
	 public void array3() {
		 int numero2=100000000;
		if (numero2 > numero) {
			System.out.println("mas grande");
		} else {
			System.out.println("mas pequño");
			numero2=numero2+1000000000;
//		array3();

		} 
	 }
	 public void array4() {
		 String palabra = "supercalifragilisticoespialidoso ";
		 int numero= 32;
		 char[] aCaracteres = palabra.toCharArray();
		 for (int i = 0; i < aCaracteres.length; i++) {
			 for (int j = 0; j < aCaracteres.length; j++) {
				 if (j == numero) {
					System.out.print(aCaracteres[j]);
					numero--;
				}
			}
		}
			System.out.println(" ");
			array4();
	 }
	 
	 public void array5 () {
		 numero5=numero5+30;
		 System.out.println(numero5);
		// array5();
		 
	 }
}
