import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testRunner {

    @Test
    public void testRowIncrease() {
        //Arrange
        RowCounter rowCounter = new RowCounter();
        rowCounter.rowIncrease();
        int expected = 1;

        //Act
        int actual = rowCounter.getRowCounter();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testRowCounterWithMultipleIncrease(){
        //Arrange
        RowCounter rowCounter = new RowCounter();
        rowCounter.rowIncrease();
        rowCounter.rowIncrease();
        int expected = 2;

        //Act
        int actual = rowCounter.getRowCounter();

        //Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testSignIncreaseWithMixedInput() {
        //Arrange
        RowCounter rowCounter = new RowCounter();
        rowCounter.signIncrease(5);
        rowCounter.signIncrease(3);
        int expected = 8;

        //Act
        int actual = rowCounter.getSignCounter();

        //Assert
        assertEquals(expected, actual );
    }
}
