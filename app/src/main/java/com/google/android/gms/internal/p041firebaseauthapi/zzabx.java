package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabx implements Iterator {

    /* renamed from: b */
    public int f16332b = -1;

    /* renamed from: c */
    public boolean f16333c;

    /* renamed from: d */
    public Iterator f16334d;

    /* renamed from: e */
    public final /* synthetic */ zzacb f16335e;

    /* renamed from: a */
    public final Iterator m8732a() {
        if (this.f16334d == null) {
            this.f16334d = this.f16335e.f16341d.entrySet().iterator();
        }
        return this.f16334d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16332b + 1 >= this.f16335e.f16340c.size()) {
            return !this.f16335e.f16341d.isEmpty() && m8732a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f16333c = true;
        int i2 = this.f16332b + 1;
        this.f16332b = i2;
        return i2 < this.f16335e.f16340c.size() ? (Map.Entry) this.f16335e.f16340c.get(this.f16332b) : (Map.Entry) m8732a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16333c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f16333c = false;
        zzacb zzacbVar = this.f16335e;
        int i2 = zzacb.f16338h;
        zzacbVar.m8739i();
        if (this.f16332b >= this.f16335e.f16340c.size()) {
            m8732a().remove();
            return;
        }
        zzacb zzacbVar2 = this.f16335e;
        int i3 = this.f16332b;
        this.f16332b = i3 - 1;
        zzacbVar2.m8737g(i3);
    }
}
