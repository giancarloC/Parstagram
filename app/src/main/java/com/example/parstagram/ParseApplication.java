package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Ga71K8IBzp8RD6vJXmMwVDCbM4By014LCtSqXe3Z")
                .clientKey("bPW7DzvtBR7Td8DIs6DDDKVh7k8avHSUqFKIrYrm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
