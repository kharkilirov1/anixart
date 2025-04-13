package kotlin.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.text.Regex$splitToSequence$1", m32126f = "Regex.kt", m32127l = {276, 284, 288}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66882d;

    /* renamed from: e */
    public int f66883e;

    /* renamed from: f */
    public int f66884f;

    /* renamed from: g */
    public /* synthetic */ Object f66885g;

    /* renamed from: h */
    public final /* synthetic */ Regex f66886h;

    /* renamed from: i */
    public final /* synthetic */ CharSequence f66887i;

    /* renamed from: j */
    public final /* synthetic */ int f66888j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i2, Continuation<? super Regex$splitToSequence$1> continuation) {
        super(2, continuation);
        this.f66886h = regex;
        this.f66887i = charSequence;
        this.f66888j = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.f66886h, this.f66887i, this.f66888j, continuation);
        regex$splitToSequence$1.f66885g = obj;
        return regex$splitToSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.f66886h, this.f66887i, this.f66888j, continuation);
        regex$splitToSequence$1.f66885g = sequenceScope;
        return regex$splitToSequence$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:13:0x006f). Please report as a decompilation issue!!! */
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
            int r1 = r10.f66884f
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.m31892b(r11)
            goto L9b
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            int r1 = r10.f66883e
            java.lang.Object r2 = r10.f66882d
            java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
            java.lang.Object r6 = r10.f66885g
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.m31892b(r11)
            r7 = r10
            r11 = r1
            r1 = r2
            goto L6f
        L2e:
            kotlin.ResultKt.m31892b(r11)
            goto Lad
        L33:
            kotlin.ResultKt.m31892b(r11)
            java.lang.Object r11 = r10.f66885g
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.text.Regex r1 = r10.f66886h
            java.util.regex.Pattern r1 = r1.f66877b
            java.lang.CharSequence r6 = r10.f66887i
            java.util.regex.Matcher r1 = r1.matcher(r6)
            int r6 = r10.f66888j
            if (r6 == r5) goto L9e
            boolean r6 = r1.find()
            if (r6 != 0) goto L4f
            goto L9e
        L4f:
            r7 = r10
            r6 = r11
            r11 = 0
        L52:
            java.lang.CharSequence r8 = r7.f66887i
            int r9 = r1.start()
            java.lang.CharSequence r2 = r8.subSequence(r2, r9)
            java.lang.String r2 = r2.toString()
            r7.f66885g = r6
            r7.f66882d = r1
            r7.f66883e = r11
            r7.f66884f = r4
            java.lang.Object r2 = r6.mo33827a(r2, r7)
            if (r2 != r0) goto L6f
            return r0
        L6f:
            int r2 = r1.end()
            int r11 = r11 + r5
            int r8 = r7.f66888j
            int r8 = r8 - r5
            if (r11 == r8) goto L7f
            boolean r8 = r1.find()
            if (r8 != 0) goto L52
        L7f:
            java.lang.CharSequence r11 = r7.f66887i
            int r1 = r11.length()
            java.lang.CharSequence r11 = r11.subSequence(r2, r1)
            java.lang.String r11 = r11.toString()
            r1 = 0
            r7.f66885g = r1
            r7.f66882d = r1
            r7.f66884f = r3
            java.lang.Object r11 = r6.mo33827a(r11, r7)
            if (r11 != r0) goto L9b
            return r0
        L9b:
            kotlin.Unit r11 = kotlin.Unit.f63088a
            return r11
        L9e:
            java.lang.CharSequence r1 = r10.f66887i
            java.lang.String r1 = r1.toString()
            r10.f66884f = r5
            java.lang.Object r11 = r11.mo33827a(r1, r10)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            kotlin.Unit r11 = kotlin.Unit.f63088a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
