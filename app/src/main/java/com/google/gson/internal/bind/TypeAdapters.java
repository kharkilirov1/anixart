package com.google.gson.internal.bind;

import androidx.room.util.C0576a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class TypeAdapters {

    /* renamed from: A */
    public static final TypeAdapter<JsonElement> f23825A;

    /* renamed from: B */
    public static final TypeAdapterFactory f23826B;

    /* renamed from: C */
    public static final TypeAdapterFactory f23827C;

    /* renamed from: a */
    public static final TypeAdapterFactory f23828a = new C231130(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Class mo12837b(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException(C0576a.m4116o(cls, C0000a.m24u("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }.m12852a());

    /* renamed from: b */
    public static final TypeAdapterFactory f23829b = new C231130(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        
            if (r6.mo12909o() != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        
            r1 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L20;
         */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet mo12837b(com.google.gson.stream.JsonReader r6) throws java.io.IOException {
            /*
                r5 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.mo12900a()
                com.google.gson.stream.JsonToken r1 = r6.mo12898C()
                r2 = 0
            Ld:
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r3) goto L66
                int r3 = r1.ordinal()
                r4 = 5
                if (r3 == r4) goto L41
                r4 = 6
                if (r3 == r4) goto L3a
                r4 = 7
                if (r3 != r4) goto L23
                boolean r1 = r6.mo12906m()
                goto L4e
            L23:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L3a:
                int r1 = r6.mo12909o()
                if (r1 == 0) goto L4d
                goto L4b
            L41:
                java.lang.String r1 = r6.mo12897A()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5a
                if (r1 == 0) goto L4d
            L4b:
                r1 = 1
                goto L4e
            L4d:
                r1 = 0
            L4e:
                if (r1 == 0) goto L53
                r0.set(r2)
            L53:
                int r2 = r2 + 1
                com.google.gson.stream.JsonToken r1 = r6.mo12898C()
                goto Ld
            L5a:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = p000a.C0000a.m14k(r0, r1)
                r6.<init>(r0)
                throw r6
            L66:
                r6.mo12903g()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C22992.mo12837b(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            jsonWriter.mo12918b();
            int length = bitSet2.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.mo12924p(bitSet2.get(i2) ? 1L : 0L);
            }
            jsonWriter.mo12920g();
        }
    }.m12852a());

    /* renamed from: c */
    public static final TypeAdapter<Boolean> f23830c;

    /* renamed from: d */
    public static final TypeAdapterFactory f23831d;

    /* renamed from: e */
    public static final TypeAdapterFactory f23832e;

    /* renamed from: f */
    public static final TypeAdapterFactory f23833f;

    /* renamed from: g */
    public static final TypeAdapterFactory f23834g;

    /* renamed from: h */
    public static final TypeAdapterFactory f23835h;

    /* renamed from: i */
    public static final TypeAdapterFactory f23836i;

    /* renamed from: j */
    public static final TypeAdapterFactory f23837j;

    /* renamed from: k */
    public static final TypeAdapter<Number> f23838k;

    /* renamed from: l */
    public static final TypeAdapter<Number> f23839l;

    /* renamed from: m */
    public static final TypeAdapter<Number> f23840m;

    /* renamed from: n */
    public static final TypeAdapterFactory f23841n;

    /* renamed from: o */
    public static final TypeAdapter<BigDecimal> f23842o;

    /* renamed from: p */
    public static final TypeAdapter<BigInteger> f23843p;

    /* renamed from: q */
    public static final TypeAdapterFactory f23844q;

    /* renamed from: r */
    public static final TypeAdapterFactory f23845r;

    /* renamed from: s */
    public static final TypeAdapterFactory f23846s;

    /* renamed from: t */
    public static final TypeAdapterFactory f23847t;

    /* renamed from: u */
    public static final TypeAdapterFactory f23848u;

    /* renamed from: v */
    public static final TypeAdapterFactory f23849v;

    /* renamed from: w */
    public static final TypeAdapterFactory f23850w;

    /* renamed from: x */
    public static final TypeAdapterFactory f23851x;

    /* renamed from: y */
    public static final TypeAdapterFactory f23852y;

    /* renamed from: z */
    public static final TypeAdapterFactory f23853z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$27 */
    public class C230727 extends TypeAdapter<JsonElement> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public JsonElement mo12837b(JsonReader jsonReader) throws IOException {
            if (jsonReader instanceof JsonTreeReader) {
                JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                JsonToken mo12898C = jsonTreeReader.mo12898C();
                if (mo12898C != JsonToken.NAME && mo12898C != JsonToken.END_ARRAY && mo12898C != JsonToken.END_OBJECT && mo12898C != JsonToken.END_DOCUMENT) {
                    JsonElement jsonElement = (JsonElement) jsonTreeReader.m12908n0();
                    jsonTreeReader.mo12899Z();
                    return jsonElement;
                }
                throw new IllegalStateException("Unexpected " + mo12898C + " when reading a JsonElement.");
            }
            int ordinal = jsonReader.mo12898C().ordinal();
            if (ordinal == 0) {
                JsonArray jsonArray = new JsonArray();
                jsonReader.mo12900a();
                while (jsonReader.mo12905j()) {
                    JsonElement mo12837b = mo12837b(jsonReader);
                    if (mo12837b == null) {
                        mo12837b = JsonNull.f23667a;
                    }
                    jsonArray.f23666b.add(mo12837b);
                }
                jsonReader.mo12903g();
                return jsonArray;
            }
            if (ordinal != 2) {
                if (ordinal == 5) {
                    return new JsonPrimitive(jsonReader.mo12897A());
                }
                if (ordinal == 6) {
                    return new JsonPrimitive(new LazilyParsedNumber(jsonReader.mo12897A()));
                }
                if (ordinal == 7) {
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.mo12906m()));
                }
                if (ordinal != 8) {
                    throw new IllegalArgumentException();
                }
                jsonReader.mo12915v();
                return JsonNull.f23667a;
            }
            JsonObject jsonObject = new JsonObject();
            jsonReader.mo12901b();
            while (jsonReader.mo12905j()) {
                String mo12912q = jsonReader.mo12912q();
                JsonElement mo12837b2 = mo12837b(jsonReader);
                LinkedTreeMap<String, JsonElement> linkedTreeMap = jsonObject.f23668a;
                if (mo12837b2 == null) {
                    mo12837b2 = JsonNull.f23667a;
                }
                linkedTreeMap.put(mo12912q, mo12837b2);
            }
            jsonReader.mo12904h();
            return jsonObject;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo12838c(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
            if (jsonElement == null || (jsonElement instanceof JsonNull)) {
                jsonWriter.mo12923k();
                return;
            }
            if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive m12845e = jsonElement.m12845e();
                Object obj = m12845e.f23669a;
                if (obj instanceof Number) {
                    jsonWriter.mo12926u(m12845e.m12849s());
                    return;
                } else if (obj instanceof Boolean) {
                    jsonWriter.mo12928w(m12845e.m12848r());
                    return;
                } else {
                    jsonWriter.mo12927v(m12845e.mo12841g());
                    return;
                }
            }
            if (jsonElement instanceof JsonArray) {
                jsonWriter.mo12918b();
                Iterator<JsonElement> it = jsonElement.m12843b().iterator();
                while (it.hasNext()) {
                    mo12838c(jsonWriter, it.next());
                }
                jsonWriter.mo12920g();
                return;
            }
            if (!(jsonElement instanceof JsonObject)) {
                StringBuilder m24u = C0000a.m24u("Couldn't write ");
                m24u.append(jsonElement.getClass());
                throw new IllegalArgumentException(m24u.toString());
            }
            jsonWriter.mo12919c();
            for (Map.Entry<String, JsonElement> entry : jsonElement.m12844d().f23668a.entrySet()) {
                jsonWriter.mo12922i(entry.getKey());
                mo12838c(jsonWriter, entry.getValue());
            }
            jsonWriter.mo12921h();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29 */
    class C230929 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            typeToken.equals(null);
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30 */
    public class C231130 implements TypeAdapterFactory {

        /* renamed from: b */
        public final /* synthetic */ Class f23854b;

        /* renamed from: c */
        public final /* synthetic */ TypeAdapter f23855c;

        public C231130(Class cls, TypeAdapter typeAdapter) {
            this.f23854b = cls;
            this.f23855c = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a == this.f23854b) {
                return this.f23855c;
            }
            return null;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Factory[type=");
            C0576a.m4126y(this.f23854b, m24u, ",adapter=");
            m24u.append(this.f23855c);
            m24u.append("]");
            return m24u.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31 */
    public class C231231 implements TypeAdapterFactory {

        /* renamed from: b */
        public final /* synthetic */ Class f23856b;

        /* renamed from: c */
        public final /* synthetic */ Class f23857c;

        /* renamed from: d */
        public final /* synthetic */ TypeAdapter f23858d;

        public C231231(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f23856b = cls;
            this.f23857c = cls2;
            this.f23858d = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> cls = typeToken.f23885a;
            if (cls == this.f23856b || cls == this.f23857c) {
                return this.f23858d;
            }
            return null;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Factory[type=");
            C0576a.m4126y(this.f23857c, m24u, "+");
            C0576a.m4126y(this.f23856b, m24u, ",adapter=");
            m24u.append(this.f23858d);
            m24u.append("]");
            return m24u.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34 */
    public static /* synthetic */ class C231534 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23866a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f23866a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23866a[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23866a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23866a[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23866a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23866a[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23866a[9] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23866a[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23866a[3] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23866a[1] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a */
        public final Map<String, T> f23867a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f23868b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (final Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new PrivilegedAction<Void>(this) { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                            @Override // java.security.PrivilegedAction
                            public Void run() {
                                field.setAccessible(true);
                                return null;
                            }
                        });
                        Enum r4 = (Enum) field.get(null);
                        String name = r4.name();
                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        if (serializedName != null) {
                            name = serializedName.value();
                            for (String str : serializedName.alternate()) {
                                this.f23867a.put(str, r4);
                            }
                        }
                        this.f23867a.put(name, r4);
                        this.f23868b.put(r4, name);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Object mo12837b(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo12898C() != JsonToken.NULL) {
                return this.f23867a.get(jsonReader.mo12897A());
            }
            jsonReader.mo12915v();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            jsonWriter.mo12927v(r3 == null ? null : this.f23868b.get(r3));
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Boolean mo12837b(JsonReader jsonReader) throws IOException {
                JsonToken mo12898C = jsonReader.mo12898C();
                if (mo12898C != JsonToken.NULL) {
                    return mo12898C == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.mo12897A())) : Boolean.valueOf(jsonReader.mo12906m());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.mo12925q(bool);
            }
        };
        f23830c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Boolean mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.mo12897A());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                jsonWriter.mo12927v(bool2 == null ? "null" : bool2.toString());
            }
        };
        f23831d = new C231231(Boolean.TYPE, Boolean.class, typeAdapter);
        f23832e = new C231231(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.mo12909o());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.mo12926u(number);
            }
        });
        f23833f = new C231231(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.mo12909o());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.mo12926u(number);
            }
        });
        f23834g = new C231231(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.mo12909o());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.mo12926u(number);
            }
        });
        f23835h = new C231130(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public AtomicInteger mo12837b(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.mo12909o());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.mo12924p(atomicInteger.get());
            }
        }.m12852a());
        f23836i = new C231130(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public AtomicBoolean mo12837b(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.mo12906m());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.mo12928w(atomicBoolean.get());
            }
        }.m12852a());
        f23837j = new C231130(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public AtomicIntegerArray mo12837b(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.mo12900a();
                while (jsonReader.mo12905j()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.mo12909o()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.mo12903g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.mo12918b();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.mo12924p(r6.get(i2));
                }
                jsonWriter.mo12920g();
            }
        }.m12852a());
        f23838k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.mo12911p());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.mo12926u(number);
            }
        };
        f23839l = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.mo12907n());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.mo12926u(number);
            }
        };
        f23840m = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.mo12907n());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.mo12926u(number);
            }
        };
        f23841n = new C231231(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Character mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                String mo12897A = jsonReader.mo12897A();
                if (mo12897A.length() == 1) {
                    return Character.valueOf(mo12897A.charAt(0));
                }
                throw new JsonSyntaxException(C0000a.m14k("Expecting character, got: ", mo12897A));
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Character ch) throws IOException {
                Character ch2 = ch;
                jsonWriter.mo12927v(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public String mo12837b(JsonReader jsonReader) throws IOException {
                JsonToken mo12898C = jsonReader.mo12898C();
                if (mo12898C != JsonToken.NULL) {
                    return mo12898C == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.mo12906m()) : jsonReader.mo12897A();
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.mo12927v(str);
            }
        };
        f23842o = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public BigDecimal mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    return new BigDecimal(jsonReader.mo12897A());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.mo12926u(bigDecimal);
            }
        };
        f23843p = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public BigInteger mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    return new BigInteger(jsonReader.mo12897A());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.mo12926u(bigInteger);
            }
        };
        f23844q = new C231130(String.class, typeAdapter2);
        f23845r = new C231130(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public StringBuilder mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.mo12897A());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                jsonWriter.mo12927v(sb2 == null ? null : sb2.toString());
            }
        });
        f23846s = new C231130(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public StringBuffer mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.mo12897A());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                jsonWriter.mo12927v(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        f23847t = new C231130(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public URL mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                String mo12897A = jsonReader.mo12897A();
                if ("null".equals(mo12897A)) {
                    return null;
                }
                return new URL(mo12897A);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, URL url) throws IOException {
                URL url2 = url;
                jsonWriter.mo12927v(url2 == null ? null : url2.toExternalForm());
            }
        });
        f23848u = new C231130(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public URI mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                try {
                    String mo12897A = jsonReader.mo12897A();
                    if ("null".equals(mo12897A)) {
                        return null;
                    }
                    return new URI(mo12897A);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, URI uri) throws IOException {
                URI uri2 = uri;
                jsonWriter.mo12927v(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public InetAddress mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.mo12897A());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                jsonWriter.mo12927v(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f23849v = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            /* renamed from: a */
            public <T2> TypeAdapter<T2> mo12853a(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> cls2 = typeToken.f23885a;
                if (cls.isAssignableFrom(cls2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.33.1
                        @Override // com.google.gson.TypeAdapter
                        /* renamed from: b */
                        public Object mo12837b(JsonReader jsonReader) throws IOException {
                            Object mo12837b = typeAdapter3.mo12837b(jsonReader);
                            if (mo12837b == null || cls2.isInstance(mo12837b)) {
                                return mo12837b;
                            }
                            StringBuilder m24u = C0000a.m24u("Expected a ");
                            m24u.append(cls2.getName());
                            m24u.append(" but was ");
                            m24u.append(mo12837b.getClass().getName());
                            throw new JsonSyntaxException(m24u.toString());
                        }

                        @Override // com.google.gson.TypeAdapter
                        /* renamed from: c */
                        public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
                            typeAdapter3.mo12838c(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder m24u = C0000a.m24u("Factory[typeHierarchy=");
                C0576a.m4126y(cls, m24u, ",adapter=");
                m24u.append(typeAdapter3);
                m24u.append("]");
                return m24u.toString();
            }
        };
        f23850w = new C231130(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public UUID mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return UUID.fromString(jsonReader.mo12897A());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                jsonWriter.mo12927v(uuid2 == null ? null : uuid2.toString());
            }
        });
        f23851x = new C231130(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Currency mo12837b(JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.mo12897A());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.mo12927v(currency.getCurrencyCode());
            }
        }.m12852a());
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Calendar mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                jsonReader.mo12901b();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.mo12898C() != JsonToken.END_OBJECT) {
                    String mo12912q = jsonReader.mo12912q();
                    int mo12909o = jsonReader.mo12909o();
                    if ("year".equals(mo12912q)) {
                        i2 = mo12909o;
                    } else if ("month".equals(mo12912q)) {
                        i3 = mo12909o;
                    } else if ("dayOfMonth".equals(mo12912q)) {
                        i4 = mo12909o;
                    } else if ("hourOfDay".equals(mo12912q)) {
                        i5 = mo12909o;
                    } else if ("minute".equals(mo12912q)) {
                        i6 = mo12909o;
                    } else if ("second".equals(mo12912q)) {
                        i7 = mo12909o;
                    }
                }
                jsonReader.mo12904h();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.mo12923k();
                    return;
                }
                jsonWriter.mo12919c();
                jsonWriter.mo12922i("year");
                jsonWriter.mo12924p(r4.get(1));
                jsonWriter.mo12922i("month");
                jsonWriter.mo12924p(r4.get(2));
                jsonWriter.mo12922i("dayOfMonth");
                jsonWriter.mo12924p(r4.get(5));
                jsonWriter.mo12922i("hourOfDay");
                jsonWriter.mo12924p(r4.get(11));
                jsonWriter.mo12922i("minute");
                jsonWriter.mo12924p(r4.get(12));
                jsonWriter.mo12922i("second");
                jsonWriter.mo12924p(r4.get(13));
                jsonWriter.mo12921h();
            }
        };
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        f23852y = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            /* renamed from: a */
            public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> cls4 = typeToken.f23885a;
                if (cls4 == cls2 || cls4 == cls3) {
                    return typeAdapter4;
                }
                return null;
            }

            public String toString() {
                StringBuilder m24u = C0000a.m24u("Factory[type=");
                C0576a.m4126y(cls2, m24u, "+");
                C0576a.m4126y(cls3, m24u, ",adapter=");
                m24u.append(typeAdapter4);
                m24u.append("]");
                return m24u.toString();
            }
        };
        f23853z = new C231130(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Locale mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() == JsonToken.NULL) {
                    jsonReader.mo12915v();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.mo12897A(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Locale locale) throws IOException {
                Locale locale2 = locale;
                jsonWriter.mo12927v(locale2 == null ? null : locale2.toString());
            }
        });
        final C230727 c230727 = new C230727();
        f23825A = c230727;
        final Class<JsonElement> cls4 = JsonElement.class;
        f23826B = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            /* renamed from: a */
            public <T2> TypeAdapter<T2> mo12853a(Gson gson, TypeToken<T2> typeToken) {
                final Class cls22 = typeToken.f23885a;
                if (cls4.isAssignableFrom(cls22)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.33.1
                        @Override // com.google.gson.TypeAdapter
                        /* renamed from: b */
                        public Object mo12837b(JsonReader jsonReader) throws IOException {
                            Object mo12837b = c230727.mo12837b(jsonReader);
                            if (mo12837b == null || cls22.isInstance(mo12837b)) {
                                return mo12837b;
                            }
                            StringBuilder m24u = C0000a.m24u("Expected a ");
                            m24u.append(cls22.getName());
                            m24u.append(" but was ");
                            m24u.append(mo12837b.getClass().getName());
                            throw new JsonSyntaxException(m24u.toString());
                        }

                        @Override // com.google.gson.TypeAdapter
                        /* renamed from: c */
                        public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
                            c230727.mo12838c(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder m24u = C0000a.m24u("Factory[typeHierarchy=");
                C0576a.m4126y(cls4, m24u, ",adapter=");
                m24u.append(c230727);
                m24u.append("]");
                return m24u.toString();
            }
        };
        f23827C = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapterFactory
            /* renamed from: a */
            public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> cls5 = typeToken.f23885a;
                if (!Enum.class.isAssignableFrom(cls5) || cls5 == Enum.class) {
                    return null;
                }
                if (!cls5.isEnum()) {
                    cls5 = cls5.getSuperclass();
                }
                return new EnumTypeAdapter(cls5);
            }
        };
    }

    public TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m12935a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new C231130(cls, typeAdapter);
    }

    /* renamed from: b */
    public static <TT> TypeAdapterFactory m12936b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new C231231(cls, cls2, typeAdapter);
    }
}
