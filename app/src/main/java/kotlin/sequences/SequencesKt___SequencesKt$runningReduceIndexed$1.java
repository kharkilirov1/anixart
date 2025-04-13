package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m31884d2 = {"S", "T", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", m32126f = "_Sequences.kt", m32127l = {2373, 2377}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66766d;

    /* renamed from: e */
    public Object f66767e;

    /* renamed from: f */
    public int f66768f;

    /* renamed from: g */
    public int f66769g;

    /* renamed from: h */
    public /* synthetic */ Object f66770h;

    /* renamed from: i */
    public final /* synthetic */ Sequence<Object> f66771i;

    /* renamed from: j */
    public final /* synthetic */ Function3<Integer, Object, Object, Object> f66772j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(Sequence<Object> sequence, Function3<? super Integer, Object, Object, Object> function3, Continuation<? super SequencesKt___SequencesKt$runningReduceIndexed$1> continuation) {
        super(2, continuation);
        this.f66771i = sequence;
        this.f66772j = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.f66771i, this.f66772j, continuation);
        sequencesKt___SequencesKt$runningReduceIndexed$1.f66770h = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.f66771i, this.f66772j, continuation);
        sequencesKt___SequencesKt$runningReduceIndexed$1.f66770h = sequenceScope;
        return sequencesKt___SequencesKt$runningReduceIndexed$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.f66769g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            int r1 = r10.f66768f
            java.lang.Object r3 = r10.f66767e
            java.lang.Object r4 = r10.f66766d
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r10.f66770h
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.m31892b(r11)
            r11 = r10
            r9 = r3
            r3 = r1
            r1 = r9
            goto L5e
        L20:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L28:
            java.lang.Object r1 = r10.f66767e
            java.lang.Object r4 = r10.f66766d
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r10.f66770h
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.m31892b(r11)
            goto L5d
        L36:
            kotlin.ResultKt.m31892b(r11)
            java.lang.Object r11 = r10.f66770h
            r5 = r11
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.sequences.Sequence<java.lang.Object> r11 = r10.f66771i
            java.util.Iterator r4 = r11.iterator()
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L90
            java.lang.Object r1 = r4.next()
            r10.f66770h = r5
            r10.f66766d = r4
            r10.f66767e = r1
            r10.f66769g = r3
            java.lang.Object r11 = r5.mo33827a(r1, r10)
            if (r11 != r0) goto L5d
            return r0
        L5d:
            r11 = r10
        L5e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L90
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r6 = r11.f66772j
            int r7 = r3 + 1
            if (r3 < 0) goto L8b
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            java.lang.Object r3 = r4.next()
            java.lang.Object r3 = r6.mo16505k(r8, r1, r3)
            r11.f66770h = r5
            r11.f66766d = r4
            r11.f66767e = r3
            r11.f66768f = r7
            r11.f66769g = r2
            java.lang.Object r1 = r5.mo33827a(r3, r11)
            if (r1 != r0) goto L88
            return r0
        L88:
            r1 = r3
            r3 = r7
            goto L5e
        L8b:
            kotlin.collections.CollectionsKt.m32023h0()
            r11 = 0
            throw r11
        L90:
            kotlin.Unit r11 = kotlin.Unit.f63088a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
