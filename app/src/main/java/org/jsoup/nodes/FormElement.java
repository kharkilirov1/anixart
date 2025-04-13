package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* loaded from: classes3.dex */
public class FormElement extends Element {

    /* renamed from: k */
    public final Elements f69002k;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, null, attributes);
        this.f69002k = new Elements();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: D */
    public void mo34778D(Node node) {
        super.mo34778D(node);
        this.f69002k.remove(node);
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public FormElement mo34732j() {
        return (FormElement) super.mo34732j();
    }
}
