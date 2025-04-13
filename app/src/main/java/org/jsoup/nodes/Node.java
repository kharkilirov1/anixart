package org.jsoup.nodes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* loaded from: classes3.dex */
public abstract class Node implements Cloneable {

    /* renamed from: d */
    public static final List<Node> f69004d = Collections.emptyList();

    /* renamed from: b */
    @Nullable
    public Node f69005b;

    /* renamed from: c */
    public int f69006c;

    public static class OuterHtmlVisitor implements NodeVisitor {

        /* renamed from: b */
        public final Appendable f69007b;

        /* renamed from: c */
        public final Document.OutputSettings f69008c;

        public OuterHtmlVisitor(Appendable appendable, Document.OutputSettings outputSettings) {
            this.f69007b = appendable;
            this.f69008c = outputSettings;
            outputSettings.m34746b();
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: a */
        public void mo15596a(Node node, int i2) {
            try {
                node.mo34734u(this.f69007b, i2, this.f69008c);
            } catch (IOException e2) {
                throw new SerializationException(e2);
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: b */
        public void mo15597b(Node node, int i2) {
            if (node.mo34733r().equals("#text")) {
                return;
            }
            try {
                node.mo34735v(this.f69007b, i2, this.f69008c);
            } catch (IOException e2) {
                throw new SerializationException(e2);
            }
        }
    }

    /* renamed from: D */
    public void mo34778D(Node node) {
        Validate.m34690c(node.f69005b == this);
        int i2 = node.f69006c;
        mo34772m().remove(i2);
        m34793y(i2);
        node.f69005b = null;
    }

    /* renamed from: E */
    public Node mo34752E() {
        Node node = this;
        while (true) {
            Node node2 = node.f69005b;
            if (node2 == null) {
                return node;
            }
            node = node2;
        }
    }

    /* renamed from: a */
    public String mo34782a(String str) {
        Validate.m34692e(str);
        if (!mo34773o() || !mo34767e().m34726u(str)) {
            return "";
        }
        String mo34768f = mo34768f();
        String m34724s = mo34767e().m34724s(str);
        String[] strArr = StringUtil.f68937a;
        try {
            try {
                m34724s = StringUtil.m34706h(new URL(mo34768f), m34724s).toExternalForm();
            } catch (MalformedURLException unused) {
                m34724s = new URL(m34724s).toExternalForm();
            }
            return m34724s;
        } catch (MalformedURLException unused2) {
            return StringUtil.f68939c.matcher(m34724s).find() ? m34724s : "";
        }
    }

    /* renamed from: b */
    public void m34786b(int i2, Node... nodeArr) {
        boolean z;
        Validate.m34694g(nodeArr);
        if (nodeArr.length == 0) {
            return;
        }
        List<Node> mo34772m = mo34772m();
        Node mo34774x = nodeArr[0].mo34774x();
        if (mo34774x != null && mo34774x.mo34769h() == nodeArr.length) {
            List<Node> mo34772m2 = mo34774x.mo34772m();
            int length = nodeArr.length;
            while (true) {
                int i3 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (nodeArr[i3] != mo34772m2.get(i3)) {
                        z = false;
                        break;
                    }
                    length = i3;
                }
            }
            if (z) {
                boolean z2 = mo34769h() == 0;
                mo34774x.mo34771l();
                mo34772m.addAll(i2, Arrays.asList(nodeArr));
                int length2 = nodeArr.length;
                while (true) {
                    int i4 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    nodeArr[i4].f69005b = this;
                    length2 = i4;
                }
                if (z2 && nodeArr[0].f69006c == 0) {
                    return;
                }
                m34793y(i2);
                return;
            }
        }
        for (Node node : nodeArr) {
            if (node == null) {
                throw new IllegalArgumentException("Array must not contain any null objects");
            }
        }
        for (Node node2 : nodeArr) {
            Objects.requireNonNull(node2);
            Node node3 = node2.f69005b;
            if (node3 != null) {
                node3.mo34778D(node2);
            }
            node2.f69005b = this;
        }
        mo34772m.addAll(i2, Arrays.asList(nodeArr));
        m34793y(i2);
    }

    /* renamed from: c */
    public String mo34783c(String str) {
        Validate.m34694g(str);
        if (!mo34773o()) {
            return "";
        }
        String m34724s = mo34767e().m34724s(str);
        return m34724s.length() > 0 ? m34724s : str.startsWith("abs:") ? mo34782a(str.substring(4)) : "";
    }

    /* renamed from: d */
    public Node mo34784d(String str, String str2) {
        ParseSettings parseSettings = NodeUtils.m34795a(this).f69124c;
        Objects.requireNonNull(parseSettings);
        String trim = str.trim();
        if (!parseSettings.f69121b) {
            trim = Normalizer.m34697a(trim);
        }
        Attributes mo34767e = mo34767e();
        int m34729z = mo34767e.m34729z(trim);
        if (m34729z != -1) {
            mo34767e.f68954d[m34729z] = str2;
            if (!mo34767e.f68953c[m34729z].equals(trim)) {
                mo34767e.f68953c[m34729z] = trim;
            }
        } else {
            mo34767e.m34719b(trim, str2);
        }
        return this;
    }

    /* renamed from: e */
    public abstract Attributes mo34767e();

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    /* renamed from: f */
    public abstract String mo34768f();

    /* renamed from: g */
    public Node m34787g(int i2) {
        return mo34772m().get(i2);
    }

    /* renamed from: h */
    public abstract int mo34769h();

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public List<Node> m34788i() {
        if (mo34769h() == 0) {
            return f69004d;
        }
        List<Node> mo34772m = mo34772m();
        ArrayList arrayList = new ArrayList(mo34772m.size());
        arrayList.addAll(mo34772m);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* renamed from: j */
    public Node mo34732j() {
        Node mo34770k = mo34770k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(mo34770k);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            int mo34769h = node.mo34769h();
            for (int i2 = 0; i2 < mo34769h; i2++) {
                List<Node> mo34772m = node.mo34772m();
                Node mo34770k2 = mo34772m.get(i2).mo34770k(node);
                mo34772m.set(i2, mo34770k2);
                linkedList.add(mo34770k2);
            }
        }
        return mo34770k;
    }

    /* renamed from: k */
    public Node mo34770k(@Nullable Node node) {
        Document m34792w;
        try {
            Node node2 = (Node) super.clone();
            node2.f69005b = node;
            node2.f69006c = node == null ? 0 : this.f69006c;
            if (node == null && !(this instanceof Document) && (m34792w = m34792w()) != null) {
                Document document = new Document(m34792w.mo34768f());
                Attributes attributes = m34792w.f68984h;
                if (attributes != null) {
                    document.f68984h = attributes.clone();
                }
                document.f68960k = m34792w.f68960k.clone();
                node2.f69005b = document;
                document.mo34772m().add(node2);
            }
            return node2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: l */
    public abstract Node mo34771l();

    /* renamed from: m */
    public abstract List<Node> mo34772m();

    /* renamed from: n */
    public boolean mo34785n(String str) {
        Validate.m34694g(str);
        if (!mo34773o()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (mo34767e().m34726u(substring) && !mo34782a(substring).isEmpty()) {
                return true;
            }
        }
        return mo34767e().m34726u(str);
    }

    /* renamed from: o */
    public abstract boolean mo34773o();

    /* renamed from: p */
    public void m34789p(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        String valueOf;
        Appendable append = appendable.append('\n');
        int i3 = i2 * outputSettings.f68969g;
        int i4 = outputSettings.f68970h;
        String[] strArr = StringUtil.f68937a;
        Validate.m34691d(i3 >= 0, "width must be >= 0");
        Validate.m34690c(i4 >= -1);
        if (i4 != -1) {
            i3 = Math.min(i3, i4);
        }
        String[] strArr2 = StringUtil.f68937a;
        if (i3 < strArr2.length) {
            valueOf = strArr2[i3];
        } else {
            char[] cArr = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr[i5] = ' ';
            }
            valueOf = String.valueOf(cArr);
        }
        append.append(valueOf);
    }

    @Nullable
    /* renamed from: q */
    public Node m34790q() {
        Node node = this.f69005b;
        if (node == null) {
            return null;
        }
        List<Node> mo34772m = node.mo34772m();
        int i2 = this.f69006c + 1;
        if (mo34772m.size() > i2) {
            return mo34772m.get(i2);
        }
        return null;
    }

    /* renamed from: r */
    public abstract String mo34733r();

    /* renamed from: s */
    public String mo34744s() {
        StringBuilder m34700b = StringUtil.m34700b();
        m34791t(m34700b);
        return StringUtil.m34705g(m34700b);
    }

    /* renamed from: t */
    public void m34791t(Appendable appendable) {
        Document m34792w = m34792w();
        if (m34792w == null) {
            m34792w = new Document("");
        }
        NodeTraversor.m34967a(new OuterHtmlVisitor(appendable, m34792w.f68960k), this);
    }

    public String toString() {
        return mo34744s();
    }

    /* renamed from: u */
    public abstract void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException;

    /* renamed from: v */
    public abstract void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException;

    @Nullable
    /* renamed from: w */
    public Document m34792w() {
        Node mo34752E = mo34752E();
        if (mo34752E instanceof Document) {
            return (Document) mo34752E;
        }
        return null;
    }

    @Nullable
    /* renamed from: x */
    public Node mo34774x() {
        return this.f69005b;
    }

    /* renamed from: y */
    public final void m34793y(int i2) {
        int mo34769h = mo34769h();
        if (mo34769h == 0) {
            return;
        }
        List<Node> mo34772m = mo34772m();
        while (i2 < mo34769h) {
            mo34772m.get(i2).f69006c = i2;
            i2++;
        }
    }

    /* renamed from: z */
    public void m34794z() {
        Validate.m34694g(this.f69005b);
        this.f69005b.mo34778D(this);
    }
}
