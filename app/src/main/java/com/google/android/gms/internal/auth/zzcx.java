package com.google.android.gms.internal.auth;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzcx {

    /* renamed from: a */
    public final Uri f16063a;

    /* renamed from: b */
    public final String f16064b = "";

    public zzcx(String str, Uri uri, boolean z) {
        this.f16063a = uri;
    }

    /* renamed from: a */
    public final zzcz<Long> m8341a(String str, long j2) {
        return new zzct(this, str, Long.valueOf(j2));
    }

    /* renamed from: b */
    public final zzcz<Boolean> m8342b(String str, boolean z) {
        return new zzcu(this, str, Boolean.valueOf(z));
    }
}
