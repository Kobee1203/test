import { formatGreeting } from './greeter.js';

function main(): void {
  const message = formatGreeting({ name: 'Développeur' });
  console.log('='.repeat(50));
  console.log(message);
  console.log('='.repeat(50));
}

main();
