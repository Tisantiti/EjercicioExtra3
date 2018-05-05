package datos;

public class Sucursal {
	private int numSucursal;
	private String direccion;
	private String cuidad;
	
	
	public Sucursal(int numSucursal, String direccion, String cuidad) {
		super();
		this.numSucursal = numSucursal;
		this.direccion = direccion;
		this.cuidad = cuidad;
	}
	
	public int getNumSucursal() {
		return numSucursal;
	}
	public void setNumSucursal(int numSucursal) {
		this.numSucursal = numSucursal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCuidad() {
		return cuidad;
	}
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	
	public double calcularPaquete(Paquete p) {
		int incremento = 0;
		if(p.getPrioridad().equals("alta"))
		incremento = 10;
		else if(p.getPrioridad().equals("expres"))
		incremento = 20;
		else {
			System.out.println("No has puesto una prioridad correcta");
		}
		
		return p.getPeso() + incremento;
	}

	@Override
	public String toString() {
		return "Sucursal [numSucursal=" + numSucursal + ", direccion=" + direccion + ", cuidad=" + cuidad + "]";
	}
	
}
