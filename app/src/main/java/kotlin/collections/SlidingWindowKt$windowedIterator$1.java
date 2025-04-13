package kotlin.collections;

import com.yandex.mobile.ads.C4632R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlidingWindow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m32126f = "SlidingWindow.kt", m32127l = {34, 40, C4632R.styleable.AppCompatTheme_checkedTextViewStyle, 55, 58}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<Object>>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f63160d;

    /* renamed from: e */
    public Object f63161e;

    /* renamed from: f */
    public int f63162f;

    /* renamed from: g */
    public int f63163g;

    /* renamed from: h */
    public /* synthetic */ Object f63164h;

    /* renamed from: i */
    public final /* synthetic */ int f63165i;

    /* renamed from: j */
    public final /* synthetic */ int f63166j;

    /* renamed from: k */
    public final /* synthetic */ Iterator<Object> f63167k;

    /* renamed from: l */
    public final /* synthetic */ boolean f63168l;

    /* renamed from: m */
    public final /* synthetic */ boolean f63169m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i2, int i3, Iterator<Object> it, boolean z, boolean z2, Continuation<? super SlidingWindowKt$windowedIterator$1> continuation) {
        super(2, continuation);
        this.f63165i = i2;
        this.f63166j = i3;
        this.f63167k = it;
        this.f63168l = z;
        this.f63169m = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.f63165i, this.f63166j, this.f63167k, this.f63168l, this.f63169m, continuation);
        slidingWindowKt$windowedIterator$1.f63164h = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super List<Object>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SlidingWindowKt$windowedIterator$1) mo2378a(sequenceScope, continuation)).mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
    
        if (0 == 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00da A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0187 -> B:12:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0152 -> B:30:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x00a5 -> B:67:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
