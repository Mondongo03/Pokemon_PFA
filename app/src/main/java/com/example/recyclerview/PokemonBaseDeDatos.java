package com.example.recyclerview;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.List;
import java.util.concurrent.Executors;

@Database(entities = { Pokemon.class }, version = 7, exportSchema = false)
public abstract class PokemonBaseDeDatos extends RoomDatabase {

    public abstract ElementosDao obtenerElementosDao();


    @Dao
    interface ElementosDao {
        @Query("SELECT * FROM Pokemon")
        LiveData<List<Pokemon>> obtener();

        @Query("SELECT * FROM Pokemon WHERE nombre LIKE '%' || :t || '%'")
        LiveData<List<Pokemon>> buscar(String t);

        @Insert
        void insertar(Pokemon pokemon);

        @Delete
        void eliminar(Pokemon pokemon);

    }
    private static volatile PokemonBaseDeDatos INSTANCIA;

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadExecutor().execute(() -> {
                // Obtén el DAO y inserta los Pokémon aquí
                ElementosDao dao = INSTANCIA.obtenerElementosDao();

            });
        }
    };
    static PokemonBaseDeDatos obtenerInstancia(final Context context) {
        if (INSTANCIA == null) {
            synchronized (PokemonBaseDeDatos.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = Room.databaseBuilder(context,
                                    PokemonBaseDeDatos.class, "elementos.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCIA;
    }

}