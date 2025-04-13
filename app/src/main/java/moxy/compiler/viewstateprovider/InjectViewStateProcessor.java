package moxy.compiler.viewstateprovider;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import moxy.DefaultView;
import moxy.DefaultViewState;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import moxy.MvpProcessor;
import moxy.compiler.ElementProcessor;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.MvpCompiler;
import moxy.compiler.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: InjectViewStateProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u001d"}, m31884d2 = {"Lmoxy/compiler/viewstateprovider/InjectViewStateProcessor;", "Lmoxy/compiler/ElementProcessor;", "Ljavax/lang/model/element/TypeElement;", "Lmoxy/compiler/viewstateprovider/PresenterInfo;", "()V", "usedViews", "", "getUsedViews", "()Ljava/util/Set;", "isAbstractClass", "", "(Ljavax/lang/model/element/TypeElement;)Z", "catchTypeMirror", "Ljavax/lang/model/type/TypeMirror;", "block", "Lkotlin/Function0;", "", "getViewClassFromAnnotationParams", "", "typeElement", "getViewClassFromGeneric", "getViewClassFromPresenterTypeElement", "getViewStateClassFromAnnotationParams", "getViewStateClassName", "process", "element", "trimGenericFromClassName", "view", "Companion", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class InjectViewStateProcessor implements ElementProcessor<TypeElement, PresenterInfo> {
    private static final String MVP_PRESENTER_CLASS;

    @NotNull
    private final Set<TypeElement> usedViews = new LinkedHashSet();

    static {
        String canonicalName = MvpPresenter.class.getCanonicalName();
        Intrinsics.m32178g(canonicalName, "MvpPresenter::class.java.canonicalName");
        MVP_PRESENTER_CLASS = canonicalName;
    }

    private final TypeMirror catchTypeMirror(Function0<Unit> block) {
        try {
            block.invoke();
            return null;
        } catch (MirroredTypeException e2) {
            return e2.getTypeMirror();
        }
    }

    private final String getViewClassFromAnnotationParams(TypeElement typeElement) {
        TypeMirror typeMirror;
        String str;
        InjectViewState injectViewState = (InjectViewState) typeElement.getAnnotation(InjectViewState.class);
        if (injectViewState != null) {
            try {
                Reflection.m32193a(injectViewState.view());
            } catch (MirroredTypeException e2) {
                typeMirror = e2.getTypeMirror();
            }
        }
        typeMirror = null;
        if (typeMirror == null || (str = ExtensionsKt.getFullClassName(typeMirror)) == null) {
            str = "";
        }
        boolean z = true;
        if (!(str.length() == 0) && !Intrinsics.m32174c(str, DefaultView.class.getName())) {
            z = false;
        }
        if (z) {
            return null;
        }
        return str;
    }

    private final String getViewClassFromGeneric(TypeElement typeElement) {
        Map map;
        TypeMirror asType = typeElement.asType();
        Intrinsics.m32178g(asType, "typeElement.asType()");
        map = EmptyMap.f63145b;
        while (asType.getKind() != TypeKind.NONE) {
            TypeElement asTypeElement = ExtensionsKt.asTypeElement(asType);
            List typeArguments = ((DeclaredType) asType).getTypeArguments();
            Intrinsics.m32178g(typeArguments, "superclass.typeArguments");
            List typeParameters = asTypeElement.getTypeParameters();
            Intrinsics.m32178g(typeParameters, "superclassElement.typeParameters");
            if (!(typeArguments.size() <= typeParameters.size())) {
                StringBuilder m24u = C0000a.m24u("Code generation for the interface ");
                m24u.append(typeElement.getSimpleName());
                m24u.append(" failed. ");
                m24u.append("Simplify your generics. (");
                m24u.append(typeArguments);
                m24u.append(" vs ");
                m24u.append(typeParameters);
                m24u.append(')');
                throw new IllegalArgumentException(m24u.toString().toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = typeArguments.size();
            for (int i2 = 0; i2 < size; i2++) {
                String valueOf = String.valueOf(typeParameters.get(i2));
                String fillGenerics = Util.fillGenerics((Map<String, String>) map, (TypeMirror) typeArguments.get(i2));
                Intrinsics.m32178g(fillGenerics, "fillGenerics(parentTypes, typeArguments[i])");
                linkedHashMap.put(valueOf, fillGenerics);
            }
            if (Intrinsics.m32174c(asTypeElement.toString(), MVP_PRESENTER_CLASS)) {
                String fillGenerics2 = Util.fillGenerics((Map<String, String>) map, (List<? extends TypeMirror>) typeArguments);
                Intrinsics.m32178g(fillGenerics2, "fillGenerics(parentTypes, typeArguments)");
                return fillGenerics2;
            }
            asType = asTypeElement.getSuperclass();
            Intrinsics.m32178g(asType, "superclassElement.superclass");
            map = linkedHashMap;
        }
        return "";
    }

    private final String getViewClassFromPresenterTypeElement(TypeElement typeElement) {
        String viewClassFromAnnotationParams = getViewClassFromAnnotationParams(typeElement);
        if (viewClassFromAnnotationParams == null) {
            viewClassFromAnnotationParams = getViewClassFromGeneric(typeElement);
        }
        return trimGenericFromClassName(viewClassFromAnnotationParams);
    }

    private final String getViewStateClassFromAnnotationParams(TypeElement typeElement) {
        TypeMirror typeMirror;
        String str;
        InjectViewState injectViewState = (InjectViewState) typeElement.getAnnotation(InjectViewState.class);
        if (injectViewState != null) {
            try {
                Reflection.m32193a(injectViewState.value());
            } catch (MirroredTypeException e2) {
                typeMirror = e2.getTypeMirror();
            }
        }
        typeMirror = null;
        if (typeMirror == null || (str = typeMirror.toString()) == null) {
            str = "";
        }
        boolean z = true;
        if (!(str.length() == 0) && !Intrinsics.m32174c(str, DefaultViewState.class.getName())) {
            z = false;
        }
        if (z) {
            return null;
        }
        return str;
    }

    private final String getViewStateClassName(TypeElement typeElement) {
        String viewStateClassFromAnnotationParams = getViewStateClassFromAnnotationParams(typeElement);
        if (viewStateClassFromAnnotationParams != null) {
            return viewStateClassFromAnnotationParams;
        }
        String viewClassFromPresenterTypeElement = getViewClassFromPresenterTypeElement(typeElement);
        TypeElement typeElement2 = MvpCompiler.INSTANCE.getElementUtils().getTypeElement(viewClassFromPresenterTypeElement);
        if (typeElement2 != null) {
            this.usedViews.add(typeElement2);
            return Util.getFullClassName(typeElement2) + MvpProcessor.VIEW_STATE_SUFFIX;
        }
        throw new IllegalArgumentException("View \"" + viewClassFromPresenterTypeElement + "\" for " + typeElement + " cannot be found");
    }

    private final boolean isAbstractClass(TypeElement typeElement) {
        return typeElement.getModifiers().contains(Modifier.ABSTRACT);
    }

    private final String trimGenericFromClassName(String view) {
        if (!StringsKt.m33922t(view, "<", false, 2, null)) {
            return view;
        }
        int m33878D = StringsKt.m33878D(view, "<", 0, false, 6, null);
        Objects.requireNonNull(view, "null cannot be cast to non-null type java.lang.String");
        String substring = view.substring(0, m33878D);
        Intrinsics.m32178g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final Set<TypeElement> getUsedViews() {
        return this.usedViews;
    }

    @Override // moxy.compiler.ElementProcessor
    @Nullable
    public PresenterInfo process(@NotNull TypeElement element) {
        Intrinsics.m32179h(element, "element");
        if (isAbstractClass(element)) {
            return null;
        }
        return new PresenterInfo(element, getViewStateClassName(element));
    }
}
