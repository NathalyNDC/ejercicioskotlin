
package p2.p
import java.util.*

 
val week: MutableList<Int> = mutableListOf<Int>()

//val A: MutableList<T> = mutableListOf<T>() error


fun push(elem: Int){
	week.add(0, elem)
}

fun pop(): Int?{ //regresa el elemento
	if(!week.isEmpty()){
		var elem=week[0]
		week.removeAt(0)
		return elem
	}
	else{
		println("No hay elementos\n")
		return null
	}
}

fun top(): Int? { //regresa nel 1er elemento el de la cima
	if(!week.isEmpty()){
		return week.get(0)
	}
	else 
		return null
}

fun ver(){
	if(!week.isEmpty()){
		for(item in week){
	    	println("Elemento: $item ")
	    }
	}
	else
		println("No hay elementos para ver\n")
}
//******************************************************************************************************************************************MENU
fun main(args: Array<String>) {
	var opci:Int=0

	while(opci!=7){
		println("PILA CON NUMEROS ENTEROS")
		println("\n 1-Insertar elemento \n 2-Sacar elemento \n 3-Ver tamaño \n 4-Ver cima \n 5-Vacio? \n 6-Ver elementos \n 7-Salir")
		print("Enter a number: ")
		try {
			opci = readLine()!!.toInt()

	    	when(opci){
	    		1-> {
	    				try {
			    			print("\nElemento (int): ")
							var cant=readLine()!!.toInt()
			    			push(cant)
			    		}
			    		catch (e: NumberFormatException) {
	        				// Log the exception
	        				println("ERROR AL INGRESAR DATOS, solo numeros enteros")
	       					 e.printStackTrace();
	    				}
	    			}
	    		2-> pop()
	    		3-> println(week.size)
	    		4-> println(top())
	    		5-> println(week.isEmpty())
	    		6-> ver()
	    		7-> println("BYE")
	    		else-> println("La opcion debe ser un numero entre 1-7") 
	    	}
	    }
	    catch (e: NumberFormatException) {
	        // Log the exception
	        println("La opcion debe ser un numero entre 1-7")
	       	e.printStackTrace();
	    }
	}
}