package com.example.charleyking.coolweather.util;

/**
 * Created by charleyking on 2/22/16.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
