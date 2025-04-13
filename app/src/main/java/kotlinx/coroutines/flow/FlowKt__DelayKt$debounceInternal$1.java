package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m32126f = "Delay.kt", m32127l = {222, 355}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67543f;

    /* renamed from: g */
    public Object f67544g;

    /* renamed from: h */
    public int f67545h;

    /* renamed from: i */
    public /* synthetic */ Object f67546i;

    /* renamed from: j */
    public /* synthetic */ Object f67547j;

    /* renamed from: k */
    public final /* synthetic */ Function1<Object, Long> f67548k;

    /* renamed from: l */
    public final /* synthetic */ Flow<Object> f67549l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(Function1<Object, Long> function1, Flow<Object> flow, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.f67548k = function1;
        this.f67549l = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(CoroutineScope coroutineScope, FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f67548k, this.f67549l, continuation);
        flowKt__DelayKt$debounceInternal$1.f67546i = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.f67547j = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:47|26|30|31|32|(1:34)|35|36|(1:38)(3:39|7|(9:9|(5:11|(1:13)|14|(1:16)(1:29)|(2:27|28)(1:(5:19|(1:21)|22|(1:24)|26)))|30|31|32|(0)|35|36|(0)(0))(2:43|44))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        r12.m34390T(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:32:0x00cb, B:34:0x00cf, B:35:0x00d9), top: B:31:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f1 -> B:7:0x0065). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
