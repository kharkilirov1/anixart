package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* renamed from: e */
    public static final TimestampEncoder f22572e = new TimestampEncoder(null);

    /* renamed from: a */
    public final Map<Class<?>, ObjectEncoder<?>> f22573a;

    /* renamed from: b */
    public final Map<Class<?>, ValueEncoder<?>> f22574b;

    /* renamed from: c */
    public ObjectEncoder<Object> f22575c;

    /* renamed from: d */
    public boolean f22576d;

    public static final class TimestampEncoder implements ValueEncoder<Date> {

        /* renamed from: a */
        public static final DateFormat f22578a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f22578a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        /* renamed from: a */
        public void mo12368a(@NonNull Object obj, @NonNull Object obj2) throws IOException {
            ((ValueEncoderContext) obj2).mo12369c(f22578a.format((Date) obj));
        }

        public TimestampEncoder(C20721 c20721) {
        }
    }

    public JsonDataEncoderBuilder() {
        HashMap hashMap = new HashMap();
        this.f22573a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f22574b = hashMap2;
        this.f22575c = new ObjectEncoder() { // from class: com.google.firebase.encoders.json.a
            @Override // com.google.firebase.encoders.ObjectEncoder
            /* renamed from: a */
            public final void mo5437a(Object obj, Object obj2) {
                JsonDataEncoderBuilder.TimestampEncoder timestampEncoder = JsonDataEncoderBuilder.f22572e;
                StringBuilder m24u = C0000a.m24u("Couldn't find encoder for type ");
                m24u.append(obj.getClass().getCanonicalName());
                throw new EncodingException(m24u.toString());
            }
        };
        this.f22576d = false;
        hashMap2.put(String.class, C2075b.f22586b);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, C2075b.f22587c);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f22572e);
        hashMap.remove(Date.class);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    /* renamed from: a */
    public JsonDataEncoderBuilder mo12371a(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f22573a.put(cls, objectEncoder);
        this.f22574b.remove(cls);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public DataEncoder m12372b() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            /* renamed from: a */
            public void mo12361a(@NonNull Object obj, @NonNull Writer writer) throws IOException {
                JsonDataEncoderBuilder jsonDataEncoderBuilder = JsonDataEncoderBuilder.this;
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, jsonDataEncoderBuilder.f22573a, jsonDataEncoderBuilder.f22574b, jsonDataEncoderBuilder.f22575c, jsonDataEncoderBuilder.f22576d);
                jsonValueObjectEncoderContext.m12373f(obj, false);
                jsonValueObjectEncoderContext.m12375h();
                jsonValueObjectEncoderContext.f22580b.flush();
            }
        };
    }
}
