package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m32126f = "Share.kt", m32127l = {214, 218, 219, 225}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67824f;

    /* renamed from: g */
    public final /* synthetic */ SharingStarted f67825g;

    /* renamed from: h */
    public final /* synthetic */ Flow<Object> f67826h;

    /* renamed from: i */
    public final /* synthetic */ MutableSharedFlow<Object> f67827i;

    /* renamed from: j */
    public final /* synthetic */ Object f67828j;

    /* compiled from: Share.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m31884d2 = {"T", "", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m32126f = "Share.kt", m32127l = {}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    public static final class C68091 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

        /* renamed from: f */
        public /* synthetic */ int f67829f;

        public C68091(Continuation<? super C68091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        /* renamed from: a */
        public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C68091 c68091 = new C68091(continuation);
            c68091.f67829f = ((Number) obj).intValue();
            return c68091;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            Integer valueOf = Integer.valueOf(num.intValue());
            C68091 c68091 = new C68091(continuation);
            c68091.f67829f = valueOf.intValue();
            ResultKt.m31892b(Unit.f63088a);
            return Boolean.valueOf(c68091.f67829f > 0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            ResultKt.m31892b(obj);
            return Boolean.valueOf(this.f67829f > 0);
        }
    }

    /* compiled from: Share.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m32126f = "Share.kt", m32127l = {227}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    public static final class C68102 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f67830f;

        /* renamed from: g */
        public /* synthetic */ Object f67831g;

        /* renamed from: h */
        public final /* synthetic */ Flow<Object> f67832h;

        /* renamed from: i */
        public final /* synthetic */ MutableSharedFlow<Object> f67833i;

        /* renamed from: j */
        public final /* synthetic */ Object f67834j;

        /* compiled from: Share.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[SharingCommand.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68102(Flow<Object> flow, MutableSharedFlow<Object> mutableSharedFlow, Object obj, Continuation<? super C68102> continuation) {
            super(2, continuation);
            this.f67832h = flow;
            this.f67833i = mutableSharedFlow;
            this.f67834j = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        /* renamed from: a */
        public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C68102 c68102 = new C68102(this.f67832h, this.f67833i, this.f67834j, continuation);
            c68102.f67831g = obj;
            return c68102;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(SharingCommand sharingCommand, Continuation<? super Unit> continuation) {
            C68102 c68102 = new C68102(this.f67832h, this.f67833i, this.f67834j, continuation);
            c68102.f67831g = sharingCommand;
            return c68102.mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f67830f;
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                int ordinal = ((SharingCommand) this.f67831g).ordinal();
                if (ordinal == 0) {
                    Flow<Object> flow = this.f67832h;
                    MutableSharedFlow<Object> mutableSharedFlow = this.f67833i;
                    this.f67830f = 1;
                    if (flow.mo4140a(mutableSharedFlow, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (ordinal == 2) {
                    Object obj2 = this.f67834j;
                    if (obj2 == SharedFlowKt.f68041a) {
                        this.f67833i.mo34220b();
                    } else {
                        this.f67833i.mo34221c(obj2);
                    }
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
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, Flow<Object> flow, MutableSharedFlow<Object> mutableSharedFlow, Object obj, Continuation<? super FlowKt__ShareKt$launchSharing$1> continuation) {
        super(2, continuation);
        this.f67825g = sharingStarted;
        this.f67826h = flow;
        this.f67827i = mutableSharedFlow;
        this.f67828j = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.f67825g, this.f67826h, this.f67827i, this.f67828j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.f67825g, this.f67826h, this.f67827i, this.f67828j, continuation).mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[RETURN] */
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
            int r1 = r7.f67824f
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.m31892b(r8)
            goto L53
        L1f:
            kotlin.ResultKt.m31892b(r8)
            goto La4
        L24:
            kotlin.ResultKt.m31892b(r8)
            kotlinx.coroutines.flow.SharingStarted r8 = r7.f67825g
            kotlinx.coroutines.flow.SharingStarted r1 = kotlinx.coroutines.flow.SharingStarted.Companion.f68049b
            if (r8 != r1) goto L3a
            kotlinx.coroutines.flow.Flow<java.lang.Object> r8 = r7.f67826h
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Object> r1 = r7.f67827i
            r7.f67824f = r5
            java.lang.Object r8 = r8.mo4140a(r1, r7)
            if (r8 != r0) goto La4
            return r0
        L3a:
            kotlinx.coroutines.flow.SharingStarted r1 = kotlinx.coroutines.flow.SharingStarted.Companion.f68050c
            r5 = 0
            if (r8 != r1) goto L60
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Object> r8 = r7.f67827i
            kotlinx.coroutines.flow.StateFlow r8 = r8.m34222e()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.f67824f = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.m34213e(r8, r1, r7)
            if (r8 != r0) goto L53
            return r0
        L53:
            kotlinx.coroutines.flow.Flow<java.lang.Object> r8 = r7.f67826h
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Object> r1 = r7.f67827i
            r7.f67824f = r3
            java.lang.Object r8 = r8.mo4140a(r1, r7)
            if (r8 != r0) goto La4
            return r0
        L60:
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Object> r1 = r7.f67827i
            kotlinx.coroutines.flow.StateFlow r1 = r1.m34222e()
            kotlinx.coroutines.flow.Flow r8 = r8.mo34246a(r1)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.m34210b(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.Flow<java.lang.Object> r3 = r7.f67826h
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Object> r4 = r7.f67827i
            java.lang.Object r6 = r7.f67828j
            r1.<init>(r3, r4, r6, r5)
            r7.f67824f = r2
            int r2 = kotlinx.coroutines.flow.FlowKt__MergeKt.f67718a
            kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1 r2 = new kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1
            r2.<init>(r1, r5)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.m34215g(r8, r2)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r2 = 0
            kotlinx.coroutines.flow.internal.FusibleFlow r8 = (kotlinx.coroutines.flow.internal.FusibleFlow) r8
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f63224b
            kotlinx.coroutines.flow.Flow r8 = r8.mo34223d(r3, r2, r1)
            kotlinx.coroutines.flow.internal.NopCollector r1 = kotlinx.coroutines.flow.internal.NopCollector.f68208b
            java.lang.Object r8 = r8.mo4140a(r1, r7)
            if (r8 != r0) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r8 = kotlin.Unit.f63088a
        L9c:
            if (r8 != r0) goto L9f
            goto La1
        L9f:
            kotlin.Unit r8 = kotlin.Unit.f63088a
        La1:
            if (r8 != r0) goto La4
            return r0
        La4:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
