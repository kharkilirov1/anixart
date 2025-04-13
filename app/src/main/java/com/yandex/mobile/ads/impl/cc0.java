package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.RunnableC1108g;
import com.yandex.mobile.ads.impl.bc0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface cc0 {

    /* renamed from: com.yandex.mobile.ads.impl.cc0$a */
    public static class C4914a {

        /* renamed from: a */
        public final int f49200a;

        /* renamed from: b */
        @Nullable
        public final bc0.C4858b f49201b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<a> f49202c;

        /* renamed from: d */
        private final long f49203d;

        /* renamed from: com.yandex.mobile.ads.impl.cc0$a$a */
        public static final class a {

            /* renamed from: a */
            public Handler f49204a;

            /* renamed from: b */
            public cc0 f49205b;

            public a(Handler handler, cc0 cc0Var) {
                this.f49204a = handler;
                this.f49205b = cc0Var;
            }
        }

        public C4914a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: a */
        public final void m23208a(Handler handler, cc0 cc0Var) {
            Objects.requireNonNull(cc0Var);
            this.f49202c.add(new a(handler, cc0Var));
        }

        /* renamed from: b */
        public final void m23216b(j80 j80Var, @Nullable C5606pv c5606pv, long j2, long j3) {
            m23218c(j80Var, new rb0(1, -1, c5606pv, 0, null, m23195a(j2), m23195a(j3)));
        }

        /* renamed from: c */
        public final void m23218c(j80 j80Var, rb0 rb0Var) {
            Iterator<a> it = this.f49202c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                s91.m28106a(next.f49204a, (Runnable) new jn1(this, next.f49205b, j80Var, rb0Var, 1));
            }
        }

        private C4914a(CopyOnWriteArrayList copyOnWriteArrayList, int i2, @Nullable bc0.C4858b c4858b) {
            this.f49202c = copyOnWriteArrayList;
            this.f49200a = i2;
            this.f49201b = c4858b;
            this.f49203d = 0L;
        }

        @CheckResult
        /* renamed from: a */
        public final C4914a m23206a(int i2, @Nullable bc0.C4858b c4858b) {
            return new C4914a(this.f49202c, i2, c4858b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m23203c(cc0 cc0Var, j80 j80Var, rb0 rb0Var) {
            cc0Var.mo23194c(this.f49200a, this.f49201b, j80Var, rb0Var);
        }

        /* renamed from: a */
        public final void m23209a(cc0 cc0Var) {
            Iterator<a> it = this.f49202c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f49205b == cc0Var) {
                    this.f49202c.remove(next);
                }
            }
        }

        /* renamed from: b */
        public final void m23217b(j80 j80Var, rb0 rb0Var) {
            Iterator<a> it = this.f49202c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                s91.m28106a(next.f49204a, (Runnable) new jn1(this, next.f49205b, j80Var, rb0Var, 0));
            }
        }

        /* renamed from: a */
        public final void m23212a(j80 j80Var, @Nullable C5606pv c5606pv, long j2, long j3) {
            m23217b(j80Var, new rb0(1, -1, c5606pv, 0, null, m23195a(j2), m23195a(j3)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m23201b(cc0 cc0Var, j80 j80Var, rb0 rb0Var) {
            cc0Var.mo23193b(this.f49200a, this.f49201b, j80Var, rb0Var);
        }

        /* renamed from: a */
        public final void m23211a(j80 j80Var, long j2, long j3) {
            m23213a(j80Var, new rb0(1, -1, null, 0, null, m23195a(j2), m23195a(j3)));
        }

        /* renamed from: a */
        public final void m23213a(j80 j80Var, rb0 rb0Var) {
            Iterator<a> it = this.f49202c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                s91.m28106a(next.f49204a, (Runnable) new jn1(this, next.f49205b, j80Var, rb0Var, 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m23197a(cc0 cc0Var, j80 j80Var, rb0 rb0Var) {
            cc0Var.mo23190a(this.f49200a, this.f49201b, j80Var, rb0Var);
        }

        /* renamed from: a */
        public final void m23210a(j80 j80Var, int i2, @Nullable C5606pv c5606pv, long j2, long j3, IOException iOException, boolean z) {
            m23214a(j80Var, new rb0(i2, -1, c5606pv, 0, null, m23195a(j2), m23195a(j3)), iOException, z);
        }

        /* renamed from: a */
        public final void m23214a(j80 j80Var, rb0 rb0Var, IOException iOException, boolean z) {
            Iterator<a> it = this.f49202c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                s91.m28106a(next.f49204a, (Runnable) new RunnableC1108g(this, next.f49205b, j80Var, rb0Var, iOException, z, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m23198a(cc0 cc0Var, j80 j80Var, rb0 rb0Var, IOException iOException, boolean z) {
            cc0Var.mo23191a(this.f49200a, this.f49201b, j80Var, rb0Var, iOException, z);
        }

        /* renamed from: a */
        public final void m23207a(int i2, @Nullable C5606pv c5606pv, long j2) {
            m23215a(new rb0(1, i2, c5606pv, 0, null, m23195a(j2), -9223372036854775807L));
        }

        /* renamed from: a */
        public final void m23215a(rb0 rb0Var) {
            Iterator<a> it = this.f49202c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                s91.m28106a(next.f49204a, (Runnable) new sq1(this, next.f49205b, rb0Var, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m23199a(cc0 cc0Var, rb0 rb0Var) {
            cc0Var.mo23192a(this.f49200a, this.f49201b, rb0Var);
        }

        /* renamed from: a */
        private long m23195a(long j2) {
            long m28119b = s91.m28119b(j2);
            if (m28119b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f49203d + m28119b;
        }
    }

    /* renamed from: a */
    void mo23190a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var);

    /* renamed from: a */
    void mo23191a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var, IOException iOException, boolean z);

    /* renamed from: a */
    void mo23192a(int i2, @Nullable bc0.C4858b c4858b, rb0 rb0Var);

    /* renamed from: b */
    void mo23193b(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var);

    /* renamed from: c */
    void mo23194c(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var);
}
