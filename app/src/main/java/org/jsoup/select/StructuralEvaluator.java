package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Collector;

/* loaded from: classes3.dex */
abstract class StructuralEvaluator extends Evaluator {

    /* renamed from: a */
    public Evaluator f69328a;

    public static class Has extends StructuralEvaluator {

        /* renamed from: b */
        public final Collector.FirstFinder f69329b;

        public Has(Evaluator evaluator) {
            this.f69328a = evaluator;
            this.f69329b = new Collector.FirstFinder(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            for (int i2 = 0; i2 < element2.mo34769h(); i2++) {
                Node m34787g = element2.m34787g(i2);
                if ((m34787g instanceof Element) && this.f69329b.m34959a(element2, (Element) m34787g) != null) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.f69328a);
        }
    }

    public static class ImmediateParent extends StructuralEvaluator {
        public ImmediateParent(Evaluator evaluator) {
            this.f69328a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Element element3;
            return (element == element2 || (element3 = (Element) element2.f69005b) == null || !this.f69328a.mo34962a(element, element3)) ? false : true;
        }

        public String toString() {
            return String.format("%s > ", this.f69328a);
        }
    }

    public static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {
            this.f69328a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            Element m34763U;
            return (element == element2 || (m34763U = element2.m34763U()) == null || !this.f69328a.mo34962a(element, m34763U)) ? false : true;
        }

        public String toString() {
            return String.format("%s + ", this.f69328a);
        }
    }

    public static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {
            this.f69328a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return !this.f69328a.mo34962a(element, element2);
        }

        public String toString() {
            return String.format(":not(%s)", this.f69328a);
        }
    }

    public static class Parent extends StructuralEvaluator {
        public Parent(Evaluator evaluator) {
            this.f69328a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element element3 = (Element) element2.f69005b; element3 != null; element3 = (Element) element3.f69005b) {
                if (this.f69328a.mo34962a(element, element3)) {
                    return true;
                }
                if (element3 == element) {
                    break;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ", this.f69328a);
        }
    }

    public static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {
            this.f69328a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element m34763U = element2.m34763U(); m34763U != null; m34763U = m34763U.m34763U()) {
                if (this.f69328a.mo34962a(element, m34763U)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.f69328a);
        }
    }

    public static class Root extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            return element == element2;
        }
    }
}
