# SPRING SECURITY / CRUD PRODUCT

## Descripción
Este proyecto implementa un sistema de autenticación y autorización utilizando Spring Security, junto con operaciones CRUD para la gestión de productos.

## Tecnologías Utilizadas
- Java JDK 21
- Spring Boot
- Spring Security
- Lombok
- Thymeleaf
- Bootstrap

## Funcionalidades
### Autenticación
- **Login**: Permite a los usuarios iniciar sesión.

### Usuario
- **Registro**: Permite a los nuevos usuarios registrarse.

### Producto
- **Listado**: Muestra una lista de productos.
- **Registro**: Permite registrar nuevos productos.
- **Actualización**: Permite actualizar la información de los productos.
- **Eliminación**: Permite eliminar productos.

## Requisitos Previos
- Java JDK 21
- Maven o Gradle
- IDE (IntelliJ, Eclipse, etc.)

## Instalación y Ejecución
### Pasos:
1. **Clonar el repositorio**:
    ```bash
    git clone https://github.com/WilmerOcampo/spring-security-crud-product.git
    cd spring-security-crud-product
    ```
2. **Configurar application.properties**:
   Asegúrate de configurar las propiedades necesarias en el archivo `src/main/resources/application.properties`. La sentencia `?createDatabaseIfNotExist=true` habilita la creación de la base de datos si no existe.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos?createDatabaseIfNotExist=true
    spring.datasource.username=usuario
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Ejecutar el proyecto**:
   Puedes ejecutar el proyecto usando tu IDE o desde la línea de comandos con Maven o Gradle.
    ```bash
    ./mvnw spring-boot:run
    ```

4. **Ingresar datos a la tabla Categories**:
   Asegúrate de tener datos en la tabla `Categories` antes de probar la funcionalidad CRUD de productos.

## Estructura del Proyecto
- **src/main/java**: Contiene el código fuente Java.
- **src/main/resources**: Contiene recursos estáticos y archivos de configuración.

## Contribución
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commits (`git commit -am 'Añadir nueva funcionalidad'`).
4. Empuja tu rama (`git push origin feature/nueva-funcionalidad`).
5. Crea un Pull Request.

## Licencia
Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE`.
