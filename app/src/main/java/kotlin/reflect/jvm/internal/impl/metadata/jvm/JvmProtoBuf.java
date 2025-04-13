package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import com.yandex.mobile.ads.C4632R;
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
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes3.dex */
public final class JvmProtoBuf {

    /* renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> f65480a;

    /* renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> f65481b;

    /* renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> f65482c;

    /* renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> f65483d;

    /* renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> f65484e;

    /* renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f65485f;

    /* renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> f65486g;

    /* renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f65487h;

    /* renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f65488i;

    /* renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> f65489j;

    /* renamed from: k */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f65490k;

    /* renamed from: l */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f65491l;

    /* renamed from: m */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> f65492m;

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor constructor = ProtoBuf.Constructor.f64970j;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f65504h;
        WireFormat.FieldType fieldType = WireFormat.FieldType.f65735n;
        f65480a = GeneratedMessageLite.m33312h(constructor, jvmMethodSignature, jvmMethodSignature, null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function function = ProtoBuf.Function.f65051s;
        f65481b = GeneratedMessageLite.m33312h(function, jvmMethodSignature, jvmMethodSignature, null, 100, fieldType, JvmMethodSignature.class);
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.f65729h;
        f65482c = GeneratedMessageLite.m33312h(function, 0, null, null, 101, fieldType2, Integer.class);
        ProtoBuf.Property property = ProtoBuf.Property.f65126s;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.f65515j;
        f65483d = GeneratedMessageLite.m33312h(property, jvmPropertySignature, jvmPropertySignature, null, 100, fieldType, JvmPropertySignature.class);
        f65484e = GeneratedMessageLite.m33312h(property, 0, null, null, 101, fieldType2, Integer.class);
        ProtoBuf.Type type = ProtoBuf.Type.f65191u;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.f64853h;
        f65485f = GeneratedMessageLite.m33311g(type, annotation, null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f65486g = GeneratedMessageLite.m33312h(type, Boolean.FALSE, null, null, 101, WireFormat.FieldType.f65732k, Boolean.class);
        f65487h = GeneratedMessageLite.m33311g(ProtoBuf.TypeParameter.f65270n, annotation, null, 100, fieldType, false, ProtoBuf.Annotation.class);
        ProtoBuf.Class r18 = ProtoBuf.Class.f64920z;
        f65488i = GeneratedMessageLite.m33312h(r18, 0, null, null, 101, fieldType2, Integer.class);
        f65489j = GeneratedMessageLite.m33311g(r18, property, null, C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, fieldType, false, ProtoBuf.Property.class);
        f65490k = GeneratedMessageLite.m33312h(r18, 0, null, null, C4632R.styleable.AppCompatTheme_textAppearanceListItem, fieldType2, Integer.class);
        ProtoBuf.Package r8 = ProtoBuf.Package.f65094l;
        f65491l = GeneratedMessageLite.m33312h(r8, 0, null, null, 101, fieldType2, Integer.class);
        f65492m = GeneratedMessageLite.m33311g(r8, property, null, C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, fieldType, false, ProtoBuf.Property.class);
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {

        /* renamed from: h */
        public static final JvmFieldSignature f65493h;

        /* renamed from: i */
        public static Parser<JvmFieldSignature> f65494i = new C66871();

        /* renamed from: b */
        public final ByteString f65495b;

        /* renamed from: c */
        public int f65496c;

        /* renamed from: d */
        public int f65497d;

        /* renamed from: e */
        public int f65498e;

        /* renamed from: f */
        public byte f65499f;

        /* renamed from: g */
        public int f65500g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1 */
        public static class C66871 extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* renamed from: c */
            public int f65501c;

            /* renamed from: d */
            public int f65502d;

            /* renamed from: e */
            public int f65503e;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                JvmFieldSignature m33143k = m33143k();
                if (m33143k.mo32959e()) {
                    return m33143k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33146n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33146n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(JvmFieldSignature jvmFieldSignature) {
                m33145m(jvmFieldSignature);
                return this;
            }

            /* renamed from: k */
            public JvmFieldSignature m33143k() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this, null);
                int i2 = this.f65501c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f65497d = this.f65502d;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                jvmFieldSignature.f65498e = this.f65503e;
                jvmFieldSignature.f65496c = i3;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33145m(m33143k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33145m(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.f65493h) {
                    return this;
                }
                int i2 = jvmFieldSignature.f65496c;
                if ((i2 & 1) == 1) {
                    int i3 = jvmFieldSignature.f65497d;
                    this.f65501c |= 1;
                    this.f65502d = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = jvmFieldSignature.f65498e;
                    this.f65501c = 2 | this.f65501c;
                    this.f65503e = i4;
                }
                this.f65656b = this.f65656b.m33231b(jvmFieldSignature.f65495b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder m33146n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.f65494i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.C66871) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33145m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33145m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder.m33146n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder");
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f65493h = jvmFieldSignature;
            jvmFieldSignature.f65497d = 0;
            jvmFieldSignature.f65498e = 0;
        }

        public JvmFieldSignature(GeneratedMessageLite.Builder builder, C66861 c66861) {
            super(builder);
            this.f65499f = (byte) -1;
            this.f65500g = -1;
            this.f65495b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33145m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65500g;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65496c & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f65497d) : 0;
            if ((this.f65496c & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65498e);
            }
            int size = this.f65495b.size() + m33263c;
            this.f65500g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d */
        public MessageLite.Builder mo32958d() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e */
        public final boolean mo32959e() {
            byte b = this.f65499f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65499f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f65496c & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65497d);
            }
            if ((this.f65496c & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65498e);
            }
            codedOutputStream.m33284v(this.f65495b);
        }

        public JvmFieldSignature() {
            this.f65499f = (byte) -1;
            this.f65500g = -1;
            this.f65495b = ByteString.f65623b;
        }

        public JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66861 c66861) throws InvalidProtocolBufferException {
            this.f65499f = (byte) -1;
            this.f65500g = -1;
            boolean z = false;
            this.f65497d = 0;
            this.f65498e = 0;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 8) {
                                this.f65496c |= 1;
                                this.f65497d = codedInputStream.m33252l();
                            } else if (m33255o != 16) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                this.f65496c |= 2;
                                this.f65498e = codedInputStream.m33252l();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f65674b = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.f65674b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65495b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65495b = m33226x.m33240c();
                    throw th;
                }
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65495b = m33226x.m33240c();
                throw th3;
            }
            this.f65495b = m33226x.m33240c();
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {

        /* renamed from: h */
        public static final JvmMethodSignature f65504h;

        /* renamed from: i */
        public static Parser<JvmMethodSignature> f65505i = new C66881();

        /* renamed from: b */
        public final ByteString f65506b;

        /* renamed from: c */
        public int f65507c;

        /* renamed from: d */
        public int f65508d;

        /* renamed from: e */
        public int f65509e;

        /* renamed from: f */
        public byte f65510f;

        /* renamed from: g */
        public int f65511g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1 */
        public static class C66881 extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* renamed from: c */
            public int f65512c;

            /* renamed from: d */
            public int f65513d;

            /* renamed from: e */
            public int f65514e;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                JvmMethodSignature m33150k = m33150k();
                if (m33150k.mo32959e()) {
                    return m33150k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33153n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33153n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(JvmMethodSignature jvmMethodSignature) {
                m33152m(jvmMethodSignature);
                return this;
            }

            /* renamed from: k */
            public JvmMethodSignature m33150k() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this, null);
                int i2 = this.f65512c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f65508d = this.f65513d;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                jvmMethodSignature.f65509e = this.f65514e;
                jvmMethodSignature.f65507c = i3;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33152m(m33150k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33152m(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.f65504h) {
                    return this;
                }
                if (jvmMethodSignature.m33149j()) {
                    int i2 = jvmMethodSignature.f65508d;
                    this.f65512c |= 1;
                    this.f65513d = i2;
                }
                if (jvmMethodSignature.m33148i()) {
                    int i3 = jvmMethodSignature.f65509e;
                    this.f65512c |= 2;
                    this.f65514e = i3;
                }
                this.f65656b = this.f65656b.m33231b(jvmMethodSignature.f65506b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder m33153n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f65505i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.C66881) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33152m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33152m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder.m33153n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder");
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f65504h = jvmMethodSignature;
            jvmMethodSignature.f65508d = 0;
            jvmMethodSignature.f65509e = 0;
        }

        public JvmMethodSignature(GeneratedMessageLite.Builder builder, C66861 c66861) {
            super(builder);
            this.f65510f = (byte) -1;
            this.f65511g = -1;
            this.f65506b = builder.f65656b;
        }

        /* renamed from: k */
        public static Builder m33147k(JvmMethodSignature jvmMethodSignature) {
            Builder builder = new Builder();
            builder.m33152m(jvmMethodSignature);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            return m33147k(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65511g;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65507c & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f65508d) : 0;
            if ((this.f65507c & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65509e);
            }
            int size = this.f65506b.size() + m33263c;
            this.f65511g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d */
        public MessageLite.Builder mo32958d() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e */
        public final boolean mo32959e() {
            byte b = this.f65510f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65510f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f65507c & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65508d);
            }
            if ((this.f65507c & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65509e);
            }
            codedOutputStream.m33284v(this.f65506b);
        }

        /* renamed from: i */
        public boolean m33148i() {
            return (this.f65507c & 2) == 2;
        }

        /* renamed from: j */
        public boolean m33149j() {
            return (this.f65507c & 1) == 1;
        }

        public JvmMethodSignature() {
            this.f65510f = (byte) -1;
            this.f65511g = -1;
            this.f65506b = ByteString.f65623b;
        }

        public JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66861 c66861) throws InvalidProtocolBufferException {
            this.f65510f = (byte) -1;
            this.f65511g = -1;
            boolean z = false;
            this.f65508d = 0;
            this.f65509e = 0;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 8) {
                                this.f65507c |= 1;
                                this.f65508d = codedInputStream.m33252l();
                            } else if (m33255o != 16) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                this.f65507c |= 2;
                                this.f65509e = codedInputStream.m33252l();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f65674b = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.f65674b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65506b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65506b = m33226x.m33240c();
                    throw th;
                }
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65506b = m33226x.m33240c();
                throw th3;
            }
            this.f65506b = m33226x.m33240c();
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {

        /* renamed from: j */
        public static final JvmPropertySignature f65515j;

        /* renamed from: k */
        public static Parser<JvmPropertySignature> f65516k = new C66891();

        /* renamed from: b */
        public final ByteString f65517b;

        /* renamed from: c */
        public int f65518c;

        /* renamed from: d */
        public JvmFieldSignature f65519d;

        /* renamed from: e */
        public JvmMethodSignature f65520e;

        /* renamed from: f */
        public JvmMethodSignature f65521f;

        /* renamed from: g */
        public JvmMethodSignature f65522g;

        /* renamed from: h */
        public byte f65523h;

        /* renamed from: i */
        public int f65524i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1 */
        public static class C66891 extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* renamed from: c */
            public int f65525c;

            /* renamed from: d */
            public JvmFieldSignature f65526d = JvmFieldSignature.f65493h;

            /* renamed from: e */
            public JvmMethodSignature f65527e;

            /* renamed from: f */
            public JvmMethodSignature f65528f;

            /* renamed from: g */
            public JvmMethodSignature f65529g;

            public Builder() {
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f65504h;
                this.f65527e = jvmMethodSignature;
                this.f65528f = jvmMethodSignature;
                this.f65529g = jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                JvmPropertySignature m33156k = m33156k();
                if (m33156k.mo32959e()) {
                    return m33156k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33159n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33159n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(JvmPropertySignature jvmPropertySignature) {
                m33158m(jvmPropertySignature);
                return this;
            }

            /* renamed from: k */
            public JvmPropertySignature m33156k() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this, null);
                int i2 = this.f65525c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f65519d = this.f65526d;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                jvmPropertySignature.f65520e = this.f65527e;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                jvmPropertySignature.f65521f = this.f65528f;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                jvmPropertySignature.f65522g = this.f65529g;
                jvmPropertySignature.f65518c = i3;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33158m(m33156k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33158m(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.f65515j) {
                    return this;
                }
                if ((jvmPropertySignature.f65518c & 1) == 1) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.f65519d;
                    if ((this.f65525c & 1) != 1 || (jvmFieldSignature = this.f65526d) == JvmFieldSignature.f65493h) {
                        this.f65526d = jvmFieldSignature2;
                    } else {
                        JvmFieldSignature.Builder builder = new JvmFieldSignature.Builder();
                        builder.m33145m(jvmFieldSignature);
                        builder.m33145m(jvmFieldSignature2);
                        this.f65526d = builder.m33143k();
                    }
                    this.f65525c |= 1;
                }
                if ((jvmPropertySignature.f65518c & 2) == 2) {
                    JvmMethodSignature jvmMethodSignature4 = jvmPropertySignature.f65520e;
                    if ((this.f65525c & 2) != 2 || (jvmMethodSignature3 = this.f65527e) == JvmMethodSignature.f65504h) {
                        this.f65527e = jvmMethodSignature4;
                    } else {
                        JvmMethodSignature.Builder m33147k = JvmMethodSignature.m33147k(jvmMethodSignature3);
                        m33147k.m33152m(jvmMethodSignature4);
                        this.f65527e = m33147k.m33150k();
                    }
                    this.f65525c |= 2;
                }
                if (jvmPropertySignature.m33154i()) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.f65521f;
                    if ((this.f65525c & 4) != 4 || (jvmMethodSignature2 = this.f65528f) == JvmMethodSignature.f65504h) {
                        this.f65528f = jvmMethodSignature5;
                    } else {
                        JvmMethodSignature.Builder m33147k2 = JvmMethodSignature.m33147k(jvmMethodSignature2);
                        m33147k2.m33152m(jvmMethodSignature5);
                        this.f65528f = m33147k2.m33150k();
                    }
                    this.f65525c |= 4;
                }
                if (jvmPropertySignature.m33155j()) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.f65522g;
                    if ((this.f65525c & 8) != 8 || (jvmMethodSignature = this.f65529g) == JvmMethodSignature.f65504h) {
                        this.f65529g = jvmMethodSignature6;
                    } else {
                        JvmMethodSignature.Builder m33147k3 = JvmMethodSignature.m33147k(jvmMethodSignature);
                        m33147k3.m33152m(jvmMethodSignature6);
                        this.f65529g = m33147k3.m33150k();
                    }
                    this.f65525c |= 8;
                }
                this.f65656b = this.f65656b.m33231b(jvmPropertySignature.f65517b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder m33159n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.f65516k     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.C66891) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33158m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33158m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder.m33159n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$Builder");
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f65515j = jvmPropertySignature;
            jvmPropertySignature.f65519d = JvmFieldSignature.f65493h;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f65504h;
            jvmPropertySignature.f65520e = jvmMethodSignature;
            jvmPropertySignature.f65521f = jvmMethodSignature;
            jvmPropertySignature.f65522g = jvmMethodSignature;
        }

        public JvmPropertySignature(GeneratedMessageLite.Builder builder, C66861 c66861) {
            super(builder);
            this.f65523h = (byte) -1;
            this.f65524i = -1;
            this.f65517b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33158m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65524i;
            if (i2 != -1) {
                return i2;
            }
            int m33265e = (this.f65518c & 1) == 1 ? 0 + CodedOutputStream.m33265e(1, this.f65519d) : 0;
            if ((this.f65518c & 2) == 2) {
                m33265e += CodedOutputStream.m33265e(2, this.f65520e);
            }
            if ((this.f65518c & 4) == 4) {
                m33265e += CodedOutputStream.m33265e(3, this.f65521f);
            }
            if ((this.f65518c & 8) == 8) {
                m33265e += CodedOutputStream.m33265e(4, this.f65522g);
            }
            int size = this.f65517b.size() + m33265e;
            this.f65524i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d */
        public MessageLite.Builder mo32958d() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e */
        public final boolean mo32959e() {
            byte b = this.f65523h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65523h = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f65518c & 1) == 1) {
                codedOutputStream.m33281s(1, this.f65519d);
            }
            if ((this.f65518c & 2) == 2) {
                codedOutputStream.m33281s(2, this.f65520e);
            }
            if ((this.f65518c & 4) == 4) {
                codedOutputStream.m33281s(3, this.f65521f);
            }
            if ((this.f65518c & 8) == 8) {
                codedOutputStream.m33281s(4, this.f65522g);
            }
            codedOutputStream.m33284v(this.f65517b);
        }

        /* renamed from: i */
        public boolean m33154i() {
            return (this.f65518c & 4) == 4;
        }

        /* renamed from: j */
        public boolean m33155j() {
            return (this.f65518c & 8) == 8;
        }

        public JvmPropertySignature() {
            this.f65523h = (byte) -1;
            this.f65524i = -1;
            this.f65517b = ByteString.f65623b;
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66861 c66861) throws InvalidProtocolBufferException {
            this.f65523h = (byte) -1;
            this.f65524i = -1;
            this.f65519d = JvmFieldSignature.f65493h;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f65504h;
            this.f65520e = jvmMethodSignature;
            this.f65521f = jvmMethodSignature;
            this.f65522g = jvmMethodSignature;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                JvmMethodSignature.Builder builder = null;
                                JvmFieldSignature.Builder builder2 = null;
                                JvmMethodSignature.Builder builder3 = null;
                                JvmMethodSignature.Builder builder4 = null;
                                if (m33255o == 10) {
                                    if ((this.f65518c & 1) == 1) {
                                        JvmFieldSignature jvmFieldSignature = this.f65519d;
                                        Objects.requireNonNull(jvmFieldSignature);
                                        builder2 = new JvmFieldSignature.Builder();
                                        builder2.m33145m(jvmFieldSignature);
                                    }
                                    JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) codedInputStream.m33248h(JvmFieldSignature.f65494i, extensionRegistryLite);
                                    this.f65519d = jvmFieldSignature2;
                                    if (builder2 != null) {
                                        builder2.m33145m(jvmFieldSignature2);
                                        this.f65519d = builder2.m33143k();
                                    }
                                    this.f65518c |= 1;
                                } else if (m33255o == 18) {
                                    if ((this.f65518c & 2) == 2) {
                                        JvmMethodSignature jvmMethodSignature2 = this.f65520e;
                                        Objects.requireNonNull(jvmMethodSignature2);
                                        builder3 = JvmMethodSignature.m33147k(jvmMethodSignature2);
                                    }
                                    JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.m33248h(JvmMethodSignature.f65505i, extensionRegistryLite);
                                    this.f65520e = jvmMethodSignature3;
                                    if (builder3 != null) {
                                        builder3.m33152m(jvmMethodSignature3);
                                        this.f65520e = builder3.m33150k();
                                    }
                                    this.f65518c |= 2;
                                } else if (m33255o == 26) {
                                    if ((this.f65518c & 4) == 4) {
                                        JvmMethodSignature jvmMethodSignature4 = this.f65521f;
                                        Objects.requireNonNull(jvmMethodSignature4);
                                        builder4 = JvmMethodSignature.m33147k(jvmMethodSignature4);
                                    }
                                    JvmMethodSignature jvmMethodSignature5 = (JvmMethodSignature) codedInputStream.m33248h(JvmMethodSignature.f65505i, extensionRegistryLite);
                                    this.f65521f = jvmMethodSignature5;
                                    if (builder4 != null) {
                                        builder4.m33152m(jvmMethodSignature5);
                                        this.f65521f = builder4.m33150k();
                                    }
                                    this.f65518c |= 4;
                                } else if (m33255o != 34) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    if ((this.f65518c & 8) == 8) {
                                        JvmMethodSignature jvmMethodSignature6 = this.f65522g;
                                        Objects.requireNonNull(jvmMethodSignature6);
                                        builder = JvmMethodSignature.m33147k(jvmMethodSignature6);
                                    }
                                    JvmMethodSignature jvmMethodSignature7 = (JvmMethodSignature) codedInputStream.m33248h(JvmMethodSignature.f65505i, extensionRegistryLite);
                                    this.f65522g = jvmMethodSignature7;
                                    if (builder != null) {
                                        builder.m33152m(jvmMethodSignature7);
                                        this.f65522g = builder.m33150k();
                                    }
                                    this.f65518c |= 8;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.f65674b = this;
                            throw e2;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.f65674b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65517b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65517b = m33226x.m33240c();
                    throw th;
                }
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65517b = m33226x.m33240c();
                throw th3;
            }
            this.f65517b = m33226x.m33240c();
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {

        /* renamed from: h */
        public static final StringTableTypes f65530h;

        /* renamed from: i */
        public static Parser<StringTableTypes> f65531i = new C66901();

        /* renamed from: b */
        public final ByteString f65532b;

        /* renamed from: c */
        public List<Record> f65533c;

        /* renamed from: d */
        public List<Integer> f65534d;

        /* renamed from: e */
        public int f65535e;

        /* renamed from: f */
        public byte f65536f;

        /* renamed from: g */
        public int f65537g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1 */
        public static class C66901 extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTableTypes(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* renamed from: c */
            public int f65538c;

            /* renamed from: d */
            public List<Record> f65539d = Collections.emptyList();

            /* renamed from: e */
            public List<Integer> f65540e = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                StringTableTypes m33160k = m33160k();
                if (m33160k.mo32959e()) {
                    return m33160k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33163n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33163n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(StringTableTypes stringTableTypes) {
                m33162m(stringTableTypes);
                return this;
            }

            /* renamed from: k */
            public StringTableTypes m33160k() {
                StringTableTypes stringTableTypes = new StringTableTypes(this, null);
                if ((this.f65538c & 1) == 1) {
                    this.f65539d = Collections.unmodifiableList(this.f65539d);
                    this.f65538c &= -2;
                }
                stringTableTypes.f65533c = this.f65539d;
                if ((this.f65538c & 2) == 2) {
                    this.f65540e = Collections.unmodifiableList(this.f65540e);
                    this.f65538c &= -3;
                }
                stringTableTypes.f65534d = this.f65540e;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33162m(m33160k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33162m(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.f65530h) {
                    return this;
                }
                if (!stringTableTypes.f65533c.isEmpty()) {
                    if (this.f65539d.isEmpty()) {
                        this.f65539d = stringTableTypes.f65533c;
                        this.f65538c &= -2;
                    } else {
                        if ((this.f65538c & 1) != 1) {
                            this.f65539d = new ArrayList(this.f65539d);
                            this.f65538c |= 1;
                        }
                        this.f65539d.addAll(stringTableTypes.f65533c);
                    }
                }
                if (!stringTableTypes.f65534d.isEmpty()) {
                    if (this.f65540e.isEmpty()) {
                        this.f65540e = stringTableTypes.f65534d;
                        this.f65538c &= -3;
                    } else {
                        if ((this.f65538c & 2) != 2) {
                            this.f65540e = new ArrayList(this.f65540e);
                            this.f65538c |= 2;
                        }
                        this.f65540e.addAll(stringTableTypes.f65534d);
                    }
                }
                this.f65656b = this.f65656b.m33231b(stringTableTypes.f65532b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder m33163n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.f65531i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.C66901) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33162m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33162m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder.m33163n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Builder");
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f65530h = stringTableTypes;
            stringTableTypes.f65533c = Collections.emptyList();
            stringTableTypes.f65534d = Collections.emptyList();
        }

        public StringTableTypes(GeneratedMessageLite.Builder builder, C66861 c66861) {
            super(builder);
            this.f65535e = -1;
            this.f65536f = (byte) -1;
            this.f65537g = -1;
            this.f65532b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33162m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65537g;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65533c.size(); i4++) {
                i3 += CodedOutputStream.m33265e(1, this.f65533c.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f65534d.size(); i6++) {
                i5 += CodedOutputStream.m33264d(this.f65534d.get(i6).intValue());
            }
            int i7 = i3 + i5;
            if (!this.f65534d.isEmpty()) {
                i7 = i7 + 1 + CodedOutputStream.m33264d(i5);
            }
            this.f65535e = i5;
            int size = this.f65532b.size() + i7;
            this.f65537g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d */
        public MessageLite.Builder mo32958d() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e */
        public final boolean mo32959e() {
            byte b = this.f65536f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65536f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f65533c.size(); i2++) {
                codedOutputStream.m33281s(1, this.f65533c.get(i2));
            }
            if (this.f65534d.size() > 0) {
                codedOutputStream.m33288z(42);
                codedOutputStream.m33288z(this.f65535e);
            }
            for (int i3 = 0; i3 < this.f65534d.size(); i3++) {
                codedOutputStream.m33280r(this.f65534d.get(i3).intValue());
            }
            codedOutputStream.m33284v(this.f65532b);
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {

            /* renamed from: n */
            public static final Record f65541n;

            /* renamed from: o */
            public static Parser<Record> f65542o = new C66911();

            /* renamed from: b */
            public final ByteString f65543b;

            /* renamed from: c */
            public int f65544c;

            /* renamed from: d */
            public int f65545d;

            /* renamed from: e */
            public int f65546e;

            /* renamed from: f */
            public Object f65547f;

            /* renamed from: g */
            public Operation f65548g;

            /* renamed from: h */
            public List<Integer> f65549h;

            /* renamed from: i */
            public int f65550i;

            /* renamed from: j */
            public List<Integer> f65551j;

            /* renamed from: k */
            public int f65552k;

            /* renamed from: l */
            public byte f65553l;

            /* renamed from: m */
            public int f65554m;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1 */
            public static class C66911 extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: a */
                public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Record(codedInputStream, extensionRegistryLite, null);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* renamed from: c */
                public int f65555c;

                /* renamed from: e */
                public int f65557e;

                /* renamed from: d */
                public int f65556d = 1;

                /* renamed from: f */
                public Object f65558f = "";

                /* renamed from: g */
                public Operation f65559g = Operation.NONE;

                /* renamed from: h */
                public List<Integer> f65560h = Collections.emptyList();

                /* renamed from: i */
                public List<Integer> f65561i = Collections.emptyList();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: A */
                public MessageLite mo32962A() {
                    Record m33165k = m33165k();
                    if (m33165k.mo32959e()) {
                        return m33165k;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: b0 */
                public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m33168n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: h */
                public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m33168n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: j */
                public /* bridge */ /* synthetic */ Builder mo32967j(Record record) {
                    m33167m(record);
                    return this;
                }

                /* renamed from: k */
                public Record m33165k() {
                    Record record = new Record(this, null);
                    int i2 = this.f65555c;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    record.f65545d = this.f65556d;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    record.f65546e = this.f65557e;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    record.f65547f = this.f65558f;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    record.f65548g = this.f65559g;
                    if ((i2 & 16) == 16) {
                        this.f65560h = Collections.unmodifiableList(this.f65560h);
                        this.f65555c &= -17;
                    }
                    record.f65549h = this.f65560h;
                    if ((this.f65555c & 32) == 32) {
                        this.f65561i = Collections.unmodifiableList(this.f65561i);
                        this.f65555c &= -33;
                    }
                    record.f65551j = this.f65561i;
                    record.f65544c = i3;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public Builder mo32986k() {
                    Builder builder = new Builder();
                    builder.m33167m(m33165k());
                    return builder;
                }

                /* renamed from: m */
                public Builder m33167m(Record record) {
                    if (record == Record.f65541n) {
                        return this;
                    }
                    int i2 = record.f65544c;
                    if ((i2 & 1) == 1) {
                        int i3 = record.f65545d;
                        this.f65555c |= 1;
                        this.f65556d = i3;
                    }
                    if ((i2 & 2) == 2) {
                        int i4 = record.f65546e;
                        this.f65555c = 2 | this.f65555c;
                        this.f65557e = i4;
                    }
                    if ((i2 & 4) == 4) {
                        this.f65555c |= 4;
                        this.f65558f = record.f65547f;
                    }
                    if ((i2 & 8) == 8) {
                        Operation operation = record.f65548g;
                        Objects.requireNonNull(operation);
                        this.f65555c = 8 | this.f65555c;
                        this.f65559g = operation;
                    }
                    if (!record.f65549h.isEmpty()) {
                        if (this.f65560h.isEmpty()) {
                            this.f65560h = record.f65549h;
                            this.f65555c &= -17;
                        } else {
                            if ((this.f65555c & 16) != 16) {
                                this.f65560h = new ArrayList(this.f65560h);
                                this.f65555c |= 16;
                            }
                            this.f65560h.addAll(record.f65549h);
                        }
                    }
                    if (!record.f65551j.isEmpty()) {
                        if (this.f65561i.isEmpty()) {
                            this.f65561i = record.f65551j;
                            this.f65555c &= -33;
                        } else {
                            if ((this.f65555c & 32) != 32) {
                                this.f65561i = new ArrayList(this.f65561i);
                                this.f65555c |= 32;
                            }
                            this.f65561i.addAll(record.f65551j);
                        }
                    }
                    this.f65656b = this.f65656b.m33231b(record.f65543b);
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
                /* renamed from: n */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder m33168n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.f65542o     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.C66911) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        if (r3 == 0) goto L10
                        r2.m33167m(r3)
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
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r4     // Catch: java.lang.Throwable -> L13
                        throw r3     // Catch: java.lang.Throwable -> L1a
                    L1a:
                        r3 = move-exception
                        r0 = r4
                    L1c:
                        if (r0 == 0) goto L21
                        r2.m33167m(r0)
                    L21:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder.m33168n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Builder");
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);


                /* renamed from: b */
                public final int f65566b;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$1 */
                public static class C66921 implements Internal.EnumLiteMap<Operation> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* renamed from: a */
                    public Operation mo32979a(int i2) {
                        return Operation.m33169a(i2);
                    }
                }

                Operation(int i2) {
                    this.f65566b = i2;
                }

                /* renamed from: a */
                public static Operation m33169a(int i2) {
                    if (i2 == 0) {
                        return NONE;
                    }
                    if (i2 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i2 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                /* renamed from: x */
                public final int mo32978x() {
                    return this.f65566b;
                }
            }

            static {
                Record record = new Record();
                f65541n = record;
                record.m33164i();
            }

            public Record(GeneratedMessageLite.Builder builder, C66861 c66861) {
                super(builder);
                this.f65550i = -1;
                this.f65552k = -1;
                this.f65553l = (byte) -1;
                this.f65554m = -1;
                this.f65543b = builder.f65656b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: b */
            public MessageLite.Builder mo32956b() {
                Builder builder = new Builder();
                builder.m33167m(this);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: c */
            public int mo32957c() {
                ByteString byteString;
                int i2 = this.f65554m;
                if (i2 != -1) {
                    return i2;
                }
                int m33263c = (this.f65544c & 1) == 1 ? CodedOutputStream.m33263c(1, this.f65545d) + 0 : 0;
                if ((this.f65544c & 2) == 2) {
                    m33263c += CodedOutputStream.m33263c(2, this.f65546e);
                }
                if ((this.f65544c & 8) == 8) {
                    m33263c += CodedOutputStream.m33262b(3, this.f65548g.f65566b);
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.f65549h.size(); i4++) {
                    i3 += CodedOutputStream.m33264d(this.f65549h.get(i4).intValue());
                }
                int i5 = m33263c + i3;
                if (!this.f65549h.isEmpty()) {
                    i5 = i5 + 1 + CodedOutputStream.m33264d(i3);
                }
                this.f65550i = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.f65551j.size(); i7++) {
                    i6 += CodedOutputStream.m33264d(this.f65551j.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!this.f65551j.isEmpty()) {
                    i8 = i8 + 1 + CodedOutputStream.m33264d(i6);
                }
                this.f65552k = i6;
                if ((this.f65544c & 4) == 4) {
                    Object obj = this.f65547f;
                    if (obj instanceof String) {
                        byteString = ByteString.m33225e((String) obj);
                        this.f65547f = byteString;
                    } else {
                        byteString = (ByteString) obj;
                    }
                    i8 += CodedOutputStream.m33261a(byteString) + CodedOutputStream.m33269i(6);
                }
                int size = this.f65543b.size() + i8;
                this.f65554m = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: d */
            public MessageLite.Builder mo32958d() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            /* renamed from: e */
            public final boolean mo32959e() {
                byte b = this.f65553l;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f65553l = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: f */
            public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
                ByteString byteString;
                mo32957c();
                if ((this.f65544c & 1) == 1) {
                    codedOutputStream.m33279q(1, this.f65545d);
                }
                if ((this.f65544c & 2) == 2) {
                    codedOutputStream.m33279q(2, this.f65546e);
                }
                if ((this.f65544c & 8) == 8) {
                    codedOutputStream.m33277o(3, this.f65548g.f65566b);
                }
                if (this.f65549h.size() > 0) {
                    codedOutputStream.m33288z(34);
                    codedOutputStream.m33288z(this.f65550i);
                }
                for (int i2 = 0; i2 < this.f65549h.size(); i2++) {
                    codedOutputStream.m33280r(this.f65549h.get(i2).intValue());
                }
                if (this.f65551j.size() > 0) {
                    codedOutputStream.m33288z(42);
                    codedOutputStream.m33288z(this.f65552k);
                }
                for (int i3 = 0; i3 < this.f65551j.size(); i3++) {
                    codedOutputStream.m33280r(this.f65551j.get(i3).intValue());
                }
                if ((this.f65544c & 4) == 4) {
                    Object obj = this.f65547f;
                    if (obj instanceof String) {
                        byteString = ByteString.m33225e((String) obj);
                        this.f65547f = byteString;
                    } else {
                        byteString = (ByteString) obj;
                    }
                    codedOutputStream.m33275m(6, byteString);
                }
                codedOutputStream.m33284v(this.f65543b);
            }

            /* renamed from: i */
            public final void m33164i() {
                this.f65545d = 1;
                this.f65546e = 0;
                this.f65547f = "";
                this.f65548g = Operation.NONE;
                this.f65549h = Collections.emptyList();
                this.f65551j = Collections.emptyList();
            }

            public Record() {
                this.f65550i = -1;
                this.f65552k = -1;
                this.f65553l = (byte) -1;
                this.f65554m = -1;
                this.f65543b = ByteString.f65623b;
            }

            public Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66861 c66861) throws InvalidProtocolBufferException {
                this.f65550i = -1;
                this.f65552k = -1;
                this.f65553l = (byte) -1;
                this.f65554m = -1;
                m33164i();
                ByteString.Output m33226x = ByteString.m33226x();
                CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    try {
                        try {
                            try {
                                int m33255o = codedInputStream.m33255o();
                                if (m33255o != 0) {
                                    if (m33255o == 8) {
                                        this.f65544c |= 1;
                                        this.f65545d = codedInputStream.m33252l();
                                    } else if (m33255o == 16) {
                                        this.f65544c |= 2;
                                        this.f65546e = codedInputStream.m33252l();
                                    } else if (m33255o == 24) {
                                        int m33252l = codedInputStream.m33252l();
                                        Operation m33169a = Operation.m33169a(m33252l);
                                        if (m33169a == null) {
                                            m33270k.m33288z(m33255o);
                                            m33270k.m33288z(m33252l);
                                        } else {
                                            this.f65544c |= 8;
                                            this.f65548g = m33169a;
                                        }
                                    } else if (m33255o == 32) {
                                        if ((i2 & 16) != 16) {
                                            this.f65549h = new ArrayList();
                                            i2 |= 16;
                                        }
                                        this.f65549h.add(Integer.valueOf(codedInputStream.m33252l()));
                                    } else if (m33255o == 34) {
                                        int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                        if ((i2 & 16) != 16 && codedInputStream.m33242b() > 0) {
                                            this.f65549h = new ArrayList();
                                            i2 |= 16;
                                        }
                                        while (codedInputStream.m33242b() > 0) {
                                            this.f65549h.add(Integer.valueOf(codedInputStream.m33252l()));
                                        }
                                        codedInputStream.f65638i = m33244d;
                                        codedInputStream.m33256p();
                                    } else if (m33255o == 40) {
                                        if ((i2 & 32) != 32) {
                                            this.f65551j = new ArrayList();
                                            i2 |= 32;
                                        }
                                        this.f65551j.add(Integer.valueOf(codedInputStream.m33252l()));
                                    } else if (m33255o == 42) {
                                        int m33244d2 = codedInputStream.m33244d(codedInputStream.m33252l());
                                        if ((i2 & 32) != 32 && codedInputStream.m33242b() > 0) {
                                            this.f65551j = new ArrayList();
                                            i2 |= 32;
                                        }
                                        while (codedInputStream.m33242b() > 0) {
                                            this.f65551j.add(Integer.valueOf(codedInputStream.m33252l()));
                                        }
                                        codedInputStream.f65638i = m33244d2;
                                        codedInputStream.m33256p();
                                    } else if (m33255o != 50) {
                                        if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                        }
                                    } else {
                                        ByteString m33246f = codedInputStream.m33246f();
                                        this.f65544c |= 4;
                                        this.f65547f = m33246f;
                                    }
                                }
                                z = true;
                            } catch (IOException e2) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                invalidProtocolBufferException.f65674b = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e3) {
                            e3.f65674b = this;
                            throw e3;
                        }
                    } catch (Throwable th) {
                        if ((i2 & 16) == 16) {
                            this.f65549h = Collections.unmodifiableList(this.f65549h);
                        }
                        if ((i2 & 32) == 32) {
                            this.f65551j = Collections.unmodifiableList(this.f65551j);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65543b = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65543b = m33226x.m33240c();
                        throw th;
                    }
                }
                if ((i2 & 16) == 16) {
                    this.f65549h = Collections.unmodifiableList(this.f65549h);
                }
                if ((i2 & 32) == 32) {
                    this.f65551j = Collections.unmodifiableList(this.f65551j);
                }
                try {
                    m33270k.m33273j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f65543b = m33226x.m33240c();
                    throw th3;
                }
                this.f65543b = m33226x.m33240c();
            }
        }

        public StringTableTypes() {
            this.f65535e = -1;
            this.f65536f = (byte) -1;
            this.f65537g = -1;
            this.f65532b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66861 c66861) throws InvalidProtocolBufferException {
            this.f65535e = -1;
            this.f65536f = (byte) -1;
            this.f65537g = -1;
            this.f65533c = Collections.emptyList();
            this.f65534d = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o == 10) {
                                    if ((i2 & 1) != 1) {
                                        this.f65533c = new ArrayList();
                                        i2 |= 1;
                                    }
                                    this.f65533c.add(codedInputStream.m33248h(Record.f65542o, extensionRegistryLite));
                                } else if (m33255o == 40) {
                                    if ((i2 & 2) != 2) {
                                        this.f65534d = new ArrayList();
                                        i2 |= 2;
                                    }
                                    this.f65534d.add(Integer.valueOf(codedInputStream.m33252l()));
                                } else if (m33255o != 42) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                    if ((i2 & 2) != 2 && codedInputStream.m33242b() > 0) {
                                        this.f65534d = new ArrayList();
                                        i2 |= 2;
                                    }
                                    while (codedInputStream.m33242b() > 0) {
                                        this.f65534d.add(Integer.valueOf(codedInputStream.m33252l()));
                                    }
                                    codedInputStream.f65638i = m33244d;
                                    codedInputStream.m33256p();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.f65674b = this;
                            throw e2;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.f65674b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i2 & 1) == 1) {
                        this.f65533c = Collections.unmodifiableList(this.f65533c);
                    }
                    if ((i2 & 2) == 2) {
                        this.f65534d = Collections.unmodifiableList(this.f65534d);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65532b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65532b = m33226x.m33240c();
                    throw th;
                }
            }
            if ((i2 & 1) == 1) {
                this.f65533c = Collections.unmodifiableList(this.f65533c);
            }
            if ((i2 & 2) == 2) {
                this.f65534d = Collections.unmodifiableList(this.f65534d);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65532b = m33226x.m33240c();
                throw th3;
            }
            this.f65532b = m33226x.m33240c();
        }
    }
}
