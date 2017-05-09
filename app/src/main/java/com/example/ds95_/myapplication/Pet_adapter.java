package com.example.ds95_.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.util.List;

/**
 * Created by ds95_ on 2017/5/9.
 */

public class Pet_adapter extends BaseAdapter {
    Context context;
    List<Pet_Item> items;
    public Pet_adapter(Context context,List<Pet_Item> items)
    {
        this.context=context;
        this.items=items;
    }
    private class holder
    {
        ImageView i1;
        TextView t1;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        holder  hdr= new holder();
        LayoutInflater inflater =  (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.pet_list,null);
            hdr.i1=(ImageView)convertView.findViewById(R.id.Pet_Img);
            hdr.t1=(TextView)convertView.findViewById(R.id.Title);
            convertView.setTag(hdr);
        }
        else
        {
            hdr=(holder)convertView.getTag();
        }
        Pet_Item pet_item=(Pet_Item)getItem(position);
        hdr.i1.setImageResource(pet_item.getPet_Img());
        hdr.t1.setText(pet_item.getText());
        return convertView;
    }
    @Override
    public int getCount()
    {
        return items.size();
    }
    @Override
    public Object getItem(int position){return items.get(position);}
    @Override
    public long getItemId(int position){return items.indexOf(getItem(position));}
}
