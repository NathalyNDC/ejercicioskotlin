package exercise2.TallerDeProgramacionAvanzada

fun factorial(num: Int): Int {
	var fac:Int=1;
	for(i in 1..num) {
		fac *= i;
	}
	return fac;
}

fun main(args: Array<String>) {
	val f = factorial(5);
    println("Factorial: $f")
}