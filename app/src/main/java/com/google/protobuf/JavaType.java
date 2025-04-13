package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class JavaType {

    /* renamed from: d */
    public static final JavaType f24232d;

    /* renamed from: e */
    public static final JavaType f24233e;

    /* renamed from: f */
    public static final JavaType f24234f;

    /* renamed from: g */
    public static final JavaType f24235g;

    /* renamed from: h */
    public static final JavaType f24236h;

    /* renamed from: i */
    public static final JavaType f24237i;

    /* renamed from: j */
    public static final JavaType f24238j;

    /* renamed from: k */
    public static final JavaType f24239k;

    /* renamed from: l */
    public static final JavaType f24240l;

    /* renamed from: m */
    public static final JavaType f24241m;

    /* renamed from: n */
    public static final /* synthetic */ JavaType[] f24242n;

    /* renamed from: b */
    public final Class<?> f24243b;

    /* renamed from: c */
    public final Object f24244c;

    static {
        JavaType javaType = new JavaType("VOID", 0, Void.class, Void.class, null);
        f24232d = javaType;
        Class cls = Integer.TYPE;
        JavaType javaType2 = new JavaType("INT", 1, cls, Integer.class, 0);
        f24233e = javaType2;
        JavaType javaType3 = new JavaType("LONG", 2, Long.TYPE, Long.class, 0L);
        f24234f = javaType3;
        JavaType javaType4 = new JavaType("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f24235g = javaType4;
        JavaType javaType5 = new JavaType("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f24236h = javaType5;
        JavaType javaType6 = new JavaType("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f24237i = javaType6;
        JavaType javaType7 = new JavaType("STRING", 6, String.class, String.class, "");
        f24238j = javaType7;
        JavaType javaType8 = new JavaType("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.f23981c);
        f24239k = javaType8;
        JavaType javaType9 = new JavaType("ENUM", 8, cls, Integer.class, null);
        f24240l = javaType9;
        JavaType javaType10 = new JavaType("MESSAGE", 9, Object.class, Object.class, null);
        f24241m = javaType10;
        f24242n = new JavaType[]{javaType, javaType2, javaType3, javaType4, javaType5, javaType6, javaType7, javaType8, javaType9, javaType10};
    }

    public JavaType(String str, int i2, Class cls, Class cls2, Object obj) {
        this.f24243b = cls2;
        this.f24244c = obj;
    }

    public static JavaType valueOf(String str) {
        return (JavaType) java.lang.Enum.valueOf(JavaType.class, str);
    }

    public static JavaType[] values() {
        return (JavaType[]) f24242n.clone();
    }
}
