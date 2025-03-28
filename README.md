# Proyecto de Hilos en Java

## Descripción del Proyecto
Este proyecto demuestra el uso de hilos en Java mediante ejemplos prácticos, utilizando tanto la clase `Thread` como la interfaz `Runnable`. Además, se incluyen conceptos de sincronización de hilos.

### Estructura del Proyecto
- **Model/RunnableSimple.java**: Ejemplo de implementación de hilos utilizando la interfaz `Runnable`. Este enfoque permite que una clase herede de otras mientras implementa la lógica del hilo.
  - Temas: Hilos en Java, Runnable, ejecución concurrente.

- **Model/ThreadSimple.java**: Ejemplo de implementación de hilos utilizando la clase `Thread`, útil cuando se desea extender directamente la funcionalidad de un hilo.
  - Temas: Hilos en Java, Thread, métodos `start()` y `run()`.

- **mx/edu/itses/mipz/hilos/Hilos.java**: Ejemplo principal que ejecuta hilos en el proyecto. Puede servir como punto de partida para ver la ejecución concurrente.
  - Temas: Hilos múltiples, ejecución paralela.

- **mx/edu/itses/mipz/hilos/HilosR.java**: Ejemplo adicional que muestra el uso de hilos con distintos enfoques o configuraciones.
  - Temas: Implementación alternativa de hilos.

## Paquete Synchronized
Se ha creado un paquete llamado **Synchronized** para explorar temas avanzados de sincronización en hilos.

### Conceptos Clave
- **Flag**: Es una variable utilizada para señalar si una condición se cumple o no en programación concurrente.
- **wait()**: Método que hace que un hilo espere hasta que otro hilo lo notifique o interrumpa.
- **notify()**: Método que despierta a un solo hilo que esté esperando en el mismo objeto monitor.

### Programación Normal vs Funcional
- **Programación Normal**: Se centra en el estado y el control mediante instrucciones secuenciales y mutación de variables.
- **Programación Funcional**: Enfatiza el uso de funciones puras, evita efectos secundarios y el estado mutable.

## Actualización en GitHub
El proyecto ha sido actualizado en el repositorio de GitHub, incluyendo el nuevo paquete **Synchronized** y el presente archivo `README.md`.

