package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes3.dex */
public final class WireFormat {

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f65623b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: b */
        public final Object f65756b;

        JavaType(Object obj) {
            this.f65756b = obj;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {

        /* renamed from: d */
        public static final FieldType f65725d;

        /* renamed from: e */
        public static final FieldType f65726e;

        /* renamed from: f */
        public static final FieldType f65727f;

        /* renamed from: g */
        public static final FieldType f65728g;

        /* renamed from: h */
        public static final FieldType f65729h;

        /* renamed from: i */
        public static final FieldType f65730i;

        /* renamed from: j */
        public static final FieldType f65731j;

        /* renamed from: k */
        public static final FieldType f65732k;

        /* renamed from: l */
        public static final FieldType f65733l;

        /* renamed from: m */
        public static final FieldType f65734m;

        /* renamed from: n */
        public static final FieldType f65735n;

        /* renamed from: o */
        public static final FieldType f65736o;

        /* renamed from: p */
        public static final FieldType f65737p;

        /* renamed from: q */
        public static final FieldType f65738q;

        /* renamed from: r */
        public static final FieldType f65739r;

        /* renamed from: s */
        public static final FieldType f65740s;

        /* renamed from: t */
        public static final FieldType f65741t;

        /* renamed from: u */
        public static final FieldType f65742u;

        /* renamed from: v */
        public static final /* synthetic */ FieldType[] f65743v;

        /* renamed from: b */
        public final JavaType f65744b;

        /* renamed from: c */
        public final int f65745c;

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f65725d = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f65726e = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f65727f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f65728g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f65729h = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f65730i = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f65731j = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f65732k = fieldType8;
            FieldType fieldType9 = new FieldType("STRING", 8, JavaType.STRING, 2) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.1
            };
            f65733l = fieldType9;
            JavaType javaType3 = JavaType.MESSAGE;
            FieldType fieldType10 = new FieldType("GROUP", 9, javaType3, 3) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.2
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                /* renamed from: a */
                public boolean mo33359a() {
                    return false;
                }
            };
            f65734m = fieldType10;
            int i2 = 2;
            FieldType fieldType11 = new FieldType("MESSAGE", 10, javaType3, i2) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.3
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                /* renamed from: a */
                public boolean mo33359a() {
                    return false;
                }
            };
            f65735n = fieldType11;
            FieldType fieldType12 = new FieldType("BYTES", 11, JavaType.BYTE_STRING, i2) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.4
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                /* renamed from: a */
                public boolean mo33359a() {
                    return false;
                }
            };
            f65736o = fieldType12;
            FieldType fieldType13 = new FieldType("UINT32", 12, javaType2, 0);
            f65737p = fieldType13;
            FieldType fieldType14 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f65738q = fieldType14;
            FieldType fieldType15 = new FieldType("SFIXED32", 14, javaType2, 5);
            f65739r = fieldType15;
            FieldType fieldType16 = new FieldType("SFIXED64", 15, javaType, 1);
            f65740s = fieldType16;
            FieldType fieldType17 = new FieldType("SINT32", 16, javaType2, 0);
            f65741t = fieldType17;
            FieldType fieldType18 = new FieldType("SINT64", 17, javaType, 0);
            f65742u = fieldType18;
            f65743v = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        public FieldType(String str, int i2, JavaType javaType, int i3) {
            this.f65744b = javaType;
            this.f65745c = i3;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f65743v.clone();
        }

        /* renamed from: a */
        public boolean mo33359a() {
            return !(this instanceof C67061);
        }

        public FieldType(String str, int i2, JavaType javaType, int i3, C67051 c67051) {
            this.f65744b = javaType;
            this.f65745c = i3;
        }
    }
}
