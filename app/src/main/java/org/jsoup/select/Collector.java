package org.jsoup.select;

import javax.annotation.Nullable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

/* loaded from: classes3.dex */
public class Collector {

    public static class Accumulator implements NodeVisitor {

        /* renamed from: b */
        public final Element f69285b;

        /* renamed from: c */
        public final Elements f69286c;

        /* renamed from: d */
        public final Evaluator f69287d;

        public Accumulator(Element element, Elements elements, Evaluator evaluator) {
            this.f69285b = element;
            this.f69286c = elements;
            this.f69287d = evaluator;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: a */
        public void mo15596a(Node node, int i2) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f69287d.mo34962a(this.f69285b, element)) {
                    this.f69286c.add(element);
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: b */
        public void mo15597b(Node node, int i2) {
        }
    }

    public static class FirstFinder implements NodeFilter {

        /* renamed from: a */
        @Nullable
        public Element f69288a = null;

        /* renamed from: b */
        @Nullable
        public Element f69289b = null;

        /* renamed from: c */
        public final Evaluator f69290c;

        public FirstFinder(Evaluator evaluator) {
            this.f69290c = evaluator;
        }

        @Nullable
        /* renamed from: a */
        public Element m34959a(Element element, Element element2) {
            NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
            this.f69288a = element;
            this.f69289b = null;
            NodeFilter.FilterResult filterResult2 = NodeFilter.FilterResult.REMOVE;
            NodeFilter.FilterResult filterResult3 = NodeFilter.FilterResult.SKIP_CHILDREN;
            NodeFilter.FilterResult filterResult4 = NodeFilter.FilterResult.STOP;
            Node node = element2;
            int i2 = 0;
            while (node != null) {
                NodeFilter.FilterResult m34960b = m34960b(node, i2);
                if (m34960b == filterResult4) {
                    break;
                }
                if (m34960b != filterResult || node.mo34769h() <= 0) {
                    while (node.m34790q() == null && i2 > 0) {
                        if (m34960b == filterResult || m34960b == filterResult3) {
                            m34960b = filterResult;
                        }
                        Node node2 = node.f69005b;
                        i2--;
                        if (m34960b == filterResult2) {
                            node.m34794z();
                        }
                        m34960b = filterResult;
                        node = node2;
                    }
                    if (m34960b == filterResult || m34960b == filterResult3) {
                        m34960b = filterResult;
                    }
                    if (node == element2) {
                        break;
                    }
                    Node m34790q = node.m34790q();
                    if (m34960b == filterResult2) {
                        node.m34794z();
                    }
                    node = m34790q;
                } else {
                    node = node.m34787g(0);
                    i2++;
                }
            }
            return this.f69289b;
        }

        /* renamed from: b */
        public NodeFilter.FilterResult m34960b(Node node, int i2) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f69290c.mo34962a(this.f69288a, element)) {
                    this.f69289b = element;
                    return NodeFilter.FilterResult.STOP;
                }
            }
            return NodeFilter.FilterResult.CONTINUE;
        }
    }

    /* renamed from: a */
    public static Elements m34958a(Evaluator evaluator, Element element) {
        Elements elements = new Elements();
        NodeTraversor.m34967a(new Accumulator(element, elements, evaluator), element);
        return elements;
    }
}
