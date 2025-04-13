package com.yandex.div.state.p019db;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivStateDaoImpl.kt */
@Metadata(m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m31884d2 = {"<anonymous>", "", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivStateDaoImpl$updateState$1 extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    public final /* synthetic */ DivStateDaoImpl f34373b;

    /* renamed from: c */
    public final /* synthetic */ DivStateEntity f34374c;

    @Override // kotlin.jvm.functions.Function0
    public Unit invoke() {
        this.f34373b.f34368b.bindString(1, this.f34374c.f34376b);
        this.f34373b.f34368b.bindString(2, this.f34374c.f34377c);
        this.f34373b.f34368b.bindString(3, this.f34374c.f34378d);
        this.f34373b.f34368b.bindString(4, String.valueOf(this.f34374c.f34379e));
        this.f34373b.f34368b.execute();
        this.f34373b.f34368b.clearBindings();
        return Unit.f63088a;
    }
}
