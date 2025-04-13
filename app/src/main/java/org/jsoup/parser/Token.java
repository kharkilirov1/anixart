package org.jsoup.parser;

import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import p000a.C0000a;

/* loaded from: classes3.dex */
abstract class Token {

    /* renamed from: a */
    public TokenType f69141a;

    /* renamed from: b */
    public int f69142b;

    /* renamed from: c */
    public int f69143c = -1;

    public static final class CData extends Character {
        public CData(String str) {
            this.f69144d = str;
        }

        @Override // org.jsoup.parser.Token.Character
        public String toString() {
            return C0000a.m20q(C0000a.m24u("<![CDATA["), this.f69144d, "]]>");
        }
    }

    public static class Character extends Token {

        /* renamed from: d */
        public String f69144d;

        public Character() {
            super(null);
            this.f69141a = TokenType.Character;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: g */
        public Token mo34900g() {
            super.mo34900g();
            this.f69144d = null;
            return this;
        }

        public String toString() {
            return this.f69144d;
        }
    }

    public static final class Comment extends Token {

        /* renamed from: d */
        public final StringBuilder f69145d;

        /* renamed from: e */
        public String f69146e;

        /* renamed from: f */
        public boolean f69147f;

        public Comment() {
            super(null);
            this.f69145d = new StringBuilder();
            this.f69147f = false;
            this.f69141a = TokenType.Comment;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: g */
        public Token mo34900g() {
            super.mo34900g();
            Token.m34893h(this.f69145d);
            this.f69146e = null;
            this.f69147f = false;
            return this;
        }

        /* renamed from: i */
        public final Comment m34901i(char c2) {
            String str = this.f69146e;
            if (str != null) {
                this.f69145d.append(str);
                this.f69146e = null;
            }
            this.f69145d.append(c2);
            return this;
        }

        /* renamed from: j */
        public final Comment m34902j(String str) {
            String str2 = this.f69146e;
            if (str2 != null) {
                this.f69145d.append(str2);
                this.f69146e = null;
            }
            if (this.f69145d.length() == 0) {
                this.f69146e = str;
            } else {
                this.f69145d.append(str);
            }
            return this;
        }

        /* renamed from: k */
        public String m34903k() {
            String str = this.f69146e;
            return str != null ? str : this.f69145d.toString();
        }

        public String toString() {
            return C0000a.m20q(C0000a.m24u("<!--"), m34903k(), "-->");
        }
    }

    public static final class Doctype extends Token {

        /* renamed from: d */
        public final StringBuilder f69148d;

        /* renamed from: e */
        public String f69149e;

        /* renamed from: f */
        public final StringBuilder f69150f;

        /* renamed from: g */
        public final StringBuilder f69151g;

        /* renamed from: h */
        public boolean f69152h;

        public Doctype() {
            super(null);
            this.f69148d = new StringBuilder();
            this.f69149e = null;
            this.f69150f = new StringBuilder();
            this.f69151g = new StringBuilder();
            this.f69152h = false;
            this.f69141a = TokenType.Doctype;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: g */
        public Token mo34900g() {
            super.mo34900g();
            Token.m34893h(this.f69148d);
            this.f69149e = null;
            Token.m34893h(this.f69150f);
            Token.m34893h(this.f69151g);
            this.f69152h = false;
            return this;
        }

        /* renamed from: i */
        public String m34904i() {
            return this.f69148d.toString();
        }

        public String toString() {
            return C0000a.m20q(C0000a.m24u("<!doctype "), m34904i(), ">");
        }
    }

    public static final class EOF extends Token {
        public EOF() {
            super(null);
            this.f69141a = TokenType.EOF;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: g */
        public Token mo34900g() {
            super.mo34900g();
            return this;
        }

        public String toString() {
            return "";
        }
    }

    public static final class EndTag extends Tag {
        public EndTag() {
            this.f69141a = TokenType.EndTag;
        }

        public String toString() {
            return C0000a.m20q(C0000a.m24u("</"), m34918v(), ">");
        }
    }

    public static final class StartTag extends Tag {
        public StartTag() {
            this.f69141a = TokenType.StartTag;
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        /* renamed from: g */
        public /* bridge */ /* synthetic */ Token mo34900g() {
            mo34900g();
            return this;
        }

        public String toString() {
            if (!m34914q() || this.f69163n.f68952b <= 0) {
                return C0000a.m20q(C0000a.m24u("<"), m34918v(), ">");
            }
            StringBuilder m24u = C0000a.m24u("<");
            m24u.append(m34918v());
            m24u.append(" ");
            m24u.append(this.f69163n.toString());
            m24u.append(">");
            return m24u.toString();
        }

        @Override // org.jsoup.parser.Token.Tag
        /* renamed from: u */
        public Tag mo34900g() {
            super.mo34900g();
            this.f69163n = null;
            return this;
        }
    }

    public static abstract class Tag extends Token {

        /* renamed from: d */
        @Nullable
        public String f69153d;

        /* renamed from: e */
        @Nullable
        public String f69154e;

