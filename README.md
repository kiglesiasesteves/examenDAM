# ExamenContornosSegundaParte
Para utilizarlo en el examen:

## Ejercicio 1:

Entramos en el github y seleccionamos el repositorio remoto que queremos crear.

Clicamos en **"Fork"** y automaticamente ya nos aparecerá la creación de un nuevo repositorio. 

Abrimos la terminal y utilizando los comandos **ls** y **cd** entramos hasta la carpeta donde queremos realizar el clonado.
Cuando entremos a esa carpeta realizamos el comando de clonado 

**git clone -o clonado https://github.com/kiglesiasesteves/examenDAM.git**

(A diferencia de la primera parte, en este caso el repositorio es el nuestro propio).

Ahora que ya tenemos el clonado abrimos el intellij y abrimos un nuevo proyecto con estas caracteristicas:
*New Project>Project from existing sources>Seleccionamos nuestra carpeta>Create Project from exisitng sources>Next>(Abrimos el proyecto)*

Tras este procedimiento ya tendremos el archivo abierto en nuestro IDE. Al realizar un **git remote -v** podemos ver como el repositorio remoto de referencia es el nuestro propio. 
Tras añadir un programa, subimos otra vez al github este proyecto.
Abrimos la terminal del intellij y realizamos los pasos para subir este md.

**git init**

**git add boletin04.java libro.java README.md**

**git commit -m "ejercicio1"**

**git branch -M main**

**git push -u origin main**

## Ejercicio 2:

Creamosen la carpeta raiz un archivo ***.gitignore***, tras crearlo añadimos en el todos los archivos que queremos que no se suban al git cuando estemos trabajando.
Ahora subimos ese archivo a github

**git add .gitignore/**

**git commit -m "ignorado"**

**git push -u origin main**

## Ejercicio 3:

Para crear un archivo jar vamos a:
*Project Structure> Artifacts>+>JAR>Add from modules with dependencies>Escogemos la main class>Apply>OK
(Aquí se nos creará la carpeta out que al entrar en ella y seleccionar elcomando java -jar "nombre del archivo" en terminal se nos ejecutará)*

## Ejercicio 4:
para subir el archivo.jar al github seleccionas con **cd** y **ls** la carpeta out y el archivo.


**git add examenDAM.jar**

**git commit -m "ejercicio4"**

**git push-u origin main**