package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;

/* renamed from: com.yandex.mobile.ads.impl.j7 */
/* loaded from: classes3.dex */
public final class C5273j7 {

    /* renamed from: a */
    @NonNull
    private final C5107g7 f51524a;

    /* renamed from: b */
    @NonNull
    private final C5215i7 f51525b = new C5215i7();

    /* renamed from: c */
    @NonNull
    private final Context f51526c;

    public C5273j7(@NonNull Context context, @NonNull C5527o7 c5527o7) {
        this.f51526c = context;
        this.f51524a = new C5107g7(context, c5527o7);
    }

    @NonNull
    /* renamed from: a */
    public final Dialog m25812a() {
        Dialog dialog = new Dialog(this.f51526c, C4632R.style.YandexAdsInternal_BottomAdtuneDialog);
        ViewGroup m24809a = this.f51524a.m24809a();
        this.f51525b.m25454a(m24809a, dialog);
        dialog.setContentView(m24809a);
        dialog.getWindow().setGravity(80);
        return dialog;
    }
}
