package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.appsetid.EnumC3092c;
import com.yandex.metrica.appsetid.InterfaceC3090a;
import com.yandex.metrica.appsetid.InterfaceC3093d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.ic */
/* loaded from: classes2.dex */
public final class C4026ic {

    /* renamed from: a */
    private volatile C4000hc f45331a;

    /* renamed from: b */
    private CountDownLatch f45332b = new CountDownLatch(1);

    /* renamed from: c */
    private final long f45333c = 20;

    /* renamed from: d */
    private final InterfaceC3090a f45334d = new a();

    /* renamed from: e */
    private final Context f45335e;

    /* renamed from: f */
    private final InterfaceC3093d f45336f;

    @VisibleForTesting
    public C4026ic(@NotNull Context context, @NotNull InterfaceC3093d interfaceC3093d) {
        this.f45335e = context;
        this.f45336f = interfaceC3093d;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ic$a */
    public static final class a implements InterfaceC3090a {
        public a() {
        }

        @Override // com.yandex.metrica.appsetid.InterfaceC3090a
        @MainThread
        /* renamed from: a */
        public void mo17775a(@Nullable String str, @NotNull EnumC3092c enumC3092c) {
            C4026ic.this.f45331a = new C4000hc(str, enumC3092c);
            C4026ic.this.f45332b.countDown();
        }

        @Override // com.yandex.metrica.appsetid.InterfaceC3090a
        @MainThread
        /* renamed from: a */
        public void mo17776a(@Nullable Throwable th) {
            C4026ic.this.f45332b.countDown();
        }
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public final synchronized C4000hc m20055a() {
        C4000hc c4000hc;
        if (this.f45331a == null) {
            try {
                this.f45332b = new CountDownLatch(1);
                this.f45336f.mo17777a(this.f45335e, this.f45334d);
                this.f45332b.await(this.f45333c, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        c4000hc = this.f45331a;
        if (c4000hc == null) {
            c4000hc = new C4000hc(null, EnumC3092c.UNKNOWN);
            this.f45331a = c4000hc;
        }
        return c4000hc;
    }
}
