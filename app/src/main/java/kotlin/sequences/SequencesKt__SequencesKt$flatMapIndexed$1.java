package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, m31884d2 = {"T", "C", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", m32126f = "Sequences.kt", m32127l = {332}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66715d;

    /* renamed from: e */
    public int f66716e;

    /* renamed from: f */
    public int f66717f;

    /* renamed from: g */
    public /* synthetic */ Object f66718g;

    /* renamed from: h */
    public final /* synthetic */ Sequence<Object> f66719h;

    /* renamed from: i */
    public final /* synthetic */ Function2<Integer, Object, Object> f66720i;

    /* renamed from: j */
    public final /* synthetic */ Function1<Object, Iterator<Object>> f66721j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$flatMapIndexed$1(Sequence<Object> sequence, Function2<? super Integer, Object, Object> function2, Function1<Object, ? extends Iterator<Object>> function1, Continuation<? super SequencesKt__SequencesKt$flatMapIndexed$1> continuation) {
        super(2, continuation);
        this.f66719h = sequence;
        this.f66720i = function2;
        this.f66721j = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.f66719h, this.f66720i, this.f66721j, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.f66718g = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.f66719h, this.f66720i, this.f66721j, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.f66718g = sequenceScope;
        return sequencesKt__SequencesKt$flatMapIndexed$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        int i2;
        Iterator<Object> it;
        SequenceScope sequenceScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f66717f;
        if (i3 == 0) {
            ResultKt.m31892b(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.f66718g;
            i2 = 0;
            it = this.f66719h.iterator();
            sequenceScope = sequenceScope2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f66716e;
            it = (Iterator) this.f66715d;
            sequenceScope = (SequenceScope) this.f66718g;
            ResultKt.m31892b(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            Function2<Integer, Object, Object> function2 = this.f66720i;
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            Iterator<Object> invoke = this.f66721j.invoke(function2.invoke(new Integer(i2), next));
            this.f66718g = sequenceScope;
            this.f66715d = it;
            this.f66716e = i4;
            this.f66717f = 1;
            if (sequenceScope.mo33828b(invoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = i4;
        }
        return Unit.f63088a;
    }
}
