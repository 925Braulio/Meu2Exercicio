//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Insira uma palavra qualquer:")
    var input = readLine()?: return
    var numeroDeVogais = contarVogais(input)
    println("O numero de vogais contidos na palavra $input e: $numeroDeVogais")

}
fun contarVogais(palavra: String): Int{
    var vogais = setOf('a','e','i','o','u','A','E','I','O','U')
    var retorno =
    return palavra.count { it in vogais }
}