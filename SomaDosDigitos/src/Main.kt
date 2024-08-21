//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Insira um numero com dois ou mais digitos:")
    var input = readLine()?: return
        var somaDigitos = 0
    for (i in input){
        if(i.isDigit()){
            somaDigitos += i.toString().toInt()
        }
    }
    println("A soma dos digitos do numero $input e: $somaDigitos")
}