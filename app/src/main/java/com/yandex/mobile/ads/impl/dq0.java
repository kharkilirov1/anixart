package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class dq0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f49726a;

    /* renamed from: b */
    @NonNull
    private final fh0 f49727b = new fh0();

    /* renamed from: c */
    @NonNull
    private final ih0 f49728c = new ih0();

    public dq0(@NonNull NativeAdAssets nativeAdAssets) {
        this.f49726a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f49727b);
        ImageView imageView = (ImageView) v.findViewById(C4632R.id.icon_placeholder);
        NativeAdImage icon = this.f49726a.getIcon();
        NativeAdImage favicon = this.f49726a.getFavicon();
        if (imageView != null && icon == null && favicon == null) {
            Objects.requireNonNull(this.f49728c);
            ig1 ig1Var = new ig1((TextView) v.findViewById(C4632R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(ig1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
