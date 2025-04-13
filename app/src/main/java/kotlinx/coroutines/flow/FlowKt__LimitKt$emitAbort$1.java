package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Limit.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m32126f = "Limit.kt", m32127l = {C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m32128m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes3.dex */
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67705e;

    /* renamed from: f */
    public /* synthetic */ Object f67706f;

    /* renamed from: g */
    public int f67707g;

    public FlowKt__LimitKt$emitAbort$1(Continuation<? super FlowKt__LimitKt$emitAbort$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67706f = obj;
        this.f67707g |= Integer.MIN_VALUE;
        FlowKt__LimitKt.m34218a(null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
