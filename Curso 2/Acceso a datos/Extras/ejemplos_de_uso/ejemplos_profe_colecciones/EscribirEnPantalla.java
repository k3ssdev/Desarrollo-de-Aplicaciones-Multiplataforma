package ejemplos_de_uso.ejemplos_profe_colecciones;

import java.util.function.Consumer;

public class EscribirEnPantalla implements Consumer<Alumno> {

	@Override
	public void accept(Alumno t) {
		System.out.println(t);
	}

}