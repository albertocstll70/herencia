package n1exercici2;

public class MainExercici2 {

	public static void main(String[] args) {
	
		
		Coche coche1 = new Coche( "208",1200);
		Coche coche2 = new Coche( "308",1200);
		
		
		Coche.setModelo("207"); //coche1.setModelo("207")  como la variable modelo es static podemos modificala utilizado el nombre de la clase, al ser static el valor cambiara para todos los objectos 
		//coche1.setModelo("207")  tambien haria lo mismo que el anterior
	
		System.out.println(coche1);
		System.out.println(coche2);
		
		
		// no static
		coche1.acelerar();// El método no static para llamarlo tengo utilizar el nombre del objecto que he creado en este caso coche1
		
		// static
		Coche.frenar();// El método static lo puedo llamar utilizando el nombre de la clase 

	}

}
