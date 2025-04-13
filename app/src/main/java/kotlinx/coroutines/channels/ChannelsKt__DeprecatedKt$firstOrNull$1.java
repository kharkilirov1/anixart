package kotlinx.coroutines.channels;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {C4632R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m32128m = "firstOrNull")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$firstOrNull$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67237e;

    /* renamed from: f */
    public Object f67238f;

    /* renamed from: g */
    public /* synthetic */ Object f67239g;

    /* renamed from: h */
    public int f67240h;

    public ChannelsKt__DeprecatedKt$firstOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$firstOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$firstOrNull$1<E> channelsKt__DeprecatedKt$firstOrNull$1;
        this.f67239g = obj;
        int i2 = this.f67240h | Integer.MIN_VALUE;
        this.f67240h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67240h = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$firstOrNull$1 = this;
        } else {
            channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$firstOrNull$1.f67239g;
        int i3 = channelsKt__DeprecatedKt$firstOrNull$1.f67240h;
        ReceiveChannel receiveChannel = null;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.f67238f;
            ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.f67237e;
            try {
                ResultKt.m31892b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    ChannelsKt.m34179a(receiveChannel2, null);
                    return null;
                }
                Object next = channelIterator.next();
                ChannelsKt.m34179a(receiveChannel2, null);
                return next;
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannel2;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            ChannelsKt.m34179a(receiveChannel, th);
            throw th3;
        }
    }
}
