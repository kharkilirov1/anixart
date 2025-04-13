package moxy.compiler.viewstate.entity;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import moxy.compiler.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewInterfaceInfo.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, m31884d2 = {"Lmoxy/compiler/viewstate/entity/ViewInterfaceInfo;", "", "element", "Ljavax/lang/model/element/TypeElement;", "methods", "", "Lmoxy/compiler/viewstate/entity/ViewStateMethod;", "(Ljavax/lang/model/element/TypeElement;Ljava/util/List;)V", "getElement", "()Ljavax/lang/model/element/TypeElement;", "getMethods", "()Ljava/util/List;", "name", "Lcom/squareup/javapoet/ClassName;", "getName", "()Lcom/squareup/javapoet/ClassName;", "nameWithTypeVariables", "Lcom/squareup/javapoet/TypeName;", "getNameWithTypeVariables", "()Lcom/squareup/javapoet/TypeName;", "typeVariables", "Lcom/squareup/javapoet/TypeVariableName;", "getTypeVariables", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ViewInterfaceInfo {

    @NotNull
    private final TypeElement element;

    @NotNull
    private final List<ViewStateMethod> methods;

    @NotNull
    private final ClassName name;

    @NotNull
    private final List<TypeVariableName> typeVariables;

    public ViewInterfaceInfo(@NotNull TypeElement element, @NotNull List<ViewStateMethod> methods) {
        Intrinsics.m32179h(element, "element");
        Intrinsics.m32179h(methods, "methods");
        this.element = element;
        this.methods = methods;
        ClassName className = ClassName.get(element);
        Intrinsics.m32178g(className, "ClassName.get(element)");
        this.name = className;
        List typeParameters = element.getTypeParameters();
        Intrinsics.m32178g(typeParameters, "element.typeParameters");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(TypeVariableName.get((TypeParameterElement) it.next()));
        }
        this.typeVariables = arrayList;
    }

    @NotNull
    public final TypeElement getElement() {
        return this.element;
    }

    @NotNull
    public final List<ViewStateMethod> getMethods() {
        return this.methods;
    }

    @NotNull
    public final ClassName getName() {
        return this.name;
    }

    @NotNull
    public final TypeName getNameWithTypeVariables() {
        return this.typeVariables.isEmpty() ? this.name : ExtensionsKt.parametrizedWith(this.name, this.typeVariables);
    }

    @NotNull
    public final List<TypeVariableName> getTypeVariables() {
        return this.typeVariables;
    }
}
