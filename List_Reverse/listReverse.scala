object demo { 
    def main(args: Array[String]): Unit = {
        var cl: List[Int] = createLists();
        var rl: List[Int] = getReverseList(cl);
        getOddValues(rl);
    }
    def createLists(): List[Int] = {
        var firstList: List[Int] = List(25,17,12);
        var secondList: List[Int] = List(44,2,6,77);
        var totalList: List[Int] = firstList ::: secondList;
        return totalList;
    }
    def getReverseList(cl: List[Int]): List[Int] = {
        var reverseList: List[Int] = cl.reverse;
        return reverseList;
    }
    def getOddValues(reverseList: List[Int]): Unit = {
        var i = 0;
        for(i <- 0 to reverseList.length-1) {
            if(reverseList(i)%2 != 0){
                println(reverseList(i));
            }
        }
    }
}