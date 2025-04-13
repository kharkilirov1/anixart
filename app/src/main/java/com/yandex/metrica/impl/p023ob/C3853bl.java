package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3727Wl;

/* renamed from: com.yandex.metrica.impl.ob.bl */
/* loaded from: classes2.dex */
class C3853bl {

    /* renamed from: a */
    @NonNull
    private final C3402Jk f44838a;

    /* renamed from: b */
    @NonNull
    private final C3726Wk f44839b;

    /* renamed from: c */
    private final int f44840c;

    public C3853bl(@NonNull AbstractC3801Zk<?> abstractC3801Zk, int i2) {
        this(abstractC3801Zk, i2, new C3402Jk(abstractC3801Zk.m19528b()));
    }

    @Nullable
    /* renamed from: a */
    public C3727Wl.b m19662a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, C3727Wl.b> m19364a = this.f44839b.m19364a(this.f44840c, str);
        if (m19364a != null) {
            return (C3727Wl.b) m19364a.second;
        }
        C3727Wl.b m18414a = this.f44838a.m18414a(str);
        this.f44839b.m19366a(this.f44840c, str, m18414a != null, m18414a);
        return m18414a;
    }

    @VisibleForTesting
    public C3853bl(@NonNull AbstractC3801Zk<?> abstractC3801Zk, int i2, @NonNull C3402Jk c3402Jk) {
        this.f44840c = i2;
        this.f44838a = c3402Jk;
        this.f44839b = abstractC3801Zk.m19527a();
    }
}
