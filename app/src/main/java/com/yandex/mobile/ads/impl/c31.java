package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;

/* loaded from: classes3.dex */
public final class c31 implements InterfaceC5784t7 {

    /* renamed from: a */
    @NonNull
    private final d31 f49077a;

    public c31(@NonNull d31 d31Var) {
        this.f49077a = d31Var;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NonNull ub1 ub1Var) {
        TextView m28942n = ub1Var.m28942n();
        if (m28942n != null) {
            m28942n.setText(C4632R.string.yandex_ads_internal_instream_sponsored_social);
            m28942n.setVisibility(0);
            m28942n.setOnClickListener(new b31(this.f49077a));
        }
        ImageView m28941m = ub1Var.m28941m();
        if (m28941m != null) {
            m28941m.setImageDrawable(ContextCompat.m1671d(m28941m.getContext(), C4632R.drawable.yandex_instream_internal_advertiser_social));
            m28941m.setVisibility(0);
            m28941m.setOnClickListener(new b31(this.f49077a));
        }
    }
}
