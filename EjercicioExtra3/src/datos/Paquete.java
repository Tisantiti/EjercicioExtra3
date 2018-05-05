package datos;

public class Paquete {
	private int numReferencia;
	private String dni;
	private double peso;
	private String prioridad;
	
	
	
	public Paquete(int numReferencia, String dni, double peso, String prioridad) {
		super();
		this.numReferencia = numReferencia;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}
	
	public int getNumReferencia() {
		return numReferencia;
	}
	public void setNumReferencia(int numReferencia) {
		this.numReferencia = numReferencia;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	public void modificarPeso(int pesoNuevo) {
		peso = pesoNuevo;
	}
	
	public void modificarPrioridad(String prioridadNueva) {
		prioridad = prioridadNueva;
	}

	@Override
	public String toString() {
		return "Paquete [numReferencia=" + numReferencia + ", dni=" + dni + ", peso=" + peso + ", prioridad="
				+ prioridad + "]";
	}
	
}
