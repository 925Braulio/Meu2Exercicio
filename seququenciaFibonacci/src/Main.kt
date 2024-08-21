//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite um numero qualquer: ")
    var number = readLine()?.toInt()
        if(number!! < 0 ){
            println("Insira numeros positivos")
        }
    println("O $number-esimo termo da sequencia de fibonacci e: ${fibonacci(number!!)}")
}
fun fibonacci(number: Int): Int{
    if(number == 0){
        return 0
    }
    if(number == 1){
        return 1
    }
    return (number-1)+(number-2)
}