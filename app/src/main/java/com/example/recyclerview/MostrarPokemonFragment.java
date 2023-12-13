package com.example.recyclerview;

import android.graphics.Color;
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
                    case "Electrico":
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
                    case "Psiquico":
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
                    case "Dragon":
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
                binding.habilidad.setText("Habilidad " + pokemon.habilidad);
                binding.hp.setText(String.valueOf("Hp Base: " + pokemon.hp));
                if (pokemon.hp < 51) {
                    binding.hp.setTextColor(Color.rgb(250, 88, 88));
                }
                else if (pokemon.hp>50 && pokemon.hp<101){
                    binding.hp.setTextColor(Color.rgb( 247, 211, 88));
                }
                else if (pokemon.hp>100 && pokemon.hp<151){
                    binding.hp.setTextColor(Color.rgb( 244, 250, 88));
                }
                else if (pokemon.hp>150 && pokemon.hp<200){
                    binding.hp.setTextColor(Color.rgb(130, 250, 88));
                }
                else if (pokemon.hp>199){
                    binding.hp.setTextColor(Color.rgb( 88, 250, 172 ));
                }
                binding.atq.setText(String.valueOf("Atq Base: " + pokemon.atq));
                if (pokemon.atq < 51) {
                    binding.atq.setTextColor(Color.rgb(250, 88, 88));
                }
                else if (pokemon.atq > 50 && pokemon.atq < 101){
                    binding.atq.setTextColor(Color.rgb(247, 211, 88));
                }
                else if (pokemon.atq > 100 && pokemon.atq < 151){
                    binding.atq.setTextColor(Color.rgb(244, 250, 88));
                }
                else if (pokemon.atq > 150 && pokemon.atq < 200){
                    binding.atq.setTextColor(Color.rgb(130, 250, 88));
                }
                else if (pokemon.atq > 199){
                    binding.atq.setTextColor(Color.rgb(88, 250, 172));
                }
                binding.def.setText(String.valueOf("Def Base: " + pokemon.def));
                if (pokemon.def < 51) {
                    binding.def.setTextColor(Color.rgb(250, 88, 88));
                }
                else if (pokemon.def > 50 && pokemon.def < 101){
                    binding.def.setTextColor(Color.rgb(247, 211, 88));
                }
                else if (pokemon.def > 100 && pokemon.def < 151){
                    binding.def.setTextColor(Color.rgb(244, 250, 88));
                }
                else if (pokemon.def > 150 && pokemon.def < 200){
                    binding.def.setTextColor(Color.rgb(130, 250, 88));
                }
                else if (pokemon.def > 199){
                    binding.def.setTextColor(Color.rgb(88, 250, 172));
                }
                binding.sAtq.setText(String.valueOf("sAtq Base: " + pokemon.sAtq));
                if (pokemon.sAtq < 51) {
                    binding.sAtq.setTextColor(Color.rgb(250, 88, 88));
                }
                else if (pokemon.sAtq > 50 && pokemon.sAtq < 101){
                    binding.sAtq.setTextColor(Color.rgb(247, 211, 88));
                }
                else if (pokemon.sAtq > 100 && pokemon.sAtq < 151){
                    binding.sAtq.setTextColor(Color.rgb(244, 250, 88));
                }
                else if (pokemon.sAtq > 150 && pokemon.sAtq < 200){
                    binding.sAtq.setTextColor(Color.rgb(130, 250, 88));
                }
                else if (pokemon.sAtq > 199){
                    binding.sAtq.setTextColor(Color.rgb(88, 250, 172));
                }
                binding.sDef.setText(String.valueOf("sDef Base: " + pokemon.sDef));
                if (pokemon.sDef < 51) {
                    binding.sDef.setTextColor(Color.rgb(250, 88, 88));
                }
                else if (pokemon.sDef > 50 && pokemon.sDef < 101){
                    binding.sDef.setTextColor(Color.rgb(247, 211, 88));
                }
                else if (pokemon.sDef > 100 && pokemon.sDef < 151){
                    binding.sDef.setTextColor(Color.rgb(244, 250, 88));
                }
                else if (pokemon.sDef > 150 && pokemon.sDef < 200){
                    binding.sDef.setTextColor(Color.rgb(130, 250, 88));
                }
                else if (pokemon.sDef > 199){
                    binding.sDef.setTextColor(Color.rgb(88, 250, 172));
                }
                binding.vel.setText(String.valueOf("Vel Base: " + pokemon.vel));
                if (pokemon.vel < 51) {
                    binding.vel.setTextColor(Color.rgb(250, 88, 88));
                }
                else if (pokemon.vel > 50 && pokemon.vel < 101){
                    binding.vel.setTextColor(Color.rgb(247, 211, 88));
                }
                else if (pokemon.vel > 100 && pokemon.vel < 151){
                    binding.vel.setTextColor(Color.rgb(244, 250, 88));
                }
                else if (pokemon.vel > 150 && pokemon.vel < 200){
                    binding.vel.setTextColor(Color.rgb(130, 250, 88));
                }
                else if (pokemon.vel > 199){
                    binding.vel.setTextColor(Color.rgb(88, 250, 172));
                }


            }
        });
    }
}