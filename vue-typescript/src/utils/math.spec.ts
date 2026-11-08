import { describe, it, expect } from 'vitest';
import { calculateTotal, formatGreeting } from './math';

describe('math & greeting utils (TypeScript)', () => {
  it('calcule correctement la somme avec taxe par défaut de 20%', () => {
    const total = calculateTotal([10, 20, 30]); // 60 * 1.2 = 72
    expect(total).toBe(72);
  });

  it('calcule correctement avec un taux de taxe personnalisé', () => {
    const total = calculateTotal([100], 0.05); // 100 * 1.05 = 105
    expect(total).toBe(105);
  });

  it('formate correctement le message de bienvenue', () => {
    expect(formatGreeting('Thomas')).toBe('Bonjour, Thomas !');
    expect(formatGreeting('   ')).toBe('Bonjour, Invité !');
  });
});
