import java.util.*;
fun main (args : Array <String>){
    var data: Boolean =true
    if(data == true)
        scanner()
    else
        println("gagal memulai")
}
fun scanner () {
    // membuat scanner
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    println(n)
}