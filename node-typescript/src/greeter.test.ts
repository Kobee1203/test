import { describe, it, expect } from 'vitest';
import { formatGreeting } from './greeter.js';

describe('formatGreeting', () => {
  it('doit formater un message standard avec un nom', () => {
    const result = formatGreeting({ name: 'Alice' });
    expect(result).toBe("Bonjour, Alice ! Bienvenue sur l'application Node + TypeScript.");
  });

  it('doit utiliser "Monde" par défaut si le nom est vide', () => {
    const result = formatGreeting({ name: '   ' });
    expect(result).toBe("Bonjour, Monde ! Bienvenue sur l'application Node + TypeScript.");
  });

  it('doit mettre en majuscules si l\'option shout est activée', () => {
    const result = formatGreeting({ name: 'Bob', shout: true });
    expect(result).toBe("BONJOUR, BOB ! BIENVENUE SUR L'APPLICATION NODE + TYPESCRIPT.");
  });
});
