package queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
  public static void main(String[] args) {
   PriorityQueue<Integer>pq=new PriorityQueue<>();
   pq.add(90);
   pq.add(30);
   pq.add(20);
   pq.add(192);
   pq.add(40);
   System.out.println(pq);
  }
}
