package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.al */
/* loaded from: classes2.dex */
class C3827al {

    /* renamed from: a */
    @NonNull
    private final C4373vl f44761a;

    /* renamed from: b */
    @NonNull
    private final C3453Ll f44762b;

    /* renamed from: c */
    @NonNull
    private final C3453Ll f44763c;

    /* renamed from: d */
    @NonNull
    private final C3453Ll f44764d;

    public C3827al(@Nullable C3378Il c3378Il) {
        this(new C4373vl(c3378Il == null ? null : c3378Il.f43145e), new C3453Ll(c3378Il == null ? null : c3378Il.f43146f), new C3453Ll(c3378Il == null ? null : c3378Il.f43148h), new C3453Ll(c3378Il != null ? c3378Il.f43147g : null));
    }

    /* renamed from: a */
    public void m19586a(@NonNull C3378Il c3378Il) {
        this.f44761a.m19529d(c3378Il.f43145e);
        this.f44762b.m19529d(c3378Il.f43146f);
        this.f44763c.m19529d(c3378Il.f43148h);
        this.f44764d.m19529d(c3378Il.f43147g);
    }

    @NonNull
    /* renamed from: b */
    public AbstractC3801Zk<?> m19587b() {
        return this.f44762b;
    }

    @NonNull
    /* renamed from: c */
    public AbstractC3801Zk<?> m19588c() {
        return this.f44761a;
    }

    @NonNull
    /* renamed from: d */
    public AbstractC3801Zk<?> m19589d() {
        return this.f44763c;
    }

    @NonNull
    /* renamed from: a */
    public synchronized AbstractC3801Zk<?> m19585a() {
        return this.f44764d;
    }

    @VisibleForTesting
    public C3827al(@NonNull C4373vl c4373vl, @NonNull C3453Ll c3453Ll, @NonNull C3453Ll c3453Ll2, @NonNull C3453Ll c3453Ll3) {
        this.f44761a = c4373vl;
        this.f44762b = c3453Ll;
        this.f44763c = c3453Ll2;
        this.f44764d = c3453Ll3;
    }
}
