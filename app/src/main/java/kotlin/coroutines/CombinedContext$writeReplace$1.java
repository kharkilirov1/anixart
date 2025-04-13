package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class CombinedContext$writeReplace$1 extends Lambda implements Function2<Unit, CoroutineContext.Element, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public Unit invoke(Unit unit, CoroutineContext.Element element) {
        CoroutineContext.Element element2 = element;
        Intrinsics.m32179h(unit, "<anonymous parameter 0>");
        Intrinsics.m32179h(element2, "element");
        throw null;
    }
}
