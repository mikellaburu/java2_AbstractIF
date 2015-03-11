import java.util.Scanner;

public class Programa {

	public static void main(String [] args){
		
		int opcion;
		
		do{
			System.out.println("------MENU PRINCIPAL-------");
			System.out.println("1) SOBREMESA");
			System.out.println("2) PORTATIL");
			System.out.println("0) SALIR");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:
					Ordenador pc = new Sobremesa();
					System.out.println("Tipo de ordenador: " );
					pc.tipoOrdenador;
					System.out.println("Donde se ha comprado? " );
					pc.setFabricacion(sc.next());
					System.out.println("Fabricacion: "+pc.getFabricacion());
					System.out.println("\tCPU: " );
					System.out.println("\tFrecuencia: " + pc.frecuencia()+" Mhz");
					System.out.println("\tFrecuencia: " + pc.fabricante());
					System.out.println("\tFrecuencia: " + pc.nucleos());
					break;
					
										
				case 2:
					Ordenador port = new Portatil();
					System.out.println("Tipo de ordenador: " );
					port.tipoOrdenador;
					
					System.out.println("De que marca es? ");
					port.setMarca(sc.next());+" Mhz"
					System.out.println("Que modelo es? ");
					port.setModelo(sc.next());
					System.out.println("Marca: "+port.getMarca);
					System.out.println("Modelo: "+port.getModelo);
					System.out.println("\tCPU: " );
					System.out.println("\tFrecuencia: " + port.frecuencia()+" Mhz");
					System.out.println("\tFrecuencia: " + port.fabricante());
					System.out.println("\tFrecuencia: " + port.nucleos());
					break;
			
				default:
					System.out.println("Opcion incorrecta");
					break;
			}
			
		}while (opcion!=0);
	}
}
