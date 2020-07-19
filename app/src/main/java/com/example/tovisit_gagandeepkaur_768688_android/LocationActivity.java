package com.example.tovisit_gagandeepkaur_768688_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;

public class LocationActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerDragListener {
    private GoogleMap mMap;
    private int REQUEST_CODE = 1;

    private int position;
    private String selectedadress;
    private boolean alreadyAdded = false;

    public final int RADIUS = 1500;
    double latitude,longitude;
    double destinationLatitude, destinationLongitude;

    public static boolean requestedDirection,locationSelected;
    public static String distance,duration;
    private static int locationVisited = 0;

    Button addFavourite;
    CheckBox checkBoxVisited;

    DataBaseHelper dataBaseHelper;

    FusedLocationProviderClient fusedLocationProviderClient;
    LocationRequest locationRequest;
    LocationCallback locationCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }

    @Override
    public void onMarkerDragStart(Marker marker) {

    }

    @Override
    public void onMarkerDrag(Marker marker) {

    }

    @Override
    public void onMarkerDragEnd(Marker marker) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
