package com.example.maps5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng STMIK = new LatLng(-8.5838186,116.1020135);
        LatLng unram = new LatLng(-8.5816007,116.0945524);
        LatLng Rs = new LatLng(-8.5871283,116.1121504);
        LatLng SPBU = new LatLng(-8.5860097,116.1155774);
        LatLng OMAH_COBEK = new LatLng(-8.5860097,116.1155774);
        LatLng BPJS = new LatLng(-8.5893403,116.1151118);

        mMap.addMarker(new MarkerOptions().position(STMIK).title("STMIK Mataram").snippet("Mataram"));
        mMap.addMarker(new MarkerOptions().position(unram).title("Universitas Mataram").snippet("Mataram"));
        mMap.addMarker(new MarkerOptions().position(Rs).title("Rumah Sakit Islam Siti Hajar").snippet("Caturwarga Mataram"));
        mMap.addMarker(new MarkerOptions().position(SPBU).title("SPBU caturwarga").snippet("Caturwarga Mataram"));
        mMap.addMarker(new MarkerOptions().position(OMAH_COBEK).title("OMAH_COBEK").snippet("Mataram"));
        mMap.addMarker(new MarkerOptions().position(BPJS).title("BPJS").snippet("Mataram"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(STMIK,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(unram,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Rs,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SPBU,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(OMAH_COBEK,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BPJS,15));
    }
}

