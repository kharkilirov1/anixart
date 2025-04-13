package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MatchResult.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/text/MatchResult;", "", "Destructured", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface MatchResult {

    /* compiled from: MatchResult.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* compiled from: MatchResult.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Destructured {

        /* renamed from: a */
        @NotNull
        public final MatchResult f66870a;

        public Destructured(@NotNull MatchResult match) {
            Intrinsics.m32179h(match, "match");
            this.f66870a = match;
        }
    }

    @NotNull
    /* renamed from: a */
    Destructured mo33867a();

    @NotNull
    /* renamed from: b */
    List<String> mo33868b();

    @Nullable
    MatchResult next();
}
