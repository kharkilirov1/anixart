package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Random;

/* renamed from: com.yandex.metrica.impl.ob.Bm */
/* loaded from: classes2.dex */
public class C3204Bm {

    /* renamed from: a */
    @NonNull
    private final Random f42638a;

    public C3204Bm() {
        this(new Random());
    }

    /* renamed from: a */
    public long m17907a(long j2, long j3) {
        if (j2 >= j3) {
            throw new IllegalArgumentException("min should be less than max");
        }
        long nextLong = this.f42638a.nextLong();
        if (nextLong == Long.MIN_VALUE) {
            nextLong = 0;
        } else if (nextLong < 0) {
            nextLong = -nextLong;
        }
        return (nextLong % (j3 - j2)) + j2;
    }

    public C3204Bm(@NonNull Random random) {
        this.f42638a = random;
    }
}
