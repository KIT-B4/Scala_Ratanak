object Demo {
    def main(args: Array[String]) {
        var square = (x:Int) => x*x;
        var squareRoot = (y:Int) => scala.math.sqrt(y);
        println(square(5));
        println(squareRoot(25));
    }
}