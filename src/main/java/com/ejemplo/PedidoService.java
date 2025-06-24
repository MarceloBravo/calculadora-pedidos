package com.ejemplo;

/**
 * Servicio para calcular el total de un pedido utilizando un repositorio de descuentos.
 */
public class PedidoService {
    private DescuentoRepositoryInterface repository;

    /**
     * Constructor que recibe el repositorio de descuentos.
     *
     * @param repository Repositorio para obtener el porcentaje de descuento
     */
    public PedidoService(DescuentoRepositoryInterface repository) {
        this.repository = repository;
    }

    /**
     * Calcula el total a pagar por un pedido, considerando código de descuento y tipo de envío.
     *
     * @param subtotal Monto base del pedido
     * @param codigoDescuento Código promocional para descuento
     * @param envioExpress Si el envío es express (20.0) o estándar (10.0)
     * @return Total a pagar
     */
    public double calcularTotal(double subtotal, String codigoDescuento, boolean envioExpress) {
        double descuento = repository.obtenerPorcentaje(codigoDescuento); // Obtiene el descuento según el código
        double envio = envioExpress ? 20.0 : 10.0; // Costo de envío
        return (subtotal * (1 - descuento)) + envio; // Total final
    }
}