package exercise3.TallerDeProgramacionAvanzada

fun romano(num: Int): String {
	/*

	La estructura when remplaza a la estructura switch de java, su sintaxis se escribe de la siguiente manera:
	when(valor) {
	   constante1 -> expresión
	   constante2 -> { expresiones }
	   ... etc
	   else -> expresión
	}

	Si todas las opciones están incluidas en los casos, entonces el caso "else" no es mandatorio.

	*/
	when(num) {
		1 -> return "I"
		2 -> return "II"
		3 -> return "III"
		4 -> return "IV"
		5 -> return "V"
		6 -> return "VI"
		7 -> return "VII"
		8 -> return "VIII"
		9 -> return "IX"
		10 -> return "X"
		else -> return "-"
	}
}

fun main(args: Array<String>) {
	
    for(item in 0..10){
    	val r = romano(item);
    	println("Romano de $item es $r")
    }
}