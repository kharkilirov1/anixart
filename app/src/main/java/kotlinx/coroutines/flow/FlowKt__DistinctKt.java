package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Distinct.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 5, m31886mv = {1, 6, 0}, m31889xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a */
    @NotNull
    public static final Function1<Object, Object> f67589a = new Function1<Object, Object>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    };

    /* renamed from: b */
    @NotNull
    public static final Function2<Object, Object, Boolean> f67590b = new Function2<Object, Object, Boolean>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // kotlin.jvm.functions.Function2
        public Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.m32174c(obj, obj2));
        }
    };
}
