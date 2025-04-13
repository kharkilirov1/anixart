package org.jsoup.select;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;

/* loaded from: classes3.dex */
public class QueryParser {

    /* renamed from: d */
    public static final String[] f69321d = {",", ">", "+", "~", " "};

    /* renamed from: e */
    public static final String[] f69322e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f */
    public static final Pattern f69323f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g */
    public static final Pattern f69324g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a */
    public final TokenQueue f69325a;

    /* renamed from: b */
    public final String f69326b;

    /* renamed from: c */
    public final List<Evaluator> f69327c = new ArrayList();

    public QueryParser(String str) {
        Validate.m34692e(str);
        String trim = str.trim();
        this.f69326b = trim;
        this.f69325a = new TokenQueue(trim);
    }

    /* renamed from: j */
    public static Evaluator m34968j(String str) {
        try {
            return new QueryParser(str).m34977i();
        } catch (IllegalArgumentException e2) {
            throw new Selector.SelectorParseException(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m34969a(char r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.m34969a(char):void");
    }

    /* renamed from: b */
    public final int m34970b() {
        TokenQueue tokenQueue = this.f69325a;
        String m34924e = tokenQueue.m34924e(")");
        tokenQueue.m34927h(")");
        String trim = m34924e.trim();
        String[] strArr = StringUtil.f68937a;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(trim.codePointAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        Validate.m34691d(z, "Index must be numeric");
        return Integer.parseInt(trim);
    }

    /* renamed from: c */
    public final void m34971c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.f69325a.m34922c(str);
        String m34919m = TokenQueue.m34919m(this.f69325a.m34920a('(', ')'));
        Validate.m34693f(m34919m, str + "(text) query must not be empty");
        this.f69327c.add(z ? new Evaluator.ContainsOwnText(m34919m) : new Evaluator.ContainsText(m34919m));
    }

    /* renamed from: d */
    public final void m34972d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.f69325a.m34922c(str);
        String m34919m = TokenQueue.m34919m(this.f69325a.m34920a('(', ')'));
        Validate.m34693f(m34919m, str + "(text) query must not be empty");
        this.f69327c.add(z ? new Evaluator.ContainsWholeOwnText(m34919m) : new Evaluator.ContainsWholeText(m34919m));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m34973e(boolean r9, boolean r10) {
        /*
            r8 = this;
            org.jsoup.parser.TokenQueue r0 = r8.f69325a
            java.lang.String r1 = ")"
            java.lang.String r2 = r0.m34924e(r1)
            r0.m34927h(r1)
            java.lang.String r0 = org.jsoup.internal.Normalizer.m34698b(r2)
            java.util.regex.Pattern r1 = org.jsoup.select.QueryParser.f69323f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = org.jsoup.select.QueryParser.f69324g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "odd"
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L29
            r0 = 1
        L27:
            r4 = 2
            goto L79
        L29:
            java.lang.String r3 = "even"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L33
            r0 = 0
            goto L27
        L33:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r3 == 0) goto L67
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L50
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L50:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L64
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L64:
            r0 = r4
            r4 = r5
            goto L79
        L67:
            boolean r1 = r2.matches()
            if (r1 == 0) goto Lab
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L79:
            if (r10 == 0) goto L93
            if (r9 == 0) goto L88
            java.util.List<org.jsoup.select.Evaluator> r9 = r8.f69327c
            org.jsoup.select.Evaluator$IsNthLastOfType r10 = new org.jsoup.select.Evaluator$IsNthLastOfType
            r10.<init>(r4, r0)
            r9.add(r10)
            goto Laa
        L88:
            java.util.List<org.jsoup.select.Evaluator> r9 = r8.f69327c
            org.jsoup.select.Evaluator$IsNthOfType r10 = new org.jsoup.select.Evaluator$IsNthOfType
            r10.<init>(r4, r0)
            r9.add(r10)
            goto Laa
        L93:
            if (r9 == 0) goto La0
            java.util.List<org.jsoup.select.Evaluator> r9 = r8.f69327c
            org.jsoup.select.Evaluator$IsNthLastChild r10 = new org.jsoup.select.Evaluator$IsNthLastChild
            r10.<init>(r4, r0)
            r9.add(r10)
            goto Laa
        La0:
            java.util.List<org.jsoup.select.Evaluator> r9 = r8.f69327c
            org.jsoup.select.Evaluator$IsNthChild r10 = new org.jsoup.select.Evaluator$IsNthChild
            r10.<init>(r4, r0)
            r9.add(r10)
        Laa:
            return
        Lab:
            org.jsoup.select.Selector$SelectorParseException r9 = new org.jsoup.select.Selector$SelectorParseException
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            r9.<init>(r0, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.m34973e(boolean, boolean):void");
    }

    /* renamed from: f */
    public final void m34974f() {
        if (this.f69325a.m34927h("#")) {
            String m34923d = this.f69325a.m34923d();
            Validate.m34692e(m34923d);
            this.f69327c.add(new Evaluator.C6975Id(m34923d));
            return;
        }
        if (this.f69325a.m34927h(".")) {
            String m34923d2 = this.f69325a.m34923d();
            Validate.m34692e(m34923d2);
            this.f69327c.add(new Evaluator.Class(m34923d2.trim()));
            return;
        }
        if (this.f69325a.m34930k() || this.f69325a.m34928i("*|")) {
            TokenQueue tokenQueue = this.f69325a;
            int i2 = tokenQueue.f69172b;
            while (!tokenQueue.m34926g() && (tokenQueue.m34930k() || tokenQueue.m34929j("*|", "|", "_", "-"))) {
                tokenQueue.f69172b++;
            }
            String m34698b = Normalizer.m34698b(tokenQueue.f69171a.substring(i2, tokenQueue.f69172b));
            Validate.m34692e(m34698b);
            if (m34698b.startsWith("*|")) {
                this.f69327c.add(new CombiningEvaluator.C6974Or(new Evaluator.Tag(m34698b.substring(2)), new Evaluator.TagEndsWith(m34698b.replace("*|", ":"))));
                return;
            } else {
                if (m34698b.contains("|")) {
                    m34698b = m34698b.replace("|", ":");
                }
                this.f69327c.add(new Evaluator.Tag(m34698b));
                return;
            }
        }
        if (this.f69325a.m34928i("[")) {
            TokenQueue tokenQueue2 = new TokenQueue(this.f69325a.m34920a('[', ']'));
            String[] strArr = f69322e;
            int i3 = tokenQueue2.f69172b;
            while (!tokenQueue2.m34926g() && !tokenQueue2.m34929j(strArr)) {
                tokenQueue2.f69172b++;
            }
            String substring = tokenQueue2.f69171a.substring(i3, tokenQueue2.f69172b);
            Validate.m34692e(substring);
            tokenQueue2.m34925f();
            if (tokenQueue2.m34926g()) {
                if (substring.startsWith("^")) {
                    this.f69327c.add(new Evaluator.AttributeStarting(substring.substring(1)));
                    return;
                } else {
                    this.f69327c.add(new Evaluator.Attribute(substring));
                    return;
                }
            }
            if (tokenQueue2.m34927h("=")) {
                this.f69327c.add(new Evaluator.AttributeWithValue(substring, tokenQueue2.m34931l()));
                return;
            }
            if (tokenQueue2.m34927h("!=")) {
                this.f69327c.add(new Evaluator.AttributeWithValueNot(substring, tokenQueue2.m34931l()));
                return;
            }
            if (tokenQueue2.m34927h("^=")) {
                this.f69327c.add(new Evaluator.AttributeWithValueStarting(substring, tokenQueue2.m34931l()));
                return;
            }
            if (tokenQueue2.m34927h("$=")) {
                this.f69327c.add(new Evaluator.AttributeWithValueEnding(substring, tokenQueue2.m34931l()));
                return;
            } else if (tokenQueue2.m34927h("*=")) {
                this.f69327c.add(new Evaluator.AttributeWithValueContaining(substring, tokenQueue2.m34931l()));
                return;
            } else {
                if (!tokenQueue2.m34927h("~=")) {
                    throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f69326b, tokenQueue2.m34931l());
                }
                this.f69327c.add(new Evaluator.AttributeWithValueMatching(substring, Pattern.compile(tokenQueue2.m34931l())));
                return;
            }
        }
        if (this.f69325a.m34927h("*")) {
            this.f69327c.add(new Evaluator.AllElements());
            return;
        }
        if (this.f69325a.m34927h(":lt(")) {
            this.f69327c.add(new Evaluator.IndexLessThan(m34970b()));
            return;
        }
        if (this.f69325a.m34927h(":gt(")) {
            this.f69327c.add(new Evaluator.IndexGreaterThan(m34970b()));
            return;
        }
        if (this.f69325a.m34927h(":eq(")) {
            this.f69327c.add(new Evaluator.IndexEquals(m34970b()));
            return;
        }
        if (this.f69325a.m34928i(":has(")) {
            this.f69325a.m34922c(":has");
            String m34920a = this.f69325a.m34920a('(', ')');
            Validate.m34693f(m34920a, ":has(selector) subselect must not be empty");
            this.f69327c.add(new StructuralEvaluator.Has(m34968j(m34920a)));
            return;
        }
        if (this.f69325a.m34928i(":contains(")) {
            m34971c(false);
            return;
        }
        if (this.f69325a.m34928i(":containsOwn(")) {
            m34971c(true);
            return;
        }
        if (this.f69325a.m34928i(":containsWholeText(")) {
            m34972d(false);
            return;
        }
        if (this.f69325a.m34928i(":containsWholeOwnText(")) {
            m34972d(true);
            return;
        }
        if (this.f69325a.m34928i(":containsData(")) {
            this.f69325a.m34922c(":containsData");
            String m34919m = TokenQueue.m34919m(this.f69325a.m34920a('(', ')'));
            Validate.m34693f(m34919m, ":containsData(text) query must not be empty");
            this.f69327c.add(new Evaluator.ContainsData(m34919m));
            return;
        }
        if (this.f69325a.m34928i(":matches(")) {
            m34975g(false);
            return;
        }
        if (this.f69325a.m34928i(":matchesOwn(")) {
            m34975g(true);
            return;
        }
        if (this.f69325a.m34928i(":matchesWholeText(")) {
            m34976h(false);
            return;
        }
        if (this.f69325a.m34928i(":matchesWholeOwnText(")) {
            m34976h(true);
            return;
        }
        if (this.f69325a.m34928i(":not(")) {
            this.f69325a.m34922c(":not");
            String m34920a2 = this.f69325a.m34920a('(', ')');
            Validate.m34693f(m34920a2, ":not(selector) subselect must not be empty");
            this.f69327c.add(new StructuralEvaluator.Not(m34968j(m34920a2)));
            return;
        }
        if (this.f69325a.m34927h(":nth-child(")) {
            m34973e(false, false);
            return;
        }
        if (this.f69325a.m34927h(":nth-last-child(")) {
            m34973e(true, false);
            return;
        }
        if (this.f69325a.m34927h(":nth-of-type(")) {
            m34973e(false, true);
            return;
        }
        if (this.f69325a.m34927h(":nth-last-of-type(")) {
            m34973e(true, true);
            return;
        }
        if (this.f69325a.m34927h(":first-child")) {
            this.f69327c.add(new Evaluator.IsFirstChild());
            return;
        }
        if (this.f69325a.m34927h(":last-child")) {
            this.f69327c.add(new Evaluator.IsLastChild());
            return;
        }
        if (this.f69325a.m34927h(":first-of-type")) {
            this.f69327c.add(new Evaluator.IsFirstOfType());
            return;
        }
        if (this.f69325a.m34927h(":last-of-type")) {
            this.f69327c.add(new Evaluator.IsLastOfType());
            return;
        }
        if (this.f69325a.m34927h(":only-child")) {
            this.f69327c.add(new Evaluator.IsOnlyChild());
            return;
        }
        if (this.f69325a.m34927h(":only-of-type")) {
            this.f69327c.add(new Evaluator.IsOnlyOfType());
            return;
        }
        if (this.f69325a.m34927h(":empty")) {
            this.f69327c.add(new Evaluator.IsEmpty());
        } else if (this.f69325a.m34927h(":root")) {
            this.f69327c.add(new Evaluator.IsRoot());
        } else {
            if (!this.f69325a.m34927h(":matchText")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f69326b, this.f69325a.m34931l());
            }
            this.f69327c.add(new Evaluator.MatchText());
        }
    }

    /* renamed from: g */
    public final void m34975g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.f69325a.m34922c(str);
        String m34920a = this.f69325a.m34920a('(', ')');
        Validate.m34693f(m34920a, str + "(regex) query must not be empty");
        this.f69327c.add(z ? new Evaluator.MatchesOwn(Pattern.compile(m34920a)) : new Evaluator.Matches(Pattern.compile(m34920a)));
    }

    /* renamed from: h */
    public final void m34976h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.f69325a.m34922c(str);
        String m34920a = this.f69325a.m34920a('(', ')');
        Validate.m34693f(m34920a, str + "(regex) query must not be empty");
        this.f69327c.add(z ? new Evaluator.MatchesWholeOwnText(Pattern.compile(m34920a)) : new Evaluator.MatchesWholeText(Pattern.compile(m34920a)));
    }

    /* renamed from: i */
    public Evaluator m34977i() {
        this.f69325a.m34925f();
        if (this.f69325a.m34929j(f69321d)) {
            this.f69327c.add(new StructuralEvaluator.Root());
            m34969a(this.f69325a.m34921b());
        } else {
            m34974f();
        }
        while (!this.f69325a.m34926g()) {
            boolean m34925f = this.f69325a.m34925f();
            if (this.f69325a.m34929j(f69321d)) {
                m34969a(this.f69325a.m34921b());
            } else if (m34925f) {
                m34969a(' ');
            } else {
                m34974f();
            }
        }
        return this.f69327c.size() == 1 ? this.f69327c.get(0) : new CombiningEvaluator.And(this.f69327c);
    }

    public String toString() {
        return this.f69326b;
    }
}
