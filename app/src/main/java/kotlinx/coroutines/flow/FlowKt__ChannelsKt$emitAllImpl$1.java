package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m32126f = "Channels.kt", m32127l = {51, C4632R.styleable.AppCompatTheme_dialogPreferredPadding}, m32128m = "emitAllImpl$FlowKt__ChannelsKt")
/* loaded from: classes3.dex */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67514e;

    /* renamed from: f */
    public Object f67515f;

    /* renamed from: g */
    public boolean f67516g;

    /* renamed from: h */
    public /* synthetic */ Object f67517h;

    /* renamed from: i */
    public int f67518i;

    public FlowKt__ChannelsKt$emitAllImpl$1(Continuation<? super FlowKt__ChannelsKt$emitAllImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67517h = obj;
        this.f67518i |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m34216a(null, null, false, this);
    }
}
