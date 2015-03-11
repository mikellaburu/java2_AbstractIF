
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
	
	//metodos Interfaces
	public abstract double frecuencia() {
		return 3,2;
	}
	public abstract String fabricante() {
		return "amd";
	}
	public abstract int nucleos() {
		return 4;
	}
	
}
