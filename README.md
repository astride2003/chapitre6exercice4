# Exercice 4 – Héritage bancaire en Java (Chapitre 06)

Ce projet Java a été réalisé dans le cadre du **Chapitre 06** du cours **UE Projet Informatique 2**.  
Il a pour but de mettre en pratique le concept d’**héritage en programmation orientée objet (POO)** à travers un exemple de **gestion de comptes bancaires**.

---

##  Objectifs de l’exercice

- Créer une **classe de base** `CompteBancaire`
- Créer des **classes filles** :
  - `CompteCourant` avec une autorisation de découvert
  - `COD` (Certificat de dépôt) avec une durée en mois
- Comprendre et utiliser la notion d’**héritage**
- Manipuler des objets dans une classe principale `Main`

---

##  Structure du projet

Classe Java et Rôle 

`CompteBancaire`:  Classe mère avec les attributs `numero` et `solde` 
`CompteCourant` :Hérite de `CompteBancaire`, ajoute `decouvert` 
`COD`  :Hérite de `CompteBancaire`, ajoute `duree` 
`Main`: Crée les comptes et affiche les informations 

---

##  Instructions d'exécution

1. Ouvrir le projet dans **IntelliJ IDEA**
2. Lancer le fichier **`Main.java`**
3. Le programme crée un `CompteCourant` et un `COD`, puis affiche les informations suivantes :
   - Numéro de compte
   - Solde
   - Découvert autorisé ou durée du dépôt

---

## Technologies utilisées

- Java 17+
- IntelliJ IDEA
- Programmation orientée objet (POO)
- Héritage avec `extends`

---
