package org.jsoup.nodes;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.NonnullByDefault;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

@NonnullByDefault
/* loaded from: classes3.dex */
public class Element extends Node {

    /* renamed from: i */
    public static final List<Element> f68979i = Collections.emptyList();

    /* renamed from: j */
    public static final String f68980j;

    /* renamed from: e */
    public Tag f68981e;

    /* renamed from: f */
    @Nullable
    public WeakReference<List<Element>> f68982f;

    /* renamed from: g */
    public List<Node> f68983g;

    /* renamed from: h */
    @Nullable
    public Attributes f68984h;

    public static final class NodeList extends ChangeNotifyingArrayList<Node> {

        /* renamed from: b */
        public final Element f68986b;

        public NodeList(Element element, int i2) {
            super(i2);
            this.f68986b = element;
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        /* renamed from: b */
        public void mo34666b() {
            this.f68986b.f68982f = null;
        }
    }

    static {
        Pattern.compile("\\s+");
        f68980j = Attributes.m34712D("baseUri");
    }

    public Element(Tag tag, @Nullable String str, @Nullable Attributes attributes) {
        Validate.m34694g(tag);
        this.f68983g = Node.f69004d;
        this.f68984h = attributes;
        this.f68981e = tag;
        if (str != null) {
            mo34767e().m34715F(f68980j, str);
        }
    }

    /* renamed from: H */
    public static void m34748H(StringBuilder sb, TextNode textNode) {
        String m34780F = textNode.m34780F();
        if (m34751T(textNode.f69005b) || (textNode instanceof CDataNode)) {
            sb.append(m34780F);
        } else {
            StringUtil.m34699a(sb, m34780F, TextNode.m34796K(sb));
        }
    }

    /* renamed from: I */
    public static void m34749I(Node node, StringBuilder sb) {
        if (node instanceof TextNode) {
            sb.append(((TextNode) node).m34780F());
        } else if ((node instanceof Element) && ((Element) node).f68981e.f69133c.equals("br")) {
            sb.append("\n");
        }
    }

    /* renamed from: Q */
    public static <E extends Element> int m34750Q(Element element, List<E> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == element) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: T */
    public static boolean m34751T(@Nullable Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            int i2 = 0;
            while (!element.f68981e.f69138h) {
                element = (Element) element.f69005b;
                i2++;
                if (i2 < 6 && element != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.jsoup.nodes.Node] */
    @Override // org.jsoup.nodes.Node
    /* renamed from: E */
    public Node mo34752E() {
        Element element = this;
        while (true) {
            ?? r1 = element.f69005b;
            if (r1 == 0) {
                return element;
            }
            element = r1;
        }
    }

    /* renamed from: F */
    public Element m34753F(Node node) {
        Validate.m34694g(node);
        Node node2 = node.f69005b;
        if (node2 != null) {
            node2.mo34778D(node);
        }
        node.f69005b = this;
        mo34772m();
        this.f68983g.add(node);
        node.f69006c = this.f68983g.size() - 1;
        return this;
    }

    /* renamed from: G */
    public Element m34754G(String str) {
        Element element = new Element(Tag.m34892a(str, NodeUtils.m34795a(this).f69124c), mo34768f(), null);
        m34753F(element);
        return element;
    }

    /* renamed from: J */
    public List<Element> m34755J() {
        List<Element> list;
        if (mo34769h() == 0) {
            return f68979i;
        }
        WeakReference<List<Element>> weakReference = this.f68982f;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f68983g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Node node = this.f68983g.get(i2);
            if (node instanceof Element) {
                arrayList.add((Element) node);
            }
        }
        this.f68982f = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: K */
    public Elements m34756K() {
        return new Elements(m34755J());
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public Element mo34732j() {
        return (Element) super.mo34732j();
    }

    /* renamed from: M */
    public String m34757M() {
        StringBuilder m34700b = StringUtil.m34700b();
        for (Node node : this.f68983g) {
            if (node instanceof DataNode) {
                m34700b.append(((DataNode) node).m34780F());
            } else if (node instanceof Comment) {
                m34700b.append(((Comment) node).m34780F());
            } else if (node instanceof Element) {
                m34700b.append(((Element) node).m34757M());
            } else if (node instanceof CDataNode) {
                m34700b.append(((CDataNode) node).m34780F());
            }
        }
        return StringUtil.m34705g(m34700b);
    }

    /* renamed from: N */
    public void m34758N(String str) {
        mo34767e().m34715F(f68980j, str);
    }

    /* renamed from: O */
    public int m34759O() {
        Node node = this.f69005b;
        if (((Element) node) == null) {
            return 0;
        }
        return m34750Q(this, ((Element) node).m34755J());
    }

    /* renamed from: P */
    public boolean m34760P(String str) {
        Attributes attributes = this.f68984h;
        if (attributes == null) {
            return false;
        }
        String m34724s = attributes.m34724s("class");
        int length = m34724s.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(m34724s);
            }
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isWhitespace(m34724s.charAt(i3))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i3 - i2 == length2 && m34724s.regionMatches(true, i2, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i2 = i3;
                    z = true;
                }
            }
            if (z && length - i2 == length2) {
                return m34724s.regionMatches(true, i2, str, 0, length2);
            }
        }
        return false;
    }

