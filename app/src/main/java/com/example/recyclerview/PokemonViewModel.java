package com.example.recyclerview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import java.util.List;

import kotlin.jvm.functions.Function1;

public class PokemonViewModel extends AndroidViewModel {

    PokemonRepositorio pokemonRepositorio;


    MutableLiveData<Pokemon> elementoSeleccionado = new MutableLiveData<>();
    MutableLiveData<String> terminoBusqueda = new MutableLiveData<>();

    LiveData<List<Pokemon>> resultadoBusqueda = Transformations.switchMap(terminoBusqueda, new Function1<String, LiveData<List<Pokemon>>>() {
        @Override
        public LiveData<List<Pokemon>> invoke(String input) {
            return pokemonRepositorio.buscar(input);
        }
    });


    public PokemonViewModel(@NonNull Application application) {
        super(application);

        pokemonRepositorio = new PokemonRepositorio(application);
    }

    LiveData<List<Pokemon>> obtener(){
        return pokemonRepositorio.obtener();
    }

    void insertar(Pokemon pokemon){
        pokemonRepositorio.insertar(pokemon);
    }

    void eliminar(Pokemon pokemon){
        pokemonRepositorio.eliminar(pokemon);
    }

    void actualizar(Pokemon pokemon){
        pokemonRepositorio.actualizar(pokemon);
    }

    void seleccionar(Pokemon pokemon){
        elementoSeleccionado.setValue(pokemon);
    }

    MutableLiveData<Pokemon> seleccionado(){
        return elementoSeleccionado;
    }
    LiveData<List<Pokemon>> buscar(){
        return resultadoBusqueda;
    }

    void establecerTerminoBusqueda(String t){
        terminoBusqueda.setValue(t);
    }
}
