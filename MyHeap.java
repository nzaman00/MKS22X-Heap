import java.util.*;
public class MyHeap {
  private static void swap(int[] data, int indx1, int indx2) {
    int temp = data[indx2];
    data[indx2] = data[indx1];
    data[indx1] = temp;
  }
}
