package org.jsoup.safety;

import java.util.Objects;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeVisitor;

/* loaded from: classes3.dex */
public class Cleaner {

    public final class CleaningVisitor implements NodeVisitor {

        /* renamed from: b */
        public int f69279b;

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: a */
        public void mo15596a(Node node, int i2) {
            if (node instanceof Element) {
                Objects.requireNonNull(null);
                throw null;
            }
            if (node instanceof TextNode) {
                ((TextNode) node).m34797I();
                throw null;
            }
            if (node instanceof DataNode) {
                Objects.requireNonNull(null);
                throw null;
            }
            this.f69279b++;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: b */
        public void mo15597b(Node node, int i2) {
            if (node instanceof Element) {
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    public static class ElementMeta {
    }
}
