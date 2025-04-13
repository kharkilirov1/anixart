package moxy.compiler.viewstate;

import com.squareup.javapoet.JavaFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import moxy.compiler.ElementProcessor;
import moxy.compiler.ExtensionsKt;
import moxy.compiler.MvpCompiler;
import moxy.compiler.viewstate.entity.MigrationMethod;
import moxy.compiler.viewstate.entity.StrategyWithTag;
import moxy.compiler.viewstate.entity.ViewInterfaceInfo;
import moxy.compiler.viewstate.entity.ViewInterfaceMethod;
import moxy.compiler.viewstate.entity.ViewStateMethod;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ViewInterfaceProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0012H\u0002J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0012H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001e\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0002J\"\u0010)\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00122\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010,\u001a\u0004\u0018\u00010-J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0002J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0016\u00104\u001a\u00020\u00102\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\f\u00106\u001a\u00020\b*\u00020\"H\u0002J\f\u00107\u001a\u00020\u0005*\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0002X\u0082.¢\u0006\u0002\n\u0000¨\u00069"}, m31884d2 = {"Lmoxy/compiler/viewstate/ViewInterfaceProcessor;", "Lmoxy/compiler/ElementProcessor;", "Ljavax/lang/model/element/TypeElement;", "Lmoxy/compiler/viewstate/entity/ViewInterfaceInfo;", "disableEmptyStrategyCheck", "", "enableEmptyStrategyHelper", "defaultStrategy", "", "(ZZLjava/lang/String;)V", "frameworkDefaultStrategy", "migrationMethods", "", "Lmoxy/compiler/viewstate/entity/MigrationMethod;", "viewInterfaceElement", "addUniqueSuffixToMethodsWithTheSameName", "", "methods", "", "Lmoxy/compiler/viewstate/entity/ViewStateMethod;", "combineMethods", "", "Lmoxy/compiler/viewstate/entity/ViewInterfaceMethod;", "superInterfaces", "combineMethodsFromSuperinterfaces", "superInterfaceMethods", "getEnclosedMethods", "viewInterface", "getInterfaceStateStrategyType", "getMethods", "element", "getStateStrategy", "Lmoxy/compiler/viewstate/entity/StrategyWithTag;", "methodElement", "Ljavax/lang/model/element/ExecutableElement;", "getStateStrategyAnnotation", "Ljavax/lang/model/element/AnnotationMirror;", "Ljavax/lang/model/element/Element;", "getTypeAndValidateGenerics", "interfaceMirror", "Ljavax/lang/model/type/TypeMirror;", "getViewMethod", "viewInterfaceStrategyType", "iterateInterfaces", "makeMigrationHelper", "Lcom/squareup/javapoet/JavaFile;", "process", "reportEmptyStrategy", "reportSuperinterfaceMethodsClash", "methodA", "methodB", "validateForEmptyStrategies", "validateSuperInterfaceMethodClashes", "viewInterfaceMethods", "defaultTag", "isStatic", "Companion", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ViewInterfaceProcessor implements ElementProcessor<TypeElement, ViewInterfaceInfo> {
    private static final TypeElement DEFAULT_STATE_STRATEGY;
    private static final String OPTION_DEFAULT_STRATEGY = "defaultMoxyStrategy";
    private final boolean disableEmptyStrategyCheck;
    private final boolean enableEmptyStrategyHelper;
    private final TypeElement frameworkDefaultStrategy;
    private final List<MigrationMethod> migrationMethods = new ArrayList();
    private TypeElement viewInterfaceElement;

    static {
        TypeElement typeElement = MvpCompiler.INSTANCE.getElementUtils().getTypeElement("moxy.viewstate.strategy.AddToEndSingleStrategy");
        Intrinsics.m32178g(typeElement, "elementUtils.getTypeElem…class.java.canonicalName)");
        DEFAULT_STATE_STRATEGY = typeElement;
    }

    public ViewInterfaceProcessor(boolean z, boolean z2, @Nullable String str) {
        this.disableEmptyStrategyCheck = z;
        this.enableEmptyStrategyHelper = z2;
        if (str == null) {
            this.frameworkDefaultStrategy = DEFAULT_STATE_STRATEGY;
            return;
        }
        MvpCompiler.Companion companion = MvpCompiler.INSTANCE;
        TypeElement typeElement = companion.getElementUtils().getTypeElement(str);
        if (typeElement == null) {
            companion.getMessager().printMessage(Diagnostic.Kind.ERROR, C0000a.m16m("Unable to parse option 'defaultMoxyStrategy'. Check ", str, " exists"));
            typeElement = DEFAULT_STATE_STRATEGY;
        }
        this.frameworkDefaultStrategy = typeElement;
    }

    private final void addUniqueSuffixToMethodsWithTheSameName(List<ViewStateMethod> methods) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ViewStateMethod viewStateMethod : methods) {
            Integer num = (Integer) linkedHashMap.get(viewStateMethod.getName());
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                viewStateMethod.setUniqueSuffix(String.valueOf(intValue));
            }
            linkedHashMap.put(viewStateMethod.getName(), Integer.valueOf(intValue + 1));
        }
    }

    private final Set<ViewInterfaceMethod> combineMethods(Set<ViewInterfaceMethod> methods, List<? extends Set<ViewInterfaceMethod>> superInterfaces) {
        return SetsKt.m32077d(methods, combineMethodsFromSuperinterfaces(superInterfaces));
    }

    private final Set<ViewInterfaceMethod> combineMethodsFromSuperinterfaces(List<? extends Set<ViewInterfaceMethod>> superInterfaceMethods) {
        LinkedHashSet<ViewInterfaceMethod> linkedHashSet = new LinkedHashSet();
        Iterator<? extends Set<ViewInterfaceMethod>> it = superInterfaceMethods.iterator();
        while (it.hasNext()) {
            for (ViewInterfaceMethod viewInterfaceMethod : it.next()) {
                if (!linkedHashSet.add(viewInterfaceMethod)) {
                    for (ViewInterfaceMethod viewInterfaceMethod2 : linkedHashSet) {
                        if (Intrinsics.m32174c(viewInterfaceMethod2, viewInterfaceMethod)) {
                            viewInterfaceMethod2.setSuperInterfaceClash(viewInterfaceMethod);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        return linkedHashSet;
    }

    private final String defaultTag(ExecutableElement executableElement) {
        return executableElement.getSimpleName().toString();
    }

    private final Set<ViewInterfaceMethod> getEnclosedMethods(TypeElement viewInterface) {
        TypeElement interfaceStateStrategyType = getInterfaceStateStrategyType(viewInterface);
        List enclosedElements = viewInterface.getEnclosedElements();
        Intrinsics.m32178g(enclosedElements, "viewInterface.enclosedElements");
        ArrayList<Element> arrayList = new ArrayList();
        for (Object obj : enclosedElements) {
            Element it = (Element) obj;
            Intrinsics.m32178g(it, "it");
            if (it.getKind() == ElementKind.METHOD && !isStatic(it)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        for (Element element : arrayList) {
            Objects.requireNonNull(element, "null cannot be cast to non-null type javax.lang.model.element.ExecutableElement");
            arrayList2.add(getViewMethod((ExecutableElement) element, viewInterface, interfaceStateStrategyType));
        }
        return CollectionsKt.m32035n0(arrayList2);
    }

    private final TypeElement getInterfaceStateStrategyType(TypeElement viewInterface) {
        AnnotationMirror stateStrategyAnnotation = getStateStrategyAnnotation((Element) viewInterface);
        TypeMirror valueAsTypeMirror = stateStrategyAnnotation != null ? ExtensionsKt.getValueAsTypeMirror(stateStrategyAnnotation, ViewInterfaceProcessor$getInterfaceStateStrategyType$value$1.INSTANCE) : null;
        if (valueAsTypeMirror == null || valueAsTypeMirror.getKind() != TypeKind.DECLARED) {
            return null;
        }
        return ExtensionsKt.asTypeElement(valueAsTypeMirror);
    }

    private final Set<ViewInterfaceMethod> getMethods(TypeElement element) {
        return combineMethods(getEnclosedMethods(element), iterateInterfaces(element));
    }

    private final StrategyWithTag getStateStrategy(ExecutableElement methodElement) {
        TypeMirror valueAsTypeMirror;
        AnnotationMirror stateStrategyAnnotation = getStateStrategyAnnotation((Element) methodElement);
        if (stateStrategyAnnotation == null || (valueAsTypeMirror = ExtensionsKt.getValueAsTypeMirror(stateStrategyAnnotation, C6865xe39d9c5b.INSTANCE)) == null) {
            return null;
        }
        TypeElement asTypeElement = ExtensionsKt.asTypeElement(valueAsTypeMirror);
        String valueAsString = ExtensionsKt.getValueAsString(stateStrategyAnnotation, ViewInterfaceProcessor$getStateStrategy$tag$1.INSTANCE);
        if (valueAsString == null) {
            valueAsString = defaultTag(methodElement);
        }
        return new StrategyWithTag(asTypeElement, valueAsString);
    }

    private final AnnotationMirror getStateStrategyAnnotation(Element element) {
        List m31995H = CollectionsKt.m31995H(ExtensionsKt.getAnnotationMirror(element, Reflection.m32193a(StateStrategyType.class)));
        List<AnnotationMirror> annotationMirrors = element.getAnnotationMirrors();
        Intrinsics.m32178g(annotationMirrors, "element.annotationMirrors");
        ArrayList arrayList = new ArrayList();
        for (AnnotationMirror it : annotationMirrors) {
            Intrinsics.m32178g(it, "it");
            TypeMirror annotationType = it.getAnnotationType();
            Intrinsics.m32178g(annotationType, "it.annotationType");
            AnnotationMirror annotationMirror = ExtensionsKt.getAnnotationMirror(ExtensionsKt.asTypeElement(annotationType), Reflection.m32193a(StateStrategyType.class));
            if (annotationMirror != null) {
                arrayList.add(annotationMirror);
            }
        }
        List m32002O = CollectionsKt.m32002O(m31995H, arrayList);
        if (m32002O.size() > 1) {
            if (element instanceof ExecutableElement) {
                Messager messager = MvpCompiler.INSTANCE.getMessager();
                Diagnostic.Kind kind = Diagnostic.Kind.ERROR;
                StringBuilder sb = new StringBuilder();
                sb.append("There's more than one state strategy type defined for method ");
                sb.append('\'');
                ExecutableElement executableElement = (ExecutableElement) element;
                sb.append(executableElement.getSimpleName());
                sb.append('(');
                List parameters = executableElement.getParameters();
                Intrinsics.m32178g(parameters, "element.parameters");
                C0000a.m1B(sb, CollectionsKt.m31989B(parameters, null, null, null, 0, null, new Function1<VariableElement, CharSequence>() { // from class: moxy.compiler.viewstate.ViewInterfaceProcessor$getStateStrategyAnnotation$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final CharSequence invoke(VariableElement variableElement) {
                        return variableElement.asType().toString();
                    }
                }, 31, null), ")'", " in interface '");
                sb.append(executableElement.getEnclosingElement().asType());
                sb.append('\'');
                messager.printMessage(kind, sb.toString(), element);
            } else if (element instanceof TypeElement) {
                MvpCompiler.INSTANCE.getMessager().printMessage(Diagnostic.Kind.ERROR, "There's more than one state strategy type defined for '" + ((TypeElement) element).getSimpleName() + '\'', element);
            }
        }
        return (AnnotationMirror) CollectionsKt.m32046w(m32002O);
    }

    private final TypeElement getTypeAndValidateGenerics(TypeMirror interfaceMirror) {
        TypeElement asTypeElement = ExtensionsKt.asTypeElement(interfaceMirror);
        if (((DeclaredType) interfaceMirror).getTypeArguments().size() <= asTypeElement.getTypeParameters().size()) {
            return asTypeElement;
        }
        StringBuilder m24u = C0000a.m24u("Code generation for the interface ");
        m24u.append(asTypeElement.getSimpleName());
        m24u.append(" failed. Simplify your generics.");
        throw new IllegalArgumentException(m24u.toString().toString());
    }

    private final ViewInterfaceMethod getViewMethod(ExecutableElement methodElement, TypeElement viewInterface, TypeElement viewInterfaceStrategyType) {
        TypeMirror returnType = methodElement.getReturnType();
        Intrinsics.m32178g(returnType, "methodElement.returnType");
        if (returnType.getKind() != TypeKind.VOID) {
            StringBuilder m24u = C0000a.m24u("You are trying to generate ViewState for ");
            m24u.append(viewInterface.getSimpleName());
            m24u.append(". ");
            m24u.append("But ");
            m24u.append(viewInterface.getSimpleName());
            m24u.append(" contains non-void method \"");
            m24u.append(methodElement.getSimpleName());
            m24u.append("\" ");
            m24u.append("with the return type of ");
            m24u.append(methodElement.getReturnType());
            m24u.append('.');
            MvpCompiler.INSTANCE.getMessager().printMessage(Diagnostic.Kind.ERROR, m24u.toString(), (Element) methodElement);
        }
        StrategyWithTag stateStrategy = getStateStrategy(methodElement);
        if (stateStrategy == null) {
            stateStrategy = viewInterfaceStrategyType != null ? new StrategyWithTag(viewInterfaceStrategyType, defaultTag(methodElement)) : null;
        }
        Element element = this.viewInterfaceElement;
        if (element != null) {
            return new ViewInterfaceMethod(ExtensionsKt.asDeclaredType(element), ExtensionsKt.asDeclaredType((Element) viewInterface), methodElement, stateStrategy);
        }
        Intrinsics.m32189r("viewInterfaceElement");
        throw null;
    }

    private final boolean isStatic(Element element) {
        return element.getModifiers().contains(Modifier.STATIC);
    }

    private final List<Set<ViewInterfaceMethod>> iterateInterfaces(TypeElement viewInterface) {
        List<TypeMirror> interfaces = viewInterface.getInterfaces();
        Intrinsics.m32178g(interfaces, "viewInterface.interfaces");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(interfaces, 10));
        for (TypeMirror it : interfaces) {
            Intrinsics.m32178g(it, "it");
            arrayList.add(getTypeAndValidateGenerics(it));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getMethods((TypeElement) it2.next()));
        }
        return arrayList2;
    }

    private final void reportEmptyStrategy(ExecutableElement methodElement) {
        if (this.disableEmptyStrategyCheck) {
            return;
        }
        if (!this.enableEmptyStrategyHelper) {
            MvpCompiler.INSTANCE.getMessager().printMessage(Diagnostic.Kind.ERROR, "A View method has no strategy! Add @StateStrategyType annotation to this method, or to the View interface. You can also specify default strategy via compiler option.", (Element) methodElement);
            return;
        }
        List<MigrationMethod> list = this.migrationMethods;
        TypeElement typeElement = this.viewInterfaceElement;
        if (typeElement != null) {
            list.add(new MigrationMethod(typeElement, methodElement));
        } else {
            Intrinsics.m32189r("viewInterfaceElement");
            throw null;
        }
    }

    private final void reportSuperinterfaceMethodsClash(ViewInterfaceMethod methodA, ViewInterfaceMethod methodB) {
        if (!(!Intrinsics.m32174c(methodA.getStrategy(), methodB.getStrategy())) || methodA.getStrategy() == null || methodB.getStrategy() == null) {
            return;
        }
        Messager messager = MvpCompiler.INSTANCE.getMessager();
        Diagnostic.Kind kind = Diagnostic.Kind.ERROR;
        StringBuilder m24u = C0000a.m24u("Strategy clash in superinterfaces of ");
        TypeElement typeElement = this.viewInterfaceElement;
        if (typeElement == null) {
            Intrinsics.m32189r("viewInterfaceElement");
            throw null;
        }
        m24u.append(typeElement);
        m24u.append(". ");
        m24u.append("Interface ");
        m24u.append(methodB.getEnclosingInterfaceElement().toString());
        m24u.append(" defines ");
        m24u.append(methodB.getSignature());
        m24u.append(' ');
        m24u.append("with strategy ");
        m24u.append(methodB.getStrategy().getStrategyClass().getSimpleName());
        m24u.append(", ");
        m24u.append("but ");
        m24u.append(methodA.getEnclosingInterfaceElement().toString());
        m24u.append(" defines this method ");
        m24u.append("with strategy ");
        m24u.append(methodA.getStrategy().getStrategyClass().getSimpleName());
        m24u.append(". ");
        m24u.append("Override this method in ");
        TypeElement typeElement2 = this.viewInterfaceElement;
        if (typeElement2 == null) {
            Intrinsics.m32189r("viewInterfaceElement");
            throw null;
        }
        m24u.append(typeElement2);
        m24u.append(" to choose appropriate strategy");
        String sb = m24u.toString();
        Element element = this.viewInterfaceElement;
        if (element != null) {
            messager.printMessage(kind, sb, element);
        } else {
            Intrinsics.m32189r("viewInterfaceElement");
            throw null;
        }
    }

    private final List<ViewStateMethod> validateForEmptyStrategies(Set<ViewInterfaceMethod> methods) {
        ViewStateMethod viewMethod;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(methods, 10));
        for (ViewInterfaceMethod viewInterfaceMethod : methods) {
            if (viewInterfaceMethod.getStrategy() == null) {
                reportEmptyStrategy(viewInterfaceMethod.getMethodElement());
                viewMethod = viewInterfaceMethod.toViewMethod(new StrategyWithTag(this.frameworkDefaultStrategy, defaultTag(viewInterfaceMethod.getMethodElement())));
            } else {
                viewMethod = viewInterfaceMethod.toViewMethod();
            }
            arrayList.add(viewMethod);
        }
        return arrayList;
    }

    private final void validateSuperInterfaceMethodClashes(Set<ViewInterfaceMethod> viewInterfaceMethods) {
        for (ViewInterfaceMethod viewInterfaceMethod : viewInterfaceMethods) {
            ViewInterfaceMethod superInterfaceClash = viewInterfaceMethod.getSuperInterfaceClash();
            if (superInterfaceClash != null) {
                reportSuperinterfaceMethodsClash(superInterfaceClash, viewInterfaceMethod);
            }
        }
    }

    @Nullable
    public final JavaFile makeMigrationHelper() {
        if (this.enableEmptyStrategyHelper && (!this.migrationMethods.isEmpty())) {
            return EmptyStrategyHelperGenerator.generate(this.migrationMethods);
        }
        return null;
    }

    @Override // moxy.compiler.ElementProcessor
    @NotNull
    public ViewInterfaceInfo process(@NotNull TypeElement element) {
        Intrinsics.m32179h(element, "element");
        this.viewInterfaceElement = element;
        Set<ViewInterfaceMethod> methods = getMethods(element);
        validateSuperInterfaceMethodClashes(methods);
        List<ViewStateMethod> validateForEmptyStrategies = validateForEmptyStrategies(methods);
        addUniqueSuffixToMethodsWithTheSameName(validateForEmptyStrategies);
        return new ViewInterfaceInfo(element, CollectionsKt.m32027j0(validateForEmptyStrategies));
    }
}
