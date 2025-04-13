package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Transition.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$addListener$2 extends Lambda implements Function1<Transition, Unit> {
    static {
        new TransitionKt$addListener$2();
    }

    public TransitionKt$addListener$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Transition transition) {
        Transition it = transition;
        Intrinsics.m32179h(it, "it");
        return Unit.f63088a;
    }
}
