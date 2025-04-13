package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.h */
/* loaded from: classes2.dex */
final class C4682h {
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static int m22032a(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }
}
