package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.sda.algorithms.exercises.Exercise6.isLeapYear;

public class LeapYearTest {
    @Test
    public void LeapYear(){
        assertThat(isLeapYear(2000)).isEqualTo(true);
        assertThat(isLeapYear(2005)).isEqualTo(false);
        assertThat(isLeapYear(2009)).isNotEqualTo(true);
    }
}
