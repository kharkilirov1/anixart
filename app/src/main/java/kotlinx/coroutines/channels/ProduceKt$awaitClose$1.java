package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Produce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ProduceKt", m32126f = "Produce.kt", m32127l = {153}, m32128m = "awaitClose")
/* loaded from: classes3.dex */
final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67364e;

    /* renamed from: f */
    public Object f67365f;

    /* renamed from: g */
    public /* synthetic */ Object f67366g;

    /* renamed from: h */
    public int f67367h;

    public ProduceKt$awaitClose$1(Continuation<? super ProduceKt$awaitClose$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        this.f67366g = obj;
        int i2 = this.f67367h | Integer.MIN_VALUE;
        this.f67367h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67367h = i2 - Integer.MIN_VALUE;
            produceKt$awaitClose$1 = this;
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(this);
        }
        Object obj2 = produceKt$awaitClose$1.f67366g;
        int i3 = produceKt$awaitClose$1.f67367h;
        Function0 function0 = null;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function0 function02 = (Function0) produceKt$awaitClose$1.f67365f;
                ResultKt.m31892b(obj2);
                function02.invoke();
                return Unit.f63088a;
            }
            ResultKt.m31892b(obj2);
            CoroutineContext coroutineContext = produceKt$awaitClose$1.f63244c;
            Intrinsics.m32176e(coroutineContext);
            int i4 = Job.f67018J1;
            if (!(coroutineContext.get(Job.Key.f67019b) == null)) {
                throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
            }
            produceKt$awaitClose$1.f67364e = null;
            produceKt$awaitClose$1.f67365f = null;
            produceKt$awaitClose$1.f67367h = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(produceKt$awaitClose$1), 1);
            cancellableContinuationImpl.m33993y();
            new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Unit unit = Unit.f63088a;
                    cancellableContinuation.mo31877j(unit);
                    return unit;
                }
            };
            throw null;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }
}
