package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.C6 */
/* loaded from: classes2.dex */
public class C3213C6 {

    /* renamed from: a */
    @NonNull
    private Context f42664a;

    /* renamed from: b */
    @NonNull
    private C3188B6 f42665b;

    /* renamed from: c */
    @NonNull
    private C3313G6 f42666c;

    public C3213C6(@NonNull Context context) {
        this(context, new C3188B6(context), new C3313G6(context));
    }

    /* renamed from: a */
    public void m17924a() {
        this.f42664a.getPackageName();
        this.f42666c.m18128a().mo17953a(this.f42665b.m17892a());
    }

    @VisibleForTesting
    public C3213C6(@NonNull Context context, @NonNull C3188B6 c3188b6, @NonNull C3313G6 c3313g6) {
        this.f42664a = context;
        this.f42665b = c3188b6;
        this.f42666c = c3313g6;
    }
}
