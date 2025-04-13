package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzp {

    /* renamed from: d */
    public static final /* synthetic */ int f17155d = 0;

    /* renamed from: a */
    public final zzacb f17156a;

    /* renamed from: b */
    public boolean f17157b;

    /* renamed from: c */
    public boolean f17158c;

    static {
        new zzzp(true);
    }

    public zzzp() {
        this.f17156a = new zzabr(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m9639b(com.google.android.gms.internal.p041firebaseauthapi.zzzo r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzacv r0 = r4.m9638w()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.p041firebaseauthapi.zzaad.f16259a
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.firebase-auth-api.zzacv r1 = com.google.android.gms.internal.p041firebaseauthapi.zzacv.f16363c
            com.google.android.gms.internal.firebase-auth-api.zzacw r1 = com.google.android.gms.internal.p041firebaseauthapi.zzacw.INT
            com.google.android.gms.internal.firebase-auth-api.zzacw r0 = r0.f16365b
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.p041firebaseauthapi.zzabc
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.p041firebaseauthapi.zzaah
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.p041firebaseauthapi.zzzz
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p041firebaseauthapi.zzyu
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
            int r3 = r4.m9636u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzacv r4 = r4.m9638w()
            com.google.android.gms.internal.firebase-auth-api.zzacw r4 = r4.f16365b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzzp.m9639b(com.google.android.gms.internal.firebase-auth-api.zzzo, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void m9640a(zzzo zzzoVar, Object obj) {
        if (!zzzoVar.m9637v()) {
            m9639b(zzzoVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                m9639b(zzzoVar, arrayList.get(i2));
            }
            obj = arrayList;
        }
        if (obj instanceof zzaah) {
            this.f17158c = true;
        }
        this.f17156a.put(zzzoVar, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        zzzp zzzpVar = new zzzp();
        for (int i2 = 0; i2 < this.f17156a.m8733b(); i2++) {
            Map.Entry m8735d = this.f17156a.m8735d(i2);
            zzzpVar.m9640a((zzzo) m8735d.getKey(), m8735d.getValue());
        }
        zzacb zzacbVar = this.f17156a;
        for (Map.Entry entry : zzacbVar.f16341d.isEmpty() ? zzabu.f16328b : zzacbVar.f16341d.entrySet()) {
            zzzpVar.m9640a((zzzo) entry.getKey(), entry.getValue());
        }
        zzzpVar.f17158c = this.f17158c;
        return zzzpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzzp) {
            return this.f17156a.equals(((zzzp) obj).f17156a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17156a.hashCode();
    }

    public zzzp(boolean z) {
        zzabr zzabrVar = new zzabr(0);
        this.f17156a = zzabrVar;
        if (!this.f17157b) {
            zzabrVar.mo8731a();
            this.f17157b = true;
        }
        if (this.f17157b) {
            return;
        }
        zzabrVar.mo8731a();
        this.f17157b = true;
    }
}
