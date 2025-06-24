package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase PedidoService usando la implementación real de DescuentoRepository.
 */
class PedidoServiceTest {
    DescuentoRepository repository = new DescuentoRepository();
    PedidoService service = new PedidoService(repository);

    /**
     * Prueba: Sin descuento y envío normal.
     * subtotal = 100, sin descuento, envío normal (10)
     * Esperado: 110.0
     */
    @Test
    void testSinDescuentoYEnvioNormal() {
        double total = service.calcularTotal(100, "", false);
        assertEquals(110.0, total);
    }

    /**
     * Prueba: Con descuento y envío express.
     * subtotal = 100, descuento 10%, envío express (20)
     * Esperado: 110.0
     */
    @Test
    void testConDescuentoYEnvioExpress() {
        double total = service.calcularTotal(100, "PROMO10", true);
        assertEquals(110.0, total); // 100 - 10% + 20
    }

    /**
     * Prueba: Con descuento y envío normal.
     * subtotal = 200, descuento 10%, envío normal (10)
     * Esperado: 190.0
     */
    @Test
    void testConDescuentoYEnvioNormal() {
        double total = service.calcularTotal(200, "PROMO10", false);
        assertEquals(190.0, total);
    }

    /**
     * Prueba: Sin descuento y envío express.
     * subtotal = 150, sin descuento, envío express (20)
     * Esperado: 170.0
     */
    @Test
    void testSinDescuentoYEnvioExpress() {
        double total = service.calcularTotal(150, "", true);
        assertEquals(170.0, total);
    }
}
