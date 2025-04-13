package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;

/* loaded from: classes3.dex */
public final class tw0<T> {

    /* renamed from: a */
    @Nullable
    public final T f55247a;

    /* renamed from: b */
    @Nullable
    public final InterfaceC6025xf.a f55248b;

    /* renamed from: c */
    @Nullable
    public final qh1 f55249c;

    /* renamed from: d */
    public boolean f55250d;

    /* renamed from: com.yandex.mobile.ads.impl.tw0$a */
    public interface InterfaceC5821a {
        /* renamed from: a */
        void mo22923a(qh1 qh1Var);
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw0$b */
    public interface InterfaceC5822b<T> {
        /* renamed from: a */
        void mo22924a(T t);
    }

    private tw0(@Nullable T t, @Nullable InterfaceC6025xf.a aVar) {
        this.f55250d = false;
        this.f55247a = t;
        this.f55248b = aVar;
        this.f55249c = null;
    }

    /* renamed from: a */
    public static <T> tw0<T> m28764a(@Nullable T t, @Nullable InterfaceC6025xf.a aVar) {
        return new tw0<>(t, aVar);
    }

    /* renamed from: a */
    public static <T> tw0<T> m28763a(qh1 qh1Var) {
        return new tw0<>(qh1Var);
    }

    private tw0(qh1 qh1Var) {
        this.f55250d = false;
        this.f55247a = null;
        this.f55248b = null;
        this.f55249c = qh1Var;
    }
}
