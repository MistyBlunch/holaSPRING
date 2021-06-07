# CS2901 - [Lab5] Translator

## Instrucciones
- Individual
- Tiempo 110 minutos

## Objetivos :dart:
- Interpretar e implementar Requerimientos Funcionales descritos en un Caso de Uso.

## Introducción :ramen:
Muchas veces nos vemos en la necesidad de traducir palabras de un lenguaje a otro. Esta vez implementaremos un traductor de español a inglés.

## Requerimientos :bookmark_tabs:
### Requerimientos Funcionales
- Como usuario podré ingresar a la aplicación sin necesidad de estar registrado.
- Como usuario podré ingresar una frase o texto a ser traducido.

### Requerimientos No Funcionales
- La longitud máxima de caracteres de una frase será de 500 caracteres.
- La cantidad máxima de usuarios concurrentes son 80.
   - Crear Test de Stress que pruebe 80 usuarios conectados al mismo tiempo.
- El tiempo máximo de traducir cada frase no será mayor a 400ms.
   - Medir el tiempo de respuesta de los test.
   
## Caso de Uso :ferris_wheel:
- System:  CS-Translator
- Actor:   User
- Caso de Uso: `CU001` Traducir de Español a Inglés
   - El usuario ingresa a la aplicación
   - La aplicación solicita al usuario el texto a traducir.
   - El usuario ingresa el texto
   - La aplicación muestra el texto traducido 

## Ten en cuenta lo siguiente  :rocket:
### Build
Este comando te permite construir la aplicación compilando el codigo fuente del proyecto

```
mvn compile
```

### Run
Usando este comando podrás ejecutar la aplicación construída en el punto anterior.
```
mvn exec:java -Dexec.mainClass="<MainClassName>"
```

### Sonar Scan
Usando el siguiente comando podrás escanear tu proyecto con SonarCloud. Para más información sobre la configuración de Sonar puedes ingresar [al siguiente link](https://docs.google.com/document/d/1I6Ys17CyuuFFonIjWwUAK322beynL5wN2Gpi9XRpkDg/edit?usp=sharing).
```
mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
```


