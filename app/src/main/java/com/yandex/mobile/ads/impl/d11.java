package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.AbstractC5809tm;
import com.yandex.mobile.ads.impl.C5696rm;
import com.yandex.mobile.ads.impl.C5752sm;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class d11<I extends C5752sm, O extends AbstractC5809tm, E extends C5696rm> implements InterfaceC5597pm<I, O, E> {

    /* renamed from: a */
    private final Thread f49529a;

    /* renamed from: b */
    private final Object f49530b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f49531c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f49532d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f49533e;

    /* renamed from: f */
    private final O[] f49534f;

    /* renamed from: g */
    private int f49535g;

    /* renamed from: h */
    private int f49536h;

    /* renamed from: i */
    @Nullable
    private I f49537i;

    /* renamed from: j */
    @Nullable
    private y41 f49538j;

    /* renamed from: k */
    private boolean f49539k;

    /* renamed from: l */
    private boolean f49540l;

    /* renamed from: com.yandex.mobile.ads.impl.d11$a */
    public class C4952a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ d11 f49541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4952a(i11 i11Var) {
            super("ExoPlayer:SimpleDecoder");
            this.f49541b = i11Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            d11.m23783a(this.f49541b);
        }
    }

    public d11(I[] iArr, O[] oArr) {
        this.f49533e = iArr;
        this.f49535g = iArr.length;
        for (int i2 = 0; i2 < this.f49535g; i2++) {
            this.f49533e[i2] = mo23787c();
        }
        this.f49534f = oArr;
        this.f49536h = oArr.length;
        for (int i3 = 0; i3 < this.f49536h; i3++) {
            this.f49534f[i3] = mo23788d();
        }
        C4952a c4952a = new C4952a((i11) this);
        this.f49529a = c4952a;
        c4952a.start();
    }

    /* renamed from: a */
    public static void m23783a(d11 d11Var) {
        Objects.requireNonNull(d11Var);
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (d11Var.m23784e());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m23784e() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f49530b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f49540l     // Catch: java.lang.Throwable -> Lac
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L20
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.sm> r1 = r8.f49531c     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto L17
            int r1 = r8.f49536h     // Catch: java.lang.Throwable -> Lac
            if (r1 <= 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 != 0) goto L20
            java.lang.Object r1 = r8.f49530b     // Catch: java.lang.Throwable -> Lac
            r1.wait()     // Catch: java.lang.Throwable -> Lac
            goto L3
        L20:
            boolean r1 = r8.f49540l     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            return r3
        L26:
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.sm> r1 = r8.f49531c     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> Lac
            com.yandex.mobile.ads.impl.sm r1 = (com.yandex.mobile.ads.impl.C5752sm) r1     // Catch: java.lang.Throwable -> Lac
            O extends com.yandex.mobile.ads.impl.tm[] r4 = r8.f49534f     // Catch: java.lang.Throwable -> Lac
            int r5 = r8.f49536h     // Catch: java.lang.Throwable -> Lac
            int r5 = r5 - r2
            r8.f49536h = r5     // Catch: java.lang.Throwable -> Lac
            r4 = r4[r5]     // Catch: java.lang.Throwable -> Lac
            boolean r5 = r8.f49539k     // Catch: java.lang.Throwable -> Lac
            r8.f49539k = r3     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            r0 = 4
            boolean r6 = r1.m26634c(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L49
            r4.m26632b(r0)
            goto L80
        L49:
            boolean r0 = r1.m26634c(r7)
            if (r0 == 0) goto L52
            r4.m26632b(r7)
        L52:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.m26634c(r0)
            if (r6 == 0) goto L5d
            r4.m26632b(r0)
        L5d:
            com.yandex.mobile.ads.impl.y41 r0 = r8.mo23785a(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L62 java.lang.RuntimeException -> L6b
            goto L74
        L62:
            r0 = move-exception
            com.yandex.mobile.ads.impl.y41 r5 = new com.yandex.mobile.ads.impl.y41
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L73
        L6b:
            r0 = move-exception
            com.yandex.mobile.ads.impl.y41 r5 = new com.yandex.mobile.ads.impl.y41
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L73:
            r0 = r5
        L74:
            if (r0 == 0) goto L80
            java.lang.Object r5 = r8.f49530b
            monitor-enter(r5)
            r8.f49538j = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            return r3
        L7d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            java.lang.Object r3 = r8.f49530b
            monitor-enter(r3)
            boolean r0 = r8.f49539k     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L8b
            r4.mo22827h()     // Catch: java.lang.Throwable -> La9
            goto L9a
        L8b:
            boolean r0 = r4.m26634c(r7)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L95
            r4.mo22827h()     // Catch: java.lang.Throwable -> La9
            goto L9a
        L95:
            java.util.ArrayDeque<O extends com.yandex.mobile.ads.impl.tm> r0 = r8.f49532d     // Catch: java.lang.Throwable -> La9
            r0.addLast(r4)     // Catch: java.lang.Throwable -> La9
        L9a:
            r1.mo22727b()     // Catch: java.lang.Throwable -> La9
            I extends com.yandex.mobile.ads.impl.sm[] r0 = r8.f49533e     // Catch: java.lang.Throwable -> La9
            int r4 = r8.f49535g     // Catch: java.lang.Throwable -> La9
            int r5 = r4 + 1
            r8.f49535g = r5     // Catch: java.lang.Throwable -> La9
            r0[r4] = r1     // Catch: java.lang.Throwable -> La9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            return r2
        La9:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            throw r0
        Lac:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d11.m23784e():boolean");
    }

    @Nullable
    /* renamed from: a */
    public abstract y41 mo23785a(C5752sm c5752sm, AbstractC5809tm abstractC5809tm, boolean z);

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: b */
    public final Object mo22820b() throws C5696rm {
        I i2;
        synchronized (this.f49530b) {
            y41 y41Var = this.f49538j;
            if (y41Var != null) {
                throw y41Var;
            }
            C5220ia.m25476b(this.f49537i == null);
            int i3 = this.f49535g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f49533e;
                int i4 = i3 - 1;
                this.f49535g = i4;
                i2 = iArr[i4];
            }
            this.f49537i = i2;
        }
        return i2;
    }

    /* renamed from: c */
    public abstract a51 mo23787c();

    /* renamed from: d */
    public abstract O mo23788d();

    /* renamed from: f */
    public final void m23789f() {
        C5220ia.m25476b(this.f49535g == this.f49533e.length);
        for (I i2 : this.f49533e) {
            i2.m28323e(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final void flush() {
        synchronized (this.f49530b) {
            this.f49539k = true;
            I i2 = this.f49537i;
            if (i2 != null) {
                i2.mo22727b();
                I[] iArr = this.f49533e;
                int i3 = this.f49535g;
                this.f49535g = i3 + 1;
                iArr[i3] = i2;
                this.f49537i = null;
            }
            while (!this.f49531c.isEmpty()) {
                I removeFirst = this.f49531c.removeFirst();
                removeFirst.mo22727b();
                I[] iArr2 = this.f49533e;
                int i4 = this.f49535g;
                this.f49535g = i4 + 1;
                iArr2[i4] = removeFirst;
            }
            while (!this.f49532d.isEmpty()) {
                this.f49532d.removeFirst().mo22827h();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @CallSuper
    public final void release() {
        synchronized (this.f49530b) {
            this.f49540l = true;
            this.f49530b.notify();
        }
        try {
            this.f49529a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    /* renamed from: a */
    public final void mo22818a(a51 a51Var) throws C5696rm {
        synchronized (this.f49530b) {
            y41 y41Var = this.f49538j;
            if (y41Var == null) {
                boolean z = true;
                C5220ia.m25473a(a51Var == this.f49537i);
                this.f49531c.addLast(a51Var);
                if (this.f49531c.isEmpty() || this.f49536h <= 0) {
                    z = false;
                }
                if (z) {
                    this.f49530b.notify();
                }
                this.f49537i = null;
            } else {
                throw y41Var;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: a */
    public final Object mo22816a() throws C5696rm {
        O removeFirst;
        synchronized (this.f49530b) {
            y41 y41Var = this.f49538j;
            if (y41Var == null) {
                removeFirst = this.f49532d.isEmpty() ? null : this.f49532d.removeFirst();
            } else {
                throw y41Var;
            }
        }
        return removeFirst;
    }

    @CallSuper
    /* renamed from: a */
    public final void m23786a(O o) {
        synchronized (this.f49530b) {
            o.mo22727b();
            O[] oArr = this.f49534f;
            int i2 = this.f49536h;
            this.f49536h = i2 + 1;
            oArr[i2] = o;
            if (!this.f49531c.isEmpty() && this.f49536h > 0) {
                this.f49530b.notify();
            }
        }
    }
}
