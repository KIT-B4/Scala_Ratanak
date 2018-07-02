object demo {
    def main(args: Array[String]) {
        var nameList: List[String] = getName();
        searchName(nameList);
    }
    def getName():List[String] = {
        var nameList: List[String] = List("Alexa","aloha","Amon");
        return nameList;
    }
    def searchName(nameList: List[String]) {
        var i=0;
        for(i <- 0 to nameList.length-1) {
            if(nameList(i).charAt(0)=='a' || nameList(i).charAt(0)=='A') {
                println(nameList(i));
            }
        }
    }
}