    /* renamed from: R */
    public String m34761R() {
        StringBuilder m34700b = StringUtil.m34700b();
        for (int i2 = 0; i2 < mo34769h(); i2++) {
            Node node = this.f68983g.get(i2);
            if (node instanceof TextNode) {
                m34748H(m34700b, (TextNode) node);
            } else if ((node instanceof Element) && ((Element) node).f68981e.f69133c.equals("br") && !TextNode.m34796K(m34700b)) {
                m34700b.append(" ");
            }
        }
        return StringUtil.m34705g(m34700b).trim();
    }

    /* renamed from: S */
    public Element m34762S(Node node) {
        m34786b(0, node);
        return this;
    }

    @Nullable
    /* renamed from: U */
    public Element m34763U() {
        List<Element> m34755J;
        int m34750Q;
        Node node = this.f69005b;
        if (node != null && (m34750Q = m34750Q(this, (m34755J = ((Element) node).m34755J()))) > 0) {
            return m34755J.get(m34750Q - 1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m34764V(org.jsoup.nodes.Document.OutputSettings r5) {
        /*
            r4 = this;
            boolean r5 = r5.f68968f
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L4e
            org.jsoup.parser.Tag r5 = r4.f68981e
            boolean r2 = r5.f69135e
            if (r2 != 0) goto L1a
            org.jsoup.nodes.Node r2 = r4.f69005b
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            if (r2 == 0) goto L18
            org.jsoup.parser.Tag r2 = r2.f68981e
            boolean r2 = r2.f69135e
            if (r2 != 0) goto L1a
        L18:
            r2 = 0
            goto L1b
        L1a:
            r2 = 1
        L1b:
            if (r2 == 0) goto L4e
            boolean r5 = r5.f69134d
            r5 = r5 ^ r0
            if (r5 == 0) goto L4a
            org.jsoup.nodes.Node r5 = r4.f69005b
            r2 = r5
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            if (r2 == 0) goto L2f
            org.jsoup.parser.Tag r2 = r2.f68981e
            boolean r2 = r2.f69134d
            if (r2 == 0) goto L4a
        L2f:
            r2 = 0
            if (r5 != 0) goto L33
            goto L46
        L33:
            int r3 = r4.f69006c
            if (r3 <= 0) goto L46
            java.util.List r5 = r5.mo34772m()
            int r2 = r4.f69006c
            int r2 = r2 + (-1)
            java.lang.Object r5 = r5.get(r2)
            r2 = r5
            org.jsoup.nodes.Node r2 = (org.jsoup.nodes.Node) r2
        L46:
            if (r2 == 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            if (r5 != 0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.m34764V(org.jsoup.nodes.Document$OutputSettings):boolean");
    }

    /* renamed from: W */
    public String m34765W() {
        final StringBuilder m34700b = StringUtil.m34700b();
        NodeTraversor.m34967a(new NodeVisitor(this) { // from class: org.jsoup.nodes.Element.1
            @Override // org.jsoup.select.NodeVisitor
            /* renamed from: a */
            public void mo15596a(Node node, int i2) {
                if (node instanceof TextNode) {
                    Element.m34748H(m34700b, (TextNode) node);
                    return;
                }
                if (node instanceof Element) {
                    Element element = (Element) node;
                    if (m34700b.length() > 0) {
                        Tag tag = element.f68981e;
                        if ((tag.f69134d || tag.f69133c.equals("br")) && !TextNode.m34796K(m34700b)) {
                            m34700b.append(' ');
                        }
                    }
                }
            }

            @Override // org.jsoup.select.NodeVisitor
            /* renamed from: b */
            public void mo15597b(Node node, int i2) {
                if ((node instanceof Element) && ((Element) node).f68981e.f69134d && (node.m34790q() instanceof TextNode) && !TextNode.m34796K(m34700b)) {
                    m34700b.append(' ');
                }
            }
        }, this);
        return StringUtil.m34705g(m34700b).trim();
    }

    /* renamed from: X */
    public String m34766X() {
        StringBuilder m34700b = StringUtil.m34700b();
        int mo34769h = mo34769h();
        for (int i2 = 0; i2 < mo34769h; i2++) {
            m34749I(this.f68983g.get(i2), m34700b);
        }
        return StringUtil.m34705g(m34700b);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: e */
    public Attributes mo34767e() {
        if (this.f68984h == null) {
            this.f68984h = new Attributes();
        }
        return this.f68984h;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: f */
    public String mo34768f() {
        String str = f68980j;
        for (Element element = this; element != null; element = (Element) element.f69005b) {
            Attributes attributes = element.f68984h;
            if (attributes != null && attributes.m34725t(str)) {
                return element.f68984h.m34723r(str);
            }
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: h */
    public int mo34769h() {
        return this.f68983g.size();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: k */
    public Node mo34770k(@Nullable Node node) {
        Element element = (Element) super.mo34770k(node);
        Attributes attributes = this.f68984h;
        element.f68984h = attributes != null ? attributes.clone() : null;
        NodeList nodeList = new NodeList(element, this.f68983g.size());
        element.f68983g = nodeList;
        nodeList.addAll(this.f68983g);
        return element;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: l */
    public Node mo34771l() {
        this.f68983g.clear();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: m */
    public List<Node> mo34772m() {
        if (this.f68983g == Node.f69004d) {
            this.f68983g = new NodeList(this, 4);
        }
        return this.f68983g;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: o */
    public boolean mo34773o() {
        return this.f68984h != null;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return this.f68981e.f69132b;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        if (m34764V(outputSettings)) {
            if (!(appendable instanceof StringBuilder)) {
                m34789p(appendable, i2, outputSettings);
            } else if (((StringBuilder) appendable).length() > 0) {
                m34789p(appendable, i2, outputSettings);
            }
        }
        appendable.append('<').append(this.f68981e.f69132b);
        Attributes attributes = this.f68984h;
        if (attributes != null) {
            attributes.m34727x(appendable, outputSettings);
        }
        if (this.f68983g.isEmpty()) {
            Tag tag = this.f68981e;
            boolean z = tag.f69136f;
            if (z || tag.f69137g) {
                if (outputSettings.f68971i == Document.OutputSettings.Syntax.html && z) {
                    appendable.append('>');
                    return;
                } else {
                    appendable.append(" />");
                    return;
                }
            }
        }
        appendable.append('>');
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        if (this.f68983g.isEmpty()) {
            Tag tag = this.f68981e;
            if (tag.f69136f || tag.f69137g) {
                return;
            }
        }
        if (outputSettings.f68968f && !this.f68983g.isEmpty() && this.f68981e.f69135e) {
            m34789p(appendable, i2, outputSettings);
        }
        appendable.append("</").append(this.f68981e.f69132b).append('>');
    }

    @Override // org.jsoup.nodes.Node
    @Nullable
    /* renamed from: x */
    public Node mo34774x() {
        return (Element) this.f69005b;
    }
}
