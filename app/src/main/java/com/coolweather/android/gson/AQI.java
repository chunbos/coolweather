package com.coolweather.android.gson;

/**
 * Created by chunbos on 2017/7/25. 12:47
 * mail:china.caichunbo@gmail.com
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
