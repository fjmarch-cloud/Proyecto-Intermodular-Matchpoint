#  Modelo Relacional – MatchPoint

##  Descripción

Este modelo relacional representa la estructura de la base de datos del sistema MatchPoint, diseñada para gestionar reservas de pistas deportivas.

---

##  Tablas del sistema

###  usuarios

* id_usuario (INT, PK, AUTO_INCREMENT)
* nombre (VARCHAR)
* email (VARCHAR)

---

###  deportes

* id_deporte (INT, PK, AUTO_INCREMENT)
* nombre (VARCHAR)

---

###  pistas

* id_pista (INT, PK, AUTO_INCREMENT)
* nombre (VARCHAR)
* id_deporte (INT, FK)

---

###  reservas

* id_reserva (INT, PK, AUTO_INCREMENT)
* id_usuario (INT, FK)
* id_pista (INT, FK)
* fecha (DATE)
* hora (TIME)

---

###  pagos

* id_pago (INT, PK, AUTO_INCREMENT)
* id_reserva (INT, FK)
* cantidad (DECIMAL)
* metodo_pago (VARCHAR)

---

##  Relaciones

* Un usuario puede tener muchas reservas (1:N)
* Una pista puede tener muchas reservas (1:N)
* Un deporte puede tener muchas pistas (1:N)
* Una reserva tiene un pago asociado (1:1)

---

##  Notas

* Todas las claves primarias son autoincrementales
* Las claves foráneas garantizan la integridad referencial
* El modelo está diseñado para ser escalable y coherente con el funcionamiento real de la aplicación

