//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val password = "1234"
    do {
        println("Insirea uma senha: ")
            val myPassword: String? = readLine()?.toString()
                if (myPassword != password) {
                    println("Senha invalida!!")
                }
                else {
                    println("Senha correta!! validada com sucesso.github")
                }
    }while(myPassword != password)

}