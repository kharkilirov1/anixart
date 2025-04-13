package kotlin.sequences;

import com.yandex.mobile.ads.C4632R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m32126f = "Sequences.kt", m32127l = {69, C4632R.styleable.AppCompatTheme_homeAsUpIndicator}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public int f66726d;

    /* renamed from: e */
    public /* synthetic */ Object f66727e;

    /* renamed from: f */
    public final /* synthetic */ Sequence<Object> f66728f;

    /* renamed from: g */
    public final /* synthetic */ Function0<Sequence<Object>> f66729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$ifEmpty$1(Sequence<Object> sequence, Function0<? extends Sequence<Object>> function0, Continuation<? super SequencesKt__SequencesKt$ifEmpty$1> continuation) {
        super(2, continuation);
        this.f66728f = sequence;
        this.f66729g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.f66728f, this.f66729g, continuation);
        sequencesKt__SequencesKt$ifEmpty$1.f66727e = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.f66728f, this.f66729g, continuation);
        sequencesKt__SequencesKt$ifEmpty$1.f66727e = sequenceScope;
        return sequencesKt__SequencesKt$ifEmpty$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66726d;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            SequenceScope sequenceScope = (SequenceScope) this.f66727e;
            Iterator<Object> it = this.f66728f.iterator();
            if (it.hasNext()) {
                this.f66726d = 1;
                if (sequenceScope.mo33828b(it, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Sequence<Object> invoke = this.f66729g.invoke();
                this.f66726d = 2;
                if (sequenceScope.m33830c(invoke, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}
