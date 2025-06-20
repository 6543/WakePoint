/*
 * Copyright (C) 2018 George Stavrinos (Unlicense)
 * Copyright (C) 2025-present 6543 (GPL-3.0-or-later)
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package wakepoint

import android.location.Address
import android.os.AsyncTask
import android.util.Log
import org.osmdroid.bonuspack.location.GeocoderNominatim
import java.lang.Exception


class ReverseGeocodingAsyncTask(n:String, m:Int) : AsyncTask<String, Int, ArrayList<Address>>() {

    private var name:String = n
    private var maxRes:Int = m

    override fun doInBackground(vararg params: String?) : ArrayList<Address>{
        val foundAddresses = ArrayList<Address>()
        val geocoderNominatim = GeocoderNominatim("name=George Stavrinos,email=stavrinosgeo@gmail.com,app=destination_alarm")
        geocoderNominatim.setService("https://nominatim.openstreetmap.org/")
        try{
            foundAddresses.addAll(geocoderNominatim.getFromLocationName(name, maxRes))
            return foundAddresses
        }
        catch(e: Exception){
            Log.e("ReverseGeocodingAsyncTask", e.toString())
        }
        return foundAddresses
    }
}