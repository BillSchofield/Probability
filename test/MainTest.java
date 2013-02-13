import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {
    @Test
    public void coinFlipReturnsTheStringHeads() {

        // Random random = mock(Random.class);
        // when(random.nextInt()).thenReturn(1);

        Main mainFoo = new Main();
        String stringHeads = "Heads";

        // Ack! What do I do now
       assertThat(mainFoo.getCoinFlipResult(true), is(stringHeads));
    }

    @Test
    public void coinFlipReturnsTheStringTails(){
        Main mainFoo = new Main();
        String stringTails = "Tails";

        assertThat(mainFoo.getCoinFlipResult(false),is(stringTails));
    }

    @Test
    public void shouldGenerateRandomNumber() {
        Main mainFoo = new Main();

        assertThat(mainFoo.flipCoin(randomNumber),1);
    }
}
