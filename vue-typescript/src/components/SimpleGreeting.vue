<script setup lang="ts">
import { ref } from 'vue';

const props = withDefaults(
  defineProps<{
    title?: string;
    initialCount?: number;
  }>(),
  {
    title: 'Application Vue.js + Vite',
    initialCount: 0,
  }
);

const count = ref<number>(props.initialCount);

function increment(): void {
  count.value++;
}

function reset(): void {
  count.value = props.initialCount;
}
</script>

<template>
  <div class="greeting-box">
    <h1 data-testid="title">{{ title }}</h1>
    <p class="subtitle">Composant Vue avec TypeScript, Vite et Vitest</p>
    
    <div class="counter-section">
      <p data-testid="count-display">Compteur actuel : <strong>{{ count }}</strong></p>
      <div class="actions">
        <button data-testid="btn-increment" @click="increment">Incrémenter (+1)</button>
        <button data-testid="btn-reset" @click="reset">Réinitialiser</button>
      </div>
    </div>
  </div>
</template>

<style scoped>
.greeting-box {
  background: white;
  border-radius: 12px;
  padding: 2rem;
  box-shadow: 0 4px 16px rgba(0, 0, 0, 0.08);
  max-width: 500px;
  margin: 2rem auto;
  text-align: center;
  font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
}

h1 {
  color: #42b883;
  margin-bottom: 0.5rem;
}

.subtitle {
  color: #64748b;
  margin-top: 0;
}

.counter-section {
  margin-top: 1.5rem;
  padding: 1rem;
  background: #f8fafc;
  border-radius: 8px;
}

.actions {
  display: flex;
  gap: 0.5rem;
  justify-content: center;
  margin-top: 1rem;
}

button {
  background-color: #42b883;
  color: white;
  border: none;
  padding: 0.5rem 1rem;
  border-radius: 6px;
  cursor: pointer;
  font-weight: 600;
  transition: background-color 0.2s;
}

button:hover {
  background-color: #33a06f;
}

button[data-testid="btn-reset"] {
  background-color: #94a3b8;
}

button[data-testid="btn-reset"]:hover {
  background-color: #64748b;
}
</style>
