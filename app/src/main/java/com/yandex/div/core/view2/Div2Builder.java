package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.Div;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Div2Builder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/Div2Builder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class Div2Builder {

    /* renamed from: a */
    @NotNull
    public final DivViewCreator f31537a;

    /* renamed from: b */
    @NotNull
    public final DivBinder f31538b;

    @Inject
    public Div2Builder(@NotNull DivViewCreator viewCreator, @NotNull DivBinder viewBinder) {
        Intrinsics.m32179h(viewCreator, "viewCreator");
        Intrinsics.m32179h(viewBinder, "viewBinder");
        this.f31537a = viewCreator;
        this.f31538b = viewBinder;
    }

    @NotNull
    /* renamed from: a */
    public View m16800a(@NotNull Div data, @NotNull Div2View divView, @NotNull DivStatePath divStatePath) {
        Intrinsics.m32179h(data, "data");
        Intrinsics.m32179h(divView, "divView");
        View m16801b = m16801b(data, divView, divStatePath);
        try {
            this.f31538b.m16852b(m16801b, data, divView, divStatePath);
        } catch (ParsingException e2) {
            if (!ExpressionFallbacksHelperKt.m16669a(e2)) {
                throw e2;
            }
        }
        return m16801b;
    }

    @NotNull
    /* renamed from: b */
    public View m16801b(@NotNull Div data, @NotNull Div2View div2View, @NotNull DivStatePath divStatePath) {
        Intrinsics.m32179h(data, "data");
        View m16868n = this.f31537a.m16868n(data, div2View.getExpressionResolver());
        m16868n.setLayoutParams(new DivLayoutParams(-1, -2));
        return m16868n;
    }
}
