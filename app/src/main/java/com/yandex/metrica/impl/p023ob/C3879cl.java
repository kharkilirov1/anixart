package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.cl */
/* loaded from: classes2.dex */
class C3879cl {

    /* renamed from: a */
    @NonNull
    private final C3853bl f44887a;

    /* renamed from: b */
    @NonNull
    private final C3853bl f44888b;

    /* renamed from: c */
    @NonNull
    private final C3853bl f44889c;

    /* renamed from: d */
    @NonNull
    private final C3853bl f44890d;

    /* renamed from: com.yandex.metrica.impl.ob.cl$a */
    public static class a {
    }

    public C3879cl(@NonNull C3827al c3827al, @NonNull C3378Il c3378Il) {
        this(new C3853bl(c3827al.m19588c(), m19681a(c3378Il.f43145e)), new C3853bl(c3827al.m19587b(), m19681a(c3378Il.f43146f)), new C3853bl(c3827al.m19589d(), m19681a(c3378Il.f43148h)), new C3853bl(c3827al.m19585a(), m19681a(c3378Il.f43147g)));
    }

    @NonNull
    /* renamed from: a */
    public C3853bl m19682a() {
        return this.f44890d;
    }

    @NonNull
    /* renamed from: b */
    public C3853bl m19683b() {
        return this.f44888b;
    }

    @NonNull
    /* renamed from: c */
    public C3853bl m19684c() {
        return this.f44887a;
    }

    @NonNull
    /* renamed from: d */
    public C3853bl m19685d() {
        return this.f44889c;
    }

    /* renamed from: a */
    private static int m19681a(@Nullable Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @VisibleForTesting
    public C3879cl(@NonNull C3853bl c3853bl, @NonNull C3853bl c3853bl2, @NonNull C3853bl c3853bl3, @NonNull C3853bl c3853bl4) {
        this.f44887a = c3853bl;
        this.f44888b = c3853bl2;
        this.f44889c = c3853bl3;
        this.f44890d = c3853bl4;
    }
}
