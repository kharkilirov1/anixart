package kotlinx.coroutines.channels;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {C4632R.styleable.AppCompatTheme_selectableItemBackground, 100}, m32128m = "last")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67252e;

    /* renamed from: f */
    public Object f67253f;

    /* renamed from: g */
    public Object f67254g;

    /* renamed from: h */
    public /* synthetic */ Object f67255h;

    /* renamed from: i */
    public int f67256i;

    public ChannelsKt__DeprecatedKt$last$1(Continuation<? super ChannelsKt__DeprecatedKt$last$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:11:0x0030, B:12:0x0067, B:14:0x006f, B:35:0x0047, B:37:0x0052, B:39:0x007c, B:40:0x0083), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
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
            r7.f67255h = r8
            int r8 = r7.f67256i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f67256i = r8
            r1 = r8 & r0
            if (r1 == 0) goto L12
            int r8 = r8 - r0
            r7.f67256i = r8
            r8 = r7
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r8 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r8.<init>(r7)
        L17:
            java.lang.Object r0 = r8.f67255h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.f67256i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L84
            r5 = 2
            if (r2 == r3) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r2 = r8.f67254g
            java.lang.Object r3 = r8.f67253f
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r6 = r8.f67252e
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L34
            goto L67
        L34:
            r8 = move-exception
            goto L8a
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3e:
            java.lang.Object r2 = r8.f67253f
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r3 = r8.f67252e
            r6 = r3
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L34
            r3 = r2
            r2 = r0
        L58:
            r8.f67252e = r6     // Catch: java.lang.Throwable -> L79
            r8.f67253f = r3     // Catch: java.lang.Throwable -> L79
            r8.f67254g = r2     // Catch: java.lang.Throwable -> L79
            r8.f67256i = r5     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r3.mo34140a(r8)     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L67
            goto L78
        L67:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L74
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L34
            goto L58
        L74:
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r4)
            r1 = r2
        L78:
            return r1
        L79:
            r8 = move-exception
            r4 = r6
            goto L89
        L7c:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "ReceiveChannel is empty."
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L34
            throw r8     // Catch: java.lang.Throwable -> L34
        L84:
            kotlin.ResultKt.m31892b(r0)
            throw r4     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
        L89:
            r6 = r4
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r6, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
