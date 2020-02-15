package com.example.witparkingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class  ParkingMapActivity :AppCompatActivity() , OnMapReadyCallback   {

       lateinit var mMap: GoogleMap
       lateinit var mapFragment: SupportMapFragment



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_map)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val wit = LatLng(52.247173, -7.140114)
        mMap.addMarker(MarkerOptions().position(wit).title("Marker in WIT"))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wit,18f))
    }
}
