package n1exercici1;

public abstract class  Instrumento {
	
	private String nombre;
	private int precio;
	
	public Instrumento(String nombre, int precio){
		this.nombre = nombre;
		this.precio = precio;
		
	}

	static {
		// cada vez que ejecutemos el main se mostrará   los sguiente,
		// la clase main es static,  
		System.out.println(" static block");
	}
	public abstract void  tocar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Instrumento: " + nombre + ", precio=" + precio + " ";
	}
	
	
	
	

}
