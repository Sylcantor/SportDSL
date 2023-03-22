# SportDSL

#### Définition des types d'entraînement
```yaml 
entrainement {
  type: (cardio | musculation | mixte)
  duree: (min 30 | max 120) minutes
  intensite: (faible | moderee | elevee)
  frequence: (min 1 | max 7) jours
  ciblage_muscles: (aucun | haut_corps | bas_corps | mixte)
}
```
#### Objectifs de l'utilisateur
```yaml 
objectif {
  perte_de_poids: (min 0 | max 50) kg
  prise_de_muscle: (min 0 | max 20) kg
  amelioration_cardio: (oui | non)
}
```
#### Préférences de l'utilisateur
```yaml 
preferences {
  lieu: (interieur | exterieur | mixte)
  disponibilite: (matin | apres_midi | soir | flexible)
  materiel: (aucun | leger | salle_de_sport)
  invalidite: (aucune | leger | modere | severe)
}
```
#### Durée totale du programme
```yaml 
duree_programme {
  type: (semaines | mois)
  valeur: (min 1 | max 52)  // 1 semaine à 52 semaines ou 1 mois à 12 mois
}
```
#### Exemple d'utilisation
```yaml 
mon_programme_sportif {
  entrainement {
    type: mixte
    duree: 60 minutes
    intensite: moderee
    frequence: 5 jours
    ciblage_muscles: mixte
  }

  objectif {
    perte_de_poids: 10 kg
    prise_de_muscle: 5 kg
    amelioration_cardio: oui
  }

  preferences {
    lieu: interieur
    disponibilite: apres_midi
    materiel: leger
    invalidite: leger
  }

  duree_programme {
    type: mois
    valeur: 3
  }
}
```
