package moxy.compiler.viewstate;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.yandex.div2.C3033a;
import java.util.List;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.viewstate.entity.MigrationMethod;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: EmptyStrategyHelperGenerator.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, m31884d2 = {"Lmoxy/compiler/viewstate/EmptyStrategyHelperGenerator;", "", "()V", "generate", "Lcom/squareup/javapoet/JavaFile;", "migrationMethods", "", "Lmoxy/compiler/viewstate/entity/MigrationMethod;", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class EmptyStrategyHelperGenerator {
    public static final EmptyStrategyHelperGenerator INSTANCE = new EmptyStrategyHelperGenerator();

    private EmptyStrategyHelperGenerator() {
    }

    @JvmStatic
    @NotNull
    public static final JavaFile generate(@NotNull List<MigrationMethod> migrationMethods) {
        Intrinsics.m32179h(migrationMethods, "migrationMethods");
        Name simpleName = migrationMethods.get(0).getViewInterface().getSimpleName();
        TypeSpec.Builder addModifiers = TypeSpec.classBuilder("EmptyStrategyHelper").addModifiers(new Modifier[]{Modifier.PUBLIC, Modifier.FINAL});
        addModifiers.addJavadoc(StringsKt.m33916o0("\n            This class is generated because 'enableEmptyStrategyHelper' compiler option is set to true.\n            \n            \n            All view methods must have a strategy. Please, add the @StateStrategyType annotation\n            to the methods listed below. You can also set this annotation directly to the View interface.\n            \n            Do not pay attention to compilation errors like\n            'error: " + simpleName + " is abstract; cannot be instantiated'\n            \n            Just use your IDE to navigate to the methods and set the required strategy for them.\n            After you've fixed all the methods, you can remove 'enableEmptyStrategyHelper' option\n            for the current module.\n            \n        "), new Object[0]);
        MethodSpec.Builder addModifiers2 = MethodSpec.methodBuilder("getViewStateProviders").addModifiers(new Modifier[]{Modifier.PUBLIC, Modifier.STATIC});
        addModifiers2.addComment("If you are using Intellij IDEA or Android Studio, use Go to declaration (Ctrl/⌘+B or Ctrl/⌘+Click)", new Object[0]);
        StringBuilder m24u = C0000a.m24u("to navigate to '");
        m24u.append(((MigrationMethod) CollectionsKt.m32044u(migrationMethods)).getMethod().getSimpleName());
        m24u.append("()'");
        addModifiers2.addComment(m24u.toString(), new Object[0]);
        for (MigrationMethod migrationMethod : migrationMethods) {
            addModifiers2.addStatement(C3033a.m17745g(new Object[]{migrationMethod.getViewInterface().getQualifiedName(), migrationMethod.getMethod().getSimpleName()}, 2, "new %s().%s()", "java.lang.String.format(this, *args)"), new Object[0]);
        }
        addModifiers.addMethod(addModifiers2.build());
        TypeSpec build = addModifiers.build();
        Intrinsics.m32178g(build, "classBuilder.build()");
        return ExtensionsKt.toJavaFile(build, "moxy");
    }
}
