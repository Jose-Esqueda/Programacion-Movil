/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    //1. DECLARAR DISTINTAS VARIABLES DE LOS SIGUIENTES TIPOS: STRING, INT, BOOLEAN, DOUBLE.
    var texto: String = "Hola";
    var entero: Int = 45;
    var booleano: Boolean = true;
    var doble: Double = 23.4;
    //2. CONCATENAR DOS VARIABLES DE TIPO STRING USANDO INTERPOLACION DE STRINGS
    var varible1 = "Buenos dias"
    var variable2 = "Buenas noches"
    println("$varible1 y $variable2")
    //3. DECLARAR Y ASIGNAR VARIABLE DE TIPO INT, USAR IF PARA VALIDAR SI LA VARIABLE ES > 18 ENTONCES IMPRIMIR "MAYOR DE EDAD" 
    //DESPUES USAR ELSE IF PARA VALIDAR SI LA VARIABLE ES > 0 ENTONCES IMPRIMIR "MENOR DE EDAD" Y POR ULTIMO USAR ELSE PARA IMPRIMIR "ERROR"
    var dato = -17
    if(dato > 18){
        println("Mayor de edad")
    }
    else if(dato > 0){
        println("Menor de edad")
    }
    else
    {
        println("Error")
    }
    //4. USAR CICLO FOR PARA IMPRIMIR 35 VECES LA CONCATENACION DEL PUNTO 2
    for(i in 1..35){
        println("$varible1 y $variable2")
    }
    //5. DCLARAR Y ASIGNAR VARIABLE INT, USAR CICLO WHILE PARA SEGUIR ITERANDO SIEMPRE Y CUANDO LA VARIABLE SEA > 10, DENTRO DEL CICLO, 
    //GENERAR Y ASIGNAR UN VALOR RANDOM USANDO .RANDOM() DE LOS RANGOS DE NUMEROS 0..99
	var itInWhile = 11
    while(itInWhile > 10){
        itInWhile = (0..99).random()
        println(itInWhile)
    }
    //6. HACER UN EJEMPLO DEL USO DE SAFE CALL (NULL SAFETY EN KOTLIN)
    var word: String? = null;
    println(word?.length)
    //7. HACER UN EJEMPLO DEL USO DE DOUBLE BANG (NULL SAFETY EN KOTLIN)
    val word2 = texto!!.length
    println(word2)
    //8. DECLARAR Y ASIGNAR DOS VARIABLES INT, LA SEGUNDA QUE SEA = 0, DESPUES DIVIDIR LA PRIMER VARIABLE ENTRE LA SEGUNDA Y 
    //CACHAR EL ERROR QUE SE PRODUCE USANDO TRY Y CATCH, EN CATCH IMPRIMIR "ERROR: DIVISION ENTRE CERO"
    try{
        val valor1 = 5;
        val valor2 = 0;
        val operacion = valor1/valor2;        
    }
    catch(e: ArithmeticException){
        println("ERROR: DIVISION ENTRE CERO")
    }
    //9. HACER UN EJEMPLO DEL USO DEL OPERADOR ELVIS ?:
    var value: String? = null;
    var Elvis = value ?: "sin valor"
    println(Elvis);
	//10. CREAR UNA LISTA INMUTABLE DE 5 NOMBRES (STRINGS)
	val list= listOf("Jose","Adrian", "Gustavo", "Juan", "Carlos")
    println(list)
    //11. CREAR UNA LISTA MUTABLE DE 5 NUMEROS (INTS), AGREGAR 2 ELEMENTOS Y POR ULTIMO BORRAR 1 ELEMENTO
    var listaVacia = mutableListOf<Int>(1,2,3,4,5);
    println(listaVacia)
    listaVacia.add(6)
    listaVacia.add(7)
    println(listaVacia)
    listaVacia.removeAt(0)
    println(listaVacia)
    //12. ORDENAR EN REVERSA EL LISTADO MUTABLE DE LOS 5 NUMEROS E IMPRIMIRLA.
	listaVacia = listaVacia.asReversed()
    println(listaVacia)
    //13. CREAR UN MAP.
    val mapp = mapOf(1 to "Jose", 2 to "Jesus", 3 to "Juan")
    println(mapp)
	//14. CREAR UN SET.
	val set1 = setOf(1,2,3,4,5,6)
    println(set1)
    //15. CREAR UNA VARIABLE LA CUAL RECIBA DOS PARAMETROS (NOMBRE: STRING Y EDAD: INT), RETORNAR UN STRING, 
    //EL CONTENIDO DE LA FUNCION UTILIZARA EL IF, ELSE IF Y ELSE DEL PUNTO 3, DONDE DEVOLVEREMOS UN MENSAJE 
    //(STRING) AGREGANDO EL PARAMETRO NOMBRE USANDO INTERPOLACION DE STRINGS. EJEMPLOS DE RETORNO: 
    //"EL USUARIO JESUS ES MAYOR DE EDAD", "EL USUARIO JOSE ES MENOR DE EDAD", "ERROR" (SI LA EDAD ES 0 O MENOS)
    fun funcion(nombre: String = "Usuario", edad: Int = 19): String{
        if(edad > 18){
        	return  "El usuario $nombre es mayor de edad"
    	}
    	else if(edad > 0){
        	return "El usuario $nombre es menor de edad"
    	}
    	else
    	{
        	return "Error"
    	}
    }
    //16. LLAMAR LA FUNCION ANTERIOR 5 VECES CON DISTINTOS VALORES EN LOS PARAMETROS.
    println(funcion("Jose", 27))
    println(funcion("Jesus", 10))
    println(funcion("Carlos", 18))
    println(funcion("Juan", -2))
    println(funcion("Daniel", 56))
	//17. HACER USO DE PARAMETROS POR DEFAULT EN LOS PARAMETROS DE LA FUNCION DEL PUNTO 15.
	println(funcion())
    
}