package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.gc */
/* loaded from: classes2.dex */
public class C3974gc {

    /* renamed from: a */
    @NonNull
    private final C3844bc f45198a;

    /* renamed from: b */
    @NonNull
    private final C3844bc f45199b;

    /* renamed from: c */
    @NonNull
    private final C3844bc f45200c;

    public C3974gc() {
        this(new C3844bc(), new C3844bc(), new C3844bc());
    }

    @NonNull
    /* renamed from: a */
    public C3844bc m19958a() {
        return this.f45198a;
    }

    @NonNull
    /* renamed from: b */
    public C3844bc m19959b() {
        return this.f45199b;
    }

    @NonNull
    /* renamed from: c */
    public C3844bc m19960c() {
        return this.f45200c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AdvertisingIdsHolder{mGoogle=");
        m24u.append(this.f45198a);
        m24u.append(", mHuawei=");
        m24u.append(this.f45199b);
        m24u.append(", yandex=");
        m24u.append(this.f45200c);
        m24u.append('}');
        return m24u.toString();
    }

    public C3974gc(@NonNull C3844bc c3844bc, @NonNull C3844bc c3844bc2, @NonNull C3844bc c3844bc3) {
        this.f45198a = c3844bc;
        this.f45199b = c3844bc2;
        this.f45200c = c3844bc3;
    }
}
