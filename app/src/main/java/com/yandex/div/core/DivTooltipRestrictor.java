package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivTooltip;

@PublicApi
/* loaded from: classes2.dex */
public interface DivTooltipRestrictor {

    /* renamed from: a */
    public static final /* synthetic */ int f30987a = 0;

    public interface DivTooltipShownCallback {
        /* renamed from: a */
        void m16604a(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip);

        /* renamed from: b */
        void m16605b(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip);
    }

    /* renamed from: a */
    boolean mo16602a(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip);

    @Nullable
    /* renamed from: b */
    DivTooltipShownCallback mo16603b();
}
