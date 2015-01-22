object EvenFibonacci{
    def main(args: Array[String]){
        var n = Integer.parseInt(args(0))

        var a:Long = 0
        var b:Long = 1
        var fibo:Array[Long] = new Array[Long](n)

        println("Printing fibonacci series")
        for(i <- 0 until n){
            print(a + " ")
            fibo(i) = a
            var sum = a + b
            a = b
            b = sum
        }

        var evenFibo = for{i <- fibo
                           if i%2 == 0
                          }yield i

        println()
        println("Printing even fibonacci series")
        for(i <- evenFibo){
            print(i + " ")
        }

        println()
    }
}
