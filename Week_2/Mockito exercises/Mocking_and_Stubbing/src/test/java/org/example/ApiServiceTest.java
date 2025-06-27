package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void shouldReturnMockedInfo() {
        RemoteApi mockApi = mock(RemoteApi.class);
        when(mockApi.fetchInfo()).thenReturn("Mocked Response");

        ApiService service = new ApiService(mockApi);
        String result = service.getInfo();

        assertEquals("Mocked Response", result);
    }
}
