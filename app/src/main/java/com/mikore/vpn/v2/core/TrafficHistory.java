package com.mikore.vpn.v2.core;

import android.os.Parcel;
import android.os.Parcelable;

public class TrafficHistory implements Parcelable {

    protected TrafficHistory(Parcel in) {
    }

    public static final Creator<TrafficHistory> CREATOR = new Creator<TrafficHistory>() {
        @Override
        public TrafficHistory createFromParcel(Parcel in) {
            return new TrafficHistory(in);
        }

        @Override
        public TrafficHistory[] newArray(int size) {
            return new TrafficHistory[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
