package com.example.recyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.databinding.FragmentNuevoElementoBinding;

public class NuevoPokemonFragment extends Fragment {

    private FragmentNuevoElementoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentNuevoElementoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        PokemonViewModel pokemonViewModel = new ViewModelProvider(requireActivity()).get(PokemonViewModel.class);
        NavController navController = Navigation.findNavController(view);

        binding.crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = binding.nombre.getText().toString();
                String descripcion = binding.descripcion.getText().toString();
                String tipo1 = binding.tipo1.getSelectedItem().toString();
                String tipo2 = binding.tipo2.getSelectedItem().toString();
                String habilidad = binding.habilidad.getText().toString();
                int hp = Integer.parseInt(binding.hp.getText().toString());
                int atq = Integer.parseInt(binding.atq.getText().toString());
                int def = Integer.parseInt(binding.def.getText().toString());
                int sAtq = Integer.parseInt(binding.sAtq.getText().toString());
                int sDef = Integer.parseInt(binding.sDef.getText().toString());
                int vel = Integer.parseInt(binding.vel.getText().toString());
                String mov1 = binding.mov1.getText().toString();
                String mov2 = binding.mov2.getText().toString();
                String mov3 = binding.mov3.getText().toString();
                String mov4 = binding.mov4.getText().toString();

                Pokemon nuevoPokemon = new Pokemon(titulo, descripcion, tipo1, tipo2, hp, atq, def, sAtq, sDef, vel, mov1, mov2, mov3, mov4, habilidad);

                pokemonViewModel.insertar(nuevoPokemon);
                navController.popBackStack();
            }
        });
    }
}