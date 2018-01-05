package com.example.aa.activity7;


import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class Loader extends AsyncTaskLoader<JsonInfo> {
    private String StringwebUrl;

    public Loader(Context context, String url) {
        super(context);
        this.StringwebUrl = url;

    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public JsonInfo loadInBackground() {

        JsonInfo jsonInformation = Utils.GetURLData(makeURL(StringwebUrl));
        return jsonInformation;
    }

    public URL makeURL(String url){
        URL weburl= null;
        try {
            weburl = new URL(url);
        } catch (MalformedURLException e) {
            Log.e("Loader", e.getMessage());
        }
        return weburl;
    }
}