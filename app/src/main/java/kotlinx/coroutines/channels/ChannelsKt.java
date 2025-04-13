package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.ExceptionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, m31885k = 4, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class ChannelsKt {
    @PublishedApi
    /* renamed from: a */
    public static final void m34179a(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = ExceptionsKt.m34057a("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.mo34129b(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:12:0x0032, B:18:0x006f, B:20:0x0077, B:40:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:13:0x0035). Please report as a decompilation issue!!! */
    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object m34180b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, @org.jetbrains.annotations.NotNull C r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.f67325i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67325i = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f67324h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67325i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f67323g
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f67322f
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f67321e
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.ResultKt.m31892b(r9)     // Catch: java.lang.Throwable -> L51
        L35:
            r9 = r7
            r7 = r8
            r8 = r2
            goto L5a
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.f67323g
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.f67322f
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.f67321e
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.ResultKt.m31892b(r9)     // Catch: java.lang.Throwable -> L51
            goto L6e
        L51:
            r7 = move-exception
            goto L93
        L53:
            kotlin.ResultKt.m31892b(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L8f
        L5a:
            r0.f67321e = r8     // Catch: java.lang.Throwable -> L8f
            r0.f67322f = r7     // Catch: java.lang.Throwable -> L8f
            r0.f67323g = r9     // Catch: java.lang.Throwable -> L8f
            r0.f67325i = r4     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r2 = r9.mo34140a(r0)     // Catch: java.lang.Throwable -> L8f
            if (r2 != r1) goto L69
            goto L8e
        L69:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r6
        L6e:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L51
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L51
            r0.f67321e = r2     // Catch: java.lang.Throwable -> L51
            r0.f67322f = r8     // Catch: java.lang.Throwable -> L51
            r0.f67323g = r7     // Catch: java.lang.Throwable -> L51
            r0.f67325i = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r9 = r2.mo34151E(r9, r0)     // Catch: java.lang.Throwable -> L51
            if (r9 != r1) goto L35
            goto L8e
        L8a:
            m34179a(r8, r5)
            r1 = r2
        L8e:
            return r1
        L8f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L93:
            throw r7     // Catch: java.lang.Throwable -> L94
        L94:
            r9 = move-exception
            m34179a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt.m34180b(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
