#  MatchPoint – Plataforma de Reservas Deportivas

##  Descripción del proyecto

MatchPoint es una aplicación orientada a la gestión de reservas de pistas deportivas. Permite a los usuarios consultar disponibilidad, reservar instalaciones y gestionar información relacionada con el uso de espacios deportivos.

Este proyecto forma parte del **Proyecto Intermodular de 1º de DAW**, integrando conocimientos de múltiples módulos para simular un entorno profesional real.

---

##  Objetivo

El objetivo principal es desarrollar un sistema completo que represente el funcionamiento de una empresa dedicada a la gestión de instalaciones deportivas, combinando:

* Desarrollo web (frontend)
* Programación en Java (backend lógico)
* Gestión de bases de datos
* Organización profesional del proyecto

---

##  Tecnologías utilizadas

* **HTML5** – Estructura del portal web
* **CSS3** – Diseño y estilos visuales
* **Java** – Lógica de la aplicación
* **JDBC** – Conexión con base de datos
* **MySQL** – Gestión de datos
* **Git & GitHub** – Control de versiones

---

##  Estructura del proyecto

```bash
/web        → Portal web (HTML + CSS)
/src        → Código Java (lógica de la aplicación)
/sql        → Scripts de base de datos (creación, inserciones, consultas)
/docs       → Documentación del proyecto
   /diagramas     → Diagrama E/R y modelo relacional
   /empleabilidad → Perfil profesional y portfolio
README.md
```

---

##  Base de datos

La base de datos `matchpoint` gestiona la información del sistema:

* Usuarios
* Pistas deportivas
* Deportes
* Reservas
* Pagos

Incluye:

* Script de creación (`schema.sql`)
* Inserción de datos (`data.sql`)
* Consultas (`queries.sql`)

---

##  Aplicación Java

La aplicación permite:

* Conexión a la base de datos mediante JDBC
* Consulta de datos (usuarios, reservas, etc.)
* Base preparada para implementar operaciones CRUD

---

##  Portal web

La web representa la parte visible de la empresa:

* Página de inicio
* Servicios
* Reservas
* Contacto

---

##  Relación entre módulos

Este proyecto integra:

* **Web** → representación de la empresa
* **Java** → gestión de la lógica
* **Base de datos** → almacenamiento de información

---

##  Autor

Fran Martínez
Estudiante de Desarrollo de Aplicaciones Web (DAW)

---

##  Estado del proyecto

En desarrollo – Proyecto intermodular de 1º DAW

---

##  Aprendizajes

* Diseño de bases de datos
* Conexión Java-MySQL
* Organización de proyectos reales
* Desarrollo web básico

---

##  Mejoras futuras

* Implementación completa de CRUD
* Integración real frontend-backend
* Mejora del diseño responsive
* Sistema de autenticación de usuarios



