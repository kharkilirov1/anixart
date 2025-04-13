package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class qc0 {

    /* renamed from: a */
    @NonNull
    private final y10 f54001a = new y10();

    @NonNull
    /* renamed from: a */
    public final zk1 m27670a(@NonNull MediaView mediaView, @NonNull w10 w10Var, @NonNull C5101g2 c5101g2) {
        ImageView imageView = new ImageView(mediaView.getContext());
        Objects.requireNonNull(this.f54001a);
        mediaView.removeAllViews();
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new zk1(mediaView, new h20(imageView, w10Var), c5101g2);
    }
}
