package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.K0 */
/* loaded from: classes2.dex */
public class C3407K0 {

    /* renamed from: a */
    @NonNull
    private final C3484N2 f43259a;

    /* renamed from: b */
    @NonNull
    private final C3481N f43260b;

    public C3407K0(@NonNull Context context) {
        this(new C3484N2(context, "com.yandex.android.appmetrica.build_id"), new C3481N(context, "com.yandex.android.appmetrica.is_offline"));
    }

    @Nullable
    /* renamed from: a */
    public String m18424a() {
        return this.f43259a.m20522a();
    }

    @Nullable
    /* renamed from: b */
    public Boolean m18425b() {
        return this.f43260b.m20522a();
    }

    @VisibleForTesting
    public C3407K0(@NonNull C3484N2 c3484n2, @NonNull C3481N c3481n) {
        this.f43259a = c3484n2;
        this.f43260b = c3481n;
    }
}
