
public class Sobremesa extends Ordenador implements CPU {
	
	//atrib
	private String fabricacion;
		
	
	//metodo abstracto de superclase
	final void tipoOrdenador() {
		
		System.out.println(super.getTipo());
	}
	
	//getters
	public String getFabricacion() {
		
		return this.fabricacion;
	}
	
	//setters
	public void setFabricacion(String tienda) {
		
		this.fabricacion = tienda;
	}
	
	//atributos de IF
	
	//Interfaz
	public double frecuencia() {
		return 2.8;
	}
	public 
	
}
