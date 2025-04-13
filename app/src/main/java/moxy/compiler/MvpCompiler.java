package moxy.compiler;

import com.squareup.javapoet.JavaFile;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.compiler.presenterbinder.InjectPresenterProcessor;
import moxy.compiler.presenterbinder.PresenterBinderClassGenerator;
import moxy.compiler.viewstate.ViewInterfaceProcessor;
import moxy.compiler.viewstate.ViewStateClassGenerator;
import moxy.compiler.viewstateprovider.InjectViewStateProcessor;
import moxy.compiler.viewstateprovider.ViewStateProviderClassGenerator;
import moxy.presenter.InjectPresenter;
import net.ltgt.gradle.incap.IncrementalAnnotationProcessorType;
import org.jetbrains.annotations.NotNull;

/* compiled from: MvpCompiler.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JJ\u0010\u0015\u001a\u00020\r\"\b\b\u0000\u0010\u0016*\u00020\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00180\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001fH\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\rH\u0002J\u001e\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016JZ\u0010.\u001a\u00020\r\"\b\b\u0000\u0010\u0016*\u00020\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u000201002\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00180\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001fH\u0002J\u0010\u00102\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u00064"}, m31884d2 = {"Lmoxy/compiler/MvpCompiler;", "Ljavax/annotation/processing/AbstractProcessor;", "()V", "defaultStrategy", "", "getDefaultStrategy", "()Ljava/lang/String;", "isIsolatingProcessingEnabled", "", "()Z", "isIsolatingProcessingEnabled$delegate", "Lkotlin/Lazy;", "checkInjectors", "", "roundEnv", "Ljavax/annotation/processing/RoundEnvironment;", "annotationRule", "Lmoxy/compiler/AnnotationRule;", "createSourceFile", "file", "Lcom/squareup/javapoet/JavaFile;", "generateCode", "E", "Ljavax/lang/model/element/Element;", "R", "element", "kind", "Ljavax/lang/model/element/ElementKind;", "processor", "Lmoxy/compiler/ElementProcessor;", "classGenerator", "Lmoxy/compiler/JavaFilesGenerator;", "getSupportedAnnotationTypes", "", "getSupportedOptions", "getSupportedSourceVersion", "Ljavax/lang/model/SourceVersion;", "init", "processingEnv", "Ljavax/annotation/processing/ProcessingEnvironment;", "isOptionEnabled", "option", "printIsolatingOptionWarning", "process", "annotations", "Ljavax/lang/model/element/TypeElement;", "processInjectors", "clazz", "Ljava/lang/Class;", "", "throwableProcess", "Companion", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MvpCompiler extends AbstractProcessor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_MOXY_STRATEGY = "defaultMoxyStrategy";
    private static final String OPTION_DISABLE_EMPTY_STRATEGY_CHECK = "disableEmptyStrategyCheck";
    private static final String OPTION_ENABLE_EMPTY_STRATEGY_HELPER = "enableEmptyStrategyHelper";
    private static final String OPTION_ENABLE_ISOLATING_PROCESSING = "moxyEnableIsolatingProcessing";

    @NotNull
    private static Elements elementUtils;

    @NotNull
    private static Messager messager;

    @NotNull
    private static Map<String, String> options;

    @NotNull
    private static Types typeUtils;

    /* renamed from: isIsolatingProcessingEnabled$delegate, reason: from kotlin metadata */
    private final Lazy isIsolatingProcessingEnabled = LazyKt.m31881b(new Function0<Boolean>() { // from class: moxy.compiler.MvpCompiler$isIsolatingProcessingEnabled$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            boolean isOptionEnabled;
            isOptionEnabled = MvpCompiler.this.isOptionEnabled("moxyEnableIsolatingProcessing");
            return isOptionEnabled;
        }
    });

    /* compiled from: MvpCompiler.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@BX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@BX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015@BX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@BX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m31884d2 = {"Lmoxy/compiler/MvpCompiler$Companion;", "", "()V", "DEFAULT_MOXY_STRATEGY", "", "OPTION_DISABLE_EMPTY_STRATEGY_CHECK", "OPTION_ENABLE_EMPTY_STRATEGY_HELPER", "OPTION_ENABLE_ISOLATING_PROCESSING", "<set-?>", "Ljavax/lang/model/util/Elements;", "elementUtils", "getElementUtils", "()Ljavax/lang/model/util/Elements;", "setElementUtils", "(Ljavax/lang/model/util/Elements;)V", "Ljavax/annotation/processing/Messager;", "messager", "getMessager", "()Ljavax/annotation/processing/Messager;", "setMessager", "(Ljavax/annotation/processing/Messager;)V", "", "options", "getOptions", "()Ljava/util/Map;", "setOptions", "(Ljava/util/Map;)V", "Ljavax/lang/model/util/Types;", "typeUtils", "getTypeUtils", "()Ljavax/lang/model/util/Types;", "setTypeUtils", "(Ljavax/lang/model/util/Types;)V", "moxy-compiler"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setElementUtils(Elements elements) {
            MvpCompiler.elementUtils = elements;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setMessager(Messager messager) {
            MvpCompiler.messager = messager;
        }

        private final void setOptions(Map<String, String> map) {
            MvpCompiler.options = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setTypeUtils(Types types) {
            MvpCompiler.typeUtils = types;
        }

        @JvmStatic
        @NotNull
        public final Elements getElementUtils() {
            Elements elements = MvpCompiler.elementUtils;
            if (elements != null) {
                return elements;
            }
            Intrinsics.m32189r("elementUtils");
            throw null;
        }

        @JvmStatic
        @NotNull
        public final Messager getMessager() {
            Messager messager = MvpCompiler.messager;
            if (messager != null) {
                return messager;
            }
            Intrinsics.m32189r("messager");
            throw null;
        }

        @NotNull
        public final Map<String, String> getOptions() {
            Map<String, String> map = MvpCompiler.options;
            if (map != null) {
                return map;
            }
            Intrinsics.m32189r("options");
            throw null;
        }

        @JvmStatic
        @NotNull
        public final Types getTypeUtils() {
            Types types = MvpCompiler.typeUtils;
            if (types != null) {
                return types;
            }
            Intrinsics.m32189r("typeUtils");
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void checkInjectors(RoundEnvironment roundEnv, AnnotationRule annotationRule) {
        Iterator it = roundEnv.getElementsAnnotatedWith(InjectPresenter.class).iterator();
        while (it.hasNext()) {
            annotationRule.checkAnnotation((Element) it.next());
        }
        String errorStack = annotationRule.getErrorStack();
        if (errorStack != null) {
            if (errorStack.length() > 0) {
                Messager messager2 = messager;
                if (messager2 != null) {
                    messager2.printMessage(Diagnostic.Kind.ERROR, errorStack);
                } else {
                    Intrinsics.m32189r("messager");
                    throw null;
                }
            }
        }
    }

    private final void createSourceFile(JavaFile file) {
        try {
            ProcessingEnvironment processingEnv = this.processingEnv;
            Intrinsics.m32178g(processingEnv, "processingEnv");
            file.writeTo(processingEnv.getFiler());
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private final <E extends Element, R> void generateCode(Element element, ElementKind kind, ElementProcessor<E, R> processor, JavaFilesGenerator<R> classGenerator) {
        if (element.getKind() != kind) {
            Messager messager2 = messager;
            if (messager2 == null) {
                Intrinsics.m32189r("messager");
                throw null;
            }
            messager2.printMessage(Diagnostic.Kind.ERROR, element + " must be " + kind.name(), element);
        }
        R process = processor.process(element);
        if (process != null) {
            for (JavaFile file : classGenerator.generate(process)) {
                Intrinsics.m32178g(file, "file");
                createSourceFile(file);
            }
        }
    }

    private final String getDefaultStrategy() {
        Map<String, String> map = options;
        if (map != null) {
            return map.get(DEFAULT_MOXY_STRATEGY);
        }
        Intrinsics.m32189r("options");
        throw null;
    }

    @JvmStatic
    @NotNull
    public static final Elements getElementUtils() {
        Elements elements = elementUtils;
        if (elements != null) {
            return elements;
        }
        Intrinsics.m32189r("elementUtils");
        throw null;
    }

    @JvmStatic
    @NotNull
    public static final Messager getMessager() {
        Messager messager2 = messager;
        if (messager2 != null) {
            return messager2;
        }
        Intrinsics.m32189r("messager");
        throw null;
    }

    @JvmStatic
    @NotNull
    public static final Types getTypeUtils() {
        Types types = typeUtils;
        if (types != null) {
            return types;
        }
        Intrinsics.m32189r("typeUtils");
        throw null;
    }

    private final boolean isIsolatingProcessingEnabled() {
        return ((Boolean) this.isIsolatingProcessingEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOptionEnabled(String option) {
        Map<String, String> map = options;
        if (map == null) {
            Intrinsics.m32189r("options");
            throw null;
        }
        String str = map.get(option);
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    private final void printIsolatingOptionWarning() {
        Messager messager2 = messager;
        if (messager2 != null) {
            messager2.printMessage(Diagnostic.Kind.NOTE, "Isolating annotation processor mode was enabled for Moxy.\nThis option is experimental for now. We are pretty sure it should work correctly but we are not 100% sure.\n\nIf you'll notice problems after enabling this option such as:\n- ViewState is not being recompiled after you change your view interface\n- ViewState is not being compiled at all after you change your view interface\nplease report them using https://github.com/moxy-community/Moxy/issues/new.\n\nIn the same time to fix such problems while waiting for fix on our side you have two options:\n1. Just disable isolating mode. This will switch Moxy processor back to aggregating mode, so incremental compilation will be ok. This could hurt you compilation time a bit, hopefully not very much.\n2. Do clean build. This will force Gradle to recompile all generated sources from scratch. Sure, this is also bad for compilation time.\n\nHopefully we will enable isolating annotation processor mode by default after several releases. ");
        } else {
            Intrinsics.m32189r("messager");
            throw null;
        }
    }

    private final <E extends Element, R> void processInjectors(RoundEnvironment roundEnv, Class<? extends Annotation> clazz, ElementKind kind, ElementProcessor<E, R> processor, JavaFilesGenerator<R> classGenerator) {
        for (Element element : roundEnv.getElementsAnnotatedWith(clazz)) {
            Intrinsics.m32178g(element, "element");
            if (element.getKind() != kind) {
                Messager messager2 = messager;
                if (messager2 == null) {
                    Intrinsics.m32189r("messager");
                    throw null;
                }
                messager2.printMessage(Diagnostic.Kind.ERROR, element + " must be " + kind.name() + ", or do not annotate it with @" + clazz.getSimpleName(), element);
            }
            generateCode(element, kind, processor, classGenerator);
        }
    }

    private final boolean throwableProcess(RoundEnvironment roundEnv) {
        checkInjectors(roundEnv, new PresenterInjectorRules(ElementKind.FIELD, Modifier.PUBLIC, Modifier.DEFAULT));
        InjectViewStateProcessor injectViewStateProcessor = new InjectViewStateProcessor();
        ViewStateProviderClassGenerator viewStateProviderClassGenerator = new ViewStateProviderClassGenerator();
        InjectPresenterProcessor injectPresenterProcessor = new InjectPresenterProcessor();
        PresenterBinderClassGenerator presenterBinderClassGenerator = new PresenterBinderClassGenerator();
        ViewInterfaceProcessor viewInterfaceProcessor = new ViewInterfaceProcessor(isOptionEnabled(OPTION_DISABLE_EMPTY_STRATEGY_CHECK), isOptionEnabled(OPTION_ENABLE_EMPTY_STRATEGY_HELPER), getDefaultStrategy());
        ViewStateClassGenerator viewStateClassGenerator = new ViewStateClassGenerator();
        processInjectors(roundEnv, InjectViewState.class, ElementKind.CLASS, injectViewStateProcessor, viewStateProviderClassGenerator);
        processInjectors(roundEnv, InjectPresenter.class, ElementKind.FIELD, injectPresenterProcessor, presenterBinderClassGenerator);
        Iterator<TypeElement> it = injectViewStateProcessor.getUsedViews().iterator();
        while (it.hasNext()) {
            generateCode((Element) it.next(), ElementKind.INTERFACE, viewInterfaceProcessor, viewStateClassGenerator);
        }
        JavaFile makeMigrationHelper = viewInterfaceProcessor.makeMigrationHelper();
        if (makeMigrationHelper != null) {
            createSourceFile(makeMigrationHelper);
        }
        return true;
    }

    @NotNull
    public Set<String> getSupportedAnnotationTypes() {
        return SetsKt.m32080g(InjectPresenter.class.getCanonicalName(), InjectViewState.class.getCanonicalName());
    }

    @NotNull
    public Set<String> getSupportedOptions() {
        String gradleIncrementalProcessingTypeOption = (isIsolatingProcessingEnabled() ? IncrementalAnnotationProcessorType.ISOLATING : IncrementalAnnotationProcessorType.AGGREGATING).getProcessorOption();
        Intrinsics.m32178g(gradleIncrementalProcessingTypeOption, "gradleIncrementalProcessingTypeOption");
        return SetsKt.m32080g(OPTION_ENABLE_EMPTY_STRATEGY_HELPER, DEFAULT_MOXY_STRATEGY, OPTION_DISABLE_EMPTY_STRATEGY_CHECK, OPTION_ENABLE_ISOLATING_PROCESSING, gradleIncrementalProcessingTypeOption);
    }

    @NotNull
    public SourceVersion getSupportedSourceVersion() {
        SourceVersion latestSupported = SourceVersion.latestSupported();
        Intrinsics.m32178g(latestSupported, "latestSupported()");
        return latestSupported;
    }

    public synchronized void init(@NotNull ProcessingEnvironment processingEnv) {
        Intrinsics.m32179h(processingEnv, "processingEnv");
        super.init(processingEnv);
        Messager messager2 = processingEnv.getMessager();
        Intrinsics.m32178g(messager2, "processingEnv.messager");
        messager = messager2;
        Types typeUtils2 = processingEnv.getTypeUtils();
        Intrinsics.m32178g(typeUtils2, "processingEnv.typeUtils");
        typeUtils = typeUtils2;
        Elements elementUtils2 = processingEnv.getElementUtils();
        Intrinsics.m32178g(elementUtils2, "processingEnv.elementUtils");
        elementUtils = elementUtils2;
        Map<String, String> options2 = processingEnv.getOptions();
        Intrinsics.m32178g(options2, "processingEnv.options");
        options = options2;
        if (isIsolatingProcessingEnabled()) {
            printIsolatingOptionWarning();
        }
    }

    public boolean process(@NotNull Set<? extends TypeElement> annotations, @NotNull RoundEnvironment roundEnv) {
        Intrinsics.m32179h(annotations, "annotations");
        Intrinsics.m32179h(roundEnv, "roundEnv");
        if (annotations.isEmpty()) {
            return false;
        }
        try {
            return throwableProcess(roundEnv);
        } catch (RuntimeException e2) {
            Messager messager2 = messager;
            if (messager2 == null) {
                Intrinsics.m32189r("messager");
                throw null;
            }
            messager2.printMessage(Diagnostic.Kind.OTHER, "Moxy compilation has failed. Could you copy stack trace above and write us (or open an issue on Github)?");
            e2.printStackTrace();
            Messager messager3 = messager;
            if (messager3 == null) {
                Intrinsics.m32189r("messager");
                throw null;
            }
            messager3.printMessage(Diagnostic.Kind.ERROR, "Moxy compilation failed; see the compiler error output for details (" + e2 + ')');
            return true;
        }
    }
}
