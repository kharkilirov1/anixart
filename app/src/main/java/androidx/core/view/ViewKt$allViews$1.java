package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: View.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "androidx.core.view.ViewKt$allViews$1", m32126f = "View.kt", m32127l = {406, 408}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public int f3669d;

    /* renamed from: e */
    public /* synthetic */ Object f3670e;

    /* renamed from: f */
    public final /* synthetic */ View f3671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation<? super ViewKt$allViews$1> continuation) {
        super(2, continuation);
        this.f3671f = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f3671f, continuation);
        viewKt$allViews$1.f3670e = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f3671f, continuation);
        viewKt$allViews$1.f3670e = sequenceScope;
        return viewKt$allViews$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        SequenceScope sequenceScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f3669d;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            sequenceScope = (SequenceScope) this.f3670e;
            View view = this.f3671f;
            this.f3670e = sequenceScope;
            this.f3669d = 1;
            if (sequenceScope.mo33827a(view, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m31892b(obj);
                return Unit.f63088a;
            }
            sequenceScope = (SequenceScope) this.f3670e;
            ResultKt.m31892b(obj);
        }
        View view2 = this.f3671f;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            Intrinsics.m32179h(viewGroup, "<this>");
            SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 sequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 = new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new ViewGroupKt$descendants$1(viewGroup, null));
            this.f3670e = null;
            this.f3669d = 2;
            if (sequenceScope.m33830c(sequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f63088a;
    }
}
