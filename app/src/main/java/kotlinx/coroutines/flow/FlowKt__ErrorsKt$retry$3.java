package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: Errors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "cause", "", "attempt", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", m32126f = "Errors.kt", m32127l = {C4632R.styleable.AppCompatTheme_searchViewStyle}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements Function4<FlowCollector<Object>, Throwable, Long, Continuation<? super Boolean>, Object> {

    /* renamed from: f */
    public int f67655f;

    /* renamed from: g */
    public /* synthetic */ Object f67656g;

    /* renamed from: h */
    public /* synthetic */ long f67657h;

    /* renamed from: i */
    public final /* synthetic */ long f67658i;

    /* renamed from: j */
    public final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> f67659j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$retry$3(long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super FlowKt__ErrorsKt$retry$3> continuation) {
        super(4, continuation);
        this.f67658i = j2;
        this.f67659j = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f67655f
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.m31892b(r8)
            goto L2f
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.ResultKt.m31892b(r8)
            java.lang.Object r8 = r7.f67656g
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            long r3 = r7.f67657h
            long r5 = r7.f67658i
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L38
            kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f67659j
            r7.f67655f = r2
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L2f
            return r0
        L2f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L38
            goto L39
        L38:
            r2 = 0
        L39:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3.mo2379m(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function4
    /* renamed from: n */
    public Object mo1110n(FlowCollector<Object> flowCollector, Throwable th, Long l2, Continuation<? super Boolean> continuation) {
        long longValue = l2.longValue();
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.f67658i, this.f67659j, continuation);
        flowKt__ErrorsKt$retry$3.f67656g = th;
        flowKt__ErrorsKt$retry$3.f67657h = longValue;
        return flowKt__ErrorsKt$retry$3.mo2379m(Unit.f63088a);
    }
}
