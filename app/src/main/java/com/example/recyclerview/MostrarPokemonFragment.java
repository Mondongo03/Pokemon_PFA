package com.example.recyclerview;

import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.recyclerview.databinding.FragmentMostrarElementoBinding;

import java.util.IllegalFormatCodePointException;


public class MostrarPokemonFragment extends Fragment {
    private FragmentMostrarElementoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentMostrarElementoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        PokemonViewModel pokemonViewModel = new ViewModelProvider(requireActivity()).get(PokemonViewModel.class);

        pokemonViewModel.seleccionado().observe(getViewLifecycleOwner(), new Observer<Pokemon>() {
            @Override
            public void onChanged(Pokemon pokemon) {
                binding.nombre.setText(pokemon.nombre);
                binding.descripcion.setText(pokemon.descripcion);
                switch (pokemon.tipo1) {
                    case "Fuego":
                        binding.tipo1.setImageResource(R.drawable.fuego);
                        break;
                    case "Agua":
                        binding.tipo1.setImageResource(R.drawable.agua);
                        break;
                    case "Planta":
                        binding.tipo1.setImageResource(R.drawable.planta);
                        break;
                    case "Eléctrico":
                        binding.tipo1.setImageResource(R.drawable.electrico);
                        break;
                    case "Hielo":
                        binding.tipo1.setImageResource(R.drawable.hielo);
                        break;
                    case "Lucha":
                        binding.tipo1.setImageResource(R.drawable.lucha);
                        break;
                    case "Veneno":
                        binding.tipo1.setImageResource(R.drawable.veneno);
                        break;
                    case "Tierra":
                        binding.tipo1.setImageResource(R.drawable.tierra);
                        break;
                    case "Volador":
                        binding.tipo1.setImageResource(R.drawable.volador);
                        break;
                    case "Psíquico":
                        binding.tipo1.setImageResource(R.drawable.psiquico);
                        break;
                    case "Bicho":
                        binding.tipo1.setImageResource(R.drawable.bicho);
                        break;
                    case "Roca":
                        binding.tipo1.setImageResource(R.drawable.roca);
                        break;
                    case "Fantasma":
                        binding.tipo1.setImageResource(R.drawable.fantasma);
                        break;
                    case "Dragón":
                        binding.tipo1.setImageResource(R.drawable.dragon);
                        break;
                    case "Siniestro":
                        binding.tipo1.setImageResource(R.drawable.siniestro);
                        break;
                    case "Acero":
                        binding.tipo1.setImageResource(R.drawable.acero);
                        break;
                    case "Hada":
                        binding.tipo1.setImageResource(R.drawable.hada);
                        break;
                }
                switch (pokemon.tipo2) {
                    case "Fuego":
                        binding.tipo2.setImageResource(R.drawable.fuego);
                        break;
                    case "Agua":
                        binding.tipo2.setImageResource(R.drawable.agua);
                        break;
                    case "Planta":
                        binding.tipo2.setImageResource(R.drawable.planta);
                        break;
                    case "Electrico":
                        binding.tipo2.setImageResource(R.drawable.electrico);
                        break;
                    case "Hielo":
                        binding.tipo2.setImageResource(R.drawable.hielo);
                        break;
                    case "Lucha":
                        binding.tipo2.setImageResource(R.drawable.lucha);
                        break;
                    case "Veneno":
                        binding.tipo2.setImageResource(R.drawable.veneno);
                        break;
                    case "Tierra":
                        binding.tipo2.setImageResource(R.drawable.tierra);
                        break;
                    case "Volador":
                        binding.tipo2.setImageResource(R.drawable.volador);
                        break;
                    case "Psiquico":
                        binding.tipo2.setImageResource(R.drawable.psiquico);
                        break;
                    case "Bicho":
                        binding.tipo2.setImageResource(R.drawable.bicho);
                        break;
                    case "Roca":
                        binding.tipo2.setImageResource(R.drawable.roca);
                        break;
                    case "Fantasma":
                        binding.tipo2.setImageResource(R.drawable.fantasma);
                        break;
                    case "Dragon":
                        binding.tipo2.setImageResource(R.drawable.dragon);
                        break;
                    case "Siniestro":
                        binding.tipo2.setImageResource(R.drawable.siniestro);
                        break;
                    case "Acero":
                        binding.tipo2.setImageResource(R.drawable.acero);
                        break;
                    case "Hada":
                        binding.tipo2.setImageResource(R.drawable.hada);
                        break;
                }
                binding.habilidad.setText("Habilidad "+pokemon.habilidad);
                binding.hp.setText(String.valueOf("Hp Base: "+pokemon.hp));
                binding.atq.setText(String.valueOf("Atq Base: "+pokemon.atq));
                binding.def.setText(String.valueOf("Def Base: "+pokemon.def));
                binding.sAtq.setText(String.valueOf("sAtq Base: "+pokemon.sAtq));
                binding.sDef.setText(String.valueOf("sDef Base: "+pokemon.sDef));
                binding.vel.setText(String.valueOf("Vel Base: "+pokemon.vel));
            }
        });
    }
}