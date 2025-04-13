package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.rj */
/* loaded from: classes3.dex */
public final class C5692rj {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f54326a;

    /* renamed from: b */
    @NonNull
    private final fh0 f54327b = new fh0();

    /* renamed from: c */
    private final int f54328c;

    public C5692rj(@NonNull NativeAdAssets nativeAdAssets, int i2) {
        this.f54326a = nativeAdAssets;
        this.f54328c = i2;
    }

    @Nullable
    /* renamed from: a */
    public final ImageView m27933a(@NonNull View view) {
        return m27932a(view, 1, this.f54326a.getFavicon());
    }

    @Nullable
    /* renamed from: b */
    public final ImageView m27934b(@NonNull View view) {
        return m27932a(view, 2, this.f54326a.getIcon());
    }

    @Nullable
    /* renamed from: a */
    private ImageView m27932a(@NonNull View view, @NonNull int i2, @Nullable NativeAdImage nativeAdImage) {
        int i3 = this.f54326a.getIcon() != null ? 2 : this.f54326a.getFavicon() != null ? 1 : 3;
        if (nativeAdImage == null || i3 != i2) {
            return null;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        int i4 = this.f54328c;
        if (i4 <= width && i4 <= height) {
            Objects.requireNonNull(this.f54327b);
            return (ImageView) view.findViewById(C4632R.id.icon_large);
        }
        Objects.requireNonNull(this.f54327b);
        return (ImageView) view.findViewById(C4632R.id.icon_small);
    }
}
