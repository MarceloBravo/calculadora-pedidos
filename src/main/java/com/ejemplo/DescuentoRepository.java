package com.ejemplo;

/**
 * Repositorio para obtener el porcentaje de descuento según un código promocional.
 */
public class DescuentoRepository implements DescuentoRepositoryInterface {
    /**
     * Obtiene el porcentaje de descuento asociado a un código.
     *
     * @param codigo Código promocional
     * @return Porcentaje de descuento (ej. 0.10 para 10%)
     */
    public double obtenerPorcentaje(String codigo) {
        if (codigo.equals("PROMO10")) return 0.10;
        return 0.0;
    }
}