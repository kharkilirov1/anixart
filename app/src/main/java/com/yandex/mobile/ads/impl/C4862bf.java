package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.bf */
/* loaded from: classes3.dex */
final class C4862bf implements InterfaceC6118ze<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC6118ze
    /* renamed from: a */
    public final boolean mo22806a(@NonNull BitmapDrawable bitmapDrawable, @NonNull Bitmap bitmap) {
        return bitmap.equals(bitmapDrawable.getBitmap());
    }
}
