package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3727Wl;

/* renamed from: com.yandex.metrica.impl.ob.Wk */
/* loaded from: classes2.dex */
class C3726Wk {

    /* renamed from: a */
    private final C3753Xm<C3751Xk, Pair<Boolean, C3727Wl.b>> f44398a;

    /* renamed from: b */
    private final int f44399b;

    public C3726Wk(int i2, int i3) {
        this.f44398a = new C3776Yk(i2);
        this.f44399b = i3;
    }

    /* renamed from: a */
    public void m19366a(int i2, @NonNull String str, boolean z, @Nullable C3727Wl.b bVar) {
        if (str.length() <= this.f44399b) {
            this.f44398a.m19407a(new C3751Xk(i2, str), new Pair<>(Boolean.valueOf(z), bVar));
        }
    }

    @Nullable
    /* renamed from: a */
    public Pair<Boolean, C3727Wl.b> m19364a(int i2, @NonNull String str) {
        if (str.length() > this.f44399b) {
            return null;
        }
        return this.f44398a.m19406a((C3753Xm<C3751Xk, Pair<Boolean, C3727Wl.b>>) new C3751Xk(i2, str));
    }

    /* renamed from: a */
    public void m19365a() {
        this.f44398a.m19408a();
    }
}
