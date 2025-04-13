package kotlinx.coroutines.flow.internal;

import com.yandex.mobile.ads.C4632R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Combine.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m31884d2 = {"R", "T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m32126f = "Combine.kt", m32127l = {57, C4632R.styleable.AppCompatTheme_listPreferredItemHeight, C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f68145f;

    /* renamed from: g */
    public Object f68146g;

    /* renamed from: h */
    public int f68147h;

    /* renamed from: i */
    public int f68148i;

    /* renamed from: j */
    public int f68149j;

    /* renamed from: k */
    public /* synthetic */ Object f68150k;

    /* renamed from: l */
    public final /* synthetic */ Flow<T>[] f68151l;

    /* renamed from: m */
    public final /* synthetic */ Function0<T[]> f68152m;

    /* renamed from: n */
    public final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> f68153n;

    /* renamed from: o */
    public final /* synthetic */ FlowCollector<R> f68154o;

    /* compiled from: Combine.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m31884d2 = {"R", "T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m32126f = "Combine.kt", m32127l = {34}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    public static final class C68441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f68155f;

        /* renamed from: g */
        public final /* synthetic */ Flow<T>[] f68156g;

        /* renamed from: h */
        public final /* synthetic */ int f68157h;

        /* renamed from: i */
        public final /* synthetic */ AtomicInteger f68158i;

        /* renamed from: j */
        public final /* synthetic */ Channel<IndexedValue<Object>> f68159j;

        /* compiled from: Combine.kt */
        @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector, SuspendFunction {

            /* renamed from: b */
            public final /* synthetic */ Channel<IndexedValue<Object>> f68160b;

            /* renamed from: c */
            public final /* synthetic */ int f68161c;

            public AnonymousClass1(Channel<IndexedValue<Object>> channel, int i2) {
                this.f68160b = channel;
                this.f68161c = i2;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e2 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @org.jetbrains.annotations.Nullable
            /* renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4139f(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    Method dump skipped, instructions count: 230
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.C68441.AnonymousClass1.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C68441(Flow<? extends T>[] flowArr, int i2, AtomicInteger atomicInteger, Channel<IndexedValue<Object>> channel, Continuation<? super C68441> continuation) {
            super(2, continuation);
            this.f68156g = flowArr;
            this.f68157h = i2;
            this.f68158i = atomicInteger;
            this.f68159j = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        /* renamed from: a */
        public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C68441(this.f68156g, this.f68157h, this.f68158i, this.f68159j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new C68441(this.f68156g, this.f68157h, this.f68158i, this.f68159j, continuation).mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f68155f;
            try {
                if (i2 == 0) {
                    ResultKt.m31892b(obj);
                    Flow[] flowArr = this.f68156g;
                    int i3 = this.f68157h;
                    Flow flow = flowArr[i3];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f68159j, i3);
                    this.f68155f = 1;
                    if (flow.mo4140a(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m31892b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.f68159j.mo34163y(null);
                }
                return Unit.f63088a;
            } finally {
                if (this.f68158i.decrementAndGet() == 0) {
                    this.f68159j.mo34163y(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(Flow<? extends T>[] flowArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<? super R> flowCollector, Continuation<? super CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.f68151l = flowArr;
        this.f68152m = function0;
        this.f68153n = function3;
        this.f68154o = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f68151l, this.f68152m, this.f68153n, this.f68154o, continuation);
        combineKt$combineInternal$2.f68150k = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f68151l, this.f68152m, this.f68153n, this.f68154o, continuation);
        combineKt$combineInternal$2.f68150k = coroutineScope;
        return combineKt$combineInternal$2.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5 A[LOOP:0: B:18:0x00e5->B:39:?, LOOP_START, PHI: r5 r9
      0x00e5: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:15:0x00e0, B:39:?] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r9v5 kotlin.collections.IndexedValue) = (r9v4 kotlin.collections.IndexedValue), (r9v21 kotlin.collections.IndexedValue) binds: [B:15:0x00e0, B:39:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x012b -> B:9:0x00bd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.mo2379m(java.lang.Object):java.lang.Object");
    }
}
