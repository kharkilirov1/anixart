package com.yandex.div.core.expression.variables;

import androidx.annotation.MainThread;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.C2826a;
import com.yandex.div.core.expression.ExpressionsRuntimeProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div2.DivData;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TwoWayVariableBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "T", "", "Callbacks", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class TwoWayVariableBinder<T> {

    /* renamed from: a */
    @NotNull
    public final ErrorCollectors f31250a;

    /* renamed from: b */
    @NotNull
    public final ExpressionsRuntimeProvider f31251b;

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder$Callbacks;", "T", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Callbacks<T> {
        @MainThread
        /* renamed from: a */
        void mo16684a(@Nullable T t);

        /* renamed from: b */
        void mo16685b(@NotNull Function1<? super T, Unit> function1);
    }

    public TwoWayVariableBinder(@NotNull ErrorCollectors errorCollectors, @NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider) {
        this.f31250a = errorCollectors;
        this.f31251b = expressionsRuntimeProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Disposable m16683a(@NotNull Div2View divView, @NotNull final String variableName, @NotNull final Callbacks<T> callbacks) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(variableName, "variableName");
        DivData divData = divView.getDivData();
        if (divData == null) {
            return C2814a.f31000b;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        DivDataTag dataTag = divView.getDataTag();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final VariableController variableController = this.f31251b.m16675a(dataTag, divData).f31191b;
        callbacks.mo16685b(new Function1<T, Unit>() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                if (!Intrinsics.m32174c(objectRef.f63351b, obj)) {
                    objectRef.f63351b = obj;
                    Variable variable = (T) ((Variable) objectRef2.f63351b);
                    Variable variable2 = variable;
                    if (variable == null) {
                        T t = (T) variableController.m16688c(variableName);
                        objectRef2.f63351b = t;
                        variable2 = t;
                    }
                    if (variable2 != null) {
                        variable2.m17212d(this.mo16682b(obj));
                    }
                }
                return Unit.f63088a;
            }
        });
        ErrorCollector m17115a = this.f31250a.m17115a(dataTag, divData);
        Function1<Variable, Unit> function1 = new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Variable variable) {
                Variable changed = variable;
                Intrinsics.m32179h(changed, "changed");
                ?? m17210b = changed.m17210b();
                if (!Intrinsics.m32174c(objectRef.f63351b, m17210b)) {
                    objectRef.f63351b = m17210b;
                    callbacks.mo16684a(m17210b);
                }
                return Unit.f63088a;
            }
        };
        Objects.requireNonNull(variableController);
        variableController.m16690e(variableName, m17115a, true, function1);
        return new C2826a(variableController, variableName, function1, 1);
    }

    @NotNull
    /* renamed from: b */
    public abstract String mo16682b(T t);
}
