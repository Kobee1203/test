export interface GreetingOptions {
  name: string;
  shout?: boolean;
}

export function formatGreeting(options: GreetingOptions): string {
  const cleanName = options.name.trim() || 'Monde';
  const message = `Bonjour, ${cleanName} ! Bienvenue sur l'application Node + TypeScript.`;
  return options.shout ? message.toUpperCase() : message;
}
