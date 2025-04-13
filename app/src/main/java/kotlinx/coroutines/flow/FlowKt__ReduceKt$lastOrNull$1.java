package kotlinx.coroutines.flow;

import com.yandex.div2.C3033a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m32126f = "Reduce.kt", m32127l = {167}, m32128m = "lastOrNull")
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$lastOrNull$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67803e;

    /* renamed from: f */
    public /* synthetic */ Object f67804f;

    /* renamed from: g */
    public int f67805g;

    public FlowKt__ReduceKt$lastOrNull$1(Continuation<? super FlowKt__ReduceKt$lastOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__ReduceKt$lastOrNull$1<T> flowKt__ReduceKt$lastOrNull$1;
        this.f67804f = obj;
        int i2 = this.f67805g | Integer.MIN_VALUE;
        this.f67805g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67805g = i2 - Integer.MIN_VALUE;
            flowKt__ReduceKt$lastOrNull$1 = this;
        } else {
            flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1<>(this);
        }
        Object obj2 = flowKt__ReduceKt$lastOrNull$1.f67804f;
        int i3 = flowKt__ReduceKt$lastOrNull$1.f67805g;
        if (i3 == 0) {
            flowKt__ReduceKt$lastOrNull$1.f67803e = C3033a.m17746h(obj2);
            flowKt__ReduceKt$lastOrNull$1.f67805g = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef = (Ref.ObjectRef) flowKt__ReduceKt$lastOrNull$1.f67803e;
        ResultKt.m31892b(obj2);
        return objectRef.f63351b;
    }
}
