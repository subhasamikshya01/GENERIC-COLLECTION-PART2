import java.util.PriorityQueue;

public class MinHeapCreationAndDequeue {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

        // Create a priority queue (min heap) and add elements from the array
        PriorityQueue<Integer> minHeap = createMinHeap(arr);

        // Dequeue elements of the priority queue and print them
        System.out.println("Elements dequeued from the min heap:");
        while (!minHeap.isEmpty()) {
            int element = minHeap.poll();
            System.out.print(element + " ");
        }
    }

    public static PriorityQueue<Integer> createMinHeap(int[] arr) {
        // Create a priority queue (min heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements from the array to the priority queue
        for (int num : arr) {
            minHeap.offer(num);
        }

        return minHeap;
    }
}
