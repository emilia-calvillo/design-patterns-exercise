# PATRONES DE DISEÑO

1. Hacer fork del proyecto y trabajarlo en tu propio repositorio
2. Ejecutar los archivos .bat del directorio lib para instalar las bibliotecas de prueba
3. Refactorizar el código para que la clase Application se encargue de la lógica de la aplicación sin tener conocimiento de ningún modo de la terminal que está utilizando o el tipo de comunicación (Se sugiere revisar Adapter, Abstract Factory)
4. Evitar que se generen múltiples instancias de los periféricos de las terminales (display, impresora, lectores de tarjetas, etc.), considerar que solo los objetos de la terminal en uso deben ser instanciados
6. La lectura de tarjeta en la clase Application supone que solo se puede leer la tarjeta por banda o por chip. Modificar la lectura de la tarjeta para que se vea así
```java
CardProvider cardProvider = ...;


cardProvider.readCard(card -> {
    //aquí va el código que utiliza la tarjeta para generar la transacción e imprimir el recibo
});

```
El CardProvider es un objeto que debe ser diferente por modelo de terminal para que pueda proveer la información de la tarjeta por cualquier método que soporte ese modelo de terminal (chip, banda, rfid) sin que la clase Application necesite saberlo.
