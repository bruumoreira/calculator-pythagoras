package com.calculator.pythagoras.service;

import com.calculator.pythagoras.exception.BusinessException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorPythagorasServiceTest {

    @InjectMocks
    CalculatorPythagorasService service;

    @Test
    public void calculateHypotenuseWithAdjacentValueNullTest() throws Exception {
        BusinessException thrown = assertThrows(BusinessException.class, () -> {
                service.calculate(null, BigDecimal.valueOf(5));
            }
        );
        assertNotNull(thrown);
        assertEquals("Value of the adjacent catete is mandatory!", thrown.getBusinessMessage());
    }

    @Test
    public void calculateHypotenuseWithOppositeValueNullTest() throws Exception {
        BusinessException thrown = assertThrows(BusinessException.class, () -> {
                    service.calculate(BigDecimal.valueOf(8), null);
                }
        );
        assertNotNull(thrown);
        assertEquals("Value of the opposite catete is mandatory!", thrown.getBusinessMessage());
    }

    @Test
    public void calculateHypotenuseTest() throws Exception {
        assertEquals(BigDecimal.valueOf(5.0), service.calculate(BigDecimal.valueOf(3), BigDecimal.valueOf(4)));
        assertEquals(BigDecimal.valueOf(17.5), service.calculate(BigDecimal.valueOf(9), BigDecimal.valueOf(15)));
        assertEquals(BigDecimal.valueOf(8.6), service.calculate(BigDecimal.valueOf(8), BigDecimal.valueOf(-3)));
        assertEquals(BigDecimal.valueOf(12.5), service.calculate(BigDecimal.valueOf(7.5), BigDecimal.valueOf(10)));
    }


/*
    hypotenuseValue
    ParkingSpot mockParkingSpot = MockUtil.mockParkingSpot();
    when(repository.existsByLicensePlateCar(Mockito.any())).thenReturn(true);
    BusinessException thrown = assertThrows(BusinessException.class, () ->
            service.save(mockParkingSpot)
    );
    assertNotNull(thrown);
    assertEquals("Conflict: License Plate Car is already in use!", thrown.getBusinessMessage());
}*/
}
