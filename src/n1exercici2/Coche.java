package n1exercici2;

public class Coche {

	private static final String marca =  " Peugeot" ; //  static final ha de estar inicializada y su valor no puede cambiar durante la ejecución 
	private static String modelo; // static no es necesario inicializar  si  cambiamos su valor cambiara para todos los objectos
	private final int  potencia ; //  final  no es necesario inicializar una vez instanciado no valor no cambiara a lo largo de la ejecución
	
	
	/*
	 * static y final pueden inicializarse en el constructor
	 * */
	

	public Coche( String modelo, int potencia) {
		
		this.potencia = potencia;
		this.modelo = modelo;
	
	}

	public static void frenar() {
		
		System.out.println(" El vehículo está frenando");
	}
	
	public void acelerar() {
		System.out.println(" El vehículo está acelerando");
		
	}

	
	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	@Override
	public String toString() {
		return " marca: " + marca + ", modelo:  "+modelo + ", potencia: "+potencia;
	}
	
	
	
	
}
