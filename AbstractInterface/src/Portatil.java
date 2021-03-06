
public final class Portatil extends Ordenador implements CPU{
	
	//atrib
	private String marca;
	private String modelo;
	
	//metodo abstracto en superclase
	final void tipoOrdenador() {
		
		System.out.println(super.getTipo());
	}
	
	//getters
	public String getMarca() {
			
		return this.marca;
	}
	public String getModelo() {
		
		return this.modelo;
	}
		
	//setters
	public void setMarca(String fabricante) {
			
		this.marca = fabricante;
	}
	public void setModelo(String referenciaModelo) {
		
		this.modelo = referenciaModelo;
	}
	
	//metodos Interfaces
	public abstract double frecuencia() {
		return 2,5;
	}
	public abstract String fabricante() {
		return "intel";
	}
	public abstract int nucleos() {
		return 6;
	}
	
}
