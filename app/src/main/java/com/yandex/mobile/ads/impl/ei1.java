package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ei1<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final ih0 f49978a = new ih0();

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f49978a);
        TextView textView = (TextView) v.findViewById(C4632R.id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
