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

## Exemples

Plusieurs exemples sont disponibles dans le dossier `src/examples`.

- l'exemple 1 montre le premier Ascii Art, avec comme symbole O
- l'exemple 2 montre le deuxième Ascii Art
- l'exemple 3 montre le troisième Ascii Art
