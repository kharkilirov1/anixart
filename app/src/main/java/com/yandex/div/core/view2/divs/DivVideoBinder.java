package com.yandex.div.core.view2.divs;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div2.DivVideo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVideoBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivVideo;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivVideoBinder implements DivViewBinder<DivVideo, DivVideoView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32527a;

    /* renamed from: b */
    @NotNull
    public final TwoWayIntegerVariableBinder f32528b;

    @Inject
    public DivVideoBinder(@NotNull DivBaseBinder baseBinder, @NotNull TwoWayIntegerVariableBinder variableBinder, @NotNull DivActionHandler divActionHandler) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(variableBinder, "variableBinder");
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        this.f32527a = baseBinder;
        this.f32528b = variableBinder;
    }
}
