import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    List q = Collections.synchronizedList(new LinkedList<String>());
    Thread p1 = new Thread(new PrepareProduction(q));
    Thread c1 = new Thread(new DoProduction(q));
    p1.start();
    c1.start();
    p1.join();
    c1.join();
  }
}