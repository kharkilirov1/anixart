package com.yandex.div.core.view2.errors;

import com.yandex.div.core.Disposable;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.core.view2.errors.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2880b implements Disposable {

    /* renamed from: b */
    public final /* synthetic */ int f32917b;

    /* renamed from: c */
    public final /* synthetic */ Object f32918c;

    /* renamed from: d */
    public final /* synthetic */ Object f32919d;

    public /* synthetic */ C2880b(Object obj, Function function, int i2) {
        this.f32917b = i2;
        this.f32918c = obj;
        this.f32919d = function;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f32917b) {
            case 0:
                ErrorCollector this$0 = (ErrorCollector) this.f32918c;
                Function2 observer = (Function2) this.f32919d;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(observer, "$observer");
                this$0.f32875a.remove(observer);
                break;
            default:
                ErrorModel this$02 = (ErrorModel) this.f32918c;
                Function1 observer2 = (Function1) this.f32919d;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(observer2, "$observer");
                this$02.f32883b.remove(observer2);
                break;
        }
    }
}
