
import kotlin.text.Regex
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite uma palavra: ")
    var palavra = readLine()?.toString()
    if(verficacsoPalindrome(palavra!!) == true){
        println("A palavra $palavra e um palindromo.!")
    }
    else{
        println("A palavra palavra nao e um palindromo.!")
    }

}
fun verficacsoPalindrome(palavra: String): Boolean{
    val patern = Regex("\\W_")
    val limpaString = patern.replace(palavra,"")
    return limpaString.toLowerCase()== limpaString.reversed()
}