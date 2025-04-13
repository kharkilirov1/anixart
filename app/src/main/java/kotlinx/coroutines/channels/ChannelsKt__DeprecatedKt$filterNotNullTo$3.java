package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487, 242}, m32128m = "filterNotNullTo")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends SendChannel<? super E>> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67228e;

    /* renamed from: f */
    public Object f67229f;

    /* renamed from: g */
    public Object f67230g;

    /* renamed from: h */
    public /* synthetic */ Object f67231h;

    /* renamed from: i */
    public int f67232i;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(Continuation<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> continuation) {
        super(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:13:0x006a, B:15:0x004d, B:17:0x0055, B:19:0x005b), top: B:12:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:12:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0067 -> B:12:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            r8.f67231h = r9
            int r9 = r8.f67232i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.f67232i = r9
            r1 = r9 & r0
            if (r1 == 0) goto L12
            int r9 = r9 - r0
            r8.f67232i = r9
            r9 = r8
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r9 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r9.<init>(r8)
        L17:
            java.lang.Object r0 = r9.f67231h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.f67232i
            r3 = 0
            if (r2 == 0) goto L83
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r2 = r9.f67230g
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r9.f67229f
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r9.f67228e
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L81
            goto L6a
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3e:
            java.lang.Object r2 = r9.f67230g
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r9.f67229f
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r9.f67228e
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L81
        L4d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L6a
            r9.f67228e = r7     // Catch: java.lang.Throwable -> L79
            r9.f67229f = r6     // Catch: java.lang.Throwable -> L79
            r9.f67230g = r2     // Catch: java.lang.Throwable -> L79
            r9.f67232i = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r7.mo34151E(r0, r9)     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L6a
            goto L80
        L6a:
            r9.f67228e = r7     // Catch: java.lang.Throwable -> L79
            r9.f67229f = r6     // Catch: java.lang.Throwable -> L79
            r9.f67230g = r2     // Catch: java.lang.Throwable -> L79
            r9.f67232i = r5     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r2.mo34140a(r9)     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L4d
            goto L80
        L79:
            r9 = move-exception
            r3 = r6
            goto L88
        L7c:
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r3)
            r1 = r7
        L80:
            return r1
        L81:
            r9 = move-exception
            goto L89
        L83:
            kotlin.ResultKt.m31892b(r0)
            throw r3     // Catch: java.lang.Throwable -> L87
        L87:
            r9 = move-exception
        L88:
            r6 = r3
        L89:
            throw r9     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3.mo2379m(java.lang.Object):java.lang.Object");
    }
}
