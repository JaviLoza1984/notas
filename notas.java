
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
	
	
	double uf4, uf5, uf6;
	double acu1, acu2, acu3, def;
	
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
		
		uf4= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf5= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf6= entrada.nextDouble();
		
	
	}
	
	/**
	 * Método de comprobación de notas
	 */
	
	
	public void comprobarcion(){
		
		if (uf4>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf5>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf6>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	
	/**
	 * Este método realiza el calculo de las notas
	 */
	
	
	public void Calculonotas() {
		acu1= uf4*0.35;
		acu2 = uf5 * 0.35;
		acu3 = uf6 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		
	}
	
	
	/**
	 * Este método imprime las notas  introducidas y calculadas
	 */
	public void Mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf4);
		System.out.println(" nota2 = " + uf5);
		System.out.println(" nota3 = " + uf6);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
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
