package com.example.recyclerview;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.databinding.FragmentEficaciasBinding;

import java.util.HashMap;
import java.util.Map;

public class EficaciasFragment extends Fragment {

    private FragmentEficaciasBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentEficaciasBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    binding.calcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Map<String, Map<String, Float>> eficacias = new HashMap<>();

            Map<String, Float> tipoNormal = new HashMap<>();
            tipoNormal.put("Roca", 0.5f);
            tipoNormal.put("Acero", 0.5f);
            tipoNormal.put("Fantasma", 0.0f);
            eficacias.put("Normal", tipoNormal);

            Map<String, Float> tipoLucha = new HashMap<>();
            tipoLucha.put("Normal", 2.0f);
            tipoLucha.put("Hielo", 2.0f);
            tipoLucha.put("Roca", 2.0f);
            tipoLucha.put("Acero", 2.0f);
            tipoLucha.put("Bicho", 0.5f);
            tipoLucha.put("Veneno", 0.5f);
            tipoLucha.put("Volador", 0.5f);
            tipoLucha.put("Psiquico", 0.5f);
            tipoLucha.put("Fantasma", 0.0f);
            eficacias.put("Lucha", tipoLucha);

            Map<String, Float> tipoVolador = new HashMap<>();
            tipoVolador.put("Planta", 2.0f);
            tipoVolador.put("Bicho", 2.0f);
            tipoVolador.put("Lucha", 2.0f);
            tipoVolador.put("Volador", 0.5f);
            tipoVolador.put("Roca", 0.5f);
            tipoVolador.put("Acero", 0.5f);
            eficacias.put("Volador", tipoVolador);

            Map<String, Float> tipoVeneno = new HashMap<>();
            tipoVeneno.put("Planta", 2.0f);
            tipoVeneno.put("Hada", 2.0f);
            tipoVeneno.put("Veneno", 0.5f);
            tipoVeneno.put("Bicho", 0.5f);
            tipoVeneno.put("Lucha", 0.5f);
            tipoVeneno.put("Fantasma", 0.5f);
            eficacias.put("Veneno", tipoVeneno);

            Map<String, Float> tipoTierra = new HashMap<>();
            tipoTierra.put("Fuego", 2.0f);
            tipoTierra.put("Electrico", 2.0f);
            tipoTierra.put("Veneno", 2.0f);
            tipoTierra.put("Roca", 0.5f);
            tipoTierra.put("Planta", 0.5f);
            tipoTierra.put("Bicho", 0.5f);
            tipoTierra.put("Acero", 0.5f);
            eficacias.put("Tierra", tipoTierra);

            Map<String, Float> tipoRoca = new HashMap<>();
            tipoRoca.put("Fuego", 2.0f);
            tipoRoca.put("Hielo", 2.0f);
            tipoRoca.put("Volador", 2.0f);
            tipoRoca.put("Bicho", 2.0f);
            tipoRoca.put("Normal", 0.5f);
            tipoRoca.put("Fuego", 0.5f);
            tipoRoca.put("Lucha", 0.5f);
            tipoRoca.put("Veneno", 0.5f);
            tipoRoca.put("Tierra", 0.5f);
            eficacias.put("Roca", tipoRoca);

            Map<String, Float> tipoBicho = new HashMap<>();
            tipoBicho.put("Planta", 2.0f);
            tipoBicho.put("Psiquico", 2.0f);
            tipoBicho.put("Siniestro", 2.0f);
            tipoBicho.put("Lucha", 0.5f);
            tipoBicho.put("Volador", 0.5f);
            tipoBicho.put("Hada", 0.5f);
            tipoBicho.put("Fuego", 0.5f);
            tipoBicho.put("Acero", 0.5f);
            tipoBicho.put("Veneno", 0.5f);
            tipoBicho.put("Normal", 0.5f);
            eficacias.put("Bicho", tipoBicho);

            Map<String, Float> tipoFantasma = new HashMap<>();
            tipoFantasma.put("Psiquico", 2.0f);
            tipoFantasma.put("Fantasma", 2.0f);
            tipoFantasma.put("Normal", 0.0f);
            tipoFantasma.put("Lucha", 0.0f);
            tipoFantasma.put("Veneno", 0.5f);
            tipoFantasma.put("Insecto", 0.5f);
            tipoFantasma.put("Siniestro", 0.5f);
            eficacias.put("Fantasma", tipoFantasma);

            Map<String, Float> tipoAcero = new HashMap<>();
            tipoAcero.put("Hada", 2.0f);
            tipoAcero.put("Hielo", 2.0f);
            tipoAcero.put("Roca", 2.0f);
            tipoAcero.put("Acero", 0.5f);
            tipoAcero.put("Agua", 0.5f);
            tipoAcero.put("Electrico", 0.5f);
            tipoAcero.put("Fuego", 0.5f);
            tipoAcero.put("Acero", 0.5f);
            tipoAcero.put("Volador", 0.5f);
            tipoAcero.put("Bicho", 0.5f);
            tipoAcero.put("Planta", 0.5f);
            tipoAcero.put("Veneno", 0.0f);
            tipoAcero.put("Normal", 0.0f);
            tipoAcero.put("Lucha", 2.0f);
            tipoAcero.put("Siniestro", 2.0f);
            eficacias.put("Acero", tipoAcero);

