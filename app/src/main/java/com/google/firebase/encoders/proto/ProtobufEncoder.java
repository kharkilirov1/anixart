package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ProtobufEncoder {

    /* renamed from: a */
    public final Map<Class<?>, ObjectEncoder<?>> f22605a;

    /* renamed from: b */
    public final Map<Class<?>, ValueEncoder<?>> f22606b;

    /* renamed from: c */
    public final ObjectEncoder<Object> f22607c;

    public static final class Builder implements EncoderConfig<Builder> {

        /* renamed from: d */
        public static final ObjectEncoder<Object> f22608d = C2077a.f22617c;

        /* renamed from: a */
        public final Map<Class<?>, ObjectEncoder<?>> f22609a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, ValueEncoder<?>> f22610b = new HashMap();

        /* renamed from: c */
        public ObjectEncoder<Object> f22611c = f22608d;

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        /* renamed from: a */
        public Builder mo12371a(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
            this.f22609a.put(cls, objectEncoder);
            this.f22610b.remove(cls);
            return this;
        }
    }

    public ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f22605a = map;
        this.f22606b = map2;
        this.f22607c = objectEncoder;
    }

    /* renamed from: a */
    public void m12386a(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        Map<Class<?>, ObjectEncoder<?>> map = this.f22605a;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(outputStream, map, this.f22606b, this.f22607c);
        if (obj == null) {
            return;
        }
        ObjectEncoder<?> objectEncoder = map.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.mo5437a(obj, protobufDataEncoderContext);
        } else {
            StringBuilder m24u = C0000a.m24u("No encoder for ");
            m24u.append(obj.getClass());
            throw new EncodingException(m24u.toString());
        }
    }
}
