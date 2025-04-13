package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;

@PublicApi
/* loaded from: classes2.dex */
public interface DivViewFacade {
    /* renamed from: b */
    void mo16607b(@NonNull String str);

    /* renamed from: d */
    void mo16608d(@NonNull DivStatePath divStatePath, boolean z);

    /* renamed from: f */
    void mo16609f(@NonNull String str);

    @NonNull
    ExpressionResolver getExpressionResolver();

    @NonNull
    View getView();
}
