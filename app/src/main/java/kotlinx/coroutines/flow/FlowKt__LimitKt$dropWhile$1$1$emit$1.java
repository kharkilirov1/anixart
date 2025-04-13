package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Limit.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m32126f = "Limit.kt", m32127l = {37, C4632R.styleable.AppCompatTheme_alertDialogTheme, 40}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67700e;

    /* renamed from: f */
    public Object f67701f;

    /* renamed from: g */
    public /* synthetic */ Object f67702g;

    /* renamed from: h */
    public final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1<T> f67703h;

    /* renamed from: i */
    public int f67704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1<? super T> flowKt__LimitKt$dropWhile$1$1, Continuation<? super FlowKt__LimitKt$dropWhile$1$1$emit$1> continuation) {
        super(continuation);
        this.f67703h = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67702g = obj;
        this.f67704i |= Integer.MIN_VALUE;
        return this.f67703h.mo4139f(null, this);
    }
}
