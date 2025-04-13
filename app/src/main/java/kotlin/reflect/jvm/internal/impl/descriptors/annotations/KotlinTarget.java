package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinTarget.kt */
/* loaded from: classes3.dex */
public enum KotlinTarget {
    CLASS("class", true),
    ANNOTATION_CLASS("annotation class", true),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", true),
    FIELD("field", true),
    LOCAL_VARIABLE("local variable", true),
    VALUE_PARAMETER("value parameter", true),
    CONSTRUCTOR("constructor", true),
    FUNCTION("function", true),
    PROPERTY_GETTER("getter", true),
    PROPERTY_SETTER("setter", true),
    TYPE("type usage", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION("expression", false),
    FILE("file", false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS("typealias", false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PROJECTION("type projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION("star projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER("property constructor parameter", false),
    /* JADX INFO: Fake field, exist only in values array */
    CLASS_ONLY("class", false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT("object", false),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANION_OBJECT("companion object", false),
    /* JADX INFO: Fake field, exist only in values array */
    INTERFACE("interface", false),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_CLASS("enum class", false),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY("enum entry", false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_CLASS("local class", false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION("local function", false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION("member function", false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION("top level function", false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY("member property", false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY("top level property", false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER("initializer", false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION("lambda expression", false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION("anonymous function", false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL("object literal", false);


    /* renamed from: q */
    public static final HashMap<String, KotlinTarget> f64056q = new HashMap<>();

    /* renamed from: r */
    @NotNull
    public static final Map<AnnotationUseSiteTarget, KotlinTarget> f64057r;

    /* renamed from: b */
    public final boolean f64058b;

    /* compiled from: KotlinTarget.kt */
    public static final class Companion {
    }

    static {
        for (KotlinTarget kotlinTarget : values()) {
            f64056q.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values) {
            if (kotlinTarget2.f64058b) {
                arrayList.add(kotlinTarget2);
            }
        }
        CollectionsKt.m32035n0(arrayList);
        ArraysKt.m31955e0(values());
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget3 = VALUE_PARAMETER;
        AnnotationUseSiteTarget annotationUseSiteTarget2 = AnnotationUseSiteTarget.FIELD;
        KotlinTarget kotlinTarget4 = FIELD;
        f64057r = MapsKt.m32064i(new Pair(annotationUseSiteTarget, kotlinTarget3), new Pair(annotationUseSiteTarget2, kotlinTarget4), new Pair(AnnotationUseSiteTarget.PROPERTY, PROPERTY), new Pair(AnnotationUseSiteTarget.FILE, FILE), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, PROPERTY_GETTER), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, PROPERTY_SETTER), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget3), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget3), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget4));
    }

    KotlinTarget(String description, boolean z) {
        Intrinsics.m32180i(description, "description");
        this.f64058b = z;
    }
}
