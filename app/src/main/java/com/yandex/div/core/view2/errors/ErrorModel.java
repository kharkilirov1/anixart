package com.yandex.div.core.view2.errors;

import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/ErrorModel;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ErrorModel {

    /* renamed from: a */
    @NotNull
    public final ErrorCollectors f32882a;

    /* renamed from: e */
    @Nullable
    public Disposable f32886e;

    /* renamed from: b */
    @NotNull
    public final Set<Function1<ErrorViewModel, Unit>> f32883b = new LinkedHashSet();

    /* renamed from: c */
    @NotNull
    public final List<Throwable> f32884c = new ArrayList();

    /* renamed from: d */
    @NotNull
    public final List<Throwable> f32885d = new ArrayList();

    /* renamed from: f */
    @NotNull
    public final Function2<List<? extends Throwable>, List<? extends Throwable>, Unit> f32887f = new Function2<List<? extends Throwable>, List<? extends Throwable>, Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$updateOnErrors$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public Unit invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            List<? extends Throwable> errors = list;
            List<? extends Throwable> warnings = list2;
            Intrinsics.m32179h(errors, "errors");
            Intrinsics.m32179h(warnings, "warnings");
            List<Throwable> list3 = ErrorModel.this.f32884c;
            list3.clear();
            list3.addAll(CollectionsKt.m32008U(errors));
            List<Throwable> list4 = ErrorModel.this.f32885d;
            list4.clear();
            list4.addAll(CollectionsKt.m32008U(warnings));
            ErrorModel errorModel = ErrorModel.this;
            errorModel.m17117a(ErrorViewModel.m17118a(errorModel.f32888g, false, errorModel.f32884c.size(), ErrorModel.this.f32885d.size(), Intrinsics.m32187p("Last 25 errors:\n", CollectionsKt.m31989B(CollectionsKt.m32018e0(ErrorModel.this.f32884c, 25), "\n", null, null, 0, null, new Function1<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$errorsToDetails$errorsList$1
                @Override // kotlin.jvm.functions.Function1
                public CharSequence invoke(Throwable th) {
                    Throwable it = th;
                    Intrinsics.m32179h(it, "it");
                    if (!(it instanceof ParsingException)) {
                        return Intrinsics.m32187p(" - ", ErrorVisualMonitorKt.m17122a(it));
                    }
                    StringBuilder m24u = C0000a.m24u(" - ");
                    m24u.append(((ParsingException) it).f34318b);
                    m24u.append(": ");
                    m24u.append(ErrorVisualMonitorKt.m17122a(it));
                    return m24u.toString();
                }
            }, 30, null)), Intrinsics.m32187p("Last 25 warnings:\n", CollectionsKt.m31989B(CollectionsKt.m32018e0(ErrorModel.this.f32885d, 25), "\n", null, null, 0, null, new Function1<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$warningsToDetails$warningsList$1
                @Override // kotlin.jvm.functions.Function1
                public CharSequence invoke(Throwable th) {
                    Throwable it = th;
                    Intrinsics.m32179h(it, "it");
                    return Intrinsics.m32187p(" - ", ErrorVisualMonitorKt.m17122a(it));
                }
            }, 30, null)), 1));
            return Unit.f63088a;
        }
    };

    /* renamed from: g */
    @NotNull
    public ErrorViewModel f32888g = new ErrorViewModel(false, 0, 0, null, null, 31);

    public ErrorModel(@NotNull ErrorCollectors errorCollectors) {
        this.f32882a = errorCollectors;
    }

    /* renamed from: a */
    public final void m17117a(ErrorViewModel errorViewModel) {
        this.f32888g = errorViewModel;
        Iterator<T> it = this.f32883b.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(errorViewModel);
        }
    }
}
