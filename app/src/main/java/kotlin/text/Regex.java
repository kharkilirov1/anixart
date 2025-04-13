package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Regex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "Serialized", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class Regex implements Serializable {

    /* renamed from: b */
    @NotNull
    public final Pattern f66877b;

    /* compiled from: Regex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/Regex$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: Regex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Serialized implements Serializable {

        /* compiled from: Regex.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Companion {
        }
    }

    public Regex(@NotNull String pattern) {
        Intrinsics.m32179h(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        Intrinsics.m32178g(compile, "compile(pattern)");
        this.f66877b = compile;
    }

    /* renamed from: b */
    public static Sequence m33869b(final Regex regex, final CharSequence input, final int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Intrinsics.m32179h(input, "input");
        if (i2 >= 0 && i2 <= input.length()) {
            return SequencesKt.m33849q(new Function0<MatchResult>() { // from class: kotlin.text.Regex$findAll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public MatchResult invoke() {
                    return Regex.this.m33870a(input, i2);
                }
            }, Regex$findAll$2.f66881d);
        }
        StringBuilder m25v = C0000a.m25v("Start index out of bounds: ", i2, ", input length: ");
        m25v.append(input.length());
        throw new IndexOutOfBoundsException(m25v.toString());
    }

    @Nullable
    /* renamed from: a */
    public final MatchResult m33870a(@NotNull CharSequence input, int i2) {
        Intrinsics.m32179h(input, "input");
        Matcher matcher = this.f66877b.matcher(input);
        Intrinsics.m32178g(matcher, "nativePattern.matcher(input)");
        if (matcher.find(i2)) {
            return new MatcherMatchResult(matcher, input);
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final MatchResult m33871c(@NotNull CharSequence charSequence) {
        Matcher matcher = this.f66877b.matcher(charSequence);
        Intrinsics.m32178g(matcher, "nativePattern.matcher(input)");
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m33872d(@NotNull CharSequence input) {
        Intrinsics.m32179h(input, "input");
        return this.f66877b.matcher(input).matches();
    }

    @NotNull
    /* renamed from: e */
    public final String m33873e(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.m32179h(input, "input");
        Intrinsics.m32179h(replacement, "replacement");
        String replaceAll = this.f66877b.matcher(input).replaceAll(replacement);
        Intrinsics.m32178g(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @NotNull
    /* renamed from: f */
    public final List<String> m33874f(@NotNull CharSequence charSequence, int i2) {
        StringsKt__StringsKt.m33939k(i2);
        Matcher matcher = this.f66877b.matcher(charSequence);
        if (i2 == 1 || !matcher.find()) {
            return CollectionsKt.m31993F(charSequence.toString());
        }
        int i3 = 10;
        if (i2 > 0 && i2 <= 10) {
            i3 = i2;
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = i2 - 1;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i5 >= 0 && arrayList.size() == i5) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    @NotNull
    public String toString() {
        String pattern = this.f66877b.toString();
        Intrinsics.m32178g(pattern, "nativePattern.toString()");
        return pattern;
    }
}
