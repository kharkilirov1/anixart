package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class MatcherMatchResult implements MatchResult {

    /* renamed from: a */
    @NotNull
    public final Matcher f66871a;

    /* renamed from: b */
    @NotNull
    public final CharSequence f66872b;

    /* renamed from: c */
    @Nullable
    public List<String> f66873c;

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.m32179h(input, "input");
        this.f66871a = matcher;
        this.f66872b = input;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* renamed from: a */
    public MatchResult.Destructured mo33867a() {
        return new MatchResult.Destructured(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* renamed from: b */
    public List<String> mo33868b() {
        if (this.f66873c == null) {
            this.f66873c = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection
                /* renamed from: b */
                public int getF63120e() {
                    return MatcherMatchResult.this.f66871a.groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return super.contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public Object get(int i2) {
                    String group = MatcherMatchResult.this.f66871a.group(i2);
                    return group == null ? "" : group;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.lastIndexOf((String) obj);
                    }
                    return -1;
                }
            };
        }
        List<String> list = this.f66873c;
        Intrinsics.m32176e(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    @Nullable
    public MatchResult next() {
        int end = this.f66871a.end() + (this.f66871a.end() == this.f66871a.start() ? 1 : 0);
        if (end > this.f66872b.length()) {
            return null;
        }
        Matcher matcher = this.f66871a.pattern().matcher(this.f66872b);
        Intrinsics.m32178g(matcher, "matcher.pattern().matcher(input)");
        CharSequence charSequence = this.f66872b;
        if (matcher.find(end)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }
}
