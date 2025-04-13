package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzk extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            throw null;
        }
        if (i2 == 2) {
            throw null;
        }
        new AssetPackException(-100);
        throw null;
    }
}
