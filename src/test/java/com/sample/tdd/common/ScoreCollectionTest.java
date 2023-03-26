package com.sample.tdd.common;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreCollectionTest {

    @Test
    public void test() {
        // AAA Arrange - Act - Assert

        // Arrange
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);

        // Act
        int actualResult = scoreCollection.arithmeticMean();

        // Assert
        assertThat(actualResult == 6);
    }
}