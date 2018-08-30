package p1.p
import java.util.*

/************************************COLAS**********************************************************************************/

 
var Acciones: Queue<Int> = LinkedList()
var Costos: Queue<Int> = LinkedList()
//var Edo: Queue<String> = LinkedList()
var Gan: Int = 0
var lin = 0

/************************************************COMPRA**********************************************************************/
fun compra(a:Int, c:Int){
	if(Acciones.peek()==null){
		//Edo.add(lin)
		Acciones.add(a) 
		Costos.add(c)
	}
	else{
		//Edo.add(lin)
		Acciones.add(a) 
		Costos.add(c)
	}
	lin++

}
/**************************************************VENTA********************************************************************/
fun venta(aa:Int, c:Int){
var a=aa
	var resu=comprobar(a)
	if(resu=="no"){
		println("NO EXISTEN ACCIONES SUFICIENTES PARA VENDER")
	}
	else{
		while(a!=0){
			if(Acciones.peek()==a){
				a=0
				Gan+= (c-Costos.peek()) * Acciones.peek()
				Acciones.remove()
				Costos.remove()
				lin--
			}
			else if(Acciones.peek()>a){
				var moo=1
				for(x in 0..lin-1){
					if(moo==1){
						Gan+= (c-Costos.peek()) * a
	        			Acciones.add(Acciones.remove()-a)
	        			a=0
	        			Costos.add(Costos.remove())
					}
					moo++
					Acciones.add(Acciones.remove())
	        		Costos.add(Costos.remove())
				}
			}
			else{
				a-=Acciones.peek()
				Gan+= (c-Costos.peek()) * Acciones.peek()
				Acciones.remove()
				Costos.remove()
				lin--
			}
		}
		println("Ganancia $Gan")
	}
}

/**************************************************COMPROBAR********************************************************************/
fun comprobar(a:Int): String {
	var tot=0
	for(x in 0..lin-1){
		tot+=Acciones.peek()
		Acciones.add(Acciones.remove())
		Costos.add(Costos.remove())
	}
	if(tot>=a){
		println("Acciones restantes: ${tot-a}")
		return("si")
	}
	else{
		return("no")
	}
}


/***************************************************MENU*******************************************************************/
fun main(args: Array<String>) {

	var opci:Int=0
	while(opci!=4){
		println(" 1-Comprar accion \n 2-Vender accion \n 3-Ver compras \n 4-Salir")
		print("Enter a number: ")
		opci = readLine()!!.toInt()
    	
		

    	when(opci){
    		1-> {
    			print("\nCantidad de acciones: ")
				var cant=readLine()!!.toInt()

				print("Precio de acciones: ")
				val prec=readLine()!!.toInt()
    			compra(cant, prec)
    			}
    		2-> {
    		if(lin>0){
    			print("\nCantidad de acciones: ")
				var cant=readLine()!!.toInt()

				print("Precio de acciones: ")
				val prec=readLine()!!.toInt()
    			venta(cant, prec)
    		}
    		else
    			println("No hay acciones compradas")
    			}
    		3-> {
    				
    				if(lin>0)
	    			for(/*!Edo.isEmpty() && !Acciones.isEmpty() && !Costos.isEmpty()*/x in 0..lin-1){
	        			//The remove() method takes an item from the Queue and returns it
	        			//var ed: String = Edo.remove()
	        			var ac: Int = Acciones.remove()
	        			var co: Int = Costos.remove()
	        			//Edo.add(ed)
	        			Acciones.add(ac)
	        			Costos.add(co)
	        			println(/*"Edo => " +ed+*/" Acciones=> "+ac+" Precio=> "+co)
	   				}
	   				else
	   					println("No hay elementos\n")
    			}
    		4-> println("BYE")
    		else-> println("error \n")
    	}


	}

}

/*
1-Se deben comprar acciones para poder vender
2-no se puede vender mas de lo que se compró
3-si se puede vender menos de lo que se compró
4-La ganancia es acumulativa
*/