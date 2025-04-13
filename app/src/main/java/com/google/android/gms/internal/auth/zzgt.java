package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgt implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f16176b;

    public zzgt(zzgu zzguVar) {
        this.f16176b = zzguVar.f16177b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16176b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f16176b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
