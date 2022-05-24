package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion); 
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public int compareTo(Futbolista f) {
		return Math.abs(this.getEdad() - f.getEdad());
	}
	
	
	@Override
	public String toString() {
		String mensaje_1 = ((Futbolista) this).toString();
		return mensaje_1 + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}
}
