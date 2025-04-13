package org.jsoup.nodes;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class LeafNode extends Node {

    /* renamed from: e */
    public Object f69003e;

    /* renamed from: F */
    public String m34780F() {
        return mo34783c(mo34733r());
    }

    /* renamed from: G */
    public final void m34781G() {
        Object obj = this.f69003e;
        if (obj instanceof Attributes) {
            return;
        }
        Attributes attributes = new Attributes();
        this.f69003e = attributes;
        if (obj != null) {
            attributes.m34715F(mo34733r(), (String) obj);
        }
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: a */
    public String mo34782a(String str) {
        m34781G();
        return super.mo34782a(str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: c */
    public String mo34783c(String str) {
        return !(this.f69003e instanceof Attributes) ? mo34733r().equals(str) ? (String) this.f69003e : "" : super.mo34783c(str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: d */
    public Node mo34784d(String str, String str2) {
        if ((this.f69003e instanceof Attributes) || !str.equals(mo34733r())) {
            m34781G();
            super.mo34784d(str, str2);
        } else {
            this.f69003e = str2;
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: e */
    public final Attributes mo34767e() {
        m34781G();
        return (Attributes) this.f69003e;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: f */
    public String mo34768f() {
        Node node = this.f69005b;
        return node != null ? node.mo34768f() : "";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: h */
    public int mo34769h() {
        return 0;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: k */
    public Node mo34770k(Node node) {
        LeafNode leafNode = (LeafNode) super.mo34770k(node);
        Object obj = this.f69003e;
        if (obj instanceof Attributes) {
            leafNode.f69003e = ((Attributes) obj).clone();
        }
        return leafNode;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: l */
    public Node mo34771l() {
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: m */
    public List<Node> mo34772m() {
        return Node.f69004d;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: n */
    public boolean mo34785n(String str) {
        m34781G();
        return super.mo34785n(str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: o */
    public final boolean mo34773o() {
        return this.f69003e instanceof Attributes;
    }
}
