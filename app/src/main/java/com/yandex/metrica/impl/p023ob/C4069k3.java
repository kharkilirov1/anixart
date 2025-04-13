package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.k3 */
/* loaded from: classes2.dex */
public class C4069k3 {

    /* renamed from: a */
    @NonNull
    private final C3554Pm f45597a;

    /* renamed from: b */
    private Boolean f45598b;

    /* renamed from: c */
    @Nullable
    private InterfaceC3859c1 f45599c;

    /* renamed from: d */
    @Nullable
    private InterfaceC3885d1 f45600d;

    public C4069k3() {
        this(new C3554Pm());
    }

    /* renamed from: a */
    public synchronized InterfaceC3859c1 m20228a(@NonNull Context context, @NonNull C4245qn c4245qn) {
        if (this.f45599c == null) {
            if (m20227a(context)) {
                this.f45599c = new C3526Oj(c4245qn.m20607b(), c4245qn.m20607b().m20670a(), c4245qn.m20606a(), new C3780Z());
            } else {
                this.f45599c = new C4043j3(context, c4245qn);
            }
        }
        return this.f45599c;
    }

    @VisibleForTesting
    public C4069k3(@NonNull C3554Pm c3554Pm) {
        this.f45597a = c3554Pm;
    }

    /* renamed from: a */
    public synchronized InterfaceC3885d1 m20229a(@NonNull Context context, @NonNull InterfaceC3859c1 interfaceC3859c1) {
        if (this.f45600d == null) {
            if (m20227a(context)) {
                this.f45600d = new C3551Pj();
            } else {
                this.f45600d = new C4147n3(context, interfaceC3859c1);
            }
        }
        return this.f45600d;
    }

    /* renamed from: a */
    private synchronized boolean m20227a(@NonNull Context context) {
        if (this.f45598b == null) {
            this.f45598b = Boolean.valueOf(!this.f45597a.m18769a(context));
        }
        return this.f45598b.booleanValue();
    }
}
