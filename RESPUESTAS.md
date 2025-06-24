# Respuestas sobre pruebas unitarias y buenas prácticas

1. **¿Qué te ayudaron a identificar las pruebas unitarias?**

Las pruebas unitarias ayudaron a identificar errores en la lógica de negocio, asegurando que los métodos de cálculo de pedidos y aplicación de descuentos funcionen correctamente bajo diferentes escenarios. También permitieron detectar casos límite y comportamientos inesperados antes de que el código llegue a producción.

2. **¿Cuál fue el beneficio de usar un mock para simular una dependencia?**

El uso de mocks permitió aislar la funcionalidad de la clase bajo prueba, simulando el comportamiento de dependencias externas (como el repositorio de descuentos). Esto facilitó probar la lógica interna sin depender de implementaciones reales o acceso a bases de datos, haciendo las pruebas más rápidas, confiables y predecibles.

3. **¿Qué pasaría si se modifica la lógica de descuentos sin actualizar las pruebas?**

Si la lógica de descuentos cambia y las pruebas no se actualizan, es probable que las pruebas fallen o, peor aún, que pasen sin reflejar el nuevo comportamiento esperado. Esto puede llevar a errores en producción, ya que las pruebas dejarían de validar correctamente la funcionalidad real del sistema.

4. **¿Cómo escalamos esta estrategia para un sistema más grande?**

Para sistemas más grandes, se recomienda:
- Mantener una buena cobertura de pruebas unitarias y de integración.
- Utilizar mocks y stubs para aislar componentes.
- Automatizar la ejecución de pruebas (CI/CD).
- Organizar el código en módulos bien definidos y desacoplados.
- Revisar y actualizar las pruebas junto con los cambios en la lógica de negocio.

Esto asegura que el sistema siga siendo mantenible, escalable y confiable a medida que crece.
