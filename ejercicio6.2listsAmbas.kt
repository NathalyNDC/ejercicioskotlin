package exercise4.TallerDeProgramacionAvanzada


fun main(args: Array<String>) {
	val week: MutableList<String> = mutableListOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for(item in week){
    	println("Day: $item ")
    }
    for(index in week.indices) {
    	val day = week[index]
    	println("Day $index = $day")
    }

	val semana = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for(item in semana){
    	println("Day: $item ")
    }
    for(index in semana.indices) {
    	val day = semana[index]
    	println("Day $index = $day")
    }

    week[0] = "Lunes" //No marca error porque es mutable
    println("Day ${week.indexOf("Lunes")}= ${week[0]}")

   // semana[0] = "Lunes" //marca error porque es estático el arreglo


    var operation = semana.intersect(week)
    print("Dias")
    for(item in operation){
        print(item)
        print(" ")
    }

    println(week.size)
    println(week.isEmpty())
}