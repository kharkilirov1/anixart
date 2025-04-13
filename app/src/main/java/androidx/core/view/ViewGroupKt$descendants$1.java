package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewGroup.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "androidx.core.view.ViewGroupKt$descendants$1", m32126f = "ViewGroup.kt", m32127l = {C4632R.styleable.AppCompatTheme_windowActionBarOverlay, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f3660d;

    /* renamed from: e */
    public Object f3661e;

    /* renamed from: f */
    public int f3662f;

    /* renamed from: g */
    public int f3663g;

    /* renamed from: h */
    public int f3664h;

    /* renamed from: i */
    public /* synthetic */ Object f3665i;

    /* renamed from: j */
    public final /* synthetic */ ViewGroup f3666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, Continuation<? super ViewGroupKt$descendants$1> continuation) {
        super(2, continuation);
        this.f3666j = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.f3666j, continuation);
        viewGroupKt$descendants$1.f3665i = obj;
        return viewGroupKt$descendants$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.f3666j, continuation);
        viewGroupKt$descendants$1.f3665i = sequenceScope;
        return viewGroupKt$descendants$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0097 -> B:6:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a0 -> B:7:0x00a4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.f3664h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            int r1 = r12.f3663g
            int r4 = r12.f3662f
            java.lang.Object r5 = r12.f3660d
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r12.f3665i
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.m31892b(r13)
            r13 = r12
            goto L99
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            int r1 = r12.f3663g
            int r4 = r12.f3662f
            java.lang.Object r5 = r12.f3661e
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r12.f3660d
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r12.f3665i
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.ResultKt.m31892b(r13)
            r13 = r12
            goto L6e
        L3b:
            kotlin.ResultKt.m31892b(r13)
            java.lang.Object r13 = r12.f3665i
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            android.view.ViewGroup r1 = r12.f3666j
            r4 = 0
            int r5 = r1.getChildCount()
            r6 = r12
        L4a:
            if (r4 >= r5) goto La6
            android.view.View r7 = r1.getChildAt(r4)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.Intrinsics.m32178g(r7, r8)
            r6.f3665i = r13
            r6.f3660d = r1
            r6.f3661e = r7
            r6.f3662f = r4
            r6.f3663g = r5
            r6.f3664h = r3
            java.lang.Object r8 = r13.mo33827a(r7, r6)
            if (r8 != r0) goto L68
            return r0
        L68:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r5
            r5 = r10
        L6e:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto La0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.m32179h(r5, r8)
            androidx.core.view.ViewGroupKt$descendants$1 r8 = new androidx.core.view.ViewGroupKt$descendants$1
            r9 = 0
            r8.<init>(r5, r9)
            kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 r5 = new kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1
            r5.<init>(r8)
            r13.f3665i = r7
            r13.f3660d = r6
            r13.f3661e = r9
            r13.f3662f = r4
            r13.f3663g = r1
            r13.f3664h = r2
            java.lang.Object r5 = r7.m33830c(r5, r13)
            if (r5 != r0) goto L97
            return r0
        L97:
            r5 = r6
            r6 = r7
        L99:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto La4
        La0:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        La4:
            int r4 = r4 + r3
            goto L4a
        La6:
            kotlin.Unit r13 = kotlin.Unit.f63088a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
