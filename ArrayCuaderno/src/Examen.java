
// TODO: Auto-generated Javadoc
/**
 * The Class Examen.
 */
public class Examen {
	
	/**
	 * The Enum TipoExamen.
	 */
	public enum TipoExamen {
		
		/** The normal. */
		NORMAL(0,10), 
 /** The eso. */
 ESO(1,10),
/** The test20. */
TEST20(0,20), 
 /** The test100. */
 TEST100(0,100);
		
		/** The min. */
		public final int MIN;
		
		/** The max. */
		public final int MAX;
		
		/**
		 * Instantiates a new tipo examen.
		 *
		 * @param min the min
		 * @param max the max
		 */
		private TipoExamen(int min, int max) {
			this.MIN = min;
			this.MAX = max;
		}
	}
	
	/** The notas. */
	private double[] notas;
	
	/** The tipo. */
	private TipoExamen tipo;

	/**
	 * Instantiates a new examen.
	 *
	 * @param notas the notas
	 */
	// Constructores
	public Examen(double[] notas) {
		this(notas,TipoExamen.NORMAL);
	}
	
	/**
	 * Instantiates a new examen.
	 *
	 * @param notas the notas
	 * @param tipo the tipo
	 */
	public Examen(double[] notas, TipoExamen tipo) {
		this.notas = notas;
		this.tipo = tipo;
	}
	
	// Métodos de clase

	
	// Métodos de instancia
	
	/**
	 * Gets the nota media.
	 *
	 * @return the nota media
	 */
	public double getNotaMedia() {
		int total = 0;
		for(double nota:notas) {
			total += nota;
		}
		return (double) total/notas.length;
	}
	
	/**
	 * Gets the notas ponderadas.
	 *
	 * @return the notas ponderadas
	 */
	public double[] getNotasPonderadas() {
		double[] notasPonderadas = new double[this.notas.length];
		for(int i = 0; i < notasPonderadas.length; i++) {
			notasPonderadas[i] = this.notas[i]*10/this.tipo.MAX;
		}
		return notasPonderadas;
	}
	
	/**
	 * Gets the notas ponderadas enteras.
	 *
	 * @return the notas ponderadas enteras
	 */
	public int[] getNotasPonderadasEnteras() {
		int[] notasPonderadasEnteras = new int[this.notas.length];
		double[] notasPonderadas = this.getNotasPonderadas();
		for (int i = 0; i < notasPonderadasEnteras.length; i++) {
			notasPonderadasEnteras[i] = (int) Math.round(notasPonderadas[i]);
		}
		return notasPonderadasEnteras;
	}
	
	/**
	 * Gets the notas.
	 *
	 * @return the notas
	 */
	// Setter & Getters
	public double[] getNotas() {
		return notas;
	}

	/**
	 * Sets the notas.
	 *
	 * @param notas the new notas
	 */
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	/**
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public TipoExamen getTipo() {
		return tipo;
	}

	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(TipoExamen tipo) {
		this.tipo = tipo;
	}
}
