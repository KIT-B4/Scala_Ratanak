import java.util.ArrayList;

object demo {
    def main(args: Array[String]) {
        getLists();
    }
    def getLists(){
        var lineList: List[Int] = List(12,14,51);
        var pageList: List[Int][List] = List((2,5,23),lineList);
        var bookList: List[String] = List("Ink&Bone","Ash&Quill");
        var categoryList: List[String] = List("Fantasy","Horror","Thriller");
        // var libraryList: 
        // var result = libraryList.flatten.flatten.flatten.flatten;
        println(pageList);
        // println(result);
        
    }
}