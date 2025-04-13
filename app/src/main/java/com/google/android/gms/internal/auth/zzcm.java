package com.google.android.gms.internal.auth;

import android.database.ContentObserver;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzcm extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzcz.f16065b.incrementAndGet();
    }
}
