# 📚 El Rincón del Saber

Aplicación de escritorio educativa desarrollada en Java Swing para la gestión de una biblioteca escolar. Permite administrar libros por categorías, realizar búsquedas, y gestionar usuarios administradores.

---

## 🛠️ Tecnologías utilizadas

- **Java** (NetBeans)
- **Java Swing** para interfaces gráficas
- **Archivos `.txt`** para persistencia
- **Estructuras de datos**:
  - Árbol binario de búsqueda (ABB)
  - Tablas hash
  - Listas enlazadas
  - Colecciones
- **Algoritmo de ordenamiento**: Burbuja

---

## 🔍 Funcionalidades principales

### 👤 Modo Administrador
- Agregar, editar y eliminar libros
- Filtrar por categoría (Juvenil, Ciencia, Clásico, Actualidad)
- Buscar libros
- Guardar cambios (se persisten en `libros.txt`)
- Cierre de sesión

### 🎓 Modo Estudiante
- Ver libros por categoría
- Buscar libros disponibles
- Recargar lista de libros desde archivo

---

## 🧠 Estructuras de datos implementadas

- `ArbolBinarioBusqueda`: mejora la eficiencia al buscar libros por título.
- `TablaHashAdmin`: almacenamiento rápido de administradores.
- `ListaLibros`: estructura para manejo ordenado de libros.
- `Burbuja`: se usa para ordenar los libros al mostrarlos.

---


## ▶️ Cómo ejecutar el proyecto

1. Abre NetBeans.
2. Importa el proyecto desde la carpeta `El Rincón del Saber/`.
3. Asegúrate de tener los archivos `libros.txt` y `admins.txt` en la raíz.
4. Ejecuta el `Main.java` o la clase principal de la interfaz gráfica.
5. ¡Listo! Prueba como **Administrador** o **Estudiante**.

---

## 🙋 Autora

Proyecto desarrollado por **Katherine Patricia Salas Quiroz**  
Carrera: Ingeniería de Software
