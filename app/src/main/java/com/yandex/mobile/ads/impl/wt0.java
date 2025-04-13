package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class wt0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f56267a;

    /* renamed from: b */
    @NonNull
    private final xt0 f56268b = new xt0();

    /* renamed from: c */
    @NonNull
    private final fh0 f56269c = new fh0();

    /* renamed from: d */
    @NonNull
    private final ph0 f56270d = new ph0();

    public wt0(@NonNull NativeAdAssets nativeAdAssets) {
        this.f56267a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        String valueOf;
        Objects.requireNonNull(this.f56270d);
        ViewGroup viewGroup = (ViewGroup) v.findViewById(C4632R.id.rating_container);
        Float rating = this.f56267a.getRating();
        if (rating == null) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        Objects.requireNonNull(this.f56269c);
        TextView textView = (TextView) v.findViewById(C4632R.id.rating_text);
        if (textView != null) {
            xt0 xt0Var = this.f56268b;
            float floatValue = rating.floatValue();
            Objects.requireNonNull(xt0Var);
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                valueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(floatValue);
            } catch (RuntimeException unused) {
                valueOf = String.valueOf(floatValue);
            }
            textView.setText(valueOf);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
