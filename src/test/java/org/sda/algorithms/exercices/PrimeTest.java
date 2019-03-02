package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.sda.algorithms.exercises.Exercise3.isPrime;

public class PrimeTest {

    @Test
    public void testPrimes(){

        assertThat(isPrime(11)).isEqualTo(true);
        assertThat(isPrime(17)).isEqualTo(true);
        assertThat(isPrime(16763)).isEqualTo(true);
        assertThat(isPrime(65257)).isEqualTo(true);
        assertThat(isPrime(104729)).isEqualTo(true);
    }

    @Test
    public void testNotPrimes(){

        assertThat(isPrime(12)).isEqualTo(false);
        assertThat(isPrime(18)).isEqualTo(false);
        assertThat(isPrime(16764)).isEqualTo(false);
        assertThat(isPrime(65258)).isEqualTo(false);
        assertThat(isPrime(104730)).isEqualTo(false);
    }
}
