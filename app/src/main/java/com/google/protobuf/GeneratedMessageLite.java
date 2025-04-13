package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public UnknownFieldSetLite unknownFields = UnknownFieldSetLite.f24377f;
    public int memoizedSerializedSize = -1;

    /* renamed from: com.google.protobuf.GeneratedMessageLite$1 */
    public static /* synthetic */ class C23761 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24183a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f24183a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24183a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f24184b;

        /* renamed from: c */
        public MessageType f24185c;

        /* renamed from: d */
        public boolean f24186d = false;

        public Builder(MessageType messagetype) {
            this.f24184b = messagetype;
            this.f24185c = (MessageType) messagetype.mo11020p(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public MessageLite mo13428a() {
            return this.f24184b;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public Object clone() throws CloneNotSupportedException {
            Builder mo13431d = this.f24184b.mo13431d();
            mo13431d.m13443p(mo13438K0());
            return mo13431d;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: j */
        public AbstractMessageLite.Builder clone() {
            Builder mo13431d = this.f24184b.mo13431d();
            mo13431d.m13443p(mo13438K0());
            return mo13431d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: k */
        public AbstractMessageLite.Builder mo12984k(AbstractMessageLite abstractMessageLite) {
            m13441n();
            m13444q(this.f24185c, (GeneratedMessageLite) abstractMessageLite);
            return this;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final MessageType mo13437A() {
            MessageType mo13438K0 = mo13438K0();
            if (mo13438K0.mo13432e()) {
                return mo13438K0;
            }
            throw new UninitializedMessageException();
        }

        @Override // com.google.protobuf.MessageLite.Builder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public MessageType mo13438K0() {
            if (this.f24186d) {
                return this.f24185c;
            }
            MessageType messagetype = this.f24185c;
            Objects.requireNonNull(messagetype);
            Protobuf.f24310c.m13568b(messagetype).mo13539c(messagetype);
            this.f24186d = true;
            return this.f24185c;
        }

        /* renamed from: n */
        public final void m13441n() {
            if (this.f24186d) {
                mo13442o();
                this.f24186d = false;
            }
        }

        /* renamed from: o */
        public void mo13442o() {
            MessageType messagetype = (MessageType) this.f24185c.mo11020p(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
            Protobuf.f24310c.m13568b(messagetype).mo13535a(messagetype, this.f24185c);
            this.f24185c = messagetype;
        }

        /* renamed from: p */
        public BuilderType m13443p(MessageType messagetype) {
            m13441n();
            m13444q(this.f24185c, messagetype);
            return this;
        }

        /* renamed from: q */
        public final void m13444q(MessageType messagetype, MessageType messagetype2) {
            Protobuf.f24310c.m13568b(messagetype).mo13535a(messagetype, messagetype2);
        }
    }

    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* renamed from: a */
        public final T f24187a;

        public DefaultInstanceBasedParser(T t) {
            this.f24187a = t;
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        /* renamed from: o */
        public void mo13442o() {
            super.mo13442o();
            MessageType messagetype = this.f24185c;
            ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final MessageType mo13438K0() {
            if (this.f24186d) {
                return (MessageType) this.f24185c;
            }
            ((ExtendableMessage) this.f24185c).extensions.m13396m();
            return (MessageType) super.mo13438K0();
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public FieldSet<ExtensionDescriptor> extensions = FieldSet.f24154d;

        public class ExtensionWriter {
        }

        /* renamed from: H */
        public FieldSet<ExtensionDescriptor> m13446H() {
            FieldSet<ExtensionDescriptor> fieldSet = this.extensions;
            if (fieldSet.f24156b) {
                this.extensions = fieldSet.clone();
            }
            return this.extensions;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite] */
        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        /* renamed from: a */
        public /* bridge */ /* synthetic */ MessageLite mo13428a() {
            return mo13428a();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.GeneratedMessageLite$Builder, com.google.protobuf.MessageLite$Builder] */
        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        /* renamed from: b */
        public /* bridge */ /* synthetic */ MessageLite.Builder mo13429b() {
            return mo13429b();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.GeneratedMessageLite$Builder, com.google.protobuf.MessageLite$Builder] */
        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        /* renamed from: d */
        public /* bridge */ /* synthetic */ MessageLite.Builder mo13431d() {
            return mo13431d();
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* renamed from: b */
        public final Internal.EnumLiteMap<?> f24188b;

        /* renamed from: c */
        public final int f24189c;

        /* renamed from: d */
        public final WireFormat.FieldType f24190d;

        /* renamed from: e */
        public final boolean f24191e;

        /* renamed from: f */
        public final boolean f24192f;

        public ExtensionDescriptor(Internal.EnumLiteMap<?> enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f24188b = enumLiteMap;
            this.f24189c = i2;
            this.f24190d = fieldType;
            this.f24191e = z;
            this.f24192f = z2;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: A */
        public WireFormat.JavaType mo13400A() {
            return this.f24190d.f24420b;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: C */
        public boolean mo13401C() {
            return this.f24192f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: D */
        public MessageLite.Builder mo13402D(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.m13443p((GeneratedMessageLite) messageLite);
            return builder2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f24189c - ((ExtensionDescriptor) obj).f24189c;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: x */
        public int mo13403x() {
            return this.f24189c;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: y */
        public boolean mo13404y() {
            return this.f24191e;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: z */
        public WireFormat.FieldType mo13405z() {
            return this.f24190d;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f24193a;

        /* renamed from: b */
        public final Type f24194b;

        /* renamed from: c */
        public final MessageLite f24195c;

        /* renamed from: d */
        public final ExtensionDescriptor f24196d;

        /* JADX WARN: Multi-variable type inference failed */
        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor) {
            if (messageLite == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.f24190d == WireFormat.FieldType.f24411n && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f24193a = messageLite;
            this.f24194b = obj;
            this.f24195c = messageLite2;
            this.f24196d = extensionDescriptor;
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
    }

    /* renamed from: B */
    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> m13413B(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(null, i2, fieldType, false, false));
    }

    /* renamed from: C */
    public static <T extends GeneratedMessageLite<T, ?>> T m13414C(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) m13416E(t, bArr, 0, bArr.length, ExtensionRegistryLite.m13368a());
        m13418n(t2);
        return t2;
    }

    /* renamed from: D */
    public static <T extends GeneratedMessageLite<T, ?>> T m13415D(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) t.mo11020p(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
        try {
            Schema m13568b = Protobuf.f24310c.m13568b(t2);
            CodedInputStreamReader codedInputStreamReader = codedInputStream.f23996d;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            m13568b.mo13541e(t2, codedInputStreamReader, extensionRegistryLite);
            m13568b.mo13539c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            if (e2.f24222c) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: E */
    public static <T extends GeneratedMessageLite<T, ?>> T m13416E(T t, byte[] bArr, int i2, int i3, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) t.mo11020p(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
        try {
            Schema m13568b = Protobuf.f24310c.m13568b(t2);
            m13568b.mo13542f(t2, bArr, i2, i2 + i3, new ArrayDecoders.Registers(extensionRegistryLite));
            m13568b.mo13539c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e2) {
            if (e2.f24222c) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m13463h();
        }
    }

    /* renamed from: F */
    public static <T extends GeneratedMessageLite<?, ?>> void m13417F(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: n */
    public static <T extends GeneratedMessageLite<T, ?>> T m13418n(T t) throws InvalidProtocolBufferException {
        if (t.mo13432e()) {
            return t;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    /* renamed from: q */
    public static Internal.DoubleList m13419q() {
        return DoubleArrayList.f24105e;
    }

    /* renamed from: r */
    public static Internal.IntList m13420r() {
        return IntArrayList.f24207e;
    }

    /* renamed from: s */
    public static Internal.LongList m13421s() {
        return LongArrayList.f24255e;
    }

    /* renamed from: t */
    public static <E> Internal.ProtobufList<E> m13422t() {
        return ProtobufArrayList.f24313e;
    }

    /* renamed from: u */
    public static <T extends GeneratedMessageLite<?, ?>> T m13423u(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) UnsafeUtil.m13676c(cls)).mo13428a();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    /* renamed from: w */
    static Object m13424w(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: y */
    public static Object m13425y(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    /* renamed from: z */
    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> m13426z(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new ExtensionDescriptor(enumLiteMap, i2, fieldType, true, z));
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo13429b() {
        BuilderType buildertype = (BuilderType) mo11020p(MethodToInvoke.NEW_BUILDER, null, null);
        buildertype.m13441n();
        buildertype.m13444q(buildertype.f24185c, this);
        return buildertype;
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: c */
    public int mo13430c() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = Protobuf.f24310c.m13568b(this).mo13544h(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* renamed from: e */
    public final boolean mo13432e() {
        byte byteValue = ((Byte) mo11020p(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo13540d = Protobuf.f24310c.m13568b(this).mo13540d(this);
        mo11020p(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, mo13540d ? this : null, null);
        return mo13540d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Protobuf.f24310c.m13568b(this).mo13543g(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: g */
    public void mo13433g(CodedOutputStream codedOutputStream) throws IOException {
        Schema m13568b = Protobuf.f24310c.m13568b(this);
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f24040a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        m13568b.mo13537b(this, codedOutputStreamWriter);
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int mo13546j = Protobuf.f24310c.m13568b(this).mo13546j(this);
        this.memoizedHashCode = mo13546j;
        return mo13546j;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    /* renamed from: j */
    public int mo12978j() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    /* renamed from: m */
    public void mo12981m(int i2) {
        this.memoizedSerializedSize = i2;
    }

    /* renamed from: o */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType m13434o() {
        return (BuilderType) mo11020p(MethodToInvoke.NEW_BUILDER, null, null);
    }

    /* renamed from: p */
    public abstract Object mo11020p(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public String toString() {
        StringBuilder m27x = C0000a.m27x("# ", super.toString());
        MessageLiteToString.m13506c(this, m27x, 0);
        return m27x.toString();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final MessageType mo13428a() {
        return (MessageType) mo11020p(MethodToInvoke.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo13431d() {
        return (BuilderType) mo11020p(MethodToInvoke.NEW_BUILDER, null, null);
    }
}
