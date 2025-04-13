package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.dm */
/* loaded from: classes2.dex */
public class C3906dm {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3706W0 f44972a;

    /* renamed from: b */
    @NonNull
    private final C3854bm f44973b;

    /* renamed from: com.yandex.metrica.impl.ob.dm$a */
    public static class a {
    }

    @VisibleForTesting
    public C3906dm(@NonNull C3854bm c3854bm, @NonNull InterfaceC3706W0 interfaceC3706W0) {
        this.f44973b = c3854bm;
        this.f44972a = interfaceC3706W0;
    }

    /* renamed from: a */
    public void m19773a(@NonNull String str, @Nullable Throwable th) {
        if (this.f44973b.f44846f) {
            this.f44972a.reportError(str, th);
        }
    }
}
