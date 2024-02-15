package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void le_premier_pokemon_devrait_gagner_le_deuxieme_grace_a_l_attaque() {
        // Given
        Pokemon premierPokemon = new Pokemon("Samuel", "samuel.png", new Stats(10, 5));
        Pokemon deuxiemePokemon = new Pokemon("Mewtwo", "mewtwo.png", new Stats(5, 5));

        // When
        boolean resultat = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
        //assertTrue(resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void le_deuxieme_pokemon_devrait_gagner_le_premier_grace_a_l_attaque() {
        // Given
        Pokemon premierPokemon = new Pokemon("Samuel", "samuel.png", new Stats(5, 5));
        Pokemon deuxiemePokemon = new Pokemon("Mewtwo", "mewtwo.png", new Stats(10, 5));

        // When
        boolean resultat = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
        //assertFalse(resultat);
        assertThat(resultat).isFalse();
    }

    @Test
    void le_premier_pokemon_devrait_gagner_le_deuxieme_grace_a_la_defense() {
        // Given
        Pokemon premierPokemon = new Pokemon("Samuel", "samuel.png", new Stats(10, 5));
        Pokemon deuxiemePokemon = new Pokemon("Mewtwo", "mewtwo.png", new Stats(10, 4));

        // When
        boolean resultat = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
        //assertTrue(resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void le_deuxieme_pokemon_devrait_gagner_le_premier_grace_a_la_defense() {
        // Given
        Pokemon premierPokemon = new Pokemon("Samuel", "samuel.png", new Stats(10, 4));
        Pokemon deuxiemePokemon = new Pokemon("Mewtwo", "mewtwo.png", new Stats(10, 5));

        // When
        boolean resultat = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
        //assertFalse(resultat);
        assertThat(resultat).isFalse();
    }

    @Test
    void le_premier_pokemon_devrait_gagner_le_deuxieme_grace_a_sa_position() {
        // Given
        Pokemon premierPokemon = new Pokemon("Samuel", "samuel.png", new Stats(10, 10));
        Pokemon deuxiemePokemon = new Pokemon("Mewtwo", "mewtwo.png", new Stats(10, 10));

        // When
        boolean resultat = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
        //assertTrue(resultat);
        assertThat(resultat).isTrue();
    }
}