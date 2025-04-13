package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.bk0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class dl0 {

    /* renamed from: b */
    @NonNull
    private final zk0 f49674b;

    /* renamed from: c */
    @NonNull
    private final C5724s3 f49675c;

    /* renamed from: a */
    @NonNull
    private final Object f49673a = new Object();

    /* renamed from: d */
    @NonNull
    private final rl0 f49676d = new rl0();

    /* renamed from: com.yandex.mobile.ads.impl.dl0$a */
    public interface InterfaceC4976a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.dl0$b */
    public static class C4977b implements be1 {

        /* renamed from: a */
        @NonNull
        private final AtomicInteger f49677a;

        /* renamed from: b */
        @NonNull
        private final C5724s3 f49678b;

        /* renamed from: c */
        @NonNull
        private final InterfaceC4976a f49679c;

        public C4977b(@NonNull C5724s3 c5724s3, int i2, @NonNull bk0.C4874b c4874b) {
            this.f49677a = new AtomicInteger(i2);
            this.f49678b = c5724s3;
            this.f49679c = c4874b;
        }

        @Override // com.yandex.mobile.ads.impl.be1
        /* renamed from: a */
        public final void mo22805a() {
            if (this.f49677a.decrementAndGet() == 0) {
                this.f49678b.m28050a(EnumC5668r3.f54176i);
                ((bk0.C4874b) this.f49679c).m22857c();
            }
        }
    }

    public dl0(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f49674b = new zk0(context);
        this.f49675c = c5724s3;
    }

    /* renamed from: a */
    public final void m23906a(@NonNull kh0 kh0Var, @NonNull bk0.C4874b c4874b) {
        synchronized (this.f49673a) {
            boolean m21809J = kh0Var.m26127b().m21809J();
            qi0 m26128c = kh0Var.m26128c();
            Objects.requireNonNull(this.f49676d);
            HashSet m27947a = rl0.m27947a(m26128c);
            if (m21809J && m27947a.size() != 0) {
                C4977b c4977b = new C4977b(this.f49675c, m27947a.size(), c4874b);
                this.f49675c.m28055b(EnumC5668r3.f54176i);
                Iterator it = m27947a.iterator();
                while (it.hasNext()) {
                    this.f49674b.m30208a((String) it.next(), c4977b);
                }
            }
            c4874b.m22857c();
        }
    }

    /* renamed from: a */
    public final void m23905a() {
        synchronized (this.f49673a) {
            this.f49674b.m30207a();
        }
    }
}
