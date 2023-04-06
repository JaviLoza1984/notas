
import java.util.Scanner;
/**
 * Esta clase se encarga de realizar la media de 3 notas introducidas y devolver si ha aprobado o suspendido
 * @author fjavi
 *
 */

public class notas {
	
	/**
	 * Aquí se declaran todas las variables que necesita nuestro programa
	 */
	
	
	double uf1, uf2, uf3;
	double acu4, acu5, acu6, def;
	
	/**
	 * Solicita al usuario las notas a introducir
	 */
	
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * método para introducir las notas del estudiante
	 */
	
	public void IngresaNotas() {
		
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	/**
	 * Método de comprobación de notas
	 */
	
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	
	/**
	 * Este método realiza el calculo de las notas
	 */
	
	
	public void Calculonotas() {
		acu4= uf1*0.35;
		acu5 = uf2 * 0.35;
		acu6 = uf3 * 0.30;
		
		def = acu4 + acu5+ acu6;
		
		
	}
	
	
	/**
	 * Este método imprime las notas  introducidas y calculadas
	 */
	public void Mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu4);
		System.out.println(" acumuado 2 = "+ acu5);
		System.out.println(" acumuado 3 = "+ acu6);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * Este método informa del resultado final obtenido
	 */
	
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendido");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	
	/**
	 * Esta es nuestra función principal 
	 * @param args recibirá los datos de cada uno de los métodos utilizados
	 */
		
	public static void main(String[] args) {
		
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
