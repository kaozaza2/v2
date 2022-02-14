package com.mikore.vpn.v2.core;

import android.os.Parcel;
import android.os.Parcelable;

public class LogItem implements Parcelable {

    protected LogItem(Parcel in) {
    }

    public static final Creator<LogItem> CREATOR = new Creator<LogItem>() {
        @Override
        public LogItem createFromParcel(Parcel in) {
            return new LogItem(in);
        }

        @Override
        public LogItem[] newArray(int size) {
            return new LogItem[size];
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
