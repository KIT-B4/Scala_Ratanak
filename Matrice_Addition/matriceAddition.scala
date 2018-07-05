object demo {
    def main(args: Array[String]) {
        var firstArray = getFirstArray();
        var secondArray = getSecondArray();
        var additionResult = addMatrice(firstArray,secondArray);
        var i = 0;
        var j = 0;
        for(i <- 0 to 1) {
            for(j <- 0 to 2) {
                print(" "+additionResult(i)(j));
            }
            print("\n");
        }
    }
    def addMatrice(first: Array[Array[Int]], second: Array[Array[Int]]): Array[Array[Int]] = {
        // var firstArray: Array[Array[Int]] = Array(Array(2,52,42),Array(5,63,51));
        // var secondArray: Array[Array[Int]] = Array(Array(23,89,15),Array(12,24,45));
        // var result: Array[Array[Int]] = Array(Array(0,0,0),Array(0,0,0));
        var firstArray = first;
        var secondArray = second;
        var result = Array.ofDim[Int](2,3);
        var i = 0;
        var j = 0;
        for(i <- 0 to 1) {
            for(j <- 0 to 2) {
                result(i)(j) = firstArray(i)(j) + secondArray(i)(j);
            }
        }
        return result;
    }
    def getFirstArray(): Array[Array[Int]] = {
        var i = 0;
        var j = 0;
        var firstArray = Array.ofDim[Int](2,3);
        for(i <- 0 to 1) {
            for(j <- 0 to 2) {
                printf("Enter value for first array[%d][%d]: ",i,j);
                firstArray(i)(j) = scala.io.StdIn.readInt();
            }
        }
        return firstArray;
    }
    def getSecondArray(): Array[Array[Int]] = {
        var i = 0;
        var j = 0;
        var secondArray = Array.ofDim[Int](2,3);
        for(i <- 0 to 1) {
            for(j <- 0 to 2) {
                printf("Enter value for second array[%d][%d]: ",i,j);
                secondArray(i)(j) = scala.io.StdIn.readInt();
            }
        }
        return secondArray;
    }
}