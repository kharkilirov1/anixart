package kotlin.text;

import kotlin.Metadata;

/* compiled from: Regex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m31884d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public enum RegexOption implements FlagEnum {
    IGNORE_CASE(2, 0, 2),
    MULTILINE(8, 0, 2),
    LITERAL(16, 0, 2),
    UNIX_LINES(1, 0, 2),
    COMMENTS(4, 0, 2),
    DOT_MATCHES_ALL(32, 0, 2),
    CANON_EQ(128, 0, 2);


    /* renamed from: b */
    public final int f66897b;

    /* renamed from: c */
    public final int f66898c;

    RegexOption(int i2, int i3, int i4) {
        i3 = (i4 & 2) != 0 ? i2 : i3;
        this.f66897b = i2;
        this.f66898c = i3;
    }

    @Override // kotlin.text.FlagEnum
    /* renamed from: getMask, reason: from getter */
    public int getF66898c() {
        return this.f66898c;
    }

    @Override // kotlin.text.FlagEnum
    /* renamed from: getValue, reason: from getter */
    public int getF66897b() {
        return this.f66897b;
    }
}
