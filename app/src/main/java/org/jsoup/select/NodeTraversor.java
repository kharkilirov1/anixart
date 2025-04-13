package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Node;

/* loaded from: classes3.dex */
public class NodeTraversor {
    /* renamed from: a */
    public static void m34967a(NodeVisitor nodeVisitor, Node node) {
        Validate.m34694g(node);
        Node node2 = node;
        int i2 = 0;
        while (node2 != null) {
            Node node3 = node2.f69005b;
            int mo34769h = node3 != null ? node3.mo34769h() : 0;
            Node m34790q = node2.m34790q();
            nodeVisitor.mo15596a(node2, i2);
            if (node3 != null) {
                if (!(node2.f69005b != null)) {
                    if (mo34769h == node3.mo34769h()) {
                        node2 = node3.m34787g(node2.f69006c);
                    } else if (m34790q == null) {
                        i2--;
                        node2 = node3;
                    } else {
                        node2 = m34790q;
                    }
                }
            }
            if (node2.mo34769h() > 0) {
                node2 = node2.m34787g(0);
                i2++;
            } else {
                while (node2.m34790q() == null && i2 > 0) {
                    nodeVisitor.mo15597b(node2, i2);
                    node2 = node2.f69005b;
                    i2--;
                }
                nodeVisitor.mo15597b(node2, i2);
                if (node2 == node) {
                    return;
                } else {
                    node2 = node2.m34790q();
                }
            }
        }
    }
}
