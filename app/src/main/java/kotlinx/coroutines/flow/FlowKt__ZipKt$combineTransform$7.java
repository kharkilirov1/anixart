package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http.StatusLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Zip.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", m32126f = "Zip.kt", m32127l = {StatusLine.HTTP_PERM_REDIRECT}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__ZipKt$combineTransform$7 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public /* synthetic */ Object f67999f;

    /* renamed from: g */
    public final /* synthetic */ Flow<Object>[] f68000g;

    /* renamed from: h */
    public final /* synthetic */ Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> f68001h;

    /* compiled from: Zip.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1 */
    public static final class C68381 extends Lambda implements Function0<Object[]> {

        /* renamed from: b */
        public final /* synthetic */ Flow<Object>[] f68002b;

        @Override // kotlin.jvm.functions.Function0
        public Object[] invoke() {
            int length = this.f68002b.length;
            Intrinsics.m32185n();
            throw null;
        }
    }

    /* compiled from: Zip.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", m32126f = "Zip.kt", m32127l = {StatusLine.HTTP_PERM_REDIRECT}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 */
    public static final class C68392 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f68003f;

        /* renamed from: g */
        public /* synthetic */ Object f68004g;

        /* renamed from: h */
        public /* synthetic */ Object f68005h;

        /* renamed from: i */
        public final /* synthetic */ Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> f68006i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C68392(Function3<? super FlowCollector<Object>, ? super Object[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C68392> continuation) {
            super(3, continuation);
            this.f68006i = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Object mo16505k(FlowCollector<Object> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
            C68392 c68392 = new C68392(this.f68006i, continuation);
            c68392.f68004g = flowCollector;
            c68392.f68005h = objArr;
            return c68392.mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f68003f;
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                FlowCollector<Object> flowCollector = (FlowCollector) this.f68004g;
                Object[] objArr = (Object[]) this.f68005h;
                Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> function3 = this.f68006i;
                this.f68004g = null;
                this.f68003f = 1;
                if (function3.mo16505k(flowCollector, objArr, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m31892b(obj);
            }
            return Unit.f63088a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$7(Flow<Object>[] flowArr, Function3<? super FlowCollector<Object>, ? super Object[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combineTransform$7> continuation) {
        super(2, continuation);
        this.f68000g = flowArr;
        this.f68001h = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.f68000g, this.f68001h, continuation);
        flowKt__ZipKt$combineTransform$7.f67999f = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.f68000g, this.f68001h, continuation);
        flowKt__ZipKt$combineTransform$7.f67999f = flowCollector;
        Unit unit = Unit.f63088a;
        flowKt__ZipKt$combineTransform$7.mo2379m(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ResultKt.m31892b(obj);
        Intrinsics.m32184m();
        throw null;
    }
}
