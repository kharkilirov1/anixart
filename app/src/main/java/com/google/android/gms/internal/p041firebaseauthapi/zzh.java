package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzh implements Iterator {

    /* renamed from: b */
    @CheckForNull
    public Object f16522b;

    /* renamed from: c */
    public int f16523c = 2;

    @CheckForNull
    /* renamed from: a */
    public abstract Object mo8811a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f16523c;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f16523c = 4;
            this.f16522b = mo8811a();
            if (this.f16523c != 3) {
                this.f16523c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16523c = 2;
        Object obj = this.f16522b;
        this.f16522b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
