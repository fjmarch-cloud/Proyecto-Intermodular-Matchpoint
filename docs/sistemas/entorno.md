#  Informe Técnico del Entorno de Ejecución – MatchPoint

## 1. Tipo de sistema

La aplicación MatchPoint está diseñada para ejecutarse en un **equipo personal (PC)** en entorno local.

Se trata de una aplicación Java conectada a una base de datos MySQL, por lo que no requiere inicialmente un servidor dedicado. Este enfoque es adecuado para desarrollo, pruebas y entornos educativos.

---

## 2. Requisitos de hardware

###  Mínimos

* CPU: Procesador de 2 núcleos
* RAM: 4 GB
* Almacenamiento: 2 GB libres
* Conexión a internet (para descargas iniciales)

###  Recomendados

* CPU: 4 núcleos o superior
* RAM: 8 GB
* Almacenamiento: SSD con al menos 10 GB libres

---

## 3. Sistema operativo

Se recomienda:

* **Windows 10 / Windows 11**

También es compatible con:

* Linux
* macOS

La elección de Windows se debe a su facilidad de configuración y compatibilidad con herramientas utilizadas (MySQL Workbench, VS Code).

---

## 4. Instalación del entorno

### Paso 1 – Instalar Java

* Descargar e instalar JDK (Java Development Kit)

### Paso 2 – Instalar MySQL

* Instalar MySQL Server
* Configurar usuario root y contraseña
* Puerto: 3306

### Paso 3 – Instalar MySQL Workbench

* Herramienta para gestionar la base de datos

### Paso 4 – Configurar base de datos

* Ejecutar scripts:

  * `schema.sql`
  * `data.sql`

### Paso 5 – Configurar el proyecto Java

* Importar el proyecto en VS Code
* Añadir el conector JDBC (`.jar`)
* Ejecutar la aplicación

---

## 5. Usuarios, permisos y estructura

### Usuarios

* Usuario administrador (root)
* Posibles usuarios de la aplicación (clientes)

### Permisos

* El usuario root tiene control total sobre la base de datos
* Los usuarios de la aplicación solo interactúan a través del sistema

### Estructura de datos

* Base de datos: `matchpoint`
* Tablas principales:

  * usuarios
  * pistas
  * deportes
  * reservas
  * pagos

---

## 6. Mantenimiento del sistema

* Actualización periódica de:

  * Java
  * MySQL
* Revisión de errores en la aplicación
* Copias de seguridad de la base de datos
* Optimización de consultas si el sistema crece

---

## 7. Seguridad básica

* Uso de contraseña segura para MySQL
* Acceso restringido al sistema
* Evitar exposición pública de credenciales
* Copias de seguridad periódicas

---

## 8. Evidencias de funcionamiento

La aplicación ha sido probada en entorno local:

* Conexión exitosa a la base de datos mediante JDBC
* Inserción de datos (usuarios)
* Consulta de datos desde Java
* Ejecución correcta desde VS Code

Se pueden incluir capturas del funcionamiento en el repositorio.

---

## 9. Conclusión

El entorno definido permite ejecutar correctamente la aplicación MatchPoint en un contexto realista, cumpliendo los requisitos necesarios para su funcionamiento y facilitando su mantenimiento y evolución futura.

