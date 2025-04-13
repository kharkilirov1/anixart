package com.yandex.div.core.dagger;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Div2ViewComponent.kt */
@DivViewScope
@Subcomponent
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/dagger/Div2ViewComponent;", "", "Builder", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface Div2ViewComponent {

    /* compiled from: Div2ViewComponent.kt */
    @Subcomponent.Builder
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/dagger/Div2ViewComponent$Builder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Builder {
        @NotNull
        /* renamed from: A */
        Div2ViewComponent mo16650A();

        @BindsInstance
        @NotNull
        /* renamed from: a */
        Builder mo16651a(@NotNull Div2View div2View);
    }

    @NotNull
    /* renamed from: a */
    DivViewIdProvider mo16652a();

    @NotNull
    /* renamed from: b */
    ErrorVisualMonitor mo16653b();

    @NotNull
    /* renamed from: c */
    ReleaseViewVisitor mo16654c();

    @NotNull
    /* renamed from: d */
    ViewBindingProvider mo16655d();

    @NotNull
    /* renamed from: e */
    DivStateSwitcher mo16656e();

    @NotNull
    /* renamed from: f */
    ErrorCollectors mo16657f();

    @NotNull
    /* renamed from: g */
    DivStateTransitionHolder mo16658g();

    @NotNull
    /* renamed from: h */
    DivTransitionBuilder mo16659h();
}
