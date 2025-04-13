package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
final class CodedInputStreamReader implements Reader {

    /* renamed from: a */
    public final CodedInputStream f24033a;

    /* renamed from: b */
    public int f24034b;

    /* renamed from: c */
    public int f24035c;

    /* renamed from: d */
    public int f24036d = 0;

    /* renamed from: com.google.protobuf.CodedInputStreamReader$1 */
    public static /* synthetic */ class C23521 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24037a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24037a = iArr;
            try {
                iArr[WireFormat.FieldType.f24408k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24037a[WireFormat.FieldType.f24412o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24037a[WireFormat.FieldType.f24401d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24037a[WireFormat.FieldType.f24414q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24037a[WireFormat.FieldType.f24407j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24037a[WireFormat.FieldType.f24406i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24037a[WireFormat.FieldType.f24402e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24037a[WireFormat.FieldType.f24405h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24037a[WireFormat.FieldType.f24403f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24037a[WireFormat.FieldType.f24411n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24037a[WireFormat.FieldType.f24415r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24037a[WireFormat.FieldType.f24416s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24037a[WireFormat.FieldType.f24417t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24037a[WireFormat.FieldType.f24418u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24037a[WireFormat.FieldType.f24409l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24037a[WireFormat.FieldType.f24413p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24037a[WireFormat.FieldType.f24404g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Charset charset = Internal.f24210a;
        this.f24033a = codedInputStream;
        codedInputStream.f23996d = this;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: A */
    public <T> T mo13018A(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m13249V(3);
        return (T) m13245R(Protobuf.f24310c.m13567a(cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: B */
    public int mo13019B() throws IOException {
        int i2 = this.f24036d;
        if (i2 != 0) {
            this.f24034b = i2;
            this.f24036d = 0;
        } else {
            this.f24034b = this.f24033a.mo13199z();
        }
        int i3 = this.f24034b;
        if (i3 == 0 || i3 == this.f24035c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: C */
    public void mo13020C(List<String> list) throws IOException {
        m13247T(list, false);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: D */
    public <T> T mo13021D(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m13249V(2);
        return (T) m13246S(schema, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Reader
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void mo13022E(java.util.Map<K, V> r8, com.google.protobuf.MapEntryLite.Metadata<K, V> r9, com.google.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m13249V(r0)
            com.google.protobuf.CodedInputStream r1 = r7.f24033a
            int r1 = r1.mo13176A()
            com.google.protobuf.CodedInputStream r2 = r7.f24033a
            int r1 = r2.mo13183j(r1)
            K r2 = r9.f24266b
            V r3 = r9.f24268d
        L14:
            int r4 = r7.mo13019B()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.CodedInputStream r5 = r7.f24033a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.mo13181e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.mo13027J()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f24267c     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f24268d     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.m13244Q(r4, r5, r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f24265a     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.m13244Q(r4, r5, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.mo13027J()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.CodedInputStream r8 = r7.f24033a
            r8.mo13182i(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.CodedInputStream r9 = r7.f24033a
            r9.mo13182i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStreamReader.mo13022E(java.util.Map, com.google.protobuf.MapEntryLite$Metadata, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: F */
    public void mo13023F(List<String> list) throws IOException {
        m13247T(list, true);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: G */
    public ByteString mo13024G() throws IOException {
        m13249V(2);
        return this.f24033a.mo13185l();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: H */
    public void mo13025H(List<Float> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof FloatArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 2) {
                int mo13176A = this.f24033a.mo13176A();
                m13250W(mo13176A);
                int mo13180d = this.f24033a.mo13180d() + mo13176A;
                do {
                    list.add(Float.valueOf(this.f24033a.mo13190q()));
                } while (this.f24033a.mo13180d() < mo13180d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                list.add(Float.valueOf(this.f24033a.mo13190q()));
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z = this.f24033a.mo13199z();
                }
            } while (mo13199z == this.f24034b);
            this.f24036d = mo13199z;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 2) {
            int mo13176A2 = this.f24033a.mo13176A();
            m13250W(mo13176A2);
            int mo13180d2 = this.f24033a.mo13180d() + mo13176A2;
            do {
                floatArrayList.m13406d(this.f24033a.mo13190q());
            } while (this.f24033a.mo13180d() < mo13180d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m13459d();
        }
        do {
            floatArrayList.m13406d(this.f24033a.mo13190q());
            if (this.f24033a.mo13181e()) {
                return;
            } else {
                mo13199z2 = this.f24033a.mo13199z();
            }
        } while (mo13199z2 == this.f24034b);
        this.f24036d = mo13199z2;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: I */
    public int mo13026I() throws IOException {
        m13249V(0);
        return this.f24033a.mo13191r();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: J */
    public boolean mo13027J() throws IOException {
        int i2;
        if (this.f24033a.mo13181e() || (i2 = this.f24034b) == this.f24035c) {
            return false;
        }
        return this.f24033a.mo13178C(i2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: K */
    public int mo13028K() throws IOException {
        m13249V(5);
        return this.f24033a.mo13193t();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: L */
    public void mo13029L(List<ByteString> list) throws IOException {
        int mo13199z;
        if ((this.f24034b & 7) != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        do {
            list.add(mo13024G());
            if (this.f24033a.mo13181e()) {
                return;
            } else {
                mo13199z = this.f24033a.mo13199z();
            }
        } while (mo13199z == this.f24034b);
        this.f24036d = mo13199z;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: M */
    public void mo13030M(List<Double> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof DoubleArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f24033a.mo13186m()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13176A = this.f24033a.mo13176A();
            m13251X(mo13176A);
            int mo13180d = this.f24033a.mo13180d() + mo13176A;
            do {
                list.add(Double.valueOf(this.f24033a.mo13186m()));
            } while (this.f24033a.mo13180d() < mo13180d);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 1) {
            do {
                doubleArrayList.m13359d(this.f24033a.mo13186m());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13176A2 = this.f24033a.mo13176A();
        m13251X(mo13176A2);
        int mo13180d2 = this.f24033a.mo13180d() + mo13176A2;
        do {
            doubleArrayList.m13359d(this.f24033a.mo13186m());
        } while (this.f24033a.mo13180d() < mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: N */
    public long mo13031N() throws IOException {
        m13249V(0);
        return this.f24033a.mo13192s();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: O */
    public String mo13032O() throws IOException {
        m13249V(2);
        return this.f24033a.mo13198y();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: P */
    public void mo13033P(List<Long> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof LongArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f24033a.mo13189p()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13176A = this.f24033a.mo13176A();
            m13251X(mo13176A);
            int mo13180d = this.f24033a.mo13180d() + mo13176A;
            do {
                list.add(Long.valueOf(this.f24033a.mo13189p()));
            } while (this.f24033a.mo13180d() < mo13180d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 1) {
            do {
                longArrayList.m13483d(this.f24033a.mo13189p());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13176A2 = this.f24033a.mo13176A();
        m13251X(mo13176A2);
        int mo13180d2 = this.f24033a.mo13180d() + mo13176A2;
        do {
            longArrayList.m13483d(this.f24033a.mo13189p());
        } while (this.f24033a.mo13180d() < mo13180d2);
    }

    /* renamed from: Q */
    public final Object m13244Q(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(mo13031N());
            case 3:
                return Long.valueOf(mo13046b());
            case 4:
                return Integer.valueOf(mo13026I());
            case 5:
                return Long.valueOf(mo13048c());
            case 6:
                return Integer.valueOf(mo13062j());
            case 7:
                return Boolean.valueOf(mo13064k());
            case 8:
                return mo13032O();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return mo13060i(cls, extensionRegistryLite);
            case 11:
                return mo13024G();
            case 12:
                return Integer.valueOf(mo13069p());
            case 13:
                return Integer.valueOf(mo13074u());
            case 14:
                return Integer.valueOf(mo13028K());
            case 15:
                return Long.valueOf(mo13066m());
            case 16:
                return Integer.valueOf(mo13076w());
            case 17:
                return Long.valueOf(mo13077x());
        }
    }

    /* renamed from: R */
    public final <T> T m13245R(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i2 = this.f24035c;
        this.f24035c = ((this.f24034b >>> 3) << 3) | 4;
        try {
            T mo13545i = schema.mo13545i();
            schema.mo13541e(mo13545i, this, extensionRegistryLite);
            schema.mo13539c(mo13545i);
            if (this.f24034b == this.f24035c) {
                return mo13545i;
            }
            throw InvalidProtocolBufferException.m13462g();
        } finally {
            this.f24035c = i2;
        }
    }

    /* renamed from: S */
    public final <T> T m13246S(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int mo13176A = this.f24033a.mo13176A();
        CodedInputStream codedInputStream = this.f24033a;
        if (codedInputStream.f23993a >= codedInputStream.f23994b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int mo13183j = codedInputStream.mo13183j(mo13176A);
        T mo13545i = schema.mo13545i();
        this.f24033a.f23993a++;
        schema.mo13541e(mo13545i, this, extensionRegistryLite);
        schema.mo13539c(mo13545i);
        this.f24033a.mo13179a(0);
        r5.f23993a--;
        this.f24033a.mo13182i(mo13183j);
        return mo13545i;
    }

    /* renamed from: T */
    public void m13247T(List<String> list, boolean z) throws IOException {
        int mo13199z;
        int mo13199z2;
        if ((this.f24034b & 7) != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        if (!(list instanceof LazyStringList) || z) {
            do {
                list.add(z ? mo13032O() : mo13079z());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z = this.f24033a.mo13199z();
                }
            } while (mo13199z == this.f24034b);
            this.f24036d = mo13199z;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.mo13472Q(mo13024G());
            if (this.f24033a.mo13181e()) {
                return;
            } else {
                mo13199z2 = this.f24033a.mo13199z();
            }
        } while (mo13199z2 == this.f24034b);
        this.f24036d = mo13199z2;
    }

    /* renamed from: U */
    public final void m13248U(int i2) throws IOException {
        if (this.f24033a.mo13180d() != i2) {
            throw InvalidProtocolBufferException.m13463h();
        }
    }

    /* renamed from: V */
    public final void m13249V(int i2) throws IOException {
        if ((this.f24034b & 7) != i2) {
            throw InvalidProtocolBufferException.m13459d();
        }
    }

    /* renamed from: W */
    public final void m13250W(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.m13462g();
        }
    }

    /* renamed from: X */
    public final void m13251X(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.m13462g();
        }
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: a */
    public void mo13044a(List<Integer> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof IntArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24033a.mo13195v()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Integer.valueOf(this.f24033a.mo13195v()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                intArrayList.m13449d(this.f24033a.mo13195v());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            intArrayList.m13449d(this.f24033a.mo13195v());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: b */
    public long mo13046b() throws IOException {
        m13249V(0);
        return this.f24033a.mo13177B();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: c */
    public long mo13048c() throws IOException {
        m13249V(1);
        return this.f24033a.mo13189p();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: d */
    public void mo13050d(List<Integer> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof IntArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 2) {
                int mo13176A = this.f24033a.mo13176A();
                m13250W(mo13176A);
                int mo13180d = this.f24033a.mo13180d() + mo13176A;
                do {
                    list.add(Integer.valueOf(this.f24033a.mo13193t()));
                } while (this.f24033a.mo13180d() < mo13180d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                list.add(Integer.valueOf(this.f24033a.mo13193t()));
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z = this.f24033a.mo13199z();
                }
            } while (mo13199z == this.f24034b);
            this.f24036d = mo13199z;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 2) {
            int mo13176A2 = this.f24033a.mo13176A();
            m13250W(mo13176A2);
            int mo13180d2 = this.f24033a.mo13180d() + mo13176A2;
            do {
                intArrayList.m13449d(this.f24033a.mo13193t());
            } while (this.f24033a.mo13180d() < mo13180d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m13459d();
        }
        do {
            intArrayList.m13449d(this.f24033a.mo13193t());
            if (this.f24033a.mo13181e()) {
                return;
            } else {
                mo13199z2 = this.f24033a.mo13199z();
            }
        } while (mo13199z2 == this.f24034b);
        this.f24036d = mo13199z2;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: e */
    public int mo13052e() {
        return this.f24034b;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: f */
    public void mo13054f(List<Long> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof LongArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f24033a.mo13196w()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Long.valueOf(this.f24033a.mo13196w()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                longArrayList.m13483d(this.f24033a.mo13196w());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            longArrayList.m13483d(this.f24033a.mo13196w());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Reader
    /* renamed from: g */
    public <T> void mo13056g(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int mo13199z;
        int i2 = this.f24034b;
        if ((i2 & 7) != 3) {
            throw InvalidProtocolBufferException.m13459d();
        }
        do {
            list.add(m13245R(schema, extensionRegistryLite));
            if (this.f24033a.mo13181e() || this.f24036d != 0) {
                return;
            } else {
                mo13199z = this.f24033a.mo13199z();
            }
        } while (mo13199z == i2);
        this.f24036d = mo13199z;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: h */
    public void mo13058h(List<Integer> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof IntArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24033a.mo13176A()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Integer.valueOf(this.f24033a.mo13176A()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                intArrayList.m13449d(this.f24033a.mo13176A());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            intArrayList.m13449d(this.f24033a.mo13176A());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: i */
    public <T> T mo13060i(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m13249V(2);
        return (T) m13246S(Protobuf.f24310c.m13567a(cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: j */
    public int mo13062j() throws IOException {
        m13249V(5);
        return this.f24033a.mo13188o();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: k */
    public boolean mo13064k() throws IOException {
        m13249V(0);
        return this.f24033a.mo13184k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Reader
    /* renamed from: l */
    public <T> void mo13065l(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int mo13199z;
        int i2 = this.f24034b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        do {
            list.add(m13246S(schema, extensionRegistryLite));
            if (this.f24033a.mo13181e() || this.f24036d != 0) {
                return;
            } else {
                mo13199z = this.f24033a.mo13199z();
            }
        } while (mo13199z == i2);
        this.f24036d = mo13199z;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: m */
    public long mo13066m() throws IOException {
        m13249V(1);
        return this.f24033a.mo13194u();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: n */
    public void mo13067n(List<Long> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof LongArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f24033a.mo13177B()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Long.valueOf(this.f24033a.mo13177B()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                longArrayList.m13483d(this.f24033a.mo13177B());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            longArrayList.m13483d(this.f24033a.mo13177B());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: o */
    public <T> T mo13068o(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m13249V(3);
        return (T) m13245R(schema, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: p */
    public int mo13069p() throws IOException {
        m13249V(0);
        return this.f24033a.mo13176A();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: q */
    public void mo13070q(List<Long> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof LongArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f24033a.mo13192s()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Long.valueOf(this.f24033a.mo13192s()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                longArrayList.m13483d(this.f24033a.mo13192s());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            longArrayList.m13483d(this.f24033a.mo13192s());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: r */
    public void mo13071r(List<Long> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof LongArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f24033a.mo13194u()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13176A = this.f24033a.mo13176A();
            m13251X(mo13176A);
            int mo13180d = this.f24033a.mo13180d() + mo13176A;
            do {
                list.add(Long.valueOf(this.f24033a.mo13194u()));
            } while (this.f24033a.mo13180d() < mo13180d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 1) {
            do {
                longArrayList.m13483d(this.f24033a.mo13194u());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13176A2 = this.f24033a.mo13176A();
        m13251X(mo13176A2);
        int mo13180d2 = this.f24033a.mo13180d() + mo13176A2;
        do {
            longArrayList.m13483d(this.f24033a.mo13194u());
        } while (this.f24033a.mo13180d() < mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    public double readDouble() throws IOException {
        m13249V(1);
        return this.f24033a.mo13186m();
    }

    @Override // com.google.protobuf.Reader
    public float readFloat() throws IOException {
        m13249V(5);
        return this.f24033a.mo13190q();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: s */
    public void mo13072s(List<Integer> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof IntArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24033a.mo13191r()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Integer.valueOf(this.f24033a.mo13191r()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                intArrayList.m13449d(this.f24033a.mo13191r());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            intArrayList.m13449d(this.f24033a.mo13191r());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: t */
    public void mo13073t(List<Integer> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof IntArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24033a.mo13187n()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Integer.valueOf(this.f24033a.mo13187n()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                intArrayList.m13449d(this.f24033a.mo13187n());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            intArrayList.m13449d(this.f24033a.mo13187n());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: u */
    public int mo13074u() throws IOException {
        m13249V(0);
        return this.f24033a.mo13187n();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: v */
    public void mo13075v(List<Integer> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof IntArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 2) {
                int mo13176A = this.f24033a.mo13176A();
                m13250W(mo13176A);
                int mo13180d = this.f24033a.mo13180d() + mo13176A;
                do {
                    list.add(Integer.valueOf(this.f24033a.mo13188o()));
                } while (this.f24033a.mo13180d() < mo13180d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                list.add(Integer.valueOf(this.f24033a.mo13188o()));
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z = this.f24033a.mo13199z();
                }
            } while (mo13199z == this.f24034b);
            this.f24036d = mo13199z;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 2) {
            int mo13176A2 = this.f24033a.mo13176A();
            m13250W(mo13176A2);
            int mo13180d2 = this.f24033a.mo13180d() + mo13176A2;
            do {
                intArrayList.m13449d(this.f24033a.mo13188o());
            } while (this.f24033a.mo13180d() < mo13180d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m13459d();
        }
        do {
            intArrayList.m13449d(this.f24033a.mo13188o());
            if (this.f24033a.mo13181e()) {
                return;
            } else {
                mo13199z2 = this.f24033a.mo13199z();
            }
        } while (mo13199z2 == this.f24034b);
        this.f24036d = mo13199z2;
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: w */
    public int mo13076w() throws IOException {
        m13249V(0);
        return this.f24033a.mo13195v();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: x */
    public long mo13077x() throws IOException {
        m13249V(0);
        return this.f24033a.mo13196w();
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: y */
    public void mo13078y(List<Boolean> list) throws IOException {
        int mo13199z;
        int mo13199z2;
        if (!(list instanceof BooleanArrayList)) {
            int i2 = this.f24034b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f24033a.mo13184k()));
                    if (this.f24033a.mo13181e()) {
                        return;
                    } else {
                        mo13199z = this.f24033a.mo13199z();
                    }
                } while (mo13199z == this.f24034b);
                this.f24036d = mo13199z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int mo13180d = this.f24033a.mo13180d() + this.f24033a.mo13176A();
            do {
                list.add(Boolean.valueOf(this.f24033a.mo13184k()));
            } while (this.f24033a.mo13180d() < mo13180d);
            m13248U(mo13180d);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i3 = this.f24034b & 7;
        if (i3 == 0) {
            do {
                booleanArrayList.m13145d(this.f24033a.mo13184k());
                if (this.f24033a.mo13181e()) {
                    return;
                } else {
                    mo13199z2 = this.f24033a.mo13199z();
                }
            } while (mo13199z2 == this.f24034b);
            this.f24036d = mo13199z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m13459d();
        }
        int mo13180d2 = this.f24033a.mo13180d() + this.f24033a.mo13176A();
        do {
            booleanArrayList.m13145d(this.f24033a.mo13184k());
        } while (this.f24033a.mo13180d() < mo13180d2);
        m13248U(mo13180d2);
    }

    @Override // com.google.protobuf.Reader
    /* renamed from: z */
    public String mo13079z() throws IOException {
        m13249V(2);
        return this.f24033a.mo13197x();
    }
}
