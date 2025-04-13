package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class jk0 {

    /* renamed from: a */
    @NonNull
    private final ui0 f51632a;

    public jk0(@NonNull Context context) {
        this.f51632a = new ui0(context);
    }

    @Nullable
    /* renamed from: a */
    public final qi0 m25899a(@NonNull AdResponse<String> adResponse) {
        String m21801B = adResponse.m21801B();
        if (TextUtils.isEmpty(m21801B)) {
            return null;
        }
        return this.f51632a.m29005a(m21801B);
    }
}
