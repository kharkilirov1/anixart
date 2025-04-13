package org.jsoup.nodes;

/* loaded from: classes3.dex */
public class Range {

    /* renamed from: c */
    public static final String f69009c = Attributes.m34712D("jsoup.sourceRange");

    /* renamed from: d */
    public static final String f69010d = Attributes.m34712D("jsoup.endSourceRange");

    /* renamed from: a */
    public final Position f69011a;

    /* renamed from: b */
    public final Position f69012b;

    public static class Position {

        /* renamed from: a */
        public final int f69013a;

        /* renamed from: b */
        public final int f69014b;

        /* renamed from: c */
        public final int f69015c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Position position = (Position) obj;
            return this.f69013a == position.f69013a && this.f69014b == position.f69014b && this.f69015c == position.f69015c;
        }

        public int hashCode() {
            return (((this.f69013a * 31) + this.f69014b) * 31) + this.f69015c;
        }

        public String toString() {
            return this.f69014b + "," + this.f69015c + ":" + this.f69013a;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Range range = (Range) obj;
        if (this.f69011a.equals(range.f69011a)) {
            return this.f69012b.equals(range.f69012b);
        }
        return false;
    }

    public int hashCode() {
        return this.f69012b.hashCode() + (this.f69011a.hashCode() * 31);
    }

    public String toString() {
        return this.f69011a + "-" + this.f69012b;
    }
}
