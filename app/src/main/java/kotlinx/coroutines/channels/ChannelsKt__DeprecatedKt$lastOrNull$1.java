package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {123, 126}, m32128m = "lastOrNull")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$lastOrNull$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67264e;

    /* renamed from: f */
    public Object f67265f;

    /* renamed from: g */
    public Object f67266g;

    /* renamed from: h */
    public /* synthetic */ Object f67267h;

    /* renamed from: i */
    public int f67268i;

    public ChannelsKt__DeprecatedKt$lastOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$lastOrNull$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:11:0x0030, B:12:0x006c, B:14:0x0074, B:37:0x0047, B:41:0x0056), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0068 -> B:12:0x006c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            r7.f67267h = r8
            int r8 = r7.f67268i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f67268i = r8
            r1 = r8 & r0
            if (r1 == 0) goto L12
            int r8 = r8 - r0
            r7.f67268i = r8
            r8 = r7
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r8 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r8.<init>(r7)
        L17:
            java.lang.Object r0 = r8.f67267h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.f67268i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L81
            r5 = 2
            if (r2 == r3) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r2 = r8.f67266g
            java.lang.Object r3 = r8.f67265f
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r6 = r8.f67264e
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L34
            goto L6c
        L34:
            r8 = move-exception
            goto L87
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3e:
            java.lang.Object r2 = r8.f67265f
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r3 = r8.f67264e
            r6 = r3
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L56
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r4)
            goto L7d
        L56:
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L34
            r3 = r2
            r2 = r0
        L5c:
            r8.f67264e = r6     // Catch: java.lang.Throwable -> L7e
            r8.f67265f = r3     // Catch: java.lang.Throwable -> L7e
            r8.f67266g = r2     // Catch: java.lang.Throwable -> L7e
            r8.f67268i = r5     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r3.mo34140a(r8)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L6c
            r4 = r1
            goto L7d
        L6c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L79
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L34
            goto L5c
        L79:
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r4)
            r4 = r2
        L7d:
            return r4
        L7e:
            r8 = move-exception
            r4 = r6
            goto L86
        L81:
            kotlin.ResultKt.m31892b(r0)
            throw r4     // Catch: java.lang.Throwable -> L85
        L85:
            r8 = move-exception
        L86:
            r6 = r4
        L87:
            throw r8     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
