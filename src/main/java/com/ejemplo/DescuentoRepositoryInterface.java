package com.ejemplo;

/**
 * Repositorio para obtener el porcentaje de descuento según un código promocional.
 */
public interface DescuentoRepositoryInterface {
    /**
     * Obtiene el porcentaje de descuento asociado a un código.
     *
     * @param codigo Código promocional
     * @return Porcentaje de descuento (ej. 0.10 para 10%)
     */
    public double obtenerPorcentaje(String codigo);
}