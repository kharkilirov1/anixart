package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", m32126f = "Channel.kt", m32127l = {354}, m32128m = "receiveOrNull")
/* loaded from: classes3.dex */
final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67372e;

    /* renamed from: f */
    public int f67373f;

    public ReceiveChannel$receiveOrNull$1(Continuation<? super ReceiveChannel$receiveOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ReceiveChannel$receiveOrNull$1<E> receiveChannel$receiveOrNull$1;
        this.f67372e = obj;
        int i2 = this.f67373f | Integer.MIN_VALUE;
        this.f67373f = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67373f = i2 - Integer.MIN_VALUE;
            receiveChannel$receiveOrNull$1 = this;
        } else {
            receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1<>(this);
        }
        Object obj2 = receiveChannel$receiveOrNull$1.f67372e;
        int i3 = receiveChannel$receiveOrNull$1.f67373f;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            receiveChannel$receiveOrNull$1.f67373f = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m31892b(obj2);
        return ChannelResult.m34178b(((ChannelResult) obj2).f67141a);
    }
}
