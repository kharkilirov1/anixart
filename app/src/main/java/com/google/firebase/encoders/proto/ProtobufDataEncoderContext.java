package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f22595f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f22596g;

    /* renamed from: h */
    public static final FieldDescriptor f22597h;

    /* renamed from: i */
    public static final ObjectEncoder<Map.Entry<Object, Object>> f22598i;

    /* renamed from: a */
    public OutputStream f22599a;

    /* renamed from: b */
    public final Map<Class<?>, ObjectEncoder<?>> f22600b;

    /* renamed from: c */
    public final Map<Class<?>, ValueEncoder<?>> f22601c;

    /* renamed from: d */
    public final ObjectEncoder<Object> f22602d;

    /* renamed from: e */
    public final ProtobufValueEncoderContext f22603e = new ProtobufValueEncoderContext(this);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1 */
    public static /* synthetic */ class C20761 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22604a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f22604a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22604a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22604a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        FieldDescriptor.Builder builder = new FieldDescriptor.Builder("key");
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f22589a = 1;
        f22596g = C0576a.m4109h(atProtobuf, builder);
        FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("value");
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f22589a = 2;
        f22597h = C0576a.m4109h(atProtobuf2, builder2);
        f22598i = C2077a.f22616b;
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f22599a = outputStream;
        this.f22600b = map;
        this.f22601c = map2;
        this.f22602d = objectEncoder;
    }

    /* renamed from: g */
    public static ByteBuffer m12377g(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: i */
    public static Protobuf m12378i(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f22569b.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: j */
    public static int m12379j(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f22569b.get(Protobuf.class));
        if (protobuf != null) {
            return ((AtProtobuf.ProtobufImpl) protobuf).f22590a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* renamed from: a */
    public ObjectEncoderContext mo12365a(@NonNull FieldDescriptor fieldDescriptor, long j2) throws IOException {
        m12382f(fieldDescriptor, j2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* renamed from: b */
    public ObjectEncoderContext mo12366b(@NonNull FieldDescriptor fieldDescriptor, int i2) throws IOException {
        m12381d(fieldDescriptor, i2, true);
        return this;
    }

    /* renamed from: c */
    public ObjectEncoderContext m12380c(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m12384k((m12379j(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f22595f);
            m12384k(bytes.length);
            this.f22599a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m12380c(fieldDescriptor, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m12383h(f22598i, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != 0.0d) {
                m12384k((m12379j(fieldDescriptor) << 3) | 1);
                this.f22599a.write(m12377g(8).putDouble(doubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                m12384k((m12379j(fieldDescriptor) << 3) | 5);
                this.f22599a.write(m12377g(4).putFloat(floatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            m12382f(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            m12381d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m12384k((m12379j(fieldDescriptor) << 3) | 2);
            m12384k(bArr.length);
            this.f22599a.write(bArr);
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.f22600b.get(obj.getClass());
        if (objectEncoder != null) {
            m12383h(objectEncoder, fieldDescriptor, obj, z);
            return this;
        }
        ValueEncoder<?> valueEncoder = this.f22601c.get(obj.getClass());
        if (valueEncoder != null) {
            ProtobufValueEncoderContext protobufValueEncoderContext = this.f22603e;
            protobufValueEncoderContext.f22612a = false;
            protobufValueEncoderContext.f22614c = fieldDescriptor;
            protobufValueEncoderContext.f22613b = z;
            valueEncoder.mo12368a(obj, protobufValueEncoderContext);
            return this;
        }
        if (obj instanceof ProtoEnum) {
            m12381d(fieldDescriptor, ((ProtoEnum) obj).mo5543x(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m12381d(fieldDescriptor, ((Enum) obj).ordinal(), true);
            return this;
        }
        m12383h(this.f22602d, fieldDescriptor, obj, z);
        return this;
    }

    /* renamed from: d */
    public ProtobufDataEncoderContext m12381d(@NonNull FieldDescriptor fieldDescriptor, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        AtProtobuf.ProtobufImpl protobufImpl = (AtProtobuf.ProtobufImpl) m12378i(fieldDescriptor);
        int ordinal = protobufImpl.f22591b.ordinal();
        if (ordinal == 0) {
            m12384k(protobufImpl.f22590a << 3);
            m12384k(i2);
        } else if (ordinal == 1) {
            m12384k(protobufImpl.f22590a << 3);
            m12384k((i2 << 1) ^ (i2 >> 31));
        } else if (ordinal == 2) {
            m12384k((protobufImpl.f22590a << 3) | 5);
            this.f22599a.write(m12377g(4).putInt(i2).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* renamed from: e */
    public ObjectEncoderContext mo12367e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return m12380c(fieldDescriptor, obj, true);
    }

    /* renamed from: f */
    public ProtobufDataEncoderContext m12382f(@NonNull FieldDescriptor fieldDescriptor, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return this;
        }
        AtProtobuf.ProtobufImpl protobufImpl = (AtProtobuf.ProtobufImpl) m12378i(fieldDescriptor);
        int ordinal = protobufImpl.f22591b.ordinal();
        if (ordinal == 0) {
            m12384k(protobufImpl.f22590a << 3);
            m12385l(j2);
        } else if (ordinal == 1) {
            m12384k(protobufImpl.f22590a << 3);
            m12385l((j2 >> 63) ^ (j2 << 1));
        } else if (ordinal == 2) {
            m12384k((protobufImpl.f22590a << 3) | 1);
            this.f22599a.write(m12377g(8).putLong(j2).array());
        }
        return this;
    }

    /* renamed from: h */
    public final <T> ProtobufDataEncoderContext m12383h(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.f22599a;
            this.f22599a = lengthCountingOutputStream;
            try {
                objectEncoder.mo5437a(t, this);
                this.f22599a = outputStream;
                long j2 = lengthCountingOutputStream.f22592b;
                lengthCountingOutputStream.close();
                if (z && j2 == 0) {
                    return this;
                }
                m12384k((m12379j(fieldDescriptor) << 3) | 2);
                m12385l(j2);
                objectEncoder.mo5437a(t, this);
                return this;
            } catch (Throwable th) {
                this.f22599a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: k */
    public final void m12384k(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f22599a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f22599a.write(i2 & 127);
    }

    /* renamed from: l */
    public final void m12385l(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.f22599a.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f22599a.write(((int) j2) & 127);
    }
}
