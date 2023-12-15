package com.example.recyclerview;

import androidx.lifecycle.LiveData;

import java.util.List;

public class RecyclerBusquedaFragment extends RecyclerPokemonFragment {
    LiveData<List<Pokemon>> obtenerPokemon() {
        return pokemonViewModel.buscar();
    }
}

