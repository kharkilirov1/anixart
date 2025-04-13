package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Count.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__CountKt", m32126f = "Count.kt", m32127l = {18}, m32128m = "count")
/* loaded from: classes3.dex */
final class FlowKt__CountKt$count$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67530e;

    /* renamed from: f */
    public /* synthetic */ Object f67531f;

    /* renamed from: g */
    public int f67532g;

    public FlowKt__CountKt$count$1(Continuation<? super FlowKt__CountKt$count$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__CountKt$count$1<T> flowKt__CountKt$count$1;
        this.f67531f = obj;
        int i2 = this.f67532g | Integer.MIN_VALUE;
        this.f67532g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67532g = i2 - Integer.MIN_VALUE;
            flowKt__CountKt$count$1 = this;
        } else {
            flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1<>(this);
        }
        Object obj2 = flowKt__CountKt$count$1.f67531f;
        int i3 = flowKt__CountKt$count$1.f67532g;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            flowKt__CountKt$count$1.f67530e = new Ref.IntRef();
            flowKt__CountKt$count$1.f67532g = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.IntRef intRef = (Ref.IntRef) flowKt__CountKt$count$1.f67530e;
        ResultKt.m31892b(obj2);
        return new Integer(intRef.f63349b);
    }
}
