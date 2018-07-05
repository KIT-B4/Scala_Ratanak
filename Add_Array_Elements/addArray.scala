object demo {
    def main(args: Array[String]) {
        print("Enter the size of the array: ");
        var sizeOfArray = scala.io.StdIn.readInt();
        var arr: Array[Int] = new Array(sizeOfArray);
        var result = 0;
        var max = 0;
        var i = 0;
        var j = 0;

        for(i <- 0 to arr.length-1) {
            printf("Enter number for element[%d]: ",i)
            arr(i) = scala.io.StdIn.readInt();
            result += arr(i);
            max = arr(i);
            for(j <- 0 to arr.length-1) {
                if(max > arr(j)) {}
                else { max = arr(j) }
            }
        }
        print("The summation of array is: "+result+"\n");
        println("The maximum number is: " + max);
    }
}