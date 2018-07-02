object Demo {
    def main(args: Array[String]) {
        println("Insert first value: ");
        var x = scala.io.StdIn.readInt();
        println("Insert second value: ");
        var y = scala.io.StdIn.readInt();
        var sumOfSquare = (x: Int, y: Int) => x*x + y*y;
        println("The sum of both square is: " + sumOfSquare(x,y));
    }
}