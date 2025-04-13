package com.yandex.mobile.ads.impl;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class vq0 {

    /* renamed from: a */
    private final InterfaceC5936b f55863a;

    /* renamed from: b */
    private final InterfaceC5935a f55864b;

    /* renamed from: c */
    private final InterfaceC4972di f55865c;

    /* renamed from: d */
    private int f55866d;

    /* renamed from: e */
    @Nullable
    private Object f55867e;

    /* renamed from: f */
    private Looper f55868f;

    /* renamed from: g */
    private boolean f55869g;

    /* renamed from: h */
    private boolean f55870h;

    /* renamed from: i */
    private boolean f55871i;

    /* renamed from: com.yandex.mobile.ads.impl.vq0$a */
    public interface InterfaceC5935a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.vq0$b */
    public interface InterfaceC5936b {
        /* renamed from: a */
        void mo24074a(int i2, @Nullable Object obj) throws C5043es;
    }

    public vq0(InterfaceC5935a interfaceC5935a, InterfaceC5936b interfaceC5936b, k61 k61Var, int i2, InterfaceC4972di interfaceC4972di, Looper looper) {
        this.f55864b = interfaceC5935a;
        this.f55863a = interfaceC5936b;
        this.f55868f = looper;
        this.f55865c = interfaceC4972di;
    }

    /* renamed from: a */
    public final vq0 m29252a(int i2) {
        C5220ia.m25476b(!this.f55869g);
        this.f55866d = i2;
        return this;
    }

    @Nullable
    /* renamed from: b */
    public final Object m29256b() {
        return this.f55867e;
    }

    /* renamed from: c */
    public final InterfaceC5936b m29257c() {
        return this.f55863a;
    }

    /* renamed from: d */
    public final int m29258d() {
        return this.f55866d;
    }

    /* renamed from: e */
    public final vq0 m29259e() {
        C5220ia.m25476b(!this.f55869g);
        this.f55869g = true;
        ((C5354ks) this.f55864b).m26238b(this);
        return this;
    }

    /* renamed from: a */
    public final vq0 m29253a(@Nullable Object obj) {
        C5220ia.m25476b(!this.f55869g);
        this.f55867e = obj;
        return this;
    }

    /* renamed from: a */
    public final Looper m29251a() {
        return this.f55868f;
    }

    /* renamed from: a */
    public final synchronized void m29255a(boolean z) {
        this.f55870h = z | this.f55870h;
        this.f55871i = true;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void m29254a(long j2) throws InterruptedException, TimeoutException {
        boolean z;
        C5220ia.m25476b(this.f55869g);
        C5220ia.m25476b(this.f55868f.getThread() != Thread.currentThread());
        long mo23887c = this.f55865c.mo23887c() + j2;
        while (true) {
            z = this.f55871i;
            if (z || j2 <= 0) {
                break;
            }
            this.f55865c.mo23886b();
            wait(j2);
            j2 = mo23887c - this.f55865c.mo23887c();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }
}
