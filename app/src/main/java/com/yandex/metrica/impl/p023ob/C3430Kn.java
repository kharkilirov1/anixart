package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Kn */
/* loaded from: classes2.dex */
public class C3430Kn {

    /* renamed from: a */
    private final C3505Nn f43301a;

    /* renamed from: b */
    private final C3505Nn f43302b;

    /* renamed from: c */
    private final C3330Gn f43303c;

    /* renamed from: d */
    @NonNull
    private final C3379Im f43304d;

    /* renamed from: e */
    private final String f43305e;

    public C3430Kn(int i2, int i3, int i4, @NonNull String str, @NonNull C3379Im c3379Im) {
        this(new C3330Gn(i2), new C3505Nn(i3, C0000a.m14k(str, "map key"), c3379Im), new C3505Nn(i4, C0000a.m14k(str, "map value"), c3379Im), str, c3379Im);
    }

    /* renamed from: a */
    public C3330Gn m18464a() {
        return this.f43303c;
    }

    /* renamed from: b */
    public C3505Nn m18466b() {
        return this.f43301a;
    }

    /* renamed from: c */
    public C3505Nn m18467c() {
        return this.f43302b;
    }

    @VisibleForTesting
    public C3430Kn(@NonNull C3330Gn c3330Gn, @NonNull C3505Nn c3505Nn, @NonNull C3505Nn c3505Nn2, @NonNull String str, @NonNull C3379Im c3379Im) {
        this.f43303c = c3330Gn;
        this.f43301a = c3505Nn;
        this.f43302b = c3505Nn2;
        this.f43305e = str;
        this.f43304d = c3379Im;
    }

    /* renamed from: a */
    public void m18465a(@NonNull String str) {
        if (this.f43304d.m21337c()) {
            this.f43304d.m21336c("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f43305e, Integer.valueOf(this.f43303c.m18182a()), str);
        }
    }
}
