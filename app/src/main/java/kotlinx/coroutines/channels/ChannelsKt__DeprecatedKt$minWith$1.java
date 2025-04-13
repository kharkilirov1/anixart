package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {434, 436}, m32128m = "minWith")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$minWith$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67290e;

    /* renamed from: f */
    public Object f67291f;

    /* renamed from: g */
    public Object f67292g;

    /* renamed from: h */
    public Object f67293h;

    /* renamed from: i */
    public /* synthetic */ Object f67294i;

    /* renamed from: j */
    public int f67295j;

    public ChannelsKt__DeprecatedKt$minWith$1(Continuation<? super ChannelsKt__DeprecatedKt$minWith$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (r7.compare(r2, r0) > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:13:0x0078, B:15:0x0080, B:17:0x0066), top: B:12:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:12:0x0078). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            r9.f67294i = r10
            int r10 = r9.f67295j
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.f67295j = r10
            r1 = r10 & r0
            if (r1 == 0) goto L12
            int r10 = r10 - r0
            r9.f67295j = r10
            r10 = r9
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r10 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r10.<init>(r9)
        L17:
            java.lang.Object r0 = r10.f67294i
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r10.f67295j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L96
            r5 = 2
            if (r2 == r3) goto L43
            if (r2 != r5) goto L3b
            java.lang.Object r2 = r10.f67293h
            java.lang.Object r3 = r10.f67292g
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r6 = r10.f67291f
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r10.f67290e
            java.util.Comparator r7 = (java.util.Comparator) r7
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L38
            goto L78
        L38:
            r10 = move-exception
            goto L9c
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L43:
            java.lang.Object r2 = r10.f67292g
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r3 = r10.f67291f
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            java.lang.Object r6 = r10.f67290e
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L93
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L5e
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r3, r4)
            goto L8f
        L5e:
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L93
            r7 = r6
            r6 = r3
            r3 = r2
        L65:
            r2 = r0
        L66:
            r10.f67290e = r7     // Catch: java.lang.Throwable -> L90
            r10.f67291f = r6     // Catch: java.lang.Throwable -> L90
            r10.f67292g = r3     // Catch: java.lang.Throwable -> L90
            r10.f67293h = r2     // Catch: java.lang.Throwable -> L90
            r10.f67295j = r5     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r3.mo34140a(r10)     // Catch: java.lang.Throwable -> L90
            if (r0 != r1) goto L78
            r4 = r1
            goto L8f
        L78:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L90
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L90
            int r8 = r7.compare(r2, r0)     // Catch: java.lang.Throwable -> L90
            if (r8 <= 0) goto L66
            goto L65
        L8b:
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r4)
            r4 = r2
        L8f:
            return r4
        L90:
            r10 = move-exception
            r4 = r6
            goto L9b
        L93:
            r10 = move-exception
            r6 = r3
            goto L9c
        L96:
            kotlin.ResultKt.m31892b(r0)
            throw r4     // Catch: java.lang.Throwable -> L9a
        L9a:
            r10 = move-exception
        L9b:
            r6 = r4
        L9c:
            throw r10     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
