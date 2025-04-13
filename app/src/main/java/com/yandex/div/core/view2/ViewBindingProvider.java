package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewBindingProvider.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/ViewBindingProvider;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewBindingProvider {

    /* renamed from: a */
    @NotNull
    public Binding f31722a = new Binding(DivDataTag.f30858b, null);

    /* renamed from: b */
    @NotNull
    public final List<Function1<Binding, Unit>> f31723b = new ArrayList();

    @Inject
    public ViewBindingProvider() {
    }

    /* renamed from: a */
    public final void m16877a(@NotNull DivDataTag tag, @Nullable DivData divData) {
        Intrinsics.m32179h(tag, "tag");
        if (Intrinsics.m32174c(tag, this.f31722a.f31530a) && Intrinsics.m32174c(this.f31722a.f31531b, divData)) {
            return;
        }
        this.f31722a = new Binding(tag, divData);
        Iterator<T> it = this.f31723b.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.f31722a);
        }
    }
}
