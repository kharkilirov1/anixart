package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transform.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m32126f = "Transform.kt", m32127l = {C4632R.styleable.AppCompatTheme_textAppearanceListItem, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67901e;

    /* renamed from: f */
    public Object f67902f;

    /* renamed from: g */
    public /* synthetic */ Object f67903g;

    /* renamed from: h */
    public final /* synthetic */ FlowKt__TransformKt$runningFold$1$1<T> f67904h;

    /* renamed from: i */
    public int f67905i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1$emit$1(FlowKt__TransformKt$runningFold$1$1<? super T> flowKt__TransformKt$runningFold$1$1, Continuation<? super FlowKt__TransformKt$runningFold$1$1$emit$1> continuation) {
        super(continuation);
        this.f67904h = flowKt__TransformKt$runningFold$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67903g = obj;
        this.f67905i |= Integer.MIN_VALUE;
        return this.f67904h.mo4139f(null, this);
    }
}
