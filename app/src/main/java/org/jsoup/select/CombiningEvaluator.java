package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

/* loaded from: classes3.dex */
public abstract class CombiningEvaluator extends Evaluator {

    /* renamed from: b */
    public int f69292b = 0;

    /* renamed from: a */
    public final ArrayList<Evaluator> f69291a = new ArrayList<>();

    /* renamed from: b */
    public void m34961b() {
        this.f69292b = this.f69291a.size();
    }

    public static final class And extends CombiningEvaluator {
        public And(Collection<Evaluator> collection) {
            this.f69291a.addAll(collection);
            m34961b();
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            for (int i2 = this.f69292b - 1; i2 >= 0; i2--) {
                if (!this.f69291a.get(i2).mo34962a(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.m34704f(this.f69291a, "");
        }

        public And(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }
    }

    /* renamed from: org.jsoup.select.CombiningEvaluator$Or */
    public static final class C6974Or extends CombiningEvaluator {
        public C6974Or(Evaluator... evaluatorArr) {
            List asList = Arrays.asList(evaluatorArr);
            if (this.f69292b > 1) {
                this.f69291a.add(new And(asList));
            } else {
                this.f69291a.addAll(asList);
            }
            m34961b();
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: a */
        public boolean mo34962a(Element element, Element element2) {
            for (int i2 = 0; i2 < this.f69292b; i2++) {
                if (this.f69291a.get(i2).mo34962a(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return StringUtil.m34704f(this.f69291a, ", ");
        }

        public C6974Or() {
        }
    }
}
