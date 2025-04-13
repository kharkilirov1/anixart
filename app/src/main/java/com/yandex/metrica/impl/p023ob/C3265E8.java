package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.E8 */
/* loaded from: classes2.dex */
public class C3265E8 {

    /* renamed from: a */
    private final AbstractC3540P8 f42770a;

    /* renamed from: b */
    private final AbstractC3540P8 f42771b;

    /* renamed from: c */
    private final SparseArray<AbstractC3540P8> f42772c;

    /* renamed from: d */
    private final InterfaceC3290F8 f42773d;

    /* renamed from: com.yandex.metrica.impl.ob.E8$b */
    public static class b {
        /* renamed from: a */
        public C3265E8 m18005a(@NonNull String str, @NonNull AbstractC3540P8 abstractC3540P8, @NonNull AbstractC3540P8 abstractC3540P82, @NonNull SparseArray<AbstractC3540P8> sparseArray, @NonNull InterfaceC3290F8 interfaceC3290F8) {
            return new C3265E8(str, abstractC3540P8, abstractC3540P82, sparseArray, interfaceC3290F8);
        }
    }

    /* renamed from: a */
    public void m18001a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f42770a.mo17822a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m18003b(SQLiteDatabase sQLiteDatabase) {
        try {
            InterfaceC3290F8 interfaceC3290F8 = this.f42773d;
            if (interfaceC3290F8 == null || ((C3315G8) interfaceC3290F8).m18131a(sQLiteDatabase)) {
                return;
            }
            try {
                this.f42771b.mo17822a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            this.f42770a.mo17822a(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    private C3265E8(String str, AbstractC3540P8 abstractC3540P8, AbstractC3540P8 abstractC3540P82, SparseArray<AbstractC3540P8> sparseArray, InterfaceC3290F8 interfaceC3290F8) {
        this.f42770a = abstractC3540P8;
        this.f42771b = abstractC3540P82;
        this.f42772c = sparseArray;
        this.f42773d = interfaceC3290F8;
    }

    /* renamed from: a */
    public void m18002a(@NonNull SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 > i3) {
            try {
                this.f42771b.mo17822a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f42770a.mo17822a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18004b(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 <= r5) goto L17
            r1 = 0
            int r5 = r5 + r0
        L5:
            if (r5 > r6) goto L18
            android.util.SparseArray<com.yandex.metrica.impl.ob.P8> r2 = r3.f42772c     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L17
            com.yandex.metrica.impl.ob.P8 r2 = (com.yandex.metrica.impl.p023ob.AbstractC3540P8) r2     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L14
            r2.mo17822a(r4)     // Catch: java.lang.Throwable -> L17
        L14:
            int r5 = r5 + 1
            goto L5
        L17:
            r1 = 1
        L18:
            com.yandex.metrica.impl.ob.F8 r5 = r3.f42773d
            com.yandex.metrica.impl.ob.G8 r5 = (com.yandex.metrica.impl.p023ob.C3315G8) r5
            boolean r5 = r5.m18131a(r4)
            r5 = r5 ^ r0
            r5 = r5 | r1
            if (r5 == 0) goto L2e
            com.yandex.metrica.impl.ob.P8 r5 = r3.f42771b
            r5.mo17822a(r4)     // Catch: java.lang.Throwable -> L29
        L29:
            com.yandex.metrica.impl.ob.P8 r5 = r3.f42770a
            r5.mo17822a(r4)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3265E8.m18004b(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
