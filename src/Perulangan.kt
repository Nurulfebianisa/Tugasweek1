fun main(){
    for (index in 1..5 step 2){   //step digunakan untuk melompati angka
        println("nilai $index")
    }

    val myArray = arrayOf(1,2,3,4,5,6,7,8,9)
    println(myArray.toList())

    // cetak nilai array berdasarkan ganjil genapnya
    // looping with for
    for (i in myArray){
        if (i > 5)
            println(i)
    }


    for (i in myArray){
        if(i % 2 == 0) {
            println("$i Genap")  //untuk kondisi Genap
        }else{
            println("$i Ganjil")  //untuk kondisi Ganjil
        }

    }

    // looping with while
    var temp = 0
    while (temp <= 10){
        println("bilangan ke-$temp")
        temp++            //increment
    }

    //looping Do While Loops
    var stoper = 1
    do {
        println("bilangan $stoper")
        stoper++     //stoper diatas while
    }while (stoper < 5)

    // continue
    val mynumber = arrayOf(1,2,3,4,5)
    for (i in mynumber) {
        if (i == 3) {          //kalo && perbandingan kondisi
            println("Skip ads")
            continue        // perintah continue
        }
        println(i)


        // Break   // kondisi ketika if terpenuhi break akan terpenuhi
        val mynumber = arrayOf(1, 2, 3, 4, 5)
        for (i in mynumber) {
            if (i == 0) {  //agar bisa menampilkan skip adsnya saja if(i % 1 ==0) / pake true
                println("Skip ads")
                break
            }
            println(i)
        }
    }
}
