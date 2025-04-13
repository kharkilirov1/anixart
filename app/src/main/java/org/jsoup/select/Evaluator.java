package org.jsoup.select;

import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;

/* loaded from: classes3.dex */
public abstract class Evaluator {

    public static final class AllElements extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class Attribute extends Evaluator {

        /* renamed from: a */
        public final String f69293a;

        public Attribute(String str) {
            this.f69293a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.mo34785n(this.f69293a);
        }

        public String toString() {
            return String.format("[%s]", this.f69293a);
        }
    }

    public static abstract class AttributeKeyPair extends Evaluator {

        /* renamed from: a */
        public String f69294a;

        /* renamed from: b */
        public String f69295b;

        public AttributeKeyPair(String str, String str2, boolean z) {
            Validate.m34692e(str);
            Validate.m34692e(str2);
            this.f69294a = Normalizer.m34698b(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.f69295b = z ? Normalizer.m34698b(str2) : z2 ? Normalizer.m34697a(str2) : Normalizer.m34698b(str2);
        }
    }

    public static final class AttributeStarting extends Evaluator {

        /* renamed from: a */
        public final String f69296a;

        public AttributeStarting(String str) {
            Validate.m34692e(str);
            this.f69296a = Normalizer.m34697a(str);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Attributes mo34767e = element2.mo34767e();
            Objects.requireNonNull(mo34767e);
            ArrayList arrayList = new ArrayList(mo34767e.f68952b);
            for (int i2 = 0; i2 < mo34767e.f68952b; i2++) {
                if (!mo34767e.m34714E(mo34767e.f68953c[i2])) {
                    arrayList.add(new org.jsoup.nodes.Attribute(mo34767e.f68953c[i2], (String) mo34767e.f68954d[i2], mo34767e));
                }
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (it.hasNext()) {
                if (Normalizer.m34697a(((org.jsoup.nodes.Attribute) it.next()).f68949b).startsWith(this.f69296a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.f69296a);
        }
    }

    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2, true);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.mo34785n(this.f69294a) && this.f69295b.equalsIgnoreCase(element2.mo34783c(this.f69294a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.f69294a, this.f69295b);
        }
    }

    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2, true);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.mo34785n(this.f69294a) && Normalizer.m34697a(element2.mo34783c(this.f69294a)).contains(this.f69295b);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f69294a, this.f69295b);
        }
    }

    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.mo34785n(this.f69294a) && Normalizer.m34697a(element2.mo34783c(this.f69294a)).endsWith(this.f69295b);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f69294a, this.f69295b);
        }
    }

    public static final class AttributeWithValueMatching extends Evaluator {

        /* renamed from: a */
        public String f69297a;

        /* renamed from: b */
        public Pattern f69298b;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.f69297a = Normalizer.m34698b(str);
            this.f69298b = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.mo34785n(this.f69297a) && this.f69298b.matcher(element2.mo34783c(this.f69297a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f69297a, this.f69298b.toString());
        }
    }

    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2, true);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return !this.f69295b.equalsIgnoreCase(element2.mo34783c(this.f69294a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f69294a, this.f69295b);
        }
    }

    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.mo34785n(this.f69294a) && Normalizer.m34697a(element2.mo34783c(this.f69294a)).startsWith(this.f69295b);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f69294a, this.f69295b);
        }
    }

    public static final class Class extends Evaluator {

        /* renamed from: a */
        public final String f69299a;

        public Class(String str) {
            this.f69299a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.m34760P(this.f69299a);
        }

        public String toString() {
            return String.format(".%s", this.f69299a);
        }
    }

    public static final class ContainsData extends Evaluator {

        /* renamed from: a */
        public final String f69300a;

        public ContainsData(String str) {
            this.f69300a = Normalizer.m34697a(str);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return Normalizer.m34697a(element2.m34757M()).contains(this.f69300a);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.f69300a);
        }
    }

    public static final class ContainsOwnText extends Evaluator {

        /* renamed from: a */
        public final String f69301a;

        public ContainsOwnText(String str) {
            StringBuilder m34700b = StringUtil.m34700b();
            StringUtil.m34699a(m34700b, str, false);
            this.f69301a = Normalizer.m34697a(StringUtil.m34705g(m34700b));
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return Normalizer.m34697a(element2.m34761R()).contains(this.f69301a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.f69301a);
        }
    }

    public static final class ContainsText extends Evaluator {

        /* renamed from: a */
        public final String f69302a;

        public ContainsText(String str) {
            StringBuilder m34700b = StringUtil.m34700b();
            StringUtil.m34699a(m34700b, str, false);
            this.f69302a = Normalizer.m34697a(StringUtil.m34705g(m34700b));
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return Normalizer.m34697a(element2.m34765W()).contains(this.f69302a);
        }

        public String toString() {
            return String.format(":contains(%s)", this.f69302a);
        }
    }

    public static final class ContainsWholeOwnText extends Evaluator {

        /* renamed from: a */
        public final String f69303a;

        public ContainsWholeOwnText(String str) {
            this.f69303a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.m34766X().contains(this.f69303a);
        }

        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.f69303a);
        }
    }

    public static final class ContainsWholeText extends Evaluator {

        /* renamed from: a */
        public final String f69304a;

        public ContainsWholeText(String str) {
            this.f69304a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Objects.requireNonNull(element2);
            StringBuilder m34700b = StringUtil.m34700b();
            NodeTraversor.m34967a(new C2722a(m34700b, 9), element2);
            return StringUtil.m34705g(m34700b).contains(this.f69304a);
        }

        public String toString() {
            return String.format(":containsWholeText(%s)", this.f69304a);
        }
    }

    public static abstract class CssNthEvaluator extends Evaluator {

        /* renamed from: a */
        public final int f69305a;

        /* renamed from: b */
        public final int f69306b;

        public CssNthEvaluator(int i2, int i3) {
            this.f69305a = i2;
            this.f69306b = i3;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            if (element3 == null || (element3 instanceof Document)) {
                return false;
            }
            int mo34965b = mo34965b(element, element2);
            int i2 = this.f69305a;
            if (i2 == 0) {
                return mo34965b == this.f69306b;
            }
            int i3 = this.f69306b;
            return (mo34965b - i3) * i2 >= 0 && (mo34965b - i3) % i2 == 0;
        }

        /* renamed from: b */
        public abstract int mo34965b(Element element, Element element2);

        /* renamed from: c */
        public abstract String mo34966c();

        public String toString() {
            return this.f69305a == 0 ? String.format(":%s(%d)", mo34966c(), Integer.valueOf(this.f69306b)) : this.f69306b == 0 ? String.format(":%s(%dn)", mo34966c(), Integer.valueOf(this.f69305a)) : String.format(":%s(%dn%+d)", mo34966c(), Integer.valueOf(this.f69305a), Integer.valueOf(this.f69306b));
        }
    }

    /* renamed from: org.jsoup.select.Evaluator$Id */
    public static final class C6975Id extends Evaluator {

        /* renamed from: a */
        public final String f69307a;

        public C6975Id(String str) {
            this.f69307a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            String str = this.f69307a;
            Attributes attributes = element2.f68984h;
            return str.equals(attributes != null ? attributes.m34724s("id") : "");
        }

        public String toString() {
            return String.format("#%s", this.f69307a);
        }
    }

    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i2) {
            super(i2);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.m34759O() == this.f69308a;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f69308a));
        }
    }

    public static abstract class IndexEvaluator extends Evaluator {

        /* renamed from: a */
        public int f69308a;

        public IndexEvaluator(int i2) {
            this.f69308a = i2;
        }
    }

    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i2) {
            super(i2);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.m34759O() > this.f69308a;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f69308a));
        }
    }

    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i2) {
            super(i2);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element != element2 && element2.m34759O() < this.f69308a;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f69308a));
        }
    }

    public static final class IsEmpty extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            for (Node node : element2.m34788i()) {
                if (!(node instanceof Comment) && !(node instanceof XmlDeclaration) && !(node instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class IsFirstChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            return (element3 == null || (element3 instanceof Document) || element2.m34759O() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class IsLastChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            return (element3 == null || (element3 instanceof Document) || element2.m34759O() != element3.m34756K().size() - 1) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i2, int i3) {
            super(i2, i3);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: b */
        public int mo34965b(Element element, Element element2) {
            return element2.m34759O() + 1;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: c */
        public String mo34966c() {
            return "nth-child";
        }
    }

    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i2, int i3) {
            super(i2, i3);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: b */
        public int mo34965b(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            if (element3 == null) {
                return 0;
            }
            return element3.m34756K().size() - element2.m34759O();
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: c */
        public String mo34966c() {
            return "nth-last-child";
        }
    }

    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i2, int i3) {
            super(i2, i3);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: b */
        public int mo34965b(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            int i2 = 0;
            if (element3 == null) {
                return 0;
            }
            Elements m34756K = element3.m34756K();
            for (int m34759O = element2.m34759O(); m34759O < m34756K.size(); m34759O++) {
                if (m34756K.get(m34759O).f68981e.equals(element2.f68981e)) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: c */
        public String mo34966c() {
            return "nth-last-of-type";
        }
    }

    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i2, int i3) {
            super(i2, i3);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: b */
        public int mo34965b(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            int i2 = 0;
            if (element3 == null) {
                return 0;
            }
            Iterator<Element> it = element3.m34756K().iterator();
            while (it.hasNext()) {
                Element next = it.next();
                if (next.f68981e.equals(element2.f68981e)) {
                    i2++;
                }
                if (next == element2) {
                    break;
                }
            }
            return i2;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        /* renamed from: c */
        public String mo34966c() {
            return "nth-of-type";
        }
    }

    public static final class IsOnlyChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Elements elements;
            Node node = element2.f69005b;
            Element element3 = (Element) node;
            if (element3 == null || (element3 instanceof Document)) {
                return false;
            }
            if (node == null) {
                elements = new Elements(0);
            } else {
                List<Element> m34755J = ((Element) node).m34755J();
                Elements elements2 = new Elements(m34755J.size() - 1);
                for (Element element4 : m34755J) {
                    if (element4 != element2) {
                        elements2.add(element4);
                    }
                }
                elements = elements2;
            }
            return elements.isEmpty();
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class IsOnlyOfType extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Element element3 = (Element) element2.f69005b;
            if (element3 == null || (element3 instanceof Document)) {
                return false;
            }
            Iterator<Element> it = element3.m34756K().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().f68981e.equals(element2.f68981e)) {
                    i2++;
                }
            }
            return i2 == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class IsRoot extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.m34755J().get(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class MatchText extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            if (element2 instanceof PseudoTextElement) {
                return true;
            }
            Objects.requireNonNull(element2);
            ArrayList arrayList = new ArrayList();
            for (Node node : element2.f68983g) {
                if (node instanceof TextNode) {
                    arrayList.add((TextNode) node);
                }
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                TextNode textNode = (TextNode) it.next();
                PseudoTextElement pseudoTextElement = new PseudoTextElement(org.jsoup.parser.Tag.m34892a(element2.f68981e.f69132b, ParseSettings.f69119d), element2.mo34768f(), element2.mo34767e());
                Objects.requireNonNull(textNode);
                Validate.m34694g(textNode.f69005b);
                Node node2 = textNode.f69005b;
                Objects.requireNonNull(node2);
                Validate.m34690c(textNode.f69005b == node2);
                Node node3 = pseudoTextElement.f69005b;
                if (node3 != null) {
                    node3.mo34778D(pseudoTextElement);
                }
                int i2 = textNode.f69006c;
                node2.mo34772m().set(i2, pseudoTextElement);
                pseudoTextElement.f69005b = node2;
                pseudoTextElement.f69006c = i2;
                textNode.f69005b = null;
                pseudoTextElement.m34753F(textNode);
            }
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static final class Matches extends Evaluator {

        /* renamed from: a */
        public final Pattern f69309a;

        public Matches(Pattern pattern) {
            this.f69309a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return this.f69309a.matcher(element2.m34765W()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.f69309a);
        }
    }

    public static final class MatchesOwn extends Evaluator {

        /* renamed from: a */
        public final Pattern f69310a;

        public MatchesOwn(Pattern pattern) {
            this.f69310a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return this.f69310a.matcher(element2.m34761R()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f69310a);
        }
    }

    public static final class MatchesWholeOwnText extends Evaluator {

        /* renamed from: a */
        public final Pattern f69311a;

        public MatchesWholeOwnText(Pattern pattern) {
            this.f69311a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return this.f69311a.matcher(element2.m34766X()).find();
        }

        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.f69311a);
        }
    }

    public static final class MatchesWholeText extends Evaluator {

        /* renamed from: a */
        public final Pattern f69312a;

        public MatchesWholeText(Pattern pattern) {
            this.f69312a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Pattern pattern = this.f69312a;
            Objects.requireNonNull(element2);
            StringBuilder m34700b = StringUtil.m34700b();
            NodeTraversor.m34967a(new C2722a(m34700b, 9), element2);
            return pattern.matcher(StringUtil.m34705g(m34700b)).find();
        }

        public String toString() {
            return String.format(":matchesWholeText(%s)", this.f69312a);
        }
    }

    public static final class Tag extends Evaluator {

        /* renamed from: a */
        public final String f69313a;

        public Tag(String str) {
            this.f69313a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.f68981e.f69133c.equals(this.f69313a);
        }

        public String toString() {
            return String.format("%s", this.f69313a);
        }
    }

    public static final class TagEndsWith extends Evaluator {

        /* renamed from: a */
        public final String f69314a;

        public TagEndsWith(String str) {
            this.f69314a = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element2.f68981e.f69133c.endsWith(this.f69314a);
        }

        public String toString() {
            return String.format("%s", this.f69314a);
        }
    }

    /* renamed from: a */
    public abstract boolean mo34962a(Element element, Element element2);
}
