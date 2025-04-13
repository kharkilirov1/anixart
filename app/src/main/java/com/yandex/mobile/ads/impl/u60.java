package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class u60 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5896v0 f55408a;

    /* renamed from: b */
    @NonNull
    private final C6086yp f55409b = new C6086yp();

    /* renamed from: c */
    private final int f55410c;

    public u60(@NonNull InterfaceC5896v0 interfaceC5896v0, int i2) {
        this.f55408a = interfaceC5896v0;
        this.f55410c = i2;
    }

    @Nullable
    /* renamed from: a */
    public final C5812tp m28905a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5612q0 c5612q0, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull C5502nm c5502nm, @Nullable C5600pp c5600pp) {
        DivData m25353a;
        try {
            Objects.requireNonNull(this.f55409b);
            if (!C6086yp.m29956a(context) || c5600pp == null || (m25353a = C5195hp.m25353a(c5600pp)) == null) {
                return null;
            }
            return new C5812tp(m25353a, new C5973wi(adResponse, c5612q0, new ah1(), interfaceC5541ok, new sh0(), c5502nm), this.f55408a, this.f55410c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
