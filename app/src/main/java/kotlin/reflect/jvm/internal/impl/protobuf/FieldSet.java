package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes3.dex */
final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {

    /* renamed from: d */
    public static final FieldSet f65649d = new FieldSet(true);

    /* renamed from: a */
    public final SmallSortedMap<FieldDescriptorType, Object> f65650a;

    /* renamed from: b */
    public boolean f65651b;

    /* renamed from: c */
    public boolean f65652c = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1 */
    public static /* synthetic */ class C66951 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65653a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f65654b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f65654b = iArr;
            try {
                iArr[WireFormat.FieldType.f65725d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65654b[WireFormat.FieldType.f65726e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65654b[WireFormat.FieldType.f65727f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65654b[WireFormat.FieldType.f65728g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65654b[WireFormat.FieldType.f65729h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65654b[WireFormat.FieldType.f65730i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65654b[WireFormat.FieldType.f65731j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65654b[WireFormat.FieldType.f65732k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f65654b[WireFormat.FieldType.f65733l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f65654b[WireFormat.FieldType.f65736o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f65654b[WireFormat.FieldType.f65737p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f65654b[WireFormat.FieldType.f65739r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f65654b[WireFormat.FieldType.f65740s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f65654b[WireFormat.FieldType.f65741t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f65654b[WireFormat.FieldType.f65742u.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f65654b[WireFormat.FieldType.f65734m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f65654b[WireFormat.FieldType.f65735n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f65654b[WireFormat.FieldType.f65738q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f65653a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f65653a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.LONG;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f65653a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.FLOAT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f65653a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.DOUBLE;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f65653a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.BOOLEAN;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f65653a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.STRING;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f65653a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f65653a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f65653a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        /* renamed from: A */
        WireFormat.JavaType mo33305A();

        /* renamed from: C */
        boolean mo33306C();

        /* renamed from: g */
        MessageLite.Builder mo33307g(MessageLite.Builder builder, MessageLite messageLite);

        /* renamed from: x */
        int mo33308x();

        /* renamed from: y */
        boolean mo33309y();

        /* renamed from: z */
        WireFormat.FieldType mo33310z();
    }

    public FieldSet() {
        int i2 = SmallSortedMap.f65706g;
        this.f65650a = (SmallSortedMap<FieldDescriptorType, Object>) new SmallSortedMap<FieldDescriptorLite<Object>, Object>(16) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
            /* renamed from: h */
            public void mo33350h() {
                if (!this.f65710e) {
                    for (int i3 = 0; i3 < m33347d(); i3++) {
                        Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> m33346c = m33346c(i3);
                        if (m33346c.getKey().mo33309y()) {
                            m33346c.setValue(Collections.unmodifiableList((List) m33346c.getValue()));
                        }
                    }
                    for (Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> entry : m33348f()) {
                        if (entry.getKey().mo33309y()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.mo33350h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return put((FieldSet.FieldDescriptorLite) obj, obj2);
            }
        };
    }

    /* renamed from: d */
    public static int m33290d(WireFormat.FieldType fieldType, Object obj) {
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return CodedOutputStream.m33268h(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.m33268h(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m33264d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.m33267g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException("UTF-8 not supported.", e2);
                }
            case 9:
                return ((MessageLite) obj).mo32957c();
            case 10:
                if (!(obj instanceof LazyField)) {
                    return CodedOutputStream.m33266f((MessageLite) obj);
                }
                LazyField lazyField = (LazyField) obj;
                if (!lazyField.f65677a) {
                    throw null;
                }
                int mo32957c = lazyField.f65678b.mo32957c();
                return CodedOutputStream.m33267g(mo32957c) + mo32957c;
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m33261a((ByteString) obj);
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.m33267g(bArr.length) + bArr.length;
            case 12:
                return CodedOutputStream.m33267g(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.m33264d(((Internal.EnumLite) obj).mo32978x()) : CodedOutputStream.m33264d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.m33267g((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.m33268h((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: e */
    public static int m33291e(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType mo33310z = fieldDescriptorLite.mo33310z();
        int mo33308x = fieldDescriptorLite.mo33308x();
        if (!fieldDescriptorLite.mo33309y()) {
            int m33269i = CodedOutputStream.m33269i(mo33308x);
            if (mo33310z == WireFormat.FieldType.f65734m) {
                m33269i *= 2;
            }
            return m33269i + m33290d(mo33310z, obj);
        }
        int i2 = 0;
        if (fieldDescriptorLite.mo33306C()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i2 += m33290d(mo33310z, it.next());
            }
            return CodedOutputStream.m33267g(i2) + CodedOutputStream.m33269i(mo33308x) + i2;
        }
        for (Object obj2 : (List) obj) {
            int m33269i2 = CodedOutputStream.m33269i(mo33308x);
            if (mo33310z == WireFormat.FieldType.f65734m) {
                m33269i2 *= 2;
            }
            i2 += m33269i2 + m33290d(mo33310z, obj2);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m33292g(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.f65745c;
    }

    /* renamed from: k */
    public static Object m33293k(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) throws IOException {
        byte[] m33249i;
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(codedInputStream.m33251k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(codedInputStream.m33250j()));
            case 2:
                return Long.valueOf(codedInputStream.m33253m());
            case 3:
                return Long.valueOf(codedInputStream.m33253m());
            case 4:
                return Integer.valueOf(codedInputStream.m33252l());
            case 5:
                return Long.valueOf(codedInputStream.m33251k());
            case 6:
                return Integer.valueOf(codedInputStream.m33250j());
            case 7:
                return Boolean.valueOf(codedInputStream.m33245e());
            case 8:
                if (!z) {
                    int m33252l = codedInputStream.m33252l();
                    int i2 = codedInputStream.f65632c;
                    int i3 = codedInputStream.f65634e;
                    if (m33252l > i2 - i3 || m33252l <= 0) {
                        return m33252l == 0 ? "" : new String(codedInputStream.m33249i(m33252l), "UTF-8");
                    }
                    String str = new String(codedInputStream.f65630a, i3, m33252l, "UTF-8");
                    codedInputStream.f65634e += m33252l;
                    return str;
                }
                int m33252l2 = codedInputStream.m33252l();
                int i4 = codedInputStream.f65634e;
                if (m33252l2 <= codedInputStream.f65632c - i4 && m33252l2 > 0) {
                    m33249i = codedInputStream.f65630a;
                    codedInputStream.f65634e = i4 + m33252l2;
                } else {
                    if (m33252l2 == 0) {
                        return "";
                    }
                    m33249i = codedInputStream.m33249i(m33252l2);
                    i4 = 0;
                }
                if (Utf8.m33357d(m33249i, i4, i4 + m33252l2)) {
                    return new String(m33249i, i4, m33252l2, "UTF-8");
                }
                throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return codedInputStream.m33246f();
            case 12:
                return Integer.valueOf(codedInputStream.m33252l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(codedInputStream.m33250j());
            case 15:
                return Long.valueOf(codedInputStream.m33251k());
            case 16:
                int m33252l3 = codedInputStream.m33252l();
                return Integer.valueOf((-(m33252l3 & 1)) ^ (m33252l3 >>> 1));
            case 17:
                long m33253m = codedInputStream.m33253m();
                return Long.valueOf((-(m33253m & 1)) ^ (m33253m >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if ((r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if ((r2 instanceof byte[]) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) == false) goto L26;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m33294m(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
        /*
            java.util.Objects.requireNonNull(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = r1.f65744b
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L3a;
                case 1: goto L37;
                case 2: goto L34;
                case 3: goto L31;
                case 4: goto L2e;
                case 5: goto L2b;
                case 6: goto L20;
                case 7: goto L17;
                case 8: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L3c
        Le:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            if (r1 != 0) goto L28
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField
            if (r1 == 0) goto L3c
            goto L28
        L17:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L28
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            if (r1 == 0) goto L3c
            goto L28
        L20:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString
            if (r1 != 0) goto L28
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3c
        L28:
            r1 = 1
            r0 = 1
            goto L3c
        L2b:
            boolean r0 = r2 instanceof java.lang.String
            goto L3c
        L2e:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L3c
        L31:
            boolean r0 = r2 instanceof java.lang.Double
            goto L3c
        L34:
            boolean r0 = r2 instanceof java.lang.Float
            goto L3c
        L37:
            boolean r0 = r2 instanceof java.lang.Long
            goto L3c
        L3a:
            boolean r0 = r2 instanceof java.lang.Integer
        L3c:
            if (r0 == 0) goto L3f
            return
        L3f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.m33294m(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: n */
    public static void m33295n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) throws IOException {
        if (fieldType != WireFormat.FieldType.f65734m) {
            codedOutputStream.m33288z((i2 << 3) | m33292g(fieldType, false));
            m33296o(codedOutputStream, fieldType, obj);
        } else {
            int i3 = i2 << 3;
            codedOutputStream.m33288z(i3 | 3);
            ((MessageLite) obj).mo32960f(codedOutputStream);
            codedOutputStream.m33288z(i3 | 4);
        }
    }

    /* renamed from: o */
    public static void m33296o(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.m33287y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.m33286x(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.m33271A(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.m33271A(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m33280r(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.m33287y(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.m33286x(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.m33283u(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.m33288z(bytes.length);
                codedOutputStream.m33285w(bytes);
                break;
            case 9:
                ((MessageLite) obj).mo32960f(codedOutputStream);
                break;
            case 10:
                codedOutputStream.m33282t((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.m33288z(bArr.length);
                    codedOutputStream.m33285w(bArr);
                    break;
                } else {
                    codedOutputStream.m33276n((ByteString) obj);
                    break;
                }
            case 12:
                codedOutputStream.m33288z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.m33278p(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.m33278p(((Internal.EnumLite) obj).mo32978x());
                    break;
                }
            case 14:
                codedOutputStream.m33286x(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m33287y(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.m33288z((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.m33271A((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    /* renamed from: a */
    public void m33297a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!((GeneratedMessageLite.ExtensionDescriptor) fielddescriptortype).f65666e) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m33294m(((GeneratedMessageLite.ExtensionDescriptor) fielddescriptortype).f65665d, obj);
        Object m33300f = m33300f(fielddescriptortype);
        if (m33300f == null) {
            list = new ArrayList();
            this.f65650a.put(fielddescriptortype, list);
        } else {
            list = (List) m33300f;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FieldSet<FieldDescriptorType> clone() {
        FieldSet<FieldDescriptorType> fieldSet = new FieldSet<>();
        for (int i2 = 0; i2 < this.f65650a.m33347d(); i2++) {
            Map.Entry<FieldDescriptorType, Object> m33346c = this.f65650a.m33346c(i2);
            fieldSet.m33304l(m33346c.getKey(), m33346c.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f65650a.m33348f()) {
            fieldSet.m33304l(entry.getKey(), entry.getValue());
        }
        fieldSet.f65652c = this.f65652c;
        return fieldSet;
    }

    /* renamed from: c */
    public final Object m33299c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: f */
    public Object m33300f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f65650a.get(fielddescriptortype);
        return obj instanceof LazyField ? ((LazyField) obj).m33331a() : obj;
    }

    /* renamed from: h */
    public final boolean m33301h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo33305A() == WireFormat.JavaType.MESSAGE) {
            if (key.mo33309y()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).mo32959e()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).mo32959e()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public void m33302i() {
        if (this.f65651b) {
            return;
        }
        this.f65650a.mo33350h();
        this.f65651b = true;
    }

    /* renamed from: j */
    public final void m33303j(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).m33331a();
        }
        if (key.mo33309y()) {
            Object m33300f = m33300f(key);
            if (m33300f == null) {
                m33300f = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m33300f).add(m33299c(it.next()));
            }
            this.f65650a.put(key, m33300f);
            return;
        }
        if (key.mo33305A() != WireFormat.JavaType.MESSAGE) {
            this.f65650a.put(key, m33299c(value));
            return;
        }
        Object m33300f2 = m33300f(key);
        if (m33300f2 == null) {
            this.f65650a.put(key, m33299c(value));
        } else {
            this.f65650a.put(key, key.mo33307g(((MessageLite) m33300f2).mo32956b(), (MessageLite) value).mo32962A());
        }
    }

    /* renamed from: l */
    public void m33304l(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo33309y()) {
            m33294m(fielddescriptortype.mo33310z(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m33294m(fielddescriptortype.mo33310z(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f65652c = true;
        }
        this.f65650a.put(fielddescriptortype, obj);
    }

    public FieldSet(boolean z) {
        int i2 = SmallSortedMap.f65706g;
        this.f65650a = (SmallSortedMap<FieldDescriptorType, Object>) new SmallSortedMap<FieldDescriptorLite<Object>, Object>(0) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
            /* renamed from: h */
            public void mo33350h() {
                if (!this.f65710e) {
                    for (int i3 = 0; i3 < m33347d(); i3++) {
                        Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> m33346c = m33346c(i3);
                        if (m33346c.getKey().mo33309y()) {
                            m33346c.setValue(Collections.unmodifiableList((List) m33346c.getValue()));
                        }
                    }
                    for (Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> entry : m33348f()) {
                        if (entry.getKey().mo33309y()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.mo33350h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return put((FieldSet.FieldDescriptorLite) obj, obj2);
            }
        };
        m33302i();
    }
}
