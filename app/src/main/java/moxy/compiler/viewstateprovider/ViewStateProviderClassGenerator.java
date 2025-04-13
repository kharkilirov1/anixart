package moxy.compiler.viewstateprovider;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.util.List;
import javax.lang.model.element.Modifier;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import moxy.MvpProcessor;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.JavaFilesGenerator;
import moxy.viewstate.MvpViewState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ViewStateProviderClassGenerator.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002¨\u0006\r"}, m31884d2 = {"Lmoxy/compiler/viewstateprovider/ViewStateProviderClassGenerator;", "Lmoxy/compiler/JavaFilesGenerator;", "Lmoxy/compiler/viewstateprovider/PresenterInfo;", "()V", "generate", "", "Lcom/squareup/javapoet/JavaFile;", "presenterInfo", "generateGetViewStateMethod", "Lcom/squareup/javapoet/MethodSpec;", "presenter", "Lcom/squareup/javapoet/ClassName;", "viewState", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ViewStateProviderClassGenerator implements JavaFilesGenerator<PresenterInfo> {
    private final MethodSpec generateGetViewStateMethod(PresenterInfo presenterInfo) {
        return generateGetViewStateMethod(presenterInfo.getName(), presenterInfo.getViewStateName());
    }

    private final MethodSpec generateGetViewStateMethod(ClassName presenter, ClassName viewState) {
        MethodSpec.Builder returns = MethodSpec.methodBuilder("getViewState").addAnnotation(Override.class).addModifiers(new Modifier[]{Modifier.PUBLIC}).returns(ExtensionsKt.parametrizedWith(ExtensionsKt.className(Reflection.m32193a(MvpViewState.class)), ExtensionsKt.subtypeWildcard(Reflection.m32193a(MvpView.class))));
        if (viewState == null) {
            returns.addStatement("throw new RuntimeException($1S)", new Object[]{C0000a.m20q(new StringBuilder(), presenter.reflectionName(), " should have view")});
        } else {
            returns.addStatement("return new $1T()", new Object[]{viewState});
        }
        MethodSpec build = returns.build();
        Intrinsics.m32178g(build, "MethodSpec.methodBuilder…   }\n            .build()");
        return build;
    }

    @Override // moxy.compiler.JavaFilesGenerator
    @NotNull
    public List<JavaFile> generate(@Nullable PresenterInfo presenterInfo) {
        if (presenterInfo == null) {
            return EmptyList.f63144b;
        }
        String m20q = C0000a.m20q(new StringBuilder(), presenterInfo.getName().simpleName(), MvpProcessor.VIEW_STATE_PROVIDER_SUFFIX);
        for (ClassName enclosingClassName = presenterInfo.getName().enclosingClassName(); enclosingClassName != null; enclosingClassName = enclosingClassName.enclosingClassName()) {
            m20q = enclosingClassName.simpleName() + '$' + m20q;
        }
        TypeSpec typeSpec = TypeSpec.classBuilder(m20q).addOriginatingElement(presenterInfo.getElement()).addModifiers(new Modifier[]{Modifier.PUBLIC}).superclass(ViewStateProvider.class).addMethod(generateGetViewStateMethod(presenterInfo)).build();
        Intrinsics.m32178g(typeSpec, "typeSpec");
        return CollectionsKt.m31993F(ExtensionsKt.toJavaFile(typeSpec, presenterInfo.getName()));
    }
}
