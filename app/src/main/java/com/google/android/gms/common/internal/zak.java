package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zak implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            throw null;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
