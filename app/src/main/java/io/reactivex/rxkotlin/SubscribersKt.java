package io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: subscribers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"rxkotlin"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SubscribersKt {
    static {
        SubscribersKt$onNextStub$1 subscribersKt$onNextStub$1 = new Function1<Object, Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onNextStub$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object it) {
                Intrinsics.m32180i(it, "it");
                return Unit.f63088a;
            }
        };
        SubscribersKt$onErrorStub$1 subscribersKt$onErrorStub$1 = new Function1<Throwable, Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable it = th;
                Intrinsics.m32180i(it, "it");
                return Unit.f63088a;
            }
        };
        SubscribersKt$onCompleteStub$1 subscribersKt$onCompleteStub$1 = new Function0<Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onCompleteStub$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.f63088a;
            }
        };
    }
}
