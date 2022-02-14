package com.mikore.vpn.v2.core;

import android.content.Intent;
import com.mikore.vpn.v2.core.ConnectionStatus;
import com.mikore.vpn.v2.core.LogItem;

interface IStatusCallback {

    oneway void newLogItem(in LogItem item);

    oneway void updateStateString(in String state, in String msg, in int resid, in ConnectionStatus level, in Intent intent);

    oneway void updateByteCount(long inBytes, long outBytes);

    oneway void connectedVPN(String uuid);
}
