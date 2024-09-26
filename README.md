# Problema de José: Lista Doble-Enlazada Circular

## Descripción

Este proyecto resuelve el problema clásico de José utilizando una **lista doble-enlazada circular**. El problema describe una situación donde un grupo de soldados está rodeado por fuerzas enemigas, y necesitan elegir a uno de ellos para escapar y pedir refuerzos. El soldado que escapa se determina siguiendo un proceso de eliminación.

### Objetivo
El objetivo de este algoritmo es:
- Determinar el **orden de eliminación** de los soldados del círculo.
- Identificar cuál es el **soldado que escapa**.

## Implementación

La implementación de este algoritmo se realiza en **Java**, utilizando una estructura de **lista doble-enlazada circular**. Cada nodo en la lista representa a un soldado, y la lista está conectada de manera circular, permitiendo recorrerla de forma continua.

### Clases Principales
- **`nodo`**: Clase que representa a cada soldado, con punteros al siguiente y anterior nodo en la lista.
- **`Problema_de_Jose`**: Clase principal que contiene los métodos para gestionar la lista y realizar el proceso de eliminación.

### Métodos Importantes
- **`insertar(String info)`**: Inserta un nuevo soldado al final de la lista doble-enlazada circular.
- **`procedimiento()`**: Realiza el proceso de eliminación de los soldados basado en un número de conteo proporcionado por el usuario.
- **`mostrarlista()`**: Muestra todos los soldados en la lista circular.
- **`listavacia()`**: Verifica si la lista está vacía.

### Flujo del Programa
1. Los soldados se agregan a la lista de forma secuencial, con sus nombres.
2. El usuario selecciona un número para el proceso de eliminación.
3. El proceso de eliminación comienza, eliminando soldados de acuerdo con el número seleccionado, hasta que solo quede uno.
4. El último soldado restante es el que escapará para pedir ayuda.

## Ejemplo de Ejecución

```bash
1. Insertar al inicio
2. Mostrar Lista
3. Lanzar Balota
10. Salir
