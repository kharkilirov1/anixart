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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m32126f = "_Sequences.kt", m32127l = {2314, 2319}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66752d;

    /* renamed from: e */
    public Object f66753e;

    /* renamed from: f */
    public int f66754f;

    /* renamed from: g */
    public int f66755g;

    /* renamed from: h */
    public /* synthetic */ Object f66756h;

    /* renamed from: i */
    public final /* synthetic */ Object f66757i;

    /* renamed from: j */
    public final /* synthetic */ Sequence<Object> f66758j;

    /* renamed from: k */
    public final /* synthetic */ Function3<Integer, Object, Object, Object> f66759k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, Sequence<Object> sequence, Function3<? super Integer, Object, Object, Object> function3, Continuation<? super SequencesKt___SequencesKt$runningFoldIndexed$1> continuation) {
        super(2, continuation);
        this.f66757i = obj;
        this.f66758j = sequence;
        this.f66759k = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.f66757i, this.f66758j, this.f66759k, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.f66756h = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.f66757i, this.f66758j, this.f66759k, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.f66756h = sequenceScope;
        return sequencesKt___SequencesKt$runningFoldIndexed$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
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
            int r1 = r10.f66755g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            int r1 = r10.f66754f
            java.lang.Object r3 = r10.f66753e
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r10.f66752d
            java.lang.Object r5 = r10.f66756h
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.m31892b(r11)
            r11 = r1
            r1 = r4
            goto L4f
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            java.lang.Object r1 = r10.f66756h
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.m31892b(r11)
            goto L43
        L2e:
            kotlin.ResultKt.m31892b(r11)
            java.lang.Object r11 = r10.f66756h
            r1 = r11
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            java.lang.Object r11 = r10.f66757i
            r10.f66756h = r1
            r10.f66755g = r3
            java.lang.Object r11 = r1.mo33827a(r11, r10)
            if (r11 != r0) goto L43
            return r0
        L43:
            r11 = 0
            java.lang.Object r3 = r10.f66757i
            kotlin.sequences.Sequence<java.lang.Object> r4 = r10.f66758j
            java.util.Iterator r4 = r4.iterator()
            r5 = r1
            r1 = r3
            r3 = r4
        L4f:
            r4 = r10
        L50:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r3.next()
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r7 = r4.f66759k
            int r8 = r11 + 1
            if (r11 < 0) goto L7d
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r11)
            java.lang.Object r11 = r7.mo16505k(r9, r1, r6)
            r4.f66756h = r5
            r4.f66752d = r11
            r4.f66753e = r3
            r4.f66754f = r8
            r4.f66755g = r2
            java.lang.Object r1 = r5.mo33827a(r11, r4)
            if (r1 != r0) goto L7a
            return r0
        L7a:
            r1 = r11
            r11 = r8
            goto L50
        L7d:
            kotlin.collections.CollectionsKt.m32023h0()
            r11 = 0
            throw r11
        L82:
            kotlin.Unit r11 = kotlin.Unit.f63088a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
