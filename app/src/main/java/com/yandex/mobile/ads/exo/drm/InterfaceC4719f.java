package com.yandex.mobile.ads.exo.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.RunnableC0976c;
import com.google.android.exoplayer2.drm.RunnableC0998d;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.s91;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.exo.drm.f */
/* loaded from: classes2.dex */
public interface InterfaceC4719f {

    /* renamed from: com.yandex.mobile.ads.exo.drm.f$a */
    public static class a {

        /* renamed from: a */
        public final int f48020a;

        /* renamed from: b */
        @Nullable
        public final bc0.C4858b f48021b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C7014a> f48022c;

        /* renamed from: com.yandex.mobile.ads.exo.drm.f$a$a, reason: collision with other inner class name */
        public static final class C7014a {

            /* renamed from: a */
            public Handler f48023a;

            /* renamed from: b */
            public InterfaceC4719f f48024b;

            public C7014a(Handler handler, InterfaceC4719f interfaceC4719f) {
                this.f48023a = handler;
                this.f48024b = interfaceC4719f;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        @CheckResult
        /* renamed from: a */
        public final a m22177a(int i2, @Nullable bc0.C4858b c4858b) {
            return new a(this.f48022c, i2, c4858b);
        }

        /* renamed from: b */
        public final void m22182b() {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                s91.m28106a(next.f48023a, (Runnable) new RunnableC4733t(this, next.f48024b, 1));
            }
        }

        /* renamed from: c */
        public final void m22183c() {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                s91.m28106a(next.f48023a, (Runnable) new RunnableC4733t(this, next.f48024b, 2));
            }
        }

        /* renamed from: d */
        public final void m22184d() {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                s91.m28106a(next.f48023a, (Runnable) new RunnableC4733t(this, next.f48024b, 0));
            }
        }

        /* renamed from: e */
        public final void m22185e(InterfaceC4719f interfaceC4719f) {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                if (next.f48024b == interfaceC4719f) {
                    this.f48022c.remove(next);
                }
            }
        }

        private a(CopyOnWriteArrayList<C7014a> copyOnWriteArrayList, int i2, @Nullable bc0.C4858b c4858b) {
            this.f48022c = copyOnWriteArrayList;
            this.f48020a = i2;
            this.f48021b = c4858b;
        }

        /* renamed from: a */
        public final void m22180a(Handler handler, InterfaceC4719f interfaceC4719f) {
            Objects.requireNonNull(interfaceC4719f);
            this.f48022c.add(new C7014a(handler, interfaceC4719f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22170b(InterfaceC4719f interfaceC4719f) {
            interfaceC4719f.mo22164d(this.f48020a, this.f48021b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m22172c(InterfaceC4719f interfaceC4719f) {
            interfaceC4719f.mo22159a(this.f48020a, this.f48021b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m22174d(InterfaceC4719f interfaceC4719f) {
            interfaceC4719f.mo22162b(this.f48020a, this.f48021b);
        }

        /* renamed from: a */
        public final void m22179a(int i2) {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                s91.m28106a(next.f48023a, (Runnable) new RunnableC0998d(this, next.f48024b, i2, 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m22167a(InterfaceC4719f interfaceC4719f, int i2) {
            Objects.requireNonNull(interfaceC4719f);
            interfaceC4719f.mo22160a(this.f48020a, this.f48021b, i2);
        }

        /* renamed from: a */
        public final void m22178a() {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                s91.m28106a(next.f48023a, (Runnable) new RunnableC4733t(this, next.f48024b, 3));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m22166a(InterfaceC4719f interfaceC4719f) {
            interfaceC4719f.mo22163c(this.f48020a, this.f48021b);
        }

        /* renamed from: a */
        public final void m22181a(Exception exc) {
            Iterator<C7014a> it = this.f48022c.iterator();
            while (it.hasNext()) {
                C7014a next = it.next();
                s91.m28106a(next.f48023a, (Runnable) new RunnableC0976c(this, next.f48024b, exc, 6));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m22168a(InterfaceC4719f interfaceC4719f, Exception exc) {
            interfaceC4719f.mo22161a(this.f48020a, this.f48021b, exc);
        }
    }

    /* renamed from: a */
    void mo22159a(int i2, @Nullable bc0.C4858b c4858b);

    /* renamed from: a */
    void mo22160a(int i2, @Nullable bc0.C4858b c4858b, int i3);

    /* renamed from: a */
    void mo22161a(int i2, @Nullable bc0.C4858b c4858b, Exception exc);

    /* renamed from: b */
    void mo22162b(int i2, @Nullable bc0.C4858b c4858b);

    /* renamed from: c */
    void mo22163c(int i2, @Nullable bc0.C4858b c4858b);

    /* renamed from: d */
    void mo22164d(int i2, @Nullable bc0.C4858b c4858b);
}
