package kotlinx.coroutines.flow;

import com.yandex.div2.C3033a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m32126f = "Reduce.kt", m32127l = {155}, m32128m = "last")
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$last$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67799e;

    /* renamed from: f */
    public /* synthetic */ Object f67800f;

    /* renamed from: g */
    public int f67801g;

    public FlowKt__ReduceKt$last$1(Continuation<? super FlowKt__ReduceKt$last$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__ReduceKt$last$1<T> flowKt__ReduceKt$last$1;
        this.f67800f = obj;
        int i2 = this.f67801g | Integer.MIN_VALUE;
        this.f67801g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67801g = i2 - Integer.MIN_VALUE;
            flowKt__ReduceKt$last$1 = this;
        } else {
            flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1<>(this);
        }
        Object obj2 = flowKt__ReduceKt$last$1.f67800f;
        int i3 = flowKt__ReduceKt$last$1.f67801g;
        if (i3 == 0) {
            Ref.ObjectRef m17746h = C3033a.m17746h(obj2);
            m17746h.f63351b = (T) NullSurrogateKt.f68209a;
            flowKt__ReduceKt$last$1.f67799e = m17746h;
            flowKt__ReduceKt$last$1.f67801g = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef = (Ref.ObjectRef) flowKt__ReduceKt$last$1.f67799e;
        ResultKt.m31892b(obj2);
        T t = objectRef.f63351b;
        if (t != NullSurrogateKt.f68209a) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
