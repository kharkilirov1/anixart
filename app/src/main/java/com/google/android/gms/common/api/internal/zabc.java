package com.google.android.gms.common.api.internal;

import android.os.Message;
import androidx.room.util.C0576a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabc extends com.google.android.gms.internal.base.zaq {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            int i3 = zabe.f15502d;
            Objects.requireNonNull(null);
            throw null;
        }
        if (i2 != 2) {
            C0576a.m4123v(31, "Unknown message id: ", i2, "GoogleApiClientImpl");
        } else {
            int i4 = zabe.f15502d;
            Objects.requireNonNull(null);
            throw null;
        }
    }
}
