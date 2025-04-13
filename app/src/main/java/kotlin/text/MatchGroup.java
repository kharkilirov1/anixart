package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Regex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class MatchGroup {

    /* renamed from: a */
    @NotNull
    public final String f66868a;

    /* renamed from: b */
    @NotNull
    public final IntRange f66869b;

    public MatchGroup(@NotNull String str, @NotNull IntRange intRange) {
        this.f66868a = str;
        this.f66869b = intRange;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.m32174c(this.f66868a, matchGroup.f66868a) && Intrinsics.m32174c(this.f66869b, matchGroup.f66869b);
    }

    public int hashCode() {
        return this.f66869b.hashCode() + (this.f66868a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("MatchGroup(value=");
        m24u.append(this.f66868a);
        m24u.append(", range=");
        m24u.append(this.f66869b);
        m24u.append(')');
        return m24u.toString();
    }
}
