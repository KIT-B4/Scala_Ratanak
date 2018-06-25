object demo{
    def main(args: Array[String]): Unit = {
        var cl: List[Int] = createList();
        printListWithoutLast(cl);
    }
    def createList(): List[Int] = {
        var firstList: List[Int] = List(12,14,5213,123);
        return firstList;
    }
    def printListWithoutLast(cl: List[Int]) {
        // var i = 0;
        // for(i <- 0 to cl.length-2) {
        //     println(cl(i));
        // }
        println(cl.init);
    }
}