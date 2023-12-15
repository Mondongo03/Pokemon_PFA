package com.example.recyclerview;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PokemonRepositorio {


    Executor executor = Executors.newSingleThreadExecutor();

    PokemonBaseDeDatos.ElementosDao pokemonsDao;

    PokemonRepositorio(Application application){
        pokemonsDao = PokemonBaseDeDatos.obtenerInstancia(application).obtenerElementosDao();


    }
    LiveData<List<Pokemon>> obtener(){
        return pokemonsDao.obtener();
    }

    LiveData<List<Pokemon>> buscar(String t) {
        return pokemonsDao.buscar(t);
    }

    void insertar(Pokemon pokemon){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                pokemonsDao.insertar(pokemon);
            }
        });
    }

    void eliminar(Pokemon pokemon) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                pokemonsDao.eliminar(pokemon);
            }
        });
    }
}
