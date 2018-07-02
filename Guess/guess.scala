object Demo {
    def main(args: Array[String]) {
        var x = scala.io.StdIn.readInt();
        var boo = true;
        var squareX = x*x;
        while (boo == true){
            var rx = guess(x);
            if ( rx != squareX && rx != squareX-1 && rx != squareX+1) {println(rx-x);}
            else {println("Good boy!");
                boo = false;
            }
        }
    }
    def guess(x: Int): Int = { 
        var n = scala.io.StdIn.readInt();
        return n;
    }
}