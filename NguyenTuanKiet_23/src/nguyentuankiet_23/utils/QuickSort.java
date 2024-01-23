package nguyentuankiet_23.utils;

import nguyentuankiet_23.SinhVien;
import java.util.ArrayList;
public class QuickSort {
    int partition(ArrayList<SinhVien> arr, int low, int high) {
        int pivot = arr.get(high).getMaSV();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getMaSV() <= pivot) {
                i++;
                SinhVien temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        SinhVien temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }
    public void sort(ArrayList<SinhVien> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}

