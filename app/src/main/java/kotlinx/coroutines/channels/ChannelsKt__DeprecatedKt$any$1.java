package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {404}, m32128m = "any")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$any$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67166e;

    /* renamed from: f */
    public /* synthetic */ Object f67167f;

    /* renamed from: g */
    public int f67168g;

    public ChannelsKt__DeprecatedKt$any$1(Continuation<? super ChannelsKt__DeprecatedKt$any$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$any$1<E> channelsKt__DeprecatedKt$any$1;
        this.f67167f = obj;
        int i2 = this.f67168g | Integer.MIN_VALUE;
        this.f67168g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67168g = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$any$1 = this;
        } else {
            channelsKt__DeprecatedKt$any$1 = new ChannelsKt__DeprecatedKt$any$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$any$1.f67167f;
        int i3 = channelsKt__DeprecatedKt$any$1.f67168g;
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
            ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$any$1.f67166e;
            try {
                ResultKt.m31892b(obj2);
                ChannelsKt.m34179a(receiveChannel2, null);
                return obj2;
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
