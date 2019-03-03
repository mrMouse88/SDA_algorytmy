package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.sda.algorithms.exercises.BubbleSort.bubbleSort;

public class BubbleSortTest {
    @Test
    public void BubbleSort(){
        int[] intArrayNotSorted = {7,235,5,1};
        int[] intArraySorted = {1,5,7,235};

        assertThat(bubbleSort(intArrayNotSorted)).isEqualTo(intArraySorted);
    }
}
