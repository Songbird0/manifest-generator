# ManifestGenerator

ManifestGenerator est un outil qui aide à la rédaction du classpath et ainsi éviter les erreurs.

## Pourquoi recréer un outil qui existe déjà ?

Pourquoi pas ?

Dans l'absolu, la particularité de cet outil est qu'il ne dépend d'aucun autre environnement. Vous pouvez très bien l'ajouter à votre toolchain sans problème par le biais d'un script.
Autrement, ce projet a vu le jour principalement pour me former à maven et ses outils.

## Roadmap 0.0.0 à 1.0.0

- [x] Fixer les principales fonctionnalités du générateur.
- [ ] Gestion du classpath.
- [ ] Support des (meta) données supportées initialement par le format `.MF`. (**Optionnel**, peut être reporté à la prochaine roadmap.)
- [ ] Création d'un gestionnaire de commandes.
  - [ ] Fixer les constantes du gestionnaire.
    - Racine de la commande: `mg`;
    - Argument `help`;
    - Argument `mfp`;
    - Argument `jarp`.
- [ ] Création d'un wrapper pour les commandes
  - [ ] Création d'une enum pour l'introspection des types d'arguments.
    - e.g. Root,
    - Argument,
    - Flag.
  - [ ] Création d'une structure pour l'introspection des arguments.

## Contribution

N'envoyez pas de PR qui applique vos modifications directement dans la branche `master`. Créez une nouvelle branche qui contient votre patch, son nom importe peu.

### Conditions

Pas de conditions pour soumettre une PR.

