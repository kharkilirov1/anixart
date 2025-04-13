package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ho0 {
    @NonNull
    /* renamed from: a */
    public static oa1 m25352a(@NonNull C5083fl c5083fl, @NonNull EnumC5778t1 enumC5778t1) {
        f50 m29627a = new x11().m29627a(c5083fl);
        int ordinal = enumC5778t1.ordinal();
        pr0 pr0Var = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? pr0.f53637e : pr0.f53636d : pr0.f53635c : pr0.f53634b;
        return m29627a != null ? oa1.m27059a(m29627a.getSkipOffset() / 1000.0f, pr0Var) : oa1.m27060a(pr0Var);
    }
}
