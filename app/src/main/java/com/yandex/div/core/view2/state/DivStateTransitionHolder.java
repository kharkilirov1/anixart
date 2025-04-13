package com.yandex.div.core.view2.state;

import androidx.transition.Transition;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateTransitionHolder.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/state/DivStateTransitionHolder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivStateTransitionHolder {

    /* renamed from: a */
    @NotNull
    public final Div2View f32949a;

    /* renamed from: b */
    @NotNull
    public final List<Transition> f32950b;

    /* renamed from: c */
    public boolean f32951c;

    @Inject
    public DivStateTransitionHolder(@NotNull Div2View div2View) {
        Intrinsics.m32179h(div2View, "div2View");
        this.f32949a = div2View;
        this.f32950b = new ArrayList();
    }
}
