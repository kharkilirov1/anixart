package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* renamed from: d */
    public static final FieldSet f24154d = new FieldSet(true);

    /* renamed from: a */
    public final SmallSortedMap<T, Object> f24155a;

    /* renamed from: b */
    public boolean f24156b;

    /* renamed from: c */
    public boolean f24157c;

    /* renamed from: com.google.protobuf.FieldSet$1 */
    public static /* synthetic */ class C23731 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24158a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f24159b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24159b = iArr;
            try {
                iArr[WireFormat.FieldType.f24401d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24159b[WireFormat.FieldType.f24402e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24159b[WireFormat.FieldType.f24403f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24159b[WireFormat.FieldType.f24404g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24159b[WireFormat.FieldType.f24405h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24159b[WireFormat.FieldType.f24406i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24159b[WireFormat.FieldType.f24407j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24159b[WireFormat.FieldType.f24408k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24159b[WireFormat.FieldType.f24410m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24159b[WireFormat.FieldType.f24411n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24159b[WireFormat.FieldType.f24409l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24159b[WireFormat.FieldType.f24412o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24159b[WireFormat.FieldType.f24413p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24159b[WireFormat.FieldType.f24415r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24159b[WireFormat.FieldType.f24416s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24159b[WireFormat.FieldType.f24417t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24159b[WireFormat.FieldType.f24418u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f24159b[WireFormat.FieldType.f24414q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f24158a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f24158a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.LONG;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f24158a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.FLOAT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f24158a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.DOUBLE;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f24158a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.BOOLEAN;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f24158a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.STRING;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f24158a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f24158a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f24158a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static final class Builder<T extends FieldDescriptorLite<T>> {
        public Builder() {
            int i2 = SmallSortedMap.f24341i;
            new SmallSortedMap.C23931(16);
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        /* renamed from: A */
        WireFormat.JavaType mo13400A();

        /* renamed from: C */
        boolean mo13401C();

        /* renamed from: D */
        MessageLite.Builder mo13402D(MessageLite.Builder builder, MessageLite messageLite);

        /* renamed from: x */
        int mo13403x();

        /* renamed from: y */
        boolean mo13404y();

        /* renamed from: z */
        WireFormat.FieldType mo13405z();
    }

    public FieldSet() {
        int i2 = SmallSortedMap.f24341i;
        this.f24155a = new SmallSortedMap.C23931(16);
    }

    /* renamed from: c */
    public static Object m13383c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m13384d(WireFormat.FieldType fieldType, int i2, Object obj) {
        int m13274p0 = CodedOutputStream.m13274p0(i2);
        if (fieldType == WireFormat.FieldType.f24410m) {
            m13274p0 *= 2;
        }
        return m13274p0 + m13385e(fieldType, obj);
    }

    /* renamed from: e */
    public static int m13385e(WireFormat.FieldType fieldType, Object obj) {
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f24038b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f24038b;
                return 4;
            case 2:
                return CodedOutputStream.m13278t0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.m13278t0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m13262d0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f24038b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f24038b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f24038b;
                return 1;
            case 8:
                return obj instanceof ByteString ? CodedOutputStream.m13254V((ByteString) obj) : CodedOutputStream.m13273o0((String) obj);
            case 9:
                Logger logger6 = CodedOutputStream.f24038b;
                return ((MessageLite) obj).mo13430c();
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.m13264f0((LazyField) obj);
                }
                Logger logger7 = CodedOutputStream.f24038b;
                return CodedOutputStream.m13265g0(((MessageLite) obj).mo13430c());
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m13254V((ByteString) obj);
                }
                Logger logger8 = CodedOutputStream.f24038b;
                return CodedOutputStream.m13265g0(((byte[]) obj).length);
            case 12:
                return CodedOutputStream.m13276r0(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.m13262d0(((Internal.EnumLite) obj).mo11028x()) : CodedOutputStream.m13262d0(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = CodedOutputStream.f24038b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = CodedOutputStream.f24038b;
                return 8;
            case 16:
                return CodedOutputStream.m13269k0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m13271m0(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m13386f(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType mo13405z = fieldDescriptorLite.mo13405z();
        int mo13403x = fieldDescriptorLite.mo13403x();
        if (!fieldDescriptorLite.mo13404y()) {
            return m13384d(mo13405z, mo13403x, obj);
        }
        int i2 = 0;
        if (fieldDescriptorLite.mo13401C()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i2 += m13385e(mo13405z, it.next());
            }
            return CodedOutputStream.m13274p0(mo13403x) + i2 + CodedOutputStream.m13276r0(i2);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i2 += m13384d(mo13405z, mo13403x, it2.next());
        }
        return i2;
    }

    /* renamed from: k */
    public static <T extends FieldDescriptorLite<T>> boolean m13387k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo13400A() == WireFormat.JavaType.MESSAGE) {
            if (key.mo13404y()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).mo13432e()) {
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
                if (!((MessageLite) value).mo13432e()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    public static void m13388q(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.f24410m) {
            codedOutputStream.mo13293L0(i2, 3);
            ((MessageLite) obj).mo13433g(codedOutputStream);
            codedOutputStream.mo13293L0(i2, 4);
            return;
        }
        codedOutputStream.mo13293L0(i2, fieldType.f24421c);
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.mo13285D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.mo13284C0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.mo13295N0(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.mo13295N0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo13286E0(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.mo13285D0(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.mo13284C0(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.mo13307z0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo13292K0((String) obj);
                    break;
                } else {
                    codedOutputStream.mo13283B0((ByteString) obj);
                    break;
                }
            case 9:
                ((MessageLite) obj).mo13433g(codedOutputStream);
                break;
            case 10:
                codedOutputStream.mo13289H0((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.mo13282A0(bArr, 0, bArr.length);
                    break;
                } else {
                    codedOutputStream.mo13283B0((ByteString) obj);
                    break;
                }
            case 12:
                codedOutputStream.mo13294M0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.mo13286E0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.mo13286E0(((Internal.EnumLite) obj).mo11028x());
                    break;
                }
            case 14:
                codedOutputStream.mo13284C0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.mo13285D0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.mo13294M0(CodedOutputStream.m13279u0(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.mo13295N0(CodedOutputStream.m13280v0(((Long) obj).longValue()));
                break;
        }
    }

    /* renamed from: a */
    public void m13389a(T t, Object obj) {
        List list;
        if (!((GeneratedMessageLite.ExtensionDescriptor) t).f24191e) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m13399p(t, obj);
        Object m13391g = m13391g(t);
        if (m13391g == null) {
            list = new ArrayList();
            this.f24155a.put(t, list);
        } else {
            list = (List) m13391g;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> clone() {
        FieldSet<T> fieldSet = new FieldSet<>();
        for (int i2 = 0; i2 < this.f24155a.m13626d(); i2++) {
            Map.Entry<T, Object> m13625c = this.f24155a.m13625c(i2);
            fieldSet.m13398o(m13625c.getKey(), m13625c.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f24155a.m13627f()) {
            fieldSet.m13398o(entry.getKey(), entry.getValue());
        }
        fieldSet.f24157c = this.f24157c;
        return fieldSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f24155a.equals(((FieldSet) obj).f24155a);
        }
        return false;
    }

    /* renamed from: g */
    public Object m13391g(T t) {
        Object obj = this.f24155a.get(t);
        return obj instanceof LazyField ? ((LazyField) obj).m13466c() : obj;
    }

    /* renamed from: h */
    public final int m13392h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo13400A() != WireFormat.JavaType.MESSAGE || key.mo13404y() || key.mo13401C()) {
            return m13386f(key, value);
        }
        if (value instanceof LazyField) {
            int mo13403x = entry.getKey().mo13403x();
            return CodedOutputStream.m13264f0((LazyField) value) + CodedOutputStream.m13274p0(3) + CodedOutputStream.m13275q0(2, mo13403x) + (CodedOutputStream.m13274p0(1) * 2);
        }
        int mo13403x2 = entry.getKey().mo13403x();
        return CodedOutputStream.m13265g0(((MessageLite) value).mo13430c()) + CodedOutputStream.m13274p0(3) + CodedOutputStream.m13275q0(2, mo13403x2) + (CodedOutputStream.m13274p0(1) * 2);
    }

    public int hashCode() {
        return this.f24155a.hashCode();
    }

    /* renamed from: i */
    public boolean m13393i() {
        return this.f24155a.isEmpty();
    }

    /* renamed from: j */
    public boolean m13394j() {
        for (int i2 = 0; i2 < this.f24155a.m13626d(); i2++) {
            if (!m13387k(this.f24155a.m13625c(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f24155a.m13627f().iterator();
        while (it.hasNext()) {
            if (!m13387k(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public Iterator<Map.Entry<T, Object>> m13395l() {
        return this.f24157c ? new LazyField.LazyIterator(this.f24155a.entrySet().iterator()) : this.f24155a.entrySet().iterator();
    }

    /* renamed from: m */
    public void m13396m() {
        if (this.f24156b) {
            return;
        }
        this.f24155a.mo13629h();
        this.f24156b = true;
    }

    /* renamed from: n */
    public final void m13397n(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).m13466c();
        }
        if (key.mo13404y()) {
            Object m13391g = m13391g(key);
            if (m13391g == null) {
                m13391g = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m13391g).add(m13383c(it.next()));
            }
            this.f24155a.put(key, m13391g);
            return;
        }
        if (key.mo13400A() != WireFormat.JavaType.MESSAGE) {
            this.f24155a.put(key, m13383c(value));
            return;
        }
        Object m13391g2 = m13391g(key);
        if (m13391g2 == null) {
            this.f24155a.put(key, m13383c(value));
        } else {
            this.f24155a.put(key, key.mo13402D(((MessageLite) m13391g2).mo13429b(), (MessageLite) value).mo13437A());
        }
    }

    /* renamed from: o */
    public void m13398o(T t, Object obj) {
        if (!t.mo13404y()) {
            m13399p(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m13399p(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f24157c = true;
        }
        this.f24155a.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if ((r7 instanceof com.google.protobuf.Internal.EnumLite) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r7 instanceof com.google.protobuf.LazyField) == false) goto L26;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13399p(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            com.google.protobuf.WireFormat$FieldType r0 = r6.mo13405z()
            java.nio.charset.Charset r1 = com.google.protobuf.Internal.f24210a
            java.util.Objects.requireNonNull(r7)
            com.google.protobuf.WireFormat$JavaType r0 = r0.f24420b
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L40;
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L15;
                default: goto L14;
            }
        L14:
            goto L43
        L15:
            boolean r0 = r7 instanceof com.google.protobuf.MessageLite
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof com.google.protobuf.LazyField
            if (r0 == 0) goto L43
            goto L2f
        L1e:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof com.google.protobuf.Internal.EnumLite
            if (r0 == 0) goto L43
            goto L2f
        L27:
            boolean r0 = r7 instanceof com.google.protobuf.ByteString
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L43
        L2f:
            r0 = 1
            goto L44
        L31:
            boolean r0 = r7 instanceof java.lang.String
            goto L44
        L34:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L44
        L37:
            boolean r0 = r7 instanceof java.lang.Double
            goto L44
        L3a:
            boolean r0 = r7 instanceof java.lang.Float
            goto L44
        L3d:
            boolean r0 = r7 instanceof java.lang.Long
            goto L44
        L40:
            boolean r0 = r7 instanceof java.lang.Integer
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.mo13403x()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.google.protobuf.WireFormat$FieldType r6 = r6.mo13405z()
            com.google.protobuf.WireFormat$JavaType r6 = r6.f24420b
            r3[r2] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldSet.m13399p(com.google.protobuf.FieldSet$FieldDescriptorLite, java.lang.Object):void");
    }

    public FieldSet(boolean z) {
        int i2 = SmallSortedMap.f24341i;
        this.f24155a = new SmallSortedMap.C23931(0);
        m13396m();
        m13396m();
    }
}
