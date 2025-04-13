package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", m32126f = "Delay.kt", m32127l = {314, 316, 317}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__DelayKt$fixedPeriodTicker$3 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67565f;

    /* renamed from: g */
    public /* synthetic */ Object f67566g;

    /* renamed from: h */
    public final /* synthetic */ long f67567h;

    /* renamed from: i */
    public final /* synthetic */ long f67568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$3(long j2, long j3, Continuation<? super FlowKt__DelayKt$fixedPeriodTicker$3> continuation) {
        super(2, continuation);
        this.f67567h = j2;
        this.f67568i = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.f67567h, this.f67568i, continuation);
        flowKt__DelayKt$fixedPeriodTicker$3.f67566g = obj;
        return flowKt__DelayKt$fixedPeriodTicker$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<? super Unit> producerScope, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.f67567h, this.f67568i, continuation);
        flowKt__DelayKt$fixedPeriodTicker$3.f67566g = producerScope;
        return flowKt__DelayKt$fixedPeriodTicker$3.mo2379m(Unit.f63088a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:12:0x003e). Please report as a decompilation issue!!! */
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f67565f
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto Lf
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
        Lf:
            java.lang.Object r1 = r7.f67566g
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.m31892b(r8)
            goto L3d
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.f67566g
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.m31892b(r8)
            r8 = r7
            goto L4f
        L28:
            kotlin.ResultKt.m31892b(r8)
            java.lang.Object r8 = r7.f67566g
            r1 = r8
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            long r5 = r7.f67567h
            r7.f67566g = r1
            r7.f67565f = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m34032a(r5, r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            r8 = r7
        L3e:
            kotlinx.coroutines.channels.SendChannel r4 = r1.mo34175v()
            kotlin.Unit r5 = kotlin.Unit.f63088a
            r8.f67566g = r1
            r8.f67565f = r3
            java.lang.Object r4 = r4.mo34151E(r5, r8)
            if (r4 != r0) goto L4f
            return r0
        L4f:
            long r4 = r8.f67568i
            r8.f67566g = r1
            r8.f67565f = r2
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.m34032a(r4, r8)
            if (r4 != r0) goto L3e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3.mo2379m(java.lang.Object):java.lang.Object");
    }
}
