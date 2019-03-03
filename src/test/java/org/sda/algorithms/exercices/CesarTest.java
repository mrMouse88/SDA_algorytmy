package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.CesarCrypt;

import static org.assertj.core.api.Assertions.assertThat;

public class CesarTest {

    @Test
    public void testCesarEncode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "ag";

        String result = cesarCrypt.encodeCesar(inputData, 4);
        assertThat(result).isEqualTo("ek");
    }

    @Test
    public void testCesarDecode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData1 = "ek";
        String inputData2 = "D";

        String result1 = cesarCrypt.decodeCesar(inputData1, 4);
        String result2 = cesarCrypt.decodeCesar(inputData2, 4);

        assertThat(result1).isEqualTo("ag");
        assertThat(result2).isEqualTo("Z");
    }
}
