package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m31884d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$1 */
    public static final class C68141 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67851e;

        /* renamed from: f */
        public int f67852f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67851e = obj;
            this.f67852f |= Integer.MIN_VALUE;
            throw null;
        }
    }

    /* compiled from: Emitters.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31884d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 */
    public static final class C68152<T> implements FlowCollector, SuspendFunction {

        /* compiled from: Emitters.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
        @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", m32126f = "Transform.kt", m32127l = {224}, m32128m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: e */
            public /* synthetic */ Object f67853e;

            /* renamed from: f */
            public int f67854f;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /* renamed from: m */
            public final Object mo2379m(@NotNull Object obj) {
                this.f67853e = obj;
                this.f67854f |= Integer.MIN_VALUE;
                C68152.this.mo4139f(null, this);
                return Unit.f63088a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4139f(java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.C68152.AnonymousClass1
                if (r4 == 0) goto L13
                r4 = r5
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r4 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.C68152.AnonymousClass1) r4
                int r0 = r4.f67854f
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.f67854f = r0
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r4.<init>(r5)
            L18:
                java.lang.Object r5 = r4.f67853e
                int r4 = r4.f67854f
                if (r4 == 0) goto L2f
                r0 = 1
                if (r4 != r0) goto L27
                kotlin.ResultKt.m31892b(r5)
                kotlin.Unit r4 = kotlin.Unit.f63088a
                return r4
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                kotlin.ResultKt.m31892b(r5)
                kotlin.jvm.internal.Intrinsics.m32185n()
                r4 = 0
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.C68152.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
        Intrinsics.m32184m();
        throw null;
    }
}
