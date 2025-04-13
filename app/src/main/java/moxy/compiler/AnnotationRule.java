package moxy.compiler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;

/* loaded from: classes3.dex */
public abstract class AnnotationRule {
    public StringBuilder errorBuilder;
    public final ElementKind validKind;
    public final Set<Modifier> validModifiers;

    public AnnotationRule(ElementKind elementKind, Modifier... modifierArr) {
        if (modifierArr == null || modifierArr.length == 0) {
            throw new RuntimeException("Valid modifiers cant be empty or null.");
        }
        this.validKind = elementKind;
        this.validModifiers = new HashSet(Arrays.asList(modifierArr));
        this.errorBuilder = new StringBuilder();
    }

    public abstract void checkAnnotation(Element element);

    public String getErrorStack() {
        return this.errorBuilder.toString();
    }

    public String validModifiersToString() {
        if (this.validModifiers.size() <= 1) {
            return this.validModifiers.iterator().next() + ".";
        }
        StringBuilder sb = new StringBuilder("one of [");
        boolean z = false;
        for (Modifier modifier : this.validModifiers) {
            if (z) {
                sb.append(", ");
            }
            sb.append(modifier.toString());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }
}
