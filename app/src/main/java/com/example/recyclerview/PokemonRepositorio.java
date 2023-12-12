package com.example.recyclerview;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PokemonRepositorio {


    Executor executor = Executors.newSingleThreadExecutor();

    PokemonBaseDeDatos.ElementosDao elementosDao;

    PokemonRepositorio(Application application){
        elementosDao = PokemonBaseDeDatos.obtenerInstancia(application).obtenerElementosDao();


    }
    LiveData<List<Pokemon>> obtener(){
        return elementosDao.obtener();
    }

    LiveData<List<Pokemon>> buscar(String t) {
        return elementosDao.buscar(t);
    }

    void insertar(Pokemon pokemon){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                elementosDao.insertar(pokemon);
            }
        });
    }

    void eliminar(Pokemon pokemon) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                elementosDao.eliminar(pokemon);
            }
        });
    }

    public void actualizar(Pokemon pokemon) {
        executor.execute(new Runnable() {
            @Override
            public void run() {

                elementosDao.actualizar(pokemon);
            }
        });
    }
}
