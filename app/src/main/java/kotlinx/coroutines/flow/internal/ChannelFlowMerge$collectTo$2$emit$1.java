package kotlinx.coroutines.flow.internal;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m32126f = "Merge.kt", m32127l = {C4632R.styleable.AppCompatTheme_dropDownListViewStyle}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f68113e;

    /* renamed from: f */
    public Object f68114f;

    /* renamed from: g */
    public /* synthetic */ Object f68115g;

    /* renamed from: h */
    public final /* synthetic */ ChannelFlowMerge$collectTo$2<T> f68116h;

    /* renamed from: i */
    public int f68117i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(ChannelFlowMerge$collectTo$2<? super T> channelFlowMerge$collectTo$2, Continuation<? super ChannelFlowMerge$collectTo$2$emit$1> continuation) {
        super(continuation);
        this.f68116h = channelFlowMerge$collectTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68115g = obj;
        this.f68117i |= Integer.MIN_VALUE;
        return this.f68116h.mo4139f(null, this);
    }
}
