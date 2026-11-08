<script setup lang="ts">
import SimpleGreeting from './components/SimpleGreeting.vue';
</script>

<template>
  <main class="page-container">
    <header>
      <img src="https://vuejs.org/images/logo.png" alt="Vue Logo" width="64" height="64" />
      <span class="plus">+</span>
      <img src="https://vitejs.dev/logo.svg" alt="Vite Logo" width="64" height="64" />
    </header>

    <SimpleGreeting title="Bienvenue sur Vue 3 + TypeScript" :initial-count="0" />
  </main>
</template>

<style>
body {
  margin: 0;
  background-color: #f1f5f9;
  color: #1e293b;
}

.page-container {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 1rem;
}

header {
  display: flex;
  align-items: center;
  gap: 1.5rem;
  margin-bottom: 1rem;
}

.plus {
  font-size: 2rem;
  font-weight: bold;
  color: #94a3b8;
}
</style>
