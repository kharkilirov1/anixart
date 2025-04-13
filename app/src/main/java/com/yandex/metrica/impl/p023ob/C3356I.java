package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.I */
/* loaded from: classes2.dex */
public class C3356I {

    /* renamed from: a */
    @NonNull
    private final Context f43075a;

    /* renamed from: b */
    @NonNull
    private final C3231D f43076b;

    public C3356I(@NonNull Context context) {
        this(context, new C3231D());
    }

    @Nullable
    /* renamed from: a */
    public C3331H m18241a() {
        if (C3658U2.m19211a(28)) {
            return C3306G.m18116a(this.f43075a, this.f43076b);
        }
        return null;
    }

    @VisibleForTesting
    public C3356I(@NonNull Context context, @NonNull C3231D c3231d) {
        this.f43075a = context;
        this.f43076b = c3231d;
    }
}
