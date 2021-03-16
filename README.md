# Horloge de Berlin

Créez une représentation de l'horloge de Berlin pour un temps donné (hh :: mm: ss).
La Berlin Uhr (horloge) est une manière assez étrange d'afficher l'heure.
Sur le dessus de l'horloge, il y a une lampe jaune qui clignote toutes les deux secondes.
Le temps est calculé en ajoutant des lampes rectangulaires.

Les deux premières rangées de lampes sont rouges. Ceux-ci indiquent les heures d'une journée. Dans la rangée du haut, il y a 4 lampes rouges.
Chaque lampe représente 5 heures. Dans la rangée inférieure de lampes rouges, chaque lampe représente 1 heure.
Donc, si deux lampes de la première rangée et trois de la deuxième rangée sont allumées, cela indique 5 + 5 + 3 = 13h ou 13h.

Les deux rangées de lampes du bas comptent les minutes. La première de ces rangées comporte 11 lampes, la seconde 4.
Dans la première rangée, chaque lampe représente 5 minutes.
Dans cette première rangée, les 3e, 6e et 9e feux sont rouges et indiquent le premier quart, la moitié et le dernier quart d'heure.
Les autres lampes sont jaunes. Dans la dernière rangée avec 4 lampes, chaque lampe représente 1 minute.

Les lampes sont allumées de gauche à droite.

Y = jaune
R = rouge
O = éteint

# Exécutez le programme

Pour créer et exécuter ce programme, suivez les instructions suivantes:

```console
$ git clone https://github.com/Bellila/BerlinUhr.git
$ cd BerlinUhr
$ mvn clean package
$ java -jar target/berlinUhr-1.0-SNAPSHOT.jar 10:00

Y Y O O 
O O O O 
O O O O O O O O O O O 
O O O O
```

Notez que vous devriez installer [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) et [Maven](https://maven.apache.org/install.html) comme prérequis.
