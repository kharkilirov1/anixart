package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.ViewBindingProvider;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ErrorVisualMonitor.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/ErrorVisualMonitor;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ErrorVisualMonitor {

    /* renamed from: a */
    @NotNull
    public final ViewBindingProvider f32906a;

    /* renamed from: b */
    public boolean f32907b;

    /* renamed from: c */
    @NotNull
    public final ErrorModel f32908c;

    /* renamed from: d */
    @Nullable
    public ViewGroup f32909d;

    /* renamed from: e */
    @Nullable
    public ErrorView f32910e;

    @Inject
    public ErrorVisualMonitor(@NotNull ErrorCollectors errorCollectors, @ExperimentFlag boolean z, @NotNull ViewBindingProvider bindingProvider) {
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        Intrinsics.m32179h(bindingProvider, "bindingProvider");
        this.f32906a = bindingProvider;
        this.f32907b = z;
        this.f32908c = new ErrorModel(errorCollectors);
        m17121b();
    }

    /* renamed from: a */
    public final void m17120a(@NotNull ViewGroup viewGroup) {
        this.f32909d = viewGroup;
        if (this.f32907b) {
            ErrorView errorView = this.f32910e;
            if (errorView != null) {
                errorView.close();
            }
            this.f32910e = new ErrorView(viewGroup, this.f32908c);
        }
    }

    /* renamed from: b */
    public final void m17121b() {
        if (!this.f32907b) {
            ErrorView errorView = this.f32910e;
            if (errorView != null) {
                errorView.close();
            }
            this.f32910e = null;
            return;
        }
        ViewBindingProvider viewBindingProvider = this.f32906a;
        Function1<Binding, Unit> function1 = new Function1<Binding, Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor$connectOrDisconnect$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Binding binding) {
                Binding it = binding;
                Intrinsics.m32179h(it, "it");
                ErrorModel errorModel = ErrorVisualMonitor.this.f32908c;
                Objects.requireNonNull(errorModel);
                Disposable disposable = errorModel.f32886e;
                if (disposable != null) {
                    disposable.close();
                }
                ErrorCollector m17115a = errorModel.f32882a.m17115a(it.f31530a, it.f31531b);
                Function2<List<? extends Throwable>, List<? extends Throwable>, Unit> observer = errorModel.f32887f;
                Intrinsics.m32179h(observer, "observer");
                m17115a.f32875a.add(observer);
                observer.invoke(m17115a.f32878d, m17115a.f32879e);
                errorModel.f32886e = new C2880b(m17115a, observer, 0);
                return Unit.f63088a;
            }
        };
        Objects.requireNonNull(viewBindingProvider);
        function1.invoke(viewBindingProvider.f31722a);
        viewBindingProvider.f31723b.add(function1);
        ViewGroup viewGroup = this.f32909d;
        if (viewGroup == null) {
            return;
        }
        m17120a(viewGroup);
    }
}
