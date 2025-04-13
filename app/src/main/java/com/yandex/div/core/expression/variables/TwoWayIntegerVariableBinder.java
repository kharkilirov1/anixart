package com.yandex.div.core.expression.variables;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TwoWayVariableBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "", "Callbacks", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class TwoWayIntegerVariableBinder extends TwoWayVariableBinder<Long> {

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder$Callbacks;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder$Callbacks;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public interface Callbacks extends TwoWayVariableBinder.Callbacks<Long> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TwoWayIntegerVariableBinder(@NotNull ErrorCollectors errorCollectors, @NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider) {
        super(errorCollectors, expressionsRuntimeProvider);
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        Intrinsics.m32179h(expressionsRuntimeProvider, "expressionsRuntimeProvider");
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    /* renamed from: b */
    public String mo16682b(Long l2) {
        return String.valueOf(l2.longValue());
    }
}
