import java.util.Random;

public class Ejecicio15 {
	public static void main (String[] args){
int num1 = 2;
int num2= 5555247;
int result = num2 % num1;

if (result == 0) {
	System.out.println("es par");
}else {
	System.out.println("es impar");
}
	


//2

Random random = new Random();
boolean respuesta =random.nextBoolean();
if(respuesta == true) {
	System.out.println("blanco");
}else {
	System.out.println("negro");

}
	}

}
