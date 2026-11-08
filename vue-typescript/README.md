# Application Web Vue.js 3 + TypeScript + Vite + pnpm

Petite application web avec une page simple, composant réactif, et tests unitaires avec Vitest (tests des composants Vue avec `@vue/test-utils` et tests des fichiers TypeScript).

## Prérequis

- Node.js (>= 18)
- pnpm (`corepack enable pnpm` ou `npm install -g pnpm`)

## Installation des dépendances

```bash
cd vue-typescript
pnpm install
```

## Démarrage en développement

```bash
pnpm dev
```
L'application démarre généralement sur [http://localhost:5173](http://localhost:5173).

## Exécution des tests (Vitest)

Lancer tous les tests (composants et fichiers TypeScript) :
```bash
pnpm test
```

Mode interactif (watch) :
```bash
pnpm test:watch
```

## Compilation pour la production

```bash
pnpm build
```
