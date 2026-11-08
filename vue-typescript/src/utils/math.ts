export function calculateTotal(items: number[], taxRate: number = 0.2): number {
  const sum = items.reduce((acc, val) => acc + val, 0);
  return Number((sum * (1 + taxRate)).toFixed(2));
}

export function formatGreeting(name: string): string {
  const clean = name.trim();
  return clean ? `Bonjour, ${clean} !` : 'Bonjour, Invité !';
}
