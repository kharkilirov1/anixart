package io.ashdavies.p030rx.rxtasks;

import io.reactivex.SingleEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SingleTask.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m31884d2 = {"<anonymous>", "", "T", "", "it", "Lio/reactivex/SingleEmitter;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class SingleTaskKt$toSingle$3 extends Lambda implements Function1<SingleEmitter<Object>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(SingleEmitter<Object> singleEmitter) {
        SingleEmitter<Object> it = singleEmitter;
        Intrinsics.m32180i(it, "it");
        new SingleEmitterListener(it);
        throw null;
    }
}
