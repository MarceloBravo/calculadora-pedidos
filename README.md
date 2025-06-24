# Calculadora de Pedidos

Este proyecto es una aplicación Java basada en Maven que permite calcular el total de pedidos aplicando descuentos y otras reglas de negocio.

## Estructura del proyecto

- `src/main/java/com/ejemplo/` - Código fuente principal
- `src/test/java/com/ejemplo/` - Pruebas unitarias
- `pom.xml` - Archivo de configuración de Maven

## Requisitos

- Java 8 o superior
- Maven 3.x

## Compilación y ejecución

Para compilar el proyecto:

```sh
mvn clean compile
```

Para ejecutar las pruebas:

```sh
mvn test
```

## Descripción de archivos principales

- `App.java`: Clase principal de la aplicación.
- `PedidoService.java`: Lógica de negocio para el cálculo de pedidos.
- `DescuentoRepository.java` y `DescuentoRepositoryInterface.java`: Gestión de descuentos.

## Notas

- El directorio `/target/` está excluido del control de versiones mediante `.gitignore`.
- Puedes modificar o ampliar la lógica de negocio en las clases del paquete `com.ejemplo`.

## Autor

- [Tu Nombre]
