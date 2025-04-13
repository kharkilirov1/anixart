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
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$1 */
    public static final class C68161 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67856e;

        /* renamed from: f */
        public int f67857f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67856e = obj;
            this.f67857f |= Integer.MIN_VALUE;
            throw null;
        }
    }

    /* compiled from: Emitters.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2 */
    public static final class C68172<T> implements FlowCollector, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ FlowCollector f67858b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f67859c;

        /* compiled from: Emitters.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
        @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", m32126f = "Transform.kt", m32127l = {223, 223}, m32128m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: e */
            public /* synthetic */ Object f67860e;

            /* renamed from: f */
            public int f67861f;

            /* renamed from: h */
            public Object f67863h;

            /* renamed from: i */
            public Object f67864i;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /* renamed from: m */
            public final Object mo2379m(@NotNull Object obj) {
                this.f67860e = obj;
                this.f67861f |= Integer.MIN_VALUE;
                return C68172.this.mo4139f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4139f(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.C68172.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.C68172.AnonymousClass1) r0
                int r1 = r0.f67861f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67861f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f67860e
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f67861f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.m31892b(r8)
                goto L6a
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                java.lang.Object r7 = r0.f67864i
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                java.lang.Object r2 = r0.f67863h
                kotlin.ResultKt.m31892b(r8)
                goto L54
            L3c:
                kotlin.ResultKt.m31892b(r8)
                kotlinx.coroutines.flow.FlowCollector r8 = r6.f67858b
                kotlin.jvm.functions.Function2 r2 = r6.f67859c
                r0.f67863h = r7
                r0.f67864i = r8
                r0.f67861f = r4
                java.lang.Object r2 = r2.invoke(r7, r0)
                if (r2 != r1) goto L50
                return r1
            L50:
                r5 = r2
                r2 = r7
                r7 = r8
                r8 = r5
            L54:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L6a
                r8 = 0
                r0.f67863h = r8
                r0.f67864i = r8
                r0.f67861f = r3
                java.lang.Object r7 = r7.mo4139f(r2, r0)
                if (r7 != r1) goto L6a
                return r1
            L6a:
                kotlin.Unit r7 = kotlin.Unit.f63088a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.C68172.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
        throw null;
    }
}
