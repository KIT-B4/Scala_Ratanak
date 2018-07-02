object demo {
    def main(args: Array[String]) {
        var firstTuple = (10,105.9f,5,"Hello",15);
        var sum:Float = 0.0f;   

        firstTuple.productIterator.foreach{ i =>
            i match{
            case i: Int => sum += i ;
            case f: Float => sum += f;
            case s: String => print("");
            }
        }
        print(sum);
    }
}