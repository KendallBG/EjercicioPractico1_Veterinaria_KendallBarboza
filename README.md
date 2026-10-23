# \# Clínica Veterinaria

# 

# Aplicación web desarrollada con Spring Boot para administrar los servicios de una clínica veterinaria. El sistema permite gestionar tipos de servicio, servicios veterinarios y consultar las citas registradas. También incluye una página de inicio y un formulario de contacto.

# 

# \## Tecnologías utilizadas

# 

# \- Java 21

# \- Spring Boot

# \- Spring MVC

# \- Spring Data JPA

# \- Hibernate

# \- MySQL

# \- Thymeleaf

# \- Bootstrap 5

# \- Maven

# \- NetBeans IDE

# 

# \## Funcionalidades

# 

# \- \*\*Página de inicio:\*\* información de la clínica, horario, ubicación, especialidades y promociones.

# \- \*\*Tipos de servicio:\*\* registro, consulta, edición y eliminación de tipos de servicio.

# \- \*\*Servicios veterinarios:\*\* administración de servicios, precios, duración y tipo asociado.

# \- \*\*Citas:\*\* consulta de las citas registradas con el nombre de la mascota, propietario, fecha y servicio.

# \- \*\*Contacto:\*\* formulario para recibir mensajes de los usuarios y mostrar una confirmación de envío.

# \- \*\*Interfaz:\*\* navegación compartida, diseño adaptable y mensajes configurables mediante `messages.properties`.

# 

# \## Requisitos previos

# 

# Antes de ejecutar el proyecto, se necesita:

# 

# \- Java JDK 21.

# \- MySQL Server.

# \- NetBeans IDE u otro IDE compatible con Maven.

# \- Acceso a Internet para descargar dependencias y cargar los recursos externos de Bootstrap.

# 

# \## Configuración de la base de datos

# 

# 1\. Iniciar el servicio de MySQL.

# 2\. Abrir MySQL Workbench o un cliente SQL.

# 3\. Ejecutar el siguiente comando para crear la base de datos:

# 

# ```sql

# CREATE DATABASE veterinaria\_citas;

# ```

# 

# 4\. Configurar un usuario de MySQL con permisos sobre la base de datos.

# 5\. Abrir el archivo `src/main/resources/application.properties` y configurar la conexión con los datos locales de MySQL.

# 

# Ejemplo de configuración:

# 

# ```properties

# spring.application.name=veterinaria

# server.port=8086

# 

# spring.datasource.url=jdbc:mysql://localhost:3306/veterinaria\_citas

# spring.datasource.username=TU\_USUARIO

# spring.datasource.password=TU\_PASSWORD

# spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# 

# spring.jpa.hibernate.ddl-auto=update

# spring.jpa.show-sql=true

# ```

# 

# Reemplazar `TU\_USUARIO` y `TU\_PASSWORD` por las credenciales locales correspondientes.

# 

# \*\*Importante:\*\* no publicar contraseñas ni credenciales reales en el repositorio.

# 

# \## Cómo ejecutar el proyecto

# 

# 1\. Clonar o descargar el repositorio.

# 2\. Abrir el proyecto en NetBeans como un proyecto Maven existente.

# 3\. Verificar que Java 21 esté configurado para el proyecto.

# 4\. Configurar la conexión a MySQL siguiendo los pasos anteriores.

# 5\. Esperar a que Maven descargue las dependencias.

# 6\. Ejecutar la clase principal `VeterinariaApplication.java`.

# 7\. Abrir el navegador y acceder a:

# 

# \[http://localhost:8086](http://localhost:8086)

# 

# \## Estructura del proyecto

# 

# ```text

# src/main/java/com/veterinaria/veterinaria/

# ├── Controllers/

# ├── Domain/

# ├── Repository/

# ├── Service/

# │   └── Impl/

# 

# src/main/resources/

# ├── templates/

# │   ├── fragments/

# │   ├── tipos-servicio/

# │   ├── servicios/

# │   ├── citas/

# │   ├── index.html

# │   ├── contacto.html

# │   └── contacto-gracias.html

# ├── application.properties

# └── messages.properties

# ```

# 

# La estructura puede incluir archivos adicionales de configuración y clases auxiliares.

# 

# \## Repositorio

# 

# Código fuente del proyecto:

# 

# https://github.com/KendallBG/EjercicioPractico1\_Veterinaria\_KendallBarboza

# 

# \## Autor

# 

# Kendall Barboza

# 

# Proyecto académico desarrollado para la práctica de Spring Boot, persistencia con JPA y MySQL, controladores MVC y vistas con Thymeleaf.



