
public class Ejercicios36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class empleado{
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + "]";
	}
	
}

class operario extends empleado{
	@Override
	public String toString() {
		return "operario []";
	}
}
class tecnico extends operario{
	@Override
	public String toString() {
		return "tecnico []";
	}
}

class oficial extends operario{
	@Override
	public String toString() {
		return "oficial []";
	}
}




class directivo extends empleado{

	@Override
	public String toString() {
		return "directivo []";
	}
	
}