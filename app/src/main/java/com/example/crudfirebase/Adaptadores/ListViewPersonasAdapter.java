package com.example.crudfirebase.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.crudfirebase.Models.Persona;
import com.example.crudfirebase.R;

import java.util.ArrayList;

public class ListViewPersonasAdapter extends BaseAdapter {
    Context context;
    ArrayList<Persona> personaData;
    LayoutInflater layoutInflater;
    Persona personaModel;

    public ListViewPersonasAdapter(Context context, ArrayList<Persona> personaData) {
        this.context = context;
        this.personaData = personaData;
        layoutInflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
        );
    }

    @Override
    public int getCount() {
        return personaData.size();
    }

    @Override
    public Object getItem(int position) {
        return personaData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View covertView, ViewGroup parent) {
        View rowView = covertView;
        if (rowView==null){
            rowView= layoutInflater.inflate(R.layout.lista_personas,
                    null,
                    true);
        }
        //enlazar vistas
        TextView nombre=rowView.findViewById(R.id.nombres);
        TextView telefono= rowView.findViewById(R.id.telefono);
        TextView fecharegistro= rowView.findViewById(R.id.fecharegistro);

        personaModel = personaData.get(position);
        nombre.setText(personaModel.getNombres());
        telefono.setText(personaModel.getTelefono());
        fecharegistro.setText(personaModel.getFecharegitro());

        return rowView;
    }
}
