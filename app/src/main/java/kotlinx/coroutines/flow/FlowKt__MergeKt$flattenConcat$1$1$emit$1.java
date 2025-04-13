package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m32126f = "Merge.kt", m32127l = {C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67736e;

    /* renamed from: f */
    public final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1<T> f67737f;

    /* renamed from: g */
    public int f67738g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1<? super T> flowKt__MergeKt$flattenConcat$1$1, Continuation<? super FlowKt__MergeKt$flattenConcat$1$1$emit$1> continuation) {
        super(continuation);
        this.f67737f = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67736e = obj;
        this.f67738g |= Integer.MIN_VALUE;
        return this.f67737f.mo4139f(null, this);
    }
}
