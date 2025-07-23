package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class InteractionCheckTest {

    @Test
    void shouldCallApiMethodOnce() {
        // Step 1: Create mock object
        RemoteService mockService = mock(RemoteService.class);

        // Step 2: Inject into dependent class and call method
        Processor processor = new Processor(mockService);
        processor.processData();

        // Step 3: Verify interaction occurred
        verify(mockService).load();
    }
}
