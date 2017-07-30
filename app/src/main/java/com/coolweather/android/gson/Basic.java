package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chunbos on 2017/7/25. 12:43
 * mail:china.caichunbo@gmail.com
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
