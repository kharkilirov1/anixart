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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.TickerChannelsKt", m32126f = "TickerChannels.kt", m32127l = {C4632R.styleable.AppCompatTheme_listPreferredItemPaddingRight, C4632R.styleable.AppCompatTheme_panelMenuListWidth, C4632R.styleable.AppCompatTheme_ratingBarStyleSmall, C4632R.styleable.AppCompatTheme_seekBarStyle}, m32128m = "fixedPeriodTicker")
/* loaded from: classes3.dex */
final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {

    /* renamed from: e */
    public long f67381e;

    /* renamed from: f */
    public long f67382f;

    /* renamed from: g */
    public Object f67383g;

    /* renamed from: h */
    public /* synthetic */ Object f67384h;

    /* renamed from: i */
    public int f67385i;

    public TickerChannelsKt$fixedPeriodTicker$1(Continuation<? super TickerChannelsKt$fixedPeriodTicker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67384h = obj;
        this.f67385i |= Integer.MIN_VALUE;
        return TickerChannelsKt.m34194b(0L, 0L, null, this);
    }
}
