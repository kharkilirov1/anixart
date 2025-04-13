package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SafeCollector.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements Function3, SuspendFunction {

    /* renamed from: d */
    public static final SafeCollectorKt$emitFun$1 f68219d = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(Object obj, Object obj2, Object obj3) {
        return ((FlowCollector) obj).mo4139f(obj2, (Continuation) obj3);
    }
}
