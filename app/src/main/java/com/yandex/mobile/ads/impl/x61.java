package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x61 implements InterfaceC5589pf {

    /* renamed from: d */
    public static final x61 f56383d = new x61(new w61[0]);

    /* renamed from: e */
    public static final InterfaceC5589pf.a<x61> f56384e = kq1.f52059d;

    /* renamed from: a */
    public final int f56385a;

    /* renamed from: b */
    private final AbstractC4698p<w61> f56386b;

    /* renamed from: c */
    private int f56387c;

    public x61(w61... w61VarArr) {
        this.f56386b = AbstractC4698p.m22053b(w61VarArr);
        this.f56385a = w61VarArr.length;
        m29679a();
    }

    /* renamed from: a */
    public final w61 m29682a(int i2) {
        return this.f56386b.get(i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x61.class != obj.getClass()) {
            return false;
        }
        x61 x61Var = (x61) obj;
        return this.f56385a == x61Var.f56385a && this.f56386b.equals(x61Var.f56386b);
    }

    public final int hashCode() {
        if (this.f56387c == 0) {
            this.f56387c = this.f56386b.hashCode();
        }
        return this.f56387c;
    }

    /* renamed from: a */
    public final int m29681a(w61 w61Var) {
        int indexOf = this.f56386b.indexOf(w61Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: a */
    private void m29679a() {
        int i2 = 0;
        while (i2 < this.f56386b.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.f56386b.size(); i4++) {
                if (this.f56386b.get(i2).equals(this.f56386b.get(i4))) {
                    d90.m23838a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static x61 m29678a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            return new x61(new w61[0]);
        }
        return new x61((w61[]) C5637qf.m27717a(w61.f56027f, parcelableArrayList).toArray(new w61[0]));
    }
}
