package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public class zzaai {

    /* renamed from: a */
    public volatile zzabc f16275a;

    /* renamed from: b */
    public volatile zzyu f16276b;

    static {
        zzzk.m9627a();
    }

    /* renamed from: a */
    public final int m8585a() {
        if (this.f16276b != null) {
            return ((zzyr) this.f16276b).f17119d.length;
        }
        if (this.f16275a != null) {
            return this.f16275a.mo8619D();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzyu m8586b() {
        if (this.f16276b != null) {
            return this.f16276b;
        }
        synchronized (this) {
            if (this.f16276b != null) {
                return this.f16276b;
            }
            if (this.f16275a == null) {
                this.f16276b = zzyu.f17120c;
            } else {
                this.f16276b = this.f16275a.mo8622b();
            }
            return this.f16276b;
        }
    }

    /* renamed from: c */
    public final void m8587c(zzabc zzabcVar) {
        if (this.f16275a != null) {
            return;
        }
        synchronized (this) {
            if (this.f16275a == null) {
                try {
                    this.f16275a = zzabcVar;
                    this.f16276b = zzyu.f17120c;
                } catch (zzaaf unused) {
                    this.f16275a = zzabcVar;
                    this.f16276b = zzyu.f17120c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaai)) {
            return false;
        }
        zzaai zzaaiVar = (zzaai) obj;
        zzabc zzabcVar = this.f16275a;
        zzabc zzabcVar2 = zzaaiVar.f16275a;
        if (zzabcVar == null && zzabcVar2 == null) {
            return m8586b().equals(zzaaiVar.m8586b());
        }
        if (zzabcVar != null && zzabcVar2 != null) {
            return zzabcVar.equals(zzabcVar2);
        }
        if (zzabcVar != null) {
            zzaaiVar.m8587c(zzabcVar.mo8624d());
            return zzabcVar.equals(zzaaiVar.f16275a);
        }
        m8587c(zzabcVar2.mo8624d());
        return this.f16275a.equals(zzabcVar2);
    }

    public int hashCode() {
        return 1;
    }
}
