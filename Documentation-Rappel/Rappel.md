# Un peu de rappel fait toujours du bien :) 

<hr>

## Java mots clés et compréhension du mot clé

- ### abstract 

    ==> Utilisé pour les classes et méthodes; une classe abstraite ne peut être utiliser pour créer des objets (pour y acceder, elle doit être héritée d'une autre classe). Une méthode abstraite ne peut être utilisé que dans une classe abstraite et n'a pas de corps. Le corps est fourni par la sous-classe héritée. 
    - Exemple sans abstract: 
    ```
    Public void direBonjour(){
        System.out.print("Hello !");
    }
    ```
    - Exemple avec asbtract : 
    ```
    public abstract void direBonjour();
    ```
    - Voici un exemple complet en code
    ```
    abstract class Animal{
        public abstract void faireDuBruit();
    }
    class Chien extends Animal {
        public void faireDuBruit(){
            System.out.println("Wouf !");
        }
    }
    ```
    👉 La classe Animal définit une méthode abstraite, et Chien lui donne une réalité avec un corps { ... }.

    <strong> Voila pour le mot abstract </strong>

- ### assert 

    ==> sert tout simplement à débugguer une étape dans le code.
    <br>
    ⚠️ <strong> Attention : les assert sont désactivés par défaut ! </strong>
    <br>
    Pour les activer : 
    ```
    java -ea MonProgramme
    ```
    -ea => enable assertions

- ### boolean

    ==> une type de donnée pour une variable répondant uniquement par <strong> True or False </strong>

- ### byte 

    ==> une type de donnée pour stocker des valeurs de -128 à 127

- ### char 

    ==> une type de donné utilisé pour garder un seul caractère

- ### class 

    ==> Défénis une classe 

- ### const 

    ==> Défénis une constante à ne pas utiliser dans <strong> final </strong> 

- ### double 

    ==> une type de donné qui range un nombre fractionnel entre 1.7e-308 à 1.7e+308

- ### enum 

    ==> Déclare un type énuméré (immuable)

- ### final 

    ==> une variable ne pourra pas changer si il a "final" devant;
    ==> une méthode ne pourra pas être réécrite si l'attribut final est devant elle;
    ==> une classe avec "final" ne pourra pas être dans une autre classe si elle veut l'avoir dans son extension
