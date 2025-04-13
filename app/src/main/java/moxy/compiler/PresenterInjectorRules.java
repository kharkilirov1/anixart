package moxy.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.tools.Diagnostic;
import moxy.MvpPresenter;
import moxy.MvpView;

/* loaded from: classes3.dex */
public class PresenterInjectorRules extends AnnotationRule {
    public PresenterInjectorRules(ElementKind elementKind, Modifier... modifierArr) {
        super(elementKind, modifierArr);
    }

    private void checkEnvironment(Element element) {
        if (element.asType() instanceof DeclaredType) {
            String viewClassFromGeneric = getViewClassFromGeneric((TypeElement) element.asType().asElement(), (DeclaredType) element.asType());
            boolean z = false;
            for (TypeMirror typeMirror : getViewsType((TypeElement) element.getEnclosingElement().asType().asElement())) {
                if (Util.getFullClassName(typeMirror).equals(viewClassFromGeneric) || Util.fillGenerics((Map<String, String>) Collections.emptyMap(), typeMirror).equals(viewClassFromGeneric)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return;
            }
            MvpCompiler.getMessager().printMessage(Diagnostic.Kind.ERROR, "You can not use @InjectPresenter in a class that is not a View typed with target Presenter", element);
        }
    }

    private Map<TypeParameterElement, TypeMirror> getChildInstanceOfClassFromGeneric(TypeElement typeElement, Class<?> cls) {
        HashMap hashMap = new HashMap();
        for (TypeParameterElement typeParameterElement : typeElement.getTypeParameters()) {
            Iterator it = typeParameterElement.getBounds().iterator();
            while (true) {
                if (it.hasNext()) {
                    DeclaredType declaredType = (TypeMirror) it.next();
                    if (declaredType instanceof DeclaredType) {
                        DeclaredType declaredType2 = declaredType;
                        if (declaredType2.asElement() instanceof TypeElement) {
                            boolean z = false;
                            Iterator<TypeMirror> it2 = getViewsType((TypeElement) declaredType2.asElement()).iterator();
                            while (it2.hasNext()) {
                                if (((TypeMirror) it2.next()).asElement().toString().equals(cls.getCanonicalName())) {
                                    z = true;
                                }
                            }
                            if (z) {
                                hashMap.put(typeParameterElement, declaredType);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    private String getViewClassFromGeneric(TypeElement typeElement, DeclaredType declaredType) {
        Map<TypeParameterElement, TypeMirror> emptyMap = Collections.emptyMap();
        if (!typeElement.getTypeParameters().isEmpty()) {
            emptyMap = getChildInstanceOfClassFromGeneric(typeElement, MvpView.class);
        }
        Map emptyMap2 = Collections.emptyMap();
        ArrayList arrayList = new ArrayList(declaredType.getTypeArguments());
        while (declaredType.getKind() != TypeKind.NONE) {
            DeclaredType declaredType2 = declaredType;
            TypeElement asElement = declaredType2.asElement();
            List typeArguments = declaredType2.getTypeArguments();
            arrayList.retainAll(typeArguments);
            List typeParameters = asElement.getTypeParameters();
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < typeArguments.size(); i2++) {
                hashMap.put(((TypeParameterElement) typeParameters.get(i2)).toString(), Util.fillGenerics((Map<String, String>) emptyMap2, (TypeMirror) typeArguments.get(i2)));
            }
            if (asElement.toString().equals(MvpPresenter.class.getCanonicalName())) {
                if (!typeArguments.isEmpty()) {
                    TypeVariable typeVariable = (TypeMirror) typeArguments.get(0);
                    if (typeVariable instanceof TypeVariable) {
                        Element asElement2 = typeVariable.asElement();
                        for (Map.Entry<TypeParameterElement, TypeMirror> entry : emptyMap.entrySet()) {
                            if (entry.getKey().toString().equals(asElement2.toString())) {
                                return Util.getFullClassName(entry.getValue());
                            }
                        }
                    }
                }
                return (typeArguments.isEmpty() && typeParameters.isEmpty()) ? declaredType2.asElement().getSimpleName().toString() : Util.fillGenerics((Map<String, String>) emptyMap2, (List<? extends TypeMirror>) typeArguments);
            }
            declaredType = asElement.getSuperclass();
            emptyMap2 = hashMap;
        }
        return "";
    }

    private Collection<TypeMirror> getViewsType(TypeElement typeElement) {
        TypeMirror asType = typeElement.asType();
        ArrayList arrayList = new ArrayList();
        while (asType.getKind() != TypeKind.NONE) {
            TypeElement asElement = ((DeclaredType) asType).asElement();
            HashSet hashSet = new HashSet(asElement.getInterfaces());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                DeclaredType declaredType = (TypeMirror) it.next();
                if (declaredType instanceof DeclaredType) {
                    arrayList.addAll(getViewsType((TypeElement) declaredType.asElement()));
                }
            }
            arrayList.addAll(hashSet);
            arrayList.add(asType);
            asType = asElement.getSuperclass();
        }
        return arrayList;
    }

    @Override // moxy.compiler.AnnotationRule
    public void checkAnnotation(Element element) {
        checkEnvironment(element);
        if (element.getKind() != this.validKind) {
            StringBuilder sb = this.errorBuilder;
            sb.append("Field " + element + " of " + element.getEnclosingElement().getSimpleName() + " should be " + this.validKind.name() + ", or do not annotate it with @InjectPresenter");
            sb.append("\n");
        }
        for (Modifier modifier : element.getModifiers()) {
            if (!this.validModifiers.contains(modifier)) {
                StringBuilder sb2 = this.errorBuilder;
                sb2.append("Field " + element + " of " + element.getEnclosingElement().getSimpleName() + " can't be a " + modifier);
                sb2.append(". Use ");
                sb2.append(validModifiersToString());
                sb2.append("\n");
            }
        }
        for (Element enclosingElement = element.getEnclosingElement(); enclosingElement.getKind() == ElementKind.CLASS; enclosingElement = enclosingElement.getEnclosingElement()) {
            if (!enclosingElement.getModifiers().contains(Modifier.PUBLIC)) {
                this.errorBuilder.append(enclosingElement.getSimpleName() + " should be PUBLIC ");
                return;
            }
        }
    }
}
