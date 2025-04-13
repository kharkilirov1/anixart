package com.google.protobuf;

/* loaded from: classes2.dex */
public final class WireFormat {

    /* renamed from: com.google.protobuf.WireFormat$1 */
    public static /* synthetic */ class C24101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24400a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f24400a = iArr;
            try {
                iArr[FieldType.f24401d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24400a[FieldType.f24402e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24400a[FieldType.f24403f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24400a[FieldType.f24404g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24400a[FieldType.f24405h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24400a[FieldType.f24406i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24400a[FieldType.f24407j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24400a[FieldType.f24408k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24400a[FieldType.f24412o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24400a[FieldType.f24413p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24400a[FieldType.f24415r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24400a[FieldType.f24416s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24400a[FieldType.f24417t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24400a[FieldType.f24418u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24400a[FieldType.f24409l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24400a[FieldType.f24410m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24400a[FieldType.f24411n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f24400a[FieldType.f24414q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f23981c),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: b */
        public final Object f24432b;

        JavaType(Object obj) {
            this.f24432b = obj;
        }
    }

    public enum Utf8Validation {
        /* JADX INFO: Fake field, exist only in values array */
        LOOSE { // from class: com.google.protobuf.WireFormat.Utf8Validation.1
        },
        /* JADX INFO: Fake field, exist only in values array */
        STRICT { // from class: com.google.protobuf.WireFormat.Utf8Validation.2
        },
        /* JADX INFO: Fake field, exist only in values array */
        LAZY { // from class: com.google.protobuf.WireFormat.Utf8Validation.3
        };

        Utf8Validation(C24101 c24101) {
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
        public static final FieldType f24401d;

        /* renamed from: e */
        public static final FieldType f24402e;

        /* renamed from: f */
        public static final FieldType f24403f;

        /* renamed from: g */
        public static final FieldType f24404g;

        /* renamed from: h */
        public static final FieldType f24405h;

        /* renamed from: i */
        public static final FieldType f24406i;

        /* renamed from: j */
        public static final FieldType f24407j;

        /* renamed from: k */
        public static final FieldType f24408k;

        /* renamed from: l */
        public static final FieldType f24409l;

        /* renamed from: m */
        public static final FieldType f24410m;

        /* renamed from: n */
        public static final FieldType f24411n;

        /* renamed from: o */
        public static final FieldType f24412o;

        /* renamed from: p */
        public static final FieldType f24413p;

        /* renamed from: q */
        public static final FieldType f24414q;

        /* renamed from: r */
        public static final FieldType f24415r;

        /* renamed from: s */
        public static final FieldType f24416s;

        /* renamed from: t */
        public static final FieldType f24417t;

        /* renamed from: u */
        public static final FieldType f24418u;

        /* renamed from: v */
        public static final /* synthetic */ FieldType[] f24419v;

        /* renamed from: b */
        public final JavaType f24420b;

        /* renamed from: c */
        public final int f24421c;

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f24401d = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f24402e = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f24403f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f24404g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f24405h = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f24406i = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f24407j = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f24408k = fieldType8;
            FieldType fieldType9 = new FieldType("STRING", 8, JavaType.STRING, 2) { // from class: com.google.protobuf.WireFormat.FieldType.1
            };
            f24409l = fieldType9;
            JavaType javaType3 = JavaType.MESSAGE;
            FieldType fieldType10 = new FieldType("GROUP", 9, javaType3, 3) { // from class: com.google.protobuf.WireFormat.FieldType.2
            };
            f24410m = fieldType10;
            int i2 = 2;
            FieldType fieldType11 = new FieldType("MESSAGE", 10, javaType3, i2) { // from class: com.google.protobuf.WireFormat.FieldType.3
            };
            f24411n = fieldType11;
            FieldType fieldType12 = new FieldType("BYTES", 11, JavaType.BYTE_STRING, i2) { // from class: com.google.protobuf.WireFormat.FieldType.4
            };
            f24412o = fieldType12;
            FieldType fieldType13 = new FieldType("UINT32", 12, javaType2, 0);
            f24413p = fieldType13;
            FieldType fieldType14 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f24414q = fieldType14;
            FieldType fieldType15 = new FieldType("SFIXED32", 14, javaType2, 5);
            f24415r = fieldType15;
            FieldType fieldType16 = new FieldType("SFIXED64", 15, javaType, 1);
            f24416s = fieldType16;
            FieldType fieldType17 = new FieldType("SINT32", 16, javaType2, 0);
            f24417t = fieldType17;
            FieldType fieldType18 = new FieldType("SINT64", 17, javaType, 0);
            f24418u = fieldType18;
            f24419v = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        public FieldType(String str, int i2, JavaType javaType, int i3) {
            this.f24420b = javaType;
            this.f24421c = i3;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f24419v.clone();
        }

        public FieldType(String str, int i2, JavaType javaType, int i3, C24101 c24101) {
            this.f24420b = javaType;
            this.f24421c = i3;
        }
    }
}
