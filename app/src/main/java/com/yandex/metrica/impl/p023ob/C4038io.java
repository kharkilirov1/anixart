package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.io */
/* loaded from: classes2.dex */
public class C4038io<D> implements InterfaceC3986go<D> {

    /* renamed from: a */
    @NonNull
    private final Comparator<D> f45354a;

    /* renamed from: b */
    private final int f45355b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3529Om f45356c;

    /* renamed from: d */
    @VisibleForTesting
    public final long f45357d;

    /* renamed from: e */
    @Nullable
    private D f45358e;

    /* renamed from: f */
    private int f45359f;

    /* renamed from: g */
    private long f45360g;

    public C4038io(@NonNull Comparator<D> comparator, @NonNull InterfaceC3529Om interfaceC3529Om, int i2, long j2) {
        this.f45354a = comparator;
        this.f45355b = i2;
        this.f45356c = interfaceC3529Om;
        this.f45357d = TimeUnit.SECONDS.toMillis(j2);
    }

    /* renamed from: a */
    private void m20068a() {
        this.f45359f = 0;
        this.f45360g = this.f45356c.mo18645c();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3986go
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C4064jo<D> get(@androidx.annotation.Nullable D r8) {
        /*
            r7 = this;
            D r0 = r7.f45358e
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L8
        L6:
            r8 = 0
            goto L16
        L8:
            java.util.Comparator<D> r3 = r7.f45354a
            int r0 = r3.compare(r0, r8)
            if (r0 != 0) goto L13
            r7.f45358e = r8
            goto L6
        L13:
            r7.f45358e = r8
            r8 = 1
        L16:
            if (r8 == 0) goto L25
            r7.m20068a()
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p023ob.C4064jo.a.NEW
            D r1 = r7.f45358e
            r8.<init>(r0, r1)
            return r8
        L25:
            int r8 = r7.f45359f
            int r8 = r8 + r1
            r7.f45359f = r8
            int r0 = r7.f45355b
            int r8 = r8 % r0
            r7.f45359f = r8
            com.yandex.metrica.impl.ob.Om r8 = r7.f45356c
            long r3 = r8.mo18645c()
            long r5 = r7.f45360g
            long r3 = r3 - r5
            long r5 = r7.f45357d
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            if (r1 == 0) goto L4f
            r7.m20068a()
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p023ob.C4064jo.a.REFRESH
            D r1 = r7.f45358e
            r8.<init>(r0, r1)
            return r8
        L4f:
            int r8 = r7.f45359f
            if (r8 != 0) goto L60
            r7.m20068a()
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p023ob.C4064jo.a.REFRESH
            D r1 = r7.f45358e
            r8.<init>(r0, r1)
            return r8
        L60:
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p023ob.C4064jo.a.NOT_CHANGED
            D r1 = r7.f45358e
            r8.<init>(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4038io.get(java.lang.Object):com.yandex.metrica.impl.ob.jo");
    }
}
