package com.example.lab_sistemas.aplicacionejemplo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *
 * @author Gustavo Lizarraga
 * @date 05/06/2017
 *
 * */

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<listas> items;

    public CustomAdapter(Activity activity, ArrayList data) {
        this.context = activity;
        this.items = data;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listas, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //Se recupera un objeto Pokemon en determinada posicion y lo seteamos al Holder para la lista
        listas itemTemp = (listas) getItem(position);
        viewHolder.itemTitulo.setText(itemTemp.getTitulo());
        viewHolder.itemSubtituo.setText(itemTemp.getSubtitulo());
        viewHolder.itemImagen.setImageResource(itemTemp.getImagen());

        return convertView;
    }

    private class ViewHolder {
        TextView itemTitulo;
        TextView itemSubtituo;
        ImageView itemImagen;

        public ViewHolder(View view) {
            itemTitulo = (TextView)view.findViewById(R.id.tvTitulo);
            itemSubtituo = (TextView) view.findViewById(R.id.tvSubtitulo);
            itemImagen = (ImageView) view.findViewById(R.id.ivImagen);
        }
    }

}
