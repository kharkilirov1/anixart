package kotlinx.coroutines.flow;

import com.yandex.div2.C3033a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67782e;

    /* renamed from: f */
    public Object f67783f;

    /* renamed from: g */
    public /* synthetic */ Object f67784g;

    /* renamed from: h */
    public int f67785h;

    public FlowKt__ReduceKt$firstOrNull$1(Continuation<? super FlowKt__ReduceKt$firstOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__ReduceKt$firstOrNull$1<T> flowKt__ReduceKt$firstOrNull$1;
        FlowCollector<?> flowCollector;
        AbortFlowException e2;
        Ref.ObjectRef objectRef;
        this.f67784g = obj;
        int i2 = this.f67785h | Integer.MIN_VALUE;
        this.f67785h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67785h = i2 - Integer.MIN_VALUE;
            flowKt__ReduceKt$firstOrNull$1 = this;
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1<>(this);
        }
        Object obj2 = flowKt__ReduceKt$firstOrNull$1.f67784g;
        int i3 = flowKt__ReduceKt$firstOrNull$1.f67785h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) flowKt__ReduceKt$firstOrNull$1.f67783f;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.f67782e;
            try {
                ResultKt.m31892b(obj2);
            } catch (AbortFlowException e3) {
                e2 = e3;
            }
            return objectRef.f63351b;
        }
        final Ref.ObjectRef m17746h = C3033a.m17746h(obj2);
        flowCollector = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* renamed from: f */
            public Object mo4139f(Object obj3, @NotNull Continuation<? super Unit> continuation) {
                Ref.ObjectRef.this.f63351b = obj3;
                throw new AbortFlowException(this);
            }
        };
        try {
            flowKt__ReduceKt$firstOrNull$1.f67782e = m17746h;
            flowKt__ReduceKt$firstOrNull$1.f67783f = flowCollector;
            flowKt__ReduceKt$firstOrNull$1.f67785h = 1;
            throw null;
        } catch (AbortFlowException e4) {
            e2 = e4;
            objectRef = m17746h;
        }
        if (e2.f68087b != flowCollector) {
            throw e2;
        }
        return objectRef.f63351b;
    }
}
