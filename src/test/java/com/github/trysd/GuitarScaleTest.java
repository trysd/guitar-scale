/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.trysd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class GuitarScaleTest {
    @Test
    public void testScaleStructureByScaleName() {
        // Arrange
        GuitarScale gs = new GuitarScale();

        int[] res = gs.getScaleStructureByScaleName(ScaleBase.Diminish);
        String result = Arrays.stream(res)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining());
        System.out.println(result);

        assertEquals("001001001001", result);
    }
}