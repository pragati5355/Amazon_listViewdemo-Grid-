package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView amazonlist;
    List<Modelclass> AmazonList;
    Adapteramazon adapteramazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amazonlist = findViewById(R.id.AmazonList);

       AmazonList = new ArrayList<>();

       Modelclass Amazon1 = new Modelclass();
       Amazon1.setTexthead("Zaveri Pearls");
       Amazon1.setText1("Enamelling Mint Green and Pink Stones Kundan...");
       Amazon1.setText2("469");
       Amazon1.setText3("Free Delivery on Orders over 499");
       Amazon1.setImagedp(R.drawable.neck5);
       Amazon1.setImagestar(R.drawable.star4);
       AmazonList.add(Amazon1);

        Modelclass Amazon2 = new Modelclass();
        Amazon2.setTexthead("The Opal Factory");
        Amazon2.setText1("Exclusive Traditional Rajastani Five Layer..");
        Amazon2.setText2("549");
        Amazon2.setText3("Free Delivery");
        Amazon2.setImagedp(R.drawable.neck3);
        Amazon2.setImagestar(R.drawable.star5);
        AmazonList.add(Amazon2);

        Modelclass Amazon3 = new Modelclass();
        Amazon3.setTexthead("ZAVERI PEARLS");
        Amazon3.setText1("Enamelling Multiple Layered Chanbali......");
        Amazon3.setText2("675");
        Amazon3.setText3("Free Delivery by Amazon");
        Amazon3.setImagedp(R.drawable.eyering4);
        Amazon3.setImagestar(R.drawable.star4);
        AmazonList.add(Amazon3);

        Modelclass Amazon4 = new Modelclass();
        Amazon4.setTexthead("ARZONAI");
        Amazon4.setText1("Platted Stones and Diamond Studded Eyering.");
        Amazon4.setText2("255");
        Amazon4.setText3("Free Delivery on Order over 499");
        Amazon4.setImagedp(R.drawable.eyering7);
        Amazon4.setImagestar(R.drawable.star3);
        AmazonList.add(Amazon4);

        Modelclass Amazon5 = new Modelclass();
        Amazon5.setTexthead("JFL");
        Amazon5.setText1("Jewellery For Less Gold Plated Stone and LCD....");
        Amazon5.setText2("314");
        Amazon5.setText3("Free Delivery");
        Amazon5.setImagedp(R.drawable.bindi1);
        Amazon5.setImagestar(R.drawable.star3);
        AmazonList.add(Amazon5);

        Modelclass Amazon6 = new Modelclass();
        Amazon6.setTexthead("MUCH-MORE ");
        Amazon6.setText1("Traditional Beads Chick Choker Necklace set with Earrings...");
        Amazon6.setText2("499");
        Amazon6.setText3("Free Delivery");
        Amazon6.setImagedp(R.drawable.neck4);
        Amazon6.setImagestar(R.drawable.star4);
        AmazonList.add(Amazon6);



        adapteramazon = new Adapteramazon(this,AmazonList);

       amazonlist.setAdapter(adapteramazon);
    }
}