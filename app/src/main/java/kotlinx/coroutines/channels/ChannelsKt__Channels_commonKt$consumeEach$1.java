package kotlinx.coroutines.channels;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channels.common.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m32126f = "Channels.common.kt", m32127l = {C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m32128m = "consumeEach")
/* loaded from: classes3.dex */
final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67150e;

    /* renamed from: f */
    public Object f67151f;

    /* renamed from: g */
    public Object f67152g;

    /* renamed from: h */
    public /* synthetic */ Object f67153h;

    /* renamed from: i */
    public int f67154i;

    public ChannelsKt__Channels_commonKt$consumeEach$1(Continuation<? super ChannelsKt__Channels_commonKt$consumeEach$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1 = kotlin.Unit.f63088a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        kotlinx.coroutines.channels.ChannelsKt.m34179a(r5, null);
     */
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
            r7.f67153h = r8
            int r8 = r7.f67154i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f67154i = r8
            r1 = r8 & r0
            if (r1 == 0) goto L12
            int r8 = r8 - r0
            r7.f67154i = r8
            r8 = r7
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r8 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r8.<init>(r7)
        L17:
            java.lang.Object r0 = r8.f67153h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.f67154i
            r3 = 0
            if (r2 == 0) goto L61
            r4 = 1
            if (r2 != r4) goto L59
            java.lang.Object r2 = r8.f67152g
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r8.f67151f
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r8.f67150e
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L56
        L32:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L50
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L56
            r6.invoke(r0)     // Catch: java.lang.Throwable -> L56
            r8.f67150e = r6     // Catch: java.lang.Throwable -> L56
            r8.f67151f = r5     // Catch: java.lang.Throwable -> L56
            r8.f67152g = r2     // Catch: java.lang.Throwable -> L56
            r8.f67154i = r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r2.mo34140a(r8)     // Catch: java.lang.Throwable -> L56
            if (r0 != r1) goto L32
            goto L55
        L50:
            kotlin.Unit r1 = kotlin.Unit.f63088a     // Catch: java.lang.Throwable -> L56
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r5, r3)
        L55:
            return r1
        L56:
            r8 = move-exception
            r3 = r5
            goto L66
        L59:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L61:
            kotlin.ResultKt.m31892b(r0)
            throw r3     // Catch: java.lang.Throwable -> L65
        L65:
            r8 = move-exception
        L66:
            throw r8     // Catch: java.lang.Throwable -> L67
        L67:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.m34179a(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
