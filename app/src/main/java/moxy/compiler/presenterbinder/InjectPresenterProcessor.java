package moxy.compiler.presenterbinder;

import com.squareup.javapoet.ClassName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import moxy.compiler.ElementProcessor;
import moxy.compiler.ExtensionsKt;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;
import moxy.presenter.ProvidePresenterTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InjectPresenterProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J$\u0010\u000f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m31884d2 = {"Lmoxy/compiler/presenterbinder/InjectPresenterProcessor;", "Lmoxy/compiler/ElementProcessor;", "Ljavax/lang/model/element/VariableElement;", "Lmoxy/compiler/presenterbinder/TargetClassInfo;", "()V", "presentersContainers", "", "Ljavax/lang/model/element/TypeElement;", "bindProvidersToFields", "", "fields", "", "Lmoxy/compiler/presenterbinder/TargetPresenterField;", "presenterProviders", "Lmoxy/compiler/presenterbinder/PresenterProviderMethod;", "bindTagProvidersToFields", "tagProviders", "Lmoxy/compiler/presenterbinder/TagProviderMethod;", "collectFields", "presentersContainer", "collectPresenterProviders", "collectTagProviders", "findSuperPresenterContainer", "typeElement", "process", "variableElement", "containsInjectPresenterField", "", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class InjectPresenterProcessor implements ElementProcessor<VariableElement, TargetClassInfo> {
    private final List<TypeElement> presentersContainers = new ArrayList();

    private final void bindProvidersToFields(List<TargetPresenterField> fields, List<PresenterProviderMethod> presenterProviders) {
        if (fields.isEmpty() || presenterProviders.isEmpty()) {
            return;
        }
        for (PresenterProviderMethod presenterProviderMethod : presenterProviders) {
            Intrinsics.m32178g(presenterProviderMethod.getReturnType().asElement().asType(), "presenterProvider.returnType.asElement().asType()");
            for (TargetPresenterField targetPresenterField : fields) {
                if (!(!Intrinsics.m32174c(targetPresenterField.getType(), r1)) && !(!Intrinsics.m32174c(targetPresenterField.getTag(), presenterProviderMethod.getTag())) && !(!Intrinsics.m32174c(targetPresenterField.getPresenterId(), presenterProviderMethod.getPresenterId()))) {
                    targetPresenterField.setPresenterProviderMethodName(presenterProviderMethod.getMethodName());
                }
            }
        }
    }

    private final void bindTagProvidersToFields(List<TargetPresenterField> fields, List<TagProviderMethod> tagProviders) {
        if (fields.isEmpty() || tagProviders.isEmpty()) {
            return;
        }
        for (TagProviderMethod tagProviderMethod : tagProviders) {
            for (TargetPresenterField targetPresenterField : fields) {
                if (!(!Intrinsics.m32174c(targetPresenterField.getType(), tagProviderMethod.getPresenterClass())) && !(!Intrinsics.m32174c(targetPresenterField.getPresenterId(), tagProviderMethod.getPresenterId()))) {
                    targetPresenterField.setPresenterTagProviderMethodName(tagProviderMethod.getMethodName());
                }
            }
        }
    }

    private final List<TargetPresenterField> collectFields(TypeElement presentersContainer) {
        TargetPresenterField targetPresenterField;
        List enclosedElements = presentersContainer.getEnclosedElements();
        Intrinsics.m32178g(enclosedElements, "presentersContainer.enclosedElements");
        ArrayList<Element> arrayList = new ArrayList();
        for (Object obj : enclosedElements) {
            Element element = (Element) obj;
            Intrinsics.m32178g(element, "element");
            if (element.getKind() == ElementKind.FIELD) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Element element2 : arrayList) {
            Intrinsics.m32178g(element2, "element");
            AnnotationMirror annotationMirror = ExtensionsKt.getAnnotationMirror(element2, Reflection.m32193a(InjectPresenter.class));
            if (annotationMirror != null) {
                TypeMirror asType = ExtensionsKt.asDeclaredType(element2).asElement().asType();
                Intrinsics.m32178g(asType, "element.asDeclaredType().asElement().asType()");
                targetPresenterField = new TargetPresenterField(asType, element2.toString(), ExtensionsKt.getValueAsString(annotationMirror, InjectPresenterProcessor$collectFields$2$tag$1.INSTANCE), ExtensionsKt.getValueAsString(annotationMirror, InjectPresenterProcessor$collectFields$2$presenterId$1.INSTANCE));
            } else {
                targetPresenterField = null;
            }
            if (targetPresenterField != null) {
                arrayList2.add(targetPresenterField);
            }
        }
        return arrayList2;
    }

    private final List<PresenterProviderMethod> collectPresenterProviders(TypeElement presentersContainer) {
        PresenterProviderMethod presenterProviderMethod;
        List enclosedElements = presentersContainer.getEnclosedElements();
        Intrinsics.m32178g(enclosedElements, "presentersContainer.enclosedElements");
        ArrayList<ExecutableElement> arrayList = new ArrayList();
        for (Object obj : enclosedElements) {
            Element element = (Element) obj;
            Intrinsics.m32178g(element, "element");
            if (element.getKind() == ElementKind.METHOD) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ExecutableElement element2 : arrayList) {
            Intrinsics.m32178g(element2, "element");
            AnnotationMirror annotationMirror = ExtensionsKt.getAnnotationMirror(element2, Reflection.m32193a(ProvidePresenter.class));
            if (annotationMirror != null) {
                ExecutableElement executableElement = element2;
                String obj2 = executableElement.getSimpleName().toString();
                DeclaredType returnType = executableElement.getReturnType();
                Objects.requireNonNull(returnType, "null cannot be cast to non-null type javax.lang.model.type.DeclaredType");
                presenterProviderMethod = new PresenterProviderMethod(returnType, obj2, ExtensionsKt.getValueAsString(annotationMirror, InjectPresenterProcessor$collectPresenterProviders$2$tag$1.INSTANCE), ExtensionsKt.getValueAsString(annotationMirror, C6864x18097eb5.INSTANCE));
            } else {
                presenterProviderMethod = null;
            }
            if (presenterProviderMethod != null) {
                arrayList2.add(presenterProviderMethod);
            }
        }
        return arrayList2;
    }

    private final List<TagProviderMethod> collectTagProviders(TypeElement presentersContainer) {
        TagProviderMethod tagProviderMethod;
        List enclosedElements = presentersContainer.getEnclosedElements();
        Intrinsics.m32178g(enclosedElements, "presentersContainer.enclosedElements");
        ArrayList<ExecutableElement> arrayList = new ArrayList();
        for (Object obj : enclosedElements) {
            Element element = (Element) obj;
            Intrinsics.m32178g(element, "element");
            if (element.getKind() == ElementKind.METHOD) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ExecutableElement element2 : arrayList) {
            Intrinsics.m32178g(element2, "element");
            AnnotationMirror annotationMirror = ExtensionsKt.getAnnotationMirror(element2, Reflection.m32193a(ProvidePresenterTag.class));
            if (annotationMirror != null) {
                String obj2 = element2.getSimpleName().toString();
                TypeMirror valueAsTypeMirror = ExtensionsKt.getValueAsTypeMirror(annotationMirror, InjectPresenterProcessor$collectTagProviders$2$presenterClass$1.INSTANCE);
                Intrinsics.m32176e(valueAsTypeMirror);
                tagProviderMethod = new TagProviderMethod(valueAsTypeMirror, obj2, ExtensionsKt.getValueAsString(annotationMirror, InjectPresenterProcessor$collectTagProviders$2$presenterId$1.INSTANCE));
            } else {
                tagProviderMethod = null;
            }
            if (tagProviderMethod != null) {
                arrayList2.add(tagProviderMethod);
            }
        }
        return arrayList2;
    }

    private final boolean containsInjectPresenterField(TypeElement typeElement) {
        List<Element> enclosedElements = typeElement.getEnclosedElements();
        Intrinsics.m32178g(enclosedElements, "enclosedElements");
        if (!enclosedElements.isEmpty()) {
            for (Element it : enclosedElements) {
                Intrinsics.m32178g(it, "it");
                if (it.getKind() == ElementKind.FIELD && it.getAnnotation(InjectPresenter.class) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private final TypeElement findSuperPresenterContainer(TypeElement typeElement) {
        while (typeElement != null) {
            TypeMirror superclass = typeElement.getSuperclass();
            Intrinsics.m32178g(superclass, "superclass");
            if (superclass.getKind() != TypeKind.DECLARED) {
                return null;
            }
            typeElement = ExtensionsKt.asTypeElement(superclass);
            if (containsInjectPresenterField(typeElement)) {
                return typeElement;
            }
        }
        return null;
    }

    @Override // moxy.compiler.ElementProcessor
    @Nullable
    public TargetClassInfo process(@NotNull VariableElement variableElement) {
        Intrinsics.m32179h(variableElement, "variableElement");
        TypeElement enclosingElement = variableElement.getEnclosingElement();
        Intrinsics.m32178g(enclosingElement, "variableElement.enclosingElement");
        if (!(enclosingElement instanceof TypeElement)) {
            throw new IllegalArgumentException(("Only class fields could be annotated as @InjectPresenter: " + variableElement + " at " + enclosingElement).toString());
        }
        if (this.presentersContainers.contains(enclosingElement)) {
            return null;
        }
        this.presentersContainers.add(enclosingElement);
        TypeElement typeElement = enclosingElement;
        List<TargetPresenterField> collectFields = collectFields(typeElement);
        bindProvidersToFields(collectFields, collectPresenterProviders(typeElement));
        bindTagProvidersToFields(collectFields, collectTagProviders(typeElement));
        ClassName className = ClassName.get(typeElement);
        Intrinsics.m32178g(className, "ClassName.get(presentersContainer)");
        return new TargetClassInfo(enclosingElement, className, collectFields, findSuperPresenterContainer(typeElement));
    }
}
