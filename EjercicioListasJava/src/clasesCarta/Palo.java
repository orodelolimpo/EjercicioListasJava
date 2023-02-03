package clasesCarta;

public enum Palo {
	TREBOLES ("Treboles"),DIAMANTES ("Diamantes"),CORAZONES ("Corazones"), PICAS ("Picas") ;
	private String nombre;
	
	Palo(String nombre){
		this.nombre=nombre;
		
	}

	public String getNombre() {
		return nombre;
	}


	public static Palo getNombre(String nombre) {
		switch(nombre.toLowerCase()) {
		case "Treboles": return TREBOLES;
		case "Diamantes": return DIAMANTES;
		case "Corazones": return CORAZONES;
		default : return PICAS;
		
		}
	}
	
}
