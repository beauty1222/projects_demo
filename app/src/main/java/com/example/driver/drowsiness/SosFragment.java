package com.example.driver.drowsiness;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class SosFragment extends Fragment {

    CardView b1,b2,b3,b4;

    public SosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sos, container, false);

        b1 = v.findViewById(R.id.police);
        b2 = v.findViewById(R.id.women);
        b3 = v.findViewById(R.id.hospital);
        b4 = v.findViewById(R.id.fire);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:100"));
                startActivity(intent);
                Toast.makeText(getContext(), "Calling Police Helpline No.", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1090"));
                startActivity(intent);
                Toast.makeText(getContext(), "Calling Women Helpline No", Toast.LENGTH_SHORT).show();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:102"));
                startActivity(intent);
                Toast.makeText(getContext(), "Calling Hospital Helpline No", Toast.LENGTH_SHORT).show();
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:101"));
                startActivity(intent);
                Toast.makeText(getContext(), "Calling Fire Helpline No", Toast.LENGTH_SHORT).show();
            }
        });


        return v;
    }
}