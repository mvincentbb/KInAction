import kotlinx.coroutines.*



fun main() = runBlocking {
   /* runBlocking {
        println("This is the Main program starting: ${Thread.currentThread().name}")

        GlobalScope.launch {
            println("A  background  work start : ${Thread.currentThread().name} ")
            delay(1000)
            println("the background  work is finished: ${Thread.currentThread().name}")

        }

        delay(2000)
        println("The main program is finished: ${Thread.currentThread().name}")

    }*/

    println("Main program start: ${Thread.currentThread().name}")

    val job:Job = launch(Dispatchers.Default) {
        for(i in 0..500){
            if (!isActive){
                return@launch
            }
            print("$i.")
            Thread.sleep(1)
        }
    }


    delay(10)
    job.cancel()
    println("\nMain program ends: ${Thread.currentThread().name}")

}