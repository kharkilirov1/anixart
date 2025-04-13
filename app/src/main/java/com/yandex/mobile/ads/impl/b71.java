package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b71 implements InterfaceC5589pf {

    /* renamed from: c */
    public static final InterfaceC5589pf.a<b71> f48792c = dn1.f49700k;

    /* renamed from: a */
    public final w61 f48793a;

    /* renamed from: b */
    public final AbstractC4698p<Integer> f48794b;

    public b71(w61 w61Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= w61Var.f56028a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f48793a = w61Var;
        this.f48794b = AbstractC4698p.m22050a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static b71 m22738a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        Objects.requireNonNull(bundle2);
        w61 fromBundle = w61.f56027f.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        Objects.requireNonNull(intArray);
        return new b71(fromBundle, w60.m29385a(intArray));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b71.class != obj.getClass()) {
            return false;
        }
        b71 b71Var = (b71) obj;
        return this.f48793a.equals(b71Var.f48793a) && this.f48794b.equals(b71Var.f48794b);
    }

    public final int hashCode() {
        return (this.f48794b.hashCode() * 31) + this.f48793a.hashCode();
    }
}
