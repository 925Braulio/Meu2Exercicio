//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Quantos numeros pretende digitar: ")
    var number = readLine()?.toInt()
    var list = mutableListOf<Int>()
    for(i in 1..number!!) {
        println("Digite o ${i}º numero: ")
        val myNumber = readLine()?.toInt()
        if (myNumber != null) {
            list.add(myNumber!!)
        }
    }
    println("Os numeros digitados sao: $list")
    println("Os numeros nao repitidos na sequencia dos numeros digitados: " +
            "/n ${numeroRepitidos(list)}")
}
fun numeroRepitidos(list: List<Int>): List<Int>{
    val frequencia = mutableMapOf<Int,Int>()
    for(i in list){
        frequencia [i] = (frequencia[i] ?:0)+1
    }
    val numeroUnicos = list.filter {i -> frequencia[i] ==1 }
    return numeroUnicos
}

