package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.NoSuchElementException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzyl extends zzyn {

    /* renamed from: b */
    public int f17115b = 0;

    /* renamed from: c */
    public final int f17116c;

    /* renamed from: d */
    public final /* synthetic */ zzyu f17117d;

    public zzyl(zzyu zzyuVar) {
        this.f17117d = zzyuVar;
        this.f17116c = zzyuVar.mo9513d();
    }

    /* renamed from: a */
    public final byte m9509a() {
        int i2 = this.f17115b;
        if (i2 >= this.f17116c) {
            throw new NoSuchElementException();
        }
        this.f17115b = i2 + 1;
        return this.f17117d.mo9512b(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17115b < this.f17116c;
    }
}