        /* renamed from: f */
        public final StringBuilder f69155f;

        /* renamed from: g */
        @Nullable
        public String f69156g;

        /* renamed from: h */
        public boolean f69157h;

        /* renamed from: i */
        public final StringBuilder f69158i;

        /* renamed from: j */
        @Nullable
        public String f69159j;

        /* renamed from: k */
        public boolean f69160k;

        /* renamed from: l */
        public boolean f69161l;

        /* renamed from: m */
        public boolean f69162m;

        /* renamed from: n */
        @Nullable
        public Attributes f69163n;

        public Tag() {
            super(null);
            this.f69155f = new StringBuilder();
            this.f69157h = false;
            this.f69158i = new StringBuilder();
            this.f69160k = false;
            this.f69161l = false;
            this.f69162m = false;
        }

        /* renamed from: i */
        public final void m34906i(char c2) {
            this.f69157h = true;
            String str = this.f69156g;
            if (str != null) {
                this.f69155f.append(str);
                this.f69156g = null;
            }
            this.f69155f.append(c2);
        }

        /* renamed from: j */
        public final void m34907j(char c2) {
            m34912o();
            this.f69158i.append(c2);
        }

        /* renamed from: k */
        public final void m34908k(String str) {
            m34912o();
            if (this.f69158i.length() == 0) {
                this.f69159j = str;
            } else {
                this.f69158i.append(str);
            }
        }

        /* renamed from: l */
        public final void m34909l(int[] iArr) {
            m34912o();
            for (int i2 : iArr) {
                this.f69158i.appendCodePoint(i2);
            }
        }

        /* renamed from: m */
        public final void m34910m(char c2) {
            m34911n(String.valueOf(c2));
        }

        /* renamed from: n */
        public final void m34911n(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            String str2 = this.f69153d;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.f69153d = replace;
            this.f69154e = ParseSettings.m34886a(replace);
        }

        /* renamed from: o */
        public final void m34912o() {
            this.f69160k = true;
            String str = this.f69159j;
            if (str != null) {
                this.f69158i.append(str);
                this.f69159j = null;
            }
        }

        /* renamed from: p */
        public final boolean m34913p(String str) {
            Attributes attributes = this.f69163n;
            return attributes != null && attributes.m34725t(str);
        }

        /* renamed from: q */
        public final boolean m34914q() {
            return this.f69163n != null;
        }

        /* renamed from: r */
        public final String m34915r() {
            String str = this.f69153d;
            Validate.m34688a(str == null || str.length() == 0);
            return this.f69153d;
        }

        /* renamed from: s */
        public final Tag m34916s(String str) {
            this.f69153d = str;
            this.f69154e = ParseSettings.m34886a(str);
            return this;
        }

        /* renamed from: t */
        public final void m34917t() {
            if (this.f69163n == null) {
                this.f69163n = new Attributes();
            }
            if (this.f69157h && this.f69163n.f68952b < 512) {
                String trim = (this.f69155f.length() > 0 ? this.f69155f.toString() : this.f69156g).trim();
                if (trim.length() > 0) {
                    this.f69163n.m34719b(trim, this.f69160k ? this.f69158i.length() > 0 ? this.f69158i.toString() : this.f69159j : this.f69161l ? "" : null);
                }
            }
            Token.m34893h(this.f69155f);
            this.f69156g = null;
            this.f69157h = false;
            Token.m34893h(this.f69158i);
            this.f69159j = null;
            this.f69160k = false;
            this.f69161l = false;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public Tag mo34900g() {
            super.mo34900g();
            this.f69153d = null;
            this.f69154e = null;
            Token.m34893h(this.f69155f);
            this.f69156g = null;
            this.f69157h = false;
            Token.m34893h(this.f69158i);
            this.f69159j = null;
            this.f69161l = false;
            this.f69160k = false;
            this.f69162m = false;
            this.f69163n = null;
            return this;
        }

        /* renamed from: v */
        public final String m34918v() {
            String str = this.f69153d;
            return str != null ? str : "[unset]";
        }
    }

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public Token() {
    }

    /* renamed from: h */
    public static void m34893h(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* renamed from: a */
    public final boolean m34894a() {
        return this.f69141a == TokenType.Character;
    }

    /* renamed from: b */
    public final boolean m34895b() {
        return this.f69141a == TokenType.Comment;
    }

    /* renamed from: c */
    public final boolean m34896c() {
        return this.f69141a == TokenType.Doctype;
    }

    /* renamed from: d */
    public final boolean m34897d() {
        return this.f69141a == TokenType.EOF;
    }

    /* renamed from: e */
    public final boolean m34898e() {
        return this.f69141a == TokenType.EndTag;
    }

    /* renamed from: f */
    public final boolean m34899f() {
        return this.f69141a == TokenType.StartTag;
    }

    /* renamed from: g */
    public Token mo34900g() {
        this.f69142b = -1;
        this.f69143c = -1;
        return this;
    }

    public Token(C69031 c69031) {
    }
}
