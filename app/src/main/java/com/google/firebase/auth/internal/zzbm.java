package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzbm {

    /* renamed from: b */
    public static final zzbm f22405b = new zzbm();

    /* renamed from: a */
    public final zzbd f22406a;

    public zzbm() {
        zzbd zzbdVar = zzbd.f22395b;
        if (zzax.f22388c == null) {
            zzax.f22388c = new zzax();
        }
        this.f22406a = zzbdVar;
    }

    /* renamed from: a */
    public final void m12314a(Context context) {
        Objects.requireNonNull(this.f22406a);
        zzbd.m12310a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }

    /* renamed from: b */
    public final void m12315b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f15380c);
        edit.putString("statusMessage", status.f15381d);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }
}
