package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivStateTransition.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/DivStateTransition;", "Landroidx/transition/ChangeBounds;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivStateTransition extends ChangeBounds {

    /* compiled from: DivStateTransition.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    /* renamed from: com.yandex.div.core.state.DivStateTransition$1 */
    final class C28371 extends Lambda implements Function1<View, Unit> {

        /* renamed from: b */
        public final /* synthetic */ DivStateTransition f31333b;

        /* renamed from: c */
        public final /* synthetic */ boolean f31334c;

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(View view) {
            View it = view;
            Intrinsics.m32179h(it, "it");
            if (it instanceof RecyclerView) {
                DivStateTransition divStateTransition = this.f31333b;
                divStateTransition.f6272i = divStateTransition.m4247o(divStateTransition.f6272i, it, true);
            } else if (this.f31334c && (it instanceof Div2View)) {
                DivStateTransition divStateTransition2 = this.f31333b;
                divStateTransition2.f6271h = divStateTransition2.m4247o(divStateTransition2.f6271h, it, true);
            }
            return Unit.f63088a;
        }
    }
}
