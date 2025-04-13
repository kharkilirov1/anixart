package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C5150gy;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class qm0<T> implements om0<T> {

    /* renamed from: j */
    private static final long f54088j = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    @NonNull
    private final C5101g2 f54089a;

    /* renamed from: f */
    @NonNull
    private final xw0<T> f54094f;

    /* renamed from: b */
    @NonNull
    private final C5887ut f54090b = new C5887ut();

    /* renamed from: c */
    @NonNull
    private final od0 f54091c = new od0();

    /* renamed from: d */
    @NonNull
    private final lx0 f54092d = new lx0();

    /* renamed from: e */
    @NonNull
    private final C5924vk f54093e = new C5924vk();

    /* renamed from: g */
    @NonNull
    private final C4893bz f54095g = new C4893bz();

    /* renamed from: h */
    @NonNull
    private final t80 f54096h = new t80();

    /* renamed from: i */
    @NonNull
    private final C5679r8 f54097i = new C5679r8();

    /* renamed from: com.yandex.mobile.ads.impl.qm0$a */
    public class C5648a implements C5150gy.a<Long> {
        @Override // com.yandex.mobile.ads.impl.C5150gy.a
        @Nullable
        /* renamed from: a */
        public final Long mo25002a(String str) {
            long j2 = 0L;
            int i2 = C5427m6.f52583b;
            if (str == null) {
                return j2;
            }
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return j2;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qm0$b */
    public class C5649b implements C5150gy.a<Integer> {
        @Override // com.yandex.mobile.ads.impl.C5150gy.a
        @NonNull
        /* renamed from: a */
        public final Integer mo25002a(String str) {
            int i2;
            int i3 = C5427m6.f52583b;
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
            return Integer.valueOf(Math.min(i2, AdResponse.f47657L.intValue()));
        }
    }

    public qm0(@NonNull C5101g2 c5101g2, @NonNull xw0 xw0Var) {
        this.f54089a = c5101g2;
        this.f54094f = xw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01eb  */
    @Override // com.yandex.mobile.ads.impl.om0
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.base.AdResponse<T> mo27092a(@androidx.annotation.NonNull com.yandex.mobile.ads.impl.sw0 r8, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.String> r9, @androidx.annotation.NonNull com.yandex.mobile.ads.impl.EnumC5007e6 r10) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qm0.mo27092a(com.yandex.mobile.ads.impl.sw0, java.util.Map, com.yandex.mobile.ads.impl.e6):com.yandex.mobile.ads.base.AdResponse");
    }
}
