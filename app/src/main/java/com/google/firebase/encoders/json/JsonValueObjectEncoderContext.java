package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a */
    public boolean f22579a = true;

    /* renamed from: b */
    public final JsonWriter f22580b;

    /* renamed from: c */
    public final Map<Class<?>, ObjectEncoder<?>> f22581c;

    /* renamed from: d */
    public final Map<Class<?>, ValueEncoder<?>> f22582d;

    /* renamed from: e */
    public final ObjectEncoder<Object> f22583e;

    /* renamed from: f */
    public final boolean f22584f;

    public JsonValueObjectEncoderContext(@NonNull Writer writer, @NonNull Map<Class<?>, ObjectEncoder<?>> map, @NonNull Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
        this.f22580b = new JsonWriter(writer);
        this.f22581c = map;
        this.f22582d = map2;
        this.f22583e = objectEncoder;
        this.f22584f = z;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* renamed from: a */
    public ObjectEncoderContext mo12365a(@NonNull FieldDescriptor fieldDescriptor, long j2) throws IOException {
        String str = fieldDescriptor.f22568a;
        m12375h();
        this.f22580b.name(str);
        m12375h();
        this.f22580b.value(j2);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* renamed from: b */
    public ObjectEncoderContext mo12366b(@NonNull FieldDescriptor fieldDescriptor, int i2) throws IOException {
        String str = fieldDescriptor.f22568a;
        m12375h();
        this.f22580b.name(str);
        m12375h();
        this.f22580b.value(i2);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    /* renamed from: c */
    public ValueEncoderContext mo12369c(@Nullable String str) throws IOException {
        m12375h();
        this.f22580b.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    /* renamed from: d */
    public ValueEncoderContext mo12370d(boolean z) throws IOException {
        m12375h();
        this.f22580b.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* renamed from: e */
    public ObjectEncoderContext mo12367e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return m12374g(fieldDescriptor.f22568a, obj);
    }

    @NonNull
    /* renamed from: f */
    public JsonValueObjectEncoderContext m12373f(@Nullable Object obj, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f22580b.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f22580b.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f22580b.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m12373f(it.next(), false);
                }
                this.f22580b.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f22580b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m12374g((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f22580b.endObject();
                return this;
            }
            ObjectEncoder<?> objectEncoder = this.f22581c.get(obj.getClass());
            if (objectEncoder != null) {
                if (!z) {
                    this.f22580b.beginObject();
                }
                objectEncoder.mo5437a(obj, this);
                if (!z) {
                    this.f22580b.endObject();
                }
                return this;
            }
            ValueEncoder<?> valueEncoder = this.f22582d.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.mo12368a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                m12375h();
                this.f22580b.value(name);
                return this;
            }
            ObjectEncoder<Object> objectEncoder2 = this.f22583e;
            if (!z) {
                this.f22580b.beginObject();
            }
            objectEncoder2.mo5437a(obj, this);
            if (!z) {
                this.f22580b.endObject();
            }
            return this;
        }
        if (obj instanceof byte[]) {
            m12375h();
            this.f22580b.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        this.f22580b.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                this.f22580b.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                long j2 = jArr[i2];
                m12375h();
                this.f22580b.value(j2);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.f22580b.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.f22580b.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m12373f(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m12373f(obj2, false);
            }
        }
        this.f22580b.endArray();
        return this;
    }

    @NonNull
    /* renamed from: g */
    public JsonValueObjectEncoderContext m12374g(@NonNull String str, @Nullable Object obj) throws IOException {
        if (this.f22584f) {
            if (obj == null) {
                return this;
            }
            m12375h();
            this.f22580b.name(str);
            return m12373f(obj, false);
        }
        m12375h();
        this.f22580b.name(str);
        if (obj != null) {
            return m12373f(obj, false);
        }
        this.f22580b.nullValue();
        return this;
    }

    /* renamed from: h */
    public final void m12375h() throws IOException {
        if (!this.f22579a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
