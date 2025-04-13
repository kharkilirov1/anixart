package com.yandex.div.core.view2;

import androidx.annotation.AnyThread;
import com.yandex.div.internal.util.SynchronizedList;
import com.yandex.div2.DivVisibilityAction;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVisibilityTokenHolder.kt */
@AnyThread
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivVisibilityTokenHolder {

    /* renamed from: a */
    @NotNull
    public final SynchronizedList<Map<CompositeLogId, DivVisibilityAction>> f31716a = new SynchronizedList<>();
}
