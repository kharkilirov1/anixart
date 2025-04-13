package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.i4 */
/* loaded from: classes2.dex */
public class C4018i4 {

    /* renamed from: a */
    @NonNull
    private final C3216C9 f45317a;

    /* renamed from: b */
    @NonNull
    private final C3365I8 f45318b;

    public C4018i4(@NonNull C3365I8 c3365i8) {
        this(c3365i8, new C3216C9(c3365i8));
    }

    /* renamed from: a */
    public int m20048a() {
        int m18261d = this.f45318b.m18261d();
        this.f45318b.m18251a(m18261d + 1);
        return m18261d;
    }

    @VisibleForTesting
    public C4018i4(@NonNull C3365I8 c3365i8, @NonNull C3216C9 c3216c9) {
        this.f45318b = c3365i8;
        this.f45317a = c3216c9;
    }

    /* renamed from: a */
    public int m20049a(int i2) {
        int m17928a = this.f45317a.m17928a(i2);
        this.f45317a.m17929a(i2, m17928a + 1);
        return m17928a;
    }
}
