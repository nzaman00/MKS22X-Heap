import java.util.*;
public class MyHeap {
  private static void swap(int[] data, int indx1, int indx2) {
    int temp = data[indx2];
    data[indx2] = data[indx1];
    data[indx1] = temp;
  }
  private static void pushDown(int[] data,int size,int index) {
    if (size % 2 == 0 && 2*index+1 == size-1) {
      if (data[index] < data[2*index+1]) {
      swap(data,index,2*index+1);
      return;
    }
    }
    else if (2*index+2 < size && (data[index] < data[2*index+1] || data[index] < data[2*index+2])) {
      if (data[2*index+1] > data[2*index+2]) {
        swap(data,index,2*index+1);
        pushDown(data,size,2*index+1);
        }
    else {
      swap(data,index,2*index+2);
      pushDown(data,size,2*index+2);
     }
    }
  }
  private static void pushUp(int[] data,int index) {
   if (index == 0 || data[(index-1)/2] >= data[index]) {
    return;
    }
   swap(data,index,(index-1)/2);
   pushUp(data,(index-1)/2);
  }
  public static void heapify(int[] data) {
    for (int i = data.length-1;i >= 0;i--) {
      pushDown(data,data.length,i);
    }
  }
  
  
}
