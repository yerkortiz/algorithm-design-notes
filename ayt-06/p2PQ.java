import java.util.*;
import java.io.PrintWriter;
class Skyline {
    public static void main(String[] args) {
        int N, i, x1, x2, y;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        int boxes[][] = new int[2 * N][3];
        for(i = 0; i < 2 * N; ++i) {
            x1 = input.nextInt();
            x2 = input.nextInt();
            y = input.nextInt();
            boxes[i][0] = x1;
            boxes[i][1] = y;
            boxes[i][2] = 0;
            boxes[++i][0] = x2;
            boxes[i][1] = y;
            boxes[i][2] = 1;
        }
        Arrays.sort(boxes, (a, b) -> Integer.compare(a[0], b[0]));
        //for(i = 0; i < 2 * N; ++i)
        //    System.out.println(boxes[i][0] + " " + boxes[i][1] + " " + boxes[i][2]);
        //PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        pQueue.add(0); 
        int max = 0;
        for(i = 0; i < 2 * N; ++i) {
            if(boxes[i][2] == 0) {
                pQueue.add(boxes[i][1]);
                if(max != pQueue.peek()) {
                    System.out.println(boxes[i][0] + " " + boxes[i][1]);
                    max = pQueue.peek();
                }
            } else {
                pQueue.remove(boxes[i][1]);
                if(max != pQueue.peek()) {
                    System.out.println(boxes[i][0] + " " + boxes[i][1]);
                    max = pQueue.peek();
                }
            }
        }
        input.close();
    }
}