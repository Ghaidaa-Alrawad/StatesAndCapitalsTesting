package statesandcapitalstesting;

import org.junit.jupiter.api.Test;
import statesandcapitalstesting.statesAndCapitalsLab.StatesAndCapitals;

import java.io.IOException;

class StatesAndCapitalsTest
{
    @Test void Test_states_and_capitals() throws IOException
    {
        StatesAndCapitals sut = new StatesAndCapitals();
        sut.testStatesAndCapitals();
    }
}
