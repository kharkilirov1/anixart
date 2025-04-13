package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;

/* loaded from: classes3.dex */
public final class jd0 implements pc0 {
    @Override // com.yandex.mobile.ads.impl.pc0
    @NonNull
    /* renamed from: a */
    public final nc0 mo25870a(@NonNull MediaView mediaView, @NonNull C5101g2 c5101g2, @NonNull w10 w10Var, @NonNull l20 l20Var, @NonNull zj0 zj0Var, @NonNull nj0 nj0Var, @Nullable s01 s01Var, @Nullable jc0 jc0Var) {
        mediaView.removeAllViews();
        return new id0(mediaView, c5101g2);
    }
}
