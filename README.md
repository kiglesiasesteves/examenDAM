# examenDAM
Para utilizarlo en el examen:
Ejercicio 1:
Entramos en el github y seleccionamos el repositorio remoto que queremos crear. Clicamos en "Fork" y automaticamente ya nos aparecerá la creación de un nuevo repositorio. 
Abrimos la terminal y utilizando los comandos ls y cd entramos hasta la carpeta donde queremos realizar el clonado.
Cuando entremos a esa carpeta realizamos el comando de clonado :git clone -o clonado https://github.com/kiglesiasesteves/examenDAM.git
(EN este caso el repositorio es el nuestro propio)
Ahora que ya tenemos el clonado abrimos el intellij y abrimos un nuevo proyecto con estas caracteristicas:
New Project>Project from existing sources>Seleccionamos nuestra carpeta>Create Project from exisitng sources>Next>(Abrimos el proyecto)
Tras este procedimiento ya tendremos el archivo abierto en nuestro IDE.Al realizar un git remote -v podemos ver como el repositorio remoto de referencia es el nuestro propio. Mientras que en la parte anterior teniamos 4 direcciones url entre las cuales está el repositorio remoto del cual hicimos elclonado.EN estecasono. 
TRas añadir un programa, subimos otra vez al githubeste proyecto.
Abrimos la terminal del intellij yrealizamos los pasos para subir este md.
git init
git add README.md
git commit -m "ejercicio2"
git branch -M main
git remote add origin https://github.com/kiglesiasesteves/examenDAM.git
git push -u origin main