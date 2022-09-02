
public class Ejercicio35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class persona{
String nombre ;
String apellidos;
String documento;
String tipo;
}

class cliente extends persona{
	String categoria;
	String codigo;
	public void generarcodigo() {
		System.out.println("generando codigo");
	}

}


class  empleados extends persona{
	String tipocontrato;
	int sueldo;

public void calcularsueldo() {
	System.out.println("calcular sueldo");
}
}