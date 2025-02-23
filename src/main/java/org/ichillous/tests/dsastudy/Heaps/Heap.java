package org.ichillous.tests.dsastudy.Heaps;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    private int leftChild(int index) {
        return index * 2 + 1;
    }
    private int rightChild(int index) {
        return index * 2 + 2;
    }
    private int parent(int index) {
        return (index - 1) / 2;
    }

    public void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public Heap(){
        this.heap = new ArrayList<Integer>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;
        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove(int value) {
        if (heap.size() == 0) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return maxValue;
    }

    public void sinkDown(int index) {
        int maxIndex = index;
        while(true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }
}
