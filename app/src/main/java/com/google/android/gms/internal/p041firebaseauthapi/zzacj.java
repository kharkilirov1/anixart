package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzacj implements Iterator {

    /* renamed from: b */
    public final Iterator f16352b;

    public zzacj(zzack zzackVar) {
        this.f16352b = zzackVar.f16353b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16352b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f16352b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
