//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var number = listOf(Int)
    println("Informe a quantidade de numeros quer inserir")
        val amount: Int? = readLine()?.toInt()
            val listNumber = mutableListOf<Int>()
                for(n in 1..amount!!){
                    println("Digite o numero na posicao $n")
                    val myNumber = readLine()?.toInt()
                    if(listNumber != null ){
                        if (myNumber != null) {
                            listNumber.add(myNumber)
                        }
                    }
                }
    val Avarege = calculateAvarege(listNumber)
    println("A media entre os numeros e: $Avarege")
}
fun calculateAvarege(listNumber: List<Int>): Int{
    val sum = listNumber.sum()
    val amount = listNumber.size
    return sum/amount
}

