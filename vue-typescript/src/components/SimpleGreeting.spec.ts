import { describe, it, expect } from 'vitest';
import { mount } from '@vue/test-utils';
import SimpleGreeting from './SimpleGreeting.vue';

describe('SimpleGreeting.vue', () => {
  it('affiche le titre par défaut', () => {
    const wrapper = mount(SimpleGreeting);
    const title = wrapper.find('[data-testid="title"]');
    expect(title.text()).toBe('Application Vue.js + Vite');
  });

  it('affiche un titre personnalisé passé en prop', () => {
    const wrapper = mount(SimpleGreeting, {
      props: {
        title: 'Mon Super Titre',
      },
    });
    const title = wrapper.find('[data-testid="title"]');
    expect(title.text()).toBe('Mon Super Titre');
  });

  it('incrémente le compteur lors du clic sur le bouton', async () => {
    const wrapper = mount(SimpleGreeting, {
      props: { initialCount: 5 },
    });

    const display = wrapper.find('[data-testid="count-display"]');
    expect(display.text()).toContain('5');

    const incrementButton = wrapper.find('[data-testid="btn-increment"]');
    await incrementButton.trigger('click');

    expect(display.text()).toContain('6');
  });

  it('réinitialise le compteur au clic sur réinitialiser', async () => {
    const wrapper = mount(SimpleGreeting, {
      props: { initialCount: 10 },
    });

    const incrementButton = wrapper.find('[data-testid="btn-increment"]');
    await incrementButton.trigger('click');
    expect(wrapper.find('[data-testid="count-display"]').text()).toContain('11');

    const resetButton = wrapper.find('[data-testid="btn-reset"]');
    await resetButton.trigger('click');
    expect(wrapper.find('[data-testid="count-display"]').text()).toContain('10');
  });
});
