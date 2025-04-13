package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gy0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zr */
/* loaded from: classes3.dex */
public final class C6137zr {

    /* renamed from: a */
    @NotNull
    private final ou0 f57291a;

    /* renamed from: b */
    @NotNull
    private final C6008x6 f57292b;

    /* renamed from: c */
    @NotNull
    private final ju0 f57293c;

    /* renamed from: d */
    @NotNull
    private final AbstractC5814tr f57294d;

    /* renamed from: e */
    @Nullable
    private gy0.C5152b f57295e;

    /* renamed from: f */
    @Nullable
    private gy0 f57296f;

    /* renamed from: g */
    private int f57297g;

    /* renamed from: h */
    private int f57298h;

    /* renamed from: i */
    private int f57299i;

    /* renamed from: j */
    @Nullable
    private dy0 f57300j;

    public C6137zr(@NotNull ou0 connectionPool, @NotNull C6008x6 address, @NotNull ju0 call, @NotNull AbstractC5814tr eventListener) {
        Intrinsics.m32179h(connectionPool, "connectionPool");
        Intrinsics.m32179h(address, "address");
        Intrinsics.m32179h(call, "call");
        Intrinsics.m32179h(eventListener, "eventListener");
        this.f57291a = connectionPool;
        this.f57292b = address;
        this.f57293c = call;
        this.f57294d = eventListener;
    }

    @NotNull
    /* renamed from: a */
    public final C6008x6 m30286a() {
        return this.f57292b;
    }

    /* renamed from: b */
    public final boolean m30290b() {
        gy0 gy0Var;
        ku0 m25968d;
        int i2 = this.f57297g;
        boolean z = false;
        if (i2 == 0 && this.f57298h == 0 && this.f57299i == 0) {
            return false;
        }
        if (this.f57300j != null) {
            return true;
        }
        dy0 dy0Var = null;
        if (i2 <= 1 && this.f57298h <= 1 && this.f57299i <= 0 && (m25968d = this.f57293c.m25968d()) != null) {
            synchronized (m25968d) {
                if (m25968d.m26274e() == 0) {
                    if (t91.m28513a(m25968d.m26280k().m23960a().m29677k(), this.f57292b.m29677k())) {
                        dy0Var = m25968d.m26280k();
                    }
                }
            }
        }
        if (dy0Var != null) {
            this.f57300j = dy0Var;
            return true;
        }
        gy0.C5152b c5152b = this.f57295e;
        if (c5152b != null && c5152b.m25008b()) {
            z = true;
        }
        if (z || (gy0Var = this.f57296f) == null) {
            return true;
        }
        return gy0Var.m25004a();
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC6089yr m30287a(@NotNull mn0 client, @NotNull pu0 chain) {
        Intrinsics.m32179h(client, "client");
        Intrinsics.m32179h(chain, "chain");
        try {
            return m30285a(chain.m27499c(), chain.m27501e(), chain.m27503g(), client.m26719v(), !Intrinsics.m32174c(chain.m27502f().m22638f(), "GET")).m26262a(client, chain);
        } catch (fy0 e2) {
            m30288a(e2.m24757b());
            throw e2;
        } catch (IOException e3) {
            m30288a(e3);
            throw new fy0(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.mobile.ads.impl.ku0 m30285a(int r14, int r15, int r16, boolean r17, boolean r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6137zr.m30285a(int, int, int, boolean, boolean):com.yandex.mobile.ads.impl.ku0");
    }

    /* renamed from: a */
    public final void m30288a(@NotNull IOException e2) {
        Intrinsics.m32179h(e2, "e");
        this.f57300j = null;
        if ((e2 instanceof i41) && ((i41) e2).f51214a == EnumC5708rr.f54405f) {
            this.f57297g++;
        } else if (e2 instanceof C5131gk) {
            this.f57298h++;
        } else {
            this.f57299i++;
        }
    }

    /* renamed from: a */
    public final boolean m30289a(@NotNull t00 url) {
        Intrinsics.m32179h(url, "url");
        t00 m29677k = this.f57292b.m29677k();
        return url.m28394i() == m29677k.m28394i() && Intrinsics.m32174c(url.m28392g(), m29677k.m28392g());
    }
}
