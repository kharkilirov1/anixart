package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.I6 */
/* loaded from: classes2.dex */
public class C3363I6 {

    /* renamed from: a */
    @NonNull
    private final C3204Bm f43095a;

    /* renamed from: b */
    @NonNull
    private final C3413K6 f43096b;

    public C3363I6() {
        this(new C3204Bm(), new C3413K6());
    }

    @Nullable
    /* renamed from: a */
    public Long m18250a(@Nullable List<C3494Nc> list) {
        if (C3658U2.m19217b(list)) {
            return null;
        }
        Objects.requireNonNull(this.f43096b);
        C3494Nc c3494Nc = list.get(Math.min(1, list.size()) - 1);
        long j2 = c3494Nc.f43465a;
        long j3 = c3494Nc.f43466b;
        if (j2 != j3) {
            j2 = this.f43095a.m17907a(j2, j3);
        }
        return Long.valueOf(j2);
    }

    @VisibleForTesting
    public C3363I6(@NonNull C3204Bm c3204Bm, @NonNull C3413K6 c3413k6) {
        this.f43095a = c3204Bm;
        this.f43096b = c3413k6;
    }
}
