package io.ashdavies.p030rx.rxtasks;

import io.reactivex.CompletableEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: CompletableTask.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "it", "Lio/reactivex/CompletableEmitter;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class CompletableTaskKt$toCompletable$1 extends Lambda implements Function1<CompletableEmitter, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(CompletableEmitter completableEmitter) {
        CompletableEmitter it = completableEmitter;
        Intrinsics.m32180i(it, "it");
        new CompletableEmitterListener(it);
        throw null;
    }
}
