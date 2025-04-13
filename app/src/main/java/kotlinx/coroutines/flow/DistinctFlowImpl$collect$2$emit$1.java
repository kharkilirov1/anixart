package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Distinct.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m32126f = "Distinct.kt", m32127l = {C4632R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67457e;

    /* renamed from: f */
    public final /* synthetic */ DistinctFlowImpl$collect$2<T> f67458f;

    /* renamed from: g */
    public int f67459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl$collect$2<? super T> distinctFlowImpl$collect$2, Continuation<? super DistinctFlowImpl$collect$2$emit$1> continuation) {
        super(continuation);
        this.f67458f = distinctFlowImpl$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67457e = obj;
        this.f67459g |= Integer.MIN_VALUE;
        return this.f67458f.mo4139f(null, this);
    }
}
