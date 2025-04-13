package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j0 */
/* loaded from: classes3.dex */
public final class C5259j0 implements InterfaceC5420m0 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC5420m0
    @Nullable
    /* renamed from: a */
    public final InterfaceC5370l0 mo25752a(@NonNull Context context, @NonNull RelativeLayout relativeLayout, @NonNull C4788a1 c4788a1, @NonNull C5612q0 c5612q0, @NonNull Intent intent, @NonNull Window window) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                return new C5207i0(context, relativeLayout, c4788a1, window, stringExtra);
            } catch (mi1 unused) {
            }
        }
        return null;
    }
}
