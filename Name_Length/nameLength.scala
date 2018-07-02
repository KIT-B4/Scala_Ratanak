object demo {
    def main(args: Array[String]) {
        var nameList: List[String] = getName();
        searchName(nameList);
    }
    def getName():List[String] = {
        var nameList: List[String] = List("Alexa","aloha","Amon","Pi","Ma");
        return nameList;
    }
    def searchName(nameList: List[String]) {
        var i=0;
        for(i <- 0 to nameList.length-1) {
            if(nameList(i).length() >= 3 || nameList(i).length() >= 3) {
                print(nameList(i)+",");
            }
        }
    }
}