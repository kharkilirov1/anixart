package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.File;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.jg */
/* loaded from: classes3.dex */
public class C5284jg implements Comparable<C5284jg> {

    /* renamed from: a */
    public final String f51597a;

    /* renamed from: b */
    public final long f51598b;

    /* renamed from: c */
    public final long f51599c;

    /* renamed from: d */
    public final boolean f51600d;

    /* renamed from: e */
    @Nullable
    public final File f51601e;

    /* renamed from: f */
    public final long f51602f;

    public C5284jg(String str, long j2, long j3, long j4, @Nullable File file) {
        this.f51597a = str;
        this.f51598b = j2;
        this.f51599c = j3;
        this.f51600d = file != null;
        this.f51601e = file;
        this.f51602f = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5284jg c5284jg) {
        C5284jg c5284jg2 = c5284jg;
        if (!this.f51597a.equals(c5284jg2.f51597a)) {
            return this.f51597a.compareTo(c5284jg2.f51597a);
        }
        long j2 = this.f51598b - c5284jg2.f51598b;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("[");
        m26356a.append(this.f51598b);
        m26356a.append(", ");
        return C0000a.m19p(m26356a, this.f51599c, "]");
    }
}
