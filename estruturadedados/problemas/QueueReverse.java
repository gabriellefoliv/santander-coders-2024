package estruturadedados.problemas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {

    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        solveQueue(queue, k);
        int n = queue.size() - k;
        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solveQueue(final Queue<Integer> queue, final int k) {
        if (k == 0)
            return;
        int element = queue.remove();
        solveQueue(queue, k - 1);
        queue.add(element);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(reverseFirstK(queue, 3));

    }
}
