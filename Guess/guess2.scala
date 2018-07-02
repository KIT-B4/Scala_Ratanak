object demo {
    def main(args: Array[String]) {
        var x = scala.io.StdIn.readInt();
        guess(x);
    }
    def guess(rootValue: Int): Unit = {
        var sqr = rootValue*rootValue;
        var userInput = scala.io.StdIn.readInt();
        if(userInput != sqr && userInput != sqr+1 && userInput != sqr-1){
            println("Distance: "+(userInput-rootValue));
            guess(rootValue);
        } else {println("Good Boy!");}
    }
}