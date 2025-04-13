package moxy.compiler.viewstate;

import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import moxy.compiler.MvpCompiler;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewMethodParameters.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m31884d2 = {"Lmoxy/compiler/viewstate/ViewMethodParameters;", "", "()V", "createParameters", "", "Lcom/squareup/javapoet/ParameterSpec;", "interfaceElement", "Ljavax/lang/model/type/DeclaredType;", "methodElement", "Ljavax/lang/model/element/ExecutableElement;", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ViewMethodParameters {
    public static final ViewMethodParameters INSTANCE = new ViewMethodParameters();

    private ViewMethodParameters() {
    }

    @NotNull
    public final List<ParameterSpec> createParameters(@NotNull DeclaredType interfaceElement, @NotNull ExecutableElement methodElement) {
        Intrinsics.m32179h(interfaceElement, "interfaceElement");
        Intrinsics.m32179h(methodElement, "methodElement");
        ExecutableType asMemberOf = MvpCompiler.INSTANCE.getTypeUtils().asMemberOf(interfaceElement, (Element) methodElement);
        Objects.requireNonNull(asMemberOf, "null cannot be cast to non-null type javax.lang.model.type.ExecutableType");
        List parameterTypes = asMemberOf.getParameterTypes();
        Intrinsics.m32178g(parameterTypes, "executableType.parameterTypes");
        List parameters = methodElement.getParameters();
        Intrinsics.m32178g(parameters, "methodElement.parameters");
        Iterator it = parameters.iterator();
        Iterator it2 = parameterTypes.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.m32032m(parameters, 10), CollectionsKt.m32032m(parameterTypes, 10)));
        while (it.hasNext() && it2.hasNext()) {
            VariableElement parameterElement = (VariableElement) it.next();
            TypeName typeName = TypeName.get((TypeMirror) it2.next());
            Intrinsics.m32178g(parameterElement, "parameterElement");
            arrayList.add(ParameterSpec.builder(typeName, parameterElement.getSimpleName().toString(), new Modifier[0]).addModifiers(parameterElement.getModifiers()).build());
        }
        return arrayList;
    }
}
