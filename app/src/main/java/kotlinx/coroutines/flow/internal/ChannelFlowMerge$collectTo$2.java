package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class ChannelFlowMerge$collectTo$2<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ Job f68105b;

    /* renamed from: c */
    public final /* synthetic */ Semaphore f68106c;

    /* renamed from: d */
    public final /* synthetic */ ProducerScope<T> f68107d;

    /* renamed from: e */
    public final /* synthetic */ SendingCollector<T> f68108e;

    /* compiled from: Merge.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m32126f = "Merge.kt", m32127l = {69}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 */
    public static final class C68421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f68109f;

        /* renamed from: g */
        public final /* synthetic */ Flow<T> f68110g;

        /* renamed from: h */
        public final /* synthetic */ SendingCollector<T> f68111h;

        /* renamed from: i */
        public final /* synthetic */ Semaphore f68112i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C68421(Flow<? extends T> flow, SendingCollector<T> sendingCollector, Semaphore semaphore, Continuation<? super C68421> continuation) {
            super(2, continuation);
            this.f68110g = flow;
            this.f68111h = sendingCollector;
            this.f68112i = semaphore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        /* renamed from: a */
        public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C68421(this.f68110g, this.f68111h, this.f68112i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new C68421(this.f68110g, this.f68111h, this.f68112i, continuation).mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f68109f;
            try {
                if (i2 == 0) {
                    ResultKt.m31892b(obj);
                    Flow<T> flow = this.f68110g;
                    SendingCollector<T> sendingCollector = this.f68111h;
                    this.f68109f = 1;
                    if (flow.mo4140a(sendingCollector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m31892b(obj);
                }
                this.f68112i.release();
                return Unit.f63088a;
            } catch (Throwable th) {
                this.f68112i.release();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2(Job job, Semaphore semaphore, ProducerScope<? super T> producerScope, SendingCollector<T> sendingCollector) {
        this.f68105b = job;
        this.f68106c = semaphore;
        this.f68107d = producerScope;
        this.f68108e = sendingCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4139f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
            int r1 = r0.f68117i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68117i = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f68115g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f68117i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f68114f
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            java.lang.Object r0 = r0.f68113e
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2) r0
            kotlin.ResultKt.m31892b(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.m31892b(r9)
            kotlinx.coroutines.Job r9 = r7.f68105b
            if (r9 != 0) goto L3f
            goto L45
        L3f:
            boolean r2 = r9.mo33950a()
            if (r2 == 0) goto L6b
        L45:
            kotlinx.coroutines.sync.Semaphore r9 = r7.f68106c
            r0.f68113e = r7
            r0.f68114f = r8
            r0.f68117i = r3
            java.lang.Object r9 = r9.mo34402a(r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r0 = r7
        L55:
            kotlinx.coroutines.channels.ProducerScope<T> r1 = r0.f68107d
            r2 = 0
            r3 = 0
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
            kotlinx.coroutines.flow.internal.SendingCollector<T> r9 = r0.f68108e
            kotlinx.coroutines.sync.Semaphore r0 = r0.f68106c
            r5 = 0
            r4.<init>(r8, r9, r0, r5)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.BuildersKt.m33962a(r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        L6b:
            java.util.concurrent.CancellationException r8 = r9.mo34064o()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.mo4139f(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
