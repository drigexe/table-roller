package com.vysocki.yuri.table_roller.interfaces;

import android.support.v4.app.Fragment;

public interface ExternalFragmentEstablisher {

    void setInternalFragment(int frameLayoutId, Fragment internalFragment);
    boolean getTwoPaneMode(int configResourceTwoPaneMode);
    boolean getScreenSize(int configResourceTabletSize);

}
