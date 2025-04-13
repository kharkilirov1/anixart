package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m31884d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements Flow<Object> {

    /* compiled from: Emitters.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
    public static final class C68232<T> implements FlowCollector, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ FlowCollector f67885b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f67886c;

        /* compiled from: Emitters.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
        @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m32126f = "Transform.kt", m32127l = {223, 224}, m32128m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: e */
            public /* synthetic */ Object f67887e;

            /* renamed from: f */
            public int f67888f;

            /* renamed from: h */
            public Object f67890h;

            /* renamed from: i */
            public Object f67891i;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /* renamed from: m */
            public final Object mo2379m(@NotNull Object obj) {
                this.f67887e = obj;
                this.f67888f |= Integer.MIN_VALUE;
                return C68232.this.mo4139f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4139f(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C68232.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C68232.AnonymousClass1) r0
                int r1 = r0.f67888f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67888f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f67887e
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f67888f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.m31892b(r7)
                goto L60
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                java.lang.Object r6 = r0.f67891i
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                java.lang.Object r2 = r0.f67890h
                kotlin.ResultKt.m31892b(r7)
                goto L52
            L3c:
                kotlin.ResultKt.m31892b(r7)
                kotlinx.coroutines.flow.FlowCollector r7 = r5.f67885b
                kotlin.jvm.functions.Function2 r2 = r5.f67886c
                r0.f67890h = r6
                r0.f67891i = r7
                r0.f67888f = r4
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L50
                return r1
            L50:
                r2 = r6
                r6 = r7
            L52:
                r7 = 0
                r0.f67890h = r7
                r0.f67891i = r7
                r0.f67888f = r3
                java.lang.Object r6 = r6.mo4139f(r2, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                kotlin.Unit r6 = kotlin.Unit.f63088a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C68232.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
        throw null;
    }
}