            Map<String, Float> tipoPlanta = new HashMap<>();
            tipoPlanta.put("Agua", 0.5f);
            tipoPlanta.put("Tierra", 2.0f);
            tipoPlanta.put("Roca", 1.0f);
            tipoPlanta.put("Volador", 2.0f);
            tipoPlanta.put("Bicho", 2.0f);
            tipoPlanta.put("Fuego", 0.5f);
            tipoPlanta.put("Planta", 0.5f);
            tipoPlanta.put("Veneno", 2.0f);
            tipoPlanta.put("Dragon", 0.5f);
            tipoPlanta.put("Acero", 0.5f);
            eficacias.put("Planta", tipoPlanta);

            Map<String, Float> tipoFuego = new HashMap<>();
            tipoFuego.put("Planta", 2.0f);
            tipoFuego.put("Hielo", 2.0f);
            tipoFuego.put("Bicho", 0.5f);
            tipoFuego.put("Acero", 0.5f);
            tipoFuego.put("Agua", 0.5f);
            tipoFuego.put("Dragon", 0.5f);
            tipoFuego.put("Fuego", 0.5f);
            tipoFuego.put("Roca", 0.5f);
            eficacias.put("Fuego", tipoFuego);

            Map<String, Float> tipoAgua = new HashMap<>();
            tipoAgua.put("Planta", 0.5f);
            tipoAgua.put("Fuego", 2.0f);
            tipoAgua.put("Tierra", 2.0f);
            tipoAgua.put("Roca", 2.0f);
            tipoAgua.put("Agua", 0.5f);
            tipoAgua.put("Dragon", 0.5f);
            eficacias.put("Agua", tipoAgua);

            Map<String, Float> tipoElectrico = new HashMap<>();
            tipoElectrico.put("Agua", 2.0f);
            tipoElectrico.put("Volador", 2.0f);
            tipoElectrico.put("Tierra", 0.0f);
            tipoElectrico.put("Electrico", 0.5f);
            tipoElectrico.put("Planta", 0.5f);
            tipoElectrico.put("Dragon", 0.5f);
            tipoElectrico.put("Acero", 0.5f);
            eficacias.put("Electrico", tipoElectrico);

            Map<String, Float> tipoPsiquico = new HashMap<>();
            tipoPsiquico.put("Lucha", 2.0f);
            tipoPsiquico.put("Veneno", 2.0f);
            tipoPsiquico.put("Psiquico", 0.5f);
            tipoPsiquico.put("Acero", 0.5f);
            tipoPsiquico.put("Siniestro", 0.0f);
            eficacias.put("Psiquico", tipoPsiquico);

            Map<String, Float> tipoHielo = new HashMap<>();
            tipoHielo.put("Planta", 2.0f);
            tipoHielo.put("Tierra", 2.0f);
            tipoHielo.put("Volador", 2.0f);
            tipoHielo.put("Dragon", 2.0f);
            tipoHielo.put("Fuego", 0.5f);
            tipoHielo.put("Agua", 0.5f);
            tipoHielo.put("Hielo", 0.5f);
            tipoHielo.put("Acero", 0.5f);
            eficacias.put("Hielo", tipoHielo);

            Map<String, Float> tipoDragon = new HashMap<>();
            tipoDragon.put("Dragon", 2.0f);
            tipoDragon.put("Acero", 0.5f);
            tipoDragon.put("Hada", 0.0f);
            eficacias.put("Dragon", tipoDragon);

            Map<String, Float> tipoSiniestro = new HashMap<>();
            tipoSiniestro.put("Lucha", 2.0f);
            tipoSiniestro.put("Hada", 2.0f);
            tipoSiniestro.put("Siniestro", 0.5f);
            tipoSiniestro.put("Fantasma", 0.5f);
            tipoSiniestro.put("Psiquico", 0.0f);
            eficacias.put("Siniestro", tipoSiniestro);

            Map<String, Float> tipoHada = new HashMap<>();
            tipoHada.put("Lucha", 2.0f);
            tipoHada.put("Dragon", 2.0f);
            tipoHada.put("Siniestro", 2.0f);
            tipoHada.put("Fuego", 0.5f);
            tipoHada.put("Veneno", 0.5f);
            tipoHada.put("Acero", 0.5f);
            tipoHada.put("Normal", 0.5f);
            tipoHada.put("Planta", 0.5f);
            tipoHada.put("Hada", 0.5f);
            tipoHada.put("Agua", 0.5f);
            tipoHada.put("Electrico", 0.5f);
            tipoHada.put("Volador", 0.5f);
            eficacias.put("Hada", tipoHada);

            String tipo1 = binding.tipo1.getSelectedItem().toString();
            String tipo2 = binding.tipo2.getSelectedItem().toString();

            Map<String, Float> eficaciasTipo1 = eficacias.get(tipo1);
            Map<String, Float> eficaciasTipo2 = eficacias.get(tipo2);

            Map<String, Double> eficaciasCombinadas = new HashMap<>();
            for (String tipo : eficaciasTipo1.keySet()) {
                double eficacia1 = eficaciasTipo1.get(tipo);
                double eficacia2 = eficaciasTipo2.getOrDefault(tipo, 1.0f);
                eficaciasCombinadas.put(tipo, eficacia1 * eficacia2);
            }
            String texto = "";
            for (Map.Entry<String, Double> entry : eficaciasCombinadas.entrySet()) {
                String tipo = entry.getKey();
                double eficacia = entry.getValue();
                texto = texto + (tipo + " " + eficacia + "\n");
            }
            binding.efectividades.setText(texto);
        }
    });

    }
}