package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.google.firebase.auth.C2052a;
import com.yandex.div2.C3033a;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes3.dex */
public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);


        /* renamed from: b */
        public final int f65087b;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$1 */
        public static class C66601 implements Internal.EnumLiteMap<MemberKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public MemberKind mo32979a(int i2) {
                if (i2 == 0) {
                    return MemberKind.DECLARATION;
                }
                if (i2 == 1) {
                    return MemberKind.FAKE_OVERRIDE;
                }
                if (i2 == 2) {
                    return MemberKind.DELEGATION;
                }
                if (i2 != 3) {
                    return null;
                }
                return MemberKind.SYNTHESIZED;
            }
        }

        MemberKind(int i2) {
            this.f65087b = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo32978x() {
            return this.f65087b;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);


        /* renamed from: b */
        public final int f65093b;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$1 */
        public static class C66611 implements Internal.EnumLiteMap<Modality> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public Modality mo32979a(int i2) {
                if (i2 == 0) {
                    return Modality.FINAL;
                }
                if (i2 == 1) {
                    return Modality.OPEN;
                }
                if (i2 == 2) {
                    return Modality.ABSTRACT;
                }
                if (i2 != 3) {
                    return null;
                }
                return Modality.SEALED;
            }
        }

        Modality(int i2) {
            this.f65093b = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo32978x() {
            return this.f65093b;
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);


        /* renamed from: b */
        public final int f65369b;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$1 */
        public static class C66811 implements Internal.EnumLiteMap<Visibility> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public Visibility mo32979a(int i2) {
                if (i2 == 0) {
                    return Visibility.INTERNAL;
                }
                if (i2 == 1) {
                    return Visibility.PRIVATE;
                }
                if (i2 == 2) {
                    return Visibility.PROTECTED;
                }
                if (i2 == 3) {
                    return Visibility.PUBLIC;
                }
                if (i2 == 4) {
                    return Visibility.PRIVATE_TO_THIS;
                }
                if (i2 != 5) {
                    return null;
                }
                return Visibility.LOCAL;
            }
        }

        Visibility(int i2) {
            this.f65369b = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo32978x() {
            return this.f65369b;
        }
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {

        /* renamed from: h */
        public static final Annotation f64853h;

        /* renamed from: i */
        public static Parser<Annotation> f64854i = new C66451();

        /* renamed from: b */
        public final ByteString f64855b;

        /* renamed from: c */
        public int f64856c;

        /* renamed from: d */
        public int f64857d;

        /* renamed from: e */
        public List<Argument> f64858e;

        /* renamed from: f */
        public byte f64859f;

        /* renamed from: g */
        public int f64860g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1 */
        public static class C66451 extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite, null);
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* renamed from: c */
            public int f64916c;

            /* renamed from: d */
            public int f64917d;

            /* renamed from: e */
            public List<Argument> f64918e = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Annotation m32980k = m32980k();
                if (m32980k.mo32959e()) {
                    return m32980k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32983n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32983n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(Annotation annotation) {
                m32982m(annotation);
                return this;
            }

            /* renamed from: k */
            public Annotation m32980k() {
                Annotation annotation = new Annotation(this, null);
                int i2 = this.f64916c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                annotation.f64857d = this.f64917d;
                if ((i2 & 2) == 2) {
                    this.f64918e = Collections.unmodifiableList(this.f64918e);
                    this.f64916c &= -3;
                }
                annotation.f64858e = this.f64918e;
                annotation.f64856c = i3;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m32982m(m32980k());
                return builder;
            }

            /* renamed from: m */
            public Builder m32982m(Annotation annotation) {
                if (annotation == Annotation.f64853h) {
                    return this;
                }
                if ((annotation.f64856c & 1) == 1) {
                    int i2 = annotation.f64857d;
                    this.f64916c = 1 | this.f64916c;
                    this.f64917d = i2;
                }
                if (!annotation.f64858e.isEmpty()) {
                    if (this.f64918e.isEmpty()) {
                        this.f64918e = annotation.f64858e;
                        this.f64916c &= -3;
                    } else {
                        if ((this.f64916c & 2) != 2) {
                            this.f64918e = new ArrayList(this.f64918e);
                            this.f64916c |= 2;
                        }
                        this.f64918e.addAll(annotation.f64858e);
                    }
                }
                this.f65656b = this.f65656b.m33231b(annotation.f64855b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder m32983n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.f64854i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.C66451) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m32982m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m32982m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.m32983n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
            }
        }

        static {
            Annotation annotation = new Annotation();
            f64853h = annotation;
            annotation.f64857d = 0;
            annotation.f64858e = Collections.emptyList();
        }

        public Annotation(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f64859f = (byte) -1;
            this.f64860g = -1;
            this.f64855b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m32982m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f64860g;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f64856c & 1) == 1 ? CodedOutputStream.m33263c(1, this.f64857d) + 0 : 0;
            for (int i3 = 0; i3 < this.f64858e.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(2, this.f64858e.get(i3));
            }
            int size = this.f64855b.size() + m33263c;
            this.f64860g = size;
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
            byte b = this.f64859f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f64856c & 1) == 1)) {
                this.f64859f = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f64858e.size(); i2++) {
                if (!this.f64858e.get(i2).mo32959e()) {
                    this.f64859f = (byte) 0;
                    return false;
                }
            }
            this.f64859f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f64856c & 1) == 1) {
                codedOutputStream.m33279q(1, this.f64857d);
            }
            for (int i2 = 0; i2 < this.f64858e.size(); i2++) {
                codedOutputStream.m33281s(2, this.f64858e.get(i2));
            }
            codedOutputStream.m33284v(this.f64855b);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* renamed from: h */
            public static final Argument f64861h;

            /* renamed from: i */
            public static Parser<Argument> f64862i = new C66461();

            /* renamed from: b */
            public final ByteString f64863b;

            /* renamed from: c */
            public int f64864c;

            /* renamed from: d */
            public int f64865d;

            /* renamed from: e */
            public Value f64866e;

            /* renamed from: f */
            public byte f64867f;

            /* renamed from: g */
            public int f64868g;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1 */
            public static class C66461 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: a */
                public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite, null);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* renamed from: c */
                public int f64869c;

                /* renamed from: d */
                public int f64870d;

                /* renamed from: e */
                public Value f64871e = Value.f64872q;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: A */
                public MessageLite mo32962A() {
                    Argument m32968k = m32968k();
                    if (m32968k.mo32959e()) {
                        return m32968k;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: b0 */
                public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m32971n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: h */
                public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m32971n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: j */
                public /* bridge */ /* synthetic */ Builder mo32967j(Argument argument) {
                    m32970m(argument);
                    return this;
                }

                /* renamed from: k */
                public Argument m32968k() {
                    Argument argument = new Argument(this, null);
                    int i2 = this.f64869c;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    argument.f64865d = this.f64870d;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    argument.f64866e = this.f64871e;
                    argument.f64864c = i3;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder mo32986k() {
                    Builder builder = new Builder();
                    builder.m32970m(m32968k());
                    return builder;
                }

                /* renamed from: m */
                public Builder m32970m(Argument argument) {
                    Value value;
                    if (argument == Argument.f64861h) {
                        return this;
                    }
                    int i2 = argument.f64864c;
                    if ((i2 & 1) == 1) {
                        int i3 = argument.f64865d;
                        this.f64869c |= 1;
                        this.f64870d = i3;
                    }
                    if ((i2 & 2) == 2) {
                        Value value2 = argument.f64866e;
                        if ((this.f64869c & 2) != 2 || (value = this.f64871e) == Value.f64872q) {
                            this.f64871e = value2;
                        } else {
                            Value.Builder builder = new Value.Builder();
                            builder.m32975m(value);
                            builder.m32975m(value2);
                            this.f64871e = builder.m32973k();
                        }
                        this.f64869c |= 2;
                    }
                    this.f65656b = this.f65656b.m33231b(argument.f64863b);
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
                /* renamed from: n */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder m32971n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.f64862i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.C66461) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        if (r3 == 0) goto L10
                        r2.m32970m(r3)
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
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r4     // Catch: java.lang.Throwable -> L13
                        throw r3     // Catch: java.lang.Throwable -> L1a
                    L1a:
                        r3 = move-exception
                        r0 = r4
                    L1c:
                        if (r0 == 0) goto L21
                        r2.m32970m(r0)
                    L21:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.m32971n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                f64861h = argument;
                argument.f64865d = 0;
                argument.f64866e = Value.f64872q;
            }

            public Argument(GeneratedMessageLite.Builder builder, C66441 c66441) {
                super(builder);
                this.f64867f = (byte) -1;
                this.f64868g = -1;
                this.f64863b = builder.f65656b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: b */
            public MessageLite.Builder mo32956b() {
                Builder builder = new Builder();
                builder.m32970m(this);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: c */
            public int mo32957c() {
                int i2 = this.f64868g;
                if (i2 != -1) {
                    return i2;
                }
                int m33263c = (this.f64864c & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f64865d) : 0;
                if ((this.f64864c & 2) == 2) {
                    m33263c += CodedOutputStream.m33265e(2, this.f64866e);
                }
                int size = this.f64863b.size() + m33263c;
                this.f64868g = size;
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
                byte b = this.f64867f;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                int i2 = this.f64864c;
                if (!((i2 & 1) == 1)) {
                    this.f64867f = (byte) 0;
                    return false;
                }
                if (!((i2 & 2) == 2)) {
                    this.f64867f = (byte) 0;
                    return false;
                }
                if (this.f64866e.mo32959e()) {
                    this.f64867f = (byte) 1;
                    return true;
                }
                this.f64867f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: f */
            public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
                mo32957c();
                if ((this.f64864c & 1) == 1) {
                    codedOutputStream.m33279q(1, this.f64865d);
                }
                if ((this.f64864c & 2) == 2) {
                    codedOutputStream.m33281s(2, this.f64866e);
                }
                codedOutputStream.m33284v(this.f64863b);
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {

                /* renamed from: q */
                public static final Value f64872q;

                /* renamed from: r */
                public static Parser<Value> f64873r = new C66471();

                /* renamed from: b */
                public final ByteString f64874b;

                /* renamed from: c */
                public int f64875c;

                /* renamed from: d */
                public Type f64876d;

                /* renamed from: e */
                public long f64877e;

                /* renamed from: f */
                public float f64878f;

                /* renamed from: g */
                public double f64879g;

                /* renamed from: h */
                public int f64880h;

                /* renamed from: i */
                public int f64881i;

                /* renamed from: j */
                public int f64882j;

                /* renamed from: k */
                public Annotation f64883k;

                /* renamed from: l */
                public List<Value> f64884l;

                /* renamed from: m */
                public int f64885m;

                /* renamed from: n */
                public int f64886n;

                /* renamed from: o */
                public byte f64887o;

                /* renamed from: p */
                public int f64888p;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1 */
                public static class C66471 extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* renamed from: a */
                    public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite, null);
                    }
                }

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* renamed from: c */
                    public int f64889c;

                    /* renamed from: e */
                    public long f64891e;

                    /* renamed from: f */
                    public float f64892f;

                    /* renamed from: g */
                    public double f64893g;

                    /* renamed from: h */
                    public int f64894h;

                    /* renamed from: i */
                    public int f64895i;

                    /* renamed from: j */
                    public int f64896j;

                    /* renamed from: m */
                    public int f64899m;

                    /* renamed from: n */
                    public int f64900n;

                    /* renamed from: d */
                    public Type f64890d = Type.BYTE;

                    /* renamed from: k */
                    public Annotation f64897k = Annotation.f64853h;

                    /* renamed from: l */
                    public List<Value> f64898l = Collections.emptyList();

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* renamed from: A */
                    public MessageLite mo32962A() {
                        Value m32973k = m32973k();
                        if (m32973k.mo32959e()) {
                            return m32973k;
                        }
                        throw new UninitializedMessageException();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* renamed from: b0 */
                    public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        m32976n(codedInputStream, extensionRegistryLite);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* renamed from: h */
                    public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        m32976n(codedInputStream, extensionRegistryLite);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* renamed from: j */
                    public /* bridge */ /* synthetic */ Builder mo32967j(Value value) {
                        m32975m(value);
                        return this;
                    }

                    /* renamed from: k */
                    public Value m32973k() {
                        Value value = new Value(this, null);
                        int i2 = this.f64889c;
                        int i3 = (i2 & 1) != 1 ? 0 : 1;
                        value.f64876d = this.f64890d;
                        if ((i2 & 2) == 2) {
                            i3 |= 2;
                        }
                        value.f64877e = this.f64891e;
                        if ((i2 & 4) == 4) {
                            i3 |= 4;
                        }
                        value.f64878f = this.f64892f;
                        if ((i2 & 8) == 8) {
                            i3 |= 8;
                        }
                        value.f64879g = this.f64893g;
                        if ((i2 & 16) == 16) {
                            i3 |= 16;
                        }
                        value.f64880h = this.f64894h;
                        if ((i2 & 32) == 32) {
                            i3 |= 32;
                        }
                        value.f64881i = this.f64895i;
                        if ((i2 & 64) == 64) {
                            i3 |= 64;
                        }
                        value.f64882j = this.f64896j;
                        if ((i2 & 128) == 128) {
                            i3 |= 128;
                        }
                        value.f64883k = this.f64897k;
                        if ((i2 & 256) == 256) {
                            this.f64898l = Collections.unmodifiableList(this.f64898l);
                            this.f64889c &= -257;
                        }
                        value.f64884l = this.f64898l;
                        if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                            i3 |= 256;
                        }
                        value.f64885m = this.f64899m;
                        if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                            i3 |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                        }
                        value.f64886n = this.f64900n;
                        value.f64875c = i3;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public Builder mo32986k() {
                        Builder builder = new Builder();
                        builder.m32975m(m32973k());
                        return builder;
                    }

                    /* renamed from: m */
                    public Builder m32975m(Value value) {
                        Annotation annotation;
                        if (value == Value.f64872q) {
                            return this;
                        }
                        if ((value.f64875c & 1) == 1) {
                            Type type = value.f64876d;
                            Objects.requireNonNull(type);
                            this.f64889c |= 1;
                            this.f64890d = type;
                        }
                        int i2 = value.f64875c;
                        if ((i2 & 2) == 2) {
                            long j2 = value.f64877e;
                            this.f64889c |= 2;
                            this.f64891e = j2;
                        }
                        if ((i2 & 4) == 4) {
                            float f2 = value.f64878f;
                            this.f64889c = 4 | this.f64889c;
                            this.f64892f = f2;
                        }
                        if ((i2 & 8) == 8) {
                            double d = value.f64879g;
                            this.f64889c |= 8;
                            this.f64893g = d;
                        }
                        if ((i2 & 16) == 16) {
                            int i3 = value.f64880h;
                            this.f64889c = 16 | this.f64889c;
                            this.f64894h = i3;
                        }
                        if ((i2 & 32) == 32) {
                            int i4 = value.f64881i;
                            this.f64889c = 32 | this.f64889c;
                            this.f64895i = i4;
                        }
                        if ((i2 & 64) == 64) {
                            int i5 = value.f64882j;
                            this.f64889c = 64 | this.f64889c;
                            this.f64896j = i5;
                        }
                        if ((i2 & 128) == 128) {
                            Annotation annotation2 = value.f64883k;
                            if ((this.f64889c & 128) != 128 || (annotation = this.f64897k) == Annotation.f64853h) {
                                this.f64897k = annotation2;
                            } else {
                                Builder builder = new Builder();
                                builder.m32982m(annotation);
                                builder.m32982m(annotation2);
                                this.f64897k = builder.m32980k();
                            }
                            this.f64889c |= 128;
                        }
                        if (!value.f64884l.isEmpty()) {
                            if (this.f64898l.isEmpty()) {
                                this.f64898l = value.f64884l;
                                this.f64889c &= -257;
                            } else {
                                if ((this.f64889c & 256) != 256) {
                                    this.f64898l = new ArrayList(this.f64898l);
                                    this.f64889c |= 256;
                                }
                                this.f64898l.addAll(value.f64884l);
                            }
                        }
                        int i6 = value.f64875c;
                        if ((i6 & 256) == 256) {
                            int i7 = value.f64885m;
                            this.f64889c |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                            this.f64899m = i7;
                        }
                        if ((i6 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                            int i8 = value.f64886n;
                            this.f64889c |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                            this.f64900n = i8;
                        }
                        this.f65656b = this.f65656b.m33231b(value.f64874b);
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
                    /* renamed from: n */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder m32976n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.f64873r     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.C66471) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                            java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                            if (r3 == 0) goto L10
                            r2.m32975m(r3)
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
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> L13
                            throw r3     // Catch: java.lang.Throwable -> L1a
                        L1a:
                            r3 = move-exception
                            r0 = r4
                        L1c:
                            if (r0 == 0) goto L21
                            r2.m32975m(r0)
                        L21:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.m32976n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);


                    /* renamed from: b */
                    public final int f64915b;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$1 */
                    public static class C66481 implements Internal.EnumLiteMap<Type> {
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        /* renamed from: a */
                        public Type mo32979a(int i2) {
                            return Type.m32977a(i2);
                        }
                    }

                    Type(int i2) {
                        this.f64915b = i2;
                    }

                    /* renamed from: a */
                    public static Type m32977a(int i2) {
                        switch (i2) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    /* renamed from: x */
                    public final int mo32978x() {
                        return this.f64915b;
                    }
                }

                static {
                    Value value = new Value();
                    f64872q = value;
                    value.m32972i();
                }

                public Value(GeneratedMessageLite.Builder builder, C66441 c66441) {
                    super(builder);
                    this.f64887o = (byte) -1;
                    this.f64888p = -1;
                    this.f64874b = builder.f65656b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                /* renamed from: b */
                public MessageLite.Builder mo32956b() {
                    Builder builder = new Builder();
                    builder.m32975m(this);
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                /* renamed from: c */
                public int mo32957c() {
                    int i2 = this.f64888p;
                    if (i2 != -1) {
                        return i2;
                    }
                    int m33262b = (this.f64875c & 1) == 1 ? CodedOutputStream.m33262b(1, this.f64876d.f64915b) + 0 : 0;
                    if ((this.f64875c & 2) == 2) {
                        long j2 = this.f64877e;
                        m33262b += CodedOutputStream.m33268h((j2 >> 63) ^ (j2 << 1)) + CodedOutputStream.m33269i(2);
                    }
                    if ((this.f64875c & 4) == 4) {
                        m33262b += CodedOutputStream.m33269i(3) + 4;
                    }
                    if ((this.f64875c & 8) == 8) {
                        m33262b += CodedOutputStream.m33269i(4) + 8;
                    }
                    if ((this.f64875c & 16) == 16) {
                        m33262b += CodedOutputStream.m33263c(5, this.f64880h);
                    }
                    if ((this.f64875c & 32) == 32) {
                        m33262b += CodedOutputStream.m33263c(6, this.f64881i);
                    }
                    if ((this.f64875c & 64) == 64) {
                        m33262b += CodedOutputStream.m33263c(7, this.f64882j);
                    }
                    if ((this.f64875c & 128) == 128) {
                        m33262b += CodedOutputStream.m33265e(8, this.f64883k);
                    }
                    for (int i3 = 0; i3 < this.f64884l.size(); i3++) {
                        m33262b += CodedOutputStream.m33265e(9, this.f64884l.get(i3));
                    }
                    if ((this.f64875c & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                        m33262b += CodedOutputStream.m33263c(10, this.f64886n);
                    }
                    if ((this.f64875c & 256) == 256) {
                        m33262b += CodedOutputStream.m33263c(11, this.f64885m);
                    }
                    int size = this.f64874b.size() + m33262b;
                    this.f64888p = size;
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
                    byte b = this.f64887o;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (((this.f64875c & 128) == 128) && !this.f64883k.mo32959e()) {
                        this.f64887o = (byte) 0;
                        return false;
                    }
                    for (int i2 = 0; i2 < this.f64884l.size(); i2++) {
                        if (!this.f64884l.get(i2).mo32959e()) {
                            this.f64887o = (byte) 0;
                            return false;
                        }
                    }
                    this.f64887o = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                /* renamed from: f */
                public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
                    mo32957c();
                    if ((this.f64875c & 1) == 1) {
                        codedOutputStream.m33277o(1, this.f64876d.f64915b);
                    }
                    if ((this.f64875c & 2) == 2) {
                        long j2 = this.f64877e;
                        codedOutputStream.m33288z(16);
                        codedOutputStream.m33271A((j2 << 1) ^ (j2 >> 63));
                    }
                    if ((this.f64875c & 4) == 4) {
                        float f2 = this.f64878f;
                        codedOutputStream.m33288z(29);
                        codedOutputStream.m33286x(Float.floatToRawIntBits(f2));
                    }
                    if ((this.f64875c & 8) == 8) {
                        double d = this.f64879g;
                        codedOutputStream.m33288z(33);
                        codedOutputStream.m33287y(Double.doubleToRawLongBits(d));
                    }
                    if ((this.f64875c & 16) == 16) {
                        codedOutputStream.m33279q(5, this.f64880h);
                    }
                    if ((this.f64875c & 32) == 32) {
                        codedOutputStream.m33279q(6, this.f64881i);
                    }
                    if ((this.f64875c & 64) == 64) {
                        codedOutputStream.m33279q(7, this.f64882j);
                    }
                    if ((this.f64875c & 128) == 128) {
                        codedOutputStream.m33281s(8, this.f64883k);
                    }
                    for (int i2 = 0; i2 < this.f64884l.size(); i2++) {
                        codedOutputStream.m33281s(9, this.f64884l.get(i2));
                    }
                    if ((this.f64875c & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                        codedOutputStream.m33279q(10, this.f64886n);
                    }
                    if ((this.f64875c & 256) == 256) {
                        codedOutputStream.m33279q(11, this.f64885m);
                    }
                    codedOutputStream.m33284v(this.f64874b);
                }

                /* renamed from: i */
                public final void m32972i() {
                    this.f64876d = Type.BYTE;
                    this.f64877e = 0L;
                    this.f64878f = 0.0f;
                    this.f64879g = 0.0d;
                    this.f64880h = 0;
                    this.f64881i = 0;
                    this.f64882j = 0;
                    this.f64883k = Annotation.f64853h;
                    this.f64884l = Collections.emptyList();
                    this.f64885m = 0;
                    this.f64886n = 0;
                }

                public Value() {
                    this.f64887o = (byte) -1;
                    this.f64888p = -1;
                    this.f64874b = ByteString.f65623b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
                    this.f64887o = (byte) -1;
                    this.f64888p = -1;
                    m32972i();
                    ByteString.Output m33226x = ByteString.m33226x();
                    CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        try {
                            try {
                                int m33255o = codedInputStream.m33255o();
                                switch (m33255o) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        int m33252l = codedInputStream.m33252l();
                                        Type m32977a = Type.m32977a(m33252l);
                                        if (m32977a == null) {
                                            m33270k.m33288z(m33255o);
                                            m33270k.m33288z(m33252l);
                                        } else {
                                            this.f64875c |= 1;
                                            this.f64876d = m32977a;
                                        }
                                    case 16:
                                        this.f64875c |= 2;
                                        long m33253m = codedInputStream.m33253m();
                                        this.f64877e = (-(m33253m & 1)) ^ (m33253m >>> 1);
                                    case 29:
                                        this.f64875c |= 4;
                                        this.f64878f = Float.intBitsToFloat(codedInputStream.m33250j());
                                    case 33:
                                        this.f64875c |= 8;
                                        this.f64879g = Double.longBitsToDouble(codedInputStream.m33251k());
                                    case 40:
                                        this.f64875c |= 16;
                                        this.f64880h = codedInputStream.m33252l();
                                    case 48:
                                        this.f64875c |= 32;
                                        this.f64881i = codedInputStream.m33252l();
                                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                                        this.f64875c |= 64;
                                        this.f64882j = codedInputStream.m33252l();
                                    case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        Builder builder = null;
                                        if ((this.f64875c & 128) == 128) {
                                            Annotation annotation = this.f64883k;
                                            Objects.requireNonNull(annotation);
                                            Builder builder2 = new Builder();
                                            builder2.m32982m(annotation);
                                            builder = builder2;
                                        }
                                        Annotation annotation2 = (Annotation) codedInputStream.m33248h(Annotation.f64854i, extensionRegistryLite);
                                        this.f64883k = annotation2;
                                        if (builder != null) {
                                            builder.m32982m(annotation2);
                                            this.f64883k = builder.m32980k();
                                        }
                                        this.f64875c |= 128;
                                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                        if ((i2 & 256) != 256) {
                                            this.f64884l = new ArrayList();
                                            i2 |= 256;
                                        }
                                        this.f64884l.add(codedInputStream.m33248h(f64873r, extensionRegistryLite));
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        this.f64875c |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                                        this.f64886n = codedInputStream.m33252l();
                                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        this.f64875c |= 256;
                                        this.f64885m = codedInputStream.m33252l();
                                    default:
                                        if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                            z = true;
                                        }
                                }
                            } catch (Throwable th) {
                                if ((i2 & 256) == 256) {
                                    this.f64884l = Collections.unmodifiableList(this.f64884l);
                                }
                                try {
                                    m33270k.m33273j();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    this.f64874b = m33226x.m33240c();
                                    throw th2;
                                }
                                this.f64874b = m33226x.m33240c();
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
                    if ((i2 & 256) == 256) {
                        this.f64884l = Collections.unmodifiableList(this.f64884l);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f64874b = m33226x.m33240c();
                        throw th3;
                    }
                    this.f64874b = m33226x.m33240c();
                }
            }

            public Argument() {
                this.f64867f = (byte) -1;
                this.f64868g = -1;
                this.f64863b = ByteString.f65623b;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
                this.f64867f = (byte) -1;
                this.f64868g = -1;
                boolean z = false;
                this.f64865d = 0;
                this.f64866e = Value.f64872q;
                ByteString.Output m33226x = ByteString.m33226x();
                CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
                while (!z) {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o == 8) {
                                    this.f64864c |= 1;
                                    this.f64865d = codedInputStream.m33252l();
                                } else if (m33255o != 18) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    Value.Builder builder = null;
                                    if ((this.f64864c & 2) == 2) {
                                        Value value = this.f64866e;
                                        Objects.requireNonNull(value);
                                        Value.Builder builder2 = new Value.Builder();
                                        builder2.m32975m(value);
                                        builder = builder2;
                                    }
                                    Value value2 = (Value) codedInputStream.m33248h(Value.f64873r, extensionRegistryLite);
                                    this.f64866e = value2;
                                    if (builder != null) {
                                        builder.m32975m(value2);
                                        this.f64866e = builder.m32973k();
                                    }
                                    this.f64864c |= 2;
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            try {
                                m33270k.m33273j();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f64863b = m33226x.m33240c();
                                throw th2;
                            }
                            this.f64863b = m33226x.m33240c();
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
                try {
                    m33270k.m33273j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f64863b = m33226x.m33240c();
                    throw th3;
                }
                this.f64863b = m33226x.m33240c();
            }
        }

        public Annotation() {
            this.f64859f = (byte) -1;
            this.f64860g = -1;
            this.f64855b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f64859f = (byte) -1;
            this.f64860g = -1;
            boolean z = false;
            this.f64857d = 0;
            this.f64858e = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o == 8) {
                                    this.f64856c |= 1;
                                    this.f64857d = codedInputStream.m33252l();
                                } else if (m33255o != 18) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    if ((i2 & 2) != 2) {
                                        this.f64858e = new ArrayList();
                                        i2 |= 2;
                                    }
                                    this.f64858e.add(codedInputStream.m33248h(Argument.f64862i, extensionRegistryLite));
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
                    if ((i2 & 2) == 2) {
                        this.f64858e = Collections.unmodifiableList(this.f64858e);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f64855b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f64855b = m33226x.m33240c();
                    throw th;
                }
            }
            if ((i2 & 2) == 2) {
                this.f64858e = Collections.unmodifiableList(this.f64858e);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f64855b = m33226x.m33240c();
                throw th3;
            }
            this.f64855b = m33226x.m33240c();
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {

        /* renamed from: f */
        public static final QualifiedNameTable f65157f;

        /* renamed from: g */
        public static Parser<QualifiedNameTable> f65158g = new C66651();

        /* renamed from: b */
        public final ByteString f65159b;

        /* renamed from: c */
        public List<QualifiedName> f65160c;

        /* renamed from: d */
        public byte f65161d;

        /* renamed from: e */
        public int f65162e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1 */
        public static class C66651 extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* renamed from: c */
            public int f65163c;

            /* renamed from: d */
            public List<QualifiedName> f65164d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                QualifiedNameTable m33041k = m33041k();
                if (m33041k.mo32959e()) {
                    return m33041k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33044n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33044n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(QualifiedNameTable qualifiedNameTable) {
                m33043m(qualifiedNameTable);
                return this;
            }

            /* renamed from: k */
            public QualifiedNameTable m33041k() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this, null);
                if ((this.f65163c & 1) == 1) {
                    this.f65164d = Collections.unmodifiableList(this.f65164d);
                    this.f65163c &= -2;
                }
                qualifiedNameTable.f65160c = this.f65164d;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33043m(m33041k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33043m(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.f65157f) {
                    return this;
                }
                if (!qualifiedNameTable.f65160c.isEmpty()) {
                    if (this.f65164d.isEmpty()) {
                        this.f65164d = qualifiedNameTable.f65160c;
                        this.f65163c &= -2;
                    } else {
                        if ((this.f65163c & 1) != 1) {
                            this.f65164d = new ArrayList(this.f65164d);
                            this.f65163c |= 1;
                        }
                        this.f65164d.addAll(qualifiedNameTable.f65160c);
                    }
                }
                this.f65656b = this.f65656b.m33231b(qualifiedNameTable.f65159b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder m33044n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.f65158g     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.C66651) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33043m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33043m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.m33044n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$Builder");
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            f65157f = qualifiedNameTable;
            qualifiedNameTable.f65160c = Collections.emptyList();
        }

        public QualifiedNameTable(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f65161d = (byte) -1;
            this.f65162e = -1;
            this.f65159b = builder.f65656b;
        }

        /* renamed from: i */
        public static Builder m33040i(QualifiedNameTable qualifiedNameTable) {
            Builder builder = new Builder();
            builder.m33043m(qualifiedNameTable);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            return m33040i(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65162e;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65160c.size(); i4++) {
                i3 += CodedOutputStream.m33265e(1, this.f65160c.get(i4));
            }
            int size = this.f65159b.size() + i3;
            this.f65162e = size;
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
            byte b = this.f65161d;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f65160c.size(); i2++) {
                if (!this.f65160c.get(i2).mo32959e()) {
                    this.f65161d = (byte) 0;
                    return false;
                }
            }
            this.f65161d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f65160c.size(); i2++) {
                codedOutputStream.m33281s(1, this.f65160c.get(i2));
            }
            codedOutputStream.m33284v(this.f65159b);
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {

            /* renamed from: i */
            public static final QualifiedName f65165i;

            /* renamed from: j */
            public static Parser<QualifiedName> f65166j = new C66661();

            /* renamed from: b */
            public final ByteString f65167b;

            /* renamed from: c */
            public int f65168c;

            /* renamed from: d */
            public int f65169d;

            /* renamed from: e */
            public int f65170e;

            /* renamed from: f */
            public Kind f65171f;

            /* renamed from: g */
            public byte f65172g;

            /* renamed from: h */
            public int f65173h;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1 */
            public static class C66661 extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: a */
                public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite, null);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* renamed from: c */
                public int f65174c;

                /* renamed from: e */
                public int f65176e;

                /* renamed from: d */
                public int f65175d = -1;

                /* renamed from: f */
                public Kind f65177f = Kind.PACKAGE;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: A */
                public MessageLite mo32962A() {
                    QualifiedName m33045k = m33045k();
                    if (m33045k.mo32959e()) {
                        return m33045k;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: b0 */
                public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m33048n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: h */
                public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m33048n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: j */
                public /* bridge */ /* synthetic */ Builder mo32967j(QualifiedName qualifiedName) {
                    m33047m(qualifiedName);
                    return this;
                }

                /* renamed from: k */
                public QualifiedName m33045k() {
                    QualifiedName qualifiedName = new QualifiedName(this, null);
                    int i2 = this.f65174c;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    qualifiedName.f65169d = this.f65175d;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    qualifiedName.f65170e = this.f65176e;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    qualifiedName.f65171f = this.f65177f;
                    qualifiedName.f65168c = i3;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public Builder mo32986k() {
                    Builder builder = new Builder();
                    builder.m33047m(m33045k());
                    return builder;
                }

                /* renamed from: m */
                public Builder m33047m(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.f65165i) {
                        return this;
                    }
                    int i2 = qualifiedName.f65168c;
                    if ((i2 & 1) == 1) {
                        int i3 = qualifiedName.f65169d;
                        this.f65174c |= 1;
                        this.f65175d = i3;
                    }
                    if ((i2 & 2) == 2) {
                        int i4 = qualifiedName.f65170e;
                        this.f65174c = 2 | this.f65174c;
                        this.f65176e = i4;
                    }
                    if ((i2 & 4) == 4) {
                        Kind kind = qualifiedName.f65171f;
                        Objects.requireNonNull(kind);
                        this.f65174c = 4 | this.f65174c;
                        this.f65177f = kind;
                    }
                    this.f65656b = this.f65656b.m33231b(qualifiedName.f65167b);
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
                /* renamed from: n */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder m33048n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.f65166j     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.C66661) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        if (r3 == 0) goto L10
                        r2.m33047m(r3)
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
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r4     // Catch: java.lang.Throwable -> L13
                        throw r3     // Catch: java.lang.Throwable -> L1a
                    L1a:
                        r3 = move-exception
                        r0 = r4
                    L1c:
                        if (r0 == 0) goto L21
                        r2.m33047m(r0)
                    L21:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.m33048n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Builder");
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);


                /* renamed from: b */
                public final int f65182b;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$1 */
                public static class C66671 implements Internal.EnumLiteMap<Kind> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* renamed from: a */
                    public Kind mo32979a(int i2) {
                        return Kind.m33049a(i2);
                    }
                }

                Kind(int i2) {
                    this.f65182b = i2;
                }

                /* renamed from: a */
                public static Kind m33049a(int i2) {
                    if (i2 == 0) {
                        return CLASS;
                    }
                    if (i2 == 1) {
                        return PACKAGE;
                    }
                    if (i2 != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                /* renamed from: x */
                public final int mo32978x() {
                    return this.f65182b;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                f65165i = qualifiedName;
                qualifiedName.f65169d = -1;
                qualifiedName.f65170e = 0;
                qualifiedName.f65171f = Kind.PACKAGE;
            }

            public QualifiedName(GeneratedMessageLite.Builder builder, C66441 c66441) {
                super(builder);
                this.f65172g = (byte) -1;
                this.f65173h = -1;
                this.f65167b = builder.f65656b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: b */
            public MessageLite.Builder mo32956b() {
                Builder builder = new Builder();
                builder.m33047m(this);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: c */
            public int mo32957c() {
                int i2 = this.f65173h;
                if (i2 != -1) {
                    return i2;
                }
                int m33263c = (this.f65168c & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f65169d) : 0;
                if ((this.f65168c & 2) == 2) {
                    m33263c += CodedOutputStream.m33263c(2, this.f65170e);
                }
                if ((this.f65168c & 4) == 4) {
                    m33263c += CodedOutputStream.m33262b(3, this.f65171f.f65182b);
                }
                int size = this.f65167b.size() + m33263c;
                this.f65173h = size;
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
                byte b = this.f65172g;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if ((this.f65168c & 2) == 2) {
                    this.f65172g = (byte) 1;
                    return true;
                }
                this.f65172g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: f */
            public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
                mo32957c();
                if ((this.f65168c & 1) == 1) {
                    codedOutputStream.m33279q(1, this.f65169d);
                }
                if ((this.f65168c & 2) == 2) {
                    codedOutputStream.m33279q(2, this.f65170e);
                }
                if ((this.f65168c & 4) == 4) {
                    codedOutputStream.m33277o(3, this.f65171f.f65182b);
                }
                codedOutputStream.m33284v(this.f65167b);
            }

            public QualifiedName() {
                this.f65172g = (byte) -1;
                this.f65173h = -1;
                this.f65167b = ByteString.f65623b;
            }

            public QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
                this.f65172g = (byte) -1;
                this.f65173h = -1;
                this.f65169d = -1;
                boolean z = false;
                this.f65170e = 0;
                this.f65171f = Kind.PACKAGE;
                ByteString.Output m33226x = ByteString.m33226x();
                CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int m33255o = codedInputStream.m33255o();
                                if (m33255o != 0) {
                                    if (m33255o == 8) {
                                        this.f65168c |= 1;
                                        this.f65169d = codedInputStream.m33252l();
                                    } else if (m33255o == 16) {
                                        this.f65168c |= 2;
                                        this.f65170e = codedInputStream.m33252l();
                                    } else if (m33255o != 24) {
                                        if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                        }
                                    } else {
                                        int m33252l = codedInputStream.m33252l();
                                        Kind m33049a = Kind.m33049a(m33252l);
                                        if (m33049a == null) {
                                            m33270k.m33288z(m33255o);
                                            m33270k.m33288z(m33252l);
                                        } else {
                                            this.f65168c |= 4;
                                            this.f65171f = m33049a;
                                        }
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
                            this.f65167b = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65167b = m33226x.m33240c();
                        throw th;
                    }
                }
                try {
                    m33270k.m33273j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f65167b = m33226x.m33240c();
                    throw th3;
                }
                this.f65167b = m33226x.m33240c();
            }
        }

        public QualifiedNameTable() {
            this.f65161d = (byte) -1;
            this.f65162e = -1;
            this.f65159b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65161d = (byte) -1;
            this.f65162e = -1;
            this.f65160c = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o != 10) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f65160c = new ArrayList();
                                    z2 |= true;
                                }
                                this.f65160c.add(codedInputStream.m33248h(QualifiedName.f65166j, extensionRegistryLite));
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
                    if (z2 & true) {
                        this.f65160c = Collections.unmodifiableList(this.f65160c);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65159b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65159b = m33226x.m33240c();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f65160c = Collections.unmodifiableList(this.f65160c);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65159b = m33226x.m33240c();
                throw th3;
            }
            this.f65159b = m33226x.m33240c();
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {

        /* renamed from: u */
        public static final Type f65191u;

        /* renamed from: v */
        public static Parser<Type> f65192v = new C66691();

        /* renamed from: c */
        public final ByteString f65193c;

        /* renamed from: d */
        public int f65194d;

        /* renamed from: e */
        public List<Argument> f65195e;

        /* renamed from: f */
        public boolean f65196f;

        /* renamed from: g */
        public int f65197g;

        /* renamed from: h */
        public Type f65198h;

        /* renamed from: i */
        public int f65199i;

        /* renamed from: j */
        public int f65200j;

        /* renamed from: k */
        public int f65201k;

        /* renamed from: l */
        public int f65202l;

        /* renamed from: m */
        public int f65203m;

        /* renamed from: n */
        public Type f65204n;

        /* renamed from: o */
        public int f65205o;

        /* renamed from: p */
        public Type f65206p;

        /* renamed from: q */
        public int f65207q;

        /* renamed from: r */
        public int f65208r;

        /* renamed from: s */
        public byte f65209s;

        /* renamed from: t */
        public int f65210t;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1 */
        public static class C66691 extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite, null);
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* renamed from: e */
            public int f65230e;

            /* renamed from: f */
            public List<Argument> f65231f = Collections.emptyList();

            /* renamed from: g */
            public boolean f65232g;

            /* renamed from: h */
            public int f65233h;

            /* renamed from: i */
            public Type f65234i;

            /* renamed from: j */
            public int f65235j;

            /* renamed from: k */
            public int f65236k;

            /* renamed from: l */
            public int f65237l;

            /* renamed from: m */
            public int f65238m;

            /* renamed from: n */
            public int f65239n;

            /* renamed from: o */
            public Type f65240o;

            /* renamed from: p */
            public int f65241p;

            /* renamed from: q */
            public Type f65242q;

            /* renamed from: r */
            public int f65243r;

            /* renamed from: s */
            public int f65244s;

            public Builder() {
                Type type = Type.f65191u;
                this.f65234i = type;
                this.f65240o = type;
                this.f65242q = type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Type m33069m = m33069m();
                if (m33069m.mo32959e()) {
                    return m33069m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33072p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33072p(codedInputStream, extensionRegistryLite);
                return this;
            }

            /* renamed from: m */
            public Type m33069m() {
                Type type = new Type(this, null);
                int i2 = this.f65230e;
                if ((i2 & 1) == 1) {
                    this.f65231f = Collections.unmodifiableList(this.f65231f);
                    this.f65230e &= -2;
                }
                type.f65195e = this.f65231f;
                int i3 = (i2 & 2) != 2 ? 0 : 1;
                type.f65196f = this.f65232g;
                if ((i2 & 4) == 4) {
                    i3 |= 2;
                }
                type.f65197g = this.f65233h;
                if ((i2 & 8) == 8) {
                    i3 |= 4;
                }
                type.f65198h = this.f65234i;
                if ((i2 & 16) == 16) {
                    i3 |= 8;
                }
                type.f65199i = this.f65235j;
                if ((i2 & 32) == 32) {
                    i3 |= 16;
                }
                type.f65200j = this.f65236k;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                type.f65201k = this.f65237l;
                if ((i2 & 128) == 128) {
                    i3 |= 64;
                }
                type.f65202l = this.f65238m;
                if ((i2 & 256) == 256) {
                    i3 |= 128;
                }
                type.f65203m = this.f65239n;
                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    i3 |= 256;
                }
                type.f65204n = this.f65240o;
                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                    i3 |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                }
                type.f65205o = this.f65241p;
                if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                    i3 |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                }
                type.f65206p = this.f65242q;
                if ((i2 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    i3 |= RecyclerView.ViewHolder.FLAG_MOVED;
                }
                type.f65207q = this.f65243r;
                if ((i2 & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == 8192) {
                    i3 |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                type.f65208r = this.f65244s;
                type.f65194d = i3;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.mo32967j(m33069m());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public Builder mo32967j(Type type) {
                Type type2;
                Type type3;
                Type type4;
                Type type5 = Type.f65191u;
                if (type == type5) {
                    return this;
                }
                if (!type.f65195e.isEmpty()) {
                    if (this.f65231f.isEmpty()) {
                        this.f65231f = type.f65195e;
                        this.f65230e &= -2;
                    } else {
                        if ((this.f65230e & 1) != 1) {
                            this.f65231f = new ArrayList(this.f65231f);
                            this.f65230e |= 1;
                        }
                        this.f65231f.addAll(type.f65195e);
                    }
                }
                int i2 = type.f65194d;
                if ((i2 & 1) == 1) {
                    boolean z = type.f65196f;
                    this.f65230e |= 2;
                    this.f65232g = z;
                }
                if ((i2 & 2) == 2) {
                    int i3 = type.f65197g;
                    this.f65230e |= 4;
                    this.f65233h = i3;
                }
                if (type.m33058u()) {
                    Type type6 = type.f65198h;
                    if ((this.f65230e & 8) != 8 || (type4 = this.f65234i) == type5) {
                        this.f65234i = type6;
                    } else {
                        this.f65234i = C3033a.m17747i(type4, type6);
                    }
                    this.f65230e |= 8;
                }
                if ((type.f65194d & 8) == 8) {
                    int i4 = type.f65199i;
                    this.f65230e |= 16;
                    this.f65235j = i4;
                }
                if (type.m33057t()) {
                    int i5 = type.f65200j;
                    this.f65230e |= 32;
                    this.f65236k = i5;
                }
                int i6 = type.f65194d;
                if ((i6 & 32) == 32) {
                    int i7 = type.f65201k;
                    this.f65230e |= 64;
                    this.f65237l = i7;
                }
                if ((i6 & 64) == 64) {
                    int i8 = type.f65202l;
                    this.f65230e |= 128;
                    this.f65238m = i8;
                }
                if (type.m33060w()) {
                    int i9 = type.f65203m;
                    this.f65230e |= 256;
                    this.f65239n = i9;
                }
                if (type.m33059v()) {
                    Type type7 = type.f65204n;
                    if ((this.f65230e & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 512 || (type3 = this.f65240o) == type5) {
                        this.f65240o = type7;
                    } else {
                        this.f65240o = C3033a.m17747i(type3, type7);
                    }
                    this.f65230e |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                }
                if ((type.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    int i10 = type.f65205o;
                    this.f65230e |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                    this.f65241p = i10;
                }
                if (type.m33056s()) {
                    Type type8 = type.f65206p;
                    if ((this.f65230e & RecyclerView.ViewHolder.FLAG_MOVED) != 2048 || (type2 = this.f65242q) == type5) {
                        this.f65242q = type8;
                    } else {
                        this.f65242q = C3033a.m17747i(type2, type8);
                    }
                    this.f65230e |= RecyclerView.ViewHolder.FLAG_MOVED;
                }
                int i11 = type.f65194d;
                if ((i11 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                    int i12 = type.f65207q;
                    this.f65230e |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                    this.f65243r = i12;
                }
                if ((i11 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    int i13 = type.f65208r;
                    this.f65230e |= RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST;
                    this.f65244s = i13;
                }
                m33313l(type);
                this.f65656b = this.f65656b.m33231b(type.f65193c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder m33072p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.f65192v     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.C66691) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.mo32967j(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.mo32967j(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.m33072p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder");
            }
        }

        static {
            Type type = new Type();
            f65191u = type;
            type.m33061x();
        }

        public Type(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65209s = (byte) -1;
            this.f65210t = -1;
            this.f65193c = extendableBuilder.f65656b;
        }

        /* renamed from: y */
        public static Builder m33055y(Type type) {
            Builder builder = new Builder();
            builder.mo32967j(type);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65191u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65210t;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65194d & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? CodedOutputStream.m33263c(1, this.f65208r) + 0 : 0;
            for (int i3 = 0; i3 < this.f65195e.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(2, this.f65195e.get(i3));
            }
            if ((this.f65194d & 1) == 1) {
                m33263c += CodedOutputStream.m33269i(3) + 1;
            }
            if ((this.f65194d & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(4, this.f65197g);
            }
            if ((this.f65194d & 4) == 4) {
                m33263c += CodedOutputStream.m33265e(5, this.f65198h);
            }
            if ((this.f65194d & 16) == 16) {
                m33263c += CodedOutputStream.m33263c(6, this.f65200j);
            }
            if ((this.f65194d & 32) == 32) {
                m33263c += CodedOutputStream.m33263c(7, this.f65201k);
            }
            if ((this.f65194d & 8) == 8) {
                m33263c += CodedOutputStream.m33263c(8, this.f65199i);
            }
            if ((this.f65194d & 64) == 64) {
                m33263c += CodedOutputStream.m33263c(9, this.f65202l);
            }
            if ((this.f65194d & 256) == 256) {
                m33263c += CodedOutputStream.m33265e(10, this.f65204n);
            }
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                m33263c += CodedOutputStream.m33263c(11, this.f65205o);
            }
            if ((this.f65194d & 128) == 128) {
                m33263c += CodedOutputStream.m33263c(12, this.f65203m);
            }
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                m33263c += CodedOutputStream.m33265e(13, this.f65206p);
            }
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                m33263c += CodedOutputStream.m33263c(14, this.f65207q);
            }
            int size = this.f65193c.size() + m33315j() + m33263c;
            this.f65210t = size;
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
            byte b = this.f65209s;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f65195e.size(); i2++) {
                if (!this.f65195e.get(i2).mo32959e()) {
                    this.f65209s = (byte) 0;
                    return false;
                }
            }
            if (m33058u() && !this.f65198h.mo32959e()) {
                this.f65209s = (byte) 0;
                return false;
            }
            if (m33059v() && !this.f65204n.mo32959e()) {
                this.f65209s = (byte) 0;
                return false;
            }
            if (m33056s() && !this.f65206p.mo32959e()) {
                this.f65209s = (byte) 0;
                return false;
            }
            if (m33314i()) {
                this.f65209s = (byte) 1;
                return true;
            }
            this.f65209s = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                codedOutputStream.m33279q(1, this.f65208r);
            }
            for (int i2 = 0; i2 < this.f65195e.size(); i2++) {
                codedOutputStream.m33281s(2, this.f65195e.get(i2));
            }
            if ((this.f65194d & 1) == 1) {
                boolean z = this.f65196f;
                codedOutputStream.m33288z(24);
                codedOutputStream.m33283u(z ? 1 : 0);
            }
            if ((this.f65194d & 2) == 2) {
                codedOutputStream.m33279q(4, this.f65197g);
            }
            if ((this.f65194d & 4) == 4) {
                codedOutputStream.m33281s(5, this.f65198h);
            }
            if ((this.f65194d & 16) == 16) {
                codedOutputStream.m33279q(6, this.f65200j);
            }
            if ((this.f65194d & 32) == 32) {
                codedOutputStream.m33279q(7, this.f65201k);
            }
            if ((this.f65194d & 8) == 8) {
                codedOutputStream.m33279q(8, this.f65199i);
            }
            if ((this.f65194d & 64) == 64) {
                codedOutputStream.m33279q(9, this.f65202l);
            }
            if ((this.f65194d & 256) == 256) {
                codedOutputStream.m33281s(10, this.f65204n);
            }
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                codedOutputStream.m33279q(11, this.f65205o);
            }
            if ((this.f65194d & 128) == 128) {
                codedOutputStream.m33279q(12, this.f65203m);
            }
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                codedOutputStream.m33281s(13, this.f65206p);
            }
            if ((this.f65194d & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                codedOutputStream.m33279q(14, this.f65207q);
            }
            m33321p.m33324a(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, codedOutputStream);
            codedOutputStream.m33284v(this.f65193c);
        }

        /* renamed from: s */
        public boolean m33056s() {
            return (this.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024;
        }

        /* renamed from: t */
        public boolean m33057t() {
            return (this.f65194d & 16) == 16;
        }

        /* renamed from: u */
        public boolean m33058u() {
            return (this.f65194d & 4) == 4;
        }

        /* renamed from: v */
        public boolean m33059v() {
            return (this.f65194d & 256) == 256;
        }

        /* renamed from: w */
        public boolean m33060w() {
            return (this.f65194d & 128) == 128;
        }

        /* renamed from: x */
        public final void m33061x() {
            this.f65195e = Collections.emptyList();
            this.f65196f = false;
            this.f65197g = 0;
            Type type = f65191u;
            this.f65198h = type;
            this.f65199i = 0;
            this.f65200j = 0;
            this.f65201k = 0;
            this.f65202l = 0;
            this.f65203m = 0;
            this.f65204n = type;
            this.f65205o = 0;
            this.f65206p = type;
            this.f65207q = 0;
            this.f65208r = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public Builder mo32956b() {
            return m33055y(this);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* renamed from: i */
            public static final Argument f65211i;

            /* renamed from: j */
            public static Parser<Argument> f65212j = new C66701();

            /* renamed from: b */
            public final ByteString f65213b;

            /* renamed from: c */
            public int f65214c;

            /* renamed from: d */
            public Projection f65215d;

            /* renamed from: e */
            public Type f65216e;

            /* renamed from: f */
            public int f65217f;

            /* renamed from: g */
            public byte f65218g;

            /* renamed from: h */
            public int f65219h;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1 */
            public static class C66701 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: a */
                public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite, null);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* renamed from: c */
                public int f65220c;

                /* renamed from: d */
                public Projection f65221d = Projection.INV;

                /* renamed from: e */
                public Type f65222e = Type.f65191u;

                /* renamed from: f */
                public int f65223f;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: A */
                public MessageLite mo32962A() {
                    Argument m33064k = m33064k();
                    if (m33064k.mo32959e()) {
                        return m33064k;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: b0 */
                public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m33067n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: h */
                public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    m33067n(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: j */
                public /* bridge */ /* synthetic */ Builder mo32967j(Argument argument) {
                    m33066m(argument);
                    return this;
                }

                /* renamed from: k */
                public Argument m33064k() {
                    Argument argument = new Argument(this, null);
                    int i2 = this.f65220c;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    argument.f65215d = this.f65221d;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    argument.f65216e = this.f65222e;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    argument.f65217f = this.f65223f;
                    argument.f65214c = i3;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public Builder mo32986k() {
                    Builder builder = new Builder();
                    builder.m33066m(m33064k());
                    return builder;
                }

                /* renamed from: m */
                public Builder m33066m(Argument argument) {
                    Type type;
                    if (argument == Argument.f65211i) {
                        return this;
                    }
                    if ((argument.f65214c & 1) == 1) {
                        Projection projection = argument.f65215d;
                        Objects.requireNonNull(projection);
                        this.f65220c |= 1;
                        this.f65221d = projection;
                    }
                    if (argument.m33063i()) {
                        Type type2 = argument.f65216e;
                        if ((this.f65220c & 2) != 2 || (type = this.f65222e) == Type.f65191u) {
                            this.f65222e = type2;
                        } else {
                            this.f65222e = C3033a.m17747i(type, type2);
                        }
                        this.f65220c |= 2;
                    }
                    if ((argument.f65214c & 4) == 4) {
                        int i2 = argument.f65217f;
                        this.f65220c |= 4;
                        this.f65223f = i2;
                    }
                    this.f65656b = this.f65656b.m33231b(argument.f65213b);
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
                /* renamed from: n */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder m33067n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.f65212j     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.C66701) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                        if (r3 == 0) goto L10
                        r2.m33066m(r3)
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
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r4     // Catch: java.lang.Throwable -> L13
                        throw r3     // Catch: java.lang.Throwable -> L1a
                    L1a:
                        r3 = move-exception
                        r0 = r4
                    L1c:
                        if (r0 == 0) goto L21
                        r2.m33066m(r0)
                    L21:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.m33067n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Builder");
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);


                /* renamed from: b */
                public final int f65229b;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$1 */
                public static class C66711 implements Internal.EnumLiteMap<Projection> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* renamed from: a */
                    public Projection mo32979a(int i2) {
                        return Projection.m33068a(i2);
                    }
                }

                Projection(int i2) {
                    this.f65229b = i2;
                }

                /* renamed from: a */
                public static Projection m33068a(int i2) {
                    if (i2 == 0) {
                        return IN;
                    }
                    if (i2 == 1) {
                        return OUT;
                    }
                    if (i2 == 2) {
                        return INV;
                    }
                    if (i2 != 3) {
                        return null;
                    }
                    return STAR;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                /* renamed from: x */
                public final int mo32978x() {
                    return this.f65229b;
                }
            }

            static {
                Argument argument = new Argument();
                f65211i = argument;
                argument.f65215d = Projection.INV;
                argument.f65216e = Type.f65191u;
                argument.f65217f = 0;
            }

            public Argument(GeneratedMessageLite.Builder builder, C66441 c66441) {
                super(builder);
                this.f65218g = (byte) -1;
                this.f65219h = -1;
                this.f65213b = builder.f65656b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: b */
            public MessageLite.Builder mo32956b() {
                Builder builder = new Builder();
                builder.m33066m(this);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: c */
            public int mo32957c() {
                int i2 = this.f65219h;
                if (i2 != -1) {
                    return i2;
                }
                int m33262b = (this.f65214c & 1) == 1 ? 0 + CodedOutputStream.m33262b(1, this.f65215d.f65229b) : 0;
                if ((this.f65214c & 2) == 2) {
                    m33262b += CodedOutputStream.m33265e(2, this.f65216e);
                }
                if ((this.f65214c & 4) == 4) {
                    m33262b += CodedOutputStream.m33263c(3, this.f65217f);
                }
                int size = this.f65213b.size() + m33262b;
                this.f65219h = size;
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
                byte b = this.f65218g;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!m33063i() || this.f65216e.mo32959e()) {
                    this.f65218g = (byte) 1;
                    return true;
                }
                this.f65218g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: f */
            public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
                mo32957c();
                if ((this.f65214c & 1) == 1) {
                    codedOutputStream.m33277o(1, this.f65215d.f65229b);
                }
                if ((this.f65214c & 2) == 2) {
                    codedOutputStream.m33281s(2, this.f65216e);
                }
                if ((this.f65214c & 4) == 4) {
                    codedOutputStream.m33279q(3, this.f65217f);
                }
                codedOutputStream.m33284v(this.f65213b);
            }

            /* renamed from: i */
            public boolean m33063i() {
                return (this.f65214c & 2) == 2;
            }

            public Argument() {
                this.f65218g = (byte) -1;
                this.f65219h = -1;
                this.f65213b = ByteString.f65623b;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
                this.f65218g = (byte) -1;
                this.f65219h = -1;
                this.f65215d = Projection.INV;
                this.f65216e = Type.f65191u;
                boolean z = false;
                this.f65217f = 0;
                ByteString.Output m33226x = ByteString.m33226x();
                CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
                while (!z) {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o == 8) {
                                    int m33252l = codedInputStream.m33252l();
                                    Projection m33068a = Projection.m33068a(m33252l);
                                    if (m33068a == null) {
                                        m33270k.m33288z(m33255o);
                                        m33270k.m33288z(m33252l);
                                    } else {
                                        this.f65214c |= 1;
                                        this.f65215d = m33068a;
                                    }
                                } else if (m33255o == 18) {
                                    Builder builder = null;
                                    if ((this.f65214c & 2) == 2) {
                                        Type type = this.f65216e;
                                        Objects.requireNonNull(type);
                                        builder = Type.m33055y(type);
                                    }
                                    Type type2 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                    this.f65216e = type2;
                                    if (builder != null) {
                                        builder.mo32967j(type2);
                                        this.f65216e = builder.m33069m();
                                    }
                                    this.f65214c |= 2;
                                } else if (m33255o != 24) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    this.f65214c |= 4;
                                    this.f65217f = codedInputStream.m33252l();
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
                            this.f65213b = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65213b = m33226x.m33240c();
                        throw th;
                    }
                }
                try {
                    m33270k.m33273j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f65213b = m33226x.m33240c();
                    throw th3;
                }
                this.f65213b = m33226x.m33240c();
            }
        }

        public Type() {
            this.f65209s = (byte) -1;
            this.f65210t = -1;
            this.f65193c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65209s = (byte) -1;
            this.f65210t = -1;
            m33061x();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        Builder builder = null;
                        switch (m33255o) {
                            case 0:
                                z = true;
                            case 8:
                                this.f65194d |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                                this.f65208r = codedInputStream.m33252l();
                            case 18:
                                if (!(z2 & true)) {
                                    this.f65195e = new ArrayList();
                                    z2 |= true;
                                }
                                this.f65195e.add(codedInputStream.m33248h(Argument.f65212j, extensionRegistryLite));
                            case 24:
                                this.f65194d |= 1;
                                this.f65196f = codedInputStream.m33245e();
                            case 32:
                                this.f65194d |= 2;
                                this.f65197g = codedInputStream.m33252l();
                            case 42:
                                if ((this.f65194d & 4) == 4) {
                                    Type type = this.f65198h;
                                    Objects.requireNonNull(type);
                                    builder = m33055y(type);
                                }
                                Type type2 = (Type) codedInputStream.m33248h(f65192v, extensionRegistryLite);
                                this.f65198h = type2;
                                if (builder != null) {
                                    builder.mo32967j(type2);
                                    this.f65198h = builder.m33069m();
                                }
                                this.f65194d |= 4;
                            case 48:
                                this.f65194d |= 16;
                                this.f65200j = codedInputStream.m33252l();
                            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                                this.f65194d |= 32;
                                this.f65201k = codedInputStream.m33252l();
                            case 64:
                                this.f65194d |= 8;
                                this.f65199i = codedInputStream.m33252l();
                            case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                this.f65194d |= 64;
                                this.f65202l = codedInputStream.m33252l();
                            case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                if ((this.f65194d & 256) == 256) {
                                    Type type3 = this.f65204n;
                                    Objects.requireNonNull(type3);
                                    builder = m33055y(type3);
                                }
                                Type type4 = (Type) codedInputStream.m33248h(f65192v, extensionRegistryLite);
                                this.f65204n = type4;
                                if (builder != null) {
                                    builder.mo32967j(type4);
                                    this.f65204n = builder.m33069m();
                                }
                                this.f65194d |= 256;
                            case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                this.f65194d |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                                this.f65205o = codedInputStream.m33252l();
                            case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                this.f65194d |= 128;
                                this.f65203m = codedInputStream.m33252l();
                            case C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                if ((this.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                                    Type type5 = this.f65206p;
                                    Objects.requireNonNull(type5);
                                    builder = m33055y(type5);
                                }
                                Type type6 = (Type) codedInputStream.m33248h(f65192v, extensionRegistryLite);
                                this.f65206p = type6;
                                if (builder != null) {
                                    builder.mo32967j(type6);
                                    this.f65206p = builder.m33069m();
                                }
                                this.f65194d |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                            case C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                this.f65194d |= RecyclerView.ViewHolder.FLAG_MOVED;
                                this.f65207q = codedInputStream.m33252l();
                            default:
                                if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                    z = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f65674b = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.f65674b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f65195e = Collections.unmodifiableList(this.f65195e);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65193c = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65193c = m33226x.m33240c();
                    m33320o();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f65195e = Collections.unmodifiableList(this.f65195e);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65193c = m33226x.m33240c();
                throw th3;
            }
            this.f65193c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {

        /* renamed from: j */
        public static final Constructor f64970j;

        /* renamed from: k */
        public static Parser<Constructor> f64971k = new C66511();

        /* renamed from: c */
        public final ByteString f64972c;

        /* renamed from: d */
        public int f64973d;

        /* renamed from: e */
        public int f64974e;

        /* renamed from: f */
        public List<ValueParameter> f64975f;

        /* renamed from: g */
        public List<Integer> f64976g;

        /* renamed from: h */
        public byte f64977h;

        /* renamed from: i */
        public int f64978i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1 */
        public static class C66511 extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* renamed from: e */
            public int f64979e;

            /* renamed from: f */
            public int f64980f = 6;

            /* renamed from: g */
            public List<ValueParameter> f64981g = Collections.emptyList();

            /* renamed from: h */
            public List<Integer> f64982h = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Constructor m32991m = m32991m();
                if (m32991m.mo32959e()) {
                    return m32991m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32994p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32994p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m32993o((Constructor) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public Constructor m32991m() {
                Constructor constructor = new Constructor(this, null);
                int i2 = this.f64979e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                constructor.f64974e = this.f64980f;
                if ((i2 & 2) == 2) {
                    this.f64981g = Collections.unmodifiableList(this.f64981g);
                    this.f64979e &= -3;
                }
                constructor.f64975f = this.f64981g;
                if ((this.f64979e & 4) == 4) {
                    this.f64982h = Collections.unmodifiableList(this.f64982h);
                    this.f64979e &= -5;
                }
                constructor.f64976g = this.f64982h;
                constructor.f64973d = i3;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m32993o(m32991m());
                return builder;
            }

            /* renamed from: o */
            public Builder m32993o(Constructor constructor) {
                if (constructor == Constructor.f64970j) {
                    return this;
                }
                if ((constructor.f64973d & 1) == 1) {
                    int i2 = constructor.f64974e;
                    this.f64979e = 1 | this.f64979e;
                    this.f64980f = i2;
                }
                if (!constructor.f64975f.isEmpty()) {
                    if (this.f64981g.isEmpty()) {
                        this.f64981g = constructor.f64975f;
                        this.f64979e &= -3;
                    } else {
                        if ((this.f64979e & 2) != 2) {
                            this.f64981g = new ArrayList(this.f64981g);
                            this.f64979e |= 2;
                        }
                        this.f64981g.addAll(constructor.f64975f);
                    }
                }
                if (!constructor.f64976g.isEmpty()) {
                    if (this.f64982h.isEmpty()) {
                        this.f64982h = constructor.f64976g;
                        this.f64979e &= -5;
                    } else {
                        if ((this.f64979e & 4) != 4) {
                            this.f64982h = new ArrayList(this.f64982h);
                            this.f64979e |= 4;
                        }
                        this.f64982h.addAll(constructor.f64976g);
                    }
                }
                m33313l(constructor);
                this.f65656b = this.f65656b.m33231b(constructor.f64972c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder m32994p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.f64971k     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.C66511) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m32993o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m32993o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.m32994p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$Builder");
            }
        }

        static {
            Constructor constructor = new Constructor();
            f64970j = constructor;
            constructor.f64974e = 6;
            constructor.f64975f = Collections.emptyList();
            constructor.f64976g = Collections.emptyList();
        }

        public Constructor(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f64977h = (byte) -1;
            this.f64978i = -1;
            this.f64972c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f64970j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m32993o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f64978i;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f64973d & 1) == 1 ? CodedOutputStream.m33263c(1, this.f64974e) + 0 : 0;
            for (int i3 = 0; i3 < this.f64975f.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(2, this.f64975f.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f64976g.size(); i5++) {
                i4 += CodedOutputStream.m33264d(this.f64976g.get(i5).intValue());
            }
            int size = this.f64972c.size() + m33315j() + C2052a.m12266a(this.f64976g, 2, m33263c + i4);
            this.f64978i = size;
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
            byte b = this.f64977h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f64975f.size(); i2++) {
                if (!this.f64975f.get(i2).mo32959e()) {
                    this.f64977h = (byte) 0;
                    return false;
                }
            }
            if (m33314i()) {
                this.f64977h = (byte) 1;
                return true;
            }
            this.f64977h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f64973d & 1) == 1) {
                codedOutputStream.m33279q(1, this.f64974e);
            }
            for (int i2 = 0; i2 < this.f64975f.size(); i2++) {
                codedOutputStream.m33281s(2, this.f64975f.get(i2));
            }
            for (int i3 = 0; i3 < this.f64976g.size(); i3++) {
                codedOutputStream.m33279q(31, this.f64976g.get(i3).intValue());
            }
            m33321p.m33324a(19000, codedOutputStream);
            codedOutputStream.m33284v(this.f64972c);
        }

        public Constructor() {
            this.f64977h = (byte) -1;
            this.f64978i = -1;
            this.f64972c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f64977h = (byte) -1;
            this.f64978i = -1;
            this.f64974e = 6;
            this.f64975f = Collections.emptyList();
            this.f64976g = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 8) {
                                this.f64973d |= 1;
                                this.f64974e = codedInputStream.m33252l();
                            } else if (m33255o == 18) {
                                if ((i2 & 2) != 2) {
                                    this.f64975f = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f64975f.add(codedInputStream.m33248h(ValueParameter.f65307n, extensionRegistryLite));
                            } else if (m33255o == 248) {
                                if ((i2 & 4) != 4) {
                                    this.f64976g = new ArrayList();
                                    i2 |= 4;
                                }
                                this.f64976g.add(Integer.valueOf(codedInputStream.m33252l()));
                            } else if (m33255o != 250) {
                                if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                }
                            } else {
                                int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 4) != 4 && codedInputStream.m33242b() > 0) {
                                    this.f64976g = new ArrayList();
                                    i2 |= 4;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f64976g.add(Integer.valueOf(codedInputStream.m33252l()));
                                }
                                codedInputStream.f65638i = m33244d;
                                codedInputStream.m33256p();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i2 & 2) == 2) {
                            this.f64975f = Collections.unmodifiableList(this.f64975f);
                        }
                        if ((i2 & 4) == 4) {
                            this.f64976g = Collections.unmodifiableList(this.f64976g);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f64972c = m33226x.m33240c();
                            throw th2;
                        }
                        this.f64972c = m33226x.m33240c();
                        m33320o();
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
                this.f64975f = Collections.unmodifiableList(this.f64975f);
            }
            if ((i2 & 4) == 4) {
                this.f64976g = Collections.unmodifiableList(this.f64976g);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f64972c = m33226x.m33240c();
                throw th3;
            }
            this.f64972c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {

        /* renamed from: f */
        public static final Contract f64983f;

        /* renamed from: g */
        public static Parser<Contract> f64984g = new C66521();

        /* renamed from: b */
        public final ByteString f64985b;

        /* renamed from: c */
        public List<Effect> f64986c;

        /* renamed from: d */
        public byte f64987d;

        /* renamed from: e */
        public int f64988e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1 */
        public static class C66521 extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* renamed from: c */
            public int f64989c;

            /* renamed from: d */
            public List<Effect> f64990d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Contract m32995k = m32995k();
                if (m32995k.mo32959e()) {
                    return m32995k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32998n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32998n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(Contract contract) {
                m32997m(contract);
                return this;
            }

            /* renamed from: k */
            public Contract m32995k() {
                Contract contract = new Contract(this, null);
                if ((this.f64989c & 1) == 1) {
                    this.f64990d = Collections.unmodifiableList(this.f64990d);
                    this.f64989c &= -2;
                }
                contract.f64986c = this.f64990d;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m32997m(m32995k());
                return builder;
            }

            /* renamed from: m */
            public Builder m32997m(Contract contract) {
                if (contract == Contract.f64983f) {
                    return this;
                }
                if (!contract.f64986c.isEmpty()) {
                    if (this.f64990d.isEmpty()) {
                        this.f64990d = contract.f64986c;
                        this.f64989c &= -2;
                    } else {
                        if ((this.f64989c & 1) != 1) {
                            this.f64990d = new ArrayList(this.f64990d);
                            this.f64989c |= 1;
                        }
                        this.f64990d.addAll(contract.f64986c);
                    }
                }
                this.f65656b = this.f65656b.m33231b(contract.f64985b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder m32998n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.f64984g     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.C66521) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m32997m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m32997m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.m32998n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder");
            }
        }

        static {
            Contract contract = new Contract();
            f64983f = contract;
            contract.f64986c = Collections.emptyList();
        }

        public Contract(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f64987d = (byte) -1;
            this.f64988e = -1;
            this.f64985b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m32997m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f64988e;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f64986c.size(); i4++) {
                i3 += CodedOutputStream.m33265e(1, this.f64986c.get(i4));
            }
            int size = this.f64985b.size() + i3;
            this.f64988e = size;
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
            byte b = this.f64987d;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f64986c.size(); i2++) {
                if (!this.f64986c.get(i2).mo32959e()) {
                    this.f64987d = (byte) 0;
                    return false;
                }
            }
            this.f64987d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f64986c.size(); i2++) {
                codedOutputStream.m33281s(1, this.f64986c.get(i2));
            }
            codedOutputStream.m33284v(this.f64985b);
        }

        public Contract() {
            this.f64987d = (byte) -1;
            this.f64988e = -1;
            this.f64985b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f64987d = (byte) -1;
            this.f64988e = -1;
            this.f64986c = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o != 10) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f64986c = new ArrayList();
                                    z2 |= true;
                                }
                                this.f64986c.add(codedInputStream.m33248h(Effect.f64992k, extensionRegistryLite));
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
                    if (z2 & true) {
                        this.f64986c = Collections.unmodifiableList(this.f64986c);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f64985b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f64985b = m33226x.m33240c();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f64986c = Collections.unmodifiableList(this.f64986c);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f64985b = m33226x.m33240c();
                throw th3;
            }
            this.f64985b = m33226x.m33240c();
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {

        /* renamed from: j */
        public static final Effect f64991j;

        /* renamed from: k */
        public static Parser<Effect> f64992k = new C66531();

        /* renamed from: b */
        public final ByteString f64993b;

        /* renamed from: c */
        public int f64994c;

        /* renamed from: d */
        public EffectType f64995d;

        /* renamed from: e */
        public List<Expression> f64996e;

        /* renamed from: f */
        public Expression f64997f;

        /* renamed from: g */
        public InvocationKind f64998g;

        /* renamed from: h */
        public byte f64999h;

        /* renamed from: i */
        public int f65000i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1 */
        public static class C66531 extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* renamed from: c */
            public int f65001c;

            /* renamed from: d */
            public EffectType f65002d = EffectType.RETURNS_CONSTANT;

            /* renamed from: e */
            public List<Expression> f65003e = Collections.emptyList();

            /* renamed from: f */
            public Expression f65004f = Expression.f65025m;

            /* renamed from: g */
            public InvocationKind f65005g = InvocationKind.AT_MOST_ONCE;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Effect m32999k = m32999k();
                if (m32999k.mo32959e()) {
                    return m32999k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33002n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33002n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(Effect effect) {
                m33001m(effect);
                return this;
            }

            /* renamed from: k */
            public Effect m32999k() {
                Effect effect = new Effect(this, null);
                int i2 = this.f65001c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                effect.f64995d = this.f65002d;
                if ((i2 & 2) == 2) {
                    this.f65003e = Collections.unmodifiableList(this.f65003e);
                    this.f65001c &= -3;
                }
                effect.f64996e = this.f65003e;
                if ((i2 & 4) == 4) {
                    i3 |= 2;
                }
                effect.f64997f = this.f65004f;
                if ((i2 & 8) == 8) {
                    i3 |= 4;
                }
                effect.f64998g = this.f65005g;
                effect.f64994c = i3;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33001m(m32999k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33001m(Effect effect) {
                Expression expression;
                if (effect == Effect.f64991j) {
                    return this;
                }
                if ((effect.f64994c & 1) == 1) {
                    EffectType effectType = effect.f64995d;
                    Objects.requireNonNull(effectType);
                    this.f65001c |= 1;
                    this.f65002d = effectType;
                }
                if (!effect.f64996e.isEmpty()) {
                    if (this.f65003e.isEmpty()) {
                        this.f65003e = effect.f64996e;
                        this.f65001c &= -3;
                    } else {
                        if ((this.f65001c & 2) != 2) {
                            this.f65003e = new ArrayList(this.f65003e);
                            this.f65001c |= 2;
                        }
                        this.f65003e.addAll(effect.f64996e);
                    }
                }
                if ((effect.f64994c & 2) == 2) {
                    Expression expression2 = effect.f64997f;
                    if ((this.f65001c & 4) != 4 || (expression = this.f65004f) == Expression.f65025m) {
                        this.f65004f = expression2;
                    } else {
                        Expression.Builder builder = new Expression.Builder();
                        builder.m33012m(expression);
                        builder.m33012m(expression2);
                        this.f65004f = builder.m33010k();
                    }
                    this.f65001c |= 4;
                }
                if ((effect.f64994c & 4) == 4) {
                    InvocationKind invocationKind = effect.f64998g;
                    Objects.requireNonNull(invocationKind);
                    this.f65001c |= 8;
                    this.f65005g = invocationKind;
                }
                this.f65656b = this.f65656b.m33231b(effect.f64993b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder m33002n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.f64992k     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.C66531) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33001m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33001m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.m33002n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$Builder");
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);


            /* renamed from: b */
            public final int f65010b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$1 */
            public static class C66541 implements Internal.EnumLiteMap<EffectType> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public EffectType mo32979a(int i2) {
                    return EffectType.m33003a(i2);
                }
            }

            EffectType(int i2) {
                this.f65010b = i2;
            }

            /* renamed from: a */
            public static EffectType m33003a(int i2) {
                if (i2 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i2 == 1) {
                    return CALLS;
                }
                if (i2 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f65010b;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);


            /* renamed from: b */
            public final int f65015b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$1 */
            public static class C66551 implements Internal.EnumLiteMap<InvocationKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public InvocationKind mo32979a(int i2) {
                    return InvocationKind.m33004a(i2);
                }
            }

            InvocationKind(int i2) {
                this.f65015b = i2;
            }

            /* renamed from: a */
            public static InvocationKind m33004a(int i2) {
                if (i2 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i2 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i2 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f65015b;
            }
        }

        static {
            Effect effect = new Effect();
            f64991j = effect;
            effect.f64995d = EffectType.RETURNS_CONSTANT;
            effect.f64996e = Collections.emptyList();
            effect.f64997f = Expression.f65025m;
            effect.f64998g = InvocationKind.AT_MOST_ONCE;
        }

        public Effect(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f64999h = (byte) -1;
            this.f65000i = -1;
            this.f64993b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33001m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65000i;
            if (i2 != -1) {
                return i2;
            }
            int m33262b = (this.f64994c & 1) == 1 ? CodedOutputStream.m33262b(1, this.f64995d.f65010b) + 0 : 0;
            for (int i3 = 0; i3 < this.f64996e.size(); i3++) {
                m33262b += CodedOutputStream.m33265e(2, this.f64996e.get(i3));
            }
            if ((this.f64994c & 2) == 2) {
                m33262b += CodedOutputStream.m33265e(3, this.f64997f);
            }
            if ((this.f64994c & 4) == 4) {
                m33262b += CodedOutputStream.m33262b(4, this.f64998g.f65015b);
            }
            int size = this.f64993b.size() + m33262b;
            this.f65000i = size;
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
            byte b = this.f64999h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f64996e.size(); i2++) {
                if (!this.f64996e.get(i2).mo32959e()) {
                    this.f64999h = (byte) 0;
                    return false;
                }
            }
            if (!((this.f64994c & 2) == 2) || this.f64997f.mo32959e()) {
                this.f64999h = (byte) 1;
                return true;
            }
            this.f64999h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f64994c & 1) == 1) {
                codedOutputStream.m33277o(1, this.f64995d.f65010b);
            }
            for (int i2 = 0; i2 < this.f64996e.size(); i2++) {
                codedOutputStream.m33281s(2, this.f64996e.get(i2));
            }
            if ((this.f64994c & 2) == 2) {
                codedOutputStream.m33281s(3, this.f64997f);
            }
            if ((this.f64994c & 4) == 4) {
                codedOutputStream.m33277o(4, this.f64998g.f65015b);
            }
            codedOutputStream.m33284v(this.f64993b);
        }

        public Effect() {
            this.f64999h = (byte) -1;
            this.f65000i = -1;
            this.f64993b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f64999h = (byte) -1;
            this.f65000i = -1;
            this.f64995d = EffectType.RETURNS_CONSTANT;
            this.f64996e = Collections.emptyList();
            this.f64997f = Expression.f65025m;
            this.f64998g = InvocationKind.AT_MOST_ONCE;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 8) {
                                int m33252l = codedInputStream.m33252l();
                                EffectType m33003a = EffectType.m33003a(m33252l);
                                if (m33003a == null) {
                                    m33270k.m33288z(m33255o);
                                    m33270k.m33288z(m33252l);
                                } else {
                                    this.f64994c |= 1;
                                    this.f64995d = m33003a;
                                }
                            } else if (m33255o == 18) {
                                if ((i2 & 2) != 2) {
                                    this.f64996e = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f64996e.add(codedInputStream.m33248h(Expression.f65026n, extensionRegistryLite));
                            } else if (m33255o == 26) {
                                Expression.Builder builder = null;
                                if ((this.f64994c & 2) == 2) {
                                    Expression expression = this.f64997f;
                                    Objects.requireNonNull(expression);
                                    Expression.Builder builder2 = new Expression.Builder();
                                    builder2.m33012m(expression);
                                    builder = builder2;
                                }
                                Expression expression2 = (Expression) codedInputStream.m33248h(Expression.f65026n, extensionRegistryLite);
                                this.f64997f = expression2;
                                if (builder != null) {
                                    builder.m33012m(expression2);
                                    this.f64997f = builder.m33010k();
                                }
                                this.f64994c |= 2;
                            } else if (m33255o != 32) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                int m33252l2 = codedInputStream.m33252l();
                                InvocationKind m33004a = InvocationKind.m33004a(m33252l2);
                                if (m33004a == null) {
                                    m33270k.m33288z(m33255o);
                                    m33270k.m33288z(m33252l2);
                                } else {
                                    this.f64994c |= 4;
                                    this.f64998g = m33004a;
                                }
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
                    if ((i2 & 2) == 2) {
                        this.f64996e = Collections.unmodifiableList(this.f64996e);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f64993b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f64993b = m33226x.m33240c();
                    throw th;
                }
            }
            if ((i2 & 2) == 2) {
                this.f64996e = Collections.unmodifiableList(this.f64996e);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f64993b = m33226x.m33240c();
                throw th3;
            }
            this.f64993b = m33226x.m33240c();
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {

        /* renamed from: h */
        public static final EnumEntry f65016h;

        /* renamed from: i */
        public static Parser<EnumEntry> f65017i = new C66561();

        /* renamed from: c */
        public final ByteString f65018c;

        /* renamed from: d */
        public int f65019d;

        /* renamed from: e */
        public int f65020e;

        /* renamed from: f */
        public byte f65021f;

        /* renamed from: g */
        public int f65022g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1 */
        public static class C66561 extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* renamed from: e */
            public int f65023e;

            /* renamed from: f */
            public int f65024f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                EnumEntry m33005m = m33005m();
                if (m33005m.mo32959e()) {
                    return m33005m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33008p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33008p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33007o((EnumEntry) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public EnumEntry m33005m() {
                EnumEntry enumEntry = new EnumEntry(this, null);
                int i2 = (this.f65023e & 1) != 1 ? 0 : 1;
                enumEntry.f65020e = this.f65024f;
                enumEntry.f65019d = i2;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33007o(m33005m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33007o(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.f65016h) {
                    return this;
                }
                if ((enumEntry.f65019d & 1) == 1) {
                    int i2 = enumEntry.f65020e;
                    this.f65023e = 1 | this.f65023e;
                    this.f65024f = i2;
                }
                m33313l(enumEntry);
                this.f65656b = this.f65656b.m33231b(enumEntry.f65018c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder m33008p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.f65017i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.C66561) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33007o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33007o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.m33008p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$Builder");
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            f65016h = enumEntry;
            enumEntry.f65020e = 0;
        }

        public EnumEntry(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65021f = (byte) -1;
            this.f65022g = -1;
            this.f65018c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65016h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33007o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65022g;
            if (i2 != -1) {
                return i2;
            }
            int size = this.f65018c.size() + m33315j() + ((this.f65019d & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f65020e) : 0);
            this.f65022g = size;
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
            byte b = this.f65021f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (m33314i()) {
                this.f65021f = (byte) 1;
                return true;
            }
            this.f65021f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65019d & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65020e);
            }
            m33321p.m33324a(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, codedOutputStream);
            codedOutputStream.m33284v(this.f65018c);
        }

        public EnumEntry() {
            this.f65021f = (byte) -1;
            this.f65022g = -1;
            this.f65018c = ByteString.f65623b;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65021f = (byte) -1;
            this.f65022g = -1;
            boolean z = false;
            this.f65020e = 0;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o != 8) {
                                if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                }
                            } else {
                                this.f65019d |= 1;
                                this.f65020e = codedInputStream.m33252l();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65018c = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65018c = m33226x.m33240c();
                        m33320o();
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
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65018c = m33226x.m33240c();
                throw th3;
            }
            this.f65018c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {

        /* renamed from: m */
        public static final Expression f65025m;

        /* renamed from: n */
        public static Parser<Expression> f65026n = new C66571();

        /* renamed from: b */
        public final ByteString f65027b;

        /* renamed from: c */
        public int f65028c;

        /* renamed from: d */
        public int f65029d;

        /* renamed from: e */
        public int f65030e;

        /* renamed from: f */
        public ConstantValue f65031f;

        /* renamed from: g */
        public Type f65032g;

        /* renamed from: h */
        public int f65033h;

        /* renamed from: i */
        public List<Expression> f65034i;

        /* renamed from: j */
        public List<Expression> f65035j;

        /* renamed from: k */
        public byte f65036k;

        /* renamed from: l */
        public int f65037l;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1 */
        public static class C66571 extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* renamed from: c */
            public int f65038c;

            /* renamed from: d */
            public int f65039d;

            /* renamed from: e */
            public int f65040e;

            /* renamed from: h */
            public int f65043h;

            /* renamed from: f */
            public ConstantValue f65041f = ConstantValue.TRUE;

            /* renamed from: g */
            public Type f65042g = Type.f65191u;

            /* renamed from: i */
            public List<Expression> f65044i = Collections.emptyList();

            /* renamed from: j */
            public List<Expression> f65045j = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Expression m33010k = m33010k();
                if (m33010k.mo32959e()) {
                    return m33010k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33013n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33013n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(Expression expression) {
                m33012m(expression);
                return this;
            }

            /* renamed from: k */
            public Expression m33010k() {
                Expression expression = new Expression(this, null);
                int i2 = this.f65038c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                expression.f65029d = this.f65039d;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                expression.f65030e = this.f65040e;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                expression.f65031f = this.f65041f;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                expression.f65032g = this.f65042g;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                expression.f65033h = this.f65043h;
                if ((i2 & 32) == 32) {
                    this.f65044i = Collections.unmodifiableList(this.f65044i);
                    this.f65038c &= -33;
                }
                expression.f65034i = this.f65044i;
                if ((this.f65038c & 64) == 64) {
                    this.f65045j = Collections.unmodifiableList(this.f65045j);
                    this.f65038c &= -65;
                }
                expression.f65035j = this.f65045j;
                expression.f65028c = i3;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33012m(m33010k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33012m(Expression expression) {
                Type type;
                if (expression == Expression.f65025m) {
                    return this;
                }
                int i2 = expression.f65028c;
                if ((i2 & 1) == 1) {
                    int i3 = expression.f65029d;
                    this.f65038c = 1 | this.f65038c;
                    this.f65039d = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = expression.f65030e;
                    this.f65038c = 2 | this.f65038c;
                    this.f65040e = i4;
                }
                if ((i2 & 4) == 4) {
                    ConstantValue constantValue = expression.f65031f;
                    Objects.requireNonNull(constantValue);
                    this.f65038c = 4 | this.f65038c;
                    this.f65041f = constantValue;
                }
                if ((expression.f65028c & 8) == 8) {
                    Type type2 = expression.f65032g;
                    if ((this.f65038c & 8) != 8 || (type = this.f65042g) == Type.f65191u) {
                        this.f65042g = type2;
                    } else {
                        this.f65042g = C3033a.m17747i(type, type2);
                    }
                    this.f65038c |= 8;
                }
                if ((expression.f65028c & 16) == 16) {
                    int i5 = expression.f65033h;
                    this.f65038c = 16 | this.f65038c;
                    this.f65043h = i5;
                }
                if (!expression.f65034i.isEmpty()) {
                    if (this.f65044i.isEmpty()) {
                        this.f65044i = expression.f65034i;
                        this.f65038c &= -33;
                    } else {
                        if ((this.f65038c & 32) != 32) {
                            this.f65044i = new ArrayList(this.f65044i);
                            this.f65038c |= 32;
                        }
                        this.f65044i.addAll(expression.f65034i);
                    }
                }
                if (!expression.f65035j.isEmpty()) {
                    if (this.f65045j.isEmpty()) {
                        this.f65045j = expression.f65035j;
                        this.f65038c &= -65;
                    } else {
                        if ((this.f65038c & 64) != 64) {
                            this.f65045j = new ArrayList(this.f65045j);
                            this.f65038c |= 64;
                        }
                        this.f65045j.addAll(expression.f65035j);
                    }
                }
                this.f65656b = this.f65656b.m33231b(expression.f65027b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder m33013n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.f65026n     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.C66571) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33012m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33012m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.m33013n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$Builder");
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);


            /* renamed from: b */
            public final int f65050b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$1 */
            public static class C66581 implements Internal.EnumLiteMap<ConstantValue> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public ConstantValue mo32979a(int i2) {
                    return ConstantValue.m33014a(i2);
                }
            }

            ConstantValue(int i2) {
                this.f65050b = i2;
            }

            /* renamed from: a */
            public static ConstantValue m33014a(int i2) {
                if (i2 == 0) {
                    return TRUE;
                }
                if (i2 == 1) {
                    return FALSE;
                }
                if (i2 != 2) {
                    return null;
                }
                return NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f65050b;
            }
        }

        static {
            Expression expression = new Expression();
            f65025m = expression;
            expression.m33009i();
        }

        public Expression(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f65036k = (byte) -1;
            this.f65037l = -1;
            this.f65027b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33012m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65037l;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65028c & 1) == 1 ? CodedOutputStream.m33263c(1, this.f65029d) + 0 : 0;
            if ((this.f65028c & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65030e);
            }
            if ((this.f65028c & 4) == 4) {
                m33263c += CodedOutputStream.m33262b(3, this.f65031f.f65050b);
            }
            if ((this.f65028c & 8) == 8) {
                m33263c += CodedOutputStream.m33265e(4, this.f65032g);
            }
            if ((this.f65028c & 16) == 16) {
                m33263c += CodedOutputStream.m33263c(5, this.f65033h);
            }
            for (int i3 = 0; i3 < this.f65034i.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(6, this.f65034i.get(i3));
            }
            for (int i4 = 0; i4 < this.f65035j.size(); i4++) {
                m33263c += CodedOutputStream.m33265e(7, this.f65035j.get(i4));
            }
            int size = this.f65027b.size() + m33263c;
            this.f65037l = size;
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
            byte b = this.f65036k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (((this.f65028c & 8) == 8) && !this.f65032g.mo32959e()) {
                this.f65036k = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f65034i.size(); i2++) {
                if (!this.f65034i.get(i2).mo32959e()) {
                    this.f65036k = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f65035j.size(); i3++) {
                if (!this.f65035j.get(i3).mo32959e()) {
                    this.f65036k = (byte) 0;
                    return false;
                }
            }
            this.f65036k = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f65028c & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65029d);
            }
            if ((this.f65028c & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65030e);
            }
            if ((this.f65028c & 4) == 4) {
                codedOutputStream.m33277o(3, this.f65031f.f65050b);
            }
            if ((this.f65028c & 8) == 8) {
                codedOutputStream.m33281s(4, this.f65032g);
            }
            if ((this.f65028c & 16) == 16) {
                codedOutputStream.m33279q(5, this.f65033h);
            }
            for (int i2 = 0; i2 < this.f65034i.size(); i2++) {
                codedOutputStream.m33281s(6, this.f65034i.get(i2));
            }
            for (int i3 = 0; i3 < this.f65035j.size(); i3++) {
                codedOutputStream.m33281s(7, this.f65035j.get(i3));
            }
            codedOutputStream.m33284v(this.f65027b);
        }

        /* renamed from: i */
        public final void m33009i() {
            this.f65029d = 0;
            this.f65030e = 0;
            this.f65031f = ConstantValue.TRUE;
            this.f65032g = Type.f65191u;
            this.f65033h = 0;
            this.f65034i = Collections.emptyList();
            this.f65035j = Collections.emptyList();
        }

        public Expression() {
            this.f65036k = (byte) -1;
            this.f65037l = -1;
            this.f65027b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65036k = (byte) -1;
            this.f65037l = -1;
            m33009i();
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
                                    this.f65028c |= 1;
                                    this.f65029d = codedInputStream.m33252l();
                                } else if (m33255o == 16) {
                                    this.f65028c |= 2;
                                    this.f65030e = codedInputStream.m33252l();
                                } else if (m33255o == 24) {
                                    int m33252l = codedInputStream.m33252l();
                                    ConstantValue m33014a = ConstantValue.m33014a(m33252l);
                                    if (m33014a == null) {
                                        m33270k.m33288z(m33255o);
                                        m33270k.m33288z(m33252l);
                                    } else {
                                        this.f65028c |= 4;
                                        this.f65031f = m33014a;
                                    }
                                } else if (m33255o == 34) {
                                    Type.Builder builder = null;
                                    if ((this.f65028c & 8) == 8) {
                                        Type type = this.f65032g;
                                        Objects.requireNonNull(type);
                                        builder = Type.m33055y(type);
                                    }
                                    Type type2 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                    this.f65032g = type2;
                                    if (builder != null) {
                                        builder.mo32967j(type2);
                                        this.f65032g = builder.m33069m();
                                    }
                                    this.f65028c |= 8;
                                } else if (m33255o == 40) {
                                    this.f65028c |= 16;
                                    this.f65033h = codedInputStream.m33252l();
                                } else if (m33255o == 50) {
                                    if ((i2 & 32) != 32) {
                                        this.f65034i = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.f65034i.add(codedInputStream.m33248h(f65026n, extensionRegistryLite));
                                } else if (m33255o != 58) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    if ((i2 & 64) != 64) {
                                        this.f65035j = new ArrayList();
                                        i2 |= 64;
                                    }
                                    this.f65035j.add(codedInputStream.m33248h(f65026n, extensionRegistryLite));
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
                    if ((i2 & 32) == 32) {
                        this.f65034i = Collections.unmodifiableList(this.f65034i);
                    }
                    if ((i2 & 64) == 64) {
                        this.f65035j = Collections.unmodifiableList(this.f65035j);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65027b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65027b = m33226x.m33240c();
                    throw th;
                }
            }
            if ((i2 & 32) == 32) {
                this.f65034i = Collections.unmodifiableList(this.f65034i);
            }
            if ((i2 & 64) == 64) {
                this.f65035j = Collections.unmodifiableList(this.f65035j);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65027b = m33226x.m33240c();
                throw th3;
            }
            this.f65027b = m33226x.m33240c();
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {

        /* renamed from: s */
        public static final Function f65051s;

        /* renamed from: t */
        public static Parser<Function> f65052t = new C66591();

        /* renamed from: c */
        public final ByteString f65053c;

        /* renamed from: d */
        public int f65054d;

        /* renamed from: e */
        public int f65055e;

        /* renamed from: f */
        public int f65056f;

        /* renamed from: g */
        public int f65057g;

        /* renamed from: h */
        public Type f65058h;

        /* renamed from: i */
        public int f65059i;

        /* renamed from: j */
        public List<TypeParameter> f65060j;

        /* renamed from: k */
        public Type f65061k;

        /* renamed from: l */
        public int f65062l;

        /* renamed from: m */
        public List<ValueParameter> f65063m;

        /* renamed from: n */
        public TypeTable f65064n;

        /* renamed from: o */
        public List<Integer> f65065o;

        /* renamed from: p */
        public Contract f65066p;

        /* renamed from: q */
        public byte f65067q;

        /* renamed from: r */
        public int f65068r;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1 */
        public static class C66591 extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* renamed from: e */
            public int f65069e;

            /* renamed from: f */
            public int f65070f = 6;

            /* renamed from: g */
            public int f65071g = 6;

            /* renamed from: h */
            public int f65072h;

            /* renamed from: i */
            public Type f65073i;

            /* renamed from: j */
            public int f65074j;

            /* renamed from: k */
            public List<TypeParameter> f65075k;

            /* renamed from: l */
            public Type f65076l;

            /* renamed from: m */
            public int f65077m;

            /* renamed from: n */
            public List<ValueParameter> f65078n;

            /* renamed from: o */
            public TypeTable f65079o;

            /* renamed from: p */
            public List<Integer> f65080p;

            /* renamed from: q */
            public Contract f65081q;

            public Builder() {
                Type type = Type.f65191u;
                this.f65073i = type;
                this.f65075k = Collections.emptyList();
                this.f65076l = type;
                this.f65078n = Collections.emptyList();
                this.f65079o = TypeTable.f65295h;
                this.f65080p = Collections.emptyList();
                this.f65081q = Contract.f64983f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Function m33019m = m33019m();
                if (m33019m.mo32959e()) {
                    return m33019m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33022p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33022p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33021o((Function) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public Function m33019m() {
                Function function = new Function(this, null);
                int i2 = this.f65069e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                function.f65055e = this.f65070f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                function.f65056f = this.f65071g;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                function.f65057g = this.f65072h;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                function.f65058h = this.f65073i;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                function.f65059i = this.f65074j;
                if ((i2 & 32) == 32) {
                    this.f65075k = Collections.unmodifiableList(this.f65075k);
                    this.f65069e &= -33;
                }
                function.f65060j = this.f65075k;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                function.f65061k = this.f65076l;
                if ((i2 & 128) == 128) {
                    i3 |= 64;
                }
                function.f65062l = this.f65077m;
                if ((this.f65069e & 256) == 256) {
                    this.f65078n = Collections.unmodifiableList(this.f65078n);
                    this.f65069e &= -257;
                }
                function.f65063m = this.f65078n;
                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    i3 |= 128;
                }
                function.f65064n = this.f65079o;
                if ((this.f65069e & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                    this.f65080p = Collections.unmodifiableList(this.f65080p);
                    this.f65069e &= -1025;
                }
                function.f65065o = this.f65080p;
                if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                    i3 |= 256;
                }
                function.f65066p = this.f65081q;
                function.f65054d = i3;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33021o(m33019m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33021o(Function function) {
                Contract contract;
                TypeTable typeTable;
                Type type;
                Type type2;
                if (function == Function.f65051s) {
                    return this;
                }
                int i2 = function.f65054d;
                if ((i2 & 1) == 1) {
                    int i3 = function.f65055e;
                    this.f65069e = 1 | this.f65069e;
                    this.f65070f = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = function.f65056f;
                    this.f65069e = 2 | this.f65069e;
                    this.f65071g = i4;
                }
                if ((i2 & 4) == 4) {
                    int i5 = function.f65057g;
                    this.f65069e = 4 | this.f65069e;
                    this.f65072h = i5;
                }
                if (function.m33017u()) {
                    Type type3 = function.f65058h;
                    if ((this.f65069e & 8) != 8 || (type2 = this.f65073i) == Type.f65191u) {
                        this.f65073i = type3;
                    } else {
                        this.f65073i = C3033a.m17747i(type2, type3);
                    }
                    this.f65069e |= 8;
                }
                if ((function.f65054d & 16) == 16) {
                    int i6 = function.f65059i;
                    this.f65069e = 16 | this.f65069e;
                    this.f65074j = i6;
                }
                if (!function.f65060j.isEmpty()) {
                    if (this.f65075k.isEmpty()) {
                        this.f65075k = function.f65060j;
                        this.f65069e &= -33;
                    } else {
                        if ((this.f65069e & 32) != 32) {
                            this.f65075k = new ArrayList(this.f65075k);
                            this.f65069e |= 32;
                        }
                        this.f65075k.addAll(function.f65060j);
                    }
                }
                if (function.m33015s()) {
                    Type type4 = function.f65061k;
                    if ((this.f65069e & 64) != 64 || (type = this.f65076l) == Type.f65191u) {
                        this.f65076l = type4;
                    } else {
                        this.f65076l = C3033a.m17747i(type, type4);
                    }
                    this.f65069e |= 64;
                }
                if (function.m33016t()) {
                    int i7 = function.f65062l;
                    this.f65069e |= 128;
                    this.f65077m = i7;
                }
                if (!function.f65063m.isEmpty()) {
                    if (this.f65078n.isEmpty()) {
                        this.f65078n = function.f65063m;
                        this.f65069e &= -257;
                    } else {
                        if ((this.f65069e & 256) != 256) {
                            this.f65078n = new ArrayList(this.f65078n);
                            this.f65069e |= 256;
                        }
                        this.f65078n.addAll(function.f65063m);
                    }
                }
                if ((function.f65054d & 128) == 128) {
                    TypeTable typeTable2 = function.f65064n;
                    if ((this.f65069e & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 512 || (typeTable = this.f65079o) == TypeTable.f65295h) {
                        this.f65079o = typeTable2;
                    } else {
                        TypeTable.Builder m33086i = TypeTable.m33086i(typeTable);
                        m33086i.m33090m(typeTable2);
                        this.f65079o = m33086i.m33088k();
                    }
                    this.f65069e |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                }
                if (!function.f65065o.isEmpty()) {
                    if (this.f65080p.isEmpty()) {
                        this.f65080p = function.f65065o;
                        this.f65069e &= -1025;
                    } else {
                        if ((this.f65069e & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                            this.f65080p = new ArrayList(this.f65080p);
                            this.f65069e |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                        }
                        this.f65080p.addAll(function.f65065o);
                    }
                }
                if ((function.f65054d & 256) == 256) {
                    Contract contract2 = function.f65066p;
                    if ((this.f65069e & RecyclerView.ViewHolder.FLAG_MOVED) != 2048 || (contract = this.f65081q) == Contract.f64983f) {
                        this.f65081q = contract2;
                    } else {
                        Contract.Builder builder = new Contract.Builder();
                        builder.m32997m(contract);
                        builder.m32997m(contract2);
                        this.f65081q = builder.m32995k();
                    }
                    this.f65069e |= RecyclerView.ViewHolder.FLAG_MOVED;
                }
                m33313l(function);
                this.f65656b = this.f65656b.m33231b(function.f65053c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder m33022p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.f65052t     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.C66591) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33021o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33021o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.m33022p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$Builder");
            }
        }

        static {
            Function function = new Function();
            f65051s = function;
            function.m33018v();
        }

        public Function(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65067q = (byte) -1;
            this.f65068r = -1;
            this.f65053c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65051s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33021o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65068r;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65054d & 2) == 2 ? CodedOutputStream.m33263c(1, this.f65056f) + 0 : 0;
            if ((this.f65054d & 4) == 4) {
                m33263c += CodedOutputStream.m33263c(2, this.f65057g);
            }
            if ((this.f65054d & 8) == 8) {
                m33263c += CodedOutputStream.m33265e(3, this.f65058h);
            }
            for (int i3 = 0; i3 < this.f65060j.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(4, this.f65060j.get(i3));
            }
            if ((this.f65054d & 32) == 32) {
                m33263c += CodedOutputStream.m33265e(5, this.f65061k);
            }
            for (int i4 = 0; i4 < this.f65063m.size(); i4++) {
                m33263c += CodedOutputStream.m33265e(6, this.f65063m.get(i4));
            }
            if ((this.f65054d & 16) == 16) {
                m33263c += CodedOutputStream.m33263c(7, this.f65059i);
            }
            if ((this.f65054d & 64) == 64) {
                m33263c += CodedOutputStream.m33263c(8, this.f65062l);
            }
            if ((this.f65054d & 1) == 1) {
                m33263c += CodedOutputStream.m33263c(9, this.f65055e);
            }
            if ((this.f65054d & 128) == 128) {
                m33263c += CodedOutputStream.m33265e(30, this.f65064n);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f65065o.size(); i6++) {
                i5 += CodedOutputStream.m33264d(this.f65065o.get(i6).intValue());
            }
            int m12266a = C2052a.m12266a(this.f65065o, 2, m33263c + i5);
            if ((this.f65054d & 256) == 256) {
                m12266a += CodedOutputStream.m33265e(32, this.f65066p);
            }
            int size = this.f65053c.size() + m33315j() + m12266a;
            this.f65068r = size;
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
            byte b = this.f65067q;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f65054d & 4) == 4)) {
                this.f65067q = (byte) 0;
                return false;
            }
            if (m33017u() && !this.f65058h.mo32959e()) {
                this.f65067q = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f65060j.size(); i2++) {
                if (!this.f65060j.get(i2).mo32959e()) {
                    this.f65067q = (byte) 0;
                    return false;
                }
            }
            if (m33015s() && !this.f65061k.mo32959e()) {
                this.f65067q = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.f65063m.size(); i3++) {
                if (!this.f65063m.get(i3).mo32959e()) {
                    this.f65067q = (byte) 0;
                    return false;
                }
            }
            if (((this.f65054d & 128) == 128) && !this.f65064n.mo32959e()) {
                this.f65067q = (byte) 0;
                return false;
            }
            if (((this.f65054d & 256) == 256) && !this.f65066p.mo32959e()) {
                this.f65067q = (byte) 0;
                return false;
            }
            if (m33314i()) {
                this.f65067q = (byte) 1;
                return true;
            }
            this.f65067q = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65054d & 2) == 2) {
                codedOutputStream.m33279q(1, this.f65056f);
            }
            if ((this.f65054d & 4) == 4) {
                codedOutputStream.m33279q(2, this.f65057g);
            }
            if ((this.f65054d & 8) == 8) {
                codedOutputStream.m33281s(3, this.f65058h);
            }
            for (int i2 = 0; i2 < this.f65060j.size(); i2++) {
                codedOutputStream.m33281s(4, this.f65060j.get(i2));
            }
            if ((this.f65054d & 32) == 32) {
                codedOutputStream.m33281s(5, this.f65061k);
            }
            for (int i3 = 0; i3 < this.f65063m.size(); i3++) {
                codedOutputStream.m33281s(6, this.f65063m.get(i3));
            }
            if ((this.f65054d & 16) == 16) {
                codedOutputStream.m33279q(7, this.f65059i);
            }
            if ((this.f65054d & 64) == 64) {
                codedOutputStream.m33279q(8, this.f65062l);
            }
            if ((this.f65054d & 1) == 1) {
                codedOutputStream.m33279q(9, this.f65055e);
            }
            if ((this.f65054d & 128) == 128) {
                codedOutputStream.m33281s(30, this.f65064n);
            }
            for (int i4 = 0; i4 < this.f65065o.size(); i4++) {
                codedOutputStream.m33279q(31, this.f65065o.get(i4).intValue());
            }
            if ((this.f65054d & 256) == 256) {
                codedOutputStream.m33281s(32, this.f65066p);
            }
            m33321p.m33324a(19000, codedOutputStream);
            codedOutputStream.m33284v(this.f65053c);
        }

        /* renamed from: s */
        public boolean m33015s() {
            return (this.f65054d & 32) == 32;
        }

        /* renamed from: t */
        public boolean m33016t() {
            return (this.f65054d & 64) == 64;
        }

        /* renamed from: u */
        public boolean m33017u() {
            return (this.f65054d & 8) == 8;
        }

        /* renamed from: v */
        public final void m33018v() {
            this.f65055e = 6;
            this.f65056f = 6;
            this.f65057g = 0;
            Type type = Type.f65191u;
            this.f65058h = type;
            this.f65059i = 0;
            this.f65060j = Collections.emptyList();
            this.f65061k = type;
            this.f65062l = 0;
            this.f65063m = Collections.emptyList();
            this.f65064n = TypeTable.f65295h;
            this.f65065o = Collections.emptyList();
            this.f65066p = Contract.f64983f;
        }

        public Function() {
            this.f65067q = (byte) -1;
            this.f65068r = -1;
            this.f65053c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65067q = (byte) -1;
            this.f65068r = -1;
            m33018v();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (true) {
                ?? r4 = 256;
                if (!z) {
                    try {
                        try {
                            try {
                                int m33255o = codedInputStream.m33255o();
                                Type.Builder builder = null;
                                Contract.Builder builder2 = null;
                                TypeTable.Builder builder3 = null;
                                Type.Builder builder4 = null;
                                switch (m33255o) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        this.f65054d |= 2;
                                        this.f65056f = codedInputStream.m33252l();
                                    case 16:
                                        this.f65054d |= 4;
                                        this.f65057g = codedInputStream.m33252l();
                                    case 26:
                                        if ((this.f65054d & 8) == 8) {
                                            Type type = this.f65058h;
                                            Objects.requireNonNull(type);
                                            builder = Type.m33055y(type);
                                        }
                                        Type type2 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                        this.f65058h = type2;
                                        if (builder != null) {
                                            builder.mo32967j(type2);
                                            this.f65058h = builder.m33069m();
                                        }
                                        this.f65054d |= 8;
                                    case 34:
                                        if ((i2 & 32) != 32) {
                                            this.f65060j = new ArrayList();
                                            i2 |= 32;
                                        }
                                        this.f65060j.add(codedInputStream.m33248h(TypeParameter.f65271o, extensionRegistryLite));
                                    case 42:
                                        if ((this.f65054d & 32) == 32) {
                                            Type type3 = this.f65061k;
                                            Objects.requireNonNull(type3);
                                            builder4 = Type.m33055y(type3);
                                        }
                                        Type type4 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                        this.f65061k = type4;
                                        if (builder4 != null) {
                                            builder4.mo32967j(type4);
                                            this.f65061k = builder4.m33069m();
                                        }
                                        this.f65054d |= 32;
                                    case 50:
                                        if ((i2 & 256) != 256) {
                                            this.f65063m = new ArrayList();
                                            i2 |= 256;
                                        }
                                        this.f65063m.add(codedInputStream.m33248h(ValueParameter.f65307n, extensionRegistryLite));
                                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                                        this.f65054d |= 16;
                                        this.f65059i = codedInputStream.m33252l();
                                    case 64:
                                        this.f65054d |= 64;
                                        this.f65062l = codedInputStream.m33252l();
                                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        this.f65054d |= 1;
                                        this.f65055e = codedInputStream.m33252l();
                                    case 242:
                                        if ((this.f65054d & 128) == 128) {
                                            TypeTable typeTable = this.f65064n;
                                            Objects.requireNonNull(typeTable);
                                            builder3 = TypeTable.m33086i(typeTable);
                                        }
                                        TypeTable typeTable2 = (TypeTable) codedInputStream.m33248h(TypeTable.f65296i, extensionRegistryLite);
                                        this.f65064n = typeTable2;
                                        if (builder3 != null) {
                                            builder3.m33090m(typeTable2);
                                            this.f65064n = builder3.m33088k();
                                        }
                                        this.f65054d |= 128;
                                    case 248:
                                        if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                                            this.f65065o = new ArrayList();
                                            i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                                        }
                                        this.f65065o.add(Integer.valueOf(codedInputStream.m33252l()));
                                    case 250:
                                        int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                        if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 1024 && codedInputStream.m33242b() > 0) {
                                            this.f65065o = new ArrayList();
                                            i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                                        }
                                        while (codedInputStream.m33242b() > 0) {
                                            this.f65065o.add(Integer.valueOf(codedInputStream.m33252l()));
                                        }
                                        codedInputStream.f65638i = m33244d;
                                        codedInputStream.m33256p();
                                        break;
                                    case 258:
                                        if ((this.f65054d & 256) == 256) {
                                            Contract contract = this.f65066p;
                                            Objects.requireNonNull(contract);
                                            builder2 = new Contract.Builder();
                                            builder2.m32997m(contract);
                                        }
                                        Contract contract2 = (Contract) codedInputStream.m33248h(Contract.f64984g, extensionRegistryLite);
                                        this.f65066p = contract2;
                                        if (builder2 != null) {
                                            builder2.m32997m(contract2);
                                            this.f65066p = builder2.m32995k();
                                        }
                                        this.f65054d |= 256;
                                    default:
                                        r4 = m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o);
                                        if (r4 == 0) {
                                            z = true;
                                        }
                                }
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
                        if ((i2 & 32) == 32) {
                            this.f65060j = Collections.unmodifiableList(this.f65060j);
                        }
                        if ((i2 & 256) == r4) {
                            this.f65063m = Collections.unmodifiableList(this.f65063m);
                        }
                        if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                            this.f65065o = Collections.unmodifiableList(this.f65065o);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65053c = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65053c = m33226x.m33240c();
                        m33320o();
                        throw th;
                    }
                } else {
                    if ((i2 & 32) == 32) {
                        this.f65060j = Collections.unmodifiableList(this.f65060j);
                    }
                    if ((i2 & 256) == 256) {
                        this.f65063m = Collections.unmodifiableList(this.f65063m);
                    }
                    if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                        this.f65065o = Collections.unmodifiableList(this.f65065o);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f65053c = m33226x.m33240c();
                        throw th3;
                    }
                    this.f65053c = m33226x.m33240c();
                    m33320o();
                    return;
                }
            }
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {

        /* renamed from: l */
        public static final Package f65094l;

        /* renamed from: m */
        public static Parser<Package> f65095m = new C66621();

        /* renamed from: c */
        public final ByteString f65096c;

        /* renamed from: d */
        public int f65097d;

        /* renamed from: e */
        public List<Function> f65098e;

        /* renamed from: f */
        public List<Property> f65099f;

        /* renamed from: g */
        public List<TypeAlias> f65100g;

        /* renamed from: h */
        public TypeTable f65101h;

        /* renamed from: i */
        public VersionRequirementTable f65102i;

        /* renamed from: j */
        public byte f65103j;

        /* renamed from: k */
        public int f65104k;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1 */
        public static class C66621 extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* renamed from: e */
            public int f65105e;

            /* renamed from: f */
            public List<Function> f65106f = Collections.emptyList();

            /* renamed from: g */
            public List<Property> f65107g = Collections.emptyList();

            /* renamed from: h */
            public List<TypeAlias> f65108h = Collections.emptyList();

            /* renamed from: i */
            public TypeTable f65109i = TypeTable.f65295h;

            /* renamed from: j */
            public VersionRequirementTable f65110j = VersionRequirementTable.f65354f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Package m33024m = m33024m();
                if (m33024m.mo32959e()) {
                    return m33024m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33027p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33027p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33026o((Package) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public Package m33024m() {
                Package r0 = new Package(this, null);
                int i2 = this.f65105e;
                if ((i2 & 1) == 1) {
                    this.f65106f = Collections.unmodifiableList(this.f65106f);
                    this.f65105e &= -2;
                }
                r0.f65098e = this.f65106f;
                if ((this.f65105e & 2) == 2) {
                    this.f65107g = Collections.unmodifiableList(this.f65107g);
                    this.f65105e &= -3;
                }
                r0.f65099f = this.f65107g;
                if ((this.f65105e & 4) == 4) {
                    this.f65108h = Collections.unmodifiableList(this.f65108h);
                    this.f65105e &= -5;
                }
                r0.f65100g = this.f65108h;
                int i3 = (i2 & 8) != 8 ? 0 : 1;
                r0.f65101h = this.f65109i;
                if ((i2 & 16) == 16) {
                    i3 |= 2;
                }
                r0.f65102i = this.f65110j;
                r0.f65097d = i3;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33026o(m33024m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33026o(Package r8) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                if (r8 == Package.f65094l) {
                    return this;
                }
                if (!r8.f65098e.isEmpty()) {
                    if (this.f65106f.isEmpty()) {
                        this.f65106f = r8.f65098e;
                        this.f65105e &= -2;
                    } else {
                        if ((this.f65105e & 1) != 1) {
                            this.f65106f = new ArrayList(this.f65106f);
                            this.f65105e |= 1;
                        }
                        this.f65106f.addAll(r8.f65098e);
                    }
                }
                if (!r8.f65099f.isEmpty()) {
                    if (this.f65107g.isEmpty()) {
                        this.f65107g = r8.f65099f;
                        this.f65105e &= -3;
                    } else {
                        if ((this.f65105e & 2) != 2) {
                            this.f65107g = new ArrayList(this.f65107g);
                            this.f65105e |= 2;
                        }
                        this.f65107g.addAll(r8.f65099f);
                    }
                }
                if (!r8.f65100g.isEmpty()) {
                    if (this.f65108h.isEmpty()) {
                        this.f65108h = r8.f65100g;
                        this.f65105e &= -5;
                    } else {
                        if ((this.f65105e & 4) != 4) {
                            this.f65108h = new ArrayList(this.f65108h);
                            this.f65105e |= 4;
                        }
                        this.f65108h.addAll(r8.f65100g);
                    }
                }
                if ((r8.f65097d & 1) == 1) {
                    TypeTable typeTable2 = r8.f65101h;
                    if ((this.f65105e & 8) != 8 || (typeTable = this.f65109i) == TypeTable.f65295h) {
                        this.f65109i = typeTable2;
                    } else {
                        TypeTable.Builder m33086i = TypeTable.m33086i(typeTable);
                        m33086i.m33090m(typeTable2);
                        this.f65109i = m33086i.m33088k();
                    }
                    this.f65105e |= 8;
                }
                if ((r8.f65097d & 2) == 2) {
                    VersionRequirementTable versionRequirementTable2 = r8.f65102i;
                    if ((this.f65105e & 16) != 16 || (versionRequirementTable = this.f65110j) == VersionRequirementTable.f65354f) {
                        this.f65110j = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder m33104i = VersionRequirementTable.m33104i(versionRequirementTable);
                        m33104i.m33108m(versionRequirementTable2);
                        this.f65110j = m33104i.m33106k();
                    }
                    this.f65105e |= 16;
                }
                m33313l(r8);
                this.f65656b = this.f65656b.m33231b(r8.f65096c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder m33027p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.f65095m     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.C66621) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33026o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33026o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.m33027p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$Builder");
            }
        }

        static {
            Package r0 = new Package();
            f65094l = r0;
            r0.m33023s();
        }

        public Package(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65103j = (byte) -1;
            this.f65104k = -1;
            this.f65096c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65094l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33026o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65104k;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65098e.size(); i4++) {
                i3 += CodedOutputStream.m33265e(3, this.f65098e.get(i4));
            }
            for (int i5 = 0; i5 < this.f65099f.size(); i5++) {
                i3 += CodedOutputStream.m33265e(4, this.f65099f.get(i5));
            }
            for (int i6 = 0; i6 < this.f65100g.size(); i6++) {
                i3 += CodedOutputStream.m33265e(5, this.f65100g.get(i6));
            }
            if ((this.f65097d & 1) == 1) {
                i3 += CodedOutputStream.m33265e(30, this.f65101h);
            }
            if ((this.f65097d & 2) == 2) {
                i3 += CodedOutputStream.m33265e(32, this.f65102i);
            }
            int size = this.f65096c.size() + m33315j() + i3;
            this.f65104k = size;
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
            byte b = this.f65103j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f65098e.size(); i2++) {
                if (!this.f65098e.get(i2).mo32959e()) {
                    this.f65103j = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f65099f.size(); i3++) {
                if (!this.f65099f.get(i3).mo32959e()) {
                    this.f65103j = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.f65100g.size(); i4++) {
                if (!this.f65100g.get(i4).mo32959e()) {
                    this.f65103j = (byte) 0;
                    return false;
                }
            }
            if (((this.f65097d & 1) == 1) && !this.f65101h.mo32959e()) {
                this.f65103j = (byte) 0;
                return false;
            }
            if (m33314i()) {
                this.f65103j = (byte) 1;
                return true;
            }
            this.f65103j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            for (int i2 = 0; i2 < this.f65098e.size(); i2++) {
                codedOutputStream.m33281s(3, this.f65098e.get(i2));
            }
            for (int i3 = 0; i3 < this.f65099f.size(); i3++) {
                codedOutputStream.m33281s(4, this.f65099f.get(i3));
            }
            for (int i4 = 0; i4 < this.f65100g.size(); i4++) {
                codedOutputStream.m33281s(5, this.f65100g.get(i4));
            }
            if ((this.f65097d & 1) == 1) {
                codedOutputStream.m33281s(30, this.f65101h);
            }
            if ((this.f65097d & 2) == 2) {
                codedOutputStream.m33281s(32, this.f65102i);
            }
            m33321p.m33324a(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, codedOutputStream);
            codedOutputStream.m33284v(this.f65096c);
        }

        /* renamed from: s */
        public final void m33023s() {
            this.f65098e = Collections.emptyList();
            this.f65099f = Collections.emptyList();
            this.f65100g = Collections.emptyList();
            this.f65101h = TypeTable.f65295h;
            this.f65102i = VersionRequirementTable.f65354f;
        }

        public Package() {
            this.f65103j = (byte) -1;
            this.f65104k = -1;
            this.f65096c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65103j = (byte) -1;
            this.f65104k = -1;
            m33023s();
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
                                if (m33255o == 26) {
                                    if ((i2 & 1) != 1) {
                                        this.f65098e = new ArrayList();
                                        i2 |= 1;
                                    }
                                    this.f65098e.add(codedInputStream.m33248h(Function.f65052t, extensionRegistryLite));
                                } else if (m33255o == 34) {
                                    if ((i2 & 2) != 2) {
                                        this.f65099f = new ArrayList();
                                        i2 |= 2;
                                    }
                                    this.f65099f.add(codedInputStream.m33248h(Property.f65127t, extensionRegistryLite));
                                } else if (m33255o != 42) {
                                    VersionRequirementTable.Builder builder = null;
                                    TypeTable.Builder builder2 = null;
                                    if (m33255o == 242) {
                                        if ((this.f65097d & 1) == 1) {
                                            TypeTable typeTable = this.f65101h;
                                            Objects.requireNonNull(typeTable);
                                            builder2 = TypeTable.m33086i(typeTable);
                                        }
                                        TypeTable typeTable2 = (TypeTable) codedInputStream.m33248h(TypeTable.f65296i, extensionRegistryLite);
                                        this.f65101h = typeTable2;
                                        if (builder2 != null) {
                                            builder2.m33090m(typeTable2);
                                            this.f65101h = builder2.m33088k();
                                        }
                                        this.f65097d |= 1;
                                    } else if (m33255o != 258) {
                                        if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                        }
                                    } else {
                                        if ((this.f65097d & 2) == 2) {
                                            VersionRequirementTable versionRequirementTable = this.f65102i;
                                            Objects.requireNonNull(versionRequirementTable);
                                            builder = VersionRequirementTable.m33104i(versionRequirementTable);
                                        }
                                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) codedInputStream.m33248h(VersionRequirementTable.f65355g, extensionRegistryLite);
                                        this.f65102i = versionRequirementTable2;
                                        if (builder != null) {
                                            builder.m33108m(versionRequirementTable2);
                                            this.f65102i = builder.m33106k();
                                        }
                                        this.f65097d |= 2;
                                    }
                                } else {
                                    if ((i2 & 4) != 4) {
                                        this.f65100g = new ArrayList();
                                        i2 |= 4;
                                    }
                                    this.f65100g.add(codedInputStream.m33248h(TypeAlias.f65246q, extensionRegistryLite));
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
                        this.f65098e = Collections.unmodifiableList(this.f65098e);
                    }
                    if ((i2 & 2) == 2) {
                        this.f65099f = Collections.unmodifiableList(this.f65099f);
                    }
                    if ((i2 & 4) == 4) {
                        this.f65100g = Collections.unmodifiableList(this.f65100g);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65096c = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65096c = m33226x.m33240c();
                    m33320o();
                    throw th;
                }
            }
            if ((i2 & 1) == 1) {
                this.f65098e = Collections.unmodifiableList(this.f65098e);
            }
            if ((i2 & 2) == 2) {
                this.f65099f = Collections.unmodifiableList(this.f65099f);
            }
            if ((i2 & 4) == 4) {
                this.f65100g = Collections.unmodifiableList(this.f65100g);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65096c = m33226x.m33240c();
                throw th3;
            }
            this.f65096c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {

        /* renamed from: k */
        public static final PackageFragment f65111k;

        /* renamed from: l */
        public static Parser<PackageFragment> f65112l = new C66631();

        /* renamed from: c */
        public final ByteString f65113c;

        /* renamed from: d */
        public int f65114d;

        /* renamed from: e */
        public StringTable f65115e;

        /* renamed from: f */
        public QualifiedNameTable f65116f;

        /* renamed from: g */
        public Package f65117g;

        /* renamed from: h */
        public List<Class> f65118h;

        /* renamed from: i */
        public byte f65119i;

        /* renamed from: j */
        public int f65120j;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1 */
        public static class C66631 extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* renamed from: e */
            public int f65121e;

            /* renamed from: f */
            public StringTable f65122f = StringTable.f65183f;

            /* renamed from: g */
            public QualifiedNameTable f65123g = QualifiedNameTable.f65157f;

            /* renamed from: h */
            public Package f65124h = Package.f65094l;

            /* renamed from: i */
            public List<Class> f65125i = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                PackageFragment m33028m = m33028m();
                if (m33028m.mo32959e()) {
                    return m33028m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33031p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33031p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33030o((PackageFragment) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public PackageFragment m33028m() {
                PackageFragment packageFragment = new PackageFragment(this, null);
                int i2 = this.f65121e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                packageFragment.f65115e = this.f65122f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                packageFragment.f65116f = this.f65123g;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                packageFragment.f65117g = this.f65124h;
                if ((i2 & 8) == 8) {
                    this.f65125i = Collections.unmodifiableList(this.f65125i);
                    this.f65121e &= -9;
                }
                packageFragment.f65118h = this.f65125i;
                packageFragment.f65114d = i3;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33030o(m33028m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33030o(PackageFragment packageFragment) {
                Package r1;
                QualifiedNameTable qualifiedNameTable;
                StringTable stringTable;
                if (packageFragment == PackageFragment.f65111k) {
                    return this;
                }
                if ((packageFragment.f65114d & 1) == 1) {
                    StringTable stringTable2 = packageFragment.f65115e;
                    if ((this.f65121e & 1) != 1 || (stringTable = this.f65122f) == StringTable.f65183f) {
                        this.f65122f = stringTable2;
                    } else {
                        StringTable.Builder m33050i = StringTable.m33050i(stringTable);
                        m33050i.m33053m(stringTable2);
                        this.f65122f = m33050i.m33051k();
                    }
                    this.f65121e |= 1;
                }
                if ((packageFragment.f65114d & 2) == 2) {
                    QualifiedNameTable qualifiedNameTable2 = packageFragment.f65116f;
                    if ((this.f65121e & 2) != 2 || (qualifiedNameTable = this.f65123g) == QualifiedNameTable.f65157f) {
                        this.f65123g = qualifiedNameTable2;
                    } else {
                        QualifiedNameTable.Builder m33040i = QualifiedNameTable.m33040i(qualifiedNameTable);
                        m33040i.m33043m(qualifiedNameTable2);
                        this.f65123g = m33040i.m33041k();
                    }
                    this.f65121e |= 2;
                }
                if ((packageFragment.f65114d & 4) == 4) {
                    Package r0 = packageFragment.f65117g;
                    if ((this.f65121e & 4) != 4 || (r1 = this.f65124h) == Package.f65094l) {
                        this.f65124h = r0;
                    } else {
                        Package.Builder builder = new Package.Builder();
                        builder.m33026o(r1);
                        builder.m33026o(r0);
                        this.f65124h = builder.m33024m();
                    }
                    this.f65121e |= 4;
                }
                if (!packageFragment.f65118h.isEmpty()) {
                    if (this.f65125i.isEmpty()) {
                        this.f65125i = packageFragment.f65118h;
                        this.f65121e &= -9;
                    } else {
                        if ((this.f65121e & 8) != 8) {
                            this.f65125i = new ArrayList(this.f65125i);
                            this.f65121e |= 8;
                        }
                        this.f65125i.addAll(packageFragment.f65118h);
                    }
                }
                m33313l(packageFragment);
                this.f65656b = this.f65656b.m33231b(packageFragment.f65113c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder m33031p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.f65112l     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.C66631) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33030o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33030o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.m33031p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$Builder");
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            f65111k = packageFragment;
            packageFragment.f65115e = StringTable.f65183f;
            packageFragment.f65116f = QualifiedNameTable.f65157f;
            packageFragment.f65117g = Package.f65094l;
            packageFragment.f65118h = Collections.emptyList();
        }

        public PackageFragment(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65119i = (byte) -1;
            this.f65120j = -1;
            this.f65113c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65111k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33030o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65120j;
            if (i2 != -1) {
                return i2;
            }
            int m33265e = (this.f65114d & 1) == 1 ? CodedOutputStream.m33265e(1, this.f65115e) + 0 : 0;
            if ((this.f65114d & 2) == 2) {
                m33265e += CodedOutputStream.m33265e(2, this.f65116f);
            }
            if ((this.f65114d & 4) == 4) {
                m33265e += CodedOutputStream.m33265e(3, this.f65117g);
            }
            for (int i3 = 0; i3 < this.f65118h.size(); i3++) {
                m33265e += CodedOutputStream.m33265e(4, this.f65118h.get(i3));
            }
            int size = this.f65113c.size() + m33315j() + m33265e;
            this.f65120j = size;
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
            byte b = this.f65119i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (((this.f65114d & 2) == 2) && !this.f65116f.mo32959e()) {
                this.f65119i = (byte) 0;
                return false;
            }
            if (((this.f65114d & 4) == 4) && !this.f65117g.mo32959e()) {
                this.f65119i = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f65118h.size(); i2++) {
                if (!this.f65118h.get(i2).mo32959e()) {
                    this.f65119i = (byte) 0;
                    return false;
                }
            }
            if (m33314i()) {
                this.f65119i = (byte) 1;
                return true;
            }
            this.f65119i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65114d & 1) == 1) {
                codedOutputStream.m33281s(1, this.f65115e);
            }
            if ((this.f65114d & 2) == 2) {
                codedOutputStream.m33281s(2, this.f65116f);
            }
            if ((this.f65114d & 4) == 4) {
                codedOutputStream.m33281s(3, this.f65117g);
            }
            for (int i2 = 0; i2 < this.f65118h.size(); i2++) {
                codedOutputStream.m33281s(4, this.f65118h.get(i2));
            }
            m33321p.m33324a(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, codedOutputStream);
            codedOutputStream.m33284v(this.f65113c);
        }

        public PackageFragment() {
            this.f65119i = (byte) -1;
            this.f65120j = -1;
            this.f65113c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65119i = (byte) -1;
            this.f65120j = -1;
            this.f65115e = StringTable.f65183f;
            this.f65116f = QualifiedNameTable.f65157f;
            this.f65117g = Package.f65094l;
            this.f65118h = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            Package.Builder builder = null;
                            StringTable.Builder builder2 = null;
                            QualifiedNameTable.Builder builder3 = null;
                            if (m33255o == 10) {
                                if ((this.f65114d & 1) == 1) {
                                    StringTable stringTable = this.f65115e;
                                    Objects.requireNonNull(stringTable);
                                    builder2 = StringTable.m33050i(stringTable);
                                }
                                StringTable stringTable2 = (StringTable) codedInputStream.m33248h(StringTable.f65184g, extensionRegistryLite);
                                this.f65115e = stringTable2;
                                if (builder2 != null) {
                                    builder2.m33053m(stringTable2);
                                    this.f65115e = builder2.m33051k();
                                }
                                this.f65114d |= 1;
                            } else if (m33255o == 18) {
                                if ((this.f65114d & 2) == 2) {
                                    QualifiedNameTable qualifiedNameTable = this.f65116f;
                                    Objects.requireNonNull(qualifiedNameTable);
                                    builder3 = QualifiedNameTable.m33040i(qualifiedNameTable);
                                }
                                QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) codedInputStream.m33248h(QualifiedNameTable.f65158g, extensionRegistryLite);
                                this.f65116f = qualifiedNameTable2;
                                if (builder3 != null) {
                                    builder3.m33043m(qualifiedNameTable2);
                                    this.f65116f = builder3.m33041k();
                                }
                                this.f65114d |= 2;
                            } else if (m33255o == 26) {
                                if ((this.f65114d & 4) == 4) {
                                    Package r5 = this.f65117g;
                                    Objects.requireNonNull(r5);
                                    builder = new Package.Builder();
                                    builder.m33026o(r5);
                                }
                                Package r52 = (Package) codedInputStream.m33248h(Package.f65095m, extensionRegistryLite);
                                this.f65117g = r52;
                                if (builder != null) {
                                    builder.m33026o(r52);
                                    this.f65117g = builder.m33024m();
                                }
                                this.f65114d |= 4;
                            } else if (m33255o != 34) {
                                if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                }
                            } else {
                                if ((i2 & 8) != 8) {
                                    this.f65118h = new ArrayList();
                                    i2 |= 8;
                                }
                                this.f65118h.add(codedInputStream.m33248h(Class.f64919A, extensionRegistryLite));
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
                    if ((i2 & 8) == 8) {
                        this.f65118h = Collections.unmodifiableList(this.f65118h);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65113c = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65113c = m33226x.m33240c();
                    m33320o();
                    throw th;
                }
            }
            if ((i2 & 8) == 8) {
                this.f65118h = Collections.unmodifiableList(this.f65118h);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65113c = m33226x.m33240c();
                throw th3;
            }
            this.f65113c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {

        /* renamed from: s */
        public static final Property f65126s;

        /* renamed from: t */
        public static Parser<Property> f65127t = new C66641();

        /* renamed from: c */
        public final ByteString f65128c;

        /* renamed from: d */
        public int f65129d;

        /* renamed from: e */
        public int f65130e;

        /* renamed from: f */
        public int f65131f;

        /* renamed from: g */
        public int f65132g;

        /* renamed from: h */
        public Type f65133h;

        /* renamed from: i */
        public int f65134i;

        /* renamed from: j */
        public List<TypeParameter> f65135j;

        /* renamed from: k */
        public Type f65136k;

        /* renamed from: l */
        public int f65137l;

        /* renamed from: m */
        public ValueParameter f65138m;

        /* renamed from: n */
        public int f65139n;

        /* renamed from: o */
        public int f65140o;

        /* renamed from: p */
        public List<Integer> f65141p;

        /* renamed from: q */
        public byte f65142q;

        /* renamed from: r */
        public int f65143r;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1 */
        public static class C66641 extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* renamed from: e */
            public int f65144e;

            /* renamed from: f */
            public int f65145f = 518;

            /* renamed from: g */
            public int f65146g = 2054;

            /* renamed from: h */
            public int f65147h;

            /* renamed from: i */
            public Type f65148i;

            /* renamed from: j */
            public int f65149j;

            /* renamed from: k */
            public List<TypeParameter> f65150k;

            /* renamed from: l */
            public Type f65151l;

            /* renamed from: m */
            public int f65152m;

            /* renamed from: n */
            public ValueParameter f65153n;

            /* renamed from: o */
            public int f65154o;

            /* renamed from: p */
            public int f65155p;

            /* renamed from: q */
            public List<Integer> f65156q;

            public Builder() {
                Type type = Type.f65191u;
                this.f65148i = type;
                this.f65150k = Collections.emptyList();
                this.f65151l = type;
                this.f65153n = ValueParameter.f65306m;
                this.f65156q = Collections.emptyList();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Property m33036m = m33036m();
                if (m33036m.mo32959e()) {
                    return m33036m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33039p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33039p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33038o((Property) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public Property m33036m() {
                Property property = new Property(this, null);
                int i2 = this.f65144e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                property.f65130e = this.f65145f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                property.f65131f = this.f65146g;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                property.f65132g = this.f65147h;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                property.f65133h = this.f65148i;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                property.f65134i = this.f65149j;
                if ((i2 & 32) == 32) {
                    this.f65150k = Collections.unmodifiableList(this.f65150k);
                    this.f65144e &= -33;
                }
                property.f65135j = this.f65150k;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                property.f65136k = this.f65151l;
                if ((i2 & 128) == 128) {
                    i3 |= 64;
                }
                property.f65137l = this.f65152m;
                if ((i2 & 256) == 256) {
                    i3 |= 128;
                }
                property.f65138m = this.f65153n;
                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    i3 |= 256;
                }
                property.f65139n = this.f65154o;
                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                    i3 |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                }
                property.f65140o = this.f65155p;
                if ((this.f65144e & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                    this.f65156q = Collections.unmodifiableList(this.f65156q);
                    this.f65144e &= -2049;
                }
                property.f65141p = this.f65156q;
                property.f65129d = i3;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33038o(m33036m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33038o(Property property) {
                ValueParameter valueParameter;
                Type type;
                Type type2;
                if (property == Property.f65126s) {
                    return this;
                }
                int i2 = property.f65129d;
                if ((i2 & 1) == 1) {
                    int i3 = property.f65130e;
                    this.f65144e = 1 | this.f65144e;
                    this.f65145f = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = property.f65131f;
                    this.f65144e = 2 | this.f65144e;
                    this.f65146g = i4;
                }
                if ((i2 & 4) == 4) {
                    int i5 = property.f65132g;
                    this.f65144e = 4 | this.f65144e;
                    this.f65147h = i5;
                }
                if (property.m33034u()) {
                    Type type3 = property.f65133h;
                    if ((this.f65144e & 8) != 8 || (type2 = this.f65148i) == Type.f65191u) {
                        this.f65148i = type3;
                    } else {
                        this.f65148i = C3033a.m17747i(type2, type3);
                    }
                    this.f65144e |= 8;
                }
                if ((property.f65129d & 16) == 16) {
                    int i6 = property.f65134i;
                    this.f65144e = 16 | this.f65144e;
                    this.f65149j = i6;
                }
                if (!property.f65135j.isEmpty()) {
                    if (this.f65150k.isEmpty()) {
                        this.f65150k = property.f65135j;
                        this.f65144e &= -33;
                    } else {
                        if ((this.f65144e & 32) != 32) {
                            this.f65150k = new ArrayList(this.f65150k);
                            this.f65144e |= 32;
                        }
                        this.f65150k.addAll(property.f65135j);
                    }
                }
                if (property.m33032s()) {
                    Type type4 = property.f65136k;
                    if ((this.f65144e & 64) != 64 || (type = this.f65151l) == Type.f65191u) {
                        this.f65151l = type4;
                    } else {
                        this.f65151l = C3033a.m17747i(type, type4);
                    }
                    this.f65144e |= 64;
                }
                if (property.m33033t()) {
                    int i7 = property.f65137l;
                    this.f65144e |= 128;
                    this.f65152m = i7;
                }
                if ((property.f65129d & 128) == 128) {
                    ValueParameter valueParameter2 = property.f65138m;
                    if ((this.f65144e & 256) != 256 || (valueParameter = this.f65153n) == ValueParameter.f65306m) {
                        this.f65153n = valueParameter2;
                    } else {
                        ValueParameter.Builder builder = new ValueParameter.Builder();
                        builder.m33096o(valueParameter);
                        builder.m33096o(valueParameter2);
                        this.f65153n = builder.m33094m();
                    }
                    this.f65144e |= 256;
                }
                int i8 = property.f65129d;
                if ((i8 & 256) == 256) {
                    int i9 = property.f65139n;
                    this.f65144e |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                    this.f65154o = i9;
                }
                if ((i8 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    int i10 = property.f65140o;
                    this.f65144e |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                    this.f65155p = i10;
                }
                if (!property.f65141p.isEmpty()) {
                    if (this.f65156q.isEmpty()) {
                        this.f65156q = property.f65141p;
                        this.f65144e &= -2049;
                    } else {
                        if ((this.f65144e & RecyclerView.ViewHolder.FLAG_MOVED) != 2048) {
                            this.f65156q = new ArrayList(this.f65156q);
                            this.f65144e |= RecyclerView.ViewHolder.FLAG_MOVED;
                        }
                        this.f65156q.addAll(property.f65141p);
                    }
                }
                m33313l(property);
                this.f65656b = this.f65656b.m33231b(property.f65128c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder m33039p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.f65127t     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.C66641) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33038o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33038o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.m33039p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$Builder");
            }
        }

        static {
            Property property = new Property();
            f65126s = property;
            property.m33035v();
        }

        public Property(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65142q = (byte) -1;
            this.f65143r = -1;
            this.f65128c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65126s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33038o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65143r;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65129d & 2) == 2 ? CodedOutputStream.m33263c(1, this.f65131f) + 0 : 0;
            if ((this.f65129d & 4) == 4) {
                m33263c += CodedOutputStream.m33263c(2, this.f65132g);
            }
            if ((this.f65129d & 8) == 8) {
                m33263c += CodedOutputStream.m33265e(3, this.f65133h);
            }
            for (int i3 = 0; i3 < this.f65135j.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(4, this.f65135j.get(i3));
            }
            if ((this.f65129d & 32) == 32) {
                m33263c += CodedOutputStream.m33265e(5, this.f65136k);
            }
            if ((this.f65129d & 128) == 128) {
                m33263c += CodedOutputStream.m33265e(6, this.f65138m);
            }
            if ((this.f65129d & 256) == 256) {
                m33263c += CodedOutputStream.m33263c(7, this.f65139n);
            }
            if ((this.f65129d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                m33263c += CodedOutputStream.m33263c(8, this.f65140o);
            }
            if ((this.f65129d & 16) == 16) {
                m33263c += CodedOutputStream.m33263c(9, this.f65134i);
            }
            if ((this.f65129d & 64) == 64) {
                m33263c += CodedOutputStream.m33263c(10, this.f65137l);
            }
            if ((this.f65129d & 1) == 1) {
                m33263c += CodedOutputStream.m33263c(11, this.f65130e);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f65141p.size(); i5++) {
                i4 += CodedOutputStream.m33264d(this.f65141p.get(i5).intValue());
            }
            int size = this.f65128c.size() + m33315j() + C2052a.m12266a(this.f65141p, 2, m33263c + i4);
            this.f65143r = size;
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
            byte b = this.f65142q;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f65129d & 4) == 4)) {
                this.f65142q = (byte) 0;
                return false;
            }
            if (m33034u() && !this.f65133h.mo32959e()) {
                this.f65142q = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f65135j.size(); i2++) {
                if (!this.f65135j.get(i2).mo32959e()) {
                    this.f65142q = (byte) 0;
                    return false;
                }
            }
            if (m33032s() && !this.f65136k.mo32959e()) {
                this.f65142q = (byte) 0;
                return false;
            }
            if (((this.f65129d & 128) == 128) && !this.f65138m.mo32959e()) {
                this.f65142q = (byte) 0;
                return false;
            }
            if (m33314i()) {
                this.f65142q = (byte) 1;
                return true;
            }
            this.f65142q = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65129d & 2) == 2) {
                codedOutputStream.m33279q(1, this.f65131f);
            }
            if ((this.f65129d & 4) == 4) {
                codedOutputStream.m33279q(2, this.f65132g);
            }
            if ((this.f65129d & 8) == 8) {
                codedOutputStream.m33281s(3, this.f65133h);
            }
            for (int i2 = 0; i2 < this.f65135j.size(); i2++) {
                codedOutputStream.m33281s(4, this.f65135j.get(i2));
            }
            if ((this.f65129d & 32) == 32) {
                codedOutputStream.m33281s(5, this.f65136k);
            }
            if ((this.f65129d & 128) == 128) {
                codedOutputStream.m33281s(6, this.f65138m);
            }
            if ((this.f65129d & 256) == 256) {
                codedOutputStream.m33279q(7, this.f65139n);
            }
            if ((this.f65129d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                codedOutputStream.m33279q(8, this.f65140o);
            }
            if ((this.f65129d & 16) == 16) {
                codedOutputStream.m33279q(9, this.f65134i);
            }
            if ((this.f65129d & 64) == 64) {
                codedOutputStream.m33279q(10, this.f65137l);
            }
            if ((this.f65129d & 1) == 1) {
                codedOutputStream.m33279q(11, this.f65130e);
            }
            for (int i3 = 0; i3 < this.f65141p.size(); i3++) {
                codedOutputStream.m33279q(31, this.f65141p.get(i3).intValue());
            }
            m33321p.m33324a(19000, codedOutputStream);
            codedOutputStream.m33284v(this.f65128c);
        }

        /* renamed from: s */
        public boolean m33032s() {
            return (this.f65129d & 32) == 32;
        }

        /* renamed from: t */
        public boolean m33033t() {
            return (this.f65129d & 64) == 64;
        }

        /* renamed from: u */
        public boolean m33034u() {
            return (this.f65129d & 8) == 8;
        }

        /* renamed from: v */
        public final void m33035v() {
            this.f65130e = 518;
            this.f65131f = 2054;
            this.f65132g = 0;
            Type type = Type.f65191u;
            this.f65133h = type;
            this.f65134i = 0;
            this.f65135j = Collections.emptyList();
            this.f65136k = type;
            this.f65137l = 0;
            this.f65138m = ValueParameter.f65306m;
            this.f65139n = 0;
            this.f65140o = 0;
            this.f65141p = Collections.emptyList();
        }

        public Property() {
            this.f65142q = (byte) -1;
            this.f65143r = -1;
            this.f65128c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65142q = (byte) -1;
            this.f65143r = -1;
            m33035v();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (true) {
                ?? r4 = 32;
                if (!z) {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            Type.Builder builder = null;
                            ValueParameter.Builder builder2 = null;
                            Type.Builder builder3 = null;
                            switch (m33255o) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f65129d |= 2;
                                    this.f65131f = codedInputStream.m33252l();
                                case 16:
                                    this.f65129d |= 4;
                                    this.f65132g = codedInputStream.m33252l();
                                case 26:
                                    if ((this.f65129d & 8) == 8) {
                                        Type type = this.f65133h;
                                        Objects.requireNonNull(type);
                                        builder = Type.m33055y(type);
                                    }
                                    Type type2 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                    this.f65133h = type2;
                                    if (builder != null) {
                                        builder.mo32967j(type2);
                                        this.f65133h = builder.m33069m();
                                    }
                                    this.f65129d |= 8;
                                case 34:
                                    if ((i2 & 32) != 32) {
                                        this.f65135j = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.f65135j.add(codedInputStream.m33248h(TypeParameter.f65271o, extensionRegistryLite));
                                case 42:
                                    if ((this.f65129d & 32) == 32) {
                                        Type type3 = this.f65136k;
                                        Objects.requireNonNull(type3);
                                        builder3 = Type.m33055y(type3);
                                    }
                                    Type type4 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                    this.f65136k = type4;
                                    if (builder3 != null) {
                                        builder3.mo32967j(type4);
                                        this.f65136k = builder3.m33069m();
                                    }
                                    this.f65129d |= 32;
                                case 50:
                                    if ((this.f65129d & 128) == 128) {
                                        ValueParameter valueParameter = this.f65138m;
                                        Objects.requireNonNull(valueParameter);
                                        builder2 = new ValueParameter.Builder();
                                        builder2.m33096o(valueParameter);
                                    }
                                    ValueParameter valueParameter2 = (ValueParameter) codedInputStream.m33248h(ValueParameter.f65307n, extensionRegistryLite);
                                    this.f65138m = valueParameter2;
                                    if (builder2 != null) {
                                        builder2.m33096o(valueParameter2);
                                        this.f65138m = builder2.m33094m();
                                    }
                                    this.f65129d |= 128;
                                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                                    this.f65129d |= 256;
                                    this.f65139n = codedInputStream.m33252l();
                                case 64:
                                    this.f65129d |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                                    this.f65140o = codedInputStream.m33252l();
                                case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                    this.f65129d |= 16;
                                    this.f65134i = codedInputStream.m33252l();
                                case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                    this.f65129d |= 64;
                                    this.f65137l = codedInputStream.m33252l();
                                case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                    this.f65129d |= 1;
                                    this.f65130e = codedInputStream.m33252l();
                                case 248:
                                    if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) != 2048) {
                                        this.f65141p = new ArrayList();
                                        i2 |= RecyclerView.ViewHolder.FLAG_MOVED;
                                    }
                                    this.f65141p.add(Integer.valueOf(codedInputStream.m33252l()));
                                case 250:
                                    int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                    if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) != 2048 && codedInputStream.m33242b() > 0) {
                                        this.f65141p = new ArrayList();
                                        i2 |= RecyclerView.ViewHolder.FLAG_MOVED;
                                    }
                                    while (codedInputStream.m33242b() > 0) {
                                        this.f65141p.add(Integer.valueOf(codedInputStream.m33252l()));
                                    }
                                    codedInputStream.f65638i = m33244d;
                                    codedInputStream.m33256p();
                                    break;
                                default:
                                    r4 = m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o);
                                    if (r4 == 0) {
                                        z = true;
                                    }
                            }
                        } catch (Throwable th) {
                            if ((i2 & 32) == r4) {
                                this.f65135j = Collections.unmodifiableList(this.f65135j);
                            }
                            if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                                this.f65141p = Collections.unmodifiableList(this.f65141p);
                            }
                            try {
                                m33270k.m33273j();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f65128c = m33226x.m33240c();
                                throw th2;
                            }
                            this.f65128c = m33226x.m33240c();
                            m33320o();
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
                } else {
                    if ((i2 & 32) == 32) {
                        this.f65135j = Collections.unmodifiableList(this.f65135j);
                    }
                    if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                        this.f65141p = Collections.unmodifiableList(this.f65141p);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f65128c = m33226x.m33240c();
                        throw th3;
                    }
                    this.f65128c = m33226x.m33240c();
                    m33320o();
                    return;
                }
            }
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {

        /* renamed from: f */
        public static final StringTable f65183f;

        /* renamed from: g */
        public static Parser<StringTable> f65184g = new C66681();

        /* renamed from: b */
        public final ByteString f65185b;

        /* renamed from: c */
        public LazyStringList f65186c;

        /* renamed from: d */
        public byte f65187d;

        /* renamed from: e */
        public int f65188e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1 */
        public static class C66681 extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* renamed from: c */
            public int f65189c;

            /* renamed from: d */
            public LazyStringList f65190d = LazyStringArrayList.f65679c;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                StringTable m33051k = m33051k();
                if (m33051k.mo32959e()) {
                    return m33051k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33054n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33054n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(StringTable stringTable) {
                m33053m(stringTable);
                return this;
            }

            /* renamed from: k */
            public StringTable m33051k() {
                StringTable stringTable = new StringTable(this, null);
                if ((this.f65189c & 1) == 1) {
                    this.f65190d = this.f65190d.mo33336n();
                    this.f65189c &= -2;
                }
                stringTable.f65186c = this.f65190d;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33053m(m33051k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33053m(StringTable stringTable) {
                if (stringTable == StringTable.f65183f) {
                    return this;
                }
                if (!stringTable.f65186c.isEmpty()) {
                    if (this.f65190d.isEmpty()) {
                        this.f65190d = stringTable.f65186c;
                        this.f65189c &= -2;
                    } else {
                        if ((this.f65189c & 1) != 1) {
                            this.f65190d = new LazyStringArrayList(this.f65190d);
                            this.f65189c |= 1;
                        }
                        this.f65190d.addAll(stringTable.f65186c);
                    }
                }
                this.f65656b = this.f65656b.m33231b(stringTable.f65185b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder m33054n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.f65184g     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.C66681) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33053m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33053m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.m33054n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$Builder");
            }
        }

        static {
            StringTable stringTable = new StringTable();
            f65183f = stringTable;
            stringTable.f65186c = LazyStringArrayList.f65679c;
        }

        public StringTable(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f65187d = (byte) -1;
            this.f65188e = -1;
            this.f65185b = builder.f65656b;
        }

        /* renamed from: i */
        public static Builder m33050i(StringTable stringTable) {
            Builder builder = new Builder();
            builder.m33053m(stringTable);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            return m33050i(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65188e;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65186c.size(); i4++) {
                i3 += CodedOutputStream.m33261a(this.f65186c.mo33333O0(i4));
            }
            int size = this.f65185b.size() + (this.f65186c.size() * 1) + 0 + i3;
            this.f65188e = size;
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
            byte b = this.f65187d;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65187d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f65186c.size(); i2++) {
                codedOutputStream.m33275m(1, this.f65186c.mo33333O0(i2));
            }
            codedOutputStream.m33284v(this.f65185b);
        }

        public StringTable() {
            this.f65187d = (byte) -1;
            this.f65188e = -1;
            this.f65185b = ByteString.f65623b;
        }

        public StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65187d = (byte) -1;
            this.f65188e = -1;
            this.f65186c = LazyStringArrayList.f65679c;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o != 10) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    ByteString m33246f = codedInputStream.m33246f();
                                    if (!(z2 & true)) {
                                        this.f65186c = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.f65186c.mo33334e1(m33246f);
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
                    if (z2 & true) {
                        this.f65186c = this.f65186c.mo33336n();
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65185b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65185b = m33226x.m33240c();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f65186c = this.f65186c.mo33336n();
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65185b = m33226x.m33240c();
                throw th3;
            }
            this.f65185b = m33226x.m33240c();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {

        /* renamed from: p */
        public static final TypeAlias f65245p;

        /* renamed from: q */
        public static Parser<TypeAlias> f65246q = new C66721();

        /* renamed from: c */
        public final ByteString f65247c;

        /* renamed from: d */
        public int f65248d;

        /* renamed from: e */
        public int f65249e;

        /* renamed from: f */
        public int f65250f;

        /* renamed from: g */
        public List<TypeParameter> f65251g;

        /* renamed from: h */
        public Type f65252h;

        /* renamed from: i */
        public int f65253i;

        /* renamed from: j */
        public Type f65254j;

        /* renamed from: k */
        public int f65255k;

        /* renamed from: l */
        public List<Annotation> f65256l;

        /* renamed from: m */
        public List<Integer> f65257m;

        /* renamed from: n */
        public byte f65258n;

        /* renamed from: o */
        public int f65259o;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1 */
        public static class C66721 extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* renamed from: e */
            public int f65260e;

            /* renamed from: g */
            public int f65262g;

            /* renamed from: i */
            public Type f65264i;

            /* renamed from: j */
            public int f65265j;

            /* renamed from: k */
            public Type f65266k;

            /* renamed from: l */
            public int f65267l;

            /* renamed from: m */
            public List<Annotation> f65268m;

            /* renamed from: n */
            public List<Integer> f65269n;

            /* renamed from: f */
            public int f65261f = 6;

            /* renamed from: h */
            public List<TypeParameter> f65263h = Collections.emptyList();

            public Builder() {
                Type type = Type.f65191u;
                this.f65264i = type;
                this.f65266k = type;
                this.f65268m = Collections.emptyList();
                this.f65269n = Collections.emptyList();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                TypeAlias m33076m = m33076m();
                if (m33076m.mo32959e()) {
                    return m33076m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33079p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33079p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33078o((TypeAlias) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public TypeAlias m33076m() {
                TypeAlias typeAlias = new TypeAlias(this, null);
                int i2 = this.f65260e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                typeAlias.f65249e = this.f65261f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                typeAlias.f65250f = this.f65262g;
                if ((i2 & 4) == 4) {
                    this.f65263h = Collections.unmodifiableList(this.f65263h);
                    this.f65260e &= -5;
                }
                typeAlias.f65251g = this.f65263h;
                if ((i2 & 8) == 8) {
                    i3 |= 4;
                }
                typeAlias.f65252h = this.f65264i;
                if ((i2 & 16) == 16) {
                    i3 |= 8;
                }
                typeAlias.f65253i = this.f65265j;
                if ((i2 & 32) == 32) {
                    i3 |= 16;
                }
                typeAlias.f65254j = this.f65266k;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                typeAlias.f65255k = this.f65267l;
                if ((this.f65260e & 128) == 128) {
                    this.f65268m = Collections.unmodifiableList(this.f65268m);
                    this.f65260e &= -129;
                }
                typeAlias.f65256l = this.f65268m;
                if ((this.f65260e & 256) == 256) {
                    this.f65269n = Collections.unmodifiableList(this.f65269n);
                    this.f65260e &= -257;
                }
                typeAlias.f65257m = this.f65269n;
                typeAlias.f65248d = i3;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33078o(m33076m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33078o(TypeAlias typeAlias) {
                Type type;
                Type type2;
                if (typeAlias == TypeAlias.f65245p) {
                    return this;
                }
                int i2 = typeAlias.f65248d;
                if ((i2 & 1) == 1) {
                    int i3 = typeAlias.f65249e;
                    this.f65260e = 1 | this.f65260e;
                    this.f65261f = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = typeAlias.f65250f;
                    this.f65260e = 2 | this.f65260e;
                    this.f65262g = i4;
                }
                if (!typeAlias.f65251g.isEmpty()) {
                    if (this.f65263h.isEmpty()) {
                        this.f65263h = typeAlias.f65251g;
                        this.f65260e &= -5;
                    } else {
                        if ((this.f65260e & 4) != 4) {
                            this.f65263h = new ArrayList(this.f65263h);
                            this.f65260e |= 4;
                        }
                        this.f65263h.addAll(typeAlias.f65251g);
                    }
                }
                if (typeAlias.m33074t()) {
                    Type type3 = typeAlias.f65252h;
                    if ((this.f65260e & 8) != 8 || (type2 = this.f65264i) == Type.f65191u) {
                        this.f65264i = type3;
                    } else {
                        this.f65264i = C3033a.m17747i(type2, type3);
                    }
                    this.f65260e |= 8;
                }
                if ((typeAlias.f65248d & 8) == 8) {
                    int i5 = typeAlias.f65253i;
                    this.f65260e |= 16;
                    this.f65265j = i5;
                }
                if (typeAlias.m33073s()) {
                    Type type4 = typeAlias.f65254j;
                    if ((this.f65260e & 32) != 32 || (type = this.f65266k) == Type.f65191u) {
                        this.f65266k = type4;
                    } else {
                        this.f65266k = C3033a.m17747i(type, type4);
                    }
                    this.f65260e |= 32;
                }
                if ((typeAlias.f65248d & 32) == 32) {
                    int i6 = typeAlias.f65255k;
                    this.f65260e |= 64;
                    this.f65267l = i6;
                }
                if (!typeAlias.f65256l.isEmpty()) {
                    if (this.f65268m.isEmpty()) {
                        this.f65268m = typeAlias.f65256l;
                        this.f65260e &= -129;
                    } else {
                        if ((this.f65260e & 128) != 128) {
                            this.f65268m = new ArrayList(this.f65268m);
                            this.f65260e |= 128;
                        }
                        this.f65268m.addAll(typeAlias.f65256l);
                    }
                }
                if (!typeAlias.f65257m.isEmpty()) {
                    if (this.f65269n.isEmpty()) {
                        this.f65269n = typeAlias.f65257m;
                        this.f65260e &= -257;
                    } else {
                        if ((this.f65260e & 256) != 256) {
                            this.f65269n = new ArrayList(this.f65269n);
                            this.f65260e |= 256;
                        }
                        this.f65269n.addAll(typeAlias.f65257m);
                    }
                }
                m33313l(typeAlias);
                this.f65656b = this.f65656b.m33231b(typeAlias.f65247c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder m33079p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.f65246q     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.C66721) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33078o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33078o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.m33079p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$Builder");
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            f65245p = typeAlias;
            typeAlias.m33075u();
        }

        public TypeAlias(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65258n = (byte) -1;
            this.f65259o = -1;
            this.f65247c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65245p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33078o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65259o;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65248d & 1) == 1 ? CodedOutputStream.m33263c(1, this.f65249e) + 0 : 0;
            if ((this.f65248d & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65250f);
            }
            for (int i3 = 0; i3 < this.f65251g.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(3, this.f65251g.get(i3));
            }
            if ((this.f65248d & 4) == 4) {
                m33263c += CodedOutputStream.m33265e(4, this.f65252h);
            }
            if ((this.f65248d & 8) == 8) {
                m33263c += CodedOutputStream.m33263c(5, this.f65253i);
            }
            if ((this.f65248d & 16) == 16) {
                m33263c += CodedOutputStream.m33265e(6, this.f65254j);
            }
            if ((this.f65248d & 32) == 32) {
                m33263c += CodedOutputStream.m33263c(7, this.f65255k);
            }
            for (int i4 = 0; i4 < this.f65256l.size(); i4++) {
                m33263c += CodedOutputStream.m33265e(8, this.f65256l.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f65257m.size(); i6++) {
                i5 += CodedOutputStream.m33264d(this.f65257m.get(i6).intValue());
            }
            int size = this.f65247c.size() + m33315j() + C2052a.m12266a(this.f65257m, 2, m33263c + i5);
            this.f65259o = size;
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
            byte b = this.f65258n;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f65248d & 2) == 2)) {
                this.f65258n = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f65251g.size(); i2++) {
                if (!this.f65251g.get(i2).mo32959e()) {
                    this.f65258n = (byte) 0;
                    return false;
                }
            }
            if (m33074t() && !this.f65252h.mo32959e()) {
                this.f65258n = (byte) 0;
                return false;
            }
            if (m33073s() && !this.f65254j.mo32959e()) {
                this.f65258n = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.f65256l.size(); i3++) {
                if (!this.f65256l.get(i3).mo32959e()) {
                    this.f65258n = (byte) 0;
                    return false;
                }
            }
            if (m33314i()) {
                this.f65258n = (byte) 1;
                return true;
            }
            this.f65258n = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65248d & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65249e);
            }
            if ((this.f65248d & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65250f);
            }
            for (int i2 = 0; i2 < this.f65251g.size(); i2++) {
                codedOutputStream.m33281s(3, this.f65251g.get(i2));
            }
            if ((this.f65248d & 4) == 4) {
                codedOutputStream.m33281s(4, this.f65252h);
            }
            if ((this.f65248d & 8) == 8) {
                codedOutputStream.m33279q(5, this.f65253i);
            }
            if ((this.f65248d & 16) == 16) {
                codedOutputStream.m33281s(6, this.f65254j);
            }
            if ((this.f65248d & 32) == 32) {
                codedOutputStream.m33279q(7, this.f65255k);
            }
            for (int i3 = 0; i3 < this.f65256l.size(); i3++) {
                codedOutputStream.m33281s(8, this.f65256l.get(i3));
            }
            for (int i4 = 0; i4 < this.f65257m.size(); i4++) {
                codedOutputStream.m33279q(31, this.f65257m.get(i4).intValue());
            }
            m33321p.m33324a(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, codedOutputStream);
            codedOutputStream.m33284v(this.f65247c);
        }

        /* renamed from: s */
        public boolean m33073s() {
            return (this.f65248d & 16) == 16;
        }

        /* renamed from: t */
        public boolean m33074t() {
            return (this.f65248d & 4) == 4;
        }

        /* renamed from: u */
        public final void m33075u() {
            this.f65249e = 6;
            this.f65250f = 0;
            this.f65251g = Collections.emptyList();
            Type type = Type.f65191u;
            this.f65252h = type;
            this.f65253i = 0;
            this.f65254j = type;
            this.f65255k = 0;
            this.f65256l = Collections.emptyList();
            this.f65257m = Collections.emptyList();
        }

        public TypeAlias() {
            this.f65258n = (byte) -1;
            this.f65259o = -1;
            this.f65247c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65258n = (byte) -1;
            this.f65259o = -1;
            m33075u();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (true) {
                ?? r4 = 128;
                if (!z) {
                    try {
                        try {
                            try {
                                int m33255o = codedInputStream.m33255o();
                                Type.Builder builder = null;
                                switch (m33255o) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        this.f65248d |= 1;
                                        this.f65249e = codedInputStream.m33252l();
                                    case 16:
                                        this.f65248d |= 2;
                                        this.f65250f = codedInputStream.m33252l();
                                    case 26:
                                        if ((i2 & 4) != 4) {
                                            this.f65251g = new ArrayList();
                                            i2 |= 4;
                                        }
                                        this.f65251g.add(codedInputStream.m33248h(TypeParameter.f65271o, extensionRegistryLite));
                                    case 34:
                                        if ((this.f65248d & 4) == 4) {
                                            Type type = this.f65252h;
                                            Objects.requireNonNull(type);
                                            builder = Type.m33055y(type);
                                        }
                                        Type type2 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                        this.f65252h = type2;
                                        if (builder != null) {
                                            builder.mo32967j(type2);
                                            this.f65252h = builder.m33069m();
                                        }
                                        this.f65248d |= 4;
                                    case 40:
                                        this.f65248d |= 8;
                                        this.f65253i = codedInputStream.m33252l();
                                    case 50:
                                        if ((this.f65248d & 16) == 16) {
                                            Type type3 = this.f65254j;
                                            Objects.requireNonNull(type3);
                                            builder = Type.m33055y(type3);
                                        }
                                        Type type4 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                        this.f65254j = type4;
                                        if (builder != null) {
                                            builder.mo32967j(type4);
                                            this.f65254j = builder.m33069m();
                                        }
                                        this.f65248d |= 16;
                                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                                        this.f65248d |= 32;
                                        this.f65255k = codedInputStream.m33252l();
                                    case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        if ((i2 & 128) != 128) {
                                            this.f65256l = new ArrayList();
                                            i2 |= 128;
                                        }
                                        this.f65256l.add(codedInputStream.m33248h(Annotation.f64854i, extensionRegistryLite));
                                    case 248:
                                        if ((i2 & 256) != 256) {
                                            this.f65257m = new ArrayList();
                                            i2 |= 256;
                                        }
                                        this.f65257m.add(Integer.valueOf(codedInputStream.m33252l()));
                                    case 250:
                                        int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                        if ((i2 & 256) != 256 && codedInputStream.m33242b() > 0) {
                                            this.f65257m = new ArrayList();
                                            i2 |= 256;
                                        }
                                        while (codedInputStream.m33242b() > 0) {
                                            this.f65257m.add(Integer.valueOf(codedInputStream.m33252l()));
                                        }
                                        codedInputStream.f65638i = m33244d;
                                        codedInputStream.m33256p();
                                        break;
                                    default:
                                        r4 = m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o);
                                        if (r4 == 0) {
                                            z = true;
                                        }
                                }
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
                        if ((i2 & 4) == 4) {
                            this.f65251g = Collections.unmodifiableList(this.f65251g);
                        }
                        if ((i2 & 128) == r4) {
                            this.f65256l = Collections.unmodifiableList(this.f65256l);
                        }
                        if ((i2 & 256) == 256) {
                            this.f65257m = Collections.unmodifiableList(this.f65257m);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65247c = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65247c = m33226x.m33240c();
                        m33320o();
                        throw th;
                    }
                } else {
                    if ((i2 & 4) == 4) {
                        this.f65251g = Collections.unmodifiableList(this.f65251g);
                    }
                    if ((i2 & 128) == 128) {
                        this.f65256l = Collections.unmodifiableList(this.f65256l);
                    }
                    if ((i2 & 256) == 256) {
                        this.f65257m = Collections.unmodifiableList(this.f65257m);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f65247c = m33226x.m33240c();
                        throw th3;
                    }
                    this.f65247c = m33226x.m33240c();
                    m33320o();
                    return;
                }
            }
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {

        /* renamed from: h */
        public static final TypeTable f65295h;

        /* renamed from: i */
        public static Parser<TypeTable> f65296i = new C66751();

        /* renamed from: b */
        public final ByteString f65297b;

        /* renamed from: c */
        public int f65298c;

        /* renamed from: d */
        public List<Type> f65299d;

        /* renamed from: e */
        public int f65300e;

        /* renamed from: f */
        public byte f65301f;

        /* renamed from: g */
        public int f65302g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1 */
        public static class C66751 extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* renamed from: c */
            public int f65303c;

            /* renamed from: d */
            public List<Type> f65304d = Collections.emptyList();

            /* renamed from: e */
            public int f65305e = -1;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                TypeTable m33088k = m33088k();
                if (m33088k.mo32959e()) {
                    return m33088k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33091n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33091n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(TypeTable typeTable) {
                m33090m(typeTable);
                return this;
            }

            /* renamed from: k */
            public TypeTable m33088k() {
                TypeTable typeTable = new TypeTable(this, null);
                int i2 = this.f65303c;
                if ((i2 & 1) == 1) {
                    this.f65304d = Collections.unmodifiableList(this.f65304d);
                    this.f65303c &= -2;
                }
                typeTable.f65299d = this.f65304d;
                int i3 = (i2 & 2) != 2 ? 0 : 1;
                typeTable.f65300e = this.f65305e;
                typeTable.f65298c = i3;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33090m(m33088k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33090m(TypeTable typeTable) {
                if (typeTable == TypeTable.f65295h) {
                    return this;
                }
                if (!typeTable.f65299d.isEmpty()) {
                    if (this.f65304d.isEmpty()) {
                        this.f65304d = typeTable.f65299d;
                        this.f65303c &= -2;
                    } else {
                        if ((this.f65303c & 1) != 1) {
                            this.f65304d = new ArrayList(this.f65304d);
                            this.f65303c |= 1;
                        }
                        this.f65304d.addAll(typeTable.f65299d);
                    }
                }
                if ((typeTable.f65298c & 1) == 1) {
                    int i2 = typeTable.f65300e;
                    this.f65303c |= 2;
                    this.f65305e = i2;
                }
                this.f65656b = this.f65656b.m33231b(typeTable.f65297b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder m33091n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.f65296i     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.C66751) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33090m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33090m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.m33091n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder");
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            f65295h = typeTable;
            typeTable.f65299d = Collections.emptyList();
            typeTable.f65300e = -1;
        }

        public TypeTable(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f65301f = (byte) -1;
            this.f65302g = -1;
            this.f65297b = builder.f65656b;
        }

        /* renamed from: i */
        public static Builder m33086i(TypeTable typeTable) {
            Builder builder = new Builder();
            builder.m33090m(typeTable);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            return m33086i(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65302g;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65299d.size(); i4++) {
                i3 += CodedOutputStream.m33265e(1, this.f65299d.get(i4));
            }
            if ((this.f65298c & 1) == 1) {
                i3 += CodedOutputStream.m33263c(2, this.f65300e);
            }
            int size = this.f65297b.size() + i3;
            this.f65302g = size;
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
            byte b = this.f65301f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f65299d.size(); i2++) {
                if (!this.f65299d.get(i2).mo32959e()) {
                    this.f65301f = (byte) 0;
                    return false;
                }
            }
            this.f65301f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f65299d.size(); i2++) {
                codedOutputStream.m33281s(1, this.f65299d.get(i2));
            }
            if ((this.f65298c & 1) == 1) {
                codedOutputStream.m33279q(2, this.f65300e);
            }
            codedOutputStream.m33284v(this.f65297b);
        }

        /* renamed from: j */
        public Builder m33087j() {
            return m33086i(this);
        }

        public TypeTable() {
            this.f65301f = (byte) -1;
            this.f65302g = -1;
            this.f65297b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65301f = (byte) -1;
            this.f65302g = -1;
            this.f65299d = Collections.emptyList();
            this.f65300e = -1;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 10) {
                                if (!(z2 & true)) {
                                    this.f65299d = new ArrayList();
                                    z2 |= true;
                                }
                                this.f65299d.add(codedInputStream.m33248h(Type.f65192v, extensionRegistryLite));
                            } else if (m33255o != 16) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                this.f65298c |= 1;
                                this.f65300e = codedInputStream.m33252l();
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
                    if (z2 & true) {
                        this.f65299d = Collections.unmodifiableList(this.f65299d);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65297b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65297b = m33226x.m33240c();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f65299d = Collections.unmodifiableList(this.f65299d);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65297b = m33226x.m33240c();
                throw th3;
            }
            this.f65297b = m33226x.m33240c();
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {

        /* renamed from: m */
        public static final ValueParameter f65306m;

        /* renamed from: n */
        public static Parser<ValueParameter> f65307n = new C66761();

        /* renamed from: c */
        public final ByteString f65308c;

        /* renamed from: d */
        public int f65309d;

        /* renamed from: e */
        public int f65310e;

        /* renamed from: f */
        public int f65311f;

        /* renamed from: g */
        public Type f65312g;

        /* renamed from: h */
        public int f65313h;

        /* renamed from: i */
        public Type f65314i;

        /* renamed from: j */
        public int f65315j;

        /* renamed from: k */
        public byte f65316k;

        /* renamed from: l */
        public int f65317l;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1 */
        public static class C66761 extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* renamed from: e */
            public int f65318e;

            /* renamed from: f */
            public int f65319f;

            /* renamed from: g */
            public int f65320g;

            /* renamed from: h */
            public Type f65321h;

            /* renamed from: i */
            public int f65322i;

            /* renamed from: j */
            public Type f65323j;

            /* renamed from: k */
            public int f65324k;

            public Builder() {
                Type type = Type.f65191u;
                this.f65321h = type;
                this.f65323j = type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                ValueParameter m33094m = m33094m();
                if (m33094m.mo32959e()) {
                    return m33094m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33097p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33097p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33096o((ValueParameter) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public ValueParameter m33094m() {
                ValueParameter valueParameter = new ValueParameter(this, null);
                int i2 = this.f65318e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                valueParameter.f65310e = this.f65319f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                valueParameter.f65311f = this.f65320g;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                valueParameter.f65312g = this.f65321h;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                valueParameter.f65313h = this.f65322i;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                valueParameter.f65314i = this.f65323j;
                if ((i2 & 32) == 32) {
                    i3 |= 32;
                }
                valueParameter.f65315j = this.f65324k;
                valueParameter.f65309d = i3;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33096o(m33094m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33096o(ValueParameter valueParameter) {
                Type type;
                Type type2;
                if (valueParameter == ValueParameter.f65306m) {
                    return this;
                }
                int i2 = valueParameter.f65309d;
                if ((i2 & 1) == 1) {
                    int i3 = valueParameter.f65310e;
                    this.f65318e = 1 | this.f65318e;
                    this.f65319f = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = valueParameter.f65311f;
                    this.f65318e = 2 | this.f65318e;
                    this.f65320g = i4;
                }
                if (valueParameter.m33092s()) {
                    Type type3 = valueParameter.f65312g;
                    if ((this.f65318e & 4) != 4 || (type2 = this.f65321h) == Type.f65191u) {
                        this.f65321h = type3;
                    } else {
                        this.f65321h = C3033a.m17747i(type2, type3);
                    }
                    this.f65318e |= 4;
                }
                if ((valueParameter.f65309d & 8) == 8) {
                    int i5 = valueParameter.f65313h;
                    this.f65318e = 8 | this.f65318e;
                    this.f65322i = i5;
                }
                if (valueParameter.m33093t()) {
                    Type type4 = valueParameter.f65314i;
                    if ((this.f65318e & 16) != 16 || (type = this.f65323j) == Type.f65191u) {
                        this.f65323j = type4;
                    } else {
                        this.f65323j = C3033a.m17747i(type, type4);
                    }
                    this.f65318e |= 16;
                }
                if ((valueParameter.f65309d & 32) == 32) {
                    int i6 = valueParameter.f65315j;
                    this.f65318e = 32 | this.f65318e;
                    this.f65324k = i6;
                }
                m33313l(valueParameter);
                this.f65656b = this.f65656b.m33231b(valueParameter.f65308c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder m33097p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.f65307n     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.C66761) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33096o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33096o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.m33097p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder");
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            f65306m = valueParameter;
            valueParameter.f65310e = 0;
            valueParameter.f65311f = 0;
            Type type = Type.f65191u;
            valueParameter.f65312g = type;
            valueParameter.f65313h = 0;
            valueParameter.f65314i = type;
            valueParameter.f65315j = 0;
        }

        public ValueParameter(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65316k = (byte) -1;
            this.f65317l = -1;
            this.f65308c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65306m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33096o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65317l;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65309d & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f65310e) : 0;
            if ((this.f65309d & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65311f);
            }
            if ((this.f65309d & 4) == 4) {
                m33263c += CodedOutputStream.m33265e(3, this.f65312g);
            }
            if ((this.f65309d & 16) == 16) {
                m33263c += CodedOutputStream.m33265e(4, this.f65314i);
            }
            if ((this.f65309d & 8) == 8) {
                m33263c += CodedOutputStream.m33263c(5, this.f65313h);
            }
            if ((this.f65309d & 32) == 32) {
                m33263c += CodedOutputStream.m33263c(6, this.f65315j);
            }
            int size = this.f65308c.size() + m33315j() + m33263c;
            this.f65317l = size;
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
            byte b = this.f65316k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f65309d & 2) == 2)) {
                this.f65316k = (byte) 0;
                return false;
            }
            if (m33092s() && !this.f65312g.mo32959e()) {
                this.f65316k = (byte) 0;
                return false;
            }
            if (m33093t() && !this.f65314i.mo32959e()) {
                this.f65316k = (byte) 0;
                return false;
            }
            if (m33314i()) {
                this.f65316k = (byte) 1;
                return true;
            }
            this.f65316k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65309d & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65310e);
            }
            if ((this.f65309d & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65311f);
            }
            if ((this.f65309d & 4) == 4) {
                codedOutputStream.m33281s(3, this.f65312g);
            }
            if ((this.f65309d & 16) == 16) {
                codedOutputStream.m33281s(4, this.f65314i);
            }
            if ((this.f65309d & 8) == 8) {
                codedOutputStream.m33279q(5, this.f65313h);
            }
            if ((this.f65309d & 32) == 32) {
                codedOutputStream.m33279q(6, this.f65315j);
            }
            m33321p.m33324a(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, codedOutputStream);
            codedOutputStream.m33284v(this.f65308c);
        }

        /* renamed from: s */
        public boolean m33092s() {
            return (this.f65309d & 4) == 4;
        }

        /* renamed from: t */
        public boolean m33093t() {
            return (this.f65309d & 16) == 16;
        }

        public ValueParameter() {
            this.f65316k = (byte) -1;
            this.f65317l = -1;
            this.f65308c = ByteString.f65623b;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65316k = (byte) -1;
            this.f65317l = -1;
            boolean z = false;
            this.f65310e = 0;
            this.f65311f = 0;
            Type type = Type.f65191u;
            this.f65312g = type;
            this.f65313h = 0;
            this.f65314i = type;
            this.f65315j = 0;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o == 8) {
                                    this.f65309d |= 1;
                                    this.f65310e = codedInputStream.m33252l();
                                } else if (m33255o != 16) {
                                    Type.Builder builder = null;
                                    if (m33255o == 26) {
                                        if ((this.f65309d & 4) == 4) {
                                            Type type2 = this.f65312g;
                                            Objects.requireNonNull(type2);
                                            builder = Type.m33055y(type2);
                                        }
                                        Type type3 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                        this.f65312g = type3;
                                        if (builder != null) {
                                            builder.mo32967j(type3);
                                            this.f65312g = builder.m33069m();
                                        }
                                        this.f65309d |= 4;
                                    } else if (m33255o == 34) {
                                        if ((this.f65309d & 16) == 16) {
                                            Type type4 = this.f65314i;
                                            Objects.requireNonNull(type4);
                                            builder = Type.m33055y(type4);
                                        }
                                        Type type5 = (Type) codedInputStream.m33248h(Type.f65192v, extensionRegistryLite);
                                        this.f65314i = type5;
                                        if (builder != null) {
                                            builder.mo32967j(type5);
                                            this.f65314i = builder.m33069m();
                                        }
                                        this.f65309d |= 16;
                                    } else if (m33255o == 40) {
                                        this.f65309d |= 8;
                                        this.f65313h = codedInputStream.m33252l();
                                    } else if (m33255o != 48) {
                                        if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                        }
                                    } else {
                                        this.f65309d |= 32;
                                        this.f65315j = codedInputStream.m33252l();
                                    }
                                } else {
                                    this.f65309d |= 2;
                                    this.f65311f = codedInputStream.m33252l();
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
                        this.f65308c = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65308c = m33226x.m33240c();
                    m33320o();
                    throw th;
                }
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65308c = m33226x.m33240c();
                throw th3;
            }
            this.f65308c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {

        /* renamed from: l */
        public static final VersionRequirement f65325l;

        /* renamed from: m */
        public static Parser<VersionRequirement> f65326m = new C66771();

        /* renamed from: b */
        public final ByteString f65327b;

        /* renamed from: c */
        public int f65328c;

        /* renamed from: d */
        public int f65329d;

        /* renamed from: e */
        public int f65330e;

        /* renamed from: f */
        public Level f65331f;

        /* renamed from: g */
        public int f65332g;

        /* renamed from: h */
        public int f65333h;

        /* renamed from: i */
        public VersionKind f65334i;

        /* renamed from: j */
        public byte f65335j;

        /* renamed from: k */
        public int f65336k;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1 */
        public static class C66771 extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* renamed from: c */
            public int f65337c;

            /* renamed from: d */
            public int f65338d;

            /* renamed from: e */
            public int f65339e;

            /* renamed from: g */
            public int f65341g;

            /* renamed from: h */
            public int f65342h;

            /* renamed from: f */
            public Level f65340f = Level.ERROR;

            /* renamed from: i */
            public VersionKind f65343i = VersionKind.LANGUAGE_VERSION;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                VersionRequirement m33098k = m33098k();
                if (m33098k.mo32959e()) {
                    return m33098k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33101n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33101n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(VersionRequirement versionRequirement) {
                m33100m(versionRequirement);
                return this;
            }

            /* renamed from: k */
            public VersionRequirement m33098k() {
                VersionRequirement versionRequirement = new VersionRequirement(this, null);
                int i2 = this.f65337c;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                versionRequirement.f65329d = this.f65338d;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                versionRequirement.f65330e = this.f65339e;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                versionRequirement.f65331f = this.f65340f;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                versionRequirement.f65332g = this.f65341g;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                versionRequirement.f65333h = this.f65342h;
                if ((i2 & 32) == 32) {
                    i3 |= 32;
                }
                versionRequirement.f65334i = this.f65343i;
                versionRequirement.f65328c = i3;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33100m(m33098k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33100m(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.f65325l) {
                    return this;
                }
                int i2 = versionRequirement.f65328c;
                if ((i2 & 1) == 1) {
                    int i3 = versionRequirement.f65329d;
                    this.f65337c |= 1;
                    this.f65338d = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = versionRequirement.f65330e;
                    this.f65337c = 2 | this.f65337c;
                    this.f65339e = i4;
                }
                if ((i2 & 4) == 4) {
                    Level level = versionRequirement.f65331f;
                    Objects.requireNonNull(level);
                    this.f65337c = 4 | this.f65337c;
                    this.f65340f = level;
                }
                int i5 = versionRequirement.f65328c;
                if ((i5 & 8) == 8) {
                    int i6 = versionRequirement.f65332g;
                    this.f65337c = 8 | this.f65337c;
                    this.f65341g = i6;
                }
                if ((i5 & 16) == 16) {
                    int i7 = versionRequirement.f65333h;
                    this.f65337c = 16 | this.f65337c;
                    this.f65342h = i7;
                }
                if ((i5 & 32) == 32) {
                    VersionKind versionKind = versionRequirement.f65334i;
                    Objects.requireNonNull(versionKind);
                    this.f65337c = 32 | this.f65337c;
                    this.f65343i = versionKind;
                }
                this.f65656b = this.f65656b.m33231b(versionRequirement.f65327b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder m33101n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.f65326m     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.C66771) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33100m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33100m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.m33101n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Builder");
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);


            /* renamed from: b */
            public final int f65348b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$1 */
            public static class C66781 implements Internal.EnumLiteMap<Level> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Level mo32979a(int i2) {
                    return Level.m33102a(i2);
                }
            }

            Level(int i2) {
                this.f65348b = i2;
            }

            /* renamed from: a */
            public static Level m33102a(int i2) {
                if (i2 == 0) {
                    return WARNING;
                }
                if (i2 == 1) {
                    return ERROR;
                }
                if (i2 != 2) {
                    return null;
                }
                return HIDDEN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f65348b;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);


            /* renamed from: b */
            public final int f65353b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$1 */
            public static class C66791 implements Internal.EnumLiteMap<VersionKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public VersionKind mo32979a(int i2) {
                    return VersionKind.m33103a(i2);
                }
            }

            VersionKind(int i2) {
                this.f65353b = i2;
            }

            /* renamed from: a */
            public static VersionKind m33103a(int i2) {
                if (i2 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i2 == 1) {
                    return COMPILER_VERSION;
                }
                if (i2 != 2) {
                    return null;
                }
                return API_VERSION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f65353b;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            f65325l = versionRequirement;
            versionRequirement.f65329d = 0;
            versionRequirement.f65330e = 0;
            versionRequirement.f65331f = Level.ERROR;
            versionRequirement.f65332g = 0;
            versionRequirement.f65333h = 0;
            versionRequirement.f65334i = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f65335j = (byte) -1;
            this.f65336k = -1;
            this.f65327b = builder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33100m(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65336k;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65328c & 1) == 1 ? 0 + CodedOutputStream.m33263c(1, this.f65329d) : 0;
            if ((this.f65328c & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65330e);
            }
            if ((this.f65328c & 4) == 4) {
                m33263c += CodedOutputStream.m33262b(3, this.f65331f.f65348b);
            }
            if ((this.f65328c & 8) == 8) {
                m33263c += CodedOutputStream.m33263c(4, this.f65332g);
            }
            if ((this.f65328c & 16) == 16) {
                m33263c += CodedOutputStream.m33263c(5, this.f65333h);
            }
            if ((this.f65328c & 32) == 32) {
                m33263c += CodedOutputStream.m33262b(6, this.f65334i.f65353b);
            }
            int size = this.f65327b.size() + m33263c;
            this.f65336k = size;
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
            byte b = this.f65335j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65335j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            if ((this.f65328c & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65329d);
            }
            if ((this.f65328c & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65330e);
            }
            if ((this.f65328c & 4) == 4) {
                codedOutputStream.m33277o(3, this.f65331f.f65348b);
            }
            if ((this.f65328c & 8) == 8) {
                codedOutputStream.m33279q(4, this.f65332g);
            }
            if ((this.f65328c & 16) == 16) {
                codedOutputStream.m33279q(5, this.f65333h);
            }
            if ((this.f65328c & 32) == 32) {
                codedOutputStream.m33277o(6, this.f65334i.f65353b);
            }
            codedOutputStream.m33284v(this.f65327b);
        }

        public VersionRequirement() {
            this.f65335j = (byte) -1;
            this.f65336k = -1;
            this.f65327b = ByteString.f65623b;
        }

        public VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65335j = (byte) -1;
            this.f65336k = -1;
            boolean z = false;
            this.f65329d = 0;
            this.f65330e = 0;
            this.f65331f = Level.ERROR;
            this.f65332g = 0;
            this.f65333h = 0;
            this.f65334i = VersionKind.LANGUAGE_VERSION;
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int m33255o = codedInputStream.m33255o();
                            if (m33255o != 0) {
                                if (m33255o == 8) {
                                    this.f65328c |= 1;
                                    this.f65329d = codedInputStream.m33252l();
                                } else if (m33255o == 16) {
                                    this.f65328c |= 2;
                                    this.f65330e = codedInputStream.m33252l();
                                } else if (m33255o == 24) {
                                    int m33252l = codedInputStream.m33252l();
                                    Level m33102a = Level.m33102a(m33252l);
                                    if (m33102a == null) {
                                        m33270k.m33288z(m33255o);
                                        m33270k.m33288z(m33252l);
                                    } else {
                                        this.f65328c |= 4;
                                        this.f65331f = m33102a;
                                    }
                                } else if (m33255o == 32) {
                                    this.f65328c |= 8;
                                    this.f65332g = codedInputStream.m33252l();
                                } else if (m33255o == 40) {
                                    this.f65328c |= 16;
                                    this.f65333h = codedInputStream.m33252l();
                                } else if (m33255o != 48) {
                                    if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                    }
                                } else {
                                    int m33252l2 = codedInputStream.m33252l();
                                    VersionKind m33103a = VersionKind.m33103a(m33252l2);
                                    if (m33103a == null) {
                                        m33270k.m33288z(m33255o);
                                        m33270k.m33288z(m33252l2);
                                    } else {
                                        this.f65328c |= 32;
                                        this.f65334i = m33103a;
                                    }
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
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65327b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65327b = m33226x.m33240c();
                    throw th;
                }
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65327b = m33226x.m33240c();
                throw th3;
            }
            this.f65327b = m33226x.m33240c();
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {

        /* renamed from: f */
        public static final VersionRequirementTable f65354f;

        /* renamed from: g */
        public static Parser<VersionRequirementTable> f65355g = new C66801();

        /* renamed from: b */
        public final ByteString f65356b;

        /* renamed from: c */
        public List<VersionRequirement> f65357c;

        /* renamed from: d */
        public byte f65358d;

        /* renamed from: e */
        public int f65359e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1 */
        public static class C66801 extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* renamed from: c */
            public int f65360c;

            /* renamed from: d */
            public List<VersionRequirement> f65361d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                VersionRequirementTable m33106k = m33106k();
                if (m33106k.mo32959e()) {
                    return m33106k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33109n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33109n(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ Builder mo32967j(VersionRequirementTable versionRequirementTable) {
                m33108m(versionRequirementTable);
                return this;
            }

            /* renamed from: k */
            public VersionRequirementTable m33106k() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this, null);
                if ((this.f65360c & 1) == 1) {
                    this.f65361d = Collections.unmodifiableList(this.f65361d);
                    this.f65360c &= -2;
                }
                versionRequirementTable.f65357c = this.f65361d;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33108m(m33106k());
                return builder;
            }

            /* renamed from: m */
            public Builder m33108m(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.f65354f) {
                    return this;
                }
                if (!versionRequirementTable.f65357c.isEmpty()) {
                    if (this.f65361d.isEmpty()) {
                        this.f65361d = versionRequirementTable.f65357c;
                        this.f65360c &= -2;
                    } else {
                        if ((this.f65360c & 1) != 1) {
                            this.f65361d = new ArrayList(this.f65361d);
                            this.f65360c |= 1;
                        }
                        this.f65361d.addAll(versionRequirementTable.f65357c);
                    }
                }
                this.f65656b = this.f65656b.m33231b(versionRequirementTable.f65356b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder m33109n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.f65355g     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.C66801) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33108m(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33108m(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.m33109n(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder");
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            f65354f = versionRequirementTable;
            versionRequirementTable.f65357c = Collections.emptyList();
        }

        public VersionRequirementTable(GeneratedMessageLite.Builder builder, C66441 c66441) {
            super(builder);
            this.f65358d = (byte) -1;
            this.f65359e = -1;
            this.f65356b = builder.f65656b;
        }

        /* renamed from: i */
        public static Builder m33104i(VersionRequirementTable versionRequirementTable) {
            Builder builder = new Builder();
            builder.m33108m(versionRequirementTable);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            return m33104i(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65359e;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f65357c.size(); i4++) {
                i3 += CodedOutputStream.m33265e(1, this.f65357c.get(i4));
            }
            int size = this.f65356b.size() + i3;
            this.f65359e = size;
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
            byte b = this.f65358d;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f65358d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            for (int i2 = 0; i2 < this.f65357c.size(); i2++) {
                codedOutputStream.m33281s(1, this.f65357c.get(i2));
            }
            codedOutputStream.m33284v(this.f65356b);
        }

        /* renamed from: j */
        public Builder m33105j() {
            return m33104i(this);
        }

        public VersionRequirementTable() {
            this.f65358d = (byte) -1;
            this.f65359e = -1;
            this.f65356b = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65358d = (byte) -1;
            this.f65359e = -1;
            this.f65357c = Collections.emptyList();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o != 10) {
                                if (!codedInputStream.m33258r(m33255o, m33270k)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f65357c = new ArrayList();
                                    z2 |= true;
                                }
                                this.f65357c.add(codedInputStream.m33248h(VersionRequirement.f65326m, extensionRegistryLite));
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
                    if (z2 & true) {
                        this.f65357c = Collections.unmodifiableList(this.f65357c);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f65356b = m33226x.m33240c();
                        throw th2;
                    }
                    this.f65356b = m33226x.m33240c();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f65357c = Collections.unmodifiableList(this.f65357c);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65356b = m33226x.m33240c();
                throw th3;
            }
            this.f65356b = m33226x.m33240c();
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {

        /* renamed from: n */
        public static final TypeParameter f65270n;

        /* renamed from: o */
        public static Parser<TypeParameter> f65271o = new C66731();

        /* renamed from: c */
        public final ByteString f65272c;

        /* renamed from: d */
        public int f65273d;

        /* renamed from: e */
        public int f65274e;

        /* renamed from: f */
        public int f65275f;

        /* renamed from: g */
        public boolean f65276g;

        /* renamed from: h */
        public Variance f65277h;

        /* renamed from: i */
        public List<Type> f65278i;

        /* renamed from: j */
        public List<Integer> f65279j;

        /* renamed from: k */
        public int f65280k;

        /* renamed from: l */
        public byte f65281l;

        /* renamed from: m */
        public int f65282m;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1 */
        public static class C66731 extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite, null);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* renamed from: e */
            public int f65283e;

            /* renamed from: f */
            public int f65284f;

            /* renamed from: g */
            public int f65285g;

            /* renamed from: h */
            public boolean f65286h;

            /* renamed from: i */
            public Variance f65287i = Variance.INV;

            /* renamed from: j */
            public List<Type> f65288j = Collections.emptyList();

            /* renamed from: k */
            public List<Integer> f65289k = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                TypeParameter m33081m = m33081m();
                if (m33081m.mo32959e()) {
                    return m33081m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33084p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m33084p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m33083o((TypeParameter) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public TypeParameter m33081m() {
                TypeParameter typeParameter = new TypeParameter(this, null);
                int i2 = this.f65283e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                typeParameter.f65274e = this.f65284f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                typeParameter.f65275f = this.f65285g;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                typeParameter.f65276g = this.f65286h;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                typeParameter.f65277h = this.f65287i;
                if ((i2 & 16) == 16) {
                    this.f65288j = Collections.unmodifiableList(this.f65288j);
                    this.f65283e &= -17;
                }
                typeParameter.f65278i = this.f65288j;
                if ((this.f65283e & 32) == 32) {
                    this.f65289k = Collections.unmodifiableList(this.f65289k);
                    this.f65283e &= -33;
                }
                typeParameter.f65279j = this.f65289k;
                typeParameter.f65273d = i3;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m33083o(m33081m());
                return builder;
            }

            /* renamed from: o */
            public Builder m33083o(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.f65270n) {
                    return this;
                }
                int i2 = typeParameter.f65273d;
                if ((i2 & 1) == 1) {
                    int i3 = typeParameter.f65274e;
                    this.f65283e |= 1;
                    this.f65284f = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = typeParameter.f65275f;
                    this.f65283e = 2 | this.f65283e;
                    this.f65285g = i4;
                }
                if ((i2 & 4) == 4) {
                    boolean z = typeParameter.f65276g;
                    this.f65283e = 4 | this.f65283e;
                    this.f65286h = z;
                }
                if ((i2 & 8) == 8) {
                    Variance variance = typeParameter.f65277h;
                    Objects.requireNonNull(variance);
                    this.f65283e = 8 | this.f65283e;
                    this.f65287i = variance;
                }
                if (!typeParameter.f65278i.isEmpty()) {
                    if (this.f65288j.isEmpty()) {
                        this.f65288j = typeParameter.f65278i;
                        this.f65283e &= -17;
                    } else {
                        if ((this.f65283e & 16) != 16) {
                            this.f65288j = new ArrayList(this.f65288j);
                            this.f65283e |= 16;
                        }
                        this.f65288j.addAll(typeParameter.f65278i);
                    }
                }
                if (!typeParameter.f65279j.isEmpty()) {
                    if (this.f65289k.isEmpty()) {
                        this.f65289k = typeParameter.f65279j;
                        this.f65283e &= -33;
                    } else {
                        if ((this.f65283e & 32) != 32) {
                            this.f65289k = new ArrayList(this.f65289k);
                            this.f65283e |= 32;
                        }
                        this.f65289k.addAll(typeParameter.f65279j);
                    }
                }
                m33313l(typeParameter);
                this.f65656b = this.f65656b.m33231b(typeParameter.f65272c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder m33084p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.f65271o     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.C66731) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.lang.Object r3 = r1.mo32961a(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r3     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    if (r3 == 0) goto L10
                    r2.m33083o(r3)
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m33083o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.m33084p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Builder");
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);


            /* renamed from: b */
            public final int f65294b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$1 */
            public static class C66741 implements Internal.EnumLiteMap<Variance> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Variance mo32979a(int i2) {
                    return Variance.m33085a(i2);
                }
            }

            Variance(int i2) {
                this.f65294b = i2;
            }

            /* renamed from: a */
            public static Variance m33085a(int i2) {
                if (i2 == 0) {
                    return IN;
                }
                if (i2 == 1) {
                    return OUT;
                }
                if (i2 != 2) {
                    return null;
                }
                return INV;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f65294b;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            f65270n = typeParameter;
            typeParameter.m33080s();
        }

        public TypeParameter(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f65280k = -1;
            this.f65281l = (byte) -1;
            this.f65282m = -1;
            this.f65272c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f65270n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m33083o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f65282m;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f65273d & 1) == 1 ? CodedOutputStream.m33263c(1, this.f65274e) + 0 : 0;
            if ((this.f65273d & 2) == 2) {
                m33263c += CodedOutputStream.m33263c(2, this.f65275f);
            }
            if ((this.f65273d & 4) == 4) {
                m33263c += CodedOutputStream.m33269i(3) + 1;
            }
            if ((this.f65273d & 8) == 8) {
                m33263c += CodedOutputStream.m33262b(4, this.f65277h.f65294b);
            }
            for (int i3 = 0; i3 < this.f65278i.size(); i3++) {
                m33263c += CodedOutputStream.m33265e(5, this.f65278i.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f65279j.size(); i5++) {
                i4 += CodedOutputStream.m33264d(this.f65279j.get(i5).intValue());
            }
            int i6 = m33263c + i4;
            if (!this.f65279j.isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.m33264d(i4);
            }
            this.f65280k = i4;
            int size = this.f65272c.size() + m33315j() + i6;
            this.f65282m = size;
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
            byte b = this.f65281l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i2 = this.f65273d;
            if (!((i2 & 1) == 1)) {
                this.f65281l = (byte) 0;
                return false;
            }
            if (!((i2 & 2) == 2)) {
                this.f65281l = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.f65278i.size(); i3++) {
                if (!this.f65278i.get(i3).mo32959e()) {
                    this.f65281l = (byte) 0;
                    return false;
                }
            }
            if (m33314i()) {
                this.f65281l = (byte) 1;
                return true;
            }
            this.f65281l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f65273d & 1) == 1) {
                codedOutputStream.m33279q(1, this.f65274e);
            }
            if ((this.f65273d & 2) == 2) {
                codedOutputStream.m33279q(2, this.f65275f);
            }
            if ((this.f65273d & 4) == 4) {
                boolean z = this.f65276g;
                codedOutputStream.m33288z(24);
                codedOutputStream.m33283u(z ? 1 : 0);
            }
            if ((this.f65273d & 8) == 8) {
                codedOutputStream.m33277o(4, this.f65277h.f65294b);
            }
            for (int i2 = 0; i2 < this.f65278i.size(); i2++) {
                codedOutputStream.m33281s(5, this.f65278i.get(i2));
            }
            if (this.f65279j.size() > 0) {
                codedOutputStream.m33288z(50);
                codedOutputStream.m33288z(this.f65280k);
            }
            for (int i3 = 0; i3 < this.f65279j.size(); i3++) {
                codedOutputStream.m33280r(this.f65279j.get(i3).intValue());
            }
            m33321p.m33324a(1000, codedOutputStream);
            codedOutputStream.m33284v(this.f65272c);
        }

        /* renamed from: s */
        public final void m33080s() {
            this.f65274e = 0;
            this.f65275f = 0;
            this.f65276g = false;
            this.f65277h = Variance.INV;
            this.f65278i = Collections.emptyList();
            this.f65279j = Collections.emptyList();
        }

        public TypeParameter() {
            this.f65280k = -1;
            this.f65281l = (byte) -1;
            this.f65282m = -1;
            this.f65272c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C66441 c66441) throws InvalidProtocolBufferException {
            this.f65280k = -1;
            this.f65281l = (byte) -1;
            this.f65282m = -1;
            m33080s();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        if (m33255o != 0) {
                            if (m33255o == 8) {
                                this.f65273d |= 1;
                                this.f65274e = codedInputStream.m33252l();
                            } else if (m33255o == 16) {
                                this.f65273d |= 2;
                                this.f65275f = codedInputStream.m33252l();
                            } else if (m33255o == 24) {
                                this.f65273d |= 4;
                                this.f65276g = codedInputStream.m33245e();
                            } else if (m33255o == 32) {
                                int m33252l = codedInputStream.m33252l();
                                Variance m33085a = Variance.m33085a(m33252l);
                                if (m33085a == null) {
                                    m33270k.m33288z(m33255o);
                                    m33270k.m33288z(m33252l);
                                } else {
                                    this.f65273d |= 8;
                                    this.f65277h = m33085a;
                                }
                            } else if (m33255o == 42) {
                                if ((i2 & 16) != 16) {
                                    this.f65278i = new ArrayList();
                                    i2 |= 16;
                                }
                                this.f65278i.add(codedInputStream.m33248h(Type.f65192v, extensionRegistryLite));
                            } else if (m33255o == 48) {
                                if ((i2 & 32) != 32) {
                                    this.f65279j = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f65279j.add(Integer.valueOf(codedInputStream.m33252l()));
                            } else if (m33255o != 50) {
                                if (!m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                }
                            } else {
                                int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 32) != 32 && codedInputStream.m33242b() > 0) {
                                    this.f65279j = new ArrayList();
                                    i2 |= 32;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f65279j.add(Integer.valueOf(codedInputStream.m33252l()));
                                }
                                codedInputStream.f65638i = m33244d;
                                codedInputStream.m33256p();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i2 & 16) == 16) {
                            this.f65278i = Collections.unmodifiableList(this.f65278i);
                        }
                        if ((i2 & 32) == 32) {
                            this.f65279j = Collections.unmodifiableList(this.f65279j);
                        }
                        try {
                            m33270k.m33273j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f65272c = m33226x.m33240c();
                            throw th2;
                        }
                        this.f65272c = m33226x.m33240c();
                        m33320o();
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
            if ((i2 & 16) == 16) {
                this.f65278i = Collections.unmodifiableList(this.f65278i);
            }
            if ((i2 & 32) == 32) {
                this.f65279j = Collections.unmodifiableList(this.f65279j);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f65272c = m33226x.m33240c();
                throw th3;
            }
            this.f65272c = m33226x.m33240c();
            m33320o();
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {

        /* renamed from: A */
        public static Parser<Class> f64919A = new AbstractParser<Class>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: a */
            public Object mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        };

        /* renamed from: z */
        public static final Class f64920z;

        /* renamed from: c */
        public final ByteString f64921c;

        /* renamed from: d */
        public int f64922d;

        /* renamed from: e */
        public int f64923e;

        /* renamed from: f */
        public int f64924f;

        /* renamed from: g */
        public int f64925g;

        /* renamed from: h */
        public List<TypeParameter> f64926h;

        /* renamed from: i */
        public List<Type> f64927i;

        /* renamed from: j */
        public List<Integer> f64928j;

        /* renamed from: k */
        public int f64929k;

        /* renamed from: l */
        public List<Integer> f64930l;

        /* renamed from: m */
        public int f64931m;

        /* renamed from: n */
        public List<Constructor> f64932n;

        /* renamed from: o */
        public List<Function> f64933o;

        /* renamed from: p */
        public List<Property> f64934p;

        /* renamed from: q */
        public List<TypeAlias> f64935q;

        /* renamed from: r */
        public List<EnumEntry> f64936r;

        /* renamed from: s */
        public List<Integer> f64937s;

        /* renamed from: t */
        public int f64938t;

        /* renamed from: u */
        public TypeTable f64939u;

        /* renamed from: v */
        public List<Integer> f64940v;

        /* renamed from: w */
        public VersionRequirementTable f64941w;

        /* renamed from: x */
        public byte f64942x;

        /* renamed from: y */
        public int f64943y;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {

            /* renamed from: e */
            public int f64944e;

            /* renamed from: g */
            public int f64946g;

            /* renamed from: h */
            public int f64947h;

            /* renamed from: f */
            public int f64945f = 6;

            /* renamed from: i */
            public List<TypeParameter> f64948i = Collections.emptyList();

            /* renamed from: j */
            public List<Type> f64949j = Collections.emptyList();

            /* renamed from: k */
            public List<Integer> f64950k = Collections.emptyList();

            /* renamed from: l */
            public List<Integer> f64951l = Collections.emptyList();

            /* renamed from: m */
            public List<Constructor> f64952m = Collections.emptyList();

            /* renamed from: n */
            public List<Function> f64953n = Collections.emptyList();

            /* renamed from: o */
            public List<Property> f64954o = Collections.emptyList();

            /* renamed from: p */
            public List<TypeAlias> f64955p = Collections.emptyList();

            /* renamed from: q */
            public List<EnumEntry> f64956q = Collections.emptyList();

            /* renamed from: r */
            public List<Integer> f64957r = Collections.emptyList();

            /* renamed from: s */
            public TypeTable f64958s = TypeTable.f65295h;

            /* renamed from: t */
            public List<Integer> f64959t = Collections.emptyList();

            /* renamed from: u */
            public VersionRequirementTable f64960u = VersionRequirementTable.f65354f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: A */
            public MessageLite mo32962A() {
                Class m32987m = m32987m();
                if (m32987m.mo32959e()) {
                    return m32987m;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: b0 */
            public /* bridge */ /* synthetic */ MessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32990p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: h */
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                m32990p(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: j */
            public /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo32967j(GeneratedMessageLite generatedMessageLite) {
                m32989o((Class) generatedMessageLite);
                return this;
            }

            /* renamed from: m */
            public Class m32987m() {
                Class r0 = new Class(this, (C66441) null);
                int i2 = this.f64944e;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                r0.f64923e = this.f64945f;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                r0.f64924f = this.f64946g;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                r0.f64925g = this.f64947h;
                if ((i2 & 8) == 8) {
                    this.f64948i = Collections.unmodifiableList(this.f64948i);
                    this.f64944e &= -9;
                }
                r0.f64926h = this.f64948i;
                if ((this.f64944e & 16) == 16) {
                    this.f64949j = Collections.unmodifiableList(this.f64949j);
                    this.f64944e &= -17;
                }
                r0.f64927i = this.f64949j;
                if ((this.f64944e & 32) == 32) {
                    this.f64950k = Collections.unmodifiableList(this.f64950k);
                    this.f64944e &= -33;
                }
                r0.f64928j = this.f64950k;
                if ((this.f64944e & 64) == 64) {
                    this.f64951l = Collections.unmodifiableList(this.f64951l);
                    this.f64944e &= -65;
                }
                r0.f64930l = this.f64951l;
                if ((this.f64944e & 128) == 128) {
                    this.f64952m = Collections.unmodifiableList(this.f64952m);
                    this.f64944e &= -129;
                }
                r0.f64932n = this.f64952m;
                if ((this.f64944e & 256) == 256) {
                    this.f64953n = Collections.unmodifiableList(this.f64953n);
                    this.f64944e &= -257;
                }
                r0.f64933o = this.f64953n;
                if ((this.f64944e & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    this.f64954o = Collections.unmodifiableList(this.f64954o);
                    this.f64944e &= -513;
                }
                r0.f64934p = this.f64954o;
                if ((this.f64944e & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                    this.f64955p = Collections.unmodifiableList(this.f64955p);
                    this.f64944e &= -1025;
                }
                r0.f64935q = this.f64955p;
                if ((this.f64944e & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                    this.f64956q = Collections.unmodifiableList(this.f64956q);
                    this.f64944e &= -2049;
                }
                r0.f64936r = this.f64956q;
                if ((this.f64944e & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f64957r = Collections.unmodifiableList(this.f64957r);
                    this.f64944e &= -4097;
                }
                r0.f64937s = this.f64957r;
                if ((i2 & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == 8192) {
                    i3 |= 8;
                }
                r0.f64939u = this.f64958s;
                if ((this.f64944e & 16384) == 16384) {
                    this.f64959t = Collections.unmodifiableList(this.f64959t);
                    this.f64944e &= -16385;
                }
                r0.f64940v = this.f64959t;
                if ((i2 & 32768) == 32768) {
                    i3 |= 16;
                }
                r0.f64941w = this.f64960u;
                r0.f64922d = i3;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder mo32986k() {
                Builder builder = new Builder();
                builder.m32989o(m32987m());
                return builder;
            }

            /* renamed from: o */
            public Builder m32989o(Class r8) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                if (r8 == Class.f64920z) {
                    return this;
                }
                int i2 = r8.f64922d;
                if ((i2 & 1) == 1) {
                    int i3 = r8.f64923e;
                    this.f64944e |= 1;
                    this.f64945f = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = r8.f64924f;
                    this.f64944e = 2 | this.f64944e;
                    this.f64946g = i4;
                }
                if ((i2 & 4) == 4) {
                    int i5 = r8.f64925g;
                    this.f64944e = 4 | this.f64944e;
                    this.f64947h = i5;
                }
                if (!r8.f64926h.isEmpty()) {
                    if (this.f64948i.isEmpty()) {
                        this.f64948i = r8.f64926h;
                        this.f64944e &= -9;
                    } else {
                        if ((this.f64944e & 8) != 8) {
                            this.f64948i = new ArrayList(this.f64948i);
                            this.f64944e |= 8;
                        }
                        this.f64948i.addAll(r8.f64926h);
                    }
                }
                if (!r8.f64927i.isEmpty()) {
                    if (this.f64949j.isEmpty()) {
                        this.f64949j = r8.f64927i;
                        this.f64944e &= -17;
                    } else {
                        if ((this.f64944e & 16) != 16) {
                            this.f64949j = new ArrayList(this.f64949j);
                            this.f64944e |= 16;
                        }
                        this.f64949j.addAll(r8.f64927i);
                    }
                }
                if (!r8.f64928j.isEmpty()) {
                    if (this.f64950k.isEmpty()) {
                        this.f64950k = r8.f64928j;
                        this.f64944e &= -33;
                    } else {
                        if ((this.f64944e & 32) != 32) {
                            this.f64950k = new ArrayList(this.f64950k);
                            this.f64944e |= 32;
                        }
                        this.f64950k.addAll(r8.f64928j);
                    }
                }
                if (!r8.f64930l.isEmpty()) {
                    if (this.f64951l.isEmpty()) {
                        this.f64951l = r8.f64930l;
                        this.f64944e &= -65;
                    } else {
                        if ((this.f64944e & 64) != 64) {
                            this.f64951l = new ArrayList(this.f64951l);
                            this.f64944e |= 64;
                        }
                        this.f64951l.addAll(r8.f64930l);
                    }
                }
                if (!r8.f64932n.isEmpty()) {
                    if (this.f64952m.isEmpty()) {
                        this.f64952m = r8.f64932n;
                        this.f64944e &= -129;
                    } else {
                        if ((this.f64944e & 128) != 128) {
                            this.f64952m = new ArrayList(this.f64952m);
                            this.f64944e |= 128;
                        }
                        this.f64952m.addAll(r8.f64932n);
                    }
                }
                if (!r8.f64933o.isEmpty()) {
                    if (this.f64953n.isEmpty()) {
                        this.f64953n = r8.f64933o;
                        this.f64944e &= -257;
                    } else {
                        if ((this.f64944e & 256) != 256) {
                            this.f64953n = new ArrayList(this.f64953n);
                            this.f64944e |= 256;
                        }
                        this.f64953n.addAll(r8.f64933o);
                    }
                }
                if (!r8.f64934p.isEmpty()) {
                    if (this.f64954o.isEmpty()) {
                        this.f64954o = r8.f64934p;
                        this.f64944e &= -513;
                    } else {
                        if ((this.f64944e & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 512) {
                            this.f64954o = new ArrayList(this.f64954o);
                            this.f64944e |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                        }
                        this.f64954o.addAll(r8.f64934p);
                    }
                }
                if (!r8.f64935q.isEmpty()) {
                    if (this.f64955p.isEmpty()) {
                        this.f64955p = r8.f64935q;
                        this.f64944e &= -1025;
                    } else {
                        if ((this.f64944e & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                            this.f64955p = new ArrayList(this.f64955p);
                            this.f64944e |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                        }
                        this.f64955p.addAll(r8.f64935q);
                    }
                }
                if (!r8.f64936r.isEmpty()) {
                    if (this.f64956q.isEmpty()) {
                        this.f64956q = r8.f64936r;
                        this.f64944e &= -2049;
                    } else {
                        if ((this.f64944e & RecyclerView.ViewHolder.FLAG_MOVED) != 2048) {
                            this.f64956q = new ArrayList(this.f64956q);
                            this.f64944e |= RecyclerView.ViewHolder.FLAG_MOVED;
                        }
                        this.f64956q.addAll(r8.f64936r);
                    }
                }
                if (!r8.f64937s.isEmpty()) {
                    if (this.f64957r.isEmpty()) {
                        this.f64957r = r8.f64937s;
                        this.f64944e &= -4097;
                    } else {
                        if ((this.f64944e & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                            this.f64957r = new ArrayList(this.f64957r);
                            this.f64944e |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                        }
                        this.f64957r.addAll(r8.f64937s);
                    }
                }
                if ((r8.f64922d & 8) == 8) {
                    TypeTable typeTable2 = r8.f64939u;
                    if ((this.f64944e & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != 8192 || (typeTable = this.f64958s) == TypeTable.f65295h) {
                        this.f64958s = typeTable2;
                    } else {
                        TypeTable.Builder m33086i = TypeTable.m33086i(typeTable);
                        m33086i.m33090m(typeTable2);
                        this.f64958s = m33086i.m33088k();
                    }
                    this.f64944e |= RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST;
                }
                if (!r8.f64940v.isEmpty()) {
                    if (this.f64959t.isEmpty()) {
                        this.f64959t = r8.f64940v;
                        this.f64944e &= -16385;
                    } else {
                        if ((this.f64944e & 16384) != 16384) {
                            this.f64959t = new ArrayList(this.f64959t);
                            this.f64944e |= 16384;
                        }
                        this.f64959t.addAll(r8.f64940v);
                    }
                }
                if ((r8.f64922d & 16) == 16) {
                    VersionRequirementTable versionRequirementTable2 = r8.f64941w;
                    if ((this.f64944e & 32768) != 32768 || (versionRequirementTable = this.f64960u) == VersionRequirementTable.f65354f) {
                        this.f64960u = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder m33104i = VersionRequirementTable.m33104i(versionRequirementTable);
                        m33104i.m33108m(versionRequirementTable2);
                        this.f64960u = m33104i.m33106k();
                    }
                    this.f64944e |= 32768;
                }
                m33313l(r8);
                this.f65656b = this.f65656b.m33231b(r8.f64921c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder m32990p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.f64919A     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.C66491) r1     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    java.util.Objects.requireNonNull(r1)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    r1.<init>(r3, r4)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11 java.lang.Throwable -> L13
                    r2.m32989o(r1)
                    return r2
                L11:
                    r3 = move-exception
                    goto L15
                L13:
                    r3 = move-exception
                    goto L1c
                L15:
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.f65674b     // Catch: java.lang.Throwable -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r4     // Catch: java.lang.Throwable -> L13
                    throw r3     // Catch: java.lang.Throwable -> L1a
                L1a:
                    r3 = move-exception
                    r0 = r4
                L1c:
                    if (r0 == 0) goto L21
                    r2.m32989o(r0)
                L21:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.m32990p(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Builder");
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);


            /* renamed from: b */
            public final int f64969b;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$1 */
            public static class C66501 implements Internal.EnumLiteMap<Kind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Kind mo32979a(int i2) {
                    switch (i2) {
                        case 0:
                            return Kind.CLASS;
                        case 1:
                            return Kind.INTERFACE;
                        case 2:
                            return Kind.ENUM_CLASS;
                        case 3:
                            return Kind.ENUM_ENTRY;
                        case 4:
                            return Kind.ANNOTATION_CLASS;
                        case 5:
                            return Kind.OBJECT;
                        case 6:
                            return Kind.COMPANION_OBJECT;
                        default:
                            return null;
                    }
                }
            }

            Kind(int i2) {
                this.f64969b = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo32978x() {
                return this.f64969b;
            }
        }

        static {
            Class r0 = new Class();
            f64920z = r0;
            r0.m32985s();
        }

        public Class(GeneratedMessageLite.ExtendableBuilder extendableBuilder, C66441 c66441) {
            super(extendableBuilder);
            this.f64929k = -1;
            this.f64931m = -1;
            this.f64938t = -1;
            this.f64942x = (byte) -1;
            this.f64943y = -1;
            this.f64921c = extendableBuilder.f65656b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo32984a() {
            return f64920z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b */
        public MessageLite.Builder mo32956b() {
            Builder builder = new Builder();
            builder.m32989o(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c */
        public int mo32957c() {
            int i2 = this.f64943y;
            if (i2 != -1) {
                return i2;
            }
            int m33263c = (this.f64922d & 1) == 1 ? CodedOutputStream.m33263c(1, this.f64923e) + 0 : 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f64928j.size(); i4++) {
                i3 += CodedOutputStream.m33264d(this.f64928j.get(i4).intValue());
            }
            int i5 = m33263c + i3;
            if (!this.f64928j.isEmpty()) {
                i5 = i5 + 1 + CodedOutputStream.m33264d(i3);
            }
            this.f64929k = i3;
            if ((this.f64922d & 2) == 2) {
                i5 += CodedOutputStream.m33263c(3, this.f64924f);
            }
            if ((this.f64922d & 4) == 4) {
                i5 += CodedOutputStream.m33263c(4, this.f64925g);
            }
            for (int i6 = 0; i6 < this.f64926h.size(); i6++) {
                i5 += CodedOutputStream.m33265e(5, this.f64926h.get(i6));
            }
            for (int i7 = 0; i7 < this.f64927i.size(); i7++) {
                i5 += CodedOutputStream.m33265e(6, this.f64927i.get(i7));
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.f64930l.size(); i9++) {
                i8 += CodedOutputStream.m33264d(this.f64930l.get(i9).intValue());
            }
            int i10 = i5 + i8;
            if (!this.f64930l.isEmpty()) {
                i10 = i10 + 1 + CodedOutputStream.m33264d(i8);
            }
            this.f64931m = i8;
            for (int i11 = 0; i11 < this.f64932n.size(); i11++) {
                i10 += CodedOutputStream.m33265e(8, this.f64932n.get(i11));
            }
            for (int i12 = 0; i12 < this.f64933o.size(); i12++) {
                i10 += CodedOutputStream.m33265e(9, this.f64933o.get(i12));
            }
            for (int i13 = 0; i13 < this.f64934p.size(); i13++) {
                i10 += CodedOutputStream.m33265e(10, this.f64934p.get(i13));
            }
            for (int i14 = 0; i14 < this.f64935q.size(); i14++) {
                i10 += CodedOutputStream.m33265e(11, this.f64935q.get(i14));
            }
            for (int i15 = 0; i15 < this.f64936r.size(); i15++) {
                i10 += CodedOutputStream.m33265e(13, this.f64936r.get(i15));
            }
            int i16 = 0;
            for (int i17 = 0; i17 < this.f64937s.size(); i17++) {
                i16 += CodedOutputStream.m33264d(this.f64937s.get(i17).intValue());
            }
            int i18 = i10 + i16;
            if (!this.f64937s.isEmpty()) {
                i18 = i18 + 2 + CodedOutputStream.m33264d(i16);
            }
            this.f64938t = i16;
            if ((this.f64922d & 8) == 8) {
                i18 += CodedOutputStream.m33265e(30, this.f64939u);
            }
            int i19 = 0;
            for (int i20 = 0; i20 < this.f64940v.size(); i20++) {
                i19 += CodedOutputStream.m33264d(this.f64940v.get(i20).intValue());
            }
            int m12266a = C2052a.m12266a(this.f64940v, 2, i18 + i19);
            if ((this.f64922d & 16) == 16) {
                m12266a += CodedOutputStream.m33265e(32, this.f64941w);
            }
            int size = this.f64921c.size() + m33315j() + m12266a;
            this.f64943y = size;
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
            byte b = this.f64942x;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f64922d & 2) == 2)) {
                this.f64942x = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f64926h.size(); i2++) {
                if (!this.f64926h.get(i2).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f64927i.size(); i3++) {
                if (!this.f64927i.get(i3).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.f64932n.size(); i4++) {
                if (!this.f64932n.get(i4).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.f64933o.size(); i5++) {
                if (!this.f64933o.get(i5).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.f64934p.size(); i6++) {
                if (!this.f64934p.get(i6).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.f64935q.size(); i7++) {
                if (!this.f64935q.get(i7).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.f64936r.size(); i8++) {
                if (!this.f64936r.get(i8).mo32959e()) {
                    this.f64942x = (byte) 0;
                    return false;
                }
            }
            if (((this.f64922d & 8) == 8) && !this.f64939u.mo32959e()) {
                this.f64942x = (byte) 0;
                return false;
            }
            if (m33314i()) {
                this.f64942x = (byte) 1;
                return true;
            }
            this.f64942x = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f */
        public void mo32960f(CodedOutputStream codedOutputStream) throws IOException {
            mo32957c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter m33321p = m33321p();
            if ((this.f64922d & 1) == 1) {
                codedOutputStream.m33279q(1, this.f64923e);
            }
            if (this.f64928j.size() > 0) {
                codedOutputStream.m33288z(18);
                codedOutputStream.m33288z(this.f64929k);
            }
            for (int i2 = 0; i2 < this.f64928j.size(); i2++) {
                codedOutputStream.m33280r(this.f64928j.get(i2).intValue());
            }
            if ((this.f64922d & 2) == 2) {
                codedOutputStream.m33279q(3, this.f64924f);
            }
            if ((this.f64922d & 4) == 4) {
                codedOutputStream.m33279q(4, this.f64925g);
            }
            for (int i3 = 0; i3 < this.f64926h.size(); i3++) {
                codedOutputStream.m33281s(5, this.f64926h.get(i3));
            }
            for (int i4 = 0; i4 < this.f64927i.size(); i4++) {
                codedOutputStream.m33281s(6, this.f64927i.get(i4));
            }
            if (this.f64930l.size() > 0) {
                codedOutputStream.m33288z(58);
                codedOutputStream.m33288z(this.f64931m);
            }
            for (int i5 = 0; i5 < this.f64930l.size(); i5++) {
                codedOutputStream.m33280r(this.f64930l.get(i5).intValue());
            }
            for (int i6 = 0; i6 < this.f64932n.size(); i6++) {
                codedOutputStream.m33281s(8, this.f64932n.get(i6));
            }
            for (int i7 = 0; i7 < this.f64933o.size(); i7++) {
                codedOutputStream.m33281s(9, this.f64933o.get(i7));
            }
            for (int i8 = 0; i8 < this.f64934p.size(); i8++) {
                codedOutputStream.m33281s(10, this.f64934p.get(i8));
            }
            for (int i9 = 0; i9 < this.f64935q.size(); i9++) {
                codedOutputStream.m33281s(11, this.f64935q.get(i9));
            }
            for (int i10 = 0; i10 < this.f64936r.size(); i10++) {
                codedOutputStream.m33281s(13, this.f64936r.get(i10));
            }
            if (this.f64937s.size() > 0) {
                codedOutputStream.m33288z(130);
                codedOutputStream.m33288z(this.f64938t);
            }
            for (int i11 = 0; i11 < this.f64937s.size(); i11++) {
                codedOutputStream.m33280r(this.f64937s.get(i11).intValue());
            }
            if ((this.f64922d & 8) == 8) {
                codedOutputStream.m33281s(30, this.f64939u);
            }
            for (int i12 = 0; i12 < this.f64940v.size(); i12++) {
                codedOutputStream.m33279q(31, this.f64940v.get(i12).intValue());
            }
            if ((this.f64922d & 16) == 16) {
                codedOutputStream.m33281s(32, this.f64941w);
            }
            m33321p.m33324a(19000, codedOutputStream);
            codedOutputStream.m33284v(this.f64921c);
        }

        /* renamed from: s */
        public final void m32985s() {
            this.f64923e = 6;
            this.f64924f = 0;
            this.f64925g = 0;
            this.f64926h = Collections.emptyList();
            this.f64927i = Collections.emptyList();
            this.f64928j = Collections.emptyList();
            this.f64930l = Collections.emptyList();
            this.f64932n = Collections.emptyList();
            this.f64933o = Collections.emptyList();
            this.f64934p = Collections.emptyList();
            this.f64935q = Collections.emptyList();
            this.f64936r = Collections.emptyList();
            this.f64937s = Collections.emptyList();
            this.f64939u = TypeTable.f65295h;
            this.f64940v = Collections.emptyList();
            this.f64941w = VersionRequirementTable.f65354f;
        }

        public Class() {
            this.f64929k = -1;
            this.f64931m = -1;
            this.f64938t = -1;
            this.f64942x = (byte) -1;
            this.f64943y = -1;
            this.f64921c = ByteString.f65623b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f64929k = -1;
            this.f64931m = -1;
            this.f64938t = -1;
            this.f64942x = (byte) -1;
            this.f64943y = -1;
            m32985s();
            ByteString.Output m33226x = ByteString.m33226x();
            CodedOutputStream m33270k = CodedOutputStream.m33270k(m33226x, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int m33255o = codedInputStream.m33255o();
                        switch (m33255o) {
                            case 0:
                                z = true;
                            case 8:
                                this.f64922d |= 1;
                                this.f64923e = codedInputStream.m33247g();
                            case 16:
                                if ((i2 & 32) != 32) {
                                    this.f64928j = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f64928j.add(Integer.valueOf(codedInputStream.m33247g()));
                            case 18:
                                int m33244d = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 32) != 32 && codedInputStream.m33242b() > 0) {
                                    this.f64928j = new ArrayList();
                                    i2 |= 32;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f64928j.add(Integer.valueOf(codedInputStream.m33247g()));
                                }
                                codedInputStream.m33243c(m33244d);
                                break;
                            case 24:
                                this.f64922d |= 2;
                                this.f64924f = codedInputStream.m33247g();
                            case 32:
                                this.f64922d |= 4;
                                this.f64925g = codedInputStream.m33247g();
                            case 42:
                                if ((i2 & 8) != 8) {
                                    this.f64926h = new ArrayList();
                                    i2 |= 8;
                                }
                                this.f64926h.add(codedInputStream.m33248h(TypeParameter.f65271o, extensionRegistryLite));
                            case 50:
                                if ((i2 & 16) != 16) {
                                    this.f64927i = new ArrayList();
                                    i2 |= 16;
                                }
                                this.f64927i.add(codedInputStream.m33248h(Type.f65192v, extensionRegistryLite));
                            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                                if ((i2 & 64) != 64) {
                                    this.f64930l = new ArrayList();
                                    i2 |= 64;
                                }
                                this.f64930l.add(Integer.valueOf(codedInputStream.m33247g()));
                            case 58:
                                int m33244d2 = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 64) != 64 && codedInputStream.m33242b() > 0) {
                                    this.f64930l = new ArrayList();
                                    i2 |= 64;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f64930l.add(Integer.valueOf(codedInputStream.m33247g()));
                                }
                                codedInputStream.m33243c(m33244d2);
                                break;
                            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                if ((i2 & 128) != 128) {
                                    this.f64932n = new ArrayList();
                                    i2 |= 128;
                                }
                                this.f64932n.add(codedInputStream.m33248h(Constructor.f64971k, extensionRegistryLite));
                            case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                if ((i2 & 256) != 256) {
                                    this.f64933o = new ArrayList();
                                    i2 |= 256;
                                }
                                this.f64933o.add(codedInputStream.m33248h(Function.f65052t, extensionRegistryLite));
                            case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 512) {
                                    this.f64934p = new ArrayList();
                                    i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                                }
                                this.f64934p.add(codedInputStream.m33248h(Property.f65127t, extensionRegistryLite));
                            case 90:
                                if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                                    this.f64935q = new ArrayList();
                                    i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                                }
                                this.f64935q.add(codedInputStream.m33248h(TypeAlias.f65246q, extensionRegistryLite));
                            case C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) != 2048) {
                                    this.f64936r = new ArrayList();
                                    i2 |= RecyclerView.ViewHolder.FLAG_MOVED;
                                }
                                this.f64936r.add(codedInputStream.m33248h(EnumEntry.f65017i, extensionRegistryLite));
                            case 128:
                                if ((i2 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                                    this.f64937s = new ArrayList();
                                    i2 |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                this.f64937s.add(Integer.valueOf(codedInputStream.m33247g()));
                            case 130:
                                int m33244d3 = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096 && codedInputStream.m33242b() > 0) {
                                    this.f64937s = new ArrayList();
                                    i2 |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f64937s.add(Integer.valueOf(codedInputStream.m33247g()));
                                }
                                codedInputStream.m33243c(m33244d3);
                                break;
                            case 242:
                                TypeTable.Builder m33087j = (this.f64922d & 8) == 8 ? this.f64939u.m33087j() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.m33248h(TypeTable.f65296i, extensionRegistryLite);
                                this.f64939u = typeTable;
                                if (m33087j != null) {
                                    m33087j.m33090m(typeTable);
                                    this.f64939u = m33087j.m33088k();
                                }
                                this.f64922d |= 8;
                            case 248:
                                if ((i2 & 16384) != 16384) {
                                    this.f64940v = new ArrayList();
                                    i2 |= 16384;
                                }
                                this.f64940v.add(Integer.valueOf(codedInputStream.m33247g()));
                            case 250:
                                int m33244d4 = codedInputStream.m33244d(codedInputStream.m33252l());
                                if ((i2 & 16384) != 16384 && codedInputStream.m33242b() > 0) {
                                    this.f64940v = new ArrayList();
                                    i2 |= 16384;
                                }
                                while (codedInputStream.m33242b() > 0) {
                                    this.f64940v.add(Integer.valueOf(codedInputStream.m33247g()));
                                }
                                codedInputStream.m33243c(m33244d4);
                                break;
                            case 258:
                                VersionRequirementTable.Builder m33105j = (this.f64922d & 16) == 16 ? this.f64941w.m33105j() : null;
                                VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.m33248h(VersionRequirementTable.f65355g, extensionRegistryLite);
                                this.f64941w = versionRequirementTable;
                                if (m33105j != null) {
                                    m33105j.m33108m(versionRequirementTable);
                                    this.f64941w = m33105j.m33106k();
                                }
                                this.f64922d |= 16;
                            default:
                                if (m33322q(codedInputStream, m33270k, extensionRegistryLite, m33255o)) {
                                }
                                z = true;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.m33330c(this);
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.m33330c(this);
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.f64928j = Collections.unmodifiableList(this.f64928j);
                    }
                    if ((i2 & 8) == 8) {
                        this.f64926h = Collections.unmodifiableList(this.f64926h);
                    }
                    if ((i2 & 16) == 16) {
                        this.f64927i = Collections.unmodifiableList(this.f64927i);
                    }
                    if ((i2 & 64) == 64) {
                        this.f64930l = Collections.unmodifiableList(this.f64930l);
                    }
                    if ((i2 & 128) == 128) {
                        this.f64932n = Collections.unmodifiableList(this.f64932n);
                    }
                    if ((i2 & 256) == 256) {
                        this.f64933o = Collections.unmodifiableList(this.f64933o);
                    }
                    if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                        this.f64934p = Collections.unmodifiableList(this.f64934p);
                    }
                    if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                        this.f64935q = Collections.unmodifiableList(this.f64935q);
                    }
                    if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                        this.f64936r = Collections.unmodifiableList(this.f64936r);
                    }
                    if ((i2 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.f64937s = Collections.unmodifiableList(this.f64937s);
                    }
                    if ((i2 & 16384) == 16384) {
                        this.f64940v = Collections.unmodifiableList(this.f64940v);
                    }
                    try {
                        m33270k.m33273j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f64921c = m33226x.m33240c();
                        throw th2;
                    }
                    this.f64921c = m33226x.m33240c();
                    m33320o();
                    throw th;
                }
            }
            if ((i2 & 32) == 32) {
                this.f64928j = Collections.unmodifiableList(this.f64928j);
            }
            if ((i2 & 8) == 8) {
                this.f64926h = Collections.unmodifiableList(this.f64926h);
            }
            if ((i2 & 16) == 16) {
                this.f64927i = Collections.unmodifiableList(this.f64927i);
            }
            if ((i2 & 64) == 64) {
                this.f64930l = Collections.unmodifiableList(this.f64930l);
            }
            if ((i2 & 128) == 128) {
                this.f64932n = Collections.unmodifiableList(this.f64932n);
            }
            if ((i2 & 256) == 256) {
                this.f64933o = Collections.unmodifiableList(this.f64933o);
            }
            if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                this.f64934p = Collections.unmodifiableList(this.f64934p);
            }
            if ((i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                this.f64935q = Collections.unmodifiableList(this.f64935q);
            }
            if ((i2 & RecyclerView.ViewHolder.FLAG_MOVED) == 2048) {
                this.f64936r = Collections.unmodifiableList(this.f64936r);
            }
            if ((i2 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f64937s = Collections.unmodifiableList(this.f64937s);
            }
            if ((i2 & 16384) == 16384) {
                this.f64940v = Collections.unmodifiableList(this.f64940v);
            }
            try {
                m33270k.m33273j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f64921c = m33226x.m33240c();
                throw th3;
            }
            this.f64921c = m33226x.m33240c();
            m33320o();
        }
    }
}
