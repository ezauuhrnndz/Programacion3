package TicTacToe;

public class LogicaTicTacToe {
	
	String []tablero = {" "," "," ",
					    " "," "," ",
					    " "," "," "};
	
	String turnoActual = "X";
	int puntajeX = 0;
	int puntajeO = 0;

//	METODO PARA HACER UNA JUGADA
	public boolean hacerJugada(int posicion) {

	    if (tablero[posicion].equals(" ")) {

	        tablero[posicion] = turnoActual;

	        return true;
	    }

	    return false;
	}
	
//	METODO PARA CAMBIAR TURNO DE JUGADOR
	public void cambiarTurno() {
		
		if (turnoActual.equals("X")) {
			turnoActual = "O";
		} else {
			turnoActual = "X";
		}
	}
	
//	METODO PARA REINICIAR EL TABLERO
	public void reiniciarTablero() {
		
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = " ";
		}
		turnoActual = "X";
	}
	
//	METODO PARA PREGUNTAR SI HAY GANADOR
	public boolean preguntarGanador() {
		
		int[][] combinaciones = {
			{0, 1, 2},
			{3, 4, 5},
			{6, 7, 8},
			{0, 3, 6},
			{1, 4, 7},
			{2, 5, 8},
			{0, 4, 8},
			{2, 4, 6}
		};
		
		for (int[] combo : combinaciones) {
			if (!tablero[combo[0]].equals(" ") &&
				tablero[combo[0]].equals(tablero[combo[1]]) &&
				tablero[combo[1]].equals(tablero[combo[2]])) {
				return true;
			}
		}
		
		return false;
	}
	
//	METODO PARA INDICAR QUIEN GANO
	public String ganador() {
		
		if (preguntarGanador()) {
			if (turnoActual.equals("X")) {
				puntajeX++;
			} else {
				puntajeO++;
			}
			return turnoActual;
		}
		
		return null;
	}
	
//	METODO PARA SABER SI HAY EMPATE
	public boolean empate() {
		
		for (String casilla : tablero) {
			if (casilla.equals(" ")) {
				return false;
			}
		}
		
		return !preguntarGanador();
	}
	
}