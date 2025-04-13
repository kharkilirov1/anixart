package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Await.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.AwaitKt", m32126f = "Await.kt", m32127l = {54}, m32128m = "joinAll")
/* loaded from: classes3.dex */
final class AwaitKt$joinAll$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f66931e;

    /* renamed from: f */
    public int f66932f;

    /* renamed from: g */
    public int f66933g;

    /* renamed from: h */
    public /* synthetic */ Object f66934h;

    /* renamed from: i */
    public int f66935i;

    public AwaitKt$joinAll$1(Continuation<? super AwaitKt$joinAll$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        this.f66934h = obj;
        int i2 = this.f66935i | Integer.MIN_VALUE;
        this.f66935i = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f66935i = i2 - Integer.MIN_VALUE;
            awaitKt$joinAll$1 = this;
        } else {
            awaitKt$joinAll$1 = new AwaitKt$joinAll$1(this);
        }
        Object obj2 = awaitKt$joinAll$1.f66934h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = awaitKt$joinAll$1.f66935i;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = awaitKt$joinAll$1.f66933g;
        int i5 = awaitKt$joinAll$1.f66932f;
        Job[] jobArr = (Job[]) awaitKt$joinAll$1.f66931e;
        ResultKt.m31892b(obj2);
        while (i5 < i4) {
            Job job = jobArr[i5];
            i5++;
            awaitKt$joinAll$1.f66931e = jobArr;
            awaitKt$joinAll$1.f66932f = i5;
            awaitKt$joinAll$1.f66933g = i4;
            awaitKt$joinAll$1.f66935i = 1;
            if (job.mo34062k(awaitKt$joinAll$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f63088a;
    }
}
