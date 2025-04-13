package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes3.dex */
public final class BuiltInsProtoBuf {

    /* renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f65372a = GeneratedMessageLite.m33312h(ProtoBuf.Package.f65094l, 0, null, null, 151, WireFormat.FieldType.f65729h, Integer.class);

    /* renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f65373b;

    /* renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f65374c;

    /* renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f65375d;

    /* renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f65376e;

    /* renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f65377f;

    /* renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f65378g;

    /* renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f65379h;

    /* renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f65380i;

    /* renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f65381j;

    static {
        ProtoBuf.Class r1 = ProtoBuf.Class.f64920z;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.f64853h;
        WireFormat.FieldType fieldType = WireFormat.FieldType.f65735n;
        f65373b = GeneratedMessageLite.m33311g(r1, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65374c = GeneratedMessageLite.m33311g(ProtoBuf.Constructor.f64970j, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65375d = GeneratedMessageLite.m33311g(ProtoBuf.Function.f65051s, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        ProtoBuf.Property property = ProtoBuf.Property.f65126s;
        f65376e = GeneratedMessageLite.m33311g(property, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        ProtoBuf.Annotation.Argument.Value value = ProtoBuf.Annotation.Argument.Value.f64872q;
        f65377f = GeneratedMessageLite.m33312h(property, value, value, null, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        f65378g = GeneratedMessageLite.m33311g(ProtoBuf.EnumEntry.f65016h, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65379h = GeneratedMessageLite.m33311g(ProtoBuf.ValueParameter.f65306m, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65380i = GeneratedMessageLite.m33311g(ProtoBuf.Type.f65191u, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65381j = GeneratedMessageLite.m33311g(ProtoBuf.TypeParameter.f65270n, annotation, null, 150, fieldType, false, ProtoBuf.Annotation.class);
    }
}
