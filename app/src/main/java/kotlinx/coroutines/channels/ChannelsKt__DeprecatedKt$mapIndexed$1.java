package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m32126f = "Deprecated.kt", m32127l = {344, 345, 345}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67277f;

    /* renamed from: g */
    public Object f67278g;

    /* renamed from: h */
    public int f67279h;

    /* renamed from: i */
    public int f67280i;

    /* renamed from: j */
    public /* synthetic */ Object f67281j;

    /* renamed from: k */
    public final /* synthetic */ ReceiveChannel<Object> f67282k;

    /* renamed from: l */
    public final /* synthetic */ Function3<Integer, Object, Continuation<Object>, Object> f67283l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<Object> receiveChannel, Function3<? super Integer, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super ChannelsKt__DeprecatedKt$mapIndexed$1> continuation) {
        super(2, continuation);
        this.f67282k = receiveChannel;
        this.f67283l = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.f67282k, this.f67283l, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.f67281j = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.f67282k, this.f67283l, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.f67281j = producerScope;
        return channelsKt__DeprecatedKt$mapIndexed$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a7 -> B:8:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.f67280i
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L48
            if (r1 == r4) goto L39
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            int r1 = r12.f67279h
            java.lang.Object r5 = r12.f67277f
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r12.f67281j
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.m31892b(r13)
            r13 = r6
            goto L56
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            int r1 = r12.f67279h
            java.lang.Object r5 = r12.f67278g
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            java.lang.Object r6 = r12.f67277f
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.f67281j
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.m31892b(r13)
            r8 = r12
            goto L95
        L39:
            int r1 = r12.f67279h
            java.lang.Object r5 = r12.f67277f
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r12.f67281j
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.m31892b(r13)
            r7 = r12
            goto L6a
        L48:
            kotlin.ResultKt.m31892b(r13)
            java.lang.Object r13 = r12.f67281j
            kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r5 = r12.f67282k
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
        L56:
            r6 = r12
        L57:
            r6.f67281j = r13
            r6.f67277f = r5
            r6.f67279h = r1
            r6.f67280i = r4
            java.lang.Object r7 = r5.mo34140a(r6)
            if (r7 != r0) goto L66
            return r0
        L66:
            r11 = r6
            r6 = r13
            r13 = r7
            r7 = r11
        L6a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lab
            java.lang.Object r13 = r5.next()
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r8 = r7.f67283l
            int r9 = r1 + 1
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            r7.f67281j = r6
            r7.f67277f = r5
            r7.f67278g = r6
            r7.f67279h = r9
            r7.f67280i = r3
            java.lang.Object r13 = r8.mo16505k(r10, r13, r7)
            if (r13 != r0) goto L90
            return r0
        L90:
            r8 = r7
            r1 = r9
            r7 = r6
            r6 = r5
            r5 = r7
        L95:
            r8.f67281j = r7
            r8.f67277f = r6
            r9 = 0
            r8.f67278g = r9
            r8.f67279h = r1
            r8.f67280i = r2
            java.lang.Object r13 = r5.mo34151E(r13, r8)
            if (r13 != r0) goto La7
            return r0
        La7:
            r5 = r6
            r13 = r7
            r6 = r8
            goto L57
        Lab:
            kotlin.Unit r13 = kotlin.Unit.f63088a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
