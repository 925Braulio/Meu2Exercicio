fun main(){
    println("OS  numeros primos no intervalo de 0 a 100 sao:")
    for ( n in 0..100){
        if((n % 2 != 0) && (n % 3 != 0) && (n % 5 != 0)){
            println(n)
        }
    }
}