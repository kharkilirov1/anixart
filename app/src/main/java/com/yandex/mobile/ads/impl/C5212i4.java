package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.google.firebase.auth.C2052a;
import com.yandex.mobile.ads.C4632R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.i4 */
/* loaded from: classes3.dex */
public final class C5212i4 implements k40 {

    /* renamed from: c */
    private static final int f51210c = C4632R.string.yandex_ads_internal_instream_ad_position;

    /* renamed from: a */
    private final int f51211a;

    /* renamed from: b */
    private final int f51212b;

    public C5212i4(int i2, int i3) {
        this.f51211a = i2;
        this.f51212b = i3;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        TextView m28930b = uiElements.m28930b();
        if (m28930b != null) {
            String string = m28930b.getContext().getResources().getString(f51210c);
            Intrinsics.m32178g(string, "resources.getString(POSITION_TEMPLATE_ID)");
            C2052a.m12290y(new Object[]{Integer.valueOf(this.f51211a), Integer.valueOf(this.f51212b)}, 2, string, "format(format, *args)", m28930b);
        }
    }
}
