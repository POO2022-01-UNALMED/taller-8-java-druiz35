package futbol;

public class Portero extends Futbolista implements Comparable {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero() {
		super();
		this.golesRecibidos = 289;
		this.dorsal = 7;
	}
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero"); 
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public int compareTo(Futbolista f) {
		return Math.abs(this.golesRecibidos - ((Portero)f).golesRecibidos);
	}
	
	public String toString() {
		String mensaje_1 = ((Futbolista) this).toString();
		return mensaje_1 + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
	}
}
