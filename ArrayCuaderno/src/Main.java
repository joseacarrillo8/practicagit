
// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = {5.50, 17, 13.75, 16.25};
		Examen e1 = new Examen(notas,Examen.TipoExamen.TEST20);
		double[] ponderadaExamen1 = e1.getNotasPonderadas();

		notas = new double[]{1,2,3,4};
		Examen e2 = new Examen(notas);
		double[] ponderadaExamen2 = e2.getNotasPonderadas();

		for (int i = 0; i < ponderadaExamen2.length; i++) {
			System.out.printf("%.02f %.02f%n",ponderadaExamen1[i],ponderadaExamen2[i]);
		}
		
		double[] medias = new double[4];
		for (int i = 0; i < notas.length; i++) {
			medias[i] = (ponderadaExamen1[i]+ponderadaExamen2[i])/2;
			System.out.println(medias[i]);
			
		}
	}

}
