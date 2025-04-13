package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ni1 {

    /* renamed from: a */
    @NonNull
    private final yo0 f53018a;

    /* renamed from: b */
    @NonNull
    private final l11 f53019b = new l11();

    /* renamed from: com.yandex.mobile.ads.impl.ni1$a */
    public class RunnableC5497a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Map f53020b;

        public RunnableC5497a(Map map) {
            this.f53020b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ni1.this.f53018a.setVisibility(0);
            ni1.m26916a(ni1.this, this.f53020b);
        }
    }

    public ni1(@NonNull yo0 yo0Var) {
        this.f53018a = yo0Var;
    }

    /* renamed from: a */
    public static void m26916a(ni1 ni1Var, Map map) {
        Objects.requireNonNull(ni1Var);
        n60.m26811d("A page has finished loading", new Object[0]);
        yo0 yo0Var = ni1Var.f53018a;
        InterfaceC5719rz interfaceC5719rz = yo0Var.f56895f;
        if (interfaceC5719rz != null) {
            interfaceC5719rz.mo23255a(yo0Var, map);
        }
    }

    /* renamed from: a */
    public final void m26917a(@Nullable Map<String, String> map) {
        this.f53019b.m26317a(new RunnableC5497a(map));
    }
}
