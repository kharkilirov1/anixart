package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.tc */
/* loaded from: classes3.dex */
public interface InterfaceC5793tc {
    @Nullable
    /* renamed from: a */
    C5193hn mo25255a();

    /* renamed from: a */
    void mo25256a(Handler handler, InterfaceC5569p8 interfaceC5569p8);

    /* renamed from: a */
    void mo25259a(InterfaceC5569p8 interfaceC5569p8);

    /* renamed from: com.yandex.mobile.ads.impl.tc$a */
    public interface a {
        /* renamed from: b */
        void mo23467b(int i2, long j2, long j3);

        /* renamed from: com.yandex.mobile.ads.impl.tc$a$a, reason: collision with other inner class name */
        public static final class C7018a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C7019a> f55040a = new CopyOnWriteArrayList<>();

            /* renamed from: com.yandex.mobile.ads.impl.tc$a$a$a, reason: collision with other inner class name */
            public static final class C7019a {

                /* renamed from: a */
                private final Handler f55041a;

                /* renamed from: b */
                private final a f55042b;

                /* renamed from: c */
                private boolean f55043c;

                public C7019a(Handler handler, InterfaceC5569p8 interfaceC5569p8) {
                    this.f55041a = handler;
                    this.f55042b = interfaceC5569p8;
                }

                /* renamed from: a */
                public final void m28592a() {
                    this.f55043c = true;
                }
            }

            /* renamed from: a */
            public final void m28588a(InterfaceC5569p8 interfaceC5569p8) {
                Iterator<C7019a> it = this.f55040a.iterator();
                while (it.hasNext()) {
                    C7019a next = it.next();
                    if (next.f55042b == interfaceC5569p8) {
                        next.m28592a();
                        this.f55040a.remove(next);
                    }
                }
            }

            /* renamed from: a */
            public final void m28586a(int i2, long j2, long j3) {
                Iterator<C7019a> it = this.f55040a.iterator();
                while (it.hasNext()) {
                    C7019a next = it.next();
                    if (!next.f55043c) {
                        next.f55041a.post(new cq1(next, i2, j2, j3, 0));
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m28584a(C7019a c7019a, int i2, long j2, long j3) {
                c7019a.f55042b.mo23467b(i2, j2, j3);
            }

            /* renamed from: a */
            public final void m28587a(Handler handler, InterfaceC5569p8 interfaceC5569p8) {
                Objects.requireNonNull(interfaceC5569p8);
                m28588a(interfaceC5569p8);
                this.f55040a.add(new C7019a(handler, interfaceC5569p8));
            }
        }
    }
}
