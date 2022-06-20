import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(args: Array<String>){
    runBlocking {
        println("This is the Main program starting: ${Thread.currentThread().name}")

        GlobalScope.launch {
            println("A  background  work start : ${Thread.currentThread().name} ")
            delay(1000)
            println("the background  work is finished: ${Thread.currentThread().name}")

        }

        delay(2000)
        println("The main program is finished: ${Thread.currentThread().name}")

    }

}