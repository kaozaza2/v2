package com.mikore.vpn.v2.core;

import android.os.ParcelFileDescriptor;
import com.mikore.vpn.v2.core.TrafficHistory;
import com.mikore.vpn.v2.core.IStatusCallback;

interface IServiceStatus {

    ParcelFileDescriptor registerStatusCallback(in IStatusCallback cb);

    void unregisterStatusCallback(in IStatusCallback cb);

    String getLastConnectedVPN();

    TrafficHistory getTrafficHistory();
}
