package kotlinx.coroutines.channels;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TickerChannels.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.TickerChannelsKt", m32126f = "TickerChannels.kt", m32127l = {C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu}, m32128m = "fixedDelayTicker")
/* loaded from: classes3.dex */
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {

    /* renamed from: e */
    public long f67377e;

    /* renamed from: f */
    public Object f67378f;

    /* renamed from: g */
    public /* synthetic */ Object f67379g;

    /* renamed from: h */
    public int f67380h;

    public TickerChannelsKt$fixedDelayTicker$1(Continuation<? super TickerChannelsKt$fixedDelayTicker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67379g = obj;
        this.f67380h |= Integer.MIN_VALUE;
        return TickerChannelsKt.m34193a(0L, 0L, null, this);
    }
}
