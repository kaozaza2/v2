package com.mikore.vpn.v2.core;

import android.content.Intent;

interface IOpenVpnServiceInternal {

    void startVpn(in String uuid);

    Intent prepare(in String packageName);

    void disconnect();

    void pause();

    void resume();

    boolean protectSocket(int fd);
}
