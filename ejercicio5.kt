package exercise5.TallerDeProgramacionAvanzada


fun main(args: Array<String>) {
	val Antonio_DaysOfWord: MutableSet<String> = mutableSetOf<String>("Monday", "Wednesday", "Friday", "Sunday")
	val Luisa_DaysOfWord: MutableSet<String> = mutableSetOf<String>("Tuesday", "Thursday",  "Saturday", "Sunday")

    for(item in Antonio_DaysOfWord){
    	println("Días en que trabaja Antonio: $item ")
    }
    println("***********")
    for(item in Luisa_DaysOfWord){
    	println("Días en que trabaja Luisa: $item ")
    }
    println("***********")

    var operation = Antonio_DaysOfWord.union(Luisa_DaysOfWord)
    for(item in operation){
    	println("Días que cubren Antonio y/o Luisa: $item ")
    }
    println("***********")

    operation = Antonio_DaysOfWord.intersect(Luisa_DaysOfWord)
    for(item in operation){
    	println("Días que Antonio y Luisa coinciden: $item ")
    }
    println("***********")

    operation = Antonio_DaysOfWord.subtract(Luisa_DaysOfWord)
    for(item in operation){
    	println("Días que Antonio trabaja y Luisa descansa: $item ")
    }
    println("***********")

    operation = Luisa_DaysOfWord.subtract(Antonio_DaysOfWord)
    for(item in operation){
    	println("Días que Luisa trabaja y Antonio descansa: $item ")
    }
}