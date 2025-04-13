package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.dn */
/* loaded from: classes2.dex */
public class C3907dn {

    /* renamed from: a */
    @NonNull
    private final Context f44974a;

    public C3907dn(@NonNull Context context) {
        this.f44974a = context;
    }

    /* renamed from: a */
    public byte[] m19774a() {
        try {
            return C4452ym.m21258b(new StringBuilder(this.f44974a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public byte[] m19775b() {
        try {
            return C4452ym.m21258b(this.f44974a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
