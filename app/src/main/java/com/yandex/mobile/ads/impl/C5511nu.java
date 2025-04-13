package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;

/* renamed from: com.yandex.mobile.ads.impl.nu */
/* loaded from: classes3.dex */
public final class C5511nu extends dg1<ImageView, C5413lu> {

    /* renamed from: b */
    @NonNull
    private final w10 f53093b;

    public C5511nu(@NonNull ImageView imageView, @NonNull w10 w10Var) {
        super(imageView);
        this.f53093b = w10Var;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo22388a(@NonNull ImageView imageView, @NonNull C5413lu c5413lu) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(@NonNull ImageView imageView, @NonNull C5413lu c5413lu) {
        ImageView imageView2 = imageView;
        z10 m26532a = c5413lu.m26532a();
        if (m26532a != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                imageView2.setForeground(null);
            }
            imageView2.setBackground(null);
            Bitmap mo24878a = this.f53093b.mo24878a(m26532a);
            if (mo24878a == null) {
                imageView2.setImageDrawable(ContextCompat.m1671d(imageView2.getContext(), C4632R.drawable.yandex_ads_internal_default_adtune_feedback_icon));
            } else {
                imageView2.setImageBitmap(mo24878a);
            }
        }
    }
}
