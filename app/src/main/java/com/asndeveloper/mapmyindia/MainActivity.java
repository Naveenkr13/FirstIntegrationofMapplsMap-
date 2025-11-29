package com.asndeveloper.mapmyindia;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mappls.sdk.maps.MapView;
import com.mappls.sdk.maps.MapplsMap;
import com.mappls.sdk.maps.OnMapReadyCallback;
import com.mappls.sdk.maps.annotations.MarkerOptions;
import com.mappls.sdk.maps.camera.CameraUpdateFactory;
import com.mappls.sdk.maps.geometry.LatLng;

public class MainActivity extends AppCompatActivity {
MapView mpview;
MapplsMap mapplsMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mpview=findViewById(R.id.mapview);
        // when activity is on load map thing
        mpview.onCreate(savedInstanceState);

        mpview.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull MapplsMap Maps) {
                mapplsMap =Maps;
                LatLng Bihar =new LatLng(25.9644,85.2722);
                mapplsMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Bihar,12));

                mapplsMap.addMarker(new MarkerOptions().position(Bihar).title("Bihar").snippet("MapMyIndia"));

            }

            @Override
            public void onMapError(int i, String s) {

            }
        });}
        @Override protected void onStart() { super.onStart(); mpview.onStart(); }
        @Override protected void onResume() { super.onResume(); mpview.onResume(); }
        @Override protected void onPause() { mpview.onPause(); super.onPause(); }
        @Override protected void onStop() { mpview.onStop(); super.onStop(); }
        @Override protected void onDestroy() { mpview.onDestroy(); super.onDestroy(); }
        @Override public void onLowMemory() { super.onLowMemory(); mpview.onLowMemory(); }
        @Override protected void onSaveInstanceState(Bundle out) {
            super.onSaveInstanceState(out);
            mpview.onSaveInstanceState(out);
    }
}