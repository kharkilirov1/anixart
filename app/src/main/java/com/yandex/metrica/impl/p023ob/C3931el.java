package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.el */
/* loaded from: classes2.dex */
class C3931el implements InterfaceC3203Bl {

    /* renamed from: a */
    @NonNull
    private final C3527Ok f45066a;

    public C3931el() {
        this(new C3527Ok());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3203Bl
    /* renamed from: a */
    public boolean mo17906a(@Nullable String str, @NonNull C3854bm c3854bm) {
        if (!c3854bm.f44847g) {
            return !C3658U2.m19213a("allow-parsing", str);
        }
        Objects.requireNonNull(this.f45066a);
        return C3658U2.m19213a("do-not-parse", str);
    }

    @VisibleForTesting
    public C3931el(@NonNull C3527Ok c3527Ok) {
        this.f45066a = c3527Ok;
    }
}
