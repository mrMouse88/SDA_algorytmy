package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.sda.algorithms.exercises.BubbleSort.bubbleSort;

public class BubbleSortTest {
    @Test
    public void BubbleSort(){
        int[] intArrayNotSorted = {7,3,5};
        int[] intArraySorted = {3,5,7};

        assertThat(bubbleSort(intArrayNotSorted)).isEqualTo(intArraySorted);
    }
}
