package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.zl */
/* loaded from: classes3.dex */
public final class C6128zl {

    /* renamed from: a */
    @NonNull
    private final Context f57228a;

    public C6128zl(@NonNull Context context) {
        this.f57228a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean m30210a() {
        return (this.f57228a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
