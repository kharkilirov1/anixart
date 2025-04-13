package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Gd */
/* loaded from: classes2.dex */
public class C3320Gd implements InterfaceC3631T0 {

    /* renamed from: a */
    @NonNull
    private final C3366I9 f42998a;

    /* renamed from: b */
    @NonNull
    private final C3583R2 f42999b;

    /* renamed from: c */
    @Nullable
    private C3269Ec f43000c;

    /* renamed from: d */
    @NonNull
    private final C3835b3 f43001d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3529Om f43002e;

    /* renamed from: f */
    @NonNull
    private final a f43003f;

    /* renamed from: g */
    @NonNull
    private final C3295Fd f43004g;

    /* renamed from: com.yandex.metrica.impl.ob.Gd$a */
    public static class a {
    }

    public C3320Gd(@NonNull Context context, @Nullable C3269Ec c3269Ec) {
        this(c3269Ec, C3835b3.m19636a(context));
    }

    /* renamed from: a */
    public void m18162a(@Nullable C3269Ec c3269Ec) {
        if (C3658U2.m19213a(this.f43000c, c3269Ec)) {
            return;
        }
        this.f43000c = c3269Ec;
        if (c3269Ec == null || !c3269Ec.f42804a.f46999a) {
            return;
        }
        this.f43004g.m19690a(this.f43001d.m19644b());
    }

    /* renamed from: b */
    public void m18163b() {
        C3269Ec c3269Ec = this.f43000c;
        if (c3269Ec == null || c3269Ec.f42805b == null || !this.f42999b.m18938b(this.f42998a.m18294f(0L), this.f43000c.f42805b.f42711b, "last wifi scan attempt time")) {
            return;
        }
        Objects.requireNonNull(this.f43003f);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f43001d.m19643a(countDownLatch, this.f43004g)) {
            this.f42998a.m18304k(this.f43002e.mo18644b());
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
    }

    private C3320Gd(@Nullable C3269Ec c3269Ec, @NonNull C3835b3 c3835b3) {
        this(c3835b3, C3532P0.m18696i().m18718u(), new C3583R2(), new C3504Nm(), new a(), c3269Ec, new C3295Fd(null, c3835b3.m19640a()));
    }

    @VisibleForTesting
    public C3320Gd(@NonNull C3835b3 c3835b3, @NonNull C3366I9 c3366i9, @NonNull C3583R2 c3583r2, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull a aVar, @Nullable C3269Ec c3269Ec, @NonNull C3295Fd c3295Fd) {
        this.f43001d = c3835b3;
        this.f42998a = c3366i9;
        this.f42999b = c3583r2;
        this.f43003f = aVar;
        this.f43000c = c3269Ec;
        this.f43002e = interfaceC3529Om;
        this.f43004g = c3295Fd;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3631T0
    /* renamed from: a */
    public void mo18161a() {
        C3269Ec c3269Ec = this.f43000c;
        if (c3269Ec == null || !c3269Ec.f42804a.f46999a) {
            return;
        }
        this.f43004g.m19690a(this.f43001d.m19644b());
    }
}
