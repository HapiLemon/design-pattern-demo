package com.example.adapter.book;

public class OperationAdapter implements ScoreOperation{

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter() {
        this.quickSort=new QuickSort();
        this.binarySearch=new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array,key);
    }
}
