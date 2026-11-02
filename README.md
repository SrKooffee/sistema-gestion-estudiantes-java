Sistema de Gestión de Estudiantes (SGE) básico

Descripción del proyecto

El Sistema de Gestión de Estudiantes (SGE) es una aplicación de consola desarrollada en Java que permite registrar, visualizar y buscar estudiantes mediante un menú interactivo.

Este proyecto tiene como finalidad aplicar los fundamentos de programación, especialmente las estructuras de control, el uso de listas dinámicas, las variables de control y la organización del código mediante clases y métodos reutilizables.

Objetivo general

Desarrollar un sistema básico de gestión de estudiantes utilizando Java, que permita administrar registros estudiantiles de manera sencilla y organizada.

Funcionalidades

Agregar estudiantes: permite registrar un estudiante con ID, nombre y edad.

Mostrar estudiantes: presenta todos los estudiantes registrados.

Buscar estudiante por ID: permite localizar un estudiante mediante su identificador.

Salir: finaliza la ejecución del programa.

El sistema también valida entradas numéricas, evita registrar identificadores duplicados y controla errores básicos.

Tecnologías utilizadas

Lenguaje de programación: Java.

Entorno de desarrollo: Visual Studio Code.

Almacenamiento: ArrayList.

Control de versiones: Git y GitHub.

Estructura del proyecto

sistema-gestion-estudiantes-java/
└── src/
    ├── Main.java
    ├── Estudiante.java
    └── GestionEstudiantes.java

Estructuras de control implementadas

Estructura

Aplicación

while

Repetición del menú principal.

switch

Selección de las funcionalidades.

if / else

Validación de datos y búsqueda de estudiantes.

for

Recorrido de la lista de estudiantes.

try / catch

Manejo de entradas incorrectas.

Instrucciones de ejecución

Requisito: tener instalado el JDK de Java.

Descargar o clonar el repositorio.

Abrir la carpeta del proyecto en Visual Studio Code.

Abrir una terminal en la carpeta principal.

Compilar el programa:

javac -d src src/*.java

Ejecutar:

java -cp src Main

Menú principal

==================================
 SISTEMA DE GESTION DE ESTUDIANTES
==================================
1. Agregar estudiante
2. Mostrar estudiantes
3. Buscar estudiante por ID
4. Salir
==================================
Seleccione una opcion:

Pruebas funcionales

Se verificaron las siguientes funcionalidades:

Registro de estudiantes.

Visualización de múltiples estudiantes.

Búsqueda exitosa por ID.

Búsqueda de estudiantes inexistentes.

Validación de identificadores duplicados.

Manejo de entradas numéricas incorrectas.

Finalización correcta del programa.

Limitaciones

Los registros se almacenan temporalmente en memoria mediante ArrayList. Al finalizar el programa, los datos no se conservan.

Conclusión

El desarrollo del SGE permitió aplicar estructuras de control, programación orientada a objetos, validación de entradas y reutilización de métodos. El proyecto constituye una base funcional que puede ampliarse posteriormente mediante almacenamiento persistente, edición y eliminación de registros.
Conclusión

El desarrollo del SGE permitió aplicar estructuras de control, programación orientada a objetos, validación de entradas y reutilización de métodos. El proyecto constituye una base funcional que puede ampliarse posteriormente mediante almacenamiento persistente, edición y eliminación de registros.
