package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Regex.kt */
@Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {

    /* renamed from: d */
    public static final Regex$findAll$2 f66881d = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public MatchResult invoke(MatchResult matchResult) {
        MatchResult p0 = matchResult;
        Intrinsics.m32179h(p0, "p0");
        return p0.next();
    }
}
