package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes3.dex */
public final class JvmModuleProtoBuf {

    public interface ModuleOrBuilder extends MessageLiteOrBuilder {
    }

    public interface PackagePartsOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Module extends GeneratedMessageLite implements ModuleOrBuilder {

        /* renamed from: l */
        public static final Module f65440l;

        /* renamed from: m */
        public static Parser<Module> f65441m = new C66841();

        /* renamed from: b */
        public final ByteString f65442b;

        /* renamed from: c */
        public int f65443c;

        /* renamed from: d */
        public List<PackageParts> f65444d;

        /* renamed from: e */
        public List<PackageParts> f65445e;

        /* renamed from: f */
        public LazyStringList f65446f;

        /* renamed from: g */
        public ProtoBuf.StringTable f65447g;

        /* renamed from: h */
        public ProtoBuf.QualifiedNameTable f65448h;

        /* renamed from: i */
        public List<ProtoBuf.Annotation> f65449i;

        /* renamed from: j */
        public byte f65450j;

        /* renamed from: k */
        public int f65451k;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module$1 */
        public static class C66841 extends AbstractParser<Module> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Module(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Module, Builder> implements ModuleOrBuilder {

            /* renamed from: c */
            public int f65452c;

            /* renamed from: d */
            public List<PackageParts> f65453d = Collections.emptyList();

            /* renamed from: e */
            public List<PackageParts> f65454e = Collections.emptyList();

            /* renamed from: f */
            public LazyStringList f65455f = LazyStringArrayList.f65679c;

            /* renamed from: g */
            public ProtoBuf.StringTable f65456g = ProtoBuf.StringTable.f65183f;

            /* renamed from: h */
            public ProtoBuf.QualifiedNameTable f65457h = ProtoBuf.QualifiedNameTable.f65157f;

            /* renamed from: i */
            public List<ProtoBuf.Annotation> f65458i = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Module m33133k = m33133k();
                if (m33133k.mo32959e()) {
                    return m33133k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33136n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33136n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(Module module) {
                m33135m(module);
                return this;
            }

            /* renamed from: k */
            public Module m33133k() {
                Module module = new Module(this, null);
                int i2 = this.f65452c;
                if ((i2 & 1) == 1) {
                    this.f65453d = Collections.unmodifiableList(this.f65453d);
                    this.f65452c &= -2;
                }
                module.f65444d = this.f65453d;
                if ((this.f65452c & 2) == 2) {
                    this.f65454e = Collections.unmodifiableList(this.f65454e);
                    this.f65452c &= -3;
                }
                module.f65445e = this.f65454e;
                if ((this.f65452c & 4) == 4) {
                    this.f65455f = this.f65455f.mo33336n();
                    this.f65452c &= -5;
                }
                module.f65446f = this.f65455f;
                int i3 = (i2 & 8) != 8 ? 0 : 1;
                module.f65447g = this.f65456g;
                if ((i2 & 16) == 16) {
                    i3 |= 2;
                }
                module.f65448h = this.f65457h;
                if ((this.f65452c & 32) == 32) {
                    this.f65458i = Collections.unmodifiableList(this.f65458i);
                    this.f65452c &= -33;
                }
                module.f65449i = this.f65458i;
                module.f65443c = i3;
                return module;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33135m(m33133k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33135m(Module module) {
                ProtoBuf.QualifiedNameTable qualifiedNameTable;
                ProtoBuf.StringTable stringTable;
                if (module == Module.f65440l) {
                    return this;
                }
                if (!module.f65444d.isEmpty()) {
                    if (this.f65453d.isEmpty()) {
                        this.f65453d = module.f65444d;
                        this.f65452c &= -2;
                    } else {
                        if ((this.f65452c & 1) != 1) {
                            this.f65453d = new ArrayList(this.f65453d);
                            this.f65452c |= 1;
                        }
                        this.f65453d.addAll(module.f65444d);
                    }
                }
                if (!module.f65445e.isEmpty()) {
                    if (this.f65454e.isEmpty()) {
                        this.f65454e = module.f65445e;
                        this.f65452c &= -3;
                    } else {
                        if ((this.f65452c & 2) != 2) {
                            this.f65454e = new ArrayList(this.f65454e);
                            this.f65452c |= 2;
                        }
                        this.f65454e.addAll(module.f65445e);
                    }
                }
                if (!module.f65446f.isEmpty()) {
                    if (this.f65455f.isEmpty()) {
                        this.f65455f = module.f65446f;
                        this.f65452c &= -5;
                    } else {
                        if ((this.f65452c & 4) != 4) {
                            this.f65455f = new LazyStringArrayList(this.f65455f);
                            this.f65452c |= 4;
                        }
                        this.f65455f.addAll(module.f65446f);
                    }
                }
                if ((module.f65443c & 1) == 1) {
                    ProtoBuf.StringTable stringTable2 = module.f65447g;
                    if ((this.f65452c & 8) != 8 || (stringTable = this.f65456g) == ProtoBuf.StringTable.f65183f) {
                        this.f65456g = stringTable2;
                    } else {
                        ProtoBuf.StringTable.Builder m33050i = ProtoBuf.StringTable.m33050i(stringTable);
                        m33050i.m33053m(stringTable2);
                        this.f65456g = m33050i.m33051k();
                    }
                    this.f65452c |= 8;
                }
                if ((module.f65443c & 2) == 2) {
                    ProtoBuf.QualifiedNameTable qualifiedNameTable2 = module.f65448h;
                    if ((this.f65452c & 16) != 16 || (qualifiedNameTable = this.f65457h) == ProtoBuf.QualifiedNameTable.f65157f) {
                        this.f65457h = qualifiedNameTable2;
                    } else {
                        ProtoBuf.QualifiedNameTable.Builder m33040i = ProtoBuf.QualifiedNameTable.m33040i(qualifiedNameTable);
                        m33040i.m33043m(qualifiedNameTable2);
                        this.f65457h = m33040i.m33041k();
                    }
                    this.f65452c |= 16;
                }
                if (!module.f65449i.isEmpty()) {
                    if (this.f65458i.isEmpty()) {
                        this.f65458i = module.f65449i;
                        this.f65452c &= -33;
                    } else {
                        if ((this.f65452c & 32) != 32) {
                            this.f65458i = new ArrayList(this.f65458i);
                            this.f65452c |= 32;
                        }
                        this.f65458i.addAll(module.f65449i);
                    }
                }
                this.f65656b = this.f65656b.m33231b(module.f65442b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module.Builder m33136n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module.f65441m     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module.C66841) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33135m(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L15
                L13:
                    r3 = move-exception
                    goto L1c
                L15:
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.f65674b     // Catch: java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33135m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module.Builder.m33136n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module$Builder");
            }
        }

        static {
            Module module = new Module();
            f65440l = module;
            module.m33132i();
        }

        public Module(GeneratedMessageLite.Builder builder, C66831 c66831) {
            super(builder);
            this.f65450j = (byte) -1;
            this.f65451k = -1;
            this.f65442b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33135m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65451k;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65444d.size(); i4++) {
                i3 += CodedOutputStream.m33265e(1, this.f65444d.get(i4));
            }
            for (int i5 = 0; i5 < this.f65445e.size(); i5++) {
                i3 += CodedOutputStream.m33265e(2, this.f65445e.get(i5));
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f65446f.size(); i7++) {
                i6 += CodedOutputStream.m33261a(this.f65446f.mo33333O0(i7));
            }
            int size = (this.f65446f.size() * 1) + i3 + i6;
            if ((this.f65443c & 1) == 1) {
                size += CodedOutputStream.m33265e(4, this.f65447g);
            }
            if ((this.f65443c & 2) == 2) {
                size += CodedOutputStream.m33265e(5, this.f65448h);
            }
            for (int i8 = 0; i8 < this.f65449i.size(); i8++) {
                size += CodedOutputStream.m33265e(6, this.f65449i.get(i8));
            }
            int size2 = this.f65442b.size() + size;
            this.f65451k = size2;
            return size2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d */
        public MessageLite.Builder mo32958d() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e */
        public final boolean mo32959e() {
            byte b = this.f65450j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f65444d.size(); i2++) {
                if (!this.f65444d.get(i2).mo32959e()) {
                    this.f65450j = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f65445e.size(); i3++) {
                if (!this.f65445e.get(i3).mo32959e()) {
                    this.f65450j = (byte) 0;
                    return false;
                }
            }
            if (((this.f65443c & 2) == 2) && !this.f65448h.mo32959e()) {
                this.f65450j = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f65449i.size(); i4++) {
                if (!this.f65449i.get(i4).mo32959e()) {
                    this.f65450j = (byte) 0;
                    return false;
                }
            }
            this.f65450j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f65444d.size(); i2++) {
                codedOutputStream.m33281s(1, this.f65444d.get(i2));
            }
            for (int i3 = 0; i3 < this.f65445e.size(); i3++) {
                codedOutputStream.m33281s(2, this.f65445e.get(i3));
            }
            for (int i4 = 0; i4 < this.f65446f.size(); i4++) {
                codedOutputStream.m33275m(3, this.f65446f.mo33333O0(i4));
            }
            if ((this.f65443c & 1) == 1) {
                codedOutputStream.m33281s(4, this.f65447g);
            }
            if ((this.f65443c & 2) == 2) {
                codedOutputStream.m33281s(5, this.f65448h);
            }
            for (int i5 = 0; i5 < this.f65449i.size(); i5++) {
                codedOutputStream.m33281s(6, this.f65449i.get(i5));
            }
            codedOutputStream.m33284v(this.f65442b);
        }

        /* renamed from: i */
        public final void m33132i() {
            this.f65444d = Collections.emptyList();
            this.f65445e = Collections.emptyList();
            this.f65446f = LazyStringArrayList.f65679c;
            this.f65447g = ProtoBuf.StringTable.f65183f;
            this.f65448h = ProtoBuf.QualifiedNameTable.f65157f;
            this.f65449i = Collections.emptyList();
        }

        public Module() {
            this.f65450j = (byte) -1;
            this.f65451k = -1;
            this.f65442b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Module(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66831 c66831) throws InvalidProtocolBufferException {
            this.f65450j = (byte) -1;
            this.f65451k = -1;
            m33132i();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 10) {
                                if ((i2 & 1) != 1) {
                                    this.f65444d = new ArrayList();
                                    i2 |= 1;
                                }
                                this.f65444d.add(codedInputStream.m33248h(PackageParts.f65460o, extensionRegistryLite));
                            } else if (m33255o == 18) {
                                if ((i2 & 2) != 2) {
                                    this.f65445e = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f65445e.add(codedInputStream.m33248h(PackageParts.f65460o, extensionRegistryLite));
                            } else if (m33255o != 26) {
                                ProtoBuf.QualifiedNameTable.Builder builder = null;
                                ProtoBuf.StringTable.Builder builder2 = null;
                                if (m33255o == 34) {
                                    if ((this.f65443c & 1) == 1) {
                                        ProtoBuf.StringTable stringTable = this.f65447g;
                                        Objects.requireNonNull(stringTable);
                                        builder2 = ProtoBuf.StringTable.m33050i(stringTable);
                                    }
                                    ProtoBuf.StringTable stringTable2 = (ProtoBuf.StringTable) codedInputStream.m33248h(ProtoBuf.StringTable.f65184g, extensionRegistryLite);
                                    this.f65447g = stringTable2;
                                    if (builder2 != null) {
                                        builder2.m33053m(stringTable2);
                                        this.f65447g = builder2.m33051k();
                                    }
                                    this.f65443c |= 1;
                                } else if (m33255o == 42) {
                                    if ((this.f65443c & 2) == 2) {
                                        ProtoBuf.QualifiedNameTable qualifiedNameTable = this.f65448h;
                                        Objects.requireNonNull(qualifiedNameTable);
                                        builder = ProtoBuf.QualifiedNameTable.m33040i(qualifiedNameTable);
                                    }
                                    ProtoBuf.QualifiedNameTable qualifiedNameTable2 = (ProtoBuf.QualifiedNameTable) codedInputStream.m33248h(ProtoBuf.QualifiedNameTable.f65158g, extensionRegistryLite);
                                    this.f65448h = qualifiedNameTable2;
                                    if (builder != null) {
                                        builder.m33043m(qualifiedNameTable2);
                                        this.f65448h = builder.m33041k();
                                    }
                                    this.f65443c |= 2;
                                } else if (m33255o != 50) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    if ((i2 & 32) != 32) {
                                        this.f65449i = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.f65449i.add(codedInputStream.m33248h(ProtoBuf.Annotation.f64854i, extensionRegistryLite));
                                }
                            } else {
                                ByteString m33246f = codedInputStream.m33246f();
                                if ((i2 & 4) != 4) {
                                    this.f65446f = new LazyStringArrayList();
                                    i2 |= 4;
                                }
                                this.f65446f.mo33334e1(m33246f);
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i2 & 1) == 1) {
                            this.f65444d = Collections.unmodifiableList(this.f65444d);
                        }
                        if ((i2 & 2) == 2) {
                            this.f65445e = Collections.unmodifiableList(this.f65445e);
                        }
                        if ((i2 & 4) == 4) {
                            this.f65446f = this.f65446f.mo33336n();
                        }
                        if ((i2 & 32) == 32) {
                            this.f65449i = Collections.unmodifiableList(this.f65449i);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65442b = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65442b = m33226x.m33240c();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.f65674b = this;
                    throw e2;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                    invalidProtocolBufferException.f65674b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if ((i2 & 1) == 1) {
                this.f65444d = Collections.unmodifiableList(this.f65444d);
            }
            if ((i2 & 2) == 2) {
                this.f65445e = Collections.unmodifiableList(this.f65445e);
            }
            if ((i2 & 4) == 4) {
                this.f65446f = this.f65446f.mo33336n();
            }
            if ((i2 & 32) == 32) {
                this.f65449i = Collections.unmodifiableList(this.f65449i);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65442b = m33226x.m33240c();
                throw th3;
            }
            this.f65442b = m33226x.m33240c();
        }
    }

    public static final class PackageParts extends GeneratedMessageLite implements PackagePartsOrBuilder {

        /* renamed from: n */
        public static final PackageParts f65459n;

        /* renamed from: o */
        public static Parser<PackageParts> f65460o = new C66851();

        /* renamed from: b */
        public final ByteString f65461b;

        /* renamed from: c */
        public int f65462c;

        /* renamed from: d */
        public Object f65463d;

        /* renamed from: e */
        public LazyStringList f65464e;

        /* renamed from: f */
        public List<Integer> f65465f;

        /* renamed from: g */
        public int f65466g;

        /* renamed from: h */
        public LazyStringList f65467h;

        /* renamed from: i */
        public LazyStringList f65468i;

        /* renamed from: j */
        public List<Integer> f65469j;

        /* renamed from: k */
        public int f65470k;

        /* renamed from: l */
        public byte f65471l;

        /* renamed from: m */
        public int f65472m;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts$1 */
        public static class C66851 extends AbstractParser<PackageParts> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageParts(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PackageParts, Builder> implements PackagePartsOrBuilder {

            /* renamed from: c */
            public int f65473c;

            /* renamed from: d */
            public Object f65474d = "";

            /* renamed from: e */
            public LazyStringList f65475e;

            /* renamed from: f */
            public List<Integer> f65476f;

            /* renamed from: g */
            public LazyStringList f65477g;

            /* renamed from: h */
            public LazyStringList f65478h;

            /* renamed from: i */
            public List<Integer> f65479i;

            public Builder() {
                LazyStringList lazyStringList = LazyStringArrayList.f65679c;
                this.f65475e = lazyStringList;
                this.f65476f = Collections.emptyList();
                this.f65477g = lazyStringList;
                this.f65478h = lazyStringList;
                this.f65479i = Collections.emptyList();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                PackageParts m33139k = m33139k();
                if (m33139k.mo32959e()) {
                    return m33139k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33142n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33142n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(PackageParts packageParts) {
                m33141m(packageParts);
                return this;
            }

            /* renamed from: k */
            public PackageParts m33139k() {
                PackageParts packageParts = new PackageParts(this, null);
                int i2 = this.f65473c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                packageParts.f65463d = this.f65474d;
                if ((i2 & 2) == 2) {
                    this.f65475e = this.f65475e.mo33336n();
                    this.f65473c &= -3;
                }
                packageParts.f65464e = this.f65475e;
                if ((this.f65473c & 4) == 4) {
                    this.f65476f = Collections.unmodifiableList(this.f65476f);
                    this.f65473c &= -5;
                }
                packageParts.f65465f = this.f65476f;
                if ((this.f65473c & 8) == 8) {
                    this.f65477g = this.f65477g.mo33336n();
                    this.f65473c &= -9;
                }
                packageParts.f65467h = this.f65477g;
                if ((this.f65473c & 16) == 16) {
                    this.f65478h = this.f65478h.mo33336n();
                    this.f65473c &= -17;
                }
                packageParts.f65468i = this.f65478h;
                if ((this.f65473c & 32) == 32) {
                    this.f65479i = Collections.unmodifiableList(this.f65479i);
                    this.f65473c &= -33;
                }
                packageParts.f65469j = this.f65479i;
                packageParts.f65462c = i3;
                return packageParts;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33141m(m33139k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33141m(PackageParts packageParts) {
                if (packageParts == PackageParts.f65459n) {
                    return this;
                }
                if ((packageParts.f65462c & 1) == 1) {
                    this.f65473c |= 1;
                    this.f65474d = packageParts.f65463d;
                }
                if (!packageParts.f65464e.isEmpty()) {
                    if (this.f65475e.isEmpty()) {
                        this.f65475e = packageParts.f65464e;
                        this.f65473c &= -3;
                    } else {
                        if ((this.f65473c & 2) != 2) {
                            this.f65475e = new LazyStringArrayList(this.f65475e);
                            this.f65473c |= 2;
                        }
                        this.f65475e.addAll(packageParts.f65464e);
                    }
                }
                if (!packageParts.f65465f.isEmpty()) {
                    if (this.f65476f.isEmpty()) {
                        this.f65476f = packageParts.f65465f;
                        this.f65473c &= -5;
                    } else {
                        if ((this.f65473c & 4) != 4) {
                            this.f65476f = new ArrayList(this.f65476f);
                            this.f65473c |= 4;
                        }
                        this.f65476f.addAll(packageParts.f65465f);
                    }
                }
                if (!packageParts.f65467h.isEmpty()) {
                    if (this.f65477g.isEmpty()) {
                        this.f65477g = packageParts.f65467h;
                        this.f65473c &= -9;
                    } else {
                        if ((this.f65473c & 8) != 8) {
                            this.f65477g = new LazyStringArrayList(this.f65477g);
                            this.f65473c |= 8;
                        }
                        this.f65477g.addAll(packageParts.f65467h);
                    }
                }
                if (!packageParts.f65468i.isEmpty()) {
                    if (this.f65478h.isEmpty()) {
                        this.f65478h = packageParts.f65468i;
                        this.f65473c &= -17;
                    } else {
                        if ((this.f65473c & 16) != 16) {
                            this.f65478h = new LazyStringArrayList(this.f65478h);
                            this.f65473c |= 16;
                        }
                        this.f65478h.addAll(packageParts.f65468i);
                    }
                }
                if (!packageParts.f65469j.isEmpty()) {
                    if (this.f65479i.isEmpty()) {
                        this.f65479i = packageParts.f65469j;
                        this.f65473c &= -33;
                    } else {
                        if ((this.f65473c & 32) != 32) {
                            this.f65479i = new ArrayList(this.f65479i);
                            this.f65473c |= 32;
                        }
                        this.f65479i.addAll(packageParts.f65469j);
                    }
                }
                this.f65656b = this.f65656b.m33231b(packageParts.f65461b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.Builder m33142n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.f65460o     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.C66851) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33141m(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L15
                L13:
                    r3 = move-exception
                    goto L1c
                L15:
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.f65674b     // Catch: java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33141m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.Builder.m33142n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts$Builder");
            }
        }

        static {
            PackageParts packageParts = new PackageParts();
            f65459n = packageParts;
            packageParts.m33138j();
        }

        public PackageParts(GeneratedMessageLite.Builder builder, C66831 c66831) {
            super(builder);
            this.f65466g = -1;
            this.f65470k = -1;
            this.f65471l = (byte) -1;
            this.f65472m = -1;
            this.f65461b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33141m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2;
            ByteString byteString;
            int i3 = this.f65472m;
            if (i3 != -1) {
                return i3;
            }
            if ((this.f65462c & 1) == 1) {
                Object obj = this.f65463d;
                if (obj instanceof String) {
                    byteString = ByteString.m33225e((String) obj);
                    this.f65463d = byteString;
                } else {
                    byteString = (ByteString) obj;
                }
                i2 = CodedOutputStream.m33261a(byteString) + CodedOutputStream.m33269i(1) + 0;
            } else {
                i2 = 0;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f65464e.size(); i5++) {
                i4 += CodedOutputStream.m33261a(this.f65464e.mo33333O0(i5));
            }
            int size = (this.f65464e.size() * 1) + i2 + i4;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f65465f.size(); i7++) {
                i6 += CodedOutputStream.m33264d(this.f65465f.get(i7).intValue());
            }
            int i8 = size + i6;
            if (!this.f65465f.isEmpty()) {
                i8 = i8 + 1 + CodedOutputStream.m33264d(i6);
            }
            this.f65466g = i6;
            int i9 = 0;
            for (int i10 = 0; i10 < this.f65467h.size(); i10++) {
                i9 += CodedOutputStream.m33261a(this.f65467h.mo33333O0(i10));
            }
            int size2 = (this.f65467h.size() * 1) + i8 + i9;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f65468i.size(); i12++) {
                i11 += CodedOutputStream.m33261a(this.f65468i.mo33333O0(i12));
            }
            int size3 = (this.f65468i.size() * 1) + size2 + i11;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f65469j.size(); i14++) {
                i13 += CodedOutputStream.m33264d(this.f65469j.get(i14).intValue());
            }
            int i15 = size3 + i13;
            if (!this.f65469j.isEmpty()) {
                i15 = i15 + 1 + CodedOutputStream.m33264d(i13);
            }
            this.f65470k = i13;
            int size4 = this.f65461b.size() + i15;
            this.f65472m = size4;
            return size4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d */
        public MessageLite.Builder mo32958d() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e */
        public final boolean mo32959e() {
            byte b = this.f65471l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.f65462c & 1) == 1) {
                this.f65471l = (byte) 1;
                return true;
            }
            this.f65471l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            ByteString byteString;
            mo32957c();
            if ((this.f65462c & 1) == 1) {
                Object obj = this.f65463d;
                if (obj instanceof String) {
                    byteString = ByteString.m33225e((String) obj);
                    this.f65463d = byteString;
                } else {
                    byteString = (ByteString) obj;
                }
                codedOutputStream.m33275m(1, byteString);
            }
            for (int i2 = 0; i2 < this.f65464e.size(); i2++) {
                codedOutputStream.m33275m(2, this.f65464e.mo33333O0(i2));
            }
            if (this.f65465f.size() > 0) {
                codedOutputStream.m33288z(26);
                codedOutputStream.m33288z(this.f65466g);
            }
            for (int i3 = 0; i3 < this.f65465f.size(); i3++) {
                codedOutputStream.m33280r(this.f65465f.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.f65467h.size(); i4++) {
                codedOutputStream.m33275m(4, this.f65467h.mo33333O0(i4));
            }
            for (int i5 = 0; i5 < this.f65468i.size(); i5++) {
                codedOutputStream.m33275m(5, this.f65468i.mo33333O0(i5));
            }
            if (this.f65469j.size() > 0) {
                codedOutputStream.m33288z(50);
                codedOutputStream.m33288z(this.f65470k);
            }
            for (int i6 = 0; i6 < this.f65469j.size(); i6++) {
                codedOutputStream.m33280r(this.f65469j.get(i6).intValue());
            }
            codedOutputStream.m33284v(this.f65461b);
        }

        /* renamed from: i */
        public String m33137i() {
            Object obj = this.f65463d;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String m33229D = byteString.m33229D();
            if (byteString.mo33235t()) {
                this.f65463d = m33229D;
            }
            return m33229D;
        }

        /* renamed from: j */
        public final void m33138j() {
            this.f65463d = "";
            LazyStringList lazyStringList = LazyStringArrayList.f65679c;
            this.f65464e = lazyStringList;
            this.f65465f = Collections.emptyList();
            this.f65467h = lazyStringList;
            this.f65468i = lazyStringList;
            this.f65469j = Collections.emptyList();
        }

        public PackageParts() {
            this.f65466g = -1;
            this.f65470k = -1;
            this.f65471l = (byte) -1;
            this.f65472m = -1;
            this.f65461b = ByteString.f65623b;
        }

        public PackageParts(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66831 c66831) throws InvalidProtocolBufferException {
            this.f65466g = -1;
            this.f65470k = -1;
            this.f65471l = (byte) -1;
            this.f65472m = -1;
            m33138j();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 10) {
                                ByteString m33246f = codedInputStream.m33246f();
                                this.f65462c |= 1;
                                this.f65463d = m33246f;
                            } else if (m33255o == 18) {
                                ByteString m33246f2 = codedInputStream.m33246f();
                                if ((i2 & 2) != 2) {
                                    this.f65464e = new LazyStringArrayList();
                                    i2 |= 2;
                                }
                                this.f65464e.mo33334e1(m33246f2);
                            } else if (m33255o == 24) {
                                if ((i2 & 4) != 4) {
                                    this.f65465f = new ArrayList();
                                    i2 |= 4;
                                }
                                this.f65465f.add(Integer.valueOf(codedInputStream.m33252l()));
                            } else if (m33255o == 26) {
                                int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 4) != 4 && codedInputStream.m33242b() > 0) {
                                    this.f65465f = new ArrayList();
                                    i2 |= 4;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f65465f.add(Integer.valueOf(codedInputStream.m33252l()));
                                }
                                codedInputStream.f65638i = m33244d;
                                codedInputStream.m33256p();
                            } else if (m33255o == 34) {
                                ByteString m33246f3 = codedInputStream.m33246f();
                                if ((i2 & 8) != 8) {
                                    this.f65467h = new LazyStringArrayList();
                                    i2 |= 8;
                                }
                                this.f65467h.mo33334e1(m33246f3);
                            } else if (m33255o == 42) {
                                ByteString m33246f4 = codedInputStream.m33246f();
                                if ((i2 & 16) != 16) {
                                    this.f65468i = new LazyStringArrayList();
                                    i2 |= 16;
                                }
                                this.f65468i.mo33334e1(m33246f4);
                            } else if (m33255o == 48) {
                                if ((i2 & 32) != 32) {
                                    this.f65469j = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f65469j.add(Integer.valueOf(codedInputStream.m33252l()));
                            } else if (m33255o != 50) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                int m33244d2 = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 32) != 32 && codedInputStream.m33242b() > 0) {
                                    this.f65469j = new ArrayList();
                                    i2 |= 32;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f65469j.add(Integer.valueOf(codedInputStream.m33252l()));
                                }
                                codedInputStream.f65638i = m33244d2;
                                codedInputStream.m33256p();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i2 & 2) == 2) {
                            this.f65464e = this.f65464e.mo33336n();
                        }
                        if ((i2 & 4) == 4) {
                            this.f65465f = Collections.unmodifiableList(this.f65465f);
                        }
                        if ((i2 & 8) == 8) {
                            this.f65467h = this.f65467h.mo33336n();
                        }
                        if ((i2 & 16) == 16) {
                            this.f65468i = this.f65468i.mo33336n();
                        }
                        if ((i2 & 32) == 32) {
                            this.f65469j = Collections.unmodifiableList(this.f65469j);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65461b = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65461b = m33226x.m33240c();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.f65674b = this;
                    throw e2;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                    invalidProtocolBufferException.f65674b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if ((i2 & 2) == 2) {
                this.f65464e = this.f65464e.mo33336n();
            }
            if ((i2 & 4) == 4) {
                this.f65465f = Collections.unmodifiableList(this.f65465f);
            }
            if ((i2 & 8) == 8) {
                this.f65467h = this.f65467h.mo33336n();
            }
            if ((i2 & 16) == 16) {
                this.f65468i = this.f65468i.mo33336n();
            }
            if ((i2 & 32) == 32) {
                this.f65469j = Collections.unmodifiableList(this.f65469j);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65461b = m33226x.m33240c();
                throw th3;
            }
            this.f65461b = m33226x.m33240c();
        }
    }
}
