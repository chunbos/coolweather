package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chunbos on 2017/7/25. 12:58
 * mail:china.caichunbo@gmail.com
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }


}