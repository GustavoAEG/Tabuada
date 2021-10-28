fun main(args: Array<String>) {



    var x = 0
    val repetir = 1
    var resultado =0


    println("Informe uma valo pra taboada")
    x = readLine()!!.toInt()
    /*

       for (repetir in 1..10) {


           resultado = repetir*x
           println("$repetir x $x = $resultado")
       }
       */



    if (x%2==0) {

        println("par")
    }else if(x%2==1){

        println("impar")
    }




}