package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d61 extends ut0 {

    /* renamed from: d */
    public static final InterfaceC5589pf.a<d61> f49580d = dn1.f49708s;

    /* renamed from: b */
    private final boolean f49581b;

    /* renamed from: c */
    private final boolean f49582c;

    public d61() {
        this.f49581b = false;
        this.f49582c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static d61 m23818b(Bundle bundle) {
        C5220ia.m25473a(bundle.getInt(Integer.toString(0, 36), -1) == 3);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new d61(bundle.getBoolean(Integer.toString(2, 36), false)) : new d61();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof d61)) {
            return false;
        }
        d61 d61Var = (d61) obj;
        return this.f49582c == d61Var.f49582c && this.f49581b == d61Var.f49581b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49581b), Boolean.valueOf(this.f49582c)});
    }

    public d61(boolean z) {
        this.f49581b = true;
        this.f49582c = z;
    }
}
