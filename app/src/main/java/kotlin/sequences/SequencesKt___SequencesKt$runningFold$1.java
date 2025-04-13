package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", m32126f = "_Sequences.kt", m32127l = {2286, 2290}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66745d;

    /* renamed from: e */
    public Object f66746e;

    /* renamed from: f */
    public int f66747f;

    /* renamed from: g */
    public /* synthetic */ Object f66748g;

    /* renamed from: h */
    public final /* synthetic */ Object f66749h;

    /* renamed from: i */
    public final /* synthetic */ Sequence<Object> f66750i;

    /* renamed from: j */
    public final /* synthetic */ Function2<Object, Object, Object> f66751j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Object obj, Sequence<Object> sequence, Function2<Object, Object, Object> function2, Continuation<? super SequencesKt___SequencesKt$runningFold$1> continuation) {
        super(2, continuation);
        this.f66749h = obj;
        this.f66750i = sequence;
        this.f66751j = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.f66749h, this.f66750i, this.f66751j, continuation);
        sequencesKt___SequencesKt$runningFold$1.f66748g = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.f66749h, this.f66750i, this.f66751j, continuation);
        sequencesKt___SequencesKt$runningFold$1.f66748g = sequenceScope;
        return sequencesKt___SequencesKt$runningFold$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
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
            int r1 = r7.f66747f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.f66746e
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r7.f66745d
            java.lang.Object r4 = r7.f66748g
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.m31892b(r8)
            r8 = r3
            goto L4a
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.f66748g
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.m31892b(r8)
            goto L40
        L2b:
            kotlin.ResultKt.m31892b(r8)
            java.lang.Object r8 = r7.f66748g
            r1 = r8
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            java.lang.Object r8 = r7.f66749h
            r7.f66748g = r1
            r7.f66747f = r3
            java.lang.Object r8 = r1.mo33827a(r8, r7)
            if (r8 != r0) goto L40
            return r0
        L40:
            java.lang.Object r8 = r7.f66749h
            kotlin.sequences.Sequence<java.lang.Object> r3 = r7.f66750i
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r3
        L4a:
            r3 = r7
        L4b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r1.next()
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> r6 = r3.f66751j
            java.lang.Object r8 = r6.invoke(r8, r5)
            r3.f66748g = r4
            r3.f66745d = r8
            r3.f66746e = r1
            r3.f66747f = r2
            java.lang.Object r5 = r4.mo33827a(r8, r3)
            if (r5 != r0) goto L4b
            return r0
        L6a:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
