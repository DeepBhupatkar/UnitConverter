package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class List extends Fragment {

    CardView cardview1, cardview2, cardview3, cardview4, cardview5, cardview6, cardview7, cardview8, cardview9, cardview10,
            cardview11, cardview12, cardview13, cardview14, cardview15, cardview16, cardview17, cardview18, cardview19, cardview20,
            cardview21, cardview22, cardview23, cardview24, cardview25, cardview26, cardview27, cardview28, cardview29, cardview30,
            cardview31, cardview32, cardview33, cardview34, cardview35, cardview36, cardview37, cardview38, cardview39, cardview40,
            cardview41, cardview42, cardview43, cardview44, cardview45, cardview46, cardview47, cardview48, cardview49, cardview50,
            cardview51, cardview52, cardview53, cardview54, cardview55, cardview56, cardview57, cardview58, cardview59, cardview60,
            cardview61, cardview62, cardview63, cardview64, cardview65, cardview66, cardview67, cardview68, cardview69, cardview70,
            cardview71, cardview72;

    public List() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        cardview1 = view.findViewById(R.id.cardview1);
        cardview2 = view.findViewById(R.id.cardview2);
        cardview3 = view.findViewById(R.id.cardview3);
        cardview4 = view.findViewById(R.id.cardview4);
        cardview5 = view.findViewById(R.id.cardview5);
        cardview6 = view.findViewById(R.id.cardview6);
        cardview7 = view.findViewById(R.id.cardview7);
        cardview8 = view.findViewById(R.id.cardview8);
        cardview9 = view.findViewById(R.id.cardview9);
        cardview10 = view.findViewById(R.id.cardview10);
        cardview11 = view.findViewById(R.id.cardview11);
        cardview12 = view.findViewById(R.id.cardview12);
        cardview13 = view.findViewById(R.id.cardview13);
        cardview14 = view.findViewById(R.id.cardview14);
        cardview15 = view.findViewById(R.id.cardview15);
        cardview16 = view.findViewById(R.id.cardview16);
        cardview17 = view.findViewById(R.id.cardview17);
        cardview18 = view.findViewById(R.id.cardview18);
        cardview19 = view.findViewById(R.id.cardview19);
        cardview20 = view.findViewById(R.id.cardview20);
        cardview21 = view.findViewById(R.id.cardview21);
        cardview22 = view.findViewById(R.id.cardview22);
        cardview23 = view.findViewById(R.id.cardview23);
        cardview24 = view.findViewById(R.id.cardview24);
        cardview25 = view.findViewById(R.id.cardview25);
        cardview26 = view.findViewById(R.id.cardview26);
        cardview27 = view.findViewById(R.id.cardview27);
        cardview28 = view.findViewById(R.id.cardview28);
        cardview29 = view.findViewById(R.id.cardview29);
        cardview30 = view.findViewById(R.id.cardview30);
        cardview31 = view.findViewById(R.id.cardview31);
        cardview32 = view.findViewById(R.id.cardview32);
        cardview33 = view.findViewById(R.id.cardview33);
        cardview34 = view.findViewById(R.id.cardview34);
        cardview35 = view.findViewById(R.id.cardview35);
        cardview36 = view.findViewById(R.id.cardview36);
        cardview37 = view.findViewById(R.id.cardview37);
        cardview38 = view.findViewById(R.id.cardview38);
        cardview39 = view.findViewById(R.id.cardview39);
        cardview40 = view.findViewById(R.id.cardview40);
        cardview41 = view.findViewById(R.id.cardview41);
        cardview42 = view.findViewById(R.id.cardview42);
        cardview43 = view.findViewById(R.id.cardview43);
        cardview44 = view.findViewById(R.id.cardview44);
        cardview45 = view.findViewById(R.id.cardview45);
        cardview46 = view.findViewById(R.id.cardview46);
        cardview47 = view.findViewById(R.id.cardview47);
        cardview48 = view.findViewById(R.id.cardview48);
        cardview49 = view.findViewById(R.id.cardview49);
        cardview50 = view.findViewById(R.id.cardview50);
        cardview51 = view.findViewById(R.id.cardview51);
        cardview52 = view.findViewById(R.id.cardview52);
        cardview53 = view.findViewById(R.id.cardview53);
        cardview54 = view.findViewById(R.id.cardview54);
        cardview55 = view.findViewById(R.id.cardview55);
        cardview56 = view.findViewById(R.id.cardview56);
        cardview57 = view.findViewById(R.id.cardview57);
        cardview58 = view.findViewById(R.id.cardview58);
        cardview59 = view.findViewById(R.id.cardview59);
        cardview60 = view.findViewById(R.id.cardview60);
        cardview61 = view.findViewById(R.id.cardview61);
        cardview62 = view.findViewById(R.id.cardview62);
        cardview63 = view.findViewById(R.id.cardview63);
        cardview64 = view.findViewById(R.id.cardview64);
        cardview65 = view.findViewById(R.id.cardview65);
        cardview66 = view.findViewById(R.id.cardview66);
        cardview67 = view.findViewById(R.id.cardview67);
        cardview68 = view.findViewById(R.id.cardview68);
        cardview69 = view.findViewById(R.id.cardview69);
        cardview70 = view.findViewById(R.id.cardview70);
        cardview71 = view.findViewById(R.id.cardview71);
        cardview72 = view.findViewById(R.id.cardview72);

        cardview1.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), Temperature.class));
        });
        cardview2.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview2", Toast.LENGTH_SHORT).show();
        });
        cardview3.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview3", Toast.LENGTH_SHORT).show();
        });
        cardview4.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview4", Toast.LENGTH_SHORT).show();
        });
        cardview5.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview5", Toast.LENGTH_SHORT).show();
        });
        cardview6.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview6", Toast.LENGTH_SHORT).show();
        });
        cardview7.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview7", Toast.LENGTH_SHORT).show();
        });
        cardview8.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview8", Toast.LENGTH_SHORT).show();
        });
        cardview9.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview9", Toast.LENGTH_SHORT).show();
        });
        cardview10.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview10", Toast.LENGTH_SHORT).show();
        });
        cardview11.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview11", Toast.LENGTH_SHORT).show();
        });
        cardview12.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview12", Toast.LENGTH_SHORT).show();
        });
        cardview13.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview13", Toast.LENGTH_SHORT).show();
        });
        cardview14.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview14", Toast.LENGTH_SHORT).show();
        });
        cardview15.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview15", Toast.LENGTH_SHORT).show();
        });
        cardview16.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview16", Toast.LENGTH_SHORT).show();
        });
        cardview17.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview17", Toast.LENGTH_SHORT).show();
        });
        cardview18.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview18", Toast.LENGTH_SHORT).show();
        });
        cardview19.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview19", Toast.LENGTH_SHORT).show();
        });
        cardview20.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview20", Toast.LENGTH_SHORT).show();
        });
        cardview21.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview21", Toast.LENGTH_SHORT).show();
        });
        cardview22.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview22", Toast.LENGTH_SHORT).show();
        });
        cardview23.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview23", Toast.LENGTH_SHORT).show();
        });
        cardview24.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview24", Toast.LENGTH_SHORT).show();
        });
        cardview25.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview25", Toast.LENGTH_SHORT).show();
        });
        cardview26.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview26", Toast.LENGTH_SHORT).show();
        });
        cardview27.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview27", Toast.LENGTH_SHORT).show();
        });
        cardview28.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview28", Toast.LENGTH_SHORT).show();
        });
        cardview29.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview29", Toast.LENGTH_SHORT).show();
        });
        cardview30.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview30", Toast.LENGTH_SHORT).show();
        });
        cardview31.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview31", Toast.LENGTH_SHORT).show();
        });
        cardview32.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview32", Toast.LENGTH_SHORT).show();
        });
        cardview33.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview33", Toast.LENGTH_SHORT).show();
        });
        cardview34.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview34", Toast.LENGTH_SHORT).show();
        });
        cardview35.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview35", Toast.LENGTH_SHORT).show();
        });
        cardview36.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview36", Toast.LENGTH_SHORT).show();
        });
        cardview37.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview37", Toast.LENGTH_SHORT).show();
        });
        cardview38.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview38", Toast.LENGTH_SHORT).show();
        });
        cardview39.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview39", Toast.LENGTH_SHORT).show();
        });
        cardview40.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview40", Toast.LENGTH_SHORT).show();
        });
        cardview41.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview41", Toast.LENGTH_SHORT).show();
        });
        cardview42.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview42", Toast.LENGTH_SHORT).show();
        });
        cardview43.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview43", Toast.LENGTH_SHORT).show();
        });
        cardview44.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview44", Toast.LENGTH_SHORT).show();
        });
        cardview45.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview45", Toast.LENGTH_SHORT).show();
        });
        cardview46.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview46", Toast.LENGTH_SHORT).show();
        });
        cardview47.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview47", Toast.LENGTH_SHORT).show();
        });
        cardview48.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview48", Toast.LENGTH_SHORT).show();
        });
        cardview49.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview49", Toast.LENGTH_SHORT).show();
        });
        cardview50.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview50", Toast.LENGTH_SHORT).show();
        });
        cardview51.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview51", Toast.LENGTH_SHORT).show();
        });
        cardview52.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview52", Toast.LENGTH_SHORT).show();
        });
        cardview53.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview53", Toast.LENGTH_SHORT).show();
        });
        cardview54.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview54", Toast.LENGTH_SHORT).show();
        });
        cardview55.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview55", Toast.LENGTH_SHORT).show();
        });
        cardview56.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview56", Toast.LENGTH_SHORT).show();
        });
        cardview57.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview57", Toast.LENGTH_SHORT).show();
        });
        cardview58.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview58", Toast.LENGTH_SHORT).show();
        });
        cardview59.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview59", Toast.LENGTH_SHORT).show();
        });
        cardview60.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview60", Toast.LENGTH_SHORT).show();
        });
        cardview61.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview61", Toast.LENGTH_SHORT).show();
        });
        cardview62.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview62", Toast.LENGTH_SHORT).show();
        });
        cardview63.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview63", Toast.LENGTH_SHORT).show();
        });
        cardview64.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview64", Toast.LENGTH_SHORT).show();
        });
        cardview65.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview65", Toast.LENGTH_SHORT).show();
        });
        cardview66.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview66", Toast.LENGTH_SHORT).show();
        });
        cardview67.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview67", Toast.LENGTH_SHORT).show();
        });
        cardview68.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview68", Toast.LENGTH_SHORT).show();
        });
        cardview69.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview69", Toast.LENGTH_SHORT).show();
        });
        cardview70.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview70", Toast.LENGTH_SHORT).show();
        });
        cardview71.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview71", Toast.LENGTH_SHORT).show();
        });
        cardview72.setOnClickListener(v -> {
            Toast.makeText(getContext(), "cardview72", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}