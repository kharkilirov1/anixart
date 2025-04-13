package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class h20 extends dg1<ImageView, z10> {

    /* renamed from: b */
    @NonNull
    private final w10 f50797b;

    /* renamed from: c */
    @NonNull
    private final d20 f50798c;

    /* renamed from: d */
    @NonNull
    private final i21 f50799d;

    public h20(@NonNull ImageView imageView, @NonNull w10 w10Var) {
        super(imageView);
        this.f50797b = w10Var;
        this.f50798c = new d20(w10Var);
        this.f50799d = new i21();
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull ImageView imageView) {
        ImageView imageView2 = imageView;
        imageView2.setImageDrawable(null);
        this.f50799d.m25428a(imageView2);
        super.mo22387a((h20) imageView2);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final boolean mo22388a(@NonNull ImageView imageView, @NonNull z10 z10Var) {
        Drawable drawable = imageView.getDrawable();
        return this.f50798c.m23792a(drawable, z10Var);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NonNull ImageView imageView) {
        imageView.setImageDrawable(null);
        this.f50799d.m25428a(imageView);
        super.mo22387a((h20) imageView);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void mo22389b(@NonNull ImageView imageView, @NonNull z10 z10Var) {
        Bitmap mo24878a = this.f50797b.mo24878a(z10Var);
        if (mo24878a != null) {
            if (z10Var.m30041c() != null) {
                this.f50799d.m25429a(imageView, z10Var, mo24878a);
            } else {
                imageView.setImageBitmap(mo24878a);
            }
        }
    }
}
