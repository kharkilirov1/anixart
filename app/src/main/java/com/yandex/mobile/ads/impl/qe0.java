package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.impl.wz0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class qe0 {

    /* renamed from: e */
    private static final Object f54030e = new Object();

    /* renamed from: f */
    private static volatile qe0 f54031f;

    /* renamed from: a */
    @NonNull
    private final le0 f54032a;

    /* renamed from: b */
    @NonNull
    private final pe0 f54033b;

    /* renamed from: c */
    @NonNull
    private final rz0 f54034c;

    /* renamed from: d */
    @NonNull
    private int f54035d = 1;

    /* renamed from: com.yandex.mobile.ads.impl.qe0$a */
    public class C5635a implements wz0.InterfaceC5998a {
        private C5635a() {
        }

        @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
        /* renamed from: a */
        public final void mo26147a(@NonNull C5961w7 c5961w7, @NonNull C5507nr c5507nr) {
            synchronized (qe0.f54030e) {
                qe0.this.f54035d = 3;
            }
            qe0.this.f54033b.m27321a();
        }

        public /* synthetic */ C5635a(qe0 qe0Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
        /* renamed from: a */
        public final void mo26146a(@NonNull C5563p2 c5563p2) {
            synchronized (qe0.f54030e) {
                qe0.this.f54035d = 1;
            }
            qe0.this.f54033b.m27321a();
        }
    }

    private qe0(@NonNull le0 le0Var, @NonNull pe0 pe0Var, @NonNull rz0 rz0Var) {
        this.f54032a = le0Var;
        this.f54033b = pe0Var;
        this.f54034c = rz0Var;
    }

    @NonNull
    /* renamed from: b */
    public static qe0 m27707b() {
        if (f54031f == null) {
            synchronized (f54030e) {
                if (f54031f == null) {
                    f54031f = new qe0(new le0(new me0()), new pe0(), new rz0());
                }
            }
        }
        return f54031f;
    }

    /* renamed from: a */
    public final void m27710a(@NonNull Context context, @NonNull InitializationListener initializationListener) {
        this.f54032a.m26439a(new sq1(this, context, initializationListener, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m27709c(@NonNull Context context, @NonNull InitializationListener initializationListener) {
        boolean z;
        int i2;
        boolean z2;
        synchronized (f54030e) {
            z20 z20Var = new z20(this.f54032a, initializationListener);
            z = true;
            i2 = 0;
            if (this.f54035d == 3) {
                z2 = false;
            } else {
                this.f54033b.m27322a(z20Var);
                if (this.f54035d == 1) {
                    this.f54035d = 2;
                } else {
                    z = false;
                }
                z2 = z;
                z = false;
            }
        }
        if (z) {
            le0 le0Var = this.f54032a;
            Objects.requireNonNull(initializationListener);
            le0Var.m26440b(new rp1(initializationListener, 0));
        }
        if (z2) {
            this.f54032a.m26439a(this.f54034c.m28032a(context, new C5635a(this, i2)));
        }
    }
}
