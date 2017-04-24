
// TODO: Auto-generated Javadoc
/**
 * The Class Cuaderno.
 */
public class Cuaderno {
	
	/** The Constant NUMERO_MAX_EXAMENES. */
	// Variables de Clase
	public static final int NUMERO_MAX_EXAMENES = 15;
	
	/** The grupo. */
	// Variables de instancia
	private String grupo;
	
	/** The asignatura. */
	private String asignatura;
	
	/** The alumnos. */
	private String[] alumnos;
	
	/** The examenes. */
	private Examen[] examenes;
	
	/** The numero examen actual. */
	private int numeroExamenActual;

	/**
	 * Instantiates a new cuaderno.
	 *
	 * @param grupo the grupo
	 * @param asignatura the asignatura
	 * @param alumnos the alumnos
	 */
	// Constructores
	public Cuaderno(String grupo, String asignatura, String[] alumnos) {
		this.grupo = grupo;
		this.asignatura = asignatura;
		this.alumnos = alumnos;
		this.examenes = new Examen[NUMERO_MAX_EXAMENES];
		this.numeroExamenActual = 0;
	}
	
	/**
	 * Gets the notas medias.
	 *
	 * @return the notas medias
	 */
	// Métodos de instancia 
	public double[] getNotasMedias() {
		double[] notasMedias = new double[this.alumnos.length];
		double[] notasExamen;
		for(int i=0;i<this.numeroExamenActual;i++) {
			notasExamen = this.examenes[i].getNotasPonderadas();
			for (int j = 0; j < notasMedias.length; j++) {
				notasMedias[j]+= notasExamen[j];
			}
		}
		int numeroExamenes = this.numeroExamenActual;
		for (int i = 0; i < notasMedias.length; i++) {
			notasMedias[i] = notasMedias[i]/numeroExamenes;
		}
		return notasMedias;
	}

	/**
	 * Adds the examen.
	 *
	 * @param examen the examen
	 * @return true, if successful
	 */
	public boolean addExamen(Examen examen) {
		boolean addOK = true;
		if(numeroExamenActual<NUMERO_MAX_EXAMENES)
			this.examenes[this.numeroExamenActual++] = examen;
		else
			addOK = false;
		return addOK;
			
	}
	
	/**
	 * Sets the examen.
	 *
	 * @param examen the examen
	 * @param indice the indice
	 * @return true, if successful
	 */
	public boolean setExamen(Examen examen, int indice) {
		boolean setOK = true;
		if(indice>-1 && indice<NUMERO_MAX_EXAMENES)
			this.examenes[indice] = examen;
		else setOK = false;
		return setOK;
	}

	/**
	 * Gets the examenes.
	 *
	 * @return the examenes
	 */
	public Examen[] getExamenes() {
		return examenes;
	}

	/**
	 * Gets the grupo.
	 *
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * Gets the asignatura.
	 *
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * Gets the alumnos.
	 *
	 * @return the alumnos
	 */
	public String[] getAlumnos() {
		return alumnos;
	}

	/**
	 * Gets the numero examen actual.
	 *
	 * @return the numero examen actual
	 */
	public int getNumeroExamenActual() {
		return numeroExamenActual;
	}

	/**
	 * Gets the numero alumnos.
	 *
	 * @return the numero alumnos
	 */
	public int getNumeroAlumnos() {
		return this.alumnos.length;
	}
}

