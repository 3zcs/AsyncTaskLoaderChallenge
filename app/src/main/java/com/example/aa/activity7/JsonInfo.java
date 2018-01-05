package com.example.aa.activity7;

import java.util.ArrayList;

/**
 * Created by aa on 1/5/18.
 */

public class JsonInfo {
    String cityName;
    int lon,lat;
    ArrayList<String >restNames;

    public JsonInfo(String cityName, int lon, int lat, ArrayList<String> restNames) {
        this.cityName = cityName;
        this.lon = lon;
        this.lat = lat;
        this.restNames = restNames;

    }

    public String getCityName() {
        return cityName;
    }

    public int getLon() {
        return lon;
    }

    public int getLat() {
        return lat;
    }

    public ArrayList<String> getRestNames() {
        return restNames;
    }
}
