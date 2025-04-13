package com.yandex.mobile.ads.instream.player.p025ad;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.ub1;

@MainThread
/* loaded from: classes3.dex */
public class InstreamAdView extends FrameLayout {

    /* renamed from: a */
    @Nullable
    private ub1 f57457a;

    public InstreamAdView(@NonNull Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m30402a(@Nullable ub1 ub1Var) {
        this.f57457a = ub1Var;
    }

    public InstreamAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Nullable
    /* renamed from: a */
    public final ub1 m30401a() {
        return this.f57457a;
    }

    public InstreamAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @RequiresApi
    public InstreamAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
