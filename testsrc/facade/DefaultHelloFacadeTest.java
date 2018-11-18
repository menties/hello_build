package facade;

import facade.impl.DefaultHelloFacade;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class DefaultHelloFacadeTest {

    private static final String MAKS_NAME = "Maks";

    private DefaultHelloFacade unit = new DefaultHelloFacade();

    @Test
    public void shouldReturnMaksName() {
        // when
        final String actual = unit.getMaksName();

        // then
        assertEquals(MAKS_NAME, actual);
    }

}
