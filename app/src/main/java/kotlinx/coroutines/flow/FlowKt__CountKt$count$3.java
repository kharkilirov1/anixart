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
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__CountKt", m32126f = "Count.kt", m32127l = {30}, m32128m = "count")
/* loaded from: classes3.dex */
final class FlowKt__CountKt$count$3<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67534e;

    /* renamed from: f */
    public /* synthetic */ Object f67535f;

    /* renamed from: g */
    public int f67536g;

    public FlowKt__CountKt$count$3(Continuation<? super FlowKt__CountKt$count$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__CountKt$count$3<T> flowKt__CountKt$count$3;
        this.f67535f = obj;
        int i2 = this.f67536g | Integer.MIN_VALUE;
        this.f67536g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67536g = i2 - Integer.MIN_VALUE;
            flowKt__CountKt$count$3 = this;
        } else {
            flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3<>(this);
        }
        Object obj2 = flowKt__CountKt$count$3.f67535f;
        int i3 = flowKt__CountKt$count$3.f67536g;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            flowKt__CountKt$count$3.f67534e = new Ref.IntRef();
            flowKt__CountKt$count$3.f67536g = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.IntRef intRef = (Ref.IntRef) flowKt__CountKt$count$3.f67534e;
        ResultKt.m31892b(obj2);
        return new Integer(intRef.f63349b);
    }
}
