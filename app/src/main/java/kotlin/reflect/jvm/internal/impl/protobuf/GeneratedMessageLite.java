package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1 */
    public static /* synthetic */ class C66961 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65655a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f65655a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65655a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* renamed from: b */
        public ByteString f65656b = ByteString.f65623b;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: i */
        public BuilderType mo32986k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: j */
        public abstract BuilderType mo32967j(MessageType messagetype);
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* renamed from: c */
        public FieldSet<ExtensionDescriptor> f65657c = FieldSet.f65649d;

        /* renamed from: d */
        public boolean f65658d;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        /* renamed from: k */
        public BuilderType mo32986k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: l */
        public final void m33313l(MessageType messagetype) {
            if (!this.f65658d) {
                this.f65657c = this.f65657c.clone();
                this.f65658d = true;
            }
            FieldSet<ExtensionDescriptor> fieldSet = this.f65657c;
            FieldSet<ExtensionDescriptor> fieldSet2 = messagetype.f65659b;
            Objects.requireNonNull(fieldSet);
            for (int i2 = 0; i2 < fieldSet2.f65650a.m33347d(); i2++) {
                fieldSet.m33303j(fieldSet2.f65650a.m33346c(i2));
            }
            Iterator<Map.Entry<ExtensionDescriptor, Object>> it = fieldSet2.f65650a.m33348f().iterator();
            while (it.hasNext()) {
                fieldSet.m33303j(it.next());
            }
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* renamed from: b */
        public final Internal.EnumLiteMap<?> f65663b;

        /* renamed from: c */
        public final int f65664c;

        /* renamed from: d */
        public final WireFormat.FieldType f65665d;

        /* renamed from: e */
        public final boolean f65666e;

        /* renamed from: f */
        public final boolean f65667f;

        public ExtensionDescriptor(Internal.EnumLiteMap<?> enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f65663b = enumLiteMap;
            this.f65664c = i2;
            this.f65665d = fieldType;
            this.f65666e = z;
            this.f65667f = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: A */
        public WireFormat.JavaType mo33305A() {
            return this.f65665d.f65744b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: C */
        public boolean mo33306C() {
            return this.f65667f;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f65664c - ((ExtensionDescriptor) obj).f65664c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: g */
        public MessageLite.Builder mo33307g(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mo32967j((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: x */
        public int mo33308x() {
            return this.f65664c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: y */
        public boolean mo33309y() {
            return this.f65666e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* renamed from: z */
        public WireFormat.FieldType mo33310z() {
            return this.f65665d;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* renamed from: a */
        public final ContainingType f65668a;

        /* renamed from: b */
        public final Type f65669b;

        /* renamed from: c */
        public final MessageLite f65670c;

        /* renamed from: d */
        public final ExtensionDescriptor f65671d;

        /* renamed from: e */
        public final Method f65672e;

        public GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.f65665d == WireFormat.FieldType.f65735n && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f65668a = containingtype;
            this.f65669b = type;
            this.f65670c = messageLite;
            this.f65671d = extensionDescriptor;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f65672e = null;
                return;
            }
            try {
                this.f65672e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e2) {
                String name = cls.getName();
                StringBuilder sb = new StringBuilder(name.length() + 45 + 7);
                C0000a.m2C(sb, "Generated message class \"", name, "\" missing method \"", "valueOf");
                sb.append("\".");
                throw new RuntimeException(sb.toString(), e2);
            }
        }

        /* renamed from: a */
        public Object m33325a(Object obj) {
            if (this.f65671d.f65665d.f65744b != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f65672e.invoke(null, (Integer) obj);
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

        /* renamed from: b */
        public Object m33326b(Object obj) {
            return this.f65671d.f65665d.f65744b == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).mo32978x()) : obj;
        }
    }

    public GeneratedMessageLite() {
    }

    /* renamed from: g */
    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> m33311g(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new ExtensionDescriptor(null, i2, fieldType, true, z), cls);
    }

    /* renamed from: h */
    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> m33312h(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(null, i2, fieldType, false, false), cls);
    }

    public GeneratedMessageLite(Builder builder) {
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* renamed from: b */
        public final FieldSet<ExtensionDescriptor> f65659b;

        public class ExtensionWriter {

            /* renamed from: a */
            public final Iterator<Map.Entry<ExtensionDescriptor, Object>> f65660a;

            /* renamed from: b */
            public Map.Entry<ExtensionDescriptor, Object> f65661b;

            /* renamed from: c */
            public final boolean f65662c;

            public ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C66961 c66961) {
                FieldSet<ExtensionDescriptor> fieldSet = extendableMessage.f65659b;
                Iterator<Map.Entry<ExtensionDescriptor, Object>> lazyIterator = fieldSet.f65652c ? new LazyField.LazyIterator<>(fieldSet.f65650a.entrySet().iterator()) : fieldSet.f65650a.entrySet().iterator();
                this.f65660a = lazyIterator;
                if (lazyIterator.hasNext()) {
                    this.f65661b = lazyIterator.next();
                }
                this.f65662c = z;
            }

            /* renamed from: a */
            public void m33324a(int i2, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<ExtensionDescriptor, Object> entry = this.f65661b;
                    if (entry == null || entry.getKey().f65664c >= i2) {
                        return;
                    }
                    ExtensionDescriptor key = this.f65661b.getKey();
                    if (this.f65662c && key.f65665d.f65744b == WireFormat.JavaType.MESSAGE && !key.f65666e) {
                        int i3 = key.f65664c;
                        MessageLite messageLite = (MessageLite) this.f65661b.getValue();
                        codedOutputStream.m33272B(1, 3);
                        codedOutputStream.m33288z(16);
                        codedOutputStream.m33288z(i3);
                        codedOutputStream.m33281s(3, messageLite);
                        codedOutputStream.m33272B(1, 4);
                    } else {
                        Object value = this.f65661b.getValue();
                        FieldSet fieldSet = FieldSet.f65649d;
                        WireFormat.FieldType mo33310z = key.mo33310z();
                        int mo33308x = key.mo33308x();
                        if (key.mo33309y()) {
                            List list = (List) value;
                            if (key.mo33306C()) {
                                codedOutputStream.m33272B(mo33308x, 2);
                                int i4 = 0;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    i4 += FieldSet.m33290d(mo33310z, it.next());
                                }
                                codedOutputStream.m33288z(i4);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    FieldSet.m33296o(codedOutputStream, mo33310z, it2.next());
                                }
                            } else {
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    FieldSet.m33295n(codedOutputStream, mo33310z, mo33308x, it3.next());
                                }
                            }
                        } else if (value instanceof LazyField) {
                            FieldSet.m33295n(codedOutputStream, mo33310z, mo33308x, ((LazyField) value).m33331a());
                        } else {
                            FieldSet.m33295n(codedOutputStream, mo33310z, mo33308x, value);
                        }
                    }
                    if (this.f65660a.hasNext()) {
                        this.f65661b = this.f65660a.next();
                    } else {
                        this.f65661b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f65659b = new FieldSet<>();
        }

        /* renamed from: i */
        public boolean m33314i() {
            FieldSet<ExtensionDescriptor> fieldSet = this.f65659b;
            for (int i2 = 0; i2 < fieldSet.f65650a.m33347d(); i2++) {
                if (!fieldSet.m33301h(fieldSet.f65650a.m33346c(i2))) {
                    return false;
                }
            }
            Iterator<Map.Entry<ExtensionDescriptor, Object>> it = fieldSet.f65650a.m33348f().iterator();
            while (it.hasNext()) {
                if (!fieldSet.m33301h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: j */
        public int m33315j() {
            FieldSet<ExtensionDescriptor> fieldSet = this.f65659b;
            int i2 = 0;
            for (int i3 = 0; i3 < fieldSet.f65650a.m33347d(); i3++) {
                Map.Entry<ExtensionDescriptor, Object> m33346c = fieldSet.f65650a.m33346c(i3);
                i2 += FieldSet.m33291e(m33346c.getKey(), m33346c.getValue());
            }
            for (Map.Entry<ExtensionDescriptor, Object> entry : fieldSet.f65650a.m33348f()) {
                i2 += FieldSet.m33291e(entry.getKey(), entry.getValue());
            }
            return i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        /* renamed from: k */
        public final <Type> Type m33316k(GeneratedExtension<MessageType, Type> generatedExtension) {
            m33323r(generatedExtension);
            Type type = (Type) this.f65659b.m33300f(generatedExtension.f65671d);
            if (type == null) {
                return generatedExtension.f65669b;
            }
            ExtensionDescriptor extensionDescriptor = generatedExtension.f65671d;
            if (!extensionDescriptor.f65666e) {
                return (Type) generatedExtension.m33325a(type);
            }
            if (extensionDescriptor.f65665d.f65744b != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(generatedExtension.m33325a(it.next()));
            }
            return r1;
        }

        /* renamed from: l */
        public final <Type> Type m33317l(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i2) {
            m33323r(generatedExtension);
            FieldSet<ExtensionDescriptor> fieldSet = this.f65659b;
            ExtensionDescriptor extensionDescriptor = generatedExtension.f65671d;
            Objects.requireNonNull(fieldSet);
            if (!extensionDescriptor.f65666e) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object m33300f = fieldSet.m33300f(extensionDescriptor);
            if (m33300f != null) {
                return (Type) generatedExtension.m33325a(((List) m33300f).get(i2));
            }
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: m */
        public final <Type> int m33318m(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            m33323r(generatedExtension);
            FieldSet<ExtensionDescriptor> fieldSet = this.f65659b;
            ExtensionDescriptor extensionDescriptor = generatedExtension.f65671d;
            Objects.requireNonNull(fieldSet);
            if (!extensionDescriptor.f65666e) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object m33300f = fieldSet.m33300f(extensionDescriptor);
            if (m33300f == null) {
                return 0;
            }
            return ((List) m33300f).size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: n */
        public final <Type> boolean m33319n(GeneratedExtension<MessageType, Type> generatedExtension) {
            m33323r(generatedExtension);
            FieldSet<ExtensionDescriptor> fieldSet = this.f65659b;
            ExtensionDescriptor extensionDescriptor = generatedExtension.f65671d;
            Objects.requireNonNull(fieldSet);
            if (extensionDescriptor.mo33309y()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f65650a.get(extensionDescriptor) != null;
        }

        /* renamed from: o */
        public void m33320o() {
            this.f65659b.m33302i();
        }

        /* renamed from: p */
        public ExtendableMessage<MessageType>.ExtensionWriter m33321p() {
            return new ExtensionWriter(this, false, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
        /* renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m33322q(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r9, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r10, int r11) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.m33322q(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
        }

        /* renamed from: r */
        public final void m33323r(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.f65668a != mo32984a()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            extendableBuilder.f65657c.m33302i();
            extendableBuilder.f65658d = false;
            this.f65659b = extendableBuilder.f65657c;
        }
    }
}
