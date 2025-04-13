package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m31884d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements Flow<Integer> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", m32126f = "Builders.kt", m32127l = {C4632R.styleable.AppCompatTheme_tooltipFrameBackground}, m32128m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 */
    public static final class C67881 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67491e;

        /* renamed from: f */
        public int f67492f;

        /* renamed from: h */
        public Object f67494h;

        /* renamed from: i */
        public Object f67495i;

        /* renamed from: j */
        public int f67496j;

        /* renamed from: k */
        public int f67497k;

        public C67881(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67491e = obj;
            this.f67492f |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.this.mo4140a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r8 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.C67881
            if (r8 == 0) goto L13
            r8 = r9
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 r8 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.C67881) r8
            int r0 = r8.f67492f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.f67492f = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 r8 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1
            r8.<init>(r9)
        L18:
            java.lang.Object r9 = r8.f67491e
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.f67492f
            if (r1 == 0) goto L59
            r2 = 1
            if (r1 != r2) goto L51
            int r1 = r8.f67497k
            int r3 = r8.f67496j
            java.lang.Object r4 = r8.f67495i
            int[] r4 = (int[]) r4
            java.lang.Object r5 = r8.f67494h
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.m31892b(r9)
        L32:
            if (r3 >= r1) goto L4e
            r9 = r4[r3]
            int r3 = r3 + 1
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r8.f67494h = r5
            r8.f67495i = r4
            r8.f67496j = r3
            r8.f67497k = r1
            r8.f67492f = r2
            java.lang.Object r9 = r5.mo4139f(r6, r8)
            if (r9 != r0) goto L32
            return r0
        L4e:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        L51:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L59:
            kotlin.ResultKt.m31892b(r9)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
