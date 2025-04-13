package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgj implements Iterator<Map.Entry> {

    /* renamed from: b */
    public int f16158b = -1;

    /* renamed from: c */
    public boolean f16159c;

    /* renamed from: d */
    public Iterator<Map.Entry> f16160d;

    /* renamed from: e */
    public final /* synthetic */ zzgl f16161e;

    /* renamed from: a */
    public final Iterator<Map.Entry> m8475a() {
        if (this.f16160d == null) {
            this.f16160d = this.f16161e.f16166d.entrySet().iterator();
        }
        return this.f16160d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16158b + 1 >= this.f16161e.f16165c.size()) {
            return !this.f16161e.f16166d.isEmpty() && m8475a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry next() {
        this.f16159c = true;
        int i2 = this.f16158b + 1;
        this.f16158b = i2;
        return i2 < this.f16161e.f16165c.size() ? this.f16161e.f16165c.get(this.f16158b) : m8475a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16159c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f16159c = false;
        zzgl zzglVar = this.f16161e;
        int i2 = zzgl.f16163h;
        zzglVar.m8482i();
        if (this.f16158b >= this.f16161e.f16165c.size()) {
            m8475a().remove();
            return;
        }
        zzgl zzglVar2 = this.f16161e;
        int i3 = this.f16158b;
        this.f16158b = i3 - 1;
        zzglVar2.m8480g(i3);
    }
}
