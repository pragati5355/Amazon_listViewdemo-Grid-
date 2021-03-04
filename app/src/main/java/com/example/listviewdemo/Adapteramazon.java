package com.example.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapteramazon extends BaseAdapter {

    Context ncontext;
    List<Modelclass> modelclass;

    public Adapteramazon(Context ncontext, List<Modelclass> modelclass) {
        this.ncontext = ncontext;
        this.modelclass = modelclass;
    }

    @Override
    public int getCount() {
        return modelclass.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View ViewList;
            if (convertView==null){

                LayoutInflater inflater=LayoutInflater.from(ncontext);
                ViewList=inflater.inflate(R.layout.amazon_listview,null);
            } else {
                ViewList=convertView;
            }

        TextView headtxt = ViewList.findViewById(R.id.Amazontxt1);
        TextView Text1 = ViewList.findViewById(R.id.Amazontxt2);
        TextView Text2 =ViewList.findViewById(R.id.Amzaontxt3);
        TextView Text3 =ViewList.findViewById(R.id.Amazontxt4);
        ImageView ImageDP=ViewList.findViewById(R.id.AmazonImagedp);
        ImageView Imagestar=ViewList.findViewById(R.id.Amazonstar);

        Modelclass amazonclass= modelclass.get(position);

        headtxt.setText(amazonclass.getTexthead());
        Text1.setText(amazonclass.getText1());
        Text2.setText(amazonclass.getText2());
        Text3.setText(amazonclass.getText3());
        ImageDP.setImageResource(amazonclass.getImagedp());
        Imagestar.setImageResource(amazonclass.getImagestar());




        return ViewList;
    }
}
