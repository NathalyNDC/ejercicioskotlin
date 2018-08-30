package exercise4.TallerDeProgramacionAvanzada


fun main(args: Array<String>) {
	val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for(item in week){
    	println("Day: $item ")
    }
    for(index in week.indices) {
    	val day = week[index]
    	println("Day $index = $day")
    }
}