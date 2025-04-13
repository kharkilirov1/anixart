package com.yandex.metrica.impl.p023ob;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Z */
/* loaded from: classes2.dex */
public class C3780Z {

    /* renamed from: a */
    @NonNull
    private C3504Nm f44598a;

    public C3780Z() {
        this(new C3504Nm());
    }

    /* renamed from: a */
    public void m19490a() {
        Objects.requireNonNull(this.f44598a);
        SystemClock.elapsedRealtime();
    }

    @VisibleForTesting
    public C3780Z(@NonNull C3504Nm c3504Nm) {
        this.f44598a = c3504Nm;
    }
}
