# Kata 1 - IntelliJ, Git y GitHub

## Qué es
Esta es la primera kata de IS2. La idea era hacer un proyecto Java sencillo con Maven y aprovecharlo para practicar IntelliJ (atajos, depurador, refactorizar) y Git con GitHub.

Hice una clase Product para la compra de un producto: tiene nombre, precio y cantidad, y calcula cuánto cuesta en total con un descuento si compras muchas unidades y el 21 % de impuesto. La clase Main crea un par de productos y saca el resultado por consola.

## Qué necesitas
- JDK 21 (yo usé Amazon Corretto 21)
- Maven
- IntelliJ IDEA

## Cómo se ejecuta
Se abre el proyecto en IntelliJ y se ejecuta Main con Shift+F10 o con el triángulo verde del main. Si se quiere compilar desde la terminal, vale con mvn compile.

Lo que tiene que salir:

Producto: Monitor x2
Subtotal: 400.0
Descuento: 0.0
Impuesto: 84.0
Precio final: 484.0

Producto: Cable x20
Subtotal: 100.0
Descuento: 10.0
Impuesto: 18.9
Precio final: 108.9

## Las clases
Product guarda el nombre, el precio y la cantidad. Los puse private y final para que no se puedan tocar desde fuera ni cambiar después de crear el producto. Si le pasas un precio negativo o una cantidad de 0 o menos, lanza un error.

El resto no lo guardo, lo calculo cuando hace falta:
- el subtotal es precio por cantidad,
- si compras 10 o más unidades te quita un 10 %,
- el impuesto es el 21 % de lo que queda después del descuento,
- y el precio final es todo junto.

Main solo crea dos productos (uno que no llega al descuento y otro que sí) y los muestra con un método printProduct, para no repetir los mismos println dos veces. No hace ningún cálculo.

## Atajos que he usado
- Alt+1 para ir al árbol del proyecto
- Alt+Insert para crear las clases y para generar el constructor y los getters
- Ctrl+A para elegir todos los atributos al generar
- Alt+Enter para crear printProduct cuando todavía no existía
- psvm + Tab para el main y sout + Tab para los println
- Shift+F10 para ejecutar y Shift+F9 para depurar
- F8 para ir línea a línea y F9 para saltar al siguiente breakpoint
- Shift+F6 para renombrar
- Ctrl+K para los commits, Alt+9 para ver el historial y Alt+F12 para la terminal

## Git
He trabajado siempre en develop y he dejado master para la versión que funciona. Al acabar cada repetición pasaba lo de develop a master con git merge y subía las dos ramas con git push.

Para saber de qué repetición es cada commit, empiezan por rep1, rep2 o rep3.

## Repeticiones
- rep1: es la del vídeo. Creé el proyecto y las dos clases, probé el depurador y renombré getPriceWithTax a calculatePriceWithTax.
- rep2: la volví a hacer desde cero, más ordenado y con un commit por clase. Cambié el producto por un ratón de 50, que con el impuesto se queda en 60.5.
- rep3: quise hacer algo un poco más complicado y añadí la cantidad y el descuento por volumen. Puse un producto que no llega al descuento y otro que sí, para probar los dos casos.

## Comprobaciones
- He revisado a mano los resultados de la consola y son correctos: 2 monitores a 200 dan un total de 484 y 20 cables a 5, con el descuento aplicado, dan 108.9.
- Con un precio negativo o una cantidad de 0 salta el error.
- Puse breakpoints en el constructor y en el cálculo del precio para ver los valores.
- Después de renombrar con Shift+F6, el programa sigue dando lo mismo.
- Cloné el repositorio en otra carpeta y funcionó sin tocar nada.

## Problemas
Al principio String me salía en rojo y no sabía por qué. Era que el JDK 21 no se había descargado entero. Lo borré en File > Project Structure > SDKs, lo volví a descargar y ya funcionó.

## Vídeo
https://youtu.be/udqALh0redQ