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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {447}, m32128m = "none")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$none$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67296e;

    /* renamed from: f */
    public /* synthetic */ Object f67297f;

    /* renamed from: g */
    public int f67298g;

    public ChannelsKt__DeprecatedKt$none$1(Continuation<? super ChannelsKt__DeprecatedKt$none$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$none$1<E> channelsKt__DeprecatedKt$none$1;
        this.f67297f = obj;
        int i2 = this.f67298g | Integer.MIN_VALUE;
        this.f67298g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67298g = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$none$1 = this;
        } else {
            channelsKt__DeprecatedKt$none$1 = new ChannelsKt__DeprecatedKt$none$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$none$1.f67297f;
        int i3 = channelsKt__DeprecatedKt$none$1.f67298g;
        boolean z = true;
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
            ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$none$1.f67296e;
            try {
                ResultKt.m31892b(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                ChannelsKt.m34179a(receiveChannel2, null);
                return valueOf;
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
