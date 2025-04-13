package kotlinx.coroutines.flow;

import com.yandex.div2.C3033a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m32126f = "Reduce.kt", m32127l = {183}, m32128m = "firstOrNull")
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67786e;

    /* renamed from: f */
    public Object f67787f;

    /* renamed from: g */
    public /* synthetic */ Object f67788g;

    /* renamed from: h */
    public int f67789h;

    public FlowKt__ReduceKt$firstOrNull$3(Continuation<? super FlowKt__ReduceKt$firstOrNull$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__ReduceKt$firstOrNull$3<T> flowKt__ReduceKt$firstOrNull$3;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        AbortFlowException e2;
        Ref.ObjectRef objectRef;
        this.f67788g = obj;
        int i2 = this.f67789h | Integer.MIN_VALUE;
        this.f67789h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67789h = i2 - Integer.MIN_VALUE;
            flowKt__ReduceKt$firstOrNull$3 = this;
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3<>(this);
        }
        Object obj2 = flowKt__ReduceKt$firstOrNull$3.f67788g;
        int i3 = flowKt__ReduceKt$firstOrNull$3.f67789h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.f67787f;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$3.f67786e;
            try {
                ResultKt.m31892b(obj2);
            } catch (AbortFlowException e3) {
                e2 = e3;
            }
            return objectRef.f63351b;
        }
        Ref.ObjectRef m17746h = C3033a.m17746h(obj2);
        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(null, m17746h);
        try {
            flowKt__ReduceKt$firstOrNull$3.f67786e = m17746h;
            flowKt__ReduceKt$firstOrNull$3.f67787f = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
            flowKt__ReduceKt$firstOrNull$3.f67789h = 1;
            throw null;
        } catch (AbortFlowException e4) {
            e2 = e4;
            objectRef = m17746h;
        }
        if (e2.f68087b != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
            throw e2;
        }
        return objectRef.f63351b;
    }
}
