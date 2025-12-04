//Create a class with a static counter variable that tracks the number of instances created.

class CounterObject{
    static int count = 0;

    CounterObject(){
        ++count;
    }
}


public class Week2_12 {

    public static void main(String[] args) {
        CounterObject c1 = new CounterObject();
        CounterObject c2 = new CounterObject();
        CounterObject c3 = new CounterObject();

        System.out.println(CounterObject.count);

    }


}
