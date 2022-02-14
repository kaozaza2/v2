package com.mikore.vpn.v2.core;

import android.os.Parcel;
import android.os.Parcelable;

public class ConnectionStatus implements Parcelable {

    protected ConnectionStatus(Parcel in) {
    }

    public static final Creator<ConnectionStatus> CREATOR = new Creator<ConnectionStatus>() {
        @Override
        public ConnectionStatus createFromParcel(Parcel in) {
            return new ConnectionStatus(in);
        }

        @Override
        public ConnectionStatus[] newArray(int size) {
            return new ConnectionStatus[size];
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
