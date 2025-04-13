package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ae1;
import com.yandex.mobile.ads.impl.hc1;
import com.yandex.mobile.ads.impl.il0;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.ob1;
import com.yandex.mobile.ads.impl.pg0;
import com.yandex.mobile.ads.impl.z10;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.s */
/* loaded from: classes3.dex */
final class C6234s {

    /* renamed from: a */
    @NonNull
    private final ae1 f57796a = new ae1();

    /* renamed from: b */
    private final pg0 f57797b = new pg0();

    @Nullable
    /* renamed from: a */
    public final NativeAdMedia m30636a(@Nullable jc0 jc0Var) {
        if (jc0Var == null) {
            return null;
        }
        ob1 m25865c = jc0Var.m25865c();
        ka0 m25864b = jc0Var.m25864b();
        List<z10> m25863a = jc0Var.m25863a();
        if (m25865c != null) {
            ae1 ae1Var = this.f57796a;
            hc1<il0> m27065a = m25865c.m27065a();
            Objects.requireNonNull(ae1Var);
            return new NativeAdMedia(m27065a.m25118c().getAdHeight() != 0 ? r5.getAdWidth() / r5.getAdHeight() : 1.7777778f);
        }
        if (m25863a != null && m25863a.size() > 1) {
            Objects.requireNonNull(this.f57797b);
            return new NativeAdMedia((float) pg0.m27325a(m25863a));
        }
        if (m25864b != null) {
            return new NativeAdMedia(m25864b.m26092a());
        }
        return null;
    }
}
