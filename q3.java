import java.util.ArrayList;
public class q3 {
    public static void bubbleSort(ArrayList<Integer> arrList) {
        int n = arrList.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arrList.get(j) > arrList.get(j + 1)) {
                    int temp = arrList.get(j);
                    arrList.set(j, arrList.get(j + 1));
                    arrList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}
