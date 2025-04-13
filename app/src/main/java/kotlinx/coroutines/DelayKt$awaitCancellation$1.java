package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.DelayKt", m32126f = "Delay.kt", m32127l = {148}, m32128m = "awaitCancellation")
/* loaded from: classes3.dex */
final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f66983e;

    /* renamed from: f */
    public int f66984f;

    public DelayKt$awaitCancellation$1(Continuation<? super DelayKt$awaitCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        this.f66983e = obj;
        int i2 = this.f66984f | Integer.MIN_VALUE;
        this.f66984f = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f66984f = i2 - Integer.MIN_VALUE;
            delayKt$awaitCancellation$1 = this;
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(this);
        }
        Object obj2 = delayKt$awaitCancellation$1.f66983e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = delayKt$awaitCancellation$1.f66984f;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            delayKt$awaitCancellation$1.f66984f = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(delayKt$awaitCancellation$1), 1);
            cancellableContinuationImpl.m33993y();
            if (cancellableContinuationImpl.m33992v() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj2);
        }
        throw new KotlinNothingValueException();
    }
}
