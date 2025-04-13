package moxy.compiler.presenterbinder;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import moxy.MvpPresenter;
import moxy.MvpProcessor;
import moxy.PresenterBinder;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.JavaFilesGenerator;
import moxy.compiler.Util;
import moxy.presenter.PresenterField;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: PresenterBinderClassGenerator.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J(\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u001b\u001a\u00020\u001c*\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u001e"}, m31884d2 = {"Lmoxy/compiler/presenterbinder/PresenterBinderClassGenerator;", "Lmoxy/compiler/JavaFilesGenerator;", "Lmoxy/compiler/presenterbinder/TargetClassInfo;", "()V", "generate", "", "Lcom/squareup/javapoet/JavaFile;", "targetClassInfo", "generateBindMethod", "Lcom/squareup/javapoet/MethodSpec;", "field", "Lmoxy/compiler/presenterbinder/TargetPresenterField;", "targetClassName", "Lcom/squareup/javapoet/ClassName;", "generateGetPresentersMethod", "fields", "containerClassName", "superPresenterBinder", "Ljavax/lang/model/element/TypeElement;", "generateGetTagMethod", "tagProviderMethodName", "", "generatePresenterBinderClass", "Lcom/squareup/javapoet/TypeSpec;", "generatePresenterBinderConstructor", "tag", "generateProvidePresenterMethod", "addOptionalMethod", "Lcom/squareup/javapoet/TypeSpec$Builder;", "methodSpec", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PresenterBinderClassGenerator implements JavaFilesGenerator<TargetClassInfo> {
    private final TypeSpec.Builder addOptionalMethod(TypeSpec.Builder builder, MethodSpec methodSpec) {
        if (methodSpec == null) {
            return builder;
        }
        TypeSpec.Builder addMethod = builder.addMethod(methodSpec);
        Intrinsics.m32178g(addMethod, "addMethod(methodSpec)");
        return addMethod;
    }

    private final MethodSpec generateBindMethod(TargetPresenterField field, ClassName targetClassName) {
        MethodSpec build = MethodSpec.methodBuilder("bind").addAnnotation(Override.class).addModifiers(new Modifier[]{Modifier.PUBLIC}).addParameter((TypeName) targetClassName, "target", new Modifier[0]).addParameter(MvpPresenter.class, "presenter", new Modifier[0]).addStatement("target.$1L = ($2T) presenter", new Object[]{field.getName(), field.getTypeName()}).build();
        Intrinsics.m32178g(build, "MethodSpec.methodBuilder…ame)\n            .build()");
        return build;
    }

    private final MethodSpec generateGetPresentersMethod(List<TargetPresenterField> fields, ClassName containerClassName, TypeElement superPresenterBinder) {
        MethodSpec.Builder addModifiers = MethodSpec.methodBuilder("getPresenterFields").addAnnotation(Override.class).addModifiers(new Modifier[]{Modifier.PUBLIC});
        ClassName className = ExtensionsKt.className(Reflection.m32193a(List.class));
        TypeName parametrizedWith = ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(PresenterField.class)), ExtensionsKt.supertypeWildcard(containerClassName));
        Intrinsics.m32178g(parametrizedWith, "PresenterField::class.cl…d()\n                    )");
        MethodSpec.Builder returns = addModifiers.returns(ExtensionsKt.parametrizedWith(className, parametrizedWith));
        returns.addStatement("$1T<$2T<$3T>> presenters = new $4T<>($5L)", new Object[]{List.class, PresenterField.class, ExtensionsKt.supertypeWildcard(containerClassName), ArrayList.class, Integer.valueOf(fields.size())});
        Iterator<TargetPresenterField> it = fields.iterator();
        while (it.hasNext()) {
            returns.addStatement("presenters.add(new $1L())", new Object[]{it.next().getGeneratedClassName()});
        }
        if (superPresenterBinder != null) {
            returns.addStatement("presenters.addAll(new $1L().getPresenterFields())", new Object[]{superPresenterBinder.getQualifiedName().toString() + MvpProcessor.PRESENTER_BINDER_SUFFIX});
        }
        returns.addStatement("return presenters", new Object[0]);
        MethodSpec build = returns.build();
        Intrinsics.m32178g(build, "builder.build()");
        return build;
    }

    private final MethodSpec generateGetTagMethod(String tagProviderMethodName, ClassName targetClassName) {
        if (tagProviderMethodName != null) {
            return MethodSpec.methodBuilder("getTag").addAnnotation(Override.class).addModifiers(new Modifier[]{Modifier.PUBLIC}).returns(String.class).addParameter((TypeName) targetClassName, "delegated", new Modifier[0]).addStatement("return String.valueOf(delegated.$1L())", new Object[]{tagProviderMethodName}).build();
        }
        return null;
    }

    private final TypeSpec generatePresenterBinderClass(TargetPresenterField field, ClassName targetClassName) {
        String tag = field.getTag();
        if (tag == null) {
            tag = field.getName();
        }
        TypeSpec.Builder addMethod = TypeSpec.classBuilder(field.getGeneratedClassName()).addModifiers(new Modifier[]{Modifier.PUBLIC}).superclass(ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(PresenterField.class)), (TypeName) targetClassName)).addMethod(generatePresenterBinderConstructor(field, tag)).addMethod(generateBindMethod(field, targetClassName)).addMethod(generateProvidePresenterMethod(field, targetClassName));
        Intrinsics.m32178g(addMethod, "TypeSpec.classBuilder(fi…(field, targetClassName))");
        TypeSpec build = addOptionalMethod(addMethod, generateGetTagMethod(field.getPresenterTagProviderMethodName(), targetClassName)).build();
        Intrinsics.m32178g(build, "TypeSpec.classBuilder(fi…me))\n            .build()");
        return build;
    }

    private final MethodSpec generatePresenterBinderConstructor(TargetPresenterField field, String tag) {
        MethodSpec build = MethodSpec.constructorBuilder().addModifiers(new Modifier[]{Modifier.PUBLIC}).addStatement("super($1S, $2S, $3T.class)", new Object[]{tag, field.getPresenterId(), field.getTypeName()}).build();
        Intrinsics.m32178g(build, "MethodSpec.constructorBu…ame)\n            .build()");
        return build;
    }

    private final MethodSpec generateProvidePresenterMethod(TargetPresenterField field, ClassName targetClassName) {
        MethodSpec.Builder addParameter = MethodSpec.methodBuilder("providePresenter").addAnnotation(Override.class).addModifiers(new Modifier[]{Modifier.PUBLIC}).returns(ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(MvpPresenter.class)), ExtensionsKt.subtypeWildcard(Reflection.m32193a(Object.class)))).addParameter((TypeName) targetClassName, "delegated", new Modifier[0]);
        Intrinsics.m32178g(addParameter, "MethodSpec.methodBuilder…etClassName, \"delegated\")");
        if (field.getPresenterProviderMethodName() != null) {
            addParameter.addStatement("return delegated.$1L()", new Object[]{field.getPresenterProviderMethodName()});
        } else if (Util.hasEmptyConstructor(ExtensionsKt.asTypeElement(field.getType()))) {
            addParameter.addStatement("return new $1T()", new Object[]{field.getTypeName()});
        } else {
            addParameter.addStatement("throw new $1T($2S + $3S)", new Object[]{IllegalStateException.class, field.getType(), " hasn't got a default constructor. You can apply @ProvidePresenter to a method which will construct Presenter. Otherwise you can add empty constructor to presenter."});
        }
        MethodSpec build = addParameter.build();
        Intrinsics.m32178g(build, "builder.build()");
        return build;
    }

    @Override // moxy.compiler.JavaFilesGenerator
    @NotNull
    public List<JavaFile> generate(@NotNull TargetClassInfo targetClassInfo) {
        Intrinsics.m32179h(targetClassInfo, "targetClassInfo");
        TypeName name = targetClassInfo.getName();
        List<TargetPresenterField> fields = targetClassInfo.getFields();
        TypeElement superPresenterBinder = targetClassInfo.getSuperPresenterBinder();
        List simpleNames = name.simpleNames();
        Intrinsics.m32178g(simpleNames, "targetClassName.simpleNames()");
        TypeSpec.Builder superclass = TypeSpec.classBuilder(C0000a.m14k(CollectionsKt.m31989B(simpleNames, "$", null, null, 0, null, null, 62, null), MvpProcessor.PRESENTER_BINDER_SUFFIX)).addOriginatingElement(targetClassInfo.getElement()).addModifiers(new Modifier[]{Modifier.PUBLIC}).superclass(ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(PresenterBinder.class)), name));
        Iterator<TargetPresenterField> it = fields.iterator();
        while (it.hasNext()) {
            superclass.addType(generatePresenterBinderClass(it.next(), name));
        }
        superclass.addMethod(generateGetPresentersMethod(fields, name, superPresenterBinder));
        TypeSpec build = superclass.build();
        Intrinsics.m32178g(build, "classBuilder.build()");
        return CollectionsKt.m31993F(ExtensionsKt.toJavaFile(build, (ClassName) name));
    }
}
