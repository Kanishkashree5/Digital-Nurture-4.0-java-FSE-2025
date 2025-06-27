import org.junit.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Use the mock in your service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that the getData() method was called once
        verify(mockApi).getData();
    }
}
