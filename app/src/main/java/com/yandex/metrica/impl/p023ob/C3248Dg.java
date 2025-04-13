package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* renamed from: com.yandex.metrica.impl.ob.Dg */
/* loaded from: classes2.dex */
public class C3248Dg implements InterfaceC3273Eg {

    /* renamed from: a */
    private final boolean f42719a;

    /* renamed from: b */
    @NonNull
    private final C4146n2 f42720b;

    /* renamed from: c */
    @NonNull
    private final C3291F9 f42721c;

    /* renamed from: d */
    @NonNull
    private final C4430y0 f42722d;

    /* renamed from: e */
    @NonNull
    private final C3912e2 f42723e;

    /* renamed from: f */
    @NonNull
    private final Handler f42724f;

    public C3248Dg(C4146n2 c4146n2, C3291F9 c3291f9, @NonNull Handler handler) {
        this(c4146n2, c3291f9, handler, c3291f9.m18095v());
    }

    /* renamed from: a */
    public void m17968a() {
        if (this.f42719a) {
            return;
        }
        this.f42720b.m20417a(new ResultReceiverC3323Gg(this.f42724f, this));
    }

    private C3248Dg(@NonNull C4146n2 c4146n2, @NonNull C3291F9 c3291f9, @NonNull Handler handler, boolean z) {
        this(c4146n2, c3291f9, handler, z, new C4430y0(z), new C3912e2());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3273Eg
    /* renamed from: a */
    public void mo17971a(@Nullable C3298Fg c3298Fg) {
        String str = c3298Fg == null ? null : c3298Fg.f42909a;
        if (!this.f42719a) {
            synchronized (this) {
                this.f42722d.m21176a(this.f42723e.m19781a(str));
            }
        }
    }

    @VisibleForTesting
    public C3248Dg(@NonNull C4146n2 c4146n2, C3291F9 c3291f9, @NonNull Handler handler, boolean z, @NonNull C4430y0 c4430y0, @NonNull C3912e2 c3912e2) {
        this.f42720b = c4146n2;
        this.f42721c = c3291f9;
        this.f42719a = z;
        this.f42722d = c4430y0;
        this.f42723e = c3912e2;
        this.f42724f = handler;
    }

    /* renamed from: a */
    public synchronized void m17970a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f42722d.m21175a(deferredDeeplinkParametersListener);
        } finally {
            this.f42721c.m18097x();
        }
    }

    /* renamed from: a */
    public synchronized void m17969a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f42722d.m21174a(deferredDeeplinkListener);
        } finally {
            this.f42721c.m18097x();
        }
    }
}
