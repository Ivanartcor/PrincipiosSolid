# Taller Formativo: Principios SOLID

Este proyecto es parte de un taller formativo realizado en el Grado de Desarrollo de Aplicaciones Web (DAW), donde se explican y practican los **Principios SOLID** en el contexto de la programación orientada a objetos. El objetivo es comprender cómo aplicar estos principios para crear software escalable, mantenible y robusto.

## Estructura del Proyecto

El proyecto está organizado en directorios que representan los diferentes principios SOLID. Dentro de cada carpeta, hay ejemplos de código que ilustran tanto el cumplimiento como la violación de cada principio, utilizando Java como lenguaje de programación.

### Carpetas Principales:

1. **principioDIP (Inversión de Dependencia)**  
   - `cumplimientoDIP`: Ejemplos donde se aplica correctamente el principio DIP.
   - `violacionDIP`: Ejemplos donde el principio DIP es violado.
   - Ficheros de información adicional (`DIPInfo.txt`): Explicación del principio y cómo evitar violaciones comunes.

2. **principioISP (Segregación de Interfaces)**  
   - `cumplimientoISP`: Implementación correcta de la segregación de interfaces.
   - `violacionISP`: Ejemplos que muestran cómo se viola este principio.
   - Ficheros de información adicional (`ISPInfo.txt`): Detalles sobre cómo aplicar el principio ISP.

3. **principioLSP (Sustitución de Liskov)**  
   - `cumplimientoLSP`: Clases que respetan el principio LSP.
   - `violacionLSP`: Casos donde no se respeta el principio.
   - Documentación adicional (`LSPInfo.txt`): Guía para entender el principio LSP.

4. **principioOCP (Abierto/Cerrado)**  
   - `cumplimientoOCP`: Ejemplos donde se respeta el principio OCP, permitiendo la extensión sin modificar clases existentes.
   - `violacionOCP`: Casos que demuestran violaciones al principio OCP.
   - Explicación adicional (`OCPInfo.txt`): Descripción detallada sobre la correcta implementación del principio.

5. **principioSRP (Responsabilidad Única)**  
   - `cumplimientoSRP`: Ejemplos que muestran el cumplimiento del principio SRP.
   - `violacionSRP`: Casos de violación al principio SRP.
   - Documentación explicativa (`SRPInfo.txt`): Cómo aplicar el principio SRP en el diseño de clases.

## ¿Qué son los Principios SOLID?

Los principios SOLID son un conjunto de directrices fundamentales para el diseño de software orientado a objetos, que buscan mejorar la calidad del código y facilitar su mantenimiento y evolución. Aquí tienes un resumen de cada principio:

1. **Principio de Responsabilidad Única (SRP)**:  Una clase debe tener una única razón para cambiar, es decir, debe tener una única responsabilidad o motivo de cambio. Este principio ayuda a mantener el código organizado y reduce el acoplamiento.
2. **Principio de Abierto/Cerrado (OCP)**: Las entidades de software (como clases y módulos) deben estar abiertas para la extensión pero cerradas para la modificación. Esto significa que el código debe permitir la adición de nuevas funcionalidades sin cambiar el código existente.
3. **Principio de Sustitución de Liskov (LSP)**:  Las clases derivadas deben poder reemplazar a sus clases base sin alterar el comportamiento correcto del programa. Este principio asegura que las subclases sean completamente intercambiables con sus clases base.
4. **Principio de Segregación de Interfaces (ISP)**: Los clientes no deben verse obligados a depender de interfaces que no utilizan. En su lugar, se deben crear interfaces específicas para cada cliente, evitando que las clases implementen métodos que no necesitan.
5. **Principio de Inversión de Dependencias (DIP)**: Las clases de alto nivel no deben depender de clases de bajo nivel, sino de abstracciones. Las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las abstracciones. Este principio reduce el acoplamiento y mejora la flexibilidad.

