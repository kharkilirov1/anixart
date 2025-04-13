package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzi<ResultT> {

    /* renamed from: a */
    public final zzm<ResultT> f20324a = new zzm<>();

    /* renamed from: a */
    public final void m11012a(Exception exc) {
        this.f20324a.m11016i(exc);
    }

    /* renamed from: b */
    public final void m11013b(ResultT resultt) {
        this.f20324a.m11017j(resultt);
    }

    /* renamed from: c */
    public final boolean m11014c(Exception exc) {
        zzm<ResultT> zzmVar = this.f20324a;
        synchronized (zzmVar.f20326a) {
            if (zzmVar.f20328c) {
                return false;
            }
            zzmVar.f20328c = true;
            zzmVar.f20330e = exc;
            zzmVar.f20327b.m11011b(zzmVar);
            return true;
        }
    }

    /* renamed from: d */
    public final boolean m11015d(ResultT resultt) {
        zzm<ResultT> zzmVar = this.f20324a;
        synchronized (zzmVar.f20326a) {
            if (zzmVar.f20328c) {
                return false;
            }
            zzmVar.f20328c = true;
            zzmVar.f20329d = resultt;
            zzmVar.f20327b.m11011b(zzmVar);
            return true;
        }
    }
}
