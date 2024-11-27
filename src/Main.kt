fun main() {

    val tempoInicial = System.currentTimeMillis()

    println("Digite a frase a ser cifrada: ")
    var textoNr = readln()
    var sbDesc = StringBuilder()
    var sbCf = StringBuilder()
    for (i in 0..textoNr.length - 1){
        sbCf.append(textoNr[i] + 4).toString()
    }

    println("Texto cifrado: %s".format(sbCf))

    for (i in 0..sbCf.length - 1){
        sbDesc.append(sbCf[i] - 4).toString()
    }

    println("Texto descifrado: %s".format(sbDesc))

    val tempoFinal = System.currentTimeMillis()

    println("Tempo de execução do programa: %s ms".format(tempoFinal - tempoInicial))
}                               //PABLO VALENTE NETO