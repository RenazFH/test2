package at.ac.fhstp.pirhan.Uebung4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 

class MockitoTest {

    @Mock
    Database databaseMock;                                  

    @Test
    public void testQuery()  {
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);  
        Service t  = new Service(databaseMock);             
        boolean check = t.query("* from t");                
        assertTrue(check);
    }

}
