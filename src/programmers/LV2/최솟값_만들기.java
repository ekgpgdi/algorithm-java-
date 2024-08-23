package programmers.LV2;
public class 최솟값_만들기 {

  public static void sortByQuickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static void quickSort(int[] arr, int left, int right) {
    int part = partition(arr, left, right);
    if (left < part - 1) {
      quickSort(arr, left, part - 1);
    }
    if (part < right) {
      quickSort(arr, part, right);
    }
  }

  public static int partition(int[] arr, int left, int right) {
    int pivot = arr[(left + right) / 2];

    while (left <= right) {
      while (arr[left] < pivot) {
        left++;
      }
      while (arr[right] > pivot) {
        right--;
      }
      if (left <= right) {
        swap(arr, left, right);
        left++;
        right--;
      }
    }
    return left;
  }

  public static void swap(int[] arr, int idx1, int idx2) {
    int tmp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp;
  }

  public static int solution(int[] A, int[] B) {
    int answer = 0;

    sortByQuickSort(A);
    sortByQuickSort(B);

    for (int i = 0; i < A.length; i++) {
      answer += A[i] * B[B.length - i - 1];
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}) == 29);
  }
}
