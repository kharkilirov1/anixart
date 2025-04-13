package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.JobSupport$children$1", m32126f = "JobSupport.kt", m32127l = {952, 954}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Job>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f67031d;

    /* renamed from: e */
    public Object f67032e;

    /* renamed from: f */
    public int f67033f;

    /* renamed from: g */
    public /* synthetic */ Object f67034g;

    /* renamed from: h */
    public final /* synthetic */ JobSupport f67035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, Continuation<? super JobSupport$children$1> continuation) {
        super(2, continuation);
        this.f67035h = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f67035h, continuation);
        jobSupport$children$1.f67034g = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super Job> sequenceScope, Continuation<? super Unit> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f67035h, continuation);
        jobSupport$children$1.f67034g = sequenceScope;
        return jobSupport$children$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0067 -> B:6:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007a -> B:6:0x007d). Please report as a decompilation issue!!! */
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
            int r1 = r7.f67033f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r7.f67032e
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.f67031d
            kotlinx.coroutines.internal.LockFreeLinkedListHead r3 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r3
            java.lang.Object r4 = r7.f67034g
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.m31892b(r8)
            r8 = r7
            goto L7d
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            kotlin.ResultKt.m31892b(r8)
            goto L82
        L29:
            kotlin.ResultKt.m31892b(r8)
            java.lang.Object r8 = r7.f67034g
            kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
            kotlinx.coroutines.JobSupport r1 = r7.f67035h
            java.lang.Object r1 = r1.m34088a0()
            boolean r4 = r1 instanceof kotlinx.coroutines.ChildHandleNode
            if (r4 == 0) goto L47
            kotlinx.coroutines.ChildHandleNode r1 = (kotlinx.coroutines.ChildHandleNode) r1
            kotlinx.coroutines.ChildJob r1 = r1.f66949f
            r7.f67033f = r3
            java.lang.Object r8 = r8.mo33827a(r1, r7)
            if (r8 != r0) goto L82
            return r0
        L47:
            boolean r3 = r1 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L82
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            kotlinx.coroutines.NodeList r1 = r1.getF67030b()
            if (r1 != 0) goto L54
            goto L82
        L54:
            java.lang.Object r3 = r1.m34290I()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5f:
            boolean r5 = kotlin.jvm.internal.Intrinsics.m32174c(r1, r3)
            if (r5 != 0) goto L82
            boolean r5 = r1 instanceof kotlinx.coroutines.ChildHandleNode
            if (r5 == 0) goto L7d
            r5 = r1
            kotlinx.coroutines.ChildHandleNode r5 = (kotlinx.coroutines.ChildHandleNode) r5
            kotlinx.coroutines.ChildJob r5 = r5.f66949f
            r8.f67034g = r4
            r8.f67031d = r3
            r8.f67032e = r1
            r8.f67033f = r2
            java.lang.Object r5 = r4.mo33827a(r5, r8)
            if (r5 != r0) goto L7d
            return r0
        L7d:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.m34291J()
            goto L5f
        L82:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
