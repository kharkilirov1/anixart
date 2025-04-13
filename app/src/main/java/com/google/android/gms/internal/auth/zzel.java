package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzek;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzel<T extends zzek<T>> {

    /* renamed from: d */
    public static final /* synthetic */ int f16095d = 0;

    /* renamed from: a */
    public final zzgl<T, Object> f16096a;

    /* renamed from: b */
    public boolean f16097b;

    /* renamed from: c */
    public boolean f16098c;

    static {
        new zzel(true);
    }

    public zzel() {
        this.f16096a = new zzge(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m8391b(T r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.auth.zzhe r0 = r4.m8390w()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.auth.zzev.f16107a
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.auth.zzhe r1 = com.google.android.gms.internal.auth.zzhe.f16186c
            com.google.android.gms.internal.auth.zzhf r1 = com.google.android.gms.internal.auth.zzhf.INT
            com.google.android.gms.internal.auth.zzhf r0 = r0.f16188b
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzfq
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzex
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzes
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzeb
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.m8388u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.auth.zzhe r4 = r4.m8390w()
            com.google.android.gms.internal.auth.zzhf r4 = r4.f16188b
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzel.m8391b(com.google.android.gms.internal.auth.zzek, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void m8392a(T t, Object obj) {
        if (!t.m8389v()) {
            m8391b(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                m8391b(t, arrayList.get(i2));
            }
            obj = arrayList;
        }
        if (obj instanceof zzex) {
            this.f16098c = true;
        }
        this.f16096a.put(t, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() throws CloneNotSupportedException {
        zzel zzelVar = new zzel();
        for (int i2 = 0; i2 < this.f16096a.m8476b(); i2++) {
            Map.Entry<T, Object> m8478d = this.f16096a.m8478d(i2);
            zzelVar.m8392a(m8478d.getKey(), m8478d.getValue());
        }
        zzgl<T, Object> zzglVar = this.f16096a;
        for (Map.Entry entry : zzglVar.f16166d.isEmpty() ? zzgh.f16154b : zzglVar.f16166d.entrySet()) {
            zzelVar.m8392a((zzek) entry.getKey(), entry.getValue());
        }
        zzelVar.f16098c = this.f16098c;
        return zzelVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzel) {
            return this.f16096a.equals(((zzel) obj).f16096a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16096a.hashCode();
    }

    public zzel(boolean z) {
        zzge zzgeVar = new zzge(0);
        this.f16096a = zzgeVar;
        if (!this.f16097b) {
            zzgeVar.mo8474a();
            this.f16097b = true;
        }
        if (this.f16097b) {
            return;
        }
        zzgeVar.mo8474a();
        this.f16097b = true;
    }
}
