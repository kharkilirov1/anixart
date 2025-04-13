package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class HtmlTreeBuilder extends TreeBuilder {

    /* renamed from: l */
    public HtmlTreeBuilderState f69038l;

    /* renamed from: m */
    public HtmlTreeBuilderState f69039m;

    /* renamed from: n */
    public boolean f69040n;

    /* renamed from: o */
    @Nullable
    public Element f69041o;

    /* renamed from: p */
    @Nullable
    public FormElement f69042p;

    /* renamed from: q */
    public ArrayList<Element> f69043q;

    /* renamed from: r */
    public ArrayList<HtmlTreeBuilderState> f69044r;

    /* renamed from: s */
    public List<String> f69045s;

    /* renamed from: t */
    public Token.EndTag f69046t;

    /* renamed from: u */
    public boolean f69047u;

    /* renamed from: v */
    public boolean f69048v;

    /* renamed from: w */
    public String[] f69049w = {null};

    /* renamed from: x */
    public static final String[] f69035x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: y */
    public static final String[] f69036y = {"ol", "ul"};

    /* renamed from: z */
    public static final String[] f69037z = {"button"};

    /* renamed from: A */
    public static final String[] f69030A = {"html", "table"};

    /* renamed from: B */
    public static final String[] f69031B = {"optgroup", "option"};

    /* renamed from: C */
    public static final String[] f69032C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* renamed from: D */
    public static final String[] f69033D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* renamed from: E */
    public static final String[] f69034E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* renamed from: J */
    public static boolean m34831J(ArrayList<Element> arrayList, Element element) {
        int size = arrayList.size() - 1;
        int i2 = size >= 256 ? size - 256 : 0;
        while (size >= i2) {
            if (arrayList.get(size) == element) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* renamed from: A */
    public Element m34832A(Token.StartTag startTag) {
        if (startTag.m34914q()) {
            Attributes attributes = startTag.f69163n;
            if (!(attributes.f68952b == 0) && attributes.m34722g(this.f69274h) > 0) {
                Object[] objArr = {startTag.f69154e};
                ParseErrorList parseErrorList = this.f69267a.f69123b;
                if (parseErrorList.m34885b()) {
                    parseErrorList.add(new ParseError(this.f69268b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        if (!startTag.f69162m) {
            Tag m34957i = m34957i(startTag.m34915r(), this.f69274h);
            ParseSettings parseSettings = this.f69274h;
            Attributes attributes2 = startTag.f69163n;
            parseSettings.m34887b(attributes2);
            Element element = new Element(m34957i, null, attributes2);
            m34839H(element, startTag);
            this.f69271e.add(element);
            return element;
        }
        Element m34835D = m34835D(startTag);
        this.f69271e.add(m34835D);
        this.f69269c.m34944m(TokeniserState.Data);
        Tokeniser tokeniser = this.f69269c;
        Token.EndTag endTag = this.f69046t;
        endTag.mo34900g();
        endTag.m34916s(m34835D.f68981e.f69132b);
        tokeniser.m34939h(endTag);
        return m34835D;
    }

    /* renamed from: B */
    public void m34833B(Token.Character character) {
        Node dataNode;
        Element m34952a = m34952a();
        String str = m34952a.f68981e.f69133c;
        String str2 = character.f69144d;
        if (character instanceof Token.CData) {
            dataNode = new CDataNode(str2);
        } else {
            dataNode = str.equals("script") || str.equals("style") ? new DataNode(str2) : new TextNode(str2);
        }
        m34952a.m34753F(dataNode);
    }

    /* renamed from: C */
    public void m34834C(Token.Comment comment) {
        m34839H(new Comment(comment.m34903k()), comment);
    }

    /* renamed from: D */
    public Element m34835D(Token.StartTag startTag) {
        Tag m34957i = m34957i(startTag.m34915r(), this.f69274h);
        ParseSettings parseSettings = this.f69274h;
        Attributes attributes = startTag.f69163n;
        parseSettings.m34887b(attributes);
        Element element = new Element(m34957i, null, attributes);
        m34839H(element, startTag);
        if (startTag.f69162m) {
            if (!((HashMap) Tag.f69125k).containsKey(m34957i.f69132b)) {
                m34957i.f69137g = true;
            } else if (!m34957i.f69136f) {
                Tokeniser tokeniser = this.f69269c;
                Object[] objArr = {m34957i.f69133c};
                if (tokeniser.f69176b.m34885b()) {
                    tokeniser.f69176b.add(new ParseError(tokeniser.f69175a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
        }
        return element;
    }

    /* renamed from: E */
    public FormElement m34836E(Token.StartTag startTag, boolean z, boolean z2) {
        Tag m34957i = m34957i(startTag.m34915r(), this.f69274h);
        ParseSettings parseSettings = this.f69274h;
        Attributes attributes = startTag.f69163n;
        parseSettings.m34887b(attributes);
        FormElement formElement = new FormElement(m34957i, null, attributes);
        if (z2) {
            if (!(m34866u("template") != null)) {
                this.f69042p = formElement;
            }
        } else {
            this.f69042p = formElement;
        }
        m34839H(formElement, startTag);
        if (z) {
            this.f69271e.add(formElement);
        }
        return formElement;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m34837F(org.jsoup.nodes.Node r6) {
        /*
            r5 = this;
            java.lang.String r0 = "table"
            org.jsoup.nodes.Element r0 = r5.m34866u(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            org.jsoup.nodes.Node r3 = r0.f69005b
            r4 = r3
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            if (r4 == 0) goto L15
            org.jsoup.nodes.Element r3 = (org.jsoup.nodes.Element) r3
            r4 = 1
            goto L23
        L15:
            org.jsoup.nodes.Element r3 = r5.m34855j(r0)
            goto L22
        L1a:
            java.util.ArrayList<org.jsoup.nodes.Element> r3 = r5.f69271e
            java.lang.Object r3 = r3.get(r2)
            org.jsoup.nodes.Element r3 = (org.jsoup.nodes.Element) r3
        L22:
            r4 = 0
        L23:
            if (r4 == 0) goto L3c
            org.jsoup.helper.Validate.m34694g(r0)
            org.jsoup.helper.Validate.m34694g(r6)
            org.jsoup.nodes.Node r3 = r0.f69005b
            org.jsoup.helper.Validate.m34694g(r3)
            org.jsoup.nodes.Node r3 = r0.f69005b
            int r0 = r0.f69006c
            org.jsoup.nodes.Node[] r1 = new org.jsoup.nodes.Node[r1]
            r1[r2] = r6
            r3.m34786b(r0, r1)
            goto L3f
        L3c:
            r3.m34753F(r6)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.m34837F(org.jsoup.nodes.Node):void");
    }

    /* renamed from: G */
    public void m34838G() {
        this.f69043q.add(null);
    }

    /* renamed from: H */
    public final void m34839H(Node node, @Nullable Token token) {
        FormElement formElement;
        if (this.f69271e.isEmpty()) {
            this.f69270d.m34753F(node);
        } else if (this.f69048v && StringUtil.m34701c(m34952a().f68981e.f69133c, HtmlTreeBuilderState.Constants.f69077A)) {
            m34837F(node);
        } else {
            m34952a().m34753F(node);
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            if (!element.f68981e.f69139i || (formElement = this.f69042p) == null) {
                return;
            }
            formElement.f69002k.add(element);
        }
    }

    /* renamed from: I */
    public boolean m34840I(Element element) {
        return StringUtil.m34701c(element.f68981e.f69133c, f69034E);
    }

    /* renamed from: K */
    public boolean m34841K(Element element) {
        return m34831J(this.f69271e, element);
    }

    /* renamed from: L */
    public Element m34842L() {
        return this.f69271e.remove(this.f69271e.size() - 1);
    }

    @Nullable
    /* renamed from: M */
    public Element m34843M(String str) {
        for (int size = this.f69271e.size() - 1; size >= 0; size--) {
            Element element = this.f69271e.get(size);
            this.f69271e.remove(size);
            if (element.f68981e.f69133c.equals(str)) {
                boolean z = this.f69273g instanceof Token.EndTag;
                return element;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: N */
    public HtmlTreeBuilderState m34844N() {
        if (this.f69044r.size() <= 0) {
            return null;
        }
        return this.f69044r.remove(r0.size() - 1);
    }

    /* renamed from: O */
    public int m34845O(Element element) {
        for (int i2 = 0; i2 < this.f69043q.size(); i2++) {
            if (element == this.f69043q.get(i2)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public boolean m34846P(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f69273g = token;
        return htmlTreeBuilderState.mo34874c(token, this);
    }

    /* renamed from: Q */
    public void m34847Q() {
        Element element;
        HtmlTreeBuilder htmlTreeBuilder;
        if (this.f69271e.size() > 256) {
            return;
        }
        if (this.f69043q.size() > 0) {
            element = this.f69043q.get(r0.size() - 1);
        } else {
            element = null;
        }
        if (element == null || m34831J(this.f69271e, element)) {
            return;
        }
        int size = this.f69043q.size();
        int i2 = size - 12;
        if (i2 < 0) {
            i2 = 0;
        }
        boolean z = true;
        int i3 = size - 1;
        int i4 = i3;
        while (i4 != i2) {
            i4--;
            element = this.f69043q.get(i4);
            if (element == null || m34831J(this.f69271e, element)) {
                htmlTreeBuilder = this;
                z = false;
                break;
            }
        }
        htmlTreeBuilder = this;
        while (true) {
            if (!z) {
                i4++;
                element = htmlTreeBuilder.f69043q.get(i4);
            }
            Validate.m34694g(element);
            Element element2 = new Element(htmlTreeBuilder.m34957i(element.f68981e.f69133c, htmlTreeBuilder.f69274h), null, element.mo34767e().clone());
            htmlTreeBuilder.m34839H(element2, null);
            htmlTreeBuilder.f69271e.add(element2);
            htmlTreeBuilder.f69043q.set(i4, element2);
            if (i4 == i3) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* renamed from: R */
    public void m34848R(Element element) {
        int size = this.f69043q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f69043q.get(size) != element);
        this.f69043q.remove(size);
    }

    /* renamed from: S */
    public boolean m34849S(Element element) {
        for (int size = this.f69271e.size() - 1; size >= 0; size--) {
            if (this.f69271e.get(size) == element) {
                this.f69271e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public void m34850T() {
        if (!(m34866u("body") != null)) {
            this.f69271e.add(this.f69270d.m34740Y());
        }
        this.f69038l = HtmlTreeBuilderState.InBody;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: U */
    public boolean m34851U() {
        char c2;
        HtmlTreeBuilderState htmlTreeBuilderState;
        int size = this.f69271e.size() - 1;
        int i2 = size >= 256 ? size - 256 : 0;
        HtmlTreeBuilderState htmlTreeBuilderState2 = this.f69038l;
        if (this.f69271e.size() == 0) {
            this.f69038l = HtmlTreeBuilderState.InBody;
        }
        boolean z = false;
        while (true) {
            if (size >= i2) {
                Element element = this.f69271e.get(size);
                if (size == i2) {
                    z = true;
                }
                String str = element != null ? element.f68981e.f69133c : "";
                Objects.requireNonNull(str);
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1321546630:
                        if (str.equals("template")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -906021636:
                        if (str.equals("select")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -636197633:
                        if (str.equals("colgroup")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3696:
                        if (str.equals("td")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3700:
                        if (str.equals("th")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3710:
                        if (str.equals("tr")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3198432:
                        if (str.equals("head")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110115790:
                        if (str.equals("table")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        this.f69038l = HtmlTreeBuilderState.InFrameset;
                        break;
                    case 1:
                        if (this.f69044r.size() > 0) {
                            htmlTreeBuilderState = this.f69044r.get(r0.size() - 1);
                        } else {
                            htmlTreeBuilderState = null;
                        }
                        Validate.m34695h(htmlTreeBuilderState, "Bug: no template insertion mode on stack!");
                        this.f69038l = htmlTreeBuilderState;
                        break;
                    case 2:
                        this.f69038l = HtmlTreeBuilderState.InSelect;
                        break;
                    case 3:
                        this.f69038l = HtmlTreeBuilderState.InColumnGroup;
                        break;
                    case 4:
                    case 5:
                        if (!z) {
                            this.f69038l = HtmlTreeBuilderState.InCell;
                            break;
                        }
                        break;
                    case 6:
                        this.f69038l = HtmlTreeBuilderState.InRow;
                        break;
                    case 7:
                        this.f69038l = HtmlTreeBuilderState.InBody;
                        break;
                    case '\b':
                        if (!z) {
                            this.f69038l = HtmlTreeBuilderState.InHead;
                            break;
                        }
                        break;
                    case '\t':
                        this.f69038l = this.f69041o == null ? HtmlTreeBuilderState.BeforeHead : HtmlTreeBuilderState.AfterHead;
                        break;
                    case '\n':
                        this.f69038l = HtmlTreeBuilderState.InTable;
                        break;
                    case 11:
                    case '\f':
                    case '\r':
                        this.f69038l = HtmlTreeBuilderState.InTableBody;
                        break;
                    case 14:
                        this.f69038l = HtmlTreeBuilderState.InCaption;
                        break;
                }
                if (z) {
                    this.f69038l = HtmlTreeBuilderState.InBody;
                } else {
                    size--;
                }
            }
        }
        return this.f69038l != htmlTreeBuilderState2;
    }

    @Override // org.jsoup.parser.TreeBuilder
    /* renamed from: c */
    public ParseSettings mo34852c() {
        return ParseSettings.f69118c;
    }

    @Override // org.jsoup.parser.TreeBuilder
    @ParametersAreNonnullByDefault
    /* renamed from: d */
    public void mo34853d(Reader reader, String str, Parser parser) {
        super.mo34853d(reader, str, parser);
        this.f69038l = HtmlTreeBuilderState.Initial;
        this.f69039m = null;
        this.f69040n = false;
        this.f69041o = null;
        this.f69042p = null;
        this.f69043q = new ArrayList<>();
        this.f69044r = new ArrayList<>();
        this.f69045s = new ArrayList();
        this.f69046t = new Token.EndTag();
        this.f69047u = true;
        this.f69048v = false;
    }

    @Override // org.jsoup.parser.TreeBuilder
    /* renamed from: f */
    public boolean mo34854f(Token token) {
        this.f69273g = token;
        return this.f69038l.mo34874c(token, this);
    }

    @Nullable
    /* renamed from: j */
    public Element m34855j(Element element) {
        for (int size = this.f69271e.size() - 1; size >= 0; size--) {
            if (this.f69271e.get(size) == element) {
                return this.f69271e.get(size - 1);
            }
        }
        return null;
    }

    /* renamed from: k */
    public void m34856k(Element element) {
        int size = this.f69043q.size() - 1;
        int i2 = size - 12;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = 0;
        while (size >= i2) {
            Element element2 = this.f69043q.get(size);
            if (element2 == null) {
                return;
            }
            if (element.f68981e.f69133c.equals(element2.f68981e.f69133c) && element.mo34767e().equals(element2.mo34767e())) {
                i3++;
            }
            if (i3 == 3) {
                this.f69043q.remove(size);
                return;
            }
            size--;
        }
    }

    /* renamed from: l */
    public void m34857l() {
        while (!this.f69043q.isEmpty()) {
            int size = this.f69043q.size();
            if ((size > 0 ? this.f69043q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* renamed from: m */
    public final void m34858m(String... strArr) {
        for (int size = this.f69271e.size() - 1; size >= 0; size--) {
            Element element = this.f69271e.get(size);
            String str = element.f68981e.f69133c;
            String[] strArr2 = StringUtil.f68937a;
            int length = strArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(str)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z || element.f68981e.f69133c.equals("html")) {
                return;
            }
            this.f69271e.remove(size);
        }
    }

    /* renamed from: n */
    public void m34859n() {
        m34858m("tbody", "tfoot", "thead", "template");
    }

    /* renamed from: o */
    public void m34860o() {
        m34858m("table", "template");
    }

    /* renamed from: p */
    public void m34861p() {
        m34858m("tr", "template");
    }

    /* renamed from: q */
    public void m34862q(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.f69267a.f69123b.m34885b()) {
            this.f69267a.f69123b.add(new ParseError(this.f69268b, "Unexpected %s token [%s] when in state [%s]", this.f69273g.getClass().getSimpleName(), this.f69273g, htmlTreeBuilderState));
        }
    }

    /* renamed from: r */
    public void m34863r(String str) {
        while (StringUtil.m34701c(m34952a().f68981e.f69133c, f69032C)) {
            if (str != null && m34953b(str)) {
                return;
            } else {
                m34842L();
            }
        }
    }

    /* renamed from: s */
    public void m34864s(boolean z) {
        String[] strArr = z ? f69033D : f69032C;
        while (StringUtil.m34701c(m34952a().f68981e.f69133c, strArr)) {
            m34842L();
        }
    }

    /* renamed from: t */
    public Element m34865t(String str) {
        for (int size = this.f69043q.size() - 1; size >= 0; size--) {
            Element element = this.f69043q.get(size);
            if (element == null) {
                return null;
            }
            if (element.f68981e.f69133c.equals(str)) {
                return element;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("TreeBuilder{currentToken=");
        m24u.append(this.f69273g);
        m24u.append(", state=");
        m24u.append(this.f69038l);
        m24u.append(", currentElement=");
        m24u.append(m34952a());
        m24u.append('}');
        return m24u.toString();
    }

    @Nullable
    /* renamed from: u */
    public Element m34866u(String str) {
        int size = this.f69271e.size() - 1;
        int i2 = size >= 256 ? size - 256 : 0;
        while (size >= i2) {
            Element element = this.f69271e.get(size);
            if (element.f68981e.f69133c.equals(str)) {
                return element;
            }
            size--;
        }
        return null;
    }

    /* renamed from: v */
    public boolean m34867v(String str) {
        String[] strArr = f69037z;
        String[] strArr2 = f69035x;
        String[] strArr3 = this.f69049w;
        strArr3[0] = str;
        return m34870y(strArr3, strArr2, strArr);
    }

    /* renamed from: w */
    public boolean m34868w(String str) {
        String[] strArr = f69035x;
        String[] strArr2 = this.f69049w;
        strArr2[0] = str;
        return m34870y(strArr2, strArr, null);
    }

    /* renamed from: x */
    public boolean m34869x(String str) {
        for (int size = this.f69271e.size() - 1; size >= 0; size--) {
            String str2 = this.f69271e.get(size).f68981e.f69133c;
            if (str2.equals(str)) {
                return true;
            }
            if (!StringUtil.m34701c(str2, f69031B)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }

    /* renamed from: y */
    public final boolean m34870y(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f69271e.size() - 1;
        int i2 = size > 100 ? size - 100 : 0;
        while (size >= i2) {
            String str = this.f69271e.get(size).f68981e.f69133c;
            if (StringUtil.m34701c(str, strArr)) {
                return true;
            }
            if (StringUtil.m34701c(str, strArr2)) {
                return false;
            }
            if (strArr3 != null && StringUtil.m34701c(str, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m34871z(String str) {
        String[] strArr = f69030A;
        String[] strArr2 = this.f69049w;
        strArr2[0] = str;
        return m34870y(strArr2, strArr, null);
    }
}
