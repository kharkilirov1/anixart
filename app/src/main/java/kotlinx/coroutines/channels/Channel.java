package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Channel.kt */
@Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/Channel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Factory", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {

    /* renamed from: K1 */
    @NotNull
    public static final Factory f67133K1 = Factory.f67134a;

    /* compiled from: Channel.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* compiled from: Channel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/channels/Channel$Factory;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Factory {

        /* renamed from: a */
        public static final /* synthetic */ Factory f67134a = new Factory();

        /* renamed from: b */
        public static final int f67135b = SystemPropsKt.m34330b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);
    }
}
