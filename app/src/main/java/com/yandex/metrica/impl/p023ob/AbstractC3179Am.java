package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Am */
/* loaded from: classes2.dex */
public abstract class AbstractC3179Am extends AbstractC4480zo {

    /* renamed from: c */
    private static String f42567c = "";

    /* renamed from: b */
    @NonNull
    private final String f42568b;

    public AbstractC3179Am(@Nullable String str) {
        super(false);
        StringBuilder m24u = C0000a.m24u("[");
        m24u.append(C3658U2.m19199a(str));
        m24u.append("] ");
        this.f42568b = m24u.toString();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4480zo
    @NonNull
    /* renamed from: a */
    public String mo17843a() {
        String str = f42567c;
        int i2 = C3509O2.f43529a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f42568b;
        return C0000a.m14k(str, str2 != null ? str2 : "");
    }

    /* renamed from: a */
    public static void m17842a(Context context) {
        StringBuilder m24u = C0000a.m24u("[");
        m24u.append(context.getPackageName());
        m24u.append("] : ");
        f42567c = m24u.toString();
    }
}
