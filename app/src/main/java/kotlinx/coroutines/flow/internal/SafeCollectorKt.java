package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* compiled from: SafeCollector.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SafeCollectorKt {

    /* renamed from: a */
    @NotNull
    public static final Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> f68218a;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.f68219d;
        TypeIntrinsics.m32215d(safeCollectorKt$emitFun$1, 3);
        f68218a = safeCollectorKt$emitFun$1;
    }
}
