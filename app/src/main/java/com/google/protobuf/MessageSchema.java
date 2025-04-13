package com.google.protobuf;

import androidx.room.util.C0576a;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class MessageSchema<T> implements Schema<T> {

    /* renamed from: r */
    public static final int[] f24273r = new int[0];

    /* renamed from: s */
    public static final Unsafe f24274s = UnsafeUtil.m13692s();

    /* renamed from: a */
    public final int[] f24275a;

    /* renamed from: b */
    public final Object[] f24276b;

    /* renamed from: c */
    public final int f24277c;

    /* renamed from: d */
    public final int f24278d;

    /* renamed from: e */
    public final MessageLite f24279e;

    /* renamed from: f */
    public final boolean f24280f;

    /* renamed from: g */
    public final boolean f24281g;

    /* renamed from: h */
    public final boolean f24282h;

    /* renamed from: i */
    public final boolean f24283i;

    /* renamed from: j */
    public final int[] f24284j;

    /* renamed from: k */
    public final int f24285k;

    /* renamed from: l */
    public final int f24286l;

    /* renamed from: m */
    public final NewInstanceSchema f24287m;

    /* renamed from: n */
    public final ListFieldSchema f24288n;

    /* renamed from: o */
    public final UnknownFieldSchema<?, ?> f24289o;

    /* renamed from: p */
    public final ExtensionSchema<?> f24290p;

    /* renamed from: q */
    public final MapFieldSchema f24291q;

    /* renamed from: com.google.protobuf.MessageSchema$1 */
    public static /* synthetic */ class C23851 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24292a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24292a = iArr;
            try {
                iArr[WireFormat.FieldType.f24408k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24292a[WireFormat.FieldType.f24412o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24292a[WireFormat.FieldType.f24401d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24292a[WireFormat.FieldType.f24407j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24292a[WireFormat.FieldType.f24415r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24292a[WireFormat.FieldType.f24406i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24292a[WireFormat.FieldType.f24416s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24292a[WireFormat.FieldType.f24402e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24292a[WireFormat.FieldType.f24414q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24292a[WireFormat.FieldType.f24405h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24292a[WireFormat.FieldType.f24413p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24292a[WireFormat.FieldType.f24403f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24292a[WireFormat.FieldType.f24404g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24292a[WireFormat.FieldType.f24411n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24292a[WireFormat.FieldType.f24417t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24292a[WireFormat.FieldType.f24418u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24292a[WireFormat.FieldType.f24409l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f24275a = iArr;
        this.f24276b = objArr;
        this.f24277c = i2;
        this.f24278d = i3;
        this.f24281g = messageLite instanceof GeneratedMessageLite;
        this.f24282h = z;
        this.f24280f = extensionSchema != null && extensionSchema.mo13373e(messageLite);
        this.f24283i = z2;
        this.f24284j = iArr2;
        this.f24285k = i4;
        this.f24286l = i5;
        this.f24287m = newInstanceSchema;
        this.f24288n = listFieldSchema;
        this.f24289o = unknownFieldSchema;
        this.f24290p = extensionSchema;
        this.f24279e = messageLite;
        this.f24291q = mapFieldSchema;
    }

    /* renamed from: B */
    public static MessageSchema m13507B(MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return m13508C((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.MessageSchema<T> m13508C(com.google.protobuf.RawMessageInfo r33, com.google.protobuf.NewInstanceSchema r34, com.google.protobuf.ListFieldSchema r35, com.google.protobuf.UnknownFieldSchema<?, ?> r36, com.google.protobuf.ExtensionSchema<?> r37, com.google.protobuf.MapFieldSchema r38) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m13508C(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    /* renamed from: D */
    public static long m13509D(int i2) {
        return i2 & 1048575;
    }

    /* renamed from: E */
    public static <T> boolean m13510E(T t, long j2) {
        return ((Boolean) UnsafeUtil.m13691r(t, j2)).booleanValue();
    }

    /* renamed from: F */
    public static <T> double m13511F(T t, long j2) {
        return ((Double) UnsafeUtil.m13691r(t, j2)).doubleValue();
    }

    /* renamed from: G */
    public static <T> float m13512G(T t, long j2) {
        return ((Float) UnsafeUtil.m13691r(t, j2)).floatValue();
    }

    /* renamed from: H */
    public static <T> int m13513H(T t, long j2) {
        return ((Integer) UnsafeUtil.m13691r(t, j2)).intValue();
    }

    /* renamed from: I */
    public static <T> long m13514I(T t, long j2) {
        return ((Long) UnsafeUtil.m13691r(t, j2)).longValue();
    }

    /* renamed from: T */
    public static java.lang.reflect.Field m13515T(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m28y = C0000a.m28y("Field ", str, " for ");
            C0576a.m4126y(cls, m28y, " not found. Known fields are ");
            m28y.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m28y.toString());
        }
    }

    /* renamed from: X */
    public static int m13516X(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    /* renamed from: q */
    public static UnknownFieldSetLite m13517q(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f24377f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite m13666b = UnknownFieldSetLite.m13666b();
        generatedMessageLite.unknownFields = m13666b;
        return m13666b;
    }

    /* renamed from: w */
    public static List<?> m13518w(Object obj, long j2) {
        return (List) UnsafeUtil.m13691r(obj, j2);
    }

    /* renamed from: A */
    public final void m13519A(T t, T t2, int i2) {
        int[] iArr = this.f24275a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long m13509D = m13509D(i3);
        if (m13557v(t2, i4, i2)) {
            Object m13691r = m13557v(t, i4, i2) ? UnsafeUtil.m13691r(t, m13509D) : null;
            Object m13691r2 = UnsafeUtil.m13691r(t2, m13509D);
            if (m13691r != null && m13691r2 != null) {
                UnsafeUtil.f24390e.m13724v(t, m13509D, Internal.m13455c(m13691r, m13691r2));
                m13531V(t, i4, i2);
            } else if (m13691r2 != null) {
                UnsafeUtil.f24390e.m13724v(t, m13509D, m13691r2);
                m13531V(t, i4, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* renamed from: J */
    public final <K, V> int m13520J(T t, byte[] bArr, int i2, int i3, int i4, long j2, ArrayDecoders.Registers registers) throws IOException {
        int i5;
        Unsafe unsafe = f24274s;
        Object obj = this.f24276b[(i4 / 3) * 2];
        Object object = unsafe.getObject(t, j2);
        if (this.f24291q.mo13499g(object)) {
            Object mo13497e = this.f24291q.mo13497e(obj);
            this.f24291q.mo13493a(mo13497e, object);
            unsafe.putObject(t, j2, mo13497e);
            object = mo13497e;
        }
        MapEntryLite.Metadata<?, ?> mo13495c = this.f24291q.mo13495c(obj);
        Map<?, ?> mo13496d = this.f24291q.mo13496d(object);
        int m13014t = ArrayDecoders.m13014t(bArr, i2, registers);
        int i6 = registers.f23961a;
        if (i6 < 0 || i6 > i3 - m13014t) {
            throw InvalidProtocolBufferException.m13463h();
        }
        int i7 = m13014t + i6;
        Object obj2 = mo13495c.f24266b;
        Object obj3 = mo13495c.f24268d;
        while (m13014t < i7) {
            int i8 = m13014t + 1;
            byte b = bArr[m13014t];
            if (b < 0) {
                i5 = ArrayDecoders.m13013s(b, bArr, i8, registers);
                b = registers.f23961a;
            } else {
                i5 = i8;
            }
            int i9 = b >>> 3;
            int i10 = b & 7;
            if (i9 != 1) {
                if (i9 == 2) {
                    WireFormat.FieldType fieldType = mo13495c.f24267c;
                    if (i10 == fieldType.f24421c) {
                        m13014t = m13548l(bArr, i5, i3, fieldType, mo13495c.f24268d.getClass(), registers);
                        obj3 = registers.f23963c;
                    }
                }
                m13014t = ArrayDecoders.m13017w(b, bArr, i5, i3, registers);
            } else {
                WireFormat.FieldType fieldType2 = mo13495c.f24265a;
                if (i10 == fieldType2.f24421c) {
                    m13014t = m13548l(bArr, i5, i3, fieldType2, null, registers);
                    obj3 = obj3;
                    obj2 = registers.f23963c;
                } else {
                    m13014t = ArrayDecoders.m13017w(b, bArr, i5, i3, registers);
                }
            }
        }
        if (m13014t != i7) {
            throw InvalidProtocolBufferException.m13462g();
        }
        mo13496d.put(obj2, obj3);
        return i7;
    }

    /* renamed from: K */
    public final int m13521K(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = f24274s;
        long j3 = this.f24275a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(ArrayDecoders.m12997c(bArr, i2))));
                    int i10 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(ArrayDecoders.m12996b(bArr, i2))));
                    int i11 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i11;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int m13016v = ArrayDecoders.m13016v(bArr, i2, registers);
                    unsafe.putObject(t, j2, Long.valueOf(registers.f23962b));
                    unsafe.putInt(t, j3, i5);
                    return m13016v;
                }
                break;
            case 55:
            case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i6 == 0) {
                    int m13014t = ArrayDecoders.m13014t(bArr, i2, registers);
                    unsafe.putObject(t, j2, Integer.valueOf(registers.f23961a));
                    unsafe.putInt(t, j3, i5);
                    return m13014t;
                }
                break;
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(ArrayDecoders.m12997c(bArr, i2)));
                    int i12 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i12;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(ArrayDecoders.m12996b(bArr, i2)));
                    int i13 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i13;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int m13016v2 = ArrayDecoders.m13016v(bArr, i2, registers);
                    unsafe.putObject(t, j2, Boolean.valueOf(registers.f23962b != 0));
                    unsafe.putInt(t, j3, i5);
                    return m13016v2;
                }
                break;
            case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i6 == 2) {
                    int m13014t2 = ArrayDecoders.m13014t(bArr, i2, registers);
                    int i14 = registers.f23961a;
                    if (i14 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else {
                        if ((i7 & 536870912) != 0 && !Utf8.m13734j(bArr, m13014t2, m13014t2 + i14)) {
                            throw InvalidProtocolBufferException.m13458c();
                        }
                        unsafe.putObject(t, j2, new String(bArr, m13014t2, i14, Internal.f24211b));
                        m13014t2 += i14;
                    }
                    unsafe.putInt(t, j3, i5);
                    return m13014t2;
                }
                break;
            case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i6 == 2) {
                    int m12999e = ArrayDecoders.m12999e(m13552p(i9), bArr, i2, i3, registers);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, registers.f23963c);
                    } else {
                        unsafe.putObject(t, j2, Internal.m13455c(object, registers.f23963c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m12999e;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i6 == 2) {
                    int m12995a = ArrayDecoders.m12995a(bArr, i2, registers);
                    unsafe.putObject(t, j2, registers.f23963c);
                    unsafe.putInt(t, j3, i5);
                    return m12995a;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i6 == 0) {
                    int m13014t3 = ArrayDecoders.m13014t(bArr, i2, registers);
                    int i15 = registers.f23961a;
                    Internal.EnumVerifier enumVerifier = (Internal.EnumVerifier) this.f24276b[((i9 / 3) * 2) + 1];
                    if (enumVerifier == null || enumVerifier.mo11030a(i15)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i15));
                        unsafe.putInt(t, j3, i5);
                    } else {
                        m13517q(t).m13669c(i4, Long.valueOf(i15));
                    }
                    return m13014t3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i6 == 0) {
                    int m13014t4 = ArrayDecoders.m13014t(bArr, i2, registers);
                    unsafe.putObject(t, j2, Integer.valueOf(CodedInputStream.m13171b(registers.f23961a)));
                    unsafe.putInt(t, j3, i5);
                    return m13014t4;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i6 == 0) {
                    int m13016v3 = ArrayDecoders.m13016v(bArr, i2, registers);
                    unsafe.putObject(t, j2, Long.valueOf(CodedInputStream.m13172c(registers.f23962b)));
                    unsafe.putInt(t, j3, i5);
                    return m13016v3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i6 == 3) {
                    int m12998d = ArrayDecoders.m12998d(m13552p(i9), bArr, i2, i3, (i4 & (-8)) | 4, registers);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, registers.f23963c);
                    } else {
                        unsafe.putObject(t, j2, Internal.m13455c(object2, registers.f23963c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m12998d;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c1  */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m13522L(T r32, byte[] r33, int r34, int r35, int r36, com.google.protobuf.ArrayDecoders.Registers r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m13522L(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ab, code lost:
    
        if (r0 != r15) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02af, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0302, code lost:
    
        r2 = r20;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e1, code lost:
    
        if (r0 != r15) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0300, code lost:
    
        if (r0 != r15) goto L121;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x008a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m13523M(T r29, byte[] r30, int r31, int r32, com.google.protobuf.ArrayDecoders.Registers r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m13523M(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final int m13524N(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, ArrayDecoders.Registers registers) throws IOException {
        int m13015u;
        int i9 = i2;
        Unsafe unsafe = f24274s;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t, j3);
        if (!protobufList.mo12988j1()) {
            int size = protobufList.size();
            protobufList = protobufList.mo13144N(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, protobufList);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    return ArrayDecoders.m13002h(bArr, i9, protobufList, registers);
                }
                if (i6 == 1) {
                    DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
                    doubleArrayList.m13359d(Double.longBitsToDouble(ArrayDecoders.m12997c(bArr, i2)));
                    while (true) {
                        int i10 = i9 + 8;
                        if (i10 >= i3) {
                            return i10;
                        }
                        i9 = ArrayDecoders.m13014t(bArr, i10, registers);
                        if (i4 != registers.f23961a) {
                            return i10;
                        }
                        doubleArrayList.m13359d(Double.longBitsToDouble(ArrayDecoders.m12997c(bArr, i9)));
                    }
                }
                break;
            case 19:
            case 36:
                if (i6 == 2) {
                    return ArrayDecoders.m13005k(bArr, i9, protobufList, registers);
                }
                if (i6 == 5) {
                    FloatArrayList floatArrayList = (FloatArrayList) protobufList;
                    floatArrayList.m13406d(Float.intBitsToFloat(ArrayDecoders.m12996b(bArr, i2)));
                    while (true) {
                        int i11 = i9 + 4;
                        if (i11 >= i3) {
                            return i11;
                        }
                        i9 = ArrayDecoders.m13014t(bArr, i11, registers);
                        if (i4 != registers.f23961a) {
                            return i11;
                        }
                        floatArrayList.m13406d(Float.intBitsToFloat(ArrayDecoders.m12996b(bArr, i9)));
                    }
                }
                break;
            case 20:
            case 21:
            case 37:
            case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i6 == 2) {
                    return ArrayDecoders.m13009o(bArr, i9, protobufList, registers);
                }
                if (i6 == 0) {
                    LongArrayList longArrayList = (LongArrayList) protobufList;
                    int m13016v = ArrayDecoders.m13016v(bArr, i9, registers);
                    longArrayList.m13483d(registers.f23962b);
                    while (m13016v < i3) {
                        int m13014t = ArrayDecoders.m13014t(bArr, m13016v, registers);
                        if (i4 != registers.f23961a) {
                            return m13016v;
                        }
                        m13016v = ArrayDecoders.m13016v(bArr, m13014t, registers);
                        longArrayList.m13483d(registers.f23962b);
                    }
                    return m13016v;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return ArrayDecoders.m13008n(bArr, i9, protobufList, registers);
                }
                if (i6 == 0) {
                    return ArrayDecoders.m13015u(i4, bArr, i2, i3, protobufList, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    return ArrayDecoders.m13004j(bArr, i9, protobufList, registers);
                }
                if (i6 == 1) {
                    LongArrayList longArrayList2 = (LongArrayList) protobufList;
                    longArrayList2.m13483d(ArrayDecoders.m12997c(bArr, i2));
                    while (true) {
                        int i12 = i9 + 8;
                        if (i12 >= i3) {
                            return i12;
                        }
                        i9 = ArrayDecoders.m13014t(bArr, i12, registers);
                        if (i4 != registers.f23961a) {
                            return i12;
                        }
                        longArrayList2.m13483d(ArrayDecoders.m12997c(bArr, i9));
                    }
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    return ArrayDecoders.m13003i(bArr, i9, protobufList, registers);
                }
                if (i6 == 5) {
                    IntArrayList intArrayList = (IntArrayList) protobufList;
                    intArrayList.m13449d(ArrayDecoders.m12996b(bArr, i2));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i3) {
                            return i13;
                        }
                        i9 = ArrayDecoders.m13014t(bArr, i13, registers);
                        if (i4 != registers.f23961a) {
                            return i13;
                        }
                        intArrayList.m13449d(ArrayDecoders.m12996b(bArr, i9));
                    }
                }
                break;
            case 25:
            case 42:
                if (i6 == 2) {
                    return ArrayDecoders.m13001g(bArr, i9, protobufList, registers);
                }
                if (i6 == 0) {
                    BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
                    int m13016v2 = ArrayDecoders.m13016v(bArr, i9, registers);
                    booleanArrayList.m13145d(registers.f23962b != 0);
                    while (m13016v2 < i3) {
                        int m13014t2 = ArrayDecoders.m13014t(bArr, m13016v2, registers);
                        if (i4 != registers.f23961a) {
                            return m13016v2;
                        }
                        m13016v2 = ArrayDecoders.m13016v(bArr, m13014t2, registers);
                        booleanArrayList.m13145d(registers.f23962b != 0);
                    }
                    return m13016v2;
                }
                break;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        i9 = ArrayDecoders.m13014t(bArr, i9, registers);
                        int i14 = registers.f23961a;
                        if (i14 < 0) {
                            throw InvalidProtocolBufferException.m13461f();
                        }
                        if (i14 == 0) {
                            protobufList.add("");
                        } else {
                            protobufList.add(new String(bArr, i9, i14, Internal.f24211b));
                            i9 += i14;
                        }
                        while (i9 < i3) {
                            int m13014t3 = ArrayDecoders.m13014t(bArr, i9, registers);
                            if (i4 != registers.f23961a) {
                                break;
                            } else {
                                i9 = ArrayDecoders.m13014t(bArr, m13014t3, registers);
                                int i15 = registers.f23961a;
                                if (i15 < 0) {
                                    throw InvalidProtocolBufferException.m13461f();
                                }
                                if (i15 == 0) {
                                    protobufList.add("");
                                } else {
                                    protobufList.add(new String(bArr, i9, i15, Internal.f24211b));
                                    i9 += i15;
                                }
                            }
                        }
                        break;
                    } else {
                        i9 = ArrayDecoders.m13014t(bArr, i9, registers);
                        int i16 = registers.f23961a;
                        if (i16 < 0) {
                            throw InvalidProtocolBufferException.m13461f();
                        }
                        if (i16 == 0) {
                            protobufList.add("");
                        } else {
                            int i17 = i9 + i16;
                            if (!Utf8.m13734j(bArr, i9, i17)) {
                                throw InvalidProtocolBufferException.m13458c();
                            }
                            protobufList.add(new String(bArr, i9, i16, Internal.f24211b));
                            i9 = i17;
                        }
                        while (i9 < i3) {
                            int m13014t4 = ArrayDecoders.m13014t(bArr, i9, registers);
                            if (i4 != registers.f23961a) {
                                break;
                            } else {
                                i9 = ArrayDecoders.m13014t(bArr, m13014t4, registers);
                                int i18 = registers.f23961a;
                                if (i18 < 0) {
                                    throw InvalidProtocolBufferException.m13461f();
                                }
                                if (i18 == 0) {
                                    protobufList.add("");
                                } else {
                                    int i19 = i9 + i18;
                                    if (!Utf8.m13734j(bArr, i9, i19)) {
                                        throw InvalidProtocolBufferException.m13458c();
                                    }
                                    protobufList.add(new String(bArr, i9, i18, Internal.f24211b));
                                    i9 = i19;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i6 == 2) {
                    return ArrayDecoders.m13000f(m13552p(i7), i4, bArr, i2, i3, protobufList, registers);
                }
                break;
            case 28:
                if (i6 == 2) {
                    int m13014t5 = ArrayDecoders.m13014t(bArr, i9, registers);
                    int i20 = registers.f23961a;
                    if (i20 < 0) {
                        throw InvalidProtocolBufferException.m13461f();
                    }
                    if (i20 > bArr.length - m13014t5) {
                        throw InvalidProtocolBufferException.m13463h();
                    }
                    if (i20 == 0) {
                        protobufList.add(ByteString.f23981c);
                    } else {
                        protobufList.add(ByteString.m13151g(bArr, m13014t5, i20));
                        m13014t5 += i20;
                    }
                    while (m13014t5 < i3) {
                        int m13014t6 = ArrayDecoders.m13014t(bArr, m13014t5, registers);
                        if (i4 != registers.f23961a) {
                            return m13014t5;
                        }
                        m13014t5 = ArrayDecoders.m13014t(bArr, m13014t6, registers);
                        int i21 = registers.f23961a;
                        if (i21 < 0) {
                            throw InvalidProtocolBufferException.m13461f();
                        }
                        if (i21 > bArr.length - m13014t5) {
                            throw InvalidProtocolBufferException.m13463h();
                        }
                        if (i21 == 0) {
                            protobufList.add(ByteString.f23981c);
                        } else {
                            protobufList.add(ByteString.m13151g(bArr, m13014t5, i21));
                            m13014t5 += i21;
                        }
                    }
                    return m13014t5;
                }
                break;
            case 30:
            case 44:
                if (i6 == 2) {
                    m13015u = ArrayDecoders.m13008n(bArr, i9, protobufList, registers);
                } else if (i6 == 0) {
                    m13015u = ArrayDecoders.m13015u(i4, bArr, i2, i3, protobufList, registers);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.f24377f) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.m13622z(i5, protobufList, (Internal.EnumVerifier) this.f24276b[((i7 / 3) * 2) + 1], unknownFieldSetLite, this.f24289o);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return m13015u;
            case 33:
            case 47:
                if (i6 == 2) {
                    return ArrayDecoders.m13006l(bArr, i9, protobufList, registers);
                }
                if (i6 == 0) {
                    IntArrayList intArrayList2 = (IntArrayList) protobufList;
                    int m13014t7 = ArrayDecoders.m13014t(bArr, i9, registers);
                    intArrayList2.m13449d(CodedInputStream.m13171b(registers.f23961a));
                    while (m13014t7 < i3) {
                        int m13014t8 = ArrayDecoders.m13014t(bArr, m13014t7, registers);
                        if (i4 != registers.f23961a) {
                            return m13014t7;
                        }
                        m13014t7 = ArrayDecoders.m13014t(bArr, m13014t8, registers);
                        intArrayList2.m13449d(CodedInputStream.m13171b(registers.f23961a));
                    }
                    return m13014t7;
                }
                break;
            case 34:
            case 48:
                if (i6 == 2) {
                    return ArrayDecoders.m13007m(bArr, i9, protobufList, registers);
                }
                if (i6 == 0) {
                    LongArrayList longArrayList3 = (LongArrayList) protobufList;
                    int m13016v3 = ArrayDecoders.m13016v(bArr, i9, registers);
                    longArrayList3.m13483d(CodedInputStream.m13172c(registers.f23962b));
                    while (m13016v3 < i3) {
                        int m13014t9 = ArrayDecoders.m13014t(bArr, m13016v3, registers);
                        if (i4 != registers.f23961a) {
                            return m13016v3;
                        }
                        m13016v3 = ArrayDecoders.m13016v(bArr, m13014t9, registers);
                        longArrayList3.m13483d(CodedInputStream.m13172c(registers.f23962b));
                    }
                    return m13016v3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                if (i6 == 3) {
                    Schema m13552p = m13552p(i7);
                    int i22 = (i4 & (-8)) | 4;
                    i9 = ArrayDecoders.m12998d(m13552p, bArr, i2, i3, i22, registers);
                    protobufList.add(registers.f23963c);
                    while (i9 < i3) {
                        int m13014t10 = ArrayDecoders.m13014t(bArr, i9, registers);
                        if (i4 != registers.f23961a) {
                            break;
                        } else {
                            i9 = ArrayDecoders.m12998d(m13552p, bArr, m13014t10, i3, i22, registers);
                            protobufList.add(registers.f23963c);
                        }
                    }
                    break;
                }
                break;
        }
        return i9;
    }

    /* renamed from: O */
    public final int m13525O(int i2) {
        if (i2 < this.f24277c || i2 > this.f24278d) {
            return -1;
        }
        return m13532W(i2, 0);
    }

    /* renamed from: P */
    public final <E> void m13526P(Object obj, long j2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.mo13056g(this.f24288n.mo13479c(obj, j2), schema, extensionRegistryLite);
    }

    /* renamed from: Q */
    public final <E> void m13527Q(Object obj, int i2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.mo13065l(this.f24288n.mo13479c(obj, m13509D(i2)), schema, extensionRegistryLite);
    }

    /* renamed from: R */
    public final void m13528R(Object obj, int i2, Reader reader) throws IOException {
        if ((536870912 & i2) != 0) {
            UnsafeUtil.f24390e.m13724v(obj, m13509D(i2), reader.mo13032O());
        } else if (this.f24281g) {
            UnsafeUtil.f24390e.m13724v(obj, m13509D(i2), reader.mo13079z());
        } else {
            UnsafeUtil.f24390e.m13724v(obj, m13509D(i2), reader.mo13024G());
        }
    }

    /* renamed from: S */
    public final void m13529S(Object obj, int i2, Reader reader) throws IOException {
        if ((536870912 & i2) != 0) {
            reader.mo13023F(this.f24288n.mo13479c(obj, m13509D(i2)));
        } else {
            reader.mo13020C(this.f24288n.mo13479c(obj, m13509D(i2)));
        }
    }

    /* renamed from: U */
    public final void m13530U(T t, int i2) {
        int i3 = this.f24275a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        UnsafeUtil.f24390e.m13722t(t, j2, (1 << (i3 >>> 20)) | UnsafeUtil.m13689p(t, j2));
    }

    /* renamed from: V */
    public final void m13531V(T t, int i2, int i3) {
        UnsafeUtil.f24390e.m13722t(t, this.f24275a[i3 + 2] & 1048575, i2);
    }

    /* renamed from: W */
    public final int m13532W(int i2, int i3) {
        int length = (this.f24275a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f24275a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* renamed from: Y */
    public final int m13533Y(int i2) {
        return this.f24275a[i2 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13534Z(T r18, com.google.protobuf.Writer r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m13534Z(java.lang.Object, com.google.protobuf.Writer):void");
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: a */
    public void mo13535a(T t, T t2) {
        Objects.requireNonNull(t2);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f24275a;
            if (i2 >= iArr.length) {
                UnknownFieldSchema<?, ?> unknownFieldSchema = this.f24289o;
                Class<?> cls = SchemaUtil.f24337a;
                unknownFieldSchema.mo13661o(t, unknownFieldSchema.mo13657k(unknownFieldSchema.mo13653g(t), unknownFieldSchema.mo13653g(t2)));
                if (this.f24280f) {
                    SchemaUtil.m13576B(this.f24290p, t, t2);
                    return;
                }
                return;
            }
            int i3 = iArr[i2 + 1];
            long m13509D = m13509D(i3);
            int i4 = this.f24275a[i2];
            switch (m13516X(i3)) {
                case 0:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.m13698y(t, m13509D, UnsafeUtil.m13687n(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 1:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.mo13713s(t, m13509D, UnsafeUtil.m13688o(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 2:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.m13672B(t, m13509D, UnsafeUtil.m13690q(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 3:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.m13672B(t, m13509D, UnsafeUtil.m13690q(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 4:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13722t(t, m13509D, UnsafeUtil.m13689p(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 5:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.m13672B(t, m13509D, UnsafeUtil.m13690q(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 6:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13722t(t, m13509D, UnsafeUtil.m13689p(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 7:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.mo13709o(t, m13509D, UnsafeUtil.m13682i(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 8:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13724v(t, m13509D, UnsafeUtil.m13691r(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 9:
                    m13560z(t, t2, i2);
                    break;
                case 10:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13724v(t, m13509D, UnsafeUtil.m13691r(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 11:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13722t(t, m13509D, UnsafeUtil.m13689p(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 12:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13722t(t, m13509D, UnsafeUtil.m13689p(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 13:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13722t(t, m13509D, UnsafeUtil.m13689p(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 14:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.m13672B(t, m13509D, UnsafeUtil.m13690q(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 15:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13722t(t, m13509D, UnsafeUtil.m13689p(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 16:
                    if (!m13555t(t2, i2)) {
                        break;
                    } else {
                        UnsafeUtil.m13672B(t, m13509D, UnsafeUtil.m13690q(t2, m13509D));
                        m13530U(t, i2);
                        break;
                    }
                case 17:
                    m13560z(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.f24288n.mo13478b(t, t2, m13509D);
                    break;
                case 50:
                    MapFieldSchema mapFieldSchema = this.f24291q;
                    Class<?> cls2 = SchemaUtil.f24337a;
                    UnsafeUtil.f24390e.m13724v(t, m13509D, mapFieldSchema.mo13493a(UnsafeUtil.m13691r(t, m13509D), UnsafeUtil.m13691r(t2, m13509D)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                case 58:
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!m13557v(t2, i4, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13724v(t, m13509D, UnsafeUtil.m13691r(t2, m13509D));
                        m13531V(t, i4, i2);
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    m13519A(t, t2, i2);
                    break;
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case 64:
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!m13557v(t2, i4, i2)) {
                        break;
                    } else {
                        UnsafeUtil.f24390e.m13724v(t, m13509D, UnsafeUtil.m13691r(t2, m13509D));
                        m13531V(t, i4, i2);
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    m13519A(t, t2, i2);
                    break;
            }
            i2 += 3;
        }
    }

    /* renamed from: a0 */
    public final <K, V> void m13536a0(Writer writer, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            writer.mo13085D(i2, this.f24291q.mo13495c(this.f24276b[(i3 / 3) * 2]), this.f24291q.mo13500h(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0b63  */
    @Override // com.google.protobuf.Schema
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo13537b(T r12, com.google.protobuf.Writer r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mo13537b(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* renamed from: b0 */
    public final void m13538b0(int i2, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo13132n(i2, (String) obj);
        } else {
            writer.mo13138w(i2, (ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: c */
    public void mo13539c(T t) {
        int i2;
        int i3 = this.f24285k;
        while (true) {
            i2 = this.f24286l;
            if (i3 >= i2) {
                break;
            }
            long m13509D = m13509D(m13533Y(this.f24284j[i3]));
            Object m13691r = UnsafeUtil.m13691r(t, m13509D);
            if (m13691r != null) {
                UnsafeUtil.f24390e.m13724v(t, m13509D, this.f24291q.mo13494b(m13691r));
            }
            i3++;
        }
        int length = this.f24284j.length;
        while (i2 < length) {
            this.f24288n.mo13477a(t, this.f24284j[i2]);
            i2++;
        }
        this.f24289o.mo13656j(t);
        if (this.f24280f) {
            this.f24290p.mo13374f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.google.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    @Override // com.google.protobuf.Schema
    /* renamed from: d */
    public final boolean mo13540d(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.f24285k) {
                return !this.f24280f || this.f24290p.mo13371c(t).m13394j();
            }
            int i7 = this.f24284j[i6];
            int i8 = this.f24275a[i7];
            int m13533Y = m13533Y(i7);
            int i9 = this.f24275a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f24274s.getInt(t, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if (((268435456 & m13533Y) != 0) && !m13556u(t, i7, i2, i3, i11)) {
                return false;
            }
            int m13516X = m13516X(m13533Y);
            if (m13516X != 9 && m13516X != 17) {
                if (m13516X != 27) {
                    if (m13516X == 60 || m13516X == 68) {
                        if (m13557v(t, i8, i7) && !m13552p(i7).mo13540d(UnsafeUtil.m13691r(t, m13509D(m13533Y)))) {
                            return false;
                        }
                    } else if (m13516X != 49) {
                        if (m13516X != 50) {
                            continue;
                        } else {
                            Map<?, ?> mo13500h = this.f24291q.mo13500h(UnsafeUtil.m13691r(t, m13509D(m13533Y)));
                            if (!mo13500h.isEmpty()) {
                                if (this.f24291q.mo13495c(this.f24276b[(i7 / 3) * 2]).f24267c.f24420b == WireFormat.JavaType.MESSAGE) {
                                    ?? r1 = 0;
                                    Iterator<?> it = mo13500h.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r1 = r1;
                                        if (r1 == 0) {
                                            r1 = Protobuf.f24310c.m13567a(next.getClass());
                                        }
                                        if (!r1.mo13540d(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) UnsafeUtil.m13691r(t, m13509D(m13533Y));
                if (!list.isEmpty()) {
                    ?? m13552p = m13552p(i7);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        }
                        if (!m13552p.mo13540d(list.get(i12))) {
                            z = false;
                            break;
                        }
                        i12++;
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m13556u(t, i7, i2, i3, i11) && !m13552p(i7).mo13540d(UnsafeUtil.m13691r(t, m13509D(m13533Y)))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: e */
    public void mo13541e(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Objects.requireNonNull(extensionRegistryLite);
        m13558x(this.f24289o, this.f24290p, t, reader, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: f */
    public void mo13542f(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
        if (this.f24282h) {
            m13523M(t, bArr, i2, i3, registers);
        } else {
            m13522L(t, bArr, i2, i3, 0, registers);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (com.google.protobuf.SchemaUtil.m13577C(com.google.protobuf.UnsafeUtil.m13691r(r10, r5), com.google.protobuf.UnsafeUtil.m13691r(r11, r5)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (com.google.protobuf.SchemaUtil.m13577C(com.google.protobuf.UnsafeUtil.m13691r(r10, r5), com.google.protobuf.UnsafeUtil.m13691r(r11, r5)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13690q(r10, r5) == com.google.protobuf.UnsafeUtil.m13690q(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13689p(r10, r5) == com.google.protobuf.UnsafeUtil.m13689p(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13690q(r10, r5) == com.google.protobuf.UnsafeUtil.m13690q(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13689p(r10, r5) == com.google.protobuf.UnsafeUtil.m13689p(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13689p(r10, r5) == com.google.protobuf.UnsafeUtil.m13689p(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13689p(r10, r5) == com.google.protobuf.UnsafeUtil.m13689p(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        if (com.google.protobuf.SchemaUtil.m13577C(com.google.protobuf.UnsafeUtil.m13691r(r10, r5), com.google.protobuf.UnsafeUtil.m13691r(r11, r5)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010f, code lost:
    
        if (com.google.protobuf.SchemaUtil.m13577C(com.google.protobuf.UnsafeUtil.m13691r(r10, r5), com.google.protobuf.UnsafeUtil.m13691r(r11, r5)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (com.google.protobuf.SchemaUtil.m13577C(com.google.protobuf.UnsafeUtil.m13691r(r10, r5), com.google.protobuf.UnsafeUtil.m13691r(r11, r5)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13682i(r10, r5) == com.google.protobuf.UnsafeUtil.m13682i(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13689p(r10, r5) == com.google.protobuf.UnsafeUtil.m13689p(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13690q(r10, r5) == com.google.protobuf.UnsafeUtil.m13690q(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13689p(r10, r5) == com.google.protobuf.UnsafeUtil.m13689p(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13690q(r10, r5) == com.google.protobuf.UnsafeUtil.m13690q(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (com.google.protobuf.UnsafeUtil.m13690q(r10, r5) == com.google.protobuf.UnsafeUtil.m13690q(r11, r5)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ae, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.m13688o(r10, r5)) == java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.m13688o(r11, r5))) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.m13687n(r10, r5)) == java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.m13687n(r11, r5))) goto L109;
     */
    @Override // com.google.protobuf.Schema
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo13543g(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mo13543g(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: h */
    public int mo13544h(T t) {
        return this.f24282h ? m13554s(t) : m13553r(t);
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: i */
    public T mo13545i() {
        return (T) this.f24287m.mo13564a(this.f24279e);
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: j */
    public int mo13546j(T t) {
        int i2;
        int m13454b;
        int i3;
        int m13689p;
        int length = this.f24275a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int m13533Y = m13533Y(i5);
            int i6 = this.f24275a[i5];
            long m13509D = m13509D(m13533Y);
            int i7 = 37;
            switch (m13516X(m13533Y)) {
                case 0:
                    i2 = i4 * 53;
                    m13454b = Internal.m13454b(Double.doubleToLongBits(UnsafeUtil.m13687n(t, m13509D)));
                    i4 = m13454b + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    m13454b = Float.floatToIntBits(UnsafeUtil.m13688o(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    m13454b = Internal.m13454b(UnsafeUtil.m13690q(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    m13454b = Internal.m13454b(UnsafeUtil.m13690q(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    m13689p = UnsafeUtil.m13689p(t, m13509D);
                    i4 = i3 + m13689p;
                    break;
                case 5:
                    i2 = i4 * 53;
                    m13454b = Internal.m13454b(UnsafeUtil.m13690q(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    m13689p = UnsafeUtil.m13689p(t, m13509D);
                    i4 = i3 + m13689p;
                    break;
                case 7:
                    i2 = i4 * 53;
                    m13454b = Internal.m13453a(UnsafeUtil.m13682i(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    m13454b = ((String) UnsafeUtil.m13691r(t, m13509D)).hashCode();
                    i4 = m13454b + i2;
                    break;
                case 9:
                    Object m13691r = UnsafeUtil.m13691r(t, m13509D);
                    if (m13691r != null) {
                        i7 = m13691r.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    m13454b = UnsafeUtil.m13691r(t, m13509D).hashCode();
                    i4 = m13454b + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    m13689p = UnsafeUtil.m13689p(t, m13509D);
                    i4 = i3 + m13689p;
                    break;
                case 12:
                    i3 = i4 * 53;
                    m13689p = UnsafeUtil.m13689p(t, m13509D);
                    i4 = i3 + m13689p;
                    break;
                case 13:
                    i3 = i4 * 53;
                    m13689p = UnsafeUtil.m13689p(t, m13509D);
                    i4 = i3 + m13689p;
                    break;
                case 14:
                    i2 = i4 * 53;
                    m13454b = Internal.m13454b(UnsafeUtil.m13690q(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    m13689p = UnsafeUtil.m13689p(t, m13509D);
                    i4 = i3 + m13689p;
                    break;
                case 16:
                    i2 = i4 * 53;
                    m13454b = Internal.m13454b(UnsafeUtil.m13690q(t, m13509D));
                    i4 = m13454b + i2;
                    break;
                case 17:
                    Object m13691r2 = UnsafeUtil.m13691r(t, m13509D);
                    if (m13691r2 != null) {
                        i7 = m13691r2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i2 = i4 * 53;
                    m13454b = UnsafeUtil.m13691r(t, m13509D).hashCode();
                    i4 = m13454b + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    m13454b = UnsafeUtil.m13691r(t, m13509D).hashCode();
                    i4 = m13454b + i2;
                    break;
                case 51:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13454b(Double.doubleToLongBits(m13511F(t, m13509D)));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Float.floatToIntBits(m13512G(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13454b(m13514I(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13454b(m13514I(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m13557v(t, i6, i5)) {
                        i3 = i4 * 53;
                        m13689p = m13513H(t, m13509D);
                        i4 = i3 + m13689p;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13454b(m13514I(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m13557v(t, i6, i5)) {
                        i3 = i4 * 53;
                        m13689p = m13513H(t, m13509D);
                        i4 = i3 + m13689p;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13453a(m13510E(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = ((String) UnsafeUtil.m13691r(t, m13509D)).hashCode();
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = UnsafeUtil.m13691r(t, m13509D).hashCode();
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = UnsafeUtil.m13691r(t, m13509D).hashCode();
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m13557v(t, i6, i5)) {
                        i3 = i4 * 53;
                        m13689p = m13513H(t, m13509D);
                        i4 = i3 + m13689p;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m13557v(t, i6, i5)) {
                        i3 = i4 * 53;
                        m13689p = m13513H(t, m13509D);
                        i4 = i3 + m13689p;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m13557v(t, i6, i5)) {
                        i3 = i4 * 53;
                        m13689p = m13513H(t, m13509D);
                        i4 = i3 + m13689p;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13454b(m13514I(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m13557v(t, i6, i5)) {
                        i3 = i4 * 53;
                        m13689p = m13513H(t, m13509D);
                        i4 = i3 + m13689p;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = Internal.m13454b(m13514I(t, m13509D));
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m13557v(t, i6, i5)) {
                        i2 = i4 * 53;
                        m13454b = UnsafeUtil.m13691r(t, m13509D).hashCode();
                        i4 = m13454b + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f24289o.mo13653g(t).hashCode() + (i4 * 53);
        return this.f24280f ? (hashCode * 53) + this.f24290p.mo13371c(t).hashCode() : hashCode;
    }

    /* renamed from: k */
    public final boolean m13547k(T t, T t2, int i2) {
        return m13555t(t, i2) == m13555t(t2, i2);
    }

    /* renamed from: l */
    public final int m13548l(byte[] bArr, int i2, int i3, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (fieldType.ordinal()) {
            case 0:
                registers.f23963c = Double.valueOf(Double.longBitsToDouble(ArrayDecoders.m12997c(bArr, i2)));
                return i2 + 8;
            case 1:
                registers.f23963c = Float.valueOf(Float.intBitsToFloat(ArrayDecoders.m12996b(bArr, i2)));
                return i2 + 4;
            case 2:
            case 3:
                int m13016v = ArrayDecoders.m13016v(bArr, i2, registers);
                registers.f23963c = Long.valueOf(registers.f23962b);
                return m13016v;
            case 4:
            case 12:
            case 13:
                int m13014t = ArrayDecoders.m13014t(bArr, i2, registers);
                registers.f23963c = Integer.valueOf(registers.f23961a);
                return m13014t;
            case 5:
            case 15:
                registers.f23963c = Long.valueOf(ArrayDecoders.m12997c(bArr, i2));
                return i2 + 8;
            case 6:
            case 14:
                registers.f23963c = Integer.valueOf(ArrayDecoders.m12996b(bArr, i2));
                return i2 + 4;
            case 7:
                int m13016v2 = ArrayDecoders.m13016v(bArr, i2, registers);
                registers.f23963c = Boolean.valueOf(registers.f23962b != 0);
                return m13016v2;
            case 8:
                return ArrayDecoders.m13011q(bArr, i2, registers);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return ArrayDecoders.m12999e(Protobuf.f24310c.m13567a(cls), bArr, i2, i3, registers);
            case 11:
                return ArrayDecoders.m12995a(bArr, i2, registers);
            case 16:
                int m13014t2 = ArrayDecoders.m13014t(bArr, i2, registers);
                registers.f23963c = Integer.valueOf(CodedInputStream.m13171b(registers.f23961a));
                return m13014t2;
            case 17:
                int m13016v3 = ArrayDecoders.m13016v(bArr, i2, registers);
                registers.f23963c = Long.valueOf(CodedInputStream.m13172c(registers.f23962b));
                return m13016v3;
        }
    }

    /* renamed from: m */
    public final <UT, UB> UB m13549m(Object obj, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        int[] iArr = this.f24275a;
        int i3 = iArr[i2];
        Object m13691r = UnsafeUtil.m13691r(obj, m13509D(iArr[i2 + 1]));
        if (m13691r == null) {
            return ub;
        }
        int i4 = (i2 / 3) * 2;
        Internal.EnumVerifier enumVerifier = (Internal.EnumVerifier) this.f24276b[i4 + 1];
        if (enumVerifier == null) {
            return ub;
        }
        Map<?, ?> mo13496d = this.f24291q.mo13496d(m13691r);
        MapEntryLite.Metadata<?, ?> mo13495c = this.f24291q.mo13495c(this.f24276b[i4]);
        Iterator<Map.Entry<?, ?>> it = mo13496d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            if (!enumVerifier.mo11030a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.mo13659m();
                }
                ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(MapEntryLite.m13488a(mo13495c, next.getKey(), next.getValue()), null);
                CodedOutputStream codedOutputStream = codedBuilder.f23989a;
                try {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    FieldSet.m13388q(codedOutputStream, mo13495c.f24265a, 1, key);
                    FieldSet.m13388q(codedOutputStream, mo13495c.f24267c, 2, value);
                    codedBuilder.f23989a.m13296S();
                    unknownFieldSchema.mo13650d(ub, i3, new ByteString.LiteralByteString(codedBuilder.f23990b));
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: n */
    public final Internal.EnumVerifier m13550n(int i2) {
        return (Internal.EnumVerifier) this.f24276b[((i2 / 3) * 2) + 1];
    }

    /* renamed from: o */
    public final Object m13551o(int i2) {
        return this.f24276b[(i2 / 3) * 2];
    }

    /* renamed from: p */
    public final Schema m13552p(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f24276b;
        Schema schema = (Schema) objArr[i3];
        if (schema != null) {
            return schema;
        }
        Schema<T> m13567a = Protobuf.f24310c.m13567a((Class) objArr[i3 + 1]);
        this.f24276b[i3] = m13567a;
        return m13567a;
    }

    /* renamed from: r */
    public final int m13553r(T t) {
        int i2;
        int i3;
        int m13255W;
        int m13253U;
        int m13604h;
        int m13274p0;
        int m13276r0;
        Unsafe unsafe = f24274s;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (i5 < this.f24275a.length) {
            int m13533Y = m13533Y(i5);
            int i9 = this.f24275a[i5];
            int m13516X = m13516X(m13533Y);
            if (m13516X <= 17) {
                i2 = this.f24275a[i5 + 2];
                int i10 = i4 & i2;
                i3 = 1 << (i2 >>> 20);
                if (i10 != i7) {
                    i8 = unsafe.getInt(t, i10);
                    i7 = i10;
                }
            } else {
                i2 = (!this.f24283i || m13516X < FieldType.f24163g.f24169b || m13516X > FieldType.f24164h.f24169b) ? 0 : i4 & this.f24275a[i5 + 2];
                i3 = 0;
            }
            long m13509D = m13509D(m13533Y);
            int i11 = i7;
            int i12 = i8;
            switch (m13516X) {
                case 0:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13255W(i9, 0.0d);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13259a0(i9, 0.0f);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13263e0(i9, unsafe.getLong(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13277s0(i9, unsafe.getLong(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13261c0(i9, unsafe.getInt(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13258Z(i9, 0L);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13257Y(i9, 0);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13252T(i9, true);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i12 & i3) != 0) {
                        Object object = unsafe.getObject(t, m13509D);
                        m13253U = object instanceof ByteString ? CodedOutputStream.m13253U(i9, (ByteString) object) : CodedOutputStream.m13272n0(i9, (String) object);
                        i6 += m13253U;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i12 & i3) != 0) {
                        m13255W = SchemaUtil.m13610n(i9, unsafe.getObject(t, m13509D), m13552p(i5));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13253U(i9, (ByteString) unsafe.getObject(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13275q0(i9, unsafe.getInt(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13256X(i9, unsafe.getInt(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13266h0(i9, 0);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13267i0(i9, 0L);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13268j0(i9, unsafe.getInt(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13270l0(i9, unsafe.getLong(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i12 & i3) != 0) {
                        m13255W = CodedOutputStream.m13260b0(i9, (MessageLite) unsafe.getObject(t, m13509D), m13552p(i5));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m13255W = SchemaUtil.m13603g(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 19:
                    m13255W = SchemaUtil.m13601e(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 20:
                    m13255W = SchemaUtil.m13608l(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 21:
                    m13255W = SchemaUtil.m13619w(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 22:
                    m13255W = SchemaUtil.m13606j(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 23:
                    m13255W = SchemaUtil.m13603g(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 24:
                    m13255W = SchemaUtil.m13601e(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 25:
                    m13255W = SchemaUtil.m13597a(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 26:
                    m13255W = SchemaUtil.m13616t(i9, (List) unsafe.getObject(t, m13509D));
                    i6 += m13255W;
                    break;
                case 27:
                    m13255W = SchemaUtil.m13611o(i9, (List) unsafe.getObject(t, m13509D), m13552p(i5));
                    i6 += m13255W;
                    break;
                case 28:
                    m13255W = SchemaUtil.m13598b(i9, (List) unsafe.getObject(t, m13509D));
                    i6 += m13255W;
                    break;
                case 29:
                    m13255W = SchemaUtil.m13617u(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 30:
                    m13255W = SchemaUtil.m13599c(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 31:
                    m13255W = SchemaUtil.m13601e(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 32:
                    m13255W = SchemaUtil.m13603g(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 33:
                    m13255W = SchemaUtil.m13612p(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 34:
                    m13255W = SchemaUtil.m13614r(i9, (List) unsafe.getObject(t, m13509D), false);
                    i6 += m13255W;
                    break;
                case 35:
                    m13604h = SchemaUtil.m13604h((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 36:
                    m13604h = SchemaUtil.m13602f((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 37:
                    m13604h = SchemaUtil.m13609m((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    m13604h = SchemaUtil.m13620x((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 39:
                    m13604h = SchemaUtil.m13607k((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 40:
                    m13604h = SchemaUtil.m13604h((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 41:
                    m13604h = SchemaUtil.m13602f((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(t, m13509D);
                    Class<?> cls = SchemaUtil.f24337a;
                    m13604h = list.size();
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 43:
                    m13604h = SchemaUtil.m13618v((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 44:
                    m13604h = SchemaUtil.m13600d((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 45:
                    m13604h = SchemaUtil.m13602f((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 46:
                    m13604h = SchemaUtil.m13604h((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 47:
                    m13604h = SchemaUtil.m13613q((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case 48:
                    m13604h = SchemaUtil.m13615s((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i2, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i9);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i6 += m13276r0 + m13274p0 + m13604h;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    m13255W = SchemaUtil.m13605i(i9, (List) unsafe.getObject(t, m13509D), m13552p(i5));
                    i6 += m13255W;
                    break;
                case 50:
                    m13255W = this.f24291q.mo13498f(i9, unsafe.getObject(t, m13509D), m13551o(i5));
                    i6 += m13255W;
                    break;
                case 51:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13255W(i9, 0.0d);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13259a0(i9, 0.0f);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13263e0(i9, m13514I(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13277s0(i9, m13514I(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13261c0(i9, m13513H(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13258Z(i9, 0L);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13257Y(i9, 0);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13252T(i9, true);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m13557v(t, i9, i5)) {
                        Object object2 = unsafe.getObject(t, m13509D);
                        m13253U = object2 instanceof ByteString ? CodedOutputStream.m13253U(i9, (ByteString) object2) : CodedOutputStream.m13272n0(i9, (String) object2);
                        i6 += m13253U;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = SchemaUtil.m13610n(i9, unsafe.getObject(t, m13509D), m13552p(i5));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13253U(i9, (ByteString) unsafe.getObject(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13275q0(i9, m13513H(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13256X(i9, m13513H(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13266h0(i9, 0);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13267i0(i9, 0L);
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13268j0(i9, m13513H(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13270l0(i9, m13514I(t, m13509D));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m13557v(t, i9, i5)) {
                        m13255W = CodedOutputStream.m13260b0(i9, (MessageLite) unsafe.getObject(t, m13509D), m13552p(i5));
                        i6 += m13255W;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
            i4 = 1048575;
            i7 = i11;
            i8 = i12;
        }
        int i13 = 0;
        UnknownFieldSchema<?, ?> unknownFieldSchema = this.f24289o;
        int mo13654h = i6 + unknownFieldSchema.mo13654h(unknownFieldSchema.mo13653g(t));
        if (!this.f24280f) {
            return mo13654h;
        }
        FieldSet<?> mo13371c = this.f24290p.mo13371c(t);
        for (int i14 = 0; i14 < mo13371c.f24155a.m13626d(); i14++) {
            Map.Entry<?, Object> m13625c = mo13371c.f24155a.m13625c(i14);
            i13 += FieldSet.m13386f((FieldSet.FieldDescriptorLite) m13625c.getKey(), m13625c.getValue());
        }
        for (Map.Entry<?, Object> entry : mo13371c.f24155a.m13627f()) {
            i13 += FieldSet.m13386f((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return mo13654h + i13;
    }

    /* renamed from: s */
    public final int m13554s(T t) {
        int m13255W;
        int m13604h;
        int m13274p0;
        int m13276r0;
        Unsafe unsafe = f24274s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24275a.length; i3 += 3) {
            int m13533Y = m13533Y(i3);
            int m13516X = m13516X(m13533Y);
            int i4 = this.f24275a[i3];
            long m13509D = m13509D(m13533Y);
            int i5 = (m13516X < FieldType.f24163g.f24169b || m13516X > FieldType.f24164h.f24169b) ? 0 : this.f24275a[i3 + 2] & 1048575;
            switch (m13516X) {
                case 0:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13255W(i4, 0.0d);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13259a0(i4, 0.0f);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13263e0(i4, UnsafeUtil.m13690q(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13277s0(i4, UnsafeUtil.m13690q(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13261c0(i4, UnsafeUtil.m13689p(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13258Z(i4, 0L);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13257Y(i4, 0);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13252T(i4, true);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m13555t(t, i3)) {
                        Object m13691r = UnsafeUtil.m13691r(t, m13509D);
                        m13255W = m13691r instanceof ByteString ? CodedOutputStream.m13253U(i4, (ByteString) m13691r) : CodedOutputStream.m13272n0(i4, (String) m13691r);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m13555t(t, i3)) {
                        m13255W = SchemaUtil.m13610n(i4, UnsafeUtil.m13691r(t, m13509D), m13552p(i3));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13253U(i4, (ByteString) UnsafeUtil.m13691r(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13275q0(i4, UnsafeUtil.m13689p(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13256X(i4, UnsafeUtil.m13689p(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13266h0(i4, 0);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13267i0(i4, 0L);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13268j0(i4, UnsafeUtil.m13689p(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13270l0(i4, UnsafeUtil.m13690q(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m13555t(t, i3)) {
                        m13255W = CodedOutputStream.m13260b0(i4, (MessageLite) UnsafeUtil.m13691r(t, m13509D), m13552p(i3));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m13255W = SchemaUtil.m13603g(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 19:
                    m13255W = SchemaUtil.m13601e(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 20:
                    m13255W = SchemaUtil.m13608l(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 21:
                    m13255W = SchemaUtil.m13619w(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 22:
                    m13255W = SchemaUtil.m13606j(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 23:
                    m13255W = SchemaUtil.m13603g(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 24:
                    m13255W = SchemaUtil.m13601e(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 25:
                    m13255W = SchemaUtil.m13597a(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 26:
                    m13255W = SchemaUtil.m13616t(i4, m13518w(t, m13509D));
                    i2 += m13255W;
                    break;
                case 27:
                    m13255W = SchemaUtil.m13611o(i4, m13518w(t, m13509D), m13552p(i3));
                    i2 += m13255W;
                    break;
                case 28:
                    m13255W = SchemaUtil.m13598b(i4, m13518w(t, m13509D));
                    i2 += m13255W;
                    break;
                case 29:
                    m13255W = SchemaUtil.m13617u(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 30:
                    m13255W = SchemaUtil.m13599c(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 31:
                    m13255W = SchemaUtil.m13601e(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 32:
                    m13255W = SchemaUtil.m13603g(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 33:
                    m13255W = SchemaUtil.m13612p(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 34:
                    m13255W = SchemaUtil.m13614r(i4, m13518w(t, m13509D), false);
                    i2 += m13255W;
                    break;
                case 35:
                    m13604h = SchemaUtil.m13604h((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 36:
                    m13604h = SchemaUtil.m13602f((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 37:
                    m13604h = SchemaUtil.m13609m((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    m13604h = SchemaUtil.m13620x((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 39:
                    m13604h = SchemaUtil.m13607k((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 40:
                    m13604h = SchemaUtil.m13604h((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 41:
                    m13604h = SchemaUtil.m13602f((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(t, m13509D);
                    Class<?> cls = SchemaUtil.f24337a;
                    m13604h = list.size();
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 43:
                    m13604h = SchemaUtil.m13618v((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 44:
                    m13604h = SchemaUtil.m13600d((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 45:
                    m13604h = SchemaUtil.m13602f((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 46:
                    m13604h = SchemaUtil.m13604h((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 47:
                    m13604h = SchemaUtil.m13613q((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case 48:
                    m13604h = SchemaUtil.m13615s((List) unsafe.getObject(t, m13509D));
                    if (m13604h <= 0) {
                        break;
                    } else {
                        if (this.f24283i) {
                            unsafe.putInt(t, i5, m13604h);
                        }
                        m13274p0 = CodedOutputStream.m13274p0(i4);
                        m13276r0 = CodedOutputStream.m13276r0(m13604h);
                        i2 = m13276r0 + m13274p0 + m13604h + i2;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    m13255W = SchemaUtil.m13605i(i4, m13518w(t, m13509D), m13552p(i3));
                    i2 += m13255W;
                    break;
                case 50:
                    m13255W = this.f24291q.mo13498f(i4, UnsafeUtil.m13691r(t, m13509D), m13551o(i3));
                    i2 += m13255W;
                    break;
                case 51:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13255W(i4, 0.0d);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13259a0(i4, 0.0f);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13263e0(i4, m13514I(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13277s0(i4, m13514I(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13261c0(i4, m13513H(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13258Z(i4, 0L);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13257Y(i4, 0);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13252T(i4, true);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m13557v(t, i4, i3)) {
                        Object m13691r2 = UnsafeUtil.m13691r(t, m13509D);
                        m13255W = m13691r2 instanceof ByteString ? CodedOutputStream.m13253U(i4, (ByteString) m13691r2) : CodedOutputStream.m13272n0(i4, (String) m13691r2);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = SchemaUtil.m13610n(i4, UnsafeUtil.m13691r(t, m13509D), m13552p(i3));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13253U(i4, (ByteString) UnsafeUtil.m13691r(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13275q0(i4, m13513H(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13256X(i4, m13513H(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13266h0(i4, 0);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13267i0(i4, 0L);
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13268j0(i4, m13513H(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13270l0(i4, m13514I(t, m13509D));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m13557v(t, i4, i3)) {
                        m13255W = CodedOutputStream.m13260b0(i4, (MessageLite) UnsafeUtil.m13691r(t, m13509D), m13552p(i3));
                        i2 += m13255W;
                        break;
                    } else {
                        break;
                    }
            }
        }
        UnknownFieldSchema<?, ?> unknownFieldSchema = this.f24289o;
        return i2 + unknownFieldSchema.mo13654h(unknownFieldSchema.mo13653g(t));
    }

    /* renamed from: t */
    public final boolean m13555t(T t, int i2) {
        int[] iArr = this.f24275a;
        int i3 = iArr[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 != 1048575) {
            return (UnsafeUtil.m13689p(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long m13509D = m13509D(i4);
        switch (m13516X(i4)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.m13687n(t, m13509D)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.m13688o(t, m13509D)) != 0;
            case 2:
                return UnsafeUtil.m13690q(t, m13509D) != 0;
            case 3:
                return UnsafeUtil.m13690q(t, m13509D) != 0;
            case 4:
                return UnsafeUtil.m13689p(t, m13509D) != 0;
            case 5:
                return UnsafeUtil.m13690q(t, m13509D) != 0;
            case 6:
                return UnsafeUtil.m13689p(t, m13509D) != 0;
            case 7:
                return UnsafeUtil.m13682i(t, m13509D);
            case 8:
                Object m13691r = UnsafeUtil.m13691r(t, m13509D);
                if (m13691r instanceof String) {
                    return !((String) m13691r).isEmpty();
                }
                if (m13691r instanceof ByteString) {
                    return !ByteString.f23981c.equals(m13691r);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.m13691r(t, m13509D) != null;
            case 10:
                return !ByteString.f23981c.equals(UnsafeUtil.m13691r(t, m13509D));
            case 11:
                return UnsafeUtil.m13689p(t, m13509D) != 0;
            case 12:
                return UnsafeUtil.m13689p(t, m13509D) != 0;
            case 13:
                return UnsafeUtil.m13689p(t, m13509D) != 0;
            case 14:
                return UnsafeUtil.m13690q(t, m13509D) != 0;
            case 15:
                return UnsafeUtil.m13689p(t, m13509D) != 0;
            case 16:
                return UnsafeUtil.m13690q(t, m13509D) != 0;
            case 17:
                return UnsafeUtil.m13691r(t, m13509D) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: u */
    public final boolean m13556u(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? m13555t(t, i2) : (i4 & i5) != 0;
    }

    /* renamed from: v */
    public final boolean m13557v(T t, int i2, int i3) {
        return UnsafeUtil.m13689p(t, (long) (this.f24275a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x0077, code lost:
    
        r0 = r16.f24285k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x007b, code lost:
    
        if (r0 >= r16.f24286l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x007d, code lost:
    
        r13 = m13549m(r19, r16.f24284j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0088, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x008a, code lost:
    
        r17.mo13660n(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void m13558x(com.google.protobuf.UnknownFieldSchema<UT, UB> r17, com.google.protobuf.ExtensionSchema<ET> r18, T r19, com.google.protobuf.Reader r20, com.google.protobuf.ExtensionRegistryLite r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m13558x(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* renamed from: y */
    public final <K, V> void m13559y(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long m13509D = m13509D(this.f24275a[i2 + 1]);
        Object m13691r = UnsafeUtil.m13691r(obj, m13509D);
        if (m13691r == null) {
            m13691r = this.f24291q.mo13497e(obj2);
            UnsafeUtil.f24390e.m13724v(obj, m13509D, m13691r);
        } else if (this.f24291q.mo13499g(m13691r)) {
            Object mo13497e = this.f24291q.mo13497e(obj2);
            this.f24291q.mo13493a(mo13497e, m13691r);
            UnsafeUtil.f24390e.m13724v(obj, m13509D, mo13497e);
            m13691r = mo13497e;
        }
        reader.mo13022E(this.f24291q.mo13496d(m13691r), this.f24291q.mo13495c(obj2), extensionRegistryLite);
    }

    /* renamed from: z */
    public final void m13560z(T t, T t2, int i2) {
        long m13509D = m13509D(this.f24275a[i2 + 1]);
        if (m13555t(t2, i2)) {
            Object m13691r = UnsafeUtil.m13691r(t, m13509D);
            Object m13691r2 = UnsafeUtil.m13691r(t2, m13509D);
            if (m13691r != null && m13691r2 != null) {
                UnsafeUtil.f24390e.m13724v(t, m13509D, Internal.m13455c(m13691r, m13691r2));
                m13530U(t, i2);
            } else if (m13691r2 != null) {
                UnsafeUtil.f24390e.m13724v(t, m13509D, m13691r2);
                m13530U(t, i2);
            }
        }
    }
}
