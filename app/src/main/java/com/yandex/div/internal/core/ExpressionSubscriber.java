package com.yandex.div.internal.core;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.Releasable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExpressionSubscriber.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/Releasable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface ExpressionSubscriber extends Releasable {
    /* renamed from: e */
    void mo16763e(@NotNull Disposable disposable);

    @NotNull
    List<Disposable> getSubscriptions();

    /* renamed from: h */
    void mo16764h();
}
