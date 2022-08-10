import java.util.ArrayList;

public class applambda {
    public static void main(String[] args) {
        var x=new ArrayList<Integer>();
        x.add(5);
        x.add(6);
        x.add(7);
        x.add(8);
        x.add(9);
        x.forEach(
                (var i)->{
                    System.out.println("Item= "+i);
                }
        );
        /*for (var i : x){
            System.out.println("Item= "+i);
        }*/

    }

}
