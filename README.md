# DAI Laboratoire 1 - Java IOS & CLI

Cette application prend un texte dans un fichier .txt, le convertit en ASCII Art (à choisir parmi 3 différents) et le renvoie
dans un nouveau fichier .txt

Pour ce faire, nous utilisons picocli qui gère les options en ligne de commande (CLI).

## Points importants

Le programme n'accepte que les caractères **alphanumériques**, ainsi que les symboles suivants:

. , + - _ : ! / '

Les lettres minuscules sont automatiquement converties en majuscules par le programme.

## Clôner et build l'application

Pour clôner le répo avec git, entrez cette commande dans votre terminal à l'emplacement souhaité :
```
//Sans clé SSH
git clone https://github.com/Davtek11/DAI-Lab01.git

//Avec clé SSH
git clone git@github.com:Davtek11/DAI-Lab01.git
```

Pour build le projet en fichier .jar avec l'aide de Maven, entrez cette commande à la racine du projet :
```
./mvnw dependancy:go-offline clean compile package
```

## Run l'application

Pour pouvoir lancer le .jar créé suite build effectué ci-dessus, entrez cette commande :
```
java -jar target/DAI-Lab01-1.0-SNAPSHOT.jar <option>
```

## Options CLI

Premièrement, une ligne de commande d'aide vous est fournie :
```
java -jar target/DAI-Lab01-1.0-SNAPSHOT.jar --help
```

Voici les différentes commandes possible pour notre application :
- `-i, --input <input.txt>` : Emplacement du fichier input.txt à partir de la racine du projet
- `-o, --output <output.txt` : Emplacement du fichier output.txt à partir de la racine du projet
- `-a, --art <1, 2, 3>` : Choix entre les 3 ASCII Art disponibles
-  `-s --symbole <char>` : Choix du symbole utiliser pour le 1er ASCII Art, `#` est utilisé par défaut

A noter que l'option du symbole n'est pas obligatoire et qu'elle n'est utilisée seulement pour le premier
ASCII Art, vous n'êtes donc pas obligé d'entrer cette option. Si vous entrez un symbole pour les deux autres
arts, cela ne changera rien.

Nous avons mis 3 choix différents d'ASCII arts :
1. Texte en gros
2. Texte en petit
3. Texte en 3D
Voici à quoi ressemble la lettre `A` dans les 3 cas :

```
  #             |▓▓▓▓▓ 
 # #      /\    |▓  |▓ 
#####    /--\   |▓▓▓▓▓ 
#   #           |▓  |▓ 
#   #           |▓  |▓ 

```

## Exemples

Plusieurs exemples sont disponibles dans le dossier `src/examples`. Les commandes sont effectuées à la racine du projet.

### Exemple 1

Pour ce exemple, on choisi l'ASCI art 1 et le symbole `O`
```
java -jar target/DAI-Lab01-1.0-SNAPSHOT.jar -i src/examples/ex1_input.txt -o src/examples/ex1_output.txt -a 1 -s O
```
Le texte de base était : `abcdefghijklmnopqrstuvwxyz .,+-/=:! 0123456789`. Et voici le résultat :
```
  O   OOOO   OOO  OOOO  OOOOO OOOOO  OOOO O   O OOOOO OOOOO O   O O     O   O O   O  OOO  OOOO   OOO  OOOO   OOOO OOOOO O   O O   O O   O O   O O   O OOOOO                     O             O         O     O          OOO    O    OOO  OOOOO   OO  OOOOO  OOO  OOOOO  OOO   OOO  
 O O  O   O O   O O   O O     O     O     O   O   O     O   O  O  O     OO OO OO  O O   O O   O O   O O   O O       O   O   O O   O O   O  O O   O O      O                     O            O   OOO          O         O  OO  OO   O   O     O  O O  O     O        O  O   O O   O 
OOOOO OOOO  O     O   O OOOO  OOOO  O OO  OOOOO   O     O   OOO   O     O O O O O O O   O OOOO  O O O OOOO   OOO    O   O   O O   O O   O   O     O    OOO                    OOOOO  OOO    O                 O         O O O   O     OO  OOOOO OOOOO OOOO  OOOO    O   OOOOO OOOOO 
O   O O   O O   O O   O O     O     O   O O   O   O   O O   O  O  O     O   O O  OO O   O O     O  OO O   O     O   O   O   O  O O  O O O  O O    O   O                   O     O          O     OOO                    OO  O   O    O        O    O      O O   O  O    O   O     O 
O   O OOOO   OOO  OOOO  OOOOO O      OOO  O   O OOOOO  O    O   O OOOOO O   O O   O  OOO  O      OOOO O   O OOOO    O    OOO    O    O O  O   O   O   OOOOO         O    O      O         O             O     O          OOO   OOO  OOOOO OOOOO    O  OOOO   OOO  O      OOO  OOOO  
```

### Exemple 2

Pour cet exemple, on choisit l'ASCII art 2
```
java -jar target/DAI-Lab01-1.0-SNAPSHOT.jar -i src/examples/ex2_input.txt -o src/examples/ex2_output.txt -a 2
```
Le texte de base était : `DAI, c'est super !`. Et voici le résultat :
```
                               /     _                                  _             |   
|¯\   /\  ¯|¯             /¯        |_  (¯   ¯|¯       (¯   | |  |¯)   |_  |¯)        |   
|_/  /--\ _|_   /         \_        |_   _)   |         _)  |_|  |¯    |_  |¯\        o   

```

### Exemple 3

Pour cet exemple, on choisit l'ASCII art 3
```
java -jar target/DAI-Lab01-1.0-SNAPSHOT.jar -i src/examples/ex3_input.txt -o src/examples/ex3_output.txt -a 3
```
Le texte de base était : `6/3=2 4+5=9`. Et voici le résultat :
```
 |▓▓▓▓     |▓ |▓▓▓▓         |▓▓▓▓         |▓            |▓▓▓▓▓        |▓▓▓▓▓ 
|▓        |▓     |▓   |▓▓▓     |▓         |▓ |▓    |▓   |▓      |▓▓▓  |▓  |▓ 
|▓▓▓▓▓   |▓    |▓▓▓          |▓▓▓         |▓▓▓▓▓  |▓▓▓  |▓▓▓▓         |▓▓▓▓▓ 
|▓  |▓  |▓       |▓   |▓▓▓  |▓               |▓    |▓      |▓   |▓▓▓      |▓ 
 |▓▓▓  |▓     |▓▓▓▓         |▓▓▓▓▓           |▓         |▓▓▓▓         |▓▓▓▓  

```
