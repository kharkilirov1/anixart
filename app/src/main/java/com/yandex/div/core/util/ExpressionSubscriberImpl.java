package com.yandex.div.core.util;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: Releasables.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/ExpressionSubscriberImpl;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ExpressionSubscriberImpl implements ExpressionSubscriber {

    /* renamed from: b */
    @NotNull
    public final List<Disposable> f31467b = new ArrayList();

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.f31467b;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
    }
}
