package kotlinx.coroutines.channels;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {C4632R.styleable.AppCompatTheme_alertDialogTheme}, m32128m = "elementAt")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public int f67194e;

    /* renamed from: f */
    public int f67195f;

    /* renamed from: g */
    public Object f67196g;

    /* renamed from: h */
    public Object f67197h;

    /* renamed from: i */
    public /* synthetic */ Object f67198i;

    /* renamed from: j */
    public int f67199j;

    public ChannelsKt__DeprecatedKt$elementAt$1(Continuation<? super ChannelsKt__DeprecatedKt$elementAt$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$elementAt$1<E> channelsKt__DeprecatedKt$elementAt$1;
        ReceiveChannel receiveChannel;
        this.f67198i = obj;
        int i2 = this.f67199j | Integer.MIN_VALUE;
        this.f67199j = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67199j = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$elementAt$1 = this;
        } else {
            channelsKt__DeprecatedKt$elementAt$1 = new ChannelsKt__DeprecatedKt$elementAt$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$elementAt$1.f67198i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$elementAt$1.f67199j;
        ReceiveChannel receiveChannel2 = null;
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
            int i4 = channelsKt__DeprecatedKt$elementAt$1.f67195f;
            int i5 = channelsKt__DeprecatedKt$elementAt$1.f67194e;
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAt$1.f67197h;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$elementAt$1.f67196g;
            try {
                ResultKt.m31892b(obj2);
                while (((Boolean) obj2).booleanValue()) {
                    Object next = channelIterator.next();
                    int i6 = i4 + 1;
                    if (i5 == i4) {
                        ChannelsKt.m34179a(receiveChannel, null);
                        return next;
                    }
                    try {
                        channelsKt__DeprecatedKt$elementAt$1.f67196g = receiveChannel;
                        channelsKt__DeprecatedKt$elementAt$1.f67197h = channelIterator;
                        channelsKt__DeprecatedKt$elementAt$1.f67194e = i5;
                        channelsKt__DeprecatedKt$elementAt$1.f67195f = i6;
                        channelsKt__DeprecatedKt$elementAt$1.f67199j = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$elementAt$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i4 = i6;
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel2 = receiveChannel;
                    }
                }
                throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i5 + '.');
            } catch (Throwable th3) {
                th = th3;
            }
        }
        receiveChannel = receiveChannel2;
        try {
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.m34179a(receiveChannel, th);
            throw th4;
        }
    }
}
