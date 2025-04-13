package com.yandex.div.core.view2.divs;

import android.view.View;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBorder;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivFocusBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivFocusBinder;", "", "FocusChangeListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivFocusBinder {

    /* renamed from: a */
    @NotNull
    public final DivActionBinder f32057a;

    /* compiled from: DivFocusBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivFocusBinder$FocusChangeListener;", "Landroid/view/View$OnFocusChangeListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class FocusChangeListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        @NotNull
        public final Div2View f32058b;

        /* renamed from: c */
        @NotNull
        public final ExpressionResolver f32059c;

        /* renamed from: d */
        @Nullable
        public DivBorder f32060d;

        /* renamed from: e */
        @Nullable
        public DivBorder f32061e;

        /* renamed from: f */
        @Nullable
        public List<? extends DivAction> f32062f;

        /* renamed from: g */
        @Nullable
        public List<? extends DivAction> f32063g;

        public FocusChangeListener(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
            this.f32058b = div2View;
            this.f32059c = expressionResolver;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(@NotNull View v, boolean z) {
            DivBorder divBorder;
            Intrinsics.m32179h(v, "v");
            if (z) {
                DivBorder divBorder2 = this.f32060d;
                if (divBorder2 != null) {
                    DivFocusBinder.this.m16995a(v, divBorder2, this.f32059c);
                }
                List<? extends DivAction> list = this.f32062f;
                if (list == null) {
                    return;
                }
                DivFocusBinder.this.f32057a.m16971c(this.f32058b, v, list, "focus");
                return;
            }
            if (this.f32060d != null && (divBorder = this.f32061e) != null) {
                DivFocusBinder.this.m16995a(v, divBorder, this.f32059c);
            }
            List<? extends DivAction> list2 = this.f32063g;
            if (list2 == null) {
                return;
            }
            DivFocusBinder.this.f32057a.m16971c(this.f32058b, v, list2, "blur");
        }
    }

    @Inject
    public DivFocusBinder(@NotNull DivActionBinder actionBinder) {
        Intrinsics.m32179h(actionBinder, "actionBinder");
        this.f32057a = actionBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m16995a(View view, DivBorder divBorder, ExpressionResolver expressionResolver) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).mo17098a(divBorder, expressionResolver);
            return;
        }
        float f2 = 0.0f;
        if (!BaseDivViewExtensionsKt.m16916F(divBorder) && divBorder.f34791c.mo17535b(expressionResolver).booleanValue() && divBorder.f34792d == null) {
            f2 = view.getResources().getDimension(C2507R.dimen.div_shadow_elevation);
        }
        view.setElevation(f2);
    }
}
