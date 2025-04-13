package moxy.compiler.viewstate;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.DeclaredType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import moxy.MvpProcessor;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.JavaFilesGenerator;
import moxy.compiler.MvpCompiler;
import moxy.compiler.Util;
import moxy.compiler.viewstate.entity.ViewInterfaceInfo;
import moxy.compiler.viewstate.entity.ViewStateMethod;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ViewStateClassGenerator.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J*\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0002¨\u0006\u0014"}, m31884d2 = {"Lmoxy/compiler/viewstate/ViewStateClassGenerator;", "Lmoxy/compiler/JavaFilesGenerator;", "Lmoxy/compiler/viewstate/entity/ViewInterfaceInfo;", "()V", "generate", "", "Lcom/squareup/javapoet/JavaFile;", "viewInterfaceInfo", "generateCommandClass", "Lcom/squareup/javapoet/TypeSpec;", "method", "Lmoxy/compiler/viewstate/entity/ViewStateMethod;", "viewTypeName", "Lcom/squareup/javapoet/TypeName;", "generateCommandConstructor", "Lcom/squareup/javapoet/MethodSpec;", "generateMethod", "enclosingType", "Ljavax/lang/model/type/DeclaredType;", "commandClass", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ViewStateClassGenerator implements JavaFilesGenerator<ViewInterfaceInfo> {
    private final TypeSpec generateCommandClass(ViewStateMethod method, TypeName viewTypeName) {
        TypeSpec.Builder addMethod = TypeSpec.classBuilder(method.getCommandClassName()).addModifiers(new Modifier[]{Modifier.PUBLIC}).addTypeVariables(method.getTypeVariables()).superclass(ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(ViewCommand.class)), viewTypeName)).addMethod(generateCommandConstructor(method)).addMethod(MethodSpec.methodBuilder("apply").addAnnotation(Override.class).addModifiers(new Modifier[]{Modifier.PUBLIC}).addParameter(viewTypeName, "mvpView", new Modifier[0]).addExceptions(method.getExceptions()).addStatement("mvpView.$1L($2L)", new Object[]{method.getName(), method.getArgumentsString()}).build());
        for (ParameterSpec parameterSpec : method.getParameters()) {
            addMethod.addField(parameterSpec.type, parameterSpec.name, new Modifier[]{Modifier.PUBLIC, Modifier.FINAL});
        }
        TypeSpec build = addMethod.build();
        Intrinsics.m32178g(build, "classBuilder.build()");
        return build;
    }

    private final MethodSpec generateCommandConstructor(ViewStateMethod method) {
        List<ParameterSpec> parameters = method.getParameters();
        MethodSpec.Builder addStatement = MethodSpec.constructorBuilder().addParameters(parameters).addStatement("super($1S, $2T.class)", new Object[]{method.getStrategy().getTag(), method.getStrategy().getStrategyClass()});
        Intrinsics.m32178g(addStatement, "MethodSpec.constructorBu…d.strategy.strategyClass)");
        if (!parameters.isEmpty()) {
            addStatement.addCode("\n", new Object[0]);
        }
        Iterator<ParameterSpec> it = parameters.iterator();
        while (it.hasNext()) {
            addStatement.addStatement("this.$1N = $1N", new Object[]{it.next()});
        }
        return addStatement.build();
    }

    private final MethodSpec generateMethod(DeclaredType enclosingType, ViewStateMethod method, TypeName viewTypeName, TypeSpec commandClass) {
        String decapitalizeString = Util.decapitalizeString(method.getCommandClassName());
        Intrinsics.m32178g(decapitalizeString, "decapitalizeString(method.commandClassName)");
        while (StringsKt.m33922t(method.getArgumentsString(), decapitalizeString, false, 2, null)) {
            StringBuilder m24u = C0000a.m24u(decapitalizeString);
            m24u.append(decapitalizeString.hashCode() % 10);
            decapitalizeString = m24u.toString();
        }
        String str = "view";
        while (StringsKt.m33922t(method.getArgumentsString(), str, false, 2, null)) {
            StringBuilder m24u2 = C0000a.m24u(str);
            m24u2.append(str.hashCode() % 10);
            str = m24u2.toString();
        }
        return MethodSpec.overriding(method.getElement(), enclosingType, MvpCompiler.INSTANCE.getTypeUtils()).addStatement("$1N $2L = new $1N($3L)", new Object[]{commandClass, decapitalizeString, method.getArgumentsString()}).addStatement("this.viewCommands.beforeApply($1L)", new Object[]{decapitalizeString}).addCode("\n", new Object[0]).beginControlFlow("if (hasNotView())", new Object[0]).addStatement("return", new Object[0]).endControlFlow().addCode("\n", new Object[0]).beginControlFlow(C0000a.m16m("for ($1T ", str, " : this.views)"), new Object[]{viewTypeName}).addStatement(C0000a.m14k(str, ".$1L($2L)"), new Object[]{method.getName(), method.getArgumentsString()}).endControlFlow().addCode("\n", new Object[0]).addStatement("this.viewCommands.afterApply($1L)", new Object[]{decapitalizeString}).build();
    }

    @Override // moxy.compiler.JavaFilesGenerator
    @NotNull
    public List<JavaFile> generate(@NotNull ViewInterfaceInfo viewInterfaceInfo) {
        Intrinsics.m32179h(viewInterfaceInfo, "viewInterfaceInfo");
        ClassName name = viewInterfaceInfo.getName();
        TypeName nameWithTypeVariables = viewInterfaceInfo.getNameWithTypeVariables();
        DeclaredType asDeclaredType = ExtensionsKt.asDeclaredType(viewInterfaceInfo.getElement());
        TypeSpec.Builder addTypeVariables = TypeSpec.classBuilder(Util.getSimpleClassName(viewInterfaceInfo.getElement()) + MvpProcessor.VIEW_STATE_SUFFIX).addOriginatingElement(viewInterfaceInfo.getElement()).addModifiers(new Modifier[]{Modifier.PUBLIC}).superclass(ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(MvpViewState.class)), nameWithTypeVariables)).addSuperinterface(nameWithTypeVariables).addTypeVariables(viewInterfaceInfo.getTypeVariables());
        Intrinsics.m32178g(addTypeVariables, "TypeSpec.classBuilder(ty…erfaceInfo.typeVariables)");
        for (ViewStateMethod viewStateMethod : viewInterfaceInfo.getMethods()) {
            TypeSpec generateCommandClass = generateCommandClass(viewStateMethod, nameWithTypeVariables);
            addTypeVariables.addType(generateCommandClass);
            addTypeVariables.addMethod(generateMethod(asDeclaredType, viewStateMethod, nameWithTypeVariables, generateCommandClass));
        }
        TypeSpec build = addTypeVariables.build();
        Intrinsics.m32178g(build, "classBuilder.build()");
        return CollectionsKt.m31993F(ExtensionsKt.toJavaFile(build, name));
    }
}
