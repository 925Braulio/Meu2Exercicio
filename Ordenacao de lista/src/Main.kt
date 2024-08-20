//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Informe a quantidade de numeros que pretende escrever: ")
         val amount = readLine()?.toInt()
            val listNumber = mutableListOf<Int>()
                for(n  in 1..amount!!){
                    println("Digite o numero na posicao $n")
                        val myNumber = readLine()?.toInt()
                            if (myNumber != null){
                                listNumber.add(myNumber)
                            }
                }
    println("Lista de numeros digitados:")
        println(listNumber)
            listNumber.sort()
                println("Numeros ordenados:")
                    println(listNumber)


}