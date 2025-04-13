package moxy.compiler;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class Util {
    private Util() {
    }

    public static String decapitalizeString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return str.toLowerCase();
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    public static <T> boolean equalsBy(Collection<T> collection, Collection<T> collection2, @NotNull BiFunction<T, T, Boolean> biFunction) {
        if (collection == null || collection2 == null) {
            return collection == collection2;
        }
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        Iterator<T> it2 = collection2.iterator();
        while (it.hasNext()) {
            if (!biFunction.apply(it.next(), it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static String fillGenerics(Map<String, String> map, TypeMirror typeMirror) {
        return fillGenerics(map, (List<? extends TypeMirror>) Collections.singletonList(typeMirror));
    }

    public static AnnotationMirror getAnnotation(Element element, String str) {
        for (AnnotationMirror annotationMirror : element.getAnnotationMirrors()) {
            if (annotationMirror.getAnnotationType().asElement().toString().equals(str)) {
                return annotationMirror;
            }
        }
        return null;
    }

    public static AnnotationValue getAnnotationValue(AnnotationMirror annotationMirror, String str) {
        if (annotationMirror == null) {
            return null;
        }
        for (Map.Entry entry : annotationMirror.getElementValues().entrySet()) {
            if (((ExecutableElement) entry.getKey()).getSimpleName().toString().equals(str)) {
                return (AnnotationValue) entry.getValue();
            }
        }
        return null;
    }

    public static String getAnnotationValueAsString(AnnotationMirror annotationMirror, String str) {
        AnnotationValue annotationValue = getAnnotationValue(annotationMirror, str);
        if (annotationValue != null) {
            return annotationValue.getValue().toString();
        }
        return null;
    }

    public static TypeMirror getAnnotationValueAsTypeMirror(AnnotationMirror annotationMirror, String str) {
        AnnotationValue annotationValue = getAnnotationValue(annotationMirror, str);
        if (annotationValue != null) {
            return (TypeMirror) annotationValue.getValue();
        }
        return null;
    }

    public static Map<String, AnnotationValue> getAnnotationValues(AnnotationMirror annotationMirror) {
        if (annotationMirror == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : annotationMirror.getElementValues().entrySet()) {
            String obj = ((ExecutableElement) entry.getKey()).getSimpleName().toString();
            if (entry.getValue() != null) {
                hashMap.put(obj, entry.getValue());
            }
        }
        return hashMap;
    }

    public static String getFullClassName(TypeMirror typeMirror) {
        return !(typeMirror instanceof DeclaredType) ? "" : getFullClassName(((DeclaredType) typeMirror).asElement());
    }

    public static String getSimpleClassName(TypeElement typeElement) {
        String obj = MvpCompiler.getElementUtils().getPackageOf(typeElement).getQualifiedName().toString();
        if (obj.length() > 0) {
            obj = C0000a.m14k(obj, ".");
        }
        return typeElement.toString().substring(obj.length()).replaceAll("\\.", "\\$");
    }

    public static boolean hasEmptyConstructor(TypeElement typeElement) {
        List parameters;
        for (ExecutableElement executableElement : typeElement.getEnclosedElements()) {
            if (executableElement.getKind() == ElementKind.CONSTRUCTOR && ((parameters = executableElement.getParameters()) == null || parameters.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static String fillGenerics(Map<String, String> map, List<? extends TypeMirror> list) {
        return fillGenerics(map, list, ", ");
    }

    public static String fillGenerics(Map<String, String> map, List<? extends TypeMirror> list, String str) {
        Iterator<? extends TypeMirror> it = list.iterator();
        String str2 = "";
        while (it.hasNext()) {
            TypeVariable typeVariable = (TypeMirror) it.next();
            if (str2.length() > 0) {
                str2 = C0000a.m14k(str2, str);
            }
            if (typeVariable instanceof WildcardType) {
                str2 = C0000a.m14k(str2, "?");
                WildcardType wildcardType = (WildcardType) typeVariable;
                TypeMirror extendsBound = wildcardType.getExtendsBound();
                if (extendsBound != null) {
                    StringBuilder m27x = C0000a.m27x(str2, " extends ");
                    m27x.append(fillGenerics(map, extendsBound));
                    str2 = m27x.toString();
                }
                TypeMirror superBound = wildcardType.getSuperBound();
                if (superBound != null) {
                    StringBuilder m27x2 = C0000a.m27x(str2, " super ");
                    m27x2.append(fillGenerics(map, superBound));
                    str2 = m27x2.toString();
                }
            } else if (typeVariable instanceof IntersectionType) {
                str2 = C0000a.m14k(str2, "?");
                List bounds = ((IntersectionType) typeVariable).getBounds();
                if (!bounds.isEmpty()) {
                    StringBuilder m27x3 = C0000a.m27x(str2, " extends ");
                    m27x3.append(fillGenerics(map, bounds, " & "));
                    str2 = m27x3.toString();
                }
            } else if (typeVariable instanceof DeclaredType) {
                StringBuilder m24u = C0000a.m24u(str2);
                DeclaredType declaredType = (DeclaredType) typeVariable;
                m24u.append(declaredType.asElement());
                str2 = m24u.toString();
                List typeArguments = declaredType.getTypeArguments();
                if (!typeArguments.isEmpty()) {
                    str2 = str2 + "<" + fillGenerics(map, (List<? extends TypeMirror>) typeArguments) + ">";
                }
            } else if (typeVariable instanceof TypeVariable) {
                String str3 = map.get(typeVariable.toString());
                if (str3 == null) {
                    str3 = typeVariable.getUpperBound().toString();
                }
                str2 = C0000a.m14k(str2, str3);
            } else {
                str2 = str2 + typeVariable;
            }
        }
        return str2;
    }

    public static String getFullClassName(TypeElement typeElement) {
        String obj = MvpCompiler.getElementUtils().getPackageOf(typeElement).getQualifiedName().toString();
        if (obj.length() > 0) {
            obj = C0000a.m14k(obj, ".");
        }
        String substring = typeElement.toString().substring(obj.length());
        StringBuilder m24u = C0000a.m24u(obj);
        m24u.append(substring.replaceAll("\\.", "\\$"));
        return m24u.toString();
    }
}